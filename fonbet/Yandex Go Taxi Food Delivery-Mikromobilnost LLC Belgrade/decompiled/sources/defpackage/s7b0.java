package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.np40;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.sequences.b;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes9.dex */
public final class s7b0 {
    public final b8r a;
    public final c8r b;

    public s7b0(b8r b8rVar, c8r c8rVar) {
        this.a = b8rVar;
        this.b = c8rVar;
    }

    public final r7b0 a(j6b0 j6b0Var) {
        op40 op40Var;
        Collection collection;
        mi31 mi31Var;
        Object obj;
        np40.a aVar;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        np40 np40Var = j6b0Var.d;
        gnx0 gnx0Var = null;
        if (np40Var == null || (aVar = np40Var.d) == null) {
            op40Var = null;
        } else {
            boolean z = aVar.a;
            String str = aVar.b;
            String str2 = np40Var.c;
            if (str2 == null) {
                str2 = "";
            }
            op40Var = new op40(z, str, str2);
        }
        Iterator it = j6b0Var.c.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            collection = EmptyList.a;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            of31 of31Var = (of31) entry.getValue();
            gp40 gp40Var = of31Var.b;
            if (gp40Var != null) {
                Collection collection2 = gp40Var.a;
                if (collection2 != null) {
                    collection = collection2;
                }
                if (!collection.isEmpty()) {
                    hashMap.put(str3, a.M0(collection));
                }
            }
            String str4 = of31Var.a;
            gp40 gp40Var2 = of31Var.b;
            String str5 = (gp40Var2 == null || !gp40Var2.b) ? str4 : "multiclass";
            ni31 ni31Var = str5 != null ? new ni31(str5, str3) : null;
            if (ni31Var != null) {
                arrayList.add(ni31Var);
            }
        }
        if (np40Var != null) {
            Set set = np40Var.a;
            if (np40Var.b && !set.isEmpty()) {
                String str6 = np40Var.c;
                if (str6 == null) {
                    str6 = "";
                }
                hashMap.put(str6, a.M0(set));
            }
        }
        if (np40Var != null && np40Var.b) {
            String str7 = np40Var.c;
            if (str7 == null || str7.length() == 0) {
                mi31Var = null;
            } else {
                b8r b8rVar = this.a;
                qrw qrwVar = b8rVar.b;
                List list = ((k) b8rVar.a).j().a;
                qrwVar.getClass();
                Collection s = b.s(b.g(eja1.d(str7, list), new vsq(str7, 14)));
                if (!s.isEmpty() || gwk0.v(str7)) {
                    collection = s;
                }
                Iterator<E> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (jl40.l(((mi31) obj).f, "multiclass")) {
                        break;
                    }
                }
                mi31Var = (mi31) obj;
            }
            if (mi31Var != null) {
                gnx0Var = new gnx0(new fnx0(mi31Var.a, mi31Var.b, SelectionOrigin.PERSONALSTATE), true);
                return new r7b0(gnx0Var, hashMap, arrayList, j6b0Var.b, op40Var);
            }
        }
        String str8 = j6b0Var.e;
        mi31 b = c8r.b(this.b, j6b0Var.a, str8 != null ? str8 : "", null, 4);
        if (b != null) {
            gnx0Var = new gnx0(new fnx0(b.a, b.b, SelectionOrigin.PERSONALSTATE), true);
        }
        return new r7b0(gnx0Var, hashMap, arrayList, j6b0Var.b, op40Var);
    }
}
