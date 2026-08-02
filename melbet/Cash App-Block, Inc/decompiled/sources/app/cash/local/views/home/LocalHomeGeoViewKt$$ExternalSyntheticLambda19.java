package app.cash.local.views.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import app.cash.local.views.map.BrandCollectionMapViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawalMapViewArcadeKt;
import com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt;
import com.squareup.cash.maps.views.CashCluster;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$$ExternalSyntheticLambda19 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CashCluster f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda19(CashCluster cashCluster, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = cashCluster;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                LocalHomeGeoViewKt.LocalHomeGeoCluster(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 1:
                BrandCollectionMapViewKt.BrandLocationCluster(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 2:
                BitcoinMapViewKt.BitcoinLocationCluster(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 3:
                AtmWithdrawalMapViewArcadeKt.AtmClusterArcade(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            default:
                PaperMoneyDepositMapViewKt.PaperDepositCluster(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
