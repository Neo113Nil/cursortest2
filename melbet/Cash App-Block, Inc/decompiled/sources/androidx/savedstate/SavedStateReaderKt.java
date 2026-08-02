package androidx.savedstate;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import com.squareup.cash.upsell.views.NullStateSwipeView$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class SavedStateReaderKt {
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void NullStateSwipeContent(NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content, Function1 function1, Composer composer, int i) {
        Object cardAppletWorker$setup$1$2$1;
        ?? r4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-702245467);
        int i2 = (gapComposer.changedInstance(nullStateViewModel$SwipeViewModel$Content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(nullStateViewModel$SwipeViewModel$Content);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PageTagSlotKt$$ExternalSyntheticLambda0(nullStateViewModel$SwipeViewModel$Content, 10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(0, (Function0) rememberedValue, gapComposer, 0, 3);
            int i3 = i2 & 112;
            boolean changed = (i3 == 32) | gapComposer.changed(rememberPagerState) | gapComposer.changedInstance(nullStateViewModel$SwipeViewModel$Content);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                r4 = 0;
                cardAppletWorker$setup$1$2$1 = new CardAppletWorker$setup$1$2$1(rememberPagerState, function1, nullStateViewModel$SwipeViewModel$Content, null, 1);
                gapComposer.updateRememberedValue(cardAppletWorker$setup$1$2$1);
            } else {
                cardAppletWorker$setup$1$2$1 = rememberedValue2;
                r4 = 0;
            }
            Updater.LaunchedEffect(gapComposer, rememberPagerState, (Function2) cardAppletWorker$setup$1$2$1);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw r4;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z = false;
            PagerKt.m328HorizontalPager8jOkeI(rememberPagerState, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), null, null, 0, RecyclerView.DECELERATION_RATE, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-231792498, new ScoreUiFactory$$ExternalSyntheticLambda0(nullStateViewModel$SwipeViewModel$Content, 21), gapComposer), gapComposer, 0, 24576, 16380);
            gapComposer = gapComposer;
            SavedStateWriterKt.PagerIndicator(nullStateViewModel$SwipeViewModel$Content.pages.size(), ((ParcelableSnapshotMutableIntState) rememberPagerState.scrollPosition.elementTypes).getIntValue(), 0, gapComposer, r4);
            UiGroupElementViewModel.ButtonStyle buttonStyle = UiGroupElementViewModel.ButtonStyle.PRIMARY;
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
            if (i3 == 32) {
                z = true;
            }
            boolean changedInstance2 = gapComposer.changedInstance(nullStateViewModel$SwipeViewModel$Content) | z | gapComposer.changed(rememberPagerState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BasicShieetScope$$ExternalSyntheticLambda10(28, function1, nullStateViewModel$SwipeViewModel$Content, rememberPagerState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, m299paddingVpY3zN4, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(765848554, new TaxReturnsViewKt$$ExternalSyntheticLambda5(nullStateViewModel$SwipeViewModel$Content, 29), gapComposer), gapComposer, 1572864, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NullStateSwipeView$$ExternalSyntheticLambda1(nullStateViewModel$SwipeViewModel$Content, function1, i);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBlockList.deepLinkSpecs;
    }

    public static final void keyOrValueNotFoundError(String str) {
        str.getClass();
        throw new IllegalArgumentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
