package com.squareup.cash.investing.components.holding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.investing.viewmodels.holdings.Holding;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.guava.ListenableFutureKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingEtfHoldingDetailsKt$$ExternalSyntheticLambda6 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingEtfHoldingDetailsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InvestingEtfHoldingDetailsKt$$ExternalSyntheticLambda6(InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = investingEtfHoldingDetailsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), ImageKt.rememberScrollState(composer), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, verticalScroll$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                InvestingEtfHoldingDetailsKt.TimestampColumn(((InvestingEtfHoldingDetailsViewModel.Content) investingEtfHoldingDetailsViewModel).lastUpdated, Expect_jvmKt.rememberComposableLambda(599196467, new InvestingEtfHoldingDetailsKt$$ExternalSyntheticLambda6(investingEtfHoldingDetailsViewModel, function1, i2), composer), composer, 390);
                gapComposer2.end(true);
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    for (Holding holding : ((InvestingEtfHoldingDetailsViewModel.Content) investingEtfHoldingDetailsViewModel).holdings) {
                        String str = holding.token;
                        if (str == null) {
                            gapComposer3.startReplaceGroup(-973053907);
                            gapComposer3.end(false);
                            function0 = null;
                        } else {
                            gapComposer3.startReplaceGroup(-973053906);
                            boolean changed = gapComposer3.changed(function1) | gapComposer3.changed(str);
                            Object rememberedValue = gapComposer3.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 12);
                                gapComposer3.updateRememberedValue(rememberedValue);
                            }
                            function0 = (Function0) rememberedValue;
                            gapComposer3.end(false);
                        }
                        ListenableFutureKt.HoldingRow(holding, function0, gapComposer3, 0);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
