package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\u001aË\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00142\u0013\b\u0002\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u000b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b0\u001aH\u0007¢\u0006\u0002\u0010#¨\u0006$²\u0006\n\u0010%\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002"}, d2 = {"ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "Landroidx/compose/ui/unit/Dp;", "sheetGesturesEnabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-YbuCTN8", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FZLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3", "isScrimVisible", "scrimAlpha", ""}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheet_YbuCTN8$lambda$5(Function0 function0, Modifier modifier, SheetState sheetState, float f, boolean z, Shape shape, long j, long j2, float f2, long j3, Function2 function2, Function2 function22, ModalBottomSheetProperties modalBottomSheetProperties, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m3579ModalBottomSheetYbuCTN8(function0, modifier, sheetState, f, z, shape, j, j2, f2, j3, function2, function22, modalBottomSheetProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberModalBottomSheetState$lambda$0$0(SheetValue sheetValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets ModalBottomSheet_YbuCTN8$lambda$0(Composer composer, int i) {
        composer.startReplaceGroup(-511854661);
        ComposerKt.sourceInformation(composer, "C104@5508L17:ModalBottomSheet.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511854661, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:104)");
        }
        WindowInsets modalWindowInsets = BottomSheetDefaults.INSTANCE.getModalWindowInsets(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modalWindowInsets;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0368, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L244;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* renamed from: ModalBottomSheet-YbuCTN8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3579ModalBottomSheetYbuCTN8(final Function0<Unit> function0, Modifier modifier, SheetState sheetState, float f, boolean z, Shape shape, long j, long j2, float f2, long j3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, ModalBottomSheetProperties modalBottomSheetProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final SheetState sheetState2;
        int i5;
        int i6;
        boolean z2;
        Shape shape2;
        int i7;
        long j4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final float f3;
        long j5;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function24;
        final ModalBottomSheetProperties modalBottomSheetProperties2;
        final long j6;
        final boolean z3;
        final Shape shape3;
        final SheetState sheetState3;
        final long j7;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        long j8;
        long j9;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25;
        float f5;
        ModalBottomSheetProperties modalBottomSheetProperties3;
        final float f6;
        Modifier modifier3;
        int i16;
        int i17;
        final Shape shape4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        final long j10;
        boolean z4;
        long j11;
        float f7;
        Modifier modifier4;
        boolean z5;
        boolean changedInstance;
        float f8;
        String str;
        boolean z6;
        boolean changedInstance2;
        Object rememberedValue;
        final SheetState sheetState4;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(1904798512);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheet)N(onDismissRequest,modifier,sheetState,sheetMaxWidth:c#ui.unit.Dp,sheetGesturesEnabled,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,scrimColor:c#ui.graphics.Color,dragHandle,contentWindowInsets,properties,content)108@5673L24,109@5737L304,121@6081L602,136@6833L1605,132@6689L1749:ModalBottomSheet.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i22 = i3 & 2;
        if (i22 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetState2 = sheetState;
                    if (startRestartGroup.changed(sheetState2)) {
                        i21 = 256;
                        i4 |= i21;
                    }
                } else {
                    sheetState2 = sheetState;
                }
                i21 = 128;
                i4 |= i21;
            } else {
                sheetState2 = sheetState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z2 = z;
                    i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) != 0) {
                        i7 = i22;
                        j4 = j;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
                    } else {
                        i7 = i22;
                        j4 = j;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            i19 = i4;
                            if (startRestartGroup.changed(j2)) {
                                i20 = 8388608;
                                i8 = i19 | i20;
                            }
                        } else {
                            i19 = i4;
                        }
                        i20 = 4194304;
                        i8 = i19 | i20;
                    } else {
                        i8 = i4;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i8 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((i & 805306368) == 0) {
                        i8 |= ((i3 & 512) == 0 && startRestartGroup.changed(j3)) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if ((i3 & 2048) == 0 && startRestartGroup.changedInstance(function22)) {
                            i18 = 32;
                            i12 |= i18;
                        }
                        i18 = 16;
                        i12 |= i18;
                    }
                    int i23 = i12;
                    i13 = i3 & 4096;
                    if (i13 == 0) {
                        i14 = i23 | 384;
                    } else {
                        i14 = i23;
                        if ((i2 & 384) == 0) {
                            i14 |= startRestartGroup.changed(modalBottomSheetProperties) ? 256 : 128;
                            if ((i2 & 3072) == 0) {
                                i14 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
                            }
                            i15 = i14;
                            if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "95@4948L31,98@5121L13,99@5184L14,100@5226L31,102@5334L10");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i8 &= -897;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i8 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i8 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i8 &= -29360129;
                                    }
                                    if ((i3 & 512) != 0) {
                                        i8 &= -1879048193;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i15 &= -113;
                                    }
                                    int i24 = i8;
                                    i17 = i15;
                                    i16 = i24;
                                    j10 = j2;
                                    f6 = f2;
                                    j9 = j3;
                                    function26 = function2;
                                    function25 = function22;
                                    modalBottomSheetProperties3 = modalBottomSheetProperties;
                                    modifier3 = modifier2;
                                    z4 = true;
                                    shape4 = shape2;
                                    j11 = j4;
                                    f7 = f;
                                } else {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i3 & 4) != 0) {
                                        i8 &= -897;
                                        sheetState2 = rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                    }
                                    float m2554getSheetMaxWidthD9Ej5fM = i5 != 0 ? BottomSheetDefaults.INSTANCE.m2554getSheetMaxWidthD9Ej5fM() : f;
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                        i8 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        j4 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                        i8 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        j8 = ColorSchemeKt.m2784contentColorForek8zF_U(j4, startRestartGroup, (i8 >> 18) & 14);
                                        i8 &= -29360129;
                                    } else {
                                        j8 = j2;
                                    }
                                    float m9732constructorimpl = i9 != 0 ? Dp.m9732constructorimpl(0) : f2;
                                    if ((i3 & 512) != 0) {
                                        j9 = BottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                        i8 &= -1879048193;
                                    } else {
                                        j9 = j3;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> lambda$1121996006$material3 = i11 != 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.getLambda$1121996006$material3() : function2;
                                    if ((i3 & 2048) != 0) {
                                        function25 = new Function2() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                WindowInsets ModalBottomSheet_YbuCTN8$lambda$0;
                                                ModalBottomSheet_YbuCTN8$lambda$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$0((Composer) obj, ((Integer) obj2).intValue());
                                                return ModalBottomSheet_YbuCTN8$lambda$0;
                                            }
                                        };
                                        i15 &= -113;
                                    } else {
                                        function25 = function22;
                                    }
                                    int i25 = i15;
                                    if (i13 != 0) {
                                        f5 = m2554getSheetMaxWidthD9Ej5fM;
                                        modalBottomSheetProperties3 = new ModalBottomSheetProperties(false, false, 3, null);
                                    } else {
                                        f5 = m2554getSheetMaxWidthD9Ej5fM;
                                        modalBottomSheetProperties3 = modalBottomSheetProperties;
                                    }
                                    f6 = m9732constructorimpl;
                                    modifier3 = modifier2;
                                    i16 = i8;
                                    i17 = i25;
                                    shape4 = shape2;
                                    function26 = lambda$1121996006$material3;
                                    j10 = j8;
                                    z4 = true;
                                    j11 = j4;
                                    f7 = f5;
                                }
                                final boolean z7 = z2;
                                final long j12 = j11;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1904798512, i16, i17, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final ModalBottomSheetProperties modalBottomSheetProperties4 = modalBottomSheetProperties3;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 855331328, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                int i26 = (i16 & 896) ^ 384;
                                final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27 = function25;
                                if (i26 <= 256 || !startRestartGroup.changed(sheetState2)) {
                                    modifier4 = modifier3;
                                    if ((i16 & 384) != 256) {
                                        z5 = false;
                                        int i27 = i16 & 14;
                                        changedInstance = z5 | startRestartGroup.changedInstance(coroutineScope) | (i27 != 4 ? z4 : false);
                                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (changedInstance) {
                                            f8 = f7;
                                        } else {
                                            f8 = f7;
                                        }
                                        rememberedValue3 = new Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit ModalBottomSheet_YbuCTN8$lambda$1$0;
                                                ModalBottomSheet_YbuCTN8$lambda$1$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$1$0(SheetState.this, coroutineScope, function0);
                                                return ModalBottomSheet_YbuCTN8$lambda$1$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                        final Function0 function02 = (Function0) rememberedValue3;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 855342634, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                        if (i26 > 256 || !startRestartGroup.changed(sheetState2)) {
                                            str = "CC(remember):ModalBottomSheet.kt#9igjgp";
                                            if ((i16 & 384) != 256) {
                                                z6 = false;
                                                changedInstance2 = z6 | startRestartGroup.changedInstance(coroutineScope) | (i27 == 4 ? z4 : false);
                                                rememberedValue = startRestartGroup.rememberedValue();
                                                if (!changedInstance2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = new Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda10
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit ModalBottomSheet_YbuCTN8$lambda$2$0;
                                                            ModalBottomSheet_YbuCTN8$lambda$2$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$2$0(SheetState.this, coroutineScope, function0);
                                                            return ModalBottomSheet_YbuCTN8$lambda$2$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                Function0 function03 = (Function0) rememberedValue;
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                int i28 = i16;
                                                final Modifier modifier5 = modifier4;
                                                final float f9 = f8;
                                                String str2 = str;
                                                final long j13 = j9;
                                                sheetState4 = sheetState2;
                                                final Function2<? super Composer, ? super Integer, Unit> function28 = function26;
                                                composer2 = startRestartGroup;
                                                ModalBottomSheet_androidKt.m3583ModalBottomSheetDialogsW7UJKQ(function03, j10, modalBottomSheetProperties4, ComposableLambdaKt.rememberComposableLambda(-1328793519, true, new Function2() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        Unit ModalBottomSheet_YbuCTN8$lambda$3;
                                                        ModalBottomSheet_YbuCTN8$lambda$3 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$3(SheetState.this, modalBottomSheetProperties4, function02, j13, modifier5, function0, f9, z7, function28, function27, shape4, j12, j10, f6, function3, (Composer) obj, ((Integer) obj2).intValue());
                                                        return ModalBottomSheet_YbuCTN8$lambda$3;
                                                    }
                                                }, composer2, 54), composer2, ((i28 >> 18) & 112) | 3072 | (i17 & 896), 0);
                                                if (sheetState4.getHasExpandedState()) {
                                                    composer2.startReplaceGroup(748177042);
                                                    ComposerKt.sourceInformation(composer2, "172@8513L21,172@8486L48");
                                                    ComposerKt.sourceInformationMarkerStart(composer2, 855419877, str2);
                                                    boolean z8 = (i26 > 256 && composer2.changed(sheetState4)) || (i28 & 384) == 256;
                                                    Object rememberedValue4 = composer2.rememberedValue();
                                                    if (z8 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue4 = (Function2) new ModalBottomSheetKt$ModalBottomSheet$3$1(sheetState4, null);
                                                        composer2.updateRememberedValue(rememberedValue4);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    EffectsKt.LaunchedEffect(sheetState4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i28 >> 6) & 14);
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    composer2.startReplaceGroup(748238546);
                                                    composer2.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                Shape shape5 = shape4;
                                                modifier2 = modifier5;
                                                shape3 = shape5;
                                                sheetState3 = sheetState4;
                                                f3 = f9;
                                                z3 = z7;
                                                j6 = j12;
                                                function23 = function28;
                                                j7 = j10;
                                                modalBottomSheetProperties2 = modalBottomSheetProperties4;
                                                function24 = function27;
                                                f4 = f6;
                                                j5 = j13;
                                            }
                                        } else {
                                            str = "CC(remember):ModalBottomSheet.kt#9igjgp";
                                        }
                                        z6 = z4;
                                        changedInstance2 = z6 | startRestartGroup.changedInstance(coroutineScope) | (i27 == 4 ? z4 : false);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changedInstance2) {
                                        }
                                        rememberedValue = new Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit ModalBottomSheet_YbuCTN8$lambda$2$0;
                                                ModalBottomSheet_YbuCTN8$lambda$2$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$2$0(SheetState.this, coroutineScope, function0);
                                                return ModalBottomSheet_YbuCTN8$lambda$2$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                        Function0 function032 = (Function0) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        int i282 = i16;
                                        final Modifier modifier52 = modifier4;
                                        final float f92 = f8;
                                        String str22 = str;
                                        final long j132 = j9;
                                        sheetState4 = sheetState2;
                                        final Function2 function282 = function26;
                                        composer2 = startRestartGroup;
                                        ModalBottomSheet_androidKt.m3583ModalBottomSheetDialogsW7UJKQ(function032, j10, modalBottomSheetProperties4, ComposableLambdaKt.rememberComposableLambda(-1328793519, true, new Function2() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit ModalBottomSheet_YbuCTN8$lambda$3;
                                                ModalBottomSheet_YbuCTN8$lambda$3 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$3(SheetState.this, modalBottomSheetProperties4, function02, j132, modifier52, function0, f92, z7, function282, function27, shape4, j12, j10, f6, function3, (Composer) obj, ((Integer) obj2).intValue());
                                                return ModalBottomSheet_YbuCTN8$lambda$3;
                                            }
                                        }, composer2, 54), composer2, ((i282 >> 18) & 112) | 3072 | (i17 & 896), 0);
                                        if (sheetState4.getHasExpandedState()) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Shape shape52 = shape4;
                                        modifier2 = modifier52;
                                        shape3 = shape52;
                                        sheetState3 = sheetState4;
                                        f3 = f92;
                                        z3 = z7;
                                        j6 = j12;
                                        function23 = function282;
                                        j7 = j10;
                                        modalBottomSheetProperties2 = modalBottomSheetProperties4;
                                        function24 = function27;
                                        f4 = f6;
                                        j5 = j132;
                                    }
                                } else {
                                    modifier4 = modifier3;
                                }
                                z5 = z4;
                                int i272 = i16 & 14;
                                changedInstance = z5 | startRestartGroup.changedInstance(coroutineScope) | (i272 != 4 ? z4 : false);
                                Object rememberedValue32 = startRestartGroup.rememberedValue();
                                if (changedInstance) {
                                }
                                rememberedValue32 = new Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit ModalBottomSheet_YbuCTN8$lambda$1$0;
                                        ModalBottomSheet_YbuCTN8$lambda$1$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$1$0(SheetState.this, coroutineScope, function0);
                                        return ModalBottomSheet_YbuCTN8$lambda$1$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue32);
                                final Function0 function022 = (Function0) rememberedValue32;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 855342634, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                if (i26 > 256) {
                                }
                                str = "CC(remember):ModalBottomSheet.kt#9igjgp";
                                if ((i16 & 384) != 256) {
                                }
                                z6 = z4;
                                changedInstance2 = z6 | startRestartGroup.changedInstance(coroutineScope) | (i272 == 4 ? z4 : false);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changedInstance2) {
                                }
                                rememberedValue = new Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit ModalBottomSheet_YbuCTN8$lambda$2$0;
                                        ModalBottomSheet_YbuCTN8$lambda$2$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$2$0(SheetState.this, coroutineScope, function0);
                                        return ModalBottomSheet_YbuCTN8$lambda$2$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                Function0 function0322 = (Function0) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i2822 = i16;
                                final Modifier modifier522 = modifier4;
                                final float f922 = f8;
                                String str222 = str;
                                final long j1322 = j9;
                                sheetState4 = sheetState2;
                                final Function2 function2822 = function26;
                                composer2 = startRestartGroup;
                                ModalBottomSheet_androidKt.m3583ModalBottomSheetDialogsW7UJKQ(function0322, j10, modalBottomSheetProperties4, ComposableLambdaKt.rememberComposableLambda(-1328793519, true, new Function2() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit ModalBottomSheet_YbuCTN8$lambda$3;
                                        ModalBottomSheet_YbuCTN8$lambda$3 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$3(SheetState.this, modalBottomSheetProperties4, function022, j1322, modifier522, function0, f922, z7, function2822, function27, shape4, j12, j10, f6, function3, (Composer) obj, ((Integer) obj2).intValue());
                                        return ModalBottomSheet_YbuCTN8$lambda$3;
                                    }
                                }, composer2, 54), composer2, ((i2822 >> 18) & 112) | 3072 | (i17 & 896), 0);
                                if (sheetState4.getHasExpandedState()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Shape shape522 = shape4;
                                modifier2 = modifier522;
                                shape3 = shape522;
                                sheetState3 = sheetState4;
                                f3 = f922;
                                z3 = z7;
                                j6 = j12;
                                function23 = function2822;
                                j7 = j10;
                                modalBottomSheetProperties2 = modalBottomSheetProperties4;
                                function24 = function27;
                                f4 = f6;
                                j5 = j1322;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                f3 = f;
                                j5 = j3;
                                function23 = function2;
                                function24 = function22;
                                modalBottomSheetProperties2 = modalBottomSheetProperties;
                                j6 = j4;
                                z3 = z2;
                                shape3 = shape2;
                                sheetState3 = sheetState2;
                                j7 = j2;
                                f4 = f2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                final long j14 = j5;
                                final Modifier modifier6 = modifier2;
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit ModalBottomSheet_YbuCTN8$lambda$5;
                                        ModalBottomSheet_YbuCTN8$lambda$5 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$5(Function0.this, modifier6, sheetState3, f3, z3, shape3, j6, j7, f4, j14, function23, function24, modalBottomSheetProperties2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return ModalBottomSheet_YbuCTN8$lambda$5;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    i15 = i14;
                    if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i232 = i12;
                i13 = i3 & 4096;
                if (i13 == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                i15 = i14;
                if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z2 = z;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i2322 = i12;
            i13 = i3 & 4096;
            if (i13 == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i15 = i14;
            if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i23222 = i12;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i15 = i14;
        if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheet_YbuCTN8$lambda$1$0(final SheetState sheetState, CoroutineScope coroutineScope, final Function0 function0) {
        Job launch$default;
        if (sheetState.getConfirmValueChange$material3().invoke(SheetValue.Hidden).booleanValue()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1(sheetState, null), 3, null);
            launch$default.invokeOnCompletion(new Function1() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ModalBottomSheet_YbuCTN8$lambda$1$0$0;
                    ModalBottomSheet_YbuCTN8$lambda$1$0$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$1$0$0(SheetState.this, function0, (Throwable) obj);
                    return ModalBottomSheet_YbuCTN8$lambda$1$0$0;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheet_YbuCTN8$lambda$1$0$0(SheetState sheetState, Function0 function0, Throwable th) {
        if (!sheetState.isVisible()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheet_YbuCTN8$lambda$2$0(SheetState sheetState, CoroutineScope coroutineScope, final Function0 function0) {
        Job launch$default;
        if (sheetState.getCurrentValue() != SheetValue.Expanded || !sheetState.getHasPartiallyExpandedState()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$2(sheetState, null), 3, null);
            launch$default.invokeOnCompletion(new Function1() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ModalBottomSheet_YbuCTN8$lambda$2$0$0;
                    ModalBottomSheet_YbuCTN8$lambda$2$0$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$2$0$0(Function0.this, (Throwable) obj);
                    return ModalBottomSheet_YbuCTN8$lambda$2$0$0;
                }
            });
        } else {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(sheetState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheet_YbuCTN8$lambda$2$0$0(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheet_YbuCTN8$lambda$3(final SheetState sheetState, ModalBottomSheetProperties modalBottomSheetProperties, Function0 function0, long j, Modifier modifier, Function0 function02, float f, boolean z, Function2 function2, Function2 function22, Shape shape, long j2, long j3, float f2, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C137@6904L27,137@6843L1589:ModalBottomSheet.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1328793519, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:137)");
            }
            Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
            ComposerKt.sourceInformationMarkerStart(composer, -1365282548, "CC(remember):ModalBottomSheet.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ModalBottomSheet_YbuCTN8$lambda$3$0$0;
                        ModalBottomSheet_YbuCTN8$lambda$3$0$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$3$0$0((SemanticsPropertyReceiver) obj);
                        return ModalBottomSheet_YbuCTN8$lambda$3$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(imePadding, false, (Function1) rememberedValue, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2014499467, "C138@6971L54,139@7069L92,145@7368L7,143@7208L237,149@7502L29,151@7655L14,148@7458L262,154@7733L689:ModalBottomSheet.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(composer, -203531839, "CC(remember):ModalBottomSheet.kt#9igjgp");
            boolean changed = composer.changed(sheetState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new SheetWindowInsets(sheetState);
                composer.updateRememberedValue(rememberedValue2);
            }
            SheetWindowInsets sheetWindowInsets = (SheetWindowInsets) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -203528665, "CC(remember):ModalBottomSheet.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean ModalBottomSheet_YbuCTN8$lambda$3$1$1$0;
                        ModalBottomSheet_YbuCTN8$lambda$3$1$1$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$3$1$1$0(SheetState.this);
                        return Boolean.valueOf(ModalBottomSheet_YbuCTN8$lambda$3$1$1$0);
                    }
                });
                composer.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(ModalBottomSheet_YbuCTN8$lambda$3$1$2((State) rememberedValue3) ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), 0.0f, "ScrimAlphaAnimation", null, composer, 3072, 20);
            Strings.Companion companion = Strings.INSTANCE;
            String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.close_sheet), composer, 0);
            Function0 function03 = modalBottomSheetProperties.getShouldDismissOnClickOutside() ? function0 : null;
            ComposerKt.sourceInformationMarkerStart(composer, -203509991, "CC(remember):ModalBottomSheet.kt#9igjgp");
            boolean changed2 = composer.changed(animateFloatAsState);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float ModalBottomSheet_YbuCTN8$lambda$3$1$3;
                        ModalBottomSheet_YbuCTN8$lambda$3$1$3 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$3$1$3(State.this);
                        return Float.valueOf(ModalBottomSheet_YbuCTN8$lambda$3$1$3);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ScrimKt.m3803ScrimyrwZFoE(m4895getString2EP1pXo, null, function03, (Function0) rememberedValue4, j, composer, 0, 2);
            SheetDefaultsKt.m3943BottomSheetjyqLk6I(WindowInsetsPaddingKt.consumeWindowInsets(boxScopeInstance.align(modifier, Alignment.INSTANCE.getTopCenter()), sheetWindowInsets), sheetState, function02, f, z, modalBottomSheetProperties.getShouldDismissOnBackPress(), function2, function22, shape, j2, j3, f2, 0.0f, function3, composer, 0, 0, 4096);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheet_YbuCTN8$lambda$3$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalBottomSheet_YbuCTN8$lambda$3$1$1$0(SheetState sheetState) {
        return sheetState.getTargetValue() != SheetValue.Hidden;
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, Function1<? super SheetValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -778250030, "C(rememberModalBottomSheetState)N(skipPartiallyExpanded,confirmValueChange)215@10072L8,217@10090L160:ModalBottomSheet.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -573965190, "CC(remember):ModalBottomSheet.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.ModalBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberModalBottomSheetState$lambda$0$0;
                        rememberModalBottomSheetState$lambda$0$0 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$0$0((SheetValue) obj);
                        return Boolean.valueOf(rememberModalBottomSheetState$lambda$0$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:217)");
        }
        SheetState m3945rememberSheetStateAGcomas = SheetDefaultsKt.m3945rememberSheetStateAGcomas(z2, function12, SheetValue.Hidden, false, 0.0f, 0.0f, composer, (i & 14) | 384 | (i & 112), 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3945rememberSheetStateAGcomas;
    }

    private static final boolean ModalBottomSheet_YbuCTN8$lambda$3$1$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalBottomSheet_YbuCTN8$lambda$3$1$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
