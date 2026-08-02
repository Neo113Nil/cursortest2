package com.squareup.cash.investing.components.autoinvest;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class InvestingAutoInvestKt {
    public static final ComposableLambdaImpl lambda$1159364636 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(13), false, 1159364636);

    public static final void InvestingAutoInvest(InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-707172736);
        int i2 = 2;
        int i3 = (gapComposer.changed(investingCryptoRecurringPurchaseTileViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
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
            ViewfinderDefaults.SectionHeader(investingCryptoRecurringPurchaseTileViewModel.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            InvestingCryptoRecurringPurchaseTileViewModel.Item item = (InvestingCryptoRecurringPurchaseTileViewModel.Item) CollectionsKt.first(investingCryptoRecurringPurchaseTileViewModel.items);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(191403707, new InvestingAutoInvestKt$$ExternalSyntheticLambda0(item, i4), gapComposer);
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(item);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InvestingAutoInvestKt$$ExternalSyntheticLambda1(function1, item, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1321394571, new InvestingAutoInvestKt$$ExternalSyntheticLambda0(item, i2), gapComposer);
            gapComposer = gapComposer;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1159364636, rememberComposableLambda, null, (Function0) rememberedValue, false, false, rememberComposableLambda2, null, null, 0L, gapComposer, 12582966, 3956);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SkipPaymentView$$ExternalSyntheticLambda1(investingCryptoRecurringPurchaseTileViewModel, function1, i, 17);
        }
    }
}
