package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.DraggableAnchorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010&\u001a7\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020)2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010,\u001a\u008a\u0001\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0004\b4\u00105\u001aq\u00106\u001a\u00020\u00012\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u00108\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00162\u0006\u0010;\u001a\u00020$H\u0003¢\u0006\u0002\u0010<¨\u0006="}, d2 = {"BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material3/BottomSheetScaffoldState;", "sheetPeekHeight", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetContainerColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "sheetDragHandle", "Lkotlin/Function0;", "sheetSwipeEnabled", "", "topBar", "snackbarHost", "Landroidx/compose/material3/SnackbarHostState;", "containerColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-sdMYb0k", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "rememberBottomSheetScaffoldState", "bottomSheetState", "Landroidx/compose/material3/SheetState;", "snackbarHostState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "rememberStandardBottomSheetState", "initialValue", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "skipHiddenState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "StandardBottomSheet", "state", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-w7I5h1o", "(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetScaffoldLayout", "body", "bottomSheet", "sheetOffset", "", "sheetState", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;Landroidx/compose/runtime/Composer;I)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffoldLayout$lambda$1(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function0 function0, SheetState sheetState, int i, Composer composer, int i2) {
        BottomSheetScaffoldLayout(function2, function22, function23, function24, function0, sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffold_sdMYb0k$lambda$1(Function3 function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, Shape shape, long j, long j2, float f3, float f4, Function2 function2, boolean z, Function2 function22, Function3 function32, long j3, long j4, Function3 function33, int i, int i2, int i3, Composer composer, int i4) {
        m2565BottomSheetScaffoldsdMYb0k(function3, modifier, bottomSheetScaffoldState, f, f2, shape, j, j2, f3, f4, function2, z, function22, function32, j3, j4, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardBottomSheet_w7I5h1o$lambda$6(SheetState sheetState, float f, float f2, boolean z, Shape shape, long j, long j2, float f3, float f4, Function2 function2, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2566StandardBottomSheetw7I5h1o(sheetState, f, f2, z, shape, j, j2, f3, f4, function2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberStandardBottomSheetState$lambda$0$0(SheetValue sheetValue) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021c  */
    /* renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2565BottomSheetScaffoldsdMYb0k(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, Shape shape, long j, long j2, float f3, float f4, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, long j3, long j4, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i5;
        int i6;
        float f5;
        Shape shape2;
        long j5;
        long j6;
        int i7;
        float f6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final Shape shape3;
        final long j7;
        final Modifier modifier2;
        final boolean z2;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        final long j8;
        final long j9;
        Composer composer2;
        final float f7;
        final long j10;
        final BottomSheetScaffoldState bottomSheetScaffoldState3;
        final float f8;
        final float f9;
        final float f10;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        BottomSheetScaffoldState bottomSheetScaffoldState4;
        float m2555getSheetPeekHeightD9Ej5fM;
        float m2552getElevationD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> lambda$1392012807$material3;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> lambda$1768941633$material3;
        Modifier modifier3;
        long j11;
        long j12;
        long j13;
        Modifier modifier4;
        int i18;
        final float f11;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(920075480);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffold)N(sheetContent,modifier,scaffoldState,sheetPeekHeight:c#ui.unit.Dp,sheetMaxWidth:c#ui.unit.Dp,sheetShape,sheetContainerColor:c#ui.graphics.Color,sheetContentColor:c#ui.graphics.Color,sheetTonalElevation:c#ui.unit.Dp,sheetShadowElevation:c#ui.unit.Dp,sheetDragHandle,sheetSwipeEnabled,topBar,snackbarHost,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,content)134@7187L1424:BottomSheetScaffold.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    if (startRestartGroup.changed(bottomSheetScaffoldState2)) {
                        i19 = 256;
                        i4 |= i19;
                    }
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i19 = 128;
                i4 |= i19;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
                i6 = i3 & 16;
                int i21 = 8192;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    f5 = f2;
                    i4 |= startRestartGroup.changed(f5) ? 16384 : 8192;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) != 0) {
                        j5 = j;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                    } else {
                        j5 = j;
                    }
                    if ((i & 12582912) != 0) {
                        j6 = j2;
                        i4 |= ((i3 & 128) == 0 && startRestartGroup.changed(j6)) ? 8388608 : 4194304;
                    } else {
                        j6 = j2;
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                        f6 = f3;
                    } else {
                        f6 = f3;
                        if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(f6) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        }
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(f4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i11 = i2 | 6;
                        i10 = i9;
                    } else if ((i2 & 6) == 0) {
                        i10 = i9;
                        i11 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                    } else {
                        i10 = i9;
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                        i13 = i12;
                    } else if ((i2 & 48) == 0) {
                        i13 = i12;
                        i11 |= startRestartGroup.changed(z) ? 32 : 16;
                    } else {
                        i13 = i12;
                    }
                    int i22 = i11;
                    i14 = i3 & 4096;
                    if (i14 == 0) {
                        i15 = i22 | 384;
                    } else {
                        int i23 = i22;
                        if ((i2 & 384) == 0) {
                            i23 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                        }
                        i15 = i23;
                    }
                    i16 = i3 & 8192;
                    if (i16 == 0) {
                        i17 = i15 | 3072;
                    } else {
                        i17 = i15;
                        if ((i2 & 3072) == 0) {
                            i17 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                            if ((i2 & 24576) == 0) {
                                if ((i3 & 16384) == 0 && startRestartGroup.changed(j3)) {
                                    i21 = 16384;
                                }
                                i17 |= i21;
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i17 |= ((i3 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                            }
                            if ((i2 & 1572864) == 0) {
                                i17 |= startRestartGroup.changedInstance(function33) ? 1048576 : 524288;
                            }
                            if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i17 & 599187) != 599186, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "118@6300L34,121@6502L13,122@6570L14,123@6617L36,130@7049L11,131@7096L31");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i4 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        i17 &= -57345;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        i17 &= -458753;
                                    }
                                    modifier4 = modifier;
                                    m2552getElevationD9Ej5fM = f4;
                                    lambda$1392012807$material3 = function2;
                                    z3 = z;
                                    function25 = function22;
                                    lambda$1768941633$material3 = function32;
                                    j12 = j4;
                                    bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                                    i18 = i17;
                                    m2555getSheetPeekHeightD9Ej5fM = f;
                                    j13 = j3;
                                } else {
                                    Modifier.Companion companion = i20 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i3 & 4) != 0) {
                                        bottomSheetScaffoldState4 = rememberBottomSheetScaffoldState(null, null, startRestartGroup, 0, 3);
                                        i4 &= -897;
                                    } else {
                                        bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                                    }
                                    m2555getSheetPeekHeightD9Ej5fM = i5 != 0 ? BottomSheetDefaults.INSTANCE.m2555getSheetPeekHeightD9Ej5fM() : f;
                                    if (i6 != 0) {
                                        f5 = BottomSheetDefaults.INSTANCE.m2554getSheetMaxWidthD9Ej5fM();
                                    }
                                    if ((i3 & 32) != 0) {
                                        shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                        i4 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        j6 = ColorSchemeKt.m2784contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 18) & 14);
                                        i4 = (-29360129) & i4;
                                    }
                                    if (i7 != 0) {
                                        f6 = Dp.m9732constructorimpl(0);
                                    }
                                    m2552getElevationD9Ej5fM = i8 != 0 ? BottomSheetDefaults.INSTANCE.m2552getElevationD9Ej5fM() : f4;
                                    lambda$1392012807$material3 = i10 != 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$1392012807$material3() : function2;
                                    z3 = i13 != 0 ? true : z;
                                    function25 = i14 != 0 ? null : function22;
                                    lambda$1768941633$material3 = i16 != 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$1768941633$material3() : function32;
                                    if ((i3 & 16384) != 0) {
                                        modifier3 = companion;
                                        j11 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getSurface();
                                        i17 &= -57345;
                                    } else {
                                        modifier3 = companion;
                                        j11 = j3;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        j12 = ColorSchemeKt.m2784contentColorForek8zF_U(j11, startRestartGroup, (i17 >> 12) & 14);
                                        i17 &= -458753;
                                    } else {
                                        j12 = j4;
                                    }
                                    j13 = j11;
                                    modifier4 = modifier3;
                                    i18 = i17;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    f11 = m2552getElevationD9Ej5fM;
                                    ComposerKt.traceEventStart(920075480, i4, i18, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:133)");
                                } else {
                                    f11 = m2552getElevationD9Ej5fM;
                                }
                                Modifier m353backgroundbw27NRU$default = BackgroundKt.m353backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), j13, null, 2, null);
                                long j14 = j13;
                                Modifier modifier5 = modifier4;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                                int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m353backgroundbw27NRU$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                final long j15 = j6;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
                                Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1080463218, "C137@7464L1141,137@7398L1207:BottomSheetScaffold.kt#uh7d8r");
                                final float f12 = f5;
                                final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState4;
                                final Shape shape4 = shape2;
                                final long j16 = j5;
                                final float f13 = m2555getSheetPeekHeightD9Ej5fM;
                                final Function2<? super Composer, ? super Integer, Unit> function26 = lambda$1392012807$material3;
                                final float f14 = f6;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35 = lambda$1768941633$material3;
                                final boolean z4 = z3;
                                final Function2<? super Composer, ? super Integer, Unit> function27 = function25;
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j12)), ComposableLambdaKt.rememberComposableLambda(999829022, true, new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit BottomSheetScaffold_sdMYb0k$lambda$0$0;
                                        BottomSheetScaffold_sdMYb0k$lambda$0$0 = BottomSheetScaffoldKt.BottomSheetScaffold_sdMYb0k$lambda$0$0(BottomSheetScaffoldState.this, function27, function33, f13, f12, z4, shape4, j16, j15, f14, f11, function26, function3, function35, (Composer) obj, ((Integer) obj2).intValue());
                                        return BottomSheetScaffold_sdMYb0k$lambda$0$0;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                bottomSheetScaffoldState3 = bottomSheetScaffoldState4;
                                f9 = m2555getSheetPeekHeightD9Ej5fM;
                                function23 = lambda$1392012807$material3;
                                function34 = lambda$1768941633$material3;
                                modifier2 = modifier5;
                                z2 = z3;
                                j9 = j12;
                                j8 = j14;
                                long j17 = j5;
                                f10 = f11;
                                f8 = f6;
                                function24 = function25;
                                f7 = f5;
                                shape3 = shape2;
                                j10 = j17;
                                j7 = j15;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                shape3 = shape2;
                                j7 = j6;
                                modifier2 = modifier;
                                z2 = z;
                                function34 = function32;
                                j8 = j3;
                                j9 = j4;
                                composer2 = startRestartGroup;
                                f7 = f5;
                                j10 = j5;
                                bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                f8 = f6;
                                f9 = f;
                                f10 = f4;
                                function23 = function2;
                                function24 = function22;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit BottomSheetScaffold_sdMYb0k$lambda$1;
                                        BottomSheetScaffold_sdMYb0k$lambda$1 = BottomSheetScaffoldKt.BottomSheetScaffold_sdMYb0k$lambda$1(Function3.this, modifier2, bottomSheetScaffoldState3, f9, f7, shape3, j10, j7, f8, f10, function23, z2, function24, function34, j8, j9, function33, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return BottomSheetScaffold_sdMYb0k$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i17 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f5 = f2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i3 & 1024;
                if (i9 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                int i222 = i11;
                i14 = i3 & 4096;
                if (i14 == 0) {
                }
                i16 = i3 & 8192;
                if (i16 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i17 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            int i212 = 8192;
            if (i6 != 0) {
            }
            f5 = f2;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i3 & 1024;
            if (i9 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            int i2222 = i11;
            i14 = i3 & 4096;
            if (i14 == 0) {
            }
            i16 = i3 & 8192;
            if (i16 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i17 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        int i2122 = 8192;
        if (i6 != 0) {
        }
        f5 = f2;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i22222 = i11;
        i14 = i3 & 4096;
        if (i14 == 0) {
        }
        i16 = i3 & 8192;
        if (i16 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i17 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffold_sdMYb0k$lambda$0$0$0(Function3 function3, float f, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C140@7563L48:BottomSheetScaffold.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-519581786, i, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:140)");
            }
            function3.invoke(PaddingKt.m1198PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f, 7, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffold_sdMYb0k$lambda$0$0$2(Function3 function3, BottomSheetScaffoldState bottomSheetScaffoldState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C141@7648L45:BottomSheetScaffold.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1111667356, i, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:141)");
            }
            function3.invoke(bottomSheetScaffoldState.getSnackbarHostState(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomSheetScaffold_sdMYb0k$lambda$0$0$3$0(BottomSheetScaffoldState bottomSheetScaffoldState) {
        return bottomSheetScaffoldState.getBottomSheetState().requireOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffold_sdMYb0k$lambda$0$0(final BottomSheetScaffoldState bottomSheetScaffoldState, Function2 function2, final Function3 function3, final float f, final float f2, final boolean z, final Shape shape, final long j, final long j2, final float f3, final float f4, final Function2 function22, final Function3 function32, final Function3 function33, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C140@7561L52,144@7870L710,141@7646L49,142@7727L50,138@7478L1117:BottomSheetScaffold.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999829022, i, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:138)");
            }
            SheetState bottomSheetState = bottomSheetScaffoldState.getBottomSheetState();
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-519581786, true, new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomSheetScaffold_sdMYb0k$lambda$0$0$0;
                    BottomSheetScaffold_sdMYb0k$lambda$0$0$0 = BottomSheetScaffoldKt.BottomSheetScaffold_sdMYb0k$lambda$0$0$0(Function3.this, f, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomSheetScaffold_sdMYb0k$lambda$0$0$0;
                }
            }, composer, 54);
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-815624571, true, new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomSheetScaffold_sdMYb0k$lambda$0$0$1;
                    BottomSheetScaffold_sdMYb0k$lambda$0$0$1 = BottomSheetScaffoldKt.BottomSheetScaffold_sdMYb0k$lambda$0$0$1(BottomSheetScaffoldState.this, f, f2, z, shape, j, j2, f3, f4, function22, function32, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomSheetScaffold_sdMYb0k$lambda$0$0$1;
                }
            }, composer, 54);
            ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1111667356, true, new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomSheetScaffold_sdMYb0k$lambda$0$0$2;
                    BottomSheetScaffold_sdMYb0k$lambda$0$0$2 = BottomSheetScaffoldKt.BottomSheetScaffold_sdMYb0k$lambda$0$0$2(Function3.this, bottomSheetScaffoldState, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomSheetScaffold_sdMYb0k$lambda$0$0$2;
                }
            }, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1236975696, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            boolean changed = composer.changed(bottomSheetScaffoldState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float BottomSheetScaffold_sdMYb0k$lambda$0$0$3$0;
                        BottomSheetScaffold_sdMYb0k$lambda$0$0$3$0 = BottomSheetScaffoldKt.BottomSheetScaffold_sdMYb0k$lambda$0$0$3$0(BottomSheetScaffoldState.this);
                        return Float.valueOf(BottomSheetScaffold_sdMYb0k$lambda$0$0$3$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            BottomSheetScaffoldLayout(function2, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (Function0) rememberedValue, bottomSheetState, composer, 3504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffold_sdMYb0k$lambda$0$0$1(BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, boolean z, Shape shape, long j, long j2, float f3, float f4, Function2 function2, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C145@7892L670:BottomSheetScaffold.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-815624571, i, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:145)");
            }
            m2566StandardBottomSheetw7I5h1o(bottomSheetScaffoldState.getBottomSheetState(), f, f2, z, shape, j, j2, f3, f4, function2, function3, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Composer composer2;
        ComposerKt.sourceInformationMarkerStart(composer, -1474606134, "C(rememberBottomSheetScaffoldState)N(bottomSheetState,snackbarHostState)187@9375L34,188@9454L32,190@9529L197:BottomSheetScaffold.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            composer2 = composer;
            sheetState = rememberStandardBottomSheetState(null, null, false, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 242717802, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:189)");
        }
        ComposerKt.sourceInformationMarkerStart(composer2, 242720367, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer2.changed(sheetState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i & 48) == 32);
        Object rememberedValue2 = composer2.rememberedValue();
        if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer2.updateRememberedValue(rememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        return bottomSheetScaffoldState;
    }

    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, Function1<? super SheetValue, Boolean> function1, boolean z, Composer composer, int i, int i2) {
        Function1<? super SheetValue, Boolean> function12;
        ComposerKt.sourceInformationMarkerStart(composer, 678511581, "C(rememberStandardBottomSheetState)N(initialValue,confirmValueChange,skipHiddenState)210@10307L8,213@10362L154:BottomSheetScaffold.kt#uh7d8r");
        SheetValue sheetValue2 = (i2 & 1) != 0 ? SheetValue.PartiallyExpanded : sheetValue;
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -785395227, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberStandardBottomSheetState$lambda$0$0;
                        rememberStandardBottomSheetState$lambda$0$0 = BottomSheetScaffoldKt.rememberStandardBottomSheetState$lambda$0$0((SheetValue) obj);
                        return Boolean.valueOf(rememberStandardBottomSheetState$lambda$0$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function12 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        } else {
            function12 = function1;
        }
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:213)");
        }
        SheetState m3945rememberSheetStateAGcomas = SheetDefaultsKt.m3945rememberSheetStateAGcomas(false, function12, sheetValue2, z2, 0.0f, 0.0f, composer, (i & 112) | ((i << 6) & 896) | ((i << 3) & 7168), 49);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3945rememberSheetStateAGcomas;
    }

    /* renamed from: StandardBottomSheet-w7I5h1o, reason: not valid java name */
    private static final void m2566StandardBottomSheetw7I5h1o(final SheetState sheetState, final float f, final float f2, final boolean z, final Shape shape, final long j, final long j2, final float f3, final float f4, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-2108849428);
        ComposerKt.sourceInformation(startRestartGroup, "C(StandardBottomSheet)N(state,peekHeight:c#ui.unit.Dp,sheetMaxWidth:c#ui.unit.Dp,sheetSwipeEnabled,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,dragHandle,content)235@11023L12,236@11099L12,237@11178L12,239@11235L152,239@11224L163,245@11405L24,247@11514L7,251@11719L43,249@11620L199,275@12596L3497,357@16972L3838,269@12321L8489:BottomSheetScaffold.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(f4) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2108849428, i3, i4, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:233)");
            }
            final FiniteAnimationSpec defaultSpatialSpec = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6).defaultSpatialSpec();
            final FiniteAnimationSpec fastEffectsSpec = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6).fastEffectsSpec();
            final FiniteAnimationSpec defaultSpatialSpec2 = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6).defaultSpatialSpec();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 620284580, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            int i5 = i3 & 14;
            int i6 = i3;
            boolean changedInstance = (i5 == 4) | startRestartGroup.changedInstance(defaultSpatialSpec) | startRestartGroup.changedInstance(fastEffectsSpec) | startRestartGroup.changedInstance(defaultSpatialSpec2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit StandardBottomSheet_w7I5h1o$lambda$0$0;
                        StandardBottomSheet_w7I5h1o$lambda$0$0 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$0$0(SheetState.this, defaultSpatialSpec, fastEffectsSpec, defaultSpatialSpec2);
                        return StandardBottomSheet_w7I5h1o$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
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
            Orientation orientation = Orientation.Vertical;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float mo528toPx0680j_4 = ((Density) consume).mo528toPx0680j_4(f);
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3 = sheetState.getAnchoredDraggableState$material3();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 620299959, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            boolean z2 = i5 == 4;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float StandardBottomSheet_w7I5h1o$lambda$2$0;
                        StandardBottomSheet_w7I5h1o$lambda$2$0 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$2$0(SheetState.this, ((Float) obj).floatValue());
                        return Float.valueOf(StandardBottomSheet_w7I5h1o$lambda$2$0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TargetedFlingBehavior flingBehavior = anchoredDraggableDefaults.flingBehavior(anchoredDraggableState$material3, (Function1) rememberedValue3, defaultSpatialSpec2, startRestartGroup, AnchoredDraggableDefaults.$stable << 9, 0);
            if (z) {
                startRestartGroup.startReplaceGroup(2049595459);
                ComposerKt.sourceInformation(startRestartGroup, "258@11928L326");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                AnchoredDraggableState<SheetValue> anchoredDraggableState$material32 = sheetState.getAnchoredDraggableState$material3();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 620306930, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                boolean changed = startRestartGroup.changed(anchoredDraggableState$material32);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, flingBehavior);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                companion = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) rememberedValue4, null, 2, null);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(2049989686);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = SizeKt.m1262requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m1278widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, f2, 1, null), 0.0f, 1, null), f, 0.0f, 2, null).then(companion);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material33 = sheetState.getAnchoredDraggableState$material3();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 620331477, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(mo528toPx0680j_4) | (i5 == 4);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Pair StandardBottomSheet_w7I5h1o$lambda$4$0;
                        StandardBottomSheet_w7I5h1o$lambda$4$0 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$4$0(SheetState.this, mo528toPx0680j_4, (IntSize) obj, (Constraints) obj2);
                        return StandardBottomSheet_w7I5h1o$lambda$4$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            int i7 = i6 >> 9;
            SurfaceKt.m4112SurfaceT9BRK9s(SheetDefaultsKt.verticalScaleUp(AnchoredDraggableKt.anchoredDraggable$default(DraggableAnchorsKt.draggableAnchors(then, anchoredDraggableState$material33, orientation, (Function2) rememberedValue5), sheetState.getAnchoredDraggableState$material3(), orientation, z, null, null, flingBehavior, 24, null), sheetState), shape, j, j2, f3, f4, null, ComposableLambdaKt.rememberComposableLambda(1508311921, true, new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit StandardBottomSheet_w7I5h1o$lambda$5;
                    StandardBottomSheet_w7I5h1o$lambda$5 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$5(SheetState.this, function2, coroutineScope, z, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return StandardBottomSheet_w7I5h1o$lambda$5;
                }
            }, composer2, 54), composer2, (i7 & 112) | 12582912 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit StandardBottomSheet_w7I5h1o$lambda$6;
                    StandardBottomSheet_w7I5h1o$lambda$6 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$6(SheetState.this, f, f2, z, shape, j, j2, f3, f4, function2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return StandardBottomSheet_w7I5h1o$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardBottomSheet_w7I5h1o$lambda$0$0(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        sheetState.setShowMotionSpec$material3(finiteAnimationSpec);
        sheetState.setHideMotionSpec$material3(finiteAnimationSpec2);
        sheetState.setAnchoredDraggableMotionSpec$material3(finiteAnimationSpec3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float StandardBottomSheet_w7I5h1o$lambda$2$0(SheetState sheetState, float f) {
        return sheetState.getPositionalThreshold$material3().invoke().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair StandardBottomSheet_w7I5h1o$lambda$4$0(final SheetState sheetState, final float f, IntSize intSize, Constraints constraints) {
        final float m9674getMaxHeightimpl = Constraints.m9674getMaxHeightimpl(constraints.getValue());
        final float m9911unboximpl = (int) (intSize.m9911unboximpl() & 4294967295L);
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit StandardBottomSheet_w7I5h1o$lambda$4$0$0;
                StandardBottomSheet_w7I5h1o$lambda$4$0$0 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$4$0$0(m9911unboximpl, f, sheetState, m9674getMaxHeightimpl, (DraggableAnchorsConfig) obj);
                return StandardBottomSheet_w7I5h1o$lambda$4$0$0;
            }
        });
        SheetValue targetValue = sheetState.getTargetValue();
        int i = WhenMappings.$EnumSwitchMapping$0[targetValue.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                targetValue = DraggableAnchors.hasPositionFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
            } else if (DraggableAnchors.hasPositionFor(SheetValue.PartiallyExpanded)) {
                targetValue = SheetValue.PartiallyExpanded;
            } else if (DraggableAnchors.hasPositionFor(SheetValue.Expanded)) {
                targetValue = SheetValue.Expanded;
            } else if (DraggableAnchors.hasPositionFor(SheetValue.Hidden)) {
                targetValue = SheetValue.Hidden;
            }
        } else if (DraggableAnchors.hasPositionFor(SheetValue.Hidden)) {
            targetValue = SheetValue.Hidden;
        }
        return TuplesKt.to(DraggableAnchors, targetValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardBottomSheet_w7I5h1o$lambda$4$0$0(float f, float f2, SheetState sheetState, float f3, DraggableAnchorsConfig draggableAnchorsConfig) {
        boolean z = f == 0.0f || f2 == 0.0f || !sheetState.getSkipHiddenState();
        boolean z2 = !sheetState.getSkipPartiallyExpanded() && (f2 > 0.0f || ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 && ((sheetState.getAnchoredDraggableState$material3().getAnchors().getSize() == 0) || (sheetState.getCurrentValue() == SheetValue.PartiallyExpanded && !sheetState.isAnimationRunning())))) && f2 != f;
        boolean z3 = f > 0.0f;
        if (!z && !z2 && !z3) {
            throw new IllegalArgumentException("BottomSheetScaffold: Require at least 1 anchor to be initialized".toString());
        }
        if (z2) {
            draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, f3 - f2);
        }
        if (z) {
            draggableAnchorsConfig.at(SheetValue.Hidden, f3);
        }
        if (z3) {
            draggableAnchorsConfig.at(SheetValue.Expanded, f3 - f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardBottomSheet_w7I5h1o$lambda$5(final SheetState sheetState, Function2 function2, final CoroutineScope coroutineScope, final boolean z, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C358@16982L3822:BottomSheetScaffold.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1508311921, i, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:358)");
            }
            Modifier verticalScaleDown = SheetDefaultsKt.verticalScaleDown(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), sheetState);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, verticalScaleDown);
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
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1044107094, "C424@20785L9:BottomSheetScaffold.kt#uh7d8r");
            if (function2 != null) {
                composer.startReplaceGroup(-1044084713);
                ComposerKt.sourceInformation(composer, "367@17413L54,368@17509L48,369@17598L47,372@17759L738,387@18562L2135,370@17662L3096");
                Strings.Companion companion = Strings.INSTANCE;
                final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer, 0);
                Strings.Companion companion2 = Strings.INSTANCE;
                final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer, 0);
                Strings.Companion companion3 = Strings.INSTANCE;
                final String m4895getString2EP1pXo3 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer, 0);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1003500887, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                boolean changed = composer.changed(sheetState) | composer.changedInstance(coroutineScope);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit StandardBottomSheet_w7I5h1o$lambda$5$0$0$0;
                            StandardBottomSheet_w7I5h1o$lambda$5$0$0$0 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$5$0$0$0(SheetState.this, coroutineScope);
                            return StandardBottomSheet_w7I5h1o$lambda$5$0$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier m399clickableoSLSa3U$default = ClickableKt.m399clickableoSLSa3U$default(companion4, false, null, null, null, (Function0) rememberedValue, 15, null);
                ComposerKt.sourceInformationMarkerStart(composer, -1003473794, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                boolean changed2 = composer.changed(sheetState) | composer.changed(z) | composer.changed(m4895getString2EP1pXo3) | composer.changedInstance(coroutineScope) | composer.changed(m4895getString2EP1pXo) | composer.changed(m4895getString2EP1pXo2);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit StandardBottomSheet_w7I5h1o$lambda$5$0$1$0;
                            StandardBottomSheet_w7I5h1o$lambda$5$0$1$0 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$5$0$1$0(SheetState.this, z, m4895getString2EP1pXo3, m4895getString2EP1pXo, m4895getString2EP1pXo2, coroutineScope, (SemanticsPropertyReceiver) obj2);
                            return StandardBottomSheet_w7I5h1o$lambda$5$0$1$0;
                        }
                    };
                    composer.updateRememberedValue(obj);
                    rememberedValue2 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                SheetDefaultsKt.DragHandleWithTooltip(SemanticsModifierKt.semantics(m399clickableoSLSa3U$default, true, (Function1) rememberedValue2), function2, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1040790405);
                composer.endReplaceGroup();
            }
            function3.invoke(columnScopeInstance, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardBottomSheet_w7I5h1o$lambda$5$0$0$0(SheetState sheetState, CoroutineScope coroutineScope) {
        int i = WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
        if (i == 2) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$2(sheetState, null), 3, null);
        } else if (i != 3) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3(sheetState, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1(sheetState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardBottomSheet_w7I5h1o$lambda$5$0$1$0(final SheetState sheetState, boolean z, String str, String str2, String str3, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (sheetState.getAnchoredDraggableState$material3().getAnchors().getSize() > 1 && z) {
            if (sheetState.getCurrentValue() == SheetValue.PartiallyExpanded) {
                SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$0;
                        StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$0 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$0(SheetState.this, coroutineScope);
                        return Boolean.valueOf(StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$0);
                    }
                });
            } else {
                SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$1;
                        StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$1 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$1(SheetState.this, coroutineScope);
                        return Boolean.valueOf(StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$1);
                    }
                });
            }
            if (!sheetState.getSkipHiddenState()) {
                SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$2;
                        StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$2 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$2(SheetState.this, coroutineScope);
                        return Boolean.valueOf(StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$0(SheetState sheetState, CoroutineScope coroutineScope) {
        boolean booleanValue = sheetState.getConfirmValueChange$material3().invoke(SheetValue.Expanded).booleanValue();
        if (booleanValue) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$2$1$1$1$1(sheetState, null), 3, null);
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$1(SheetState sheetState, CoroutineScope coroutineScope) {
        boolean booleanValue = sheetState.getConfirmValueChange$material3().invoke(SheetValue.PartiallyExpanded).booleanValue();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$2$1$1$2$1(sheetState, null), 3, null);
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StandardBottomSheet_w7I5h1o$lambda$5$0$1$0$0$2(SheetState sheetState, CoroutineScope coroutineScope) {
        boolean booleanValue = sheetState.getConfirmValueChange$material3().invoke(SheetValue.Hidden).booleanValue();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$2$1$1$3$1(sheetState, null), 3, null);
        return booleanValue;
    }

    private static final void BottomSheetScaffoldLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function0<Float> function0, final SheetState sheetState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1217723575);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffoldLayout)N(topBar,body,bottomSheet,snackbarHost,sheetOffset,sheetState)441@21238L1942,439@21127L2053:BottomSheetScaffold.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(sheetState) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1217723575, i2, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:438)");
            }
            Function2[] function2Arr = new Function2[4];
            function2Arr[0] = function2 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m2824getLambda$788244078$material3() : function2;
            function2Arr[1] = function22;
            function2Arr[2] = function23;
            function2Arr[3] = function24;
            List listOf = CollectionsKt.listOf((Object[]) function2Arr);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2001237473, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            boolean z = ((458752 & i2) == 131072) | ((i2 & 57344) == 16384);
            BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(sheetState, function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 292526026, "CC(remember):Layout.kt#9igjgp");
            boolean changed = startRestartGroup.changed(multiContentMeasurePolicy);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomSheetScaffoldLayout$lambda$1;
                    BottomSheetScaffoldLayout$lambda$1 = BottomSheetScaffoldKt.BottomSheetScaffoldLayout$lambda$1(Function2.this, function22, function23, function24, function0, sheetState, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomSheetScaffoldLayout$lambda$1;
                }
            });
        }
    }
}
