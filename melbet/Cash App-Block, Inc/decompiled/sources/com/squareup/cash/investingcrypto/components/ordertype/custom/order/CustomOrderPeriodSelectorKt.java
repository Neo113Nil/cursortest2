package com.squareup.cash.investingcrypto.components.ordertype.custom.order;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public abstract class CustomOrderPeriodSelectorKt {

    /* renamed from: lambda$-791520395, reason: not valid java name */
    public static final ComposableLambdaImpl f455lambda$791520395 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(20), false, -791520395);

    public static final void CustomOrderPeriodSelector(final PeriodSelectionViewModel periodSelectionViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl recomposeScopeImpl;
        Function2 function2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1950327159);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(periodSelectionViewModel) : gapComposer.changedInstance(periodSelectionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (periodSelectionViewModel == null || (periodSelectionViewModel instanceof PeriodSelectionViewModel.InFlight)) {
                recomposeScopeImpl = gapComposer.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    function2 = new Function2() { // from class: com.squareup.cash.investingcrypto.components.ordertype.custom.order.CustomOrderPeriodSelectorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    CustomOrderPeriodSelectorKt.CustomOrderPeriodSelector(periodSelectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    CustomOrderPeriodSelectorKt.CustomOrderPeriodSelector(periodSelectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    recomposeScopeImpl.block = function2;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(836119362, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(11, (Object) periodSelectionViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            function2 = new Function2() { // from class: com.squareup.cash.investingcrypto.components.ordertype.custom.order.CustomOrderPeriodSelectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            CustomOrderPeriodSelectorKt.CustomOrderPeriodSelector(periodSelectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            CustomOrderPeriodSelectorKt.CustomOrderPeriodSelector(periodSelectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            recomposeScopeImpl.block = function2;
        }
    }

    public static final void Header(int i, Composer composer, Modifier modifier, String str, String str2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(484216274);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InvestmentHoldingQueries$$ExternalSyntheticLambda4(26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f));
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(str, str2, modifier, i, 4);
        }
    }

    public static final void PeriodSelection(AbstractPersistentList abstractPersistentList, String str, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2037618179);
        int i2 = i | (gapComposer.changedInstance(abstractPersistentList) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(abstractPersistentList) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(27, abstractPersistentList, str, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(modifier, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, (i2 >> 9) & 14, 510);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(abstractPersistentList, i, str, function1, modifier, 17);
        }
    }
}
