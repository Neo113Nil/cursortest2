package androidx.compose.foundation.pager;

import androidx.camera.video.Recorder;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.viewmodels.LoadingAnimationAssets;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.viewmodels.chat.ProcessingIndicator;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$5$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class PagerDefaults {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [kotlin.coroutines.Continuation] */
    public static final void ThinkingIndicator(Modifier modifier, ProcessingIndicator processingIndicator, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Throwable th;
        processingIndicator.getClass();
        String str = processingIndicator.text;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1645011505);
        int i2 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(processingIndicator) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(str);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(str);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(Long.valueOf(System.currentTimeMillis()));
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            boolean changedInstance = gapComposer2.changedInstance(processingIndicator);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            Continuation continuation = null;
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new GenieViewKt$GenieView$1$1(processingIndicator, mutableState2, continuation, 24);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer2, str, (Function2) rememberedValue4);
            String str2 = (String) mutableState2.getValue();
            String str3 = (String) mutableState.getValue();
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                ?? r18 = 0;
                Hero3DCardViewKt$InteractiveCard$5$1 hero3DCardViewKt$InteractiveCard$5$1 = new Hero3DCardViewKt$InteractiveCard$5$1(mutableState2, mutableState, mutableState3, r18, 1);
                gapComposer2.updateRememberedValue(hero3DCardViewKt$InteractiveCard$5$1);
                rememberedValue5 = hero3DCardViewKt$InteractiveCard$5$1;
                th = r18;
            } else {
                th = null;
            }
            Updater.LaunchedEffect(str2, str3, (Function2) rememberedValue5, gapComposer2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw th;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 32.0f);
            LoadingAnimationAssets loadingAnimationAssets = processingIndicator.assetGroup;
            boolean z = (i2 & 896) == 256;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (z || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new UtilsKt$$ExternalSyntheticLambda0(23, function1);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            ModalKt.ProgressBranded(m285size3ABfNKs, loadingAnimationAssets, (Function1) rememberedValue6, gapComposer2, 6, 0);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 8.0f, gapComposer2);
            PagerKt.m329ThinkingTexthGBTI10((String) mutableState.getValue(), new VerticalAlignElement(Alignment.Companion.CenterVertically), null, RecyclerView.DECELERATION_RATE, 0, gapComposer2, 0);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5(i, 24, modifier, processingIndicator, function1);
        }
    }

    public static SnapFlingBehavior flingBehavior(PagerState pagerState, PagerSnapDistanceMaxPages pagerSnapDistanceMaxPages, SpringSpec springSpec, Composer composer, int i, int i2) {
        boolean z = true;
        if ((i2 & 2) != 0) {
            pagerSnapDistanceMaxPages = new PagerSnapDistanceMaxPages(1);
        }
        DecayAnimationSpecImpl rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer);
        if ((i2 & 8) != 0) {
            Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
            springSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, Float.valueOf(1.0f), 1);
        }
        GapComposer gapComposer = (GapComposer) composer;
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
        int i3 = 0;
        boolean changed = ((((i & 14) ^ 6) > 4 && gapComposer.changed(pagerState)) || (i & 6) == 4) | gapComposer.changed(rememberSplineBasedDecay) | gapComposer.changed(springSpec);
        if ((((i & 112) ^ 48) <= 32 || !gapComposer.changed(pagerSnapDistanceMaxPages)) && (i & 48) != 32) {
            z = false;
        }
        boolean changed2 = changed | z | gapComposer.changed(density) | gapComposer.changed(layoutDirection.ordinal());
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed2 || rememberedValue == Composer.Companion.Empty) {
            SnapFlingBehavior snapFlingBehavior = new SnapFlingBehavior(new Recorder.AnonymousClass3(14, pagerState, new PagerDefaults$$ExternalSyntheticLambda0(i3, pagerState, layoutDirection), pagerSnapDistanceMaxPages), rememberSplineBasedDecay, springSpec);
            gapComposer.updateRememberedValue(snapFlingBehavior);
            rememberedValue = snapFlingBehavior;
        }
        return (SnapFlingBehavior) rememberedValue;
    }

    public static DefaultPagerNestedScrollConnection pageNestedScrollConnection(PagerState pagerState, Orientation orientation, Composer composer, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((GapComposer) composer).changed(pagerState)) || (i & 6) == 4;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DefaultPagerNestedScrollConnection(pagerState, orientation);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (DefaultPagerNestedScrollConnection) rememberedValue;
    }

    public abstract boolean getUseWarningTextColor();
}
