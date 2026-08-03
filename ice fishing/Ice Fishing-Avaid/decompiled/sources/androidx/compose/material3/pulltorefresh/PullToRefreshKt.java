package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.LoadingIndicatorDefaults;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0017\u001aC\u0010\u0018\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u001c\u001a\b\u0010\u001d\u001a\u00020\tH\u0007\u001a\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0003¢\u0006\u0004\b#\u0010$\u001a;\u0010%\u001a\u00020\u0001*\u00020&2\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0013H\u0002¢\u0006\u0004\b.\u0010/\u001a\u0010\u00100\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020(H\u0002\u001aC\u00101\u001a\u00020\u0001*\u00020&2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020,2\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020\u0013H\u0002¢\u0006\u0004\b5\u00106\"\u000e\u00107\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00108\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0010\u0010:\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0016\u0010;\u001a\u00020\u0013X\u0080\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b<\u0010=\"\u0016\u0010>\u001a\u00020\u0013X\u0080\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b?\u0010=\"\u0010\u0010@\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0010\u0010A\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0016\u0010B\u001a\u00020\u0013X\u0080\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\bC\u0010=\"\u0016\u0010D\u001a\u00020\u0013X\u0080\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\bE\u0010=\"\u000e\u0010F\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000¨\u0006I²\u0006\n\u0010J\u001a\u00020(X\u008a\u0084\u0002"}, d2 = {"PullToRefreshBox", "", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "indicator", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "enabled", "threshold", "Landroidx/compose/ui/unit/Dp;", "content", "PullToRefreshBox-gMrHQkA", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;ZFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "pullToRefresh", "pullToRefresh-Z4HSEVQ", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "rememberPullToRefreshState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "PullToRefreshState", "CircularArrowProgressIndicator", NotificationCompat.CATEGORY_PROGRESS, "Landroidx/compose/material3/internal/FloatProducer;", "color", "Landroidx/compose/ui/graphics/Color;", "CircularArrowProgressIndicator-RPmYEkk", "(Landroidx/compose/material3/internal/FloatProducer;JLandroidx/compose/runtime/Composer;I)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "alpha", "", "values", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", "arcBounds", "Landroidx/compose/ui/geometry/Rect;", "strokeWidth", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "ArrowValues", "drawArrow", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "MaxProgressArc", "StrokeWidth", "F", "ArcRadius", "SpinnerSize", "getSpinnerSize", "()F", "SpinnerContainerSize", "getSpinnerContainerSize", "ArrowWidth", "ArrowHeight", "LoaderIndicatorHeight", "getLoaderIndicatorHeight", "LoaderIndicatorWidth", "getLoaderIndicatorWidth", "MinAlpha", "MaxAlpha", "DragMultiplier", "material3", "targetAlpha"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class PullToRefreshKt {
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = Dp.m9732constructorimpl((float) 2.5d);
    private static final float ArcRadius = Dp.m9732constructorimpl((float) 5.5d);
    private static final float SpinnerSize = Dp.m9732constructorimpl(16);
    private static final float SpinnerContainerSize = Dp.m9732constructorimpl(40);
    private static final float ArrowWidth = Dp.m9732constructorimpl(10);
    private static final float ArrowHeight = Dp.m9732constructorimpl(5);
    private static final float LoaderIndicatorHeight = LoadingIndicatorDefaults.INSTANCE.m3493getContainerHeightD9Ej5fM();
    private static final float LoaderIndicatorWidth = LoadingIndicatorDefaults.INSTANCE.m3494getContainerWidthD9Ej5fM();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularArrowProgressIndicator_RPmYEkk$lambda$5(FloatProducer floatProducer, long j, int i, Composer composer, int i2) {
        m4925CircularArrowProgressIndicatorRPmYEkk(floatProducer, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PullToRefreshBox$lambda$1(boolean z, Function0 function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        PullToRefreshBox(z, function0, modifier, pullToRefreshState, alignment, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PullToRefreshBox_gMrHQkA$lambda$2(boolean z, Function0 function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3 function3, boolean z2, float f, Function3 function32, int i, int i2, Composer composer, int i3) {
        m4926PullToRefreshBoxgMrHQkA(z, function0, modifier, pullToRefreshState, alignment, function3, z2, f, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PullToRefreshBox_gMrHQkA$lambda$0(PullToRefreshState pullToRefreshState, boolean z, BoxScope boxScope, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C140@6561L148:PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(419143791, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:140)");
            }
            PullToRefreshDefaults.INSTANCE.m4915Indicator2poqoh4(pullToRefreshState, z, boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, 0.0f, composer, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d1  */
    /* renamed from: PullToRefreshBox-gMrHQkA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4926PullToRefreshBoxgMrHQkA(final boolean z, final Function0<Unit> function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, boolean z2, float f, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PullToRefreshState pullToRefreshState2;
        int i4;
        Alignment alignment2;
        int i5;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33;
        int i6;
        int i7;
        int i8;
        final float f2;
        final PullToRefreshState pullToRefreshState3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        final PullToRefreshState pullToRefreshState4;
        boolean z4;
        float m4921getPositionalThresholdD9Ej5fM;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(492221845);
        ComposerKt.sourceInformation(startRestartGroup, "C(PullToRefreshBox)N(isRefreshing,onRefresh,modifier,state,contentAlignment,indicator,enabled,threshold:c#ui.unit.Dp,content)150@6863L313:PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    pullToRefreshState2 = pullToRefreshState;
                    if (startRestartGroup.changed(pullToRefreshState2)) {
                        i9 = 2048;
                        i3 |= i9;
                    }
                } else {
                    pullToRefreshState2 = pullToRefreshState;
                }
                i9 = 1024;
                i3 |= i9;
            } else {
                pullToRefreshState2 = pullToRefreshState;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                alignment2 = alignment;
                i3 |= startRestartGroup.changed(alignment2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function33 = function3;
                    i3 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function32) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "137@6418L28,139@6551L164");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                z4 = z2;
                                m4921getPositionalThresholdD9Ej5fM = f;
                                pullToRefreshState4 = pullToRefreshState2;
                            } else {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i2 & 8) != 0) {
                                    pullToRefreshState4 = rememberPullToRefreshState(startRestartGroup, 0);
                                    i3 &= -7169;
                                } else {
                                    pullToRefreshState4 = pullToRefreshState2;
                                }
                                if (i4 != 0) {
                                    alignment2 = Alignment.INSTANCE.getTopStart();
                                }
                                if (i5 != 0) {
                                    function33 = ComposableLambdaKt.rememberComposableLambda(419143791, true, new Function3() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            Unit PullToRefreshBox_gMrHQkA$lambda$0;
                                            PullToRefreshBox_gMrHQkA$lambda$0 = PullToRefreshKt.PullToRefreshBox_gMrHQkA$lambda$0(PullToRefreshState.this, z, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                            return PullToRefreshBox_gMrHQkA$lambda$0;
                                        }
                                    }, startRestartGroup, 54);
                                }
                                z4 = i6 == 0 ? z2 : true;
                                m4921getPositionalThresholdD9Ej5fM = i8 != 0 ? PullToRefreshDefaults.INSTANCE.m4921getPositionalThresholdD9Ej5fM() : f;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(492221845, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                            }
                            float f3 = m4921getPositionalThresholdD9Ej5fM;
                            PullToRefreshState pullToRefreshState5 = pullToRefreshState4;
                            boolean z5 = z4;
                            Modifier modifier3 = modifier2;
                            Modifier m4930pullToRefreshZ4HSEVQ = m4930pullToRefreshZ4HSEVQ(modifier3, z, pullToRefreshState5, z5, f3, function0);
                            modifier2 = modifier3;
                            pullToRefreshState3 = pullToRefreshState5;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment2, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m4930pullToRefreshZ4HSEVQ);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            int i11 = i3;
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
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1940699061, "C160@7141L9,161@7159L11:PullToRefresh.kt#djiw08");
                            function32.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(((i11 >> 21) & 112) | 6));
                            function33.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(((i11 >> 12) & 112) | 6));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f2 = f3;
                            z3 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            f2 = f;
                            pullToRefreshState3 = pullToRefreshState2;
                            z3 = z2;
                        }
                        final Modifier modifier4 = modifier2;
                        final Alignment alignment3 = alignment2;
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function34 = function33;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit PullToRefreshBox_gMrHQkA$lambda$2;
                                    PullToRefreshBox_gMrHQkA$lambda$2 = PullToRefreshKt.PullToRefreshBox_gMrHQkA$lambda$2(z, function0, modifier4, pullToRefreshState3, alignment3, function34, z3, f2, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return PullToRefreshBox_gMrHQkA$lambda$2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i & 100663296) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    final Modifier modifier42 = modifier2;
                    final Alignment alignment32 = alignment2;
                    final Function3 function342 = function33;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function33 = function3;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                final Modifier modifier422 = modifier2;
                final Alignment alignment322 = alignment2;
                final Function3 function3422 = function33;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            alignment2 = alignment;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function33 = function3;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            final Modifier modifier4222 = modifier2;
            final Alignment alignment3222 = alignment2;
            final Function3 function34222 = function33;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function33 = function3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        final Modifier modifier42222 = modifier2;
        final Alignment alignment32222 = alignment2;
        final Function3 function342222 = function33;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PullToRefreshBox$lambda$0(PullToRefreshState pullToRefreshState, boolean z, BoxScope boxScope, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C177@7616L148:PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028036671, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:177)");
            }
            PullToRefreshDefaults.INSTANCE.m4915Indicator2poqoh4(pullToRefreshState, z, boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, 0.0f, composer, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006c  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the PullToRefreshBox that takes enabled and threshold parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void PullToRefreshBox(final boolean z, final Function0 function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3 function3, final Function3 function32, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final PullToRefreshState pullToRefreshState2;
        int i4;
        Alignment alignment2;
        int i5;
        Function3 function33;
        Function3 function34;
        final Modifier modifier3;
        final PullToRefreshState pullToRefreshState3;
        final Alignment alignment3;
        final Function3 function35;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Modifier modifier4;
        Function3 rememberComposableLambda;
        PullToRefreshState pullToRefreshState4;
        Alignment alignment4;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-532332839);
        ComposerKt.sourceInformation(startRestartGroup, "C(PullToRefreshBox)N(isRefreshing,onRefresh,modifier,state,contentAlignment,indicator,content)185@7826L333:PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    pullToRefreshState2 = pullToRefreshState;
                    if (startRestartGroup.changed(pullToRefreshState2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    pullToRefreshState2 = pullToRefreshState;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                pullToRefreshState2 = pullToRefreshState;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                alignment2 = alignment;
                i3 |= startRestartGroup.changed(alignment2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function33 = function3;
                    i3 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        function34 = function32;
                        i3 |= startRestartGroup.changedInstance(function34) ? 1048576 : 524288;
                    } else {
                        function34 = function32;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "174@7473L28,176@7606L164");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i6 = i3;
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                pullToRefreshState2 = rememberPullToRefreshState(startRestartGroup, 0);
                            }
                            if (i4 != 0) {
                                alignment2 = Alignment.INSTANCE.getTopStart();
                            }
                            if (i5 != 0) {
                                rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1028036671, true, new Function3() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit PullToRefreshBox$lambda$0;
                                        PullToRefreshBox$lambda$0 = PullToRefreshKt.PullToRefreshBox$lambda$0(PullToRefreshState.this, z, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        return PullToRefreshBox$lambda$0;
                                    }
                                }, startRestartGroup, 54);
                                i6 = i3;
                                modifier4 = companion;
                                pullToRefreshState4 = pullToRefreshState2;
                                alignment4 = alignment2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-532332839, i6, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:184)");
                                }
                                m4926PullToRefreshBoxgMrHQkA(z, function0, modifier4, pullToRefreshState4, alignment4, rememberComposableLambda, true, PullToRefreshDefaults.INSTANCE.m4921getPositionalThresholdD9Ej5fM(), function34, startRestartGroup, (i6 & 14) | 14155776 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i6 << 6) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function35 = rememberComposableLambda;
                                alignment3 = alignment4;
                                pullToRefreshState3 = pullToRefreshState4;
                                modifier3 = modifier4;
                            } else {
                                i6 = i3;
                                modifier4 = companion;
                            }
                        }
                        pullToRefreshState4 = pullToRefreshState2;
                        alignment4 = alignment2;
                        rememberComposableLambda = function33;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m4926PullToRefreshBoxgMrHQkA(z, function0, modifier4, pullToRefreshState4, alignment4, rememberComposableLambda, true, PullToRefreshDefaults.INSTANCE.m4921getPositionalThresholdD9Ej5fM(), function34, startRestartGroup, (i6 & 14) | 14155776 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i6 << 6) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function35 = rememberComposableLambda;
                        alignment3 = alignment4;
                        pullToRefreshState3 = pullToRefreshState4;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        pullToRefreshState3 = pullToRefreshState2;
                        alignment3 = alignment2;
                        function35 = function33;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit PullToRefreshBox$lambda$1;
                                PullToRefreshBox$lambda$1 = PullToRefreshKt.PullToRefreshBox$lambda$1(z, function0, modifier3, pullToRefreshState3, alignment3, function35, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return PullToRefreshBox$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function33 = function3;
                if ((1572864 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function33 = function3;
            if ((1572864 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function33 = function3;
        if ((1572864 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4931pullToRefreshZ4HSEVQ$default(Modifier modifier, boolean z, PullToRefreshState pullToRefreshState, boolean z2, float f, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 8) != 0) {
            f = PullToRefreshDefaults.INSTANCE.m4921getPositionalThresholdD9Ej5fM();
        }
        return m4930pullToRefreshZ4HSEVQ(modifier, z, pullToRefreshState, z3, f, function0);
    }

    /* renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m4930pullToRefreshZ4HSEVQ(Modifier modifier, boolean z, PullToRefreshState pullToRefreshState, boolean z2, float f, Function0<Unit> function0) {
        return modifier.then(new PullToRefreshElement(z, function0, z2, pullToRefreshState, f, null));
    }

    public static final PullToRefreshState rememberPullToRefreshState(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 318623070, "C(rememberPullToRefreshState)732@28863L28,732@28808L83:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, i, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:731)");
        }
        Object[] objArr = new Object[0];
        Saver<PullToRefreshStateImpl, Float> saver = PullToRefreshStateImpl.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, 1254096154, "CC(remember):PullToRefresh.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    PullToRefreshStateImpl rememberPullToRefreshState$lambda$0$0;
                    rememberPullToRefreshState$lambda$0$0 = PullToRefreshKt.rememberPullToRefreshState$lambda$0$0();
                    return rememberPullToRefreshState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) saver, (Function0) rememberedValue, composer, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return pullToRefreshStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PullToRefreshStateImpl rememberPullToRefreshState$lambda$0$0() {
        return new PullToRefreshStateImpl();
    }

    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m4925CircularArrowProgressIndicatorRPmYEkk(final FloatProducer floatProducer, final long j, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1353562852);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularArrowProgressIndicator)N(progress,color:c#ui.graphics.Color)778@30208L61,780@30370L76,785@30673L7,783@30548L143,790@30766L175,796@30983L443,788@30697L729:PullToRefresh.kt#djiw08");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(floatProducer) : startRestartGroup.changedInstance(floatProducer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1353562852, i2, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:777)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 601192889, "CC(remember):PullToRefresh.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            Object obj = rememberedValue;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo6655setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m7094getEvenOddRgk1Os());
                startRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 601198088, "CC(remember):PullToRefresh.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float CircularArrowProgressIndicator_RPmYEkk$lambda$1$0;
                        CircularArrowProgressIndicator_RPmYEkk$lambda$1$0 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$1$0(FloatProducer.this);
                        return Float.valueOf(CircularArrowProgressIndicator_RPmYEkk$lambda$1$0);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$2((State) rememberedValue2), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 601210859, "CC(remember):PullToRefresh.kt#9igjgp");
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(floatProducer));
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit CircularArrowProgressIndicator_RPmYEkk$lambda$3$0;
                        CircularArrowProgressIndicator_RPmYEkk$lambda$3$0 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$3$0(FloatProducer.this, (SemanticsPropertyReceiver) obj2);
                        return CircularArrowProgressIndicator_RPmYEkk$lambda$3$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m1271size3ABfNKs = SizeKt.m1271size3ABfNKs(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue3), SpinnerSize);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 601218071, "CC(remember):PullToRefresh.kt#9igjgp");
            boolean changed = startRestartGroup.changed(animateFloatAsState) | (i3 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(floatProducer))) | ((i2 & 112) == 32) | startRestartGroup.changedInstance(path);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit CircularArrowProgressIndicator_RPmYEkk$lambda$4$0;
                        CircularArrowProgressIndicator_RPmYEkk$lambda$4$0 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$4$0(FloatProducer.this, animateFloatAsState, j, path, (DrawScope) obj2);
                        return CircularArrowProgressIndicator_RPmYEkk$lambda$4$0;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue4 = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(m1271size3ABfNKs, (Function1) rememberedValue4, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit CircularArrowProgressIndicator_RPmYEkk$lambda$5;
                    CircularArrowProgressIndicator_RPmYEkk$lambda$5 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$5(FloatProducer.this, j, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return CircularArrowProgressIndicator_RPmYEkk$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularArrowProgressIndicator_RPmYEkk$lambda$1$0(FloatProducer floatProducer) {
        if (floatProducer.invoke() >= 1.0f) {
            return 1.0f;
        }
        return MinAlpha;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularArrowProgressIndicator_RPmYEkk$lambda$3$0(FloatProducer floatProducer, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (floatProducer.invoke() > 0.0f) {
            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(floatProducer.invoke(), RangesKt.rangeTo(0.0f, 1.0f), 0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularArrowProgressIndicator_RPmYEkk$lambda$4$0(FloatProducer floatProducer, State state, long j, Path path, DrawScope drawScope) {
        ArrowValues ArrowValues = ArrowValues(floatProducer.invoke());
        float floatValue = ((Number) state.getValue()).floatValue();
        float rotation = ArrowValues.getRotation();
        long mo7293getCenterF1C5BW0 = drawScope.mo7293getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo7307rotateUv8p0NA(rotation, mo7293getCenterF1C5BW0);
            float f = drawScope.mo528toPx0680j_4(ArcRadius);
            float f2 = StrokeWidth;
            Rect m6558Rect3MmeM6k = RectKt.m6558Rect3MmeM6k(androidx.compose.ui.geometry.SizeKt.m6598getCenteruvyYCjk(drawScope.mo7294getSizeNHjbRc()), f + (drawScope.mo528toPx0680j_4(f2) / 2.0f));
            m4929drawCircularIndicatorKzyDr3Q(drawScope, j, floatValue, ArrowValues, m6558Rect3MmeM6k, f2);
            m4928drawArrowuDrxG_w(drawScope, path, m6558Rect3MmeM6k, j, floatValue, ArrowValues, f2);
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            throw th;
        }
    }

    /* renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    private static final void m4929drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j, float f, ArrowValues arrowValues, Rect rect, float f2) {
        DrawScope.CC.m7364drawArcyD3GUKo$default(drawScope, j, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m6554getTopLeftF1C5BW0(), rect.m6552getSizeNHjbRc(), f, new Stroke(drawScope.mo528toPx0680j_4(f2), 0.0f, StrokeCap.INSTANCE.m7172getButtKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
    }

    private static final ArrowValues ArrowValues(float f) {
        float max = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5) / 3;
        float coerceIn = RangesKt.coerceIn(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (coerceIn - (((float) Math.pow(coerceIn, 2)) / 4))) * 0.5f;
        float f2 = 360;
        return new ArrowValues(pow, pow * f2, ((0.8f * max) + pow) * f2, Math.min(1.0f, max));
    }

    /* renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    private static final void m4928drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j, float f, ArrowValues arrowValues, float f2) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f3 = ArrowWidth;
        path.lineTo((drawScope.mo528toPx0680j_4(f3) * arrowValues.getScale()) / 2, drawScope.mo528toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo528toPx0680j_4(f3) * arrowValues.getScale(), 0.0f);
        float min = ((Math.min(rect.getRight() - rect.getLeft(), rect.getBottom() - rect.getTop()) / 2.0f) + Float.intBitsToFloat((int) (rect.m6549getCenterF1C5BW0() >> 32))) - ((drawScope.mo528toPx0680j_4(f3) * arrowValues.getScale()) / 2.0f);
        float intBitsToFloat = Float.intBitsToFloat((int) (rect.m6549getCenterF1C5BW0() & 4294967295L)) - drawScope.mo528toPx0680j_4(f2);
        path.mo6657translatek4lQ0M(Offset.m6511constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(min) << 32)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo528toPx0680j_4(f2);
        long mo7293getCenterF1C5BW0 = drawScope.mo7293getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo7307rotateUv8p0NA(endAngle, mo7293getCenterF1C5BW0);
            DrawScope.CC.m7375drawPathLG529CI$default(drawScope, path, j, f, new Stroke(drawScope.mo528toPx0680j_4(f2), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
        }
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    public static final float getLoaderIndicatorHeight() {
        return LoaderIndicatorHeight;
    }

    public static final float getLoaderIndicatorWidth() {
        return LoaderIndicatorWidth;
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}
