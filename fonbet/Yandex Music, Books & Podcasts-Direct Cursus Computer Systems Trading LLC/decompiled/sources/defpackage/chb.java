package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class chb extends jhb {
    public final wls d;
    public final ArrayList e;
    public final String f;
    public final List g;
    public final List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chb(wls wlsVar, ArrayList arrayList, String str) {
        super(str);
        Object next;
        str.getClass();
        this.d = wlsVar;
        this.e = arrayList;
        this.f = str;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jhb) it.next()).c());
        }
        Iterator it2 = arrayList2.iterator();
        Object obj = null;
        if (it2.hasNext()) {
            next = it2.next();
            while (it2.hasNext()) {
                next = CollectionsKt.g0((List) next, (List) it2.next());
            }
        } else {
            next = null;
        }
        List list = (List) next;
        this.g = list == null ? c5b.a : list;
        ArrayList arrayList3 = this.e;
        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((jhb) it3.next()).b());
        }
        Iterator it4 = arrayList4.iterator();
        if (it4.hasNext()) {
            obj = it4.next();
            while (it4.hasNext()) {
                obj = CollectionsKt.g0((List) obj, (List) it4.next());
            }
        }
        List list2 = (List) obj;
        this.h = list2 == null ? c5b.a : list2;
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        String concat;
        mhb mhbVar;
        g06 g06Var = (g06) h4bVar.a;
        ArrayList arrayList = new ArrayList();
        wls wlsVar = this.d;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            jhb jhbVar = (jhb) it.next();
            arrayList.add(h4bVar.h(jhbVar));
            d(jhbVar.b);
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof Long) {
                mhbVar = mhb.INTEGER;
            } else if (next instanceof Double) {
                mhbVar = mhb.NUMBER;
            } else if (next instanceof Boolean) {
                mhbVar = mhb.BOOLEAN;
            } else if (next instanceof String) {
                mhbVar = mhb.STRING;
            } else if (next instanceof vc7) {
                mhbVar = mhb.DATETIME;
            } else if (next instanceof c85) {
                mhbVar = mhb.COLOR;
            } else if (next instanceof lpt) {
                mhbVar = mhb.URL;
            } else if (next instanceof JSONObject) {
                mhbVar = mhb.DICT;
            } else {
                if (!(next instanceof JSONArray)) {
                    if (next == null) {
                        kac.h("Unable to find type for null", null);
                        return null;
                    }
                    kac.h("Unable to find type for ".concat(next.getClass().getName()), null);
                    return null;
                }
                mhbVar = mhb.ARRAY;
            }
            arrayList2.add(mhbVar);
        }
        try {
            cib cibVar = (cib) g06Var.c;
            oyc r = ((czc) cibVar.b).r(wlsVar.a, arrayList2);
            d(r.f());
            return r.e(g06Var, this, h4b.g(r, arrayList));
        } catch (khb e) {
            String str = wlsVar.a;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if (arrayList.size() > 1) {
                concat = CollectionsKt.X(arrayList.subList(1, arrayList.size()), StringUtils.COMMA, str.concat("("), ")", null, 56);
            } else {
                concat = str.concat("()");
            }
            ghh.I(concat, message, e);
            throw null;
        }
    }

    @Override // defpackage.jhb
    public final List b() {
        return this.h;
    }

    @Override // defpackage.jhb
    public final List c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chb)) {
            return false;
        }
        chb chbVar = (chb) obj;
        return Intrinsics.d(this.d, chbVar.d) && Intrinsics.d(this.e, chbVar.e) && Intrinsics.d(this.f, chbVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dfi.b(this.e, this.d.a.hashCode() * 31, 31);
    }

    public final String toString() {
        ArrayList arrayList = this.e;
        return CollectionsKt.Q(arrayList) + '.' + this.d.a + '(' + (arrayList.size() > 1 ? CollectionsKt.X(arrayList.subList(1, arrayList.size()), StringUtils.COMMA, null, null, null, 62) : "") + ')';
    }
}
