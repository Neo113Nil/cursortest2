package c8;

import N3.C;
import P7.k;
import X.r;
import c6.l;
import e8.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u7.C5081g;
import u7.C5085k;
import v7.AbstractC5119j;
import v7.AbstractC5121l;
import v7.C5125p;
import v7.s;
import v7.t;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5813a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.h f5814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5815c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f5816d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f5817e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f5818f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f5819g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f5820h;
    public final e[] i;

    /* renamed from: j, reason: collision with root package name */
    public final C5085k f5821j;

    public f(String str, com.bumptech.glide.h hVar, int i, List list, a aVar) {
        this.f5813a = str;
        this.f5814b = hVar;
        this.f5815c = i;
        ArrayList arrayList = aVar.f5799b;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        AbstractC5119j.I(arrayList, new HashSet(t.t(AbstractC5121l.w(arrayList, 12))));
        int i4 = 0;
        this.f5816d = (String[]) arrayList.toArray(new String[0]);
        this.f5817e = I.b(aVar.f5801d);
        this.f5818f = (List[]) aVar.f5802e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f5803f;
        kotlin.jvm.internal.h.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        this.f5819g = zArr;
        String[] strArr = this.f5816d;
        kotlin.jvm.internal.h.e(strArr, "<this>");
        k kVar = new k(1, new l(4, strArr));
        ArrayList arrayList3 = new ArrayList(AbstractC5121l.w(kVar, 10));
        Iterator it2 = kVar.iterator();
        while (true) {
            P7.b bVar = (P7.b) it2;
            if (!bVar.f2439u.hasNext()) {
                this.f5820h = t.x(arrayList3);
                this.i = I.b(list);
                this.f5821j = C.O(new r(2, this));
                return;
            }
            s sVar = (s) bVar.next();
            arrayList3.add(new C5081g(sVar.f41225b, Integer.valueOf(sVar.f41224a)));
        }
    }

    @Override // c8.e
    public final String a() {
        return this.f5813a;
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer num = (Integer) this.f5820h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // c8.e
    public final com.bumptech.glide.h d() {
        return this.f5814b;
    }

    @Override // c8.e
    public final int e() {
        return this.f5815c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.f5813a.equals(eVar.a()) && Arrays.equals(this.i, ((f) obj).i)) {
                int e9 = eVar.e();
                int i4 = this.f5815c;
                if (i4 == e9) {
                    for (0; i < i4; i + 1) {
                        e[] eVarArr = this.f5817e;
                        i = (kotlin.jvm.internal.h.a(eVarArr[i].a(), eVar.i(i).a()) && kotlin.jvm.internal.h.a(eVarArr[i].d(), eVar.i(i).d())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c8.e
    public final String f(int i) {
        return this.f5816d[i];
    }

    @Override // c8.e
    public final boolean g() {
        return false;
    }

    @Override // c8.e
    public final List getAnnotations() {
        return C5125p.f41221n;
    }

    @Override // c8.e
    public final List h(int i) {
        return this.f5818f[i];
    }

    public final int hashCode() {
        return ((Number) this.f5821j.getValue()).intValue();
    }

    @Override // c8.e
    public final e i(int i) {
        return this.f5817e[i];
    }

    @Override // c8.e
    public final boolean j(int i) {
        return this.f5819g[i];
    }

    public final String toString() {
        return AbstractC5119j.C(S0.f.x(0, this.f5815c), ", ", this.f5813a.concat("("), ")", new J0.k(4, this), 24);
    }

    @Override // c8.e
    public final void b() {
    }
}
