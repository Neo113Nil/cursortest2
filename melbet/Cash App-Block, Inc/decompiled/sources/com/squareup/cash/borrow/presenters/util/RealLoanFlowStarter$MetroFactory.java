package com.squareup.cash.borrow.presenters.util;

import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.sup.api.v1.MerchantConfigService;
import com.squareup.protos.franklin.lending.LendingAppService;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RealLoanFlowStarter$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider blockersNavigator;
    public final DoubleCheck flowStarter;
    public final DoubleCheck lendingAppService;

    public /* synthetic */ RealLoanFlowStarter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Factory factory, int i) {
        this.$r8$classId = i;
        this.lendingAppService = doubleCheck;
        this.flowStarter = doubleCheck2;
        this.blockersNavigator = factory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Provider provider = this.blockersNavigator;
        DoubleCheck doubleCheck = this.flowStarter;
        DoubleCheck doubleCheck2 = this.lendingAppService;
        switch (i) {
            case 0:
                LendingAppService lendingAppService = (LendingAppService) doubleCheck2.getValue();
                FlowStarter flowStarter = (FlowStarter) doubleCheck.getValue();
                BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider.invoke();
                lendingAppService.getClass();
                flowStarter.getClass();
                blockersDataNavigator.getClass();
                return new n(28, lendingAppService, flowStarter, blockersDataNavigator);
            default:
                SyncValueReader syncValueReader = (SyncValueReader) doubleCheck2.getValue();
                MerchantConfigService merchantConfigService = (MerchantConfigService) doubleCheck.getValue();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                syncValueReader.getClass();
                merchantConfigService.getClass();
                factory.getClass();
                return new Lazy(syncValueReader, merchantConfigService, factory);
        }
    }
}
