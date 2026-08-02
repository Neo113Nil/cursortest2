package com.squareup.cash.bitcoin.views.performance.details;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$$ExternalSyntheticLambda5;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinPerformanceDetailsContentKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ BitcoinPerformanceDetailsContentKt$$ExternalSyntheticLambda2(BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection bitcoinPerformanceDetailsSection, long j, Function1 function1, long j2) {
        this.f$0 = bitcoinPerformanceDetailsSection;
        this.f$2 = j;
        this.f$1 = function1;
        this.f$3 = j2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    BitcoinPerformanceDetailsContentKt.m3419BitcoinPerformanceDetailsSectiont6yy7ic(this.f$0, this.f$1, this.f$2, this.f$3, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    gapComposer2.startReplaceGroup(-58601495);
                    Iterator it = this.f$0.items.iterator();
                    while (true) {
                        Function0 function0 = null;
                        if (it.hasNext()) {
                            BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem bitcoinPerformanceDetailsSectionItem = (BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem) it.next();
                            long j = this.f$2;
                            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(920585527, new PoolListSectionKt$$ExternalSyntheticLambda8(bitcoinPerformanceDetailsSectionItem, j, 3), gapComposer2), 0);
                            BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem = bitcoinPerformanceDetailsSectionItem.infoItem;
                            if (bitcoinPerformanceDetailsSectionInfoItem == null) {
                                gapComposer2.startReplaceGroup(653187236);
                            } else {
                                gapComposer2.startReplaceGroup(653187237);
                                Function1 function1 = this.f$1;
                                boolean changed = gapComposer2.changed(function1) | gapComposer2.changed(bitcoinPerformanceDetailsSectionInfoItem);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(6, function1, bitcoinPerformanceDetailsSectionInfoItem);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                function0 = (Function0) rememberedValue;
                            }
                            gapComposer2.end(false);
                            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(287644046, new ConsentLogoHeaderKt$$ExternalSyntheticLambda5(bitcoinPerformanceDetailsSectionItem, j, this.f$3), gapComposer2), null, function0, false, false, null, null, 0L, label, null, gapComposer2, 6, 1530);
                        } else {
                            gapComposer2.end(false);
                            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer2, null);
                        }
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinPerformanceDetailsContentKt$$ExternalSyntheticLambda2(BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection bitcoinPerformanceDetailsSection, Function1 function1, long j, long j2) {
        this.f$0 = bitcoinPerformanceDetailsSection;
        this.f$1 = function1;
        this.f$2 = j;
        this.f$3 = j2;
    }
}
