package app.cash.local.navigation;

import androidx.room.util.DBUtil;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1;

/* loaded from: classes3.dex */
public interface LocalInstalledStore {
    /* renamed from: selectFulfillmentConfiguration-NmdeRlM$default, reason: not valid java name */
    static RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1 m1209selectFulfillmentConfigurationNmdeRlM$default(LocalInstalledStore localInstalledStore, String str) {
        RealLocalInstalledStore realLocalInstalledStore = (RealLocalInstalledStore) localInstalledStore;
        realLocalInstalledStore.getClass();
        str.getClass();
        return new RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(realLocalInstalledStore.fulfillmentConfigurationQueries.select(str)), realLocalInstalledStore.ioDispatcher), realLocalInstalledStore, 0);
    }
}
