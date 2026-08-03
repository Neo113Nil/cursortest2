package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.LoadingIndicatorDefaults;
import androidx.compose.material3.LoadingIndicatorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010-\u001a\u00020\u001a2\u001c\u0010.\u001a\u0018\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020%0/¢\u0006\u0002\b1¢\u0006\u0002\b2H\u0007¢\u0006\u0004\b3\u00104JG\u00105\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u00106\u001a\u00020\f2\b\b\u0002\u0010,\u001a\u00020\u001aH\u0007¢\u0006\u0004\b7\u00108JQ\u00109\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u00106\u001a\u00020\f2\b\b\u0002\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010,\u001a\u00020\u001aH\u0007¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0019\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001e\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010 \u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0013\u0010\"\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001c¨\u0006<"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;", "", "<init>", "()V", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape$annotations", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "indicatorShape", "getIndicatorShape", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor$annotations", "(Landroidx/compose/runtime/Composer;I)V", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "indicatorContainerColor", "getIndicatorContainerColor", "loadingIndicatorContainerColor", "getLoadingIndicatorContainerColor", "indicatorColor", "getIndicatorColor", "loadingIndicatorColor", "getLoadingIndicatorColor", "PositionalThreshold", "Landroidx/compose/ui/unit/Dp;", "getPositionalThreshold-D9Ej5fM", "()F", "F", "IndicatorMaxDistance", "getIndicatorMaxDistance-D9Ej5fM", "Elevation", "getElevation-D9Ej5fM", "LoadingIndicatorElevation", "getLoadingIndicatorElevation-D9Ej5fM", "IndicatorBox", "", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "isRefreshing", "", "modifier", "Landroidx/compose/ui/Modifier;", "maxDistance", "elevation", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "IndicatorBox-1CPYgEU", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZLandroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;JFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Indicator", "color", "Indicator-2poqoh4", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZLandroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;II)V", "LoadingIndicator", "LoadingIndicator-4eDdRP8", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZLandroidx/compose/ui/Modifier;JJFFLandroidx/compose/runtime/Composer;II)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class PullToRefreshDefaults {
    public static final int $stable = 0;
    private static final float Elevation;
    private static final float IndicatorMaxDistance;
    private static final float LoadingIndicatorElevation;
    private static final float PositionalThreshold;
    public static final PullToRefreshDefaults INSTANCE = new PullToRefreshDefaults();
    private static final Shape shape = RoundedCornerShapeKt.getCircleShape();
    private static final Shape indicatorShape = RoundedCornerShapeKt.getCircleShape();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorBox_1CPYgEU$lambda$2(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z, Modifier modifier, float f, Shape shape2, long j, float f2, Function3 function3, int i, int i2, Composer composer, int i3) {
        pullToRefreshDefaults.m4916IndicatorBox1CPYgEU(pullToRefreshState, z, modifier, f, shape2, j, f2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Indicator_2poqoh4$lambda$1(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z, Modifier modifier, long j, long j2, float f, int i, int i2, Composer composer, int i3) {
        pullToRefreshDefaults.m4915Indicator2poqoh4(pullToRefreshState, z, modifier, j, j2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicator_4eDdRP8$lambda$1(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z, Modifier modifier, long j, long j2, float f, float f2, int i, int i2, Composer composer, int i3) {
        pullToRefreshDefaults.m4917LoadingIndicator4eDdRP8(pullToRefreshState, z, modifier, j, j2, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @Deprecated(message = "Use indicatorContainerColor instead", replaceWith = @ReplaceWith(expression = "indicatorContainerColor", imports = {}))
    public static /* synthetic */ void getContainerColor$annotations(Composer composer, int i) {
    }

    @Deprecated(message = "Use indicatorShape instead", replaceWith = @ReplaceWith(expression = "indicatorShape", imports = {}))
    public static /* synthetic */ void getShape$annotations() {
    }

    private PullToRefreshDefaults() {
    }

    static {
        float m9732constructorimpl = Dp.m9732constructorimpl(80);
        PositionalThreshold = m9732constructorimpl;
        IndicatorMaxDistance = m9732constructorimpl;
        Elevation = ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM();
        LoadingIndicatorElevation = ElevationTokens.INSTANCE.m5175getLevel0D9Ej5fM();
    }

    public final Shape getShape() {
        return shape;
    }

    public final Shape getIndicatorShape() {
        return indicatorShape;
    }

    public final long getContainerColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1066257972, "C(<get-containerColor>)458@17328L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1066257972, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:458)");
        }
        long surfaceContainerHigh = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurfaceContainerHigh();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return surfaceContainerHigh;
    }

    public final long getIndicatorContainerColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -80510850, "C(<get-indicatorContainerColor>)462@17498L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-80510850, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorContainerColor> (PullToRefresh.kt:462)");
        }
        long surfaceContainerHigh = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurfaceContainerHigh();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return surfaceContainerHigh;
    }

    public final long getLoadingIndicatorContainerColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1747883372, "C(<get-loadingIndicatorContainerColor>)468@17746L23:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1747883372, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-loadingIndicatorContainerColor> (PullToRefresh.kt:468)");
        }
        long containedContainerColor = LoadingIndicatorDefaults.INSTANCE.getContainedContainerColor(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return containedContainerColor;
    }

    public final long getIndicatorColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1441334156, "C(<get-indicatorColor>)472@17898L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1441334156, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:472)");
        }
        long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getOnSurfaceVariant();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return onSurfaceVariant;
    }

    public final long getLoadingIndicatorColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1583174528, "C(<get-loadingIndicatorColor>)479@18147L23:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1583174528, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-loadingIndicatorColor> (PullToRefresh.kt:479)");
        }
        long containedIndicatorColor = LoadingIndicatorDefaults.INSTANCE.getContainedIndicatorColor(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return containedIndicatorColor;
    }

    /* renamed from: getPositionalThreshold-D9Ej5fM, reason: not valid java name */
    public final float m4921getPositionalThresholdD9Ej5fM() {
        return PositionalThreshold;
    }

    /* renamed from: getIndicatorMaxDistance-D9Ej5fM, reason: not valid java name */
    public final float m4919getIndicatorMaxDistanceD9Ej5fM() {
        return IndicatorMaxDistance;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m4918getElevationD9Ej5fM() {
        return Elevation;
    }

    /* renamed from: getLoadingIndicatorElevation-D9Ej5fM, reason: not valid java name */
    public final float m4920getLoadingIndicatorElevationD9Ej5fM() {
        return LoadingIndicatorElevation;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* renamed from: IndicatorBox-1CPYgEU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4916IndicatorBox1CPYgEU(final PullToRefreshState pullToRefreshState, final boolean z, Modifier modifier, float f, Shape shape2, long j, float f2, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        float f3;
        Shape shape3;
        int i4;
        int i5;
        long j2;
        float f4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1341144489);
        ComposerKt.sourceInformation(startRestartGroup, "C(IndicatorBox)N(state,isRefreshing,modifier,maxDistance:c#ui.unit.Dp,shape,containerColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp,content)527@20166L372,537@20567L951,523@20028L1652:PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    f3 = f;
                    if (startRestartGroup.changed(f3)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    f3 = f;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                f3 = f;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape3 = shape2;
                    if (startRestartGroup.changed(shape3)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    shape3 = shape2;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                shape3 = shape2;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 = i4;
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                if ((i & 1572864) == 0) {
                    f4 = f2;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(f4)) ? 1048576 : 524288;
                } else {
                    f4 = f2;
                }
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                boolean z3 = true;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            f3 = IndicatorMaxDistance;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            shape3 = indicatorShape;
                        }
                        if (i5 != 0) {
                            j2 = Color.INSTANCE.m6822getUnspecified0d7_KjU();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            f4 = Elevation;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:522)");
                    }
                    Modifier m1271size3ABfNKs = SizeKt.m1271size3ABfNKs(modifier2, PullToRefreshKt.getSpinnerContainerSize());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -349648757, "CC(remember):PullToRefresh.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit IndicatorBox_1CPYgEU$lambda$0$0;
                                IndicatorBox_1CPYgEU$lambda$0$0 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$0$0((ContentDrawScope) obj);
                                return IndicatorBox_1CPYgEU$lambda$0$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier drawWithContent = DrawModifierKt.drawWithContent(m1271size3ABfNKs, (Function1) rememberedValue);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -349635346, "CC(remember):PullToRefresh.kt#9igjgp");
                    boolean z4 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) > 1048576 && startRestartGroup.changed(f4)) || (i3 & 1572864) == 1048576);
                    if ((((57344 & i3) ^ 24576) <= 16384 || !startRestartGroup.changed(shape3)) && (i3 & 24576) != 16384) {
                        z3 = false;
                    }
                    boolean z5 = z4 | z3;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final boolean z6 = z2;
                        final float f5 = f3;
                        final float f6 = f4;
                        final Shape shape4 = shape3;
                        rememberedValue2 = new Function3() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                MeasureResult IndicatorBox_1CPYgEU$lambda$1$0;
                                IndicatorBox_1CPYgEU$lambda$1$0 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$1$0(PullToRefreshState.this, z6, f5, f6, shape4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                                return IndicatorBox_1CPYgEU$lambda$1$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier m352backgroundbw27NRU = BackgroundKt.m352backgroundbw27NRU(LayoutModifierKt.layout(drawWithContent, (Function3) rememberedValue2), j2, shape3);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    int i9 = ((i3 >> 12) & 7168) | 48;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m352backgroundbw27NRU);
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
                    Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    function3.invoke(BoxScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i9 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                final Modifier modifier3 = modifier2;
                final float f7 = f3;
                final float f8 = f4;
                final Shape shape5 = shape3;
                final long j3 = j2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit IndicatorBox_1CPYgEU$lambda$2;
                            IndicatorBox_1CPYgEU$lambda$2 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$2(PullToRefreshDefaults.this, pullToRefreshState, z, modifier3, f7, shape5, j3, f8, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return IndicatorBox_1CPYgEU$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            i5 = i4;
            j2 = j;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            boolean z32 = true;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            final Modifier modifier32 = modifier2;
            final float f72 = f3;
            final float f82 = f4;
            final Shape shape52 = shape3;
            final long j32 = j2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i4;
        j2 = j;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        boolean z322 = true;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        final Modifier modifier322 = modifier2;
        final float f722 = f3;
        final float f822 = f4;
        final Shape shape522 = shape3;
        final long j322 = j2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorBox_1CPYgEU$lambda$0$0(ContentDrawScope contentDrawScope) {
        int m6775getIntersectrtfAjoo = ClipOp.INSTANCE.m6775getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo7304clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m6775getIntersectrtfAjoo);
            contentDrawScope.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult IndicatorBox_1CPYgEU$lambda$1$0(final PullToRefreshState pullToRefreshState, final boolean z, final float f, final float f2, final Shape shape2, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit IndicatorBox_1CPYgEU$lambda$1$0$0;
                IndicatorBox_1CPYgEU$lambda$1$0$0 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$1$0$0(Placeable.this, pullToRefreshState, z, f, f2, shape2, (Placeable.PlacementScope) obj);
                return IndicatorBox_1CPYgEU$lambda$1$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorBox_1CPYgEU$lambda$1$0$0(Placeable placeable, final PullToRefreshState pullToRefreshState, final boolean z, final float f, final float f2, final Shape shape2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit IndicatorBox_1CPYgEU$lambda$1$0$0$0;
                IndicatorBox_1CPYgEU$lambda$1$0$0$0 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$1$0$0$0(PullToRefreshState.this, z, f, f2, shape2, (GraphicsLayerScope) obj);
                return IndicatorBox_1CPYgEU$lambda$1$0$0$0;
            }
        }, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorBox_1CPYgEU$lambda$1$0$0$0(PullToRefreshState pullToRefreshState, boolean z, float f, float f2, Shape shape2, GraphicsLayerScope graphicsLayerScope) {
        boolean z2 = pullToRefreshState.getDistanceFraction() > 0.0f || z;
        graphicsLayerScope.setTranslationY((pullToRefreshState.getDistanceFraction() * graphicsLayerScope.mo522roundToPx0680j_4(f)) - Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)));
        graphicsLayerScope.setShadowElevation(z2 ? graphicsLayerScope.mo528toPx0680j_4(f2) : 0.0f);
        graphicsLayerScope.setShape(shape2);
        graphicsLayerScope.setClip(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bf  */
    /* renamed from: Indicator-2poqoh4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4915Indicator2poqoh4(final PullToRefreshState pullToRefreshState, final boolean z, Modifier modifier, long j, long j2, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final float f2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        long j7;
        int i4;
        float f3;
        final long j8;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1076870256);
        ComposerKt.sourceInformation(startRestartGroup, "C(Indicator)N(state,isRefreshing,modifier,containerColor:c#ui.graphics.Color,color:c#ui.graphics.Color,maxDistance:c#ui.unit.Dp)588@22774L755,582@22565L964:PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    j3 = j;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (startRestartGroup.changed(f2)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    f2 = f;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                f2 = f;
            }
            if ((1572864 & i) == 0) {
                i3 |= startRestartGroup.changed(this) ? 1048576 : 524288;
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "578@22432L23,579@22485L14");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    companion = modifier2;
                    j7 = j3;
                    j8 = j4;
                    i4 = i3;
                    f3 = f2;
                } else {
                    companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        j7 = getIndicatorContainerColor(startRestartGroup, (i3 >> 18) & 14);
                        i3 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 16) != 0) {
                        j4 = getIndicatorColor(startRestartGroup, (i3 >> 18) & 14);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i4 = i3 & (-458753);
                        f3 = IndicatorMaxDistance;
                    } else {
                        i4 = i3;
                        f3 = f2;
                    }
                    j8 = j4;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1076870256, i4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:581)");
                }
                int i8 = (i4 & 14) | 12582912 | (i4 & 112) | (i4 & 896) | ((i4 >> 6) & 7168);
                int i9 = i4 << 6;
                int i10 = i8 | (458752 & i9) | (i9 & 234881024);
                Modifier modifier4 = companion;
                m4916IndicatorBox1CPYgEU(pullToRefreshState, z, modifier4, f3, null, j7, 0.0f, ComposableLambdaKt.rememberComposableLambda(298232649, true, new Function3() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit Indicator_2poqoh4$lambda$0;
                        Indicator_2poqoh4$lambda$0 = PullToRefreshDefaults.Indicator_2poqoh4$lambda$0(z, j8, pullToRefreshState, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return Indicator_2poqoh4$lambda$0;
                    }
                }, startRestartGroup, 54), startRestartGroup, i10, 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f2 = f3;
                j5 = j7;
                j6 = j8;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Indicator_2poqoh4$lambda$1;
                        Indicator_2poqoh4$lambda$1 = PullToRefreshDefaults.Indicator_2poqoh4$lambda$1(PullToRefreshDefaults.this, pullToRefreshState, z, modifier3, j5, j6, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Indicator_2poqoh4$lambda$1;
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
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Indicator_2poqoh4$lambda$0(boolean z, final long j, final PullToRefreshState pullToRefreshState, BoxScope boxScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C592@22992L7,593@23015L504,590@22868L651:PullToRefresh.kt#djiw08");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(298232649, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous> (PullToRefresh.kt:590)");
            }
            CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, (FiniteAnimationSpec<Float>) MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), (String) null, ComposableLambdaKt.rememberComposableLambda(-2064098104, true, new Function3() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit Indicator_2poqoh4$lambda$0$0;
                    Indicator_2poqoh4$lambda$0$0 = PullToRefreshDefaults.Indicator_2poqoh4$lambda$0$0(j, pullToRefreshState, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
                    return Indicator_2poqoh4$lambda$0$0;
                }
            }, composer, 54), composer, 24576, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Indicator_2poqoh4$lambda$0$0(long j, final PullToRefreshState pullToRefreshState, boolean z, Composer composer, int i) {
        int i2;
        float f;
        ComposerKt.sourceInformation(composer, "CN(refreshing):PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2064098104, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:594)");
            }
            if (z) {
                composer.startReplaceGroup(-499763759);
                ComposerKt.sourceInformation(composer, "595@23085L201");
                f = PullToRefreshKt.StrokeWidth;
                ProgressIndicatorKt.m3754CircularProgressIndicator4lLiAd8(SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, PullToRefreshKt.getSpinnerSize()), j, f, 0L, 0, 0.0f, composer, 390, 56);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-499540745);
                ComposerKt.sourceInformation(composer, "602@23399L26,601@23332L155");
                ComposerKt.sourceInformationMarkerStart(composer, 676625122, "CC(remember):PullToRefresh.kt#9igjgp");
                boolean changed = composer.changed(pullToRefreshState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new FloatProducer() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda10
                        @Override // androidx.compose.material3.internal.FloatProducer
                        public final float invoke() {
                            float distanceFraction;
                            distanceFraction = PullToRefreshState.this.getDistanceFraction();
                            return distanceFraction;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                PullToRefreshKt.m4925CircularArrowProgressIndicatorRPmYEkk((FloatProducer) rememberedValue, j, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: LoadingIndicator-4eDdRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4917LoadingIndicator4eDdRP8(final PullToRefreshState pullToRefreshState, final boolean z, Modifier modifier, long j, long j2, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final float f3;
        float f4;
        final Modifier modifier3;
        final long j5;
        Composer composer2;
        final long j6;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        float f6;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(182619560);
        ComposerKt.sourceInformation(startRestartGroup, "C(LoadingIndicator)N(state,isRefreshing,modifier,containerColor:c#ui.graphics.Color,color:c#ui.graphics.Color,elevation:c#ui.unit.Dp,maxDistance:c#ui.unit.Dp)640@24862L2488,633@24551L2799:PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    j3 = j;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f3 = f;
                    if (startRestartGroup.changed(f3)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    f3 = f;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                f3 = f;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f4 = f2;
                    if (startRestartGroup.changed(f4)) {
                        i4 = 1048576;
                        i3 |= i4;
                    }
                } else {
                    f4 = f2;
                }
                i4 = 524288;
                i3 |= i4;
            } else {
                f4 = f2;
            }
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "628@24353L30,629@24413L21");
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        j3 = getLoadingIndicatorContainerColor(startRestartGroup, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        j4 = getLoadingIndicatorColor(startRestartGroup, (i3 >> 21) & 14);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = LoadingIndicatorElevation;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f6 = IndicatorMaxDistance;
                        Modifier modifier4 = modifier2;
                        final long j7 = j3;
                        float f7 = f3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(182619560, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator (PullToRefresh.kt:632)");
                        }
                        final long j8 = j4;
                        int i8 = (i3 & 14) | 12582912 | (i3 & 112) | ((i3 >> 9) & 7168) | (458752 & (i3 << 6));
                        int i9 = i3 << 3;
                        m4916IndicatorBox1CPYgEU(pullToRefreshState, z, SizeKt.m1273sizeVpY3zN4(modifier4, PullToRefreshKt.getLoaderIndicatorWidth(), PullToRefreshKt.getLoaderIndicatorHeight()), f6, null, j7, f7, ComposableLambdaKt.rememberComposableLambda(2122932769, true, new Function3() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit LoadingIndicator_4eDdRP8$lambda$0;
                                LoadingIndicator_4eDdRP8$lambda$0 = PullToRefreshDefaults.LoadingIndicator_4eDdRP8$lambda$0(z, j7, j8, pullToRefreshState, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                return LoadingIndicator_4eDdRP8$lambda$0;
                            }
                        }, startRestartGroup, 54), startRestartGroup, i8 | (3670016 & i9) | (i9 & 234881024), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = j7;
                        f3 = f7;
                        composer2 = startRestartGroup;
                        j6 = j8;
                        f5 = f6;
                        modifier3 = modifier4;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                }
                f6 = f4;
                Modifier modifier42 = modifier2;
                final long j72 = j3;
                float f72 = f3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final long j82 = j4;
                int i82 = (i3 & 14) | 12582912 | (i3 & 112) | ((i3 >> 9) & 7168) | (458752 & (i3 << 6));
                int i92 = i3 << 3;
                m4916IndicatorBox1CPYgEU(pullToRefreshState, z, SizeKt.m1273sizeVpY3zN4(modifier42, PullToRefreshKt.getLoaderIndicatorWidth(), PullToRefreshKt.getLoaderIndicatorHeight()), f6, null, j72, f72, ComposableLambdaKt.rememberComposableLambda(2122932769, true, new Function3() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit LoadingIndicator_4eDdRP8$lambda$0;
                        LoadingIndicator_4eDdRP8$lambda$0 = PullToRefreshDefaults.LoadingIndicator_4eDdRP8$lambda$0(z, j72, j82, pullToRefreshState, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return LoadingIndicator_4eDdRP8$lambda$0;
                    }
                }, startRestartGroup, 54), startRestartGroup, i82 | (3670016 & i92) | (i92 & 234881024), 16);
                if (ComposerKt.isTraceInProgress()) {
                }
                j5 = j72;
                f3 = f72;
                composer2 = startRestartGroup;
                j6 = j82;
                f5 = f6;
                modifier3 = modifier42;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                composer2 = startRestartGroup;
                j6 = j4;
                f5 = f4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit LoadingIndicator_4eDdRP8$lambda$1;
                        LoadingIndicator_4eDdRP8$lambda$1 = PullToRefreshDefaults.LoadingIndicator_4eDdRP8$lambda$1(PullToRefreshDefaults.this, pullToRefreshState, z, modifier3, j5, j6, f3, f5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return LoadingIndicator_4eDdRP8$lambda$1;
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
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicator_4eDdRP8$lambda$0(boolean z, final long j, final long j2, final PullToRefreshState pullToRefreshState, BoxScope boxScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C644@25080L7,645@25103L2237,642@24956L2384:PullToRefresh.kt#djiw08");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2122932769, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator.<anonymous> (PullToRefresh.kt:642)");
            }
            CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, (FiniteAnimationSpec<Float>) MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), (String) null, ComposableLambdaKt.rememberComposableLambda(1703313632, true, new Function3() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit LoadingIndicator_4eDdRP8$lambda$0$0;
                    LoadingIndicator_4eDdRP8$lambda$0$0 = PullToRefreshDefaults.LoadingIndicator_4eDdRP8$lambda$0$0(j, j2, pullToRefreshState, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
                    return LoadingIndicator_4eDdRP8$lambda$0$0;
                }
            }, composer, 54), composer, 24576, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicator_4eDdRP8$lambda$0$0(long j, long j2, final PullToRefreshState pullToRefreshState, boolean z, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(refreshing):PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1703313632, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator.<anonymous>.<anonymous> (PullToRefresh.kt:646)");
            }
            if (z) {
                composer.startReplaceGroup(-1622128210);
                ComposerKt.sourceInformation(composer, "647@25173L460");
                LoadingIndicatorKt.m3499ContainedLoadingIndicatorDTcfvLk(SizeKt.m1265requiredSizeVpY3zN4(Modifier.INSTANCE, PullToRefreshKt.getLoaderIndicatorWidth(), PullToRefreshKt.getLoaderIndicatorHeight()), j, j2, null, null, composer, 6, 24);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1621590019);
                ComposerKt.sourceInformation(composer, "663@26101L26,669@26432L748,661@25975L1333");
                ComposerKt.sourceInformationMarkerStart(composer, 501892538, "CC(remember):PullToRefresh.kt#9igjgp");
                boolean changed = composer.changed(pullToRefreshState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float distanceFraction;
                            distanceFraction = PullToRefreshState.this.getDistanceFraction();
                            return Float.valueOf(distanceFraction);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier m1265requiredSizeVpY3zN4 = SizeKt.m1265requiredSizeVpY3zN4(Modifier.INSTANCE, PullToRefreshKt.getLoaderIndicatorWidth(), PullToRefreshKt.getLoaderIndicatorHeight());
                ComposerKt.sourceInformationMarkerStart(composer, 501903852, "CC(remember):PullToRefresh.kt#9igjgp");
                boolean changed2 = composer.changed(pullToRefreshState);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit LoadingIndicator_4eDdRP8$lambda$0$0$1$0;
                            LoadingIndicator_4eDdRP8$lambda$0$0$1$0 = PullToRefreshDefaults.LoadingIndicator_4eDdRP8$lambda$0$0$1$0(PullToRefreshState.this, (ContentDrawScope) obj);
                            return LoadingIndicator_4eDdRP8$lambda$0$0$1$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                LoadingIndicatorKt.m3500ContainedLoadingIndicatorY0xEhic(function0, DrawModifierKt.drawWithContent(m1265requiredSizeVpY3zN4, (Function1) rememberedValue2), j, j2, null, null, composer, 0, 48);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicator_4eDdRP8$lambda$0$0$1$0(PullToRefreshState pullToRefreshState, ContentDrawScope contentDrawScope) {
        float distanceFraction = pullToRefreshState.getDistanceFraction();
        if (distanceFraction > 1.0f) {
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            float f = (-(distanceFraction - 1)) * 180;
            long mo7293getCenterF1C5BW0 = contentDrawScope2.mo7293getCenterF1C5BW0();
            DrawContext drawContext = contentDrawScope2.getDrawContext();
            long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo7307rotateUv8p0NA(f, mo7293getCenterF1C5BW0);
                contentDrawScope.drawContent();
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            }
        } else {
            contentDrawScope.drawContent();
        }
        return Unit.INSTANCE;
    }
}
