package Y7;

import L7.k;
import X.r;
import Y5.l;
import a.AbstractC0415a;
import a8.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q7.C4938g;
import q7.C4942k;
import r7.AbstractC4979j;
import r7.AbstractC4981l;
import r7.C4985p;
import r7.s;
import r7.t;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4042a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.e f4043b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4044c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f4045d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f4046e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f4047f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f4048g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f4049h;
    public final e[] i;

    /* renamed from: j, reason: collision with root package name */
    public final C4942k f4050j;

    public f(String str, com.bumptech.glide.e eVar, int i, List list, a aVar) {
        this.f4042a = str;
        this.f4043b = eVar;
        this.f4044c = i;
        ArrayList arrayList = aVar.f4028b;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        AbstractC4979j.Q(arrayList, new HashSet(t.z(AbstractC4981l.E(arrayList, 12))));
        int i4 = 0;
        this.f4045d = (String[]) arrayList.toArray(new String[0]);
        this.f4046e = I.b(aVar.f4030d);
        this.f4047f = (List[]) aVar.f4031e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f4032f;
        kotlin.jvm.internal.h.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        this.f4048g = zArr;
        String[] strArr = this.f4045d;
        kotlin.jvm.internal.h.e(strArr, "<this>");
        k kVar = new k(1, new l(4, strArr));
        ArrayList arrayList3 = new ArrayList(AbstractC4981l.E(kVar, 10));
        Iterator it2 = kVar.iterator();
        while (true) {
            L7.b bVar = (L7.b) it2;
            if (!bVar.f1792u.hasNext()) {
                this.f4049h = t.D(arrayList3);
                this.i = I.b(list);
                this.f4050j = com.bumptech.glide.e.q(new r(1, this));
                return;
            }
            s sVar = (s) bVar.next();
            arrayList3.add(new C4938g(sVar.f40362b, Integer.valueOf(sVar.f40361a)));
        }
    }

    @Override // Y7.e
    public final String a() {
        return this.f4042a;
    }

    @Override // Y7.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer num = (Integer) this.f4049h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // Y7.e
    public final com.bumptech.glide.e d() {
        return this.f4043b;
    }

    @Override // Y7.e
    public final int e() {
        return this.f4044c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.f4042a.equals(eVar.a()) && Arrays.equals(this.i, ((f) obj).i)) {
                int e6 = eVar.e();
                int i4 = this.f4044c;
                if (i4 == e6) {
                    for (0; i < i4; i + 1) {
                        e[] eVarArr = this.f4046e;
                        i = (kotlin.jvm.internal.h.a(eVarArr[i].a(), eVar.i(i).a()) && kotlin.jvm.internal.h.a(eVarArr[i].d(), eVar.i(i).d())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Y7.e
    public final String f(int i) {
        return this.f4045d[i];
    }

    @Override // Y7.e
    public final boolean g() {
        return false;
    }

    @Override // Y7.e
    public final List getAnnotations() {
        return C4985p.f40358n;
    }

    @Override // Y7.e
    public final List h(int i) {
        return this.f4047f[i];
    }

    public final int hashCode() {
        return ((Number) this.f4050j.getValue()).intValue();
    }

    @Override // Y7.e
    public final e i(int i) {
        return this.f4046e[i];
    }

    @Override // Y7.e
    public final boolean j(int i) {
        return this.f4048g[i];
    }

    public final String toString() {
        return AbstractC4979j.K(AbstractC0415a.E(0, this.f4044c), ", ", this.f4042a.concat("("), ")", new J0.l(4, this), 24);
    }

    @Override // Y7.e
    public final void b() {
    }
}
