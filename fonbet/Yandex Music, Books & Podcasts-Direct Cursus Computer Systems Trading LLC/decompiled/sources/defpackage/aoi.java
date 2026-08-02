package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public final class aoi {
    public static aoi e;
    public final cus a;
    public final ss b;
    public final g51 c;
    public final h4b d;

    public aoi() {
        cus cusVar = new cus();
        ss ssVar = new ss();
        g51 g51Var = new g51();
        this.a = cusVar;
        this.b = ssVar;
        this.c = g51Var;
        this.d = new h4b((fnk) sk3.I(fnk.class));
    }

    public static synchronized aoi c() {
        aoi aoiVar;
        synchronized (aoi.class) {
            try {
                if (e == null) {
                    e = new aoi();
                }
                aoiVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aoiVar;
    }

    public final oq a(String str) {
        ss ssVar = this.b;
        ssVar.getClass();
        str.getClass();
        oq oqVar = (oq) x97.D(g.a, new l5(ssVar, str, null, 10));
        if (oqVar == null) {
            return null;
        }
        boolean z = oqVar.f() == mq.Desc;
        this.a.getClass();
        oqVar.k(cus.b(str, z));
        return oqVar;
    }

    public final ArrayList b(String str) {
        this.c.getClass();
        str.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str2 = ((frt) qdcVar.C(I)).c().a;
        str2.getClass();
        bdt I2 = hag.I(i5h.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        h2t S = ((MainDatabase) ((i5h) qdcVar2.C(I2)).c(str2)).S();
        S.getClass();
        String str3 = str;
        List list = (List) up6.F(S.a, true, false, new srp(str3, 11));
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str4 = ((i2t) obj).a.F;
            Object obj2 = linkedHashMap.get(str4);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str4, obj2);
            }
            ((List) obj2).add(obj);
        }
        Collection<List> values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(v75.o(values, 10));
        for (List list2 : values) {
            i2t i2tVar = (i2t) CollectionsKt.Q(list2);
            String str5 = i2tVar.c;
            List B = q7g.B(i2tVar.g);
            B.getClass();
            String str6 = i2tVar.e;
            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
            List c = t75.c(new zp2(str3, str5, null, null, null, B, men.x(str6, webPath$Storage), men.x(i2tVar.f, webPath$Storage), 28));
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(j66.u0(((i2t) it.next()).a, c, null, null, 14));
            }
            oq Q = ezf.Q(i2tVar, c);
            Q.k(arrayList2);
            arrayList.add(Q);
            str3 = str;
        }
        return arrayList;
    }

    public final void d(Collection collection) {
        h4b h4bVar = this.d;
        h4bVar.getClass();
        collection.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = ((frt) qdcVar.C(I)).c().a;
        str.getClass();
        x97.D(g.a, new rlg(h4bVar, str, collection, null, 24));
    }
}
