package com.squareup.cash.pools.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.molecule.PlatformKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.MyInvestmentsTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.paychecks.viewmodels.ActiveDistributionSectionBodyViewModel;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewModel;
import com.squareup.cash.pools.viewmodels.PoolRow;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolListSectionKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ PoolListSectionKt$$ExternalSyntheticLambda8(long j, PullRefreshState pullRefreshState) {
        this.$r8$classId = 1;
        this.f$1 = j;
        this.f$0 = pullRefreshState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GapComposer gapComposer;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        long j = this.f$1;
        int i2 = 0;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                PoolRow poolRow = (PoolRow) obj4;
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                realCellActivityAccessoryScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(realCellActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    String str = poolRow.rowEndLabel;
                    gapComposer2.startReplaceGroup(-1674459694);
                    realCellActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(-1274567222, new PoolListSectionKt$$ExternalSyntheticLambda17(str, j, 0), gapComposer2));
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PullRefreshState pullRefreshState = (PullRefreshState) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(booleanValue) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer3);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer3, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    float f = PullRefreshIndicatorKt.ArcRadius;
                    float f2 = PullRefreshIndicatorKt.StrokeWidth;
                    float f3 = (f + f2) * 2.0f;
                    long j2 = this.f$1;
                    if (booleanValue) {
                        gapComposer3.startReplaceGroup(-1916589279);
                        ProgressIndicatorKt.m496CircularProgressIndicatorLxG7B9w(SizeKt.m285size3ABfNKs(companion, f3), j2, f2, 0L, 0, gapComposer3, 390, 24);
                        gapComposer = gapComposer3;
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer3;
                        gapComposer.startReplaceGroup(-1916362142);
                        PullRefreshIndicatorKt.m510CircularArrowIndicatoriJQMabo(pullRefreshState, j2, SizeKt.m285size3ABfNKs(companion, f3), gapComposer, MLKEMEngine.KyberPolyBytes);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel = (LocalCheckoutOrderSummaryViewModel) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                boolean z = (intValue3 & 17) != 16;
                int i3 = intValue3 & 1;
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(i3, z)) {
                    CheckoutTipSectionKt.m1301CheckoutOrderSummaryContentiJQMabo(localCheckoutOrderSummaryViewModel, this.f$1, gapComposer4, 0, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem bitcoinPerformanceDetailsSectionItem = (BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinPerformanceDetailsSectionItem.value, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                MyInvestmentsContentModel myInvestmentsContentModel = (MyInvestmentsContentModel) obj4;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    for (Object obj5 : myInvestmentsContentModel.getInvestmentStats()) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        MyInvestmentsContentModel.StatRow statRow = (MyInvestmentsContentModel.StatRow) obj5;
                        listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(814312828, new MyInvestmentsTileKt$$ExternalSyntheticLambda3(statRow, j), gapComposer6), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1906236135, new MyInvestmentsTileKt$$ExternalSyntheticLambda3(j, statRow), gapComposer6), (Function2) null, gapComposer6, ((intValue5 << 15) & 458752) | 3078, 22);
                        i2 = i4;
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ActiveDistributionSectionBodyViewModel.Allocation allocation = (ActiveDistributionSectionBodyViewModel.Allocation) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allocation.percentage, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                DestinationAllocationRowViewModel.Accessory accessory = (DestinationAllocationRowViewModel.Accessory) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accessory.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                MultipleAllocationViewModel.Active.AllocationRow allocationRow = (MultipleAllocationViewModel.Active.AllocationRow) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allocationRow.caption, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                String str2 = ((LitePaymentPadViewModel) obj4).errorMessage;
                if (str2 == null) {
                    str2 = "";
                }
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, this.f$1, composer9, fillMaxWidth, ((Typography) ((GapComposer) composer9).consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 9:
                ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel = (ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, String.valueOf(profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel.numBlockedAccounts), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Modifier modifier = (Modifier) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(modifier, 6.0f);
                    boolean changed = gapComposer11.changed(j);
                    Object rememberedValue = gapComposer11.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new c7$$ExternalSyntheticLambda6(j, 25);
                        gapComposer11.updateRememberedValue(rememberedValue);
                    }
                    CanvasKt.Canvas(6, gapComposer11, m298padding3ABfNKs, (Function1) rememberedValue);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PoolListSectionKt$$ExternalSyntheticLambda8(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }
}
