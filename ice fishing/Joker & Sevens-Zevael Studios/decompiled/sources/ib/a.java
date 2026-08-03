package ib;

import com.onesignal.common.modeling.i;
import com.onesignal.core.internal.config.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb.f;
import kb.h;
import ob.d;
import ob.e;
import pc.j;
import z8.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements hb.a {
    private final b _configModelStore;
    private final jb.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final e _subscriptionsModelStore;

    public a(jb.b bVar, com.onesignal.user.internal.properties.b bVar2, e eVar, b bVar3) {
        j.e(bVar, "_identityModelStore");
        j.e(bVar2, "_propertiesModelStore");
        j.e(eVar, "_subscriptionsModelStore");
        j.e(bVar3, "_configModelStore");
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
    }

    @Override // hb.a
    public List<g> getRebuildOperationsIfCurrentUser(String str, String str2) {
        j.e(str, "appId");
        j.e(str2, "onesignalId");
        jb.a aVar = new jb.a();
        Object obj = null;
        aVar.initializeFromModel(null, this._identityModelStore.getModel());
        new com.onesignal.user.internal.properties.a().initializeFromModel(null, this._propertiesModelStore.getModel());
        ArrayList arrayList = new ArrayList();
        Iterator<i> it = this._subscriptionsModelStore.list().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            d dVar2 = new d();
            dVar2.initializeFromModel(null, dVar);
            arrayList.add(dVar2);
        }
        if (!j.a(aVar.getOnesignalId(), str2)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(str, str2, aVar.getExternalId(), null, 8, null));
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i10);
            i10++;
            if (j.a(((d) obj2).getId(), ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getPushSubscriptionId())) {
                obj = obj2;
                break;
            }
        }
        d dVar3 = (d) obj;
        if (dVar3 != null) {
            arrayList2.add(new kb.a(str, str2, dVar3.getId(), dVar3.getType(), dVar3.getOptedIn(), dVar3.getAddress(), dVar3.getStatus()));
        }
        arrayList2.add(new h(str, str2));
        return arrayList2;
    }
}
