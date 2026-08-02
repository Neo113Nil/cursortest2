package ru.yandex.taxi.logistics.ndd_map.layers;

import com.yandex.go.layers.api.model.Action;
import com.yandex.go.layers.domain.g;
import defpackage.ddi;
import defpackage.evu0;
import defpackage.lm00;
import defpackage.m35;
import defpackage.nm00;
import defpackage.rol0;
import defpackage.rp60;
import defpackage.s5u;
import defpackage.sm00;
import defpackage.tcc;
import defpackage.tls;
import defpackage.txx;
import defpackage.uc4;
import defpackage.uxx;
import defpackage.wp31;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes5.dex */
public final class a extends m35 implements s5u, txx {
    public final rp60 b;
    public final ddi c;
    public final g d;

    public a(rp60 rp60Var, ddi ddiVar, g gVar, uxx uxxVar) {
        super(uxxVar);
        this.b = rp60Var;
        this.c = ddiVar;
        this.d = gVar;
    }

    @Override // defpackage.s5u
    public final String a(String str) {
        if (this.b.a() == null) {
            return str;
        }
        return null;
    }

    public final rol0 b(tls tlsVar, nm00 nm00Var, nm00 nm00Var2) {
        return new rol0(new DeliveryNddLayersClientDelegate$handleFinalizeAction$1(nm00Var, nm00Var2, tlsVar, null));
    }

    public final void c(Map map, uc4 uc4Var) {
        boolean z;
        Object value;
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!evu0.J(((lm00) obj).a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((lm00) it.next()).b);
        }
        HashSet H0 = kotlin.collections.a.H0(arrayList2);
        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MapObjectType mapObjectType = ((lm00) it2.next()).c;
                if (mapObjectType == MapObjectType.CITY || mapObjectType == MapObjectType.CITY_GROUP) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        r0 r0Var = this.c.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, new ddi.a(H0, uc4Var, z)));
    }

    public final void d(lm00 lm00Var) {
        String str = lm00Var.a;
        zzs zzsVar = lm00Var.b;
        List list = lm00Var.e;
        Action action = Action.SERVER_SELECTION;
        wp31 wp31Var = lm00Var.d;
        String str2 = wp31Var.f;
        String str3 = wp31Var.g;
        sm00 sm00Var = lm00Var.h;
        this.d.c(new nm00(str, zzsVar, list, action, str2, str3, sm00Var.l, sm00Var.m));
    }
}
