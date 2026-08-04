package com.gamericefishpro.space.yg;

import com.gamericefishpro.space.bd.g;
import com.gamericefishpro.space.dh.f;
import com.gamericefishpro.space.dh.h;
import com.gamericefishpro.space.fc.i;
import com.gamericefishpro.space.jh.d;
import com.gamericefishpro.space.jh.e;
import com.gamericefishpro.space.rc.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.xg.a {
    private final b _configModelStore;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
    private final e _subscriptionsModelStore;

    public a(com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.hh.b _propertiesModelStore, e _subscriptionsModelStore, b _configModelStore) {
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // com.gamericefishpro.space.xg.a
    public List<g> getRebuildOperationsIfCurrentUser(String appId, String onesignalId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        com.gamericefishpro.space.bh.a aVar = new com.gamericefishpro.space.bh.a();
        Object obj = null;
        aVar.initializeFromModel(null, this._identityModelStore.getModel());
        new com.gamericefishpro.space.hh.a().initializeFromModel(null, this._propertiesModelStore.getModel());
        ArrayList arrayList = new ArrayList();
        Iterator<i> it = this._subscriptionsModelStore.list().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            d dVar2 = new d();
            dVar2.initializeFromModel(null, dVar);
            arrayList.add(dVar2);
        }
        if (!Intrinsics.a(aVar.getOnesignalId(), onesignalId)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(appId, onesignalId, aVar.getExternalId(), null, 8, null));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (Intrinsics.a(((d) obj2).getId(), ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getPushSubscriptionId())) {
                obj = obj2;
                break;
            }
        }
        d dVar3 = (d) obj;
        if (dVar3 != null) {
            arrayList2.add(new com.gamericefishpro.space.dh.a(appId, onesignalId, dVar3.getId(), dVar3.getType(), dVar3.getOptedIn(), dVar3.getAddress(), dVar3.getStatus()));
        }
        arrayList2.add(new h(appId, onesignalId));
        return arrayList2;
    }
}
