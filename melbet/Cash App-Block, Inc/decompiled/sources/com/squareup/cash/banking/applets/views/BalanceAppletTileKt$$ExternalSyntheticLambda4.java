package com.squareup.cash.banking.applets.views;

import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceAppletTileKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NetworkFetcher$fetch$2 f$0;

    public /* synthetic */ BalanceAppletTileKt$$ExternalSyntheticLambda4(NetworkFetcher$fetch$2 networkFetcher$fetch$2, int i) {
        this.$r8$classId = i;
        this.f$0 = networkFetcher$fetch$2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        BalanceAppletTileViewEvent.BalanceAppletOnClickTile balanceAppletOnClickTile = BalanceAppletTileViewEvent.BalanceAppletOnClickTile.INSTANCE;
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = this.f$0;
        switch (i) {
            case 0:
                networkFetcher$fetch$2.invoke(balanceAppletOnClickTile);
                break;
            case 1:
                networkFetcher$fetch$2.invoke(BalanceAppletTileViewEvent.BalanceAppletOnClickAddCash.INSTANCE);
                break;
            case 2:
                networkFetcher$fetch$2.invoke(balanceAppletOnClickTile);
                break;
            default:
                networkFetcher$fetch$2.invoke(balanceAppletOnClickTile);
                break;
        }
        return Boolean.TRUE;
    }
}
