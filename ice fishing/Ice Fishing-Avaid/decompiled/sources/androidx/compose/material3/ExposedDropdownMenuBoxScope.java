package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\tH&J\u0095\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00150&¢\u0006\u0002\b(¢\u0006\u0002\b)H\u0007¢\u0006\u0004\b*\u0010+J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0005H\u0007J\u009f\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00150&¢\u0006\u0002\b(¢\u0006\u0002\b)H\u0007¢\u0006\u0004\b.\u0010/JU\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00150&¢\u0006\u0002\b(¢\u0006\u0002\b)H\u0007¢\u0006\u0002\u00100R\u0012\u0010\u000e\u001a\u00020\u0007X \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\tX \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u00011¨\u00062"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "<init>", "()V", "menuAnchor", "Landroidx/compose/ui/Modifier;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/material3/ExposedDropdownMenuAnchorType;", "enabled", "", "menuAnchor-2Hz36ac", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "exposedDropdownSize", "matchAnchorWidth", "anchorType", "getAnchorType-oYjWRB4$material3", "()Ljava/lang/String;", "alwaysFocusable", "getAlwaysFocusable$material3", "()Z", "ExposedDropdownMenu", "", "expanded", "onDismissRequest", "Lkotlin/Function0;", "modifier", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ExposedDropdownMenu-vNxi1II", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "focusable", "matchTextFieldWidth", "ExposedDropdownMenu-kbRbctU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/ExposedDropdownMenuBoxScopeImpl;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    public /* synthetic */ ExposedDropdownMenuBoxScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenu$lambda$0(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0 function0, Modifier modifier, ScrollState scrollState, Function3 function3, int i, int i2, Composer composer, int i3) {
        exposedDropdownMenuBoxScope.ExposedDropdownMenu(z, function0, modifier, scrollState, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenu_kbRbctU$lambda$0(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0 function0, Modifier modifier, ScrollState scrollState, boolean z2, boolean z3, Shape shape, long j, float f, float f2, BorderStroke borderStroke, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        exposedDropdownMenuBoxScope.m3100ExposedDropdownMenukbRbctU(z, function0, modifier, scrollState, z2, z3, shape, j, f, f2, borderStroke, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenu_vNxi1II$lambda$6(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0 function0, Modifier modifier, ScrollState scrollState, boolean z2, Shape shape, long j, float f, float f2, BorderStroke borderStroke, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        exposedDropdownMenuBoxScope.m3101ExposedDropdownMenuvNxi1II(z, function0, modifier, scrollState, z2, shape, j, f, f2, borderStroke, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public abstract Modifier exposedDropdownSize(Modifier modifier, boolean z);

    public abstract boolean getAlwaysFocusable$material3();

    /* renamed from: getAnchorType-oYjWRB4$material3, reason: not valid java name */
    public abstract String mo3102getAnchorTypeoYjWRB4$material3();

    /* renamed from: menuAnchor-2Hz36ac, reason: not valid java name */
    public abstract Modifier mo3103menuAnchor2Hz36ac(Modifier modifier, String str, boolean z);

    private ExposedDropdownMenuBoxScope() {
    }

    /* renamed from: menuAnchor-2Hz36ac$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3099menuAnchor2Hz36ac$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-2Hz36ac");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.mo3103menuAnchor2Hz36ac(modifier, str, z);
    }

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0275  */
    /* renamed from: ExposedDropdownMenu-vNxi1II, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3101ExposedDropdownMenuvNxi1II(final boolean z, final Function0<Unit> function0, Modifier modifier, ScrollState scrollState, boolean z2, Shape shape, long j, float f, float f2, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        Modifier modifier2;
        ScrollState scrollState2;
        int i5;
        boolean z3;
        Shape shape2;
        final long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final float f3;
        final Shape shape3;
        final Modifier modifier3;
        final ScrollState scrollState3;
        final boolean z4;
        final float f4;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState4;
        final BorderStroke borderStroke3;
        final Modifier modifier4;
        final Shape shape4;
        final long j3;
        final float f5;
        final ScrollState scrollState5;
        final float f6;
        final boolean z5;
        Object rememberedValue;
        final MutableState mutableState;
        Object rememberedValue2;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue3;
        boolean changed;
        Object rememberedValue4;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-126848451);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)N(expanded,onDismissRequest,modifier,scrollState,matchAnchorWidth,shape,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,content)324@15347L53,325@15436L7,326@15487L10,333@15744L42:ExposedDropdownMenu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i12 = 2048;
                        i4 |= i12;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i12 = 1024;
                i4 |= i12;
            } else {
                scrollState2 = scrollState;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    shape2 = shape;
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                } else {
                    shape2 = shape;
                }
                if ((i & 1572864) == 0) {
                    j2 = j;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                } else {
                    j2 = j;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if ((i2 & 6) != 0) {
                        i10 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i10 |= startRestartGroup.changed(this) ? 32 : 16;
                    }
                    i11 = i10;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "313@14737L21,315@14838L5,316@14890L14");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            f5 = f;
                            f6 = f2;
                            borderStroke3 = borderStroke;
                            shape4 = shape2;
                            j3 = j2;
                            modifier4 = modifier2;
                            scrollState5 = scrollState2;
                        } else {
                            Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 8) != 0) {
                                scrollState4 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                i4 &= -7169;
                            } else {
                                scrollState4 = scrollState2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                shape2 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                j2 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i4 &= -3670017;
                            }
                            float m3525getTonalElevationD9Ej5fM = i6 != 0 ? MenuDefaults.INSTANCE.m3525getTonalElevationD9Ej5fM() : f;
                            float m3524getShadowElevationD9Ej5fM = i8 != 0 ? MenuDefaults.INSTANCE.m3524getShadowElevationD9Ej5fM() : f2;
                            if (i9 != 0) {
                                modifier4 = companion;
                                shape4 = shape2;
                                j3 = j2;
                                f5 = m3525getTonalElevationD9Ej5fM;
                                scrollState5 = scrollState4;
                                f6 = m3524getShadowElevationD9Ej5fM;
                                z5 = z3;
                                borderStroke3 = null;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-126848451, i4, i11, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642252302, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                mutableState = (MutableState) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Density density = (Density) consume;
                                int top = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6).getTop(density);
                                if (!z) {
                                    startRestartGroup.startReplaceGroup(629975788);
                                    ComposerKt.sourceInformation(startRestartGroup, "329@15580L36,329@15551L65");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642244863, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function0() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit ExposedDropdownMenu_vNxi1II$lambda$1$0;
                                                ExposedDropdownMenu_vNxi1II$lambda$1$0 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$1$0(MutableState.this);
                                                return ExposedDropdownMenu_vNxi1II$lambda$1$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ExposedDropdownMenu_androidKt.OnPlatformWindowBoundsChange((Function0) rememberedValue5, startRestartGroup, 6);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(630061317);
                                    startRestartGroup.endReplaceGroup();
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642239609, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new MutableTransitionState(false);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                mutableTransitionState = (MutableTransitionState) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                    startRestartGroup.startReplaceGroup(630380617);
                                    ComposerKt.sourceInformation(startRestartGroup, "337@15943L51,339@16051L486,353@16703L57,354@16776L584,350@16551L809");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642233232, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m7198boximpl(TransformOrigin.INSTANCE.m7211getCenterSzJe1aQ()), null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    final MutableState mutableState2 = (MutableState) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642229341, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                                    changed = startRestartGroup.changed(density) | startRestartGroup.changed(top);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new ExposedDropdownMenuPositionProvider(density, top, mutableState, 0, new Function2() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit ExposedDropdownMenu_vNxi1II$lambda$4$0;
                                                ExposedDropdownMenu_vNxi1II$lambda$4$0 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$4$0(MutableState.this, (IntRect) obj, (IntRect) obj2);
                                                return ExposedDropdownMenu_vNxi1II$lambda$4$0;
                                            }
                                        }, 8, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) rememberedValue4, function02, ExposedDropdownMenu_androidKt.m3123popupPropertiesForAnchorTypeBTG8q0(mo3102getAnchorTypeoYjWRB4$material3(), getAlwaysFocusable$material3(), startRestartGroup, 0), ComposableLambdaKt.rememberComposableLambda(2063119149, true, new Function2() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit ExposedDropdownMenu_vNxi1II$lambda$5;
                                            ExposedDropdownMenu_vNxi1II$lambda$5 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$5(ExposedDropdownMenuBoxScope.this, modifier4, z5, mutableTransitionState, mutableState2, scrollState5, shape4, j3, f5, f6, borderStroke3, function3, (Composer) obj, ((Integer) obj2).intValue());
                                            return ExposedDropdownMenu_vNxi1II$lambda$5;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i4 & 112) | 3072, 0);
                                    composer2 = startRestartGroup;
                                    composer2.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(631791365);
                                    startRestartGroup.endReplaceGroup();
                                    composer2 = startRestartGroup;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z4 = z5;
                                scrollState3 = scrollState5;
                                shape3 = shape4;
                                j2 = j3;
                                f3 = f5;
                                f4 = f6;
                                borderStroke2 = borderStroke3;
                            } else {
                                borderStroke3 = borderStroke;
                                modifier4 = companion;
                                shape4 = shape2;
                                j3 = j2;
                                f5 = m3525getTonalElevationD9Ej5fM;
                                scrollState5 = scrollState4;
                                f6 = m3524getShadowElevationD9Ej5fM;
                            }
                        }
                        z5 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642252302, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density2 = (Density) consume2;
                        int top2 = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6).getTop(density2);
                        if (!z) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642239609, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableTransitionState = (MutableTransitionState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        }
                        startRestartGroup.startReplaceGroup(630380617);
                        ComposerKt.sourceInformation(startRestartGroup, "337@15943L51,339@16051L486,353@16703L57,354@16776L584,350@16551L809");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642233232, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState22 = (MutableState) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1642229341, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                        changed = startRestartGroup.changed(density2) | startRestartGroup.changed(top2);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue4 = new ExposedDropdownMenuPositionProvider(density2, top2, mutableState, 0, new Function2() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExposedDropdownMenu_vNxi1II$lambda$4$0;
                                ExposedDropdownMenu_vNxi1II$lambda$4$0 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$4$0(MutableState.this, (IntRect) obj, (IntRect) obj2);
                                return ExposedDropdownMenu_vNxi1II$lambda$4$0;
                            }
                        }, 8, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) rememberedValue4, function02, ExposedDropdownMenu_androidKt.m3123popupPropertiesForAnchorTypeBTG8q0(mo3102getAnchorTypeoYjWRB4$material3(), getAlwaysFocusable$material3(), startRestartGroup, 0), ComposableLambdaKt.rememberComposableLambda(2063119149, true, new Function2() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExposedDropdownMenu_vNxi1II$lambda$5;
                                ExposedDropdownMenu_vNxi1II$lambda$5 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$5(ExposedDropdownMenuBoxScope.this, modifier4, z5, mutableTransitionState, mutableState22, scrollState5, shape4, j3, f5, f6, borderStroke3, function3, (Composer) obj, ((Integer) obj2).intValue());
                                return ExposedDropdownMenu_vNxi1II$lambda$5;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i4 & 112) | 3072, 0);
                        composer2 = startRestartGroup;
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        scrollState3 = scrollState5;
                        shape3 = shape4;
                        j2 = j3;
                        f3 = f5;
                        f4 = f6;
                        borderStroke2 = borderStroke3;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f;
                        shape3 = shape2;
                        modifier3 = modifier2;
                        scrollState3 = scrollState2;
                        z4 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExposedDropdownMenu_vNxi1II$lambda$6;
                                ExposedDropdownMenu_vNxi1II$lambda$6 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$6(ExposedDropdownMenuBoxScope.this, z, function0, modifier3, scrollState3, z4, shape3, j2, f3, f4, borderStroke2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ExposedDropdownMenu_vNxi1II$lambda$6;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                i11 = i10;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i11 = i10;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i11 = i10;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenu_vNxi1II$lambda$1$0(MutableState mutableState) {
        mutableState.setValue(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenu_vNxi1II$lambda$4$0(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.m7198boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenu_vNxi1II$lambda$5(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j, float f, float f2, BorderStroke borderStroke, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C355@16794L552:ExposedDropdownMenu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2063119149, i, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:355)");
            }
            MenuKt.m3569DropdownMenuContentQj0Zi0g(exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z), mutableTransitionState, mutableState, scrollState, shape, j, f, f2, borderStroke, function3, composer, (MutableTransitionState.$stable << 3) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use overload that takes ExposedDropdownMenuAnchorType and enabled parameters", replaceWith = @ReplaceWith(expression = "menuAnchor(type, enabled)", imports = {}))
    public final Modifier menuAnchor(Modifier modifier) {
        return m3099menuAnchor2Hz36ac$default(this, modifier, ExposedDropdownMenuAnchorType.INSTANCE.m3096getPrimaryNotEditableoYjWRB4(), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a7  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "The `focusable` parameter is unused. Pass the proper ExposedDropdownMenuAnchorType to Modifier.menuAnchor instead, which will handle focusability automatically.")
    /* renamed from: ExposedDropdownMenu-kbRbctU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3100ExposedDropdownMenukbRbctU(final boolean z, final Function0<Unit> function0, Modifier modifier, ScrollState scrollState, boolean z2, boolean z3, Shape shape, long j, float f, float f2, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        Modifier modifier2;
        int i5;
        boolean z4;
        Shape shape2;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final ScrollState scrollState2;
        final float f3;
        final boolean z5;
        final Shape shape3;
        final long j3;
        final Modifier modifier3;
        final boolean z6;
        final float f4;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState3;
        boolean z7;
        Shape shape4;
        BorderStroke borderStroke3;
        ScrollState scrollState4;
        float f5;
        boolean z8;
        Shape shape5;
        float f6;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1772805535);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)N(expanded,onDismissRequest,modifier,scrollState,focusable,matchTextFieldWidth,shape,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,content)401@18683L460:ExposedDropdownMenu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0 && startRestartGroup.changed(scrollState)) {
                    i13 = 2048;
                    i4 |= i13;
                }
                i13 = 1024;
                i4 |= i13;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z4 = z3;
            } else {
                z4 = z3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                }
            }
            if ((i & 1572864) != 0) {
                shape2 = shape;
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
            } else {
                shape2 = shape;
            }
            if ((i & 12582912) != 0) {
                j2 = j;
                i4 |= ((i3 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
            } else {
                j2 = j;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(f) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            i7 = i3 & 512;
            if (i7 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i8 = i7;
                i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i11 = i2 | 6;
                    i10 = i9;
                } else if ((i2 & 6) == 0) {
                    i10 = i9;
                    i11 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                } else {
                    i10 = i9;
                    i11 = i2;
                }
                if ((i2 & 48) == 0) {
                    i11 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i11 |= startRestartGroup.changed(this) ? 256 : 128;
                }
                i12 = i11;
                if (startRestartGroup.shouldExecute((i4 & 306775187) == 306775186 || (i12 & 147) != 146, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "391@18251L21,394@18390L5,395@18442L14");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        scrollState4 = scrollState;
                        z7 = z2;
                        f5 = f;
                        f6 = f2;
                        borderStroke3 = borderStroke;
                        z8 = z4;
                        shape5 = shape2;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 8) != 0) {
                            scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                            i4 &= -7169;
                        } else {
                            scrollState3 = scrollState;
                        }
                        z7 = (i3 & 16) != 0 ? true : z2;
                        boolean z9 = i5 == 0 ? z4 : true;
                        if ((i3 & 64) != 0) {
                            shape4 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i4 &= -3670017;
                        } else {
                            shape4 = shape2;
                        }
                        if ((i3 & 128) != 0) {
                            j2 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i4 &= -29360129;
                        }
                        float m3525getTonalElevationD9Ej5fM = i6 != 0 ? MenuDefaults.INSTANCE.m3525getTonalElevationD9Ej5fM() : f;
                        float m3524getShadowElevationD9Ej5fM = i8 != 0 ? MenuDefaults.INSTANCE.m3524getShadowElevationD9Ej5fM() : f2;
                        if (i10 != 0) {
                            scrollState4 = scrollState3;
                            f5 = m3525getTonalElevationD9Ej5fM;
                            z8 = z9;
                            shape5 = shape4;
                            f6 = m3524getShadowElevationD9Ej5fM;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            scrollState4 = scrollState3;
                            f5 = m3525getTonalElevationD9Ej5fM;
                            z8 = z9;
                            shape5 = shape4;
                            f6 = m3524getShadowElevationD9Ej5fM;
                        }
                    }
                    long j4 = j2;
                    Modifier modifier4 = modifier2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1772805535, i4, i12, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:401)");
                    }
                    int i15 = i4 >> 3;
                    composer2 = startRestartGroup;
                    m3101ExposedDropdownMenuvNxi1II(z, function02, modifier4, scrollState4, z8, shape5, j4, f5, f6, borderStroke3, function3, composer2, (i4 & 8190) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024) | ((i12 << 27) & 1879048192), (i12 >> 3) & 126, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z7;
                    modifier3 = modifier4;
                    scrollState2 = scrollState4;
                    z5 = z8;
                    shape3 = shape5;
                    j3 = j4;
                    f3 = f5;
                    f4 = f6;
                    borderStroke2 = borderStroke3;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    scrollState2 = scrollState;
                    f3 = f;
                    z5 = z4;
                    shape3 = shape2;
                    j3 = j2;
                    modifier3 = modifier2;
                    z6 = z2;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ExposedDropdownMenu_kbRbctU$lambda$0;
                            ExposedDropdownMenu_kbRbctU$lambda$0 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_kbRbctU$lambda$0(ExposedDropdownMenuBoxScope.this, z, function0, modifier3, scrollState2, z6, z5, shape3, j3, f3, f4, borderStroke2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return ExposedDropdownMenu_kbRbctU$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            i8 = i7;
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            i12 = i11;
            if (startRestartGroup.shouldExecute((i4 & 306775187) == 306775186 || (i12 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        i12 = i11;
        if (startRestartGroup.shouldExecute((i4 & 306775187) == 306775186 || (i12 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0069  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with customization options parameters.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void ExposedDropdownMenu(final boolean z, final Function0 function0, Modifier modifier, ScrollState scrollState, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final ScrollState scrollState2;
        Function3 function32;
        ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        ScrollState rememberScrollState;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1501437777);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)N(expanded,onDismissRequest,modifier,scrollState,content)436@19905L5,437@19954L14,430@19657L498:ExposedDropdownMenu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                scrollState2 = scrollState;
            }
            if ((i & 24576) != 0) {
                function32 = function3;
                i3 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
            } else {
                function32 = function3;
            }
            if ((196608 & i) != 0) {
                exposedDropdownMenuBoxScope = this;
                i3 |= startRestartGroup.changed(exposedDropdownMenuBoxScope) ? 131072 : 65536;
            } else {
                exposedDropdownMenuBoxScope = this;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "427@19565L21");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        modifier3 = companion;
                        rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1501437777, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:430)");
                        }
                        int i6 = i3 >> 9;
                        composer2 = startRestartGroup;
                        exposedDropdownMenuBoxScope.m3100ExposedDropdownMenukbRbctU(z, function0, modifier3, rememberScrollState, false, true, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m3525getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m3524getShadowElevationD9Ej5fM(), null, function32, composer2, (i3 & 14) | 906166272 | (i3 & 112) | (i3 & 896) | (i3 & 7168), (i6 & 112) | 6 | (i6 & 896), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        scrollState2 = rememberScrollState;
                    } else {
                        modifier3 = companion;
                    }
                }
                rememberScrollState = scrollState2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i62 = i3 >> 9;
                composer2 = startRestartGroup;
                exposedDropdownMenuBoxScope.m3100ExposedDropdownMenukbRbctU(z, function0, modifier3, rememberScrollState, false, true, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m3525getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m3524getShadowElevationD9Ej5fM(), null, function32, composer2, (i3 & 14) | 906166272 | (i3 & 112) | (i3 & 896) | (i3 & 7168), (i62 & 112) | 6 | (i62 & 896), 16);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                scrollState2 = rememberScrollState;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ExposedDropdownMenu$lambda$0;
                        ExposedDropdownMenu$lambda$0 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu$lambda$0(ExposedDropdownMenuBoxScope.this, z, function0, modifier2, scrollState2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ExposedDropdownMenu$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
