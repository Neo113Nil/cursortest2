package c8;

import P7.k;
import X.r;
import a.AbstractC0422a;
import c6.l;
import e8.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u7.C5089g;
import u7.C5093k;
import v7.AbstractC5129j;
import v7.AbstractC5131l;
import v7.C5135p;
import v7.s;
import v7.t;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5637a;

    /* renamed from: b, reason: collision with root package name */
    public final t8.g f5638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5639c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f5640d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f5641e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f5642f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f5643g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f5644h;
    public final e[] i;

    /* renamed from: j, reason: collision with root package name */
    public final C5093k f5645j;

    public f(String str, t8.g gVar, int i, List list, a aVar) {
        this.f5637a = str;
        this.f5638b = gVar;
        this.f5639c = i;
        ArrayList arrayList = aVar.f5623b;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        AbstractC5129j.K(arrayList, new HashSet(t.P(AbstractC5131l.y(arrayList, 12))));
        int i6 = 0;
        this.f5640d = (String[]) arrayList.toArray(new String[0]);
        this.f5641e = I.b(aVar.f5625d);
        this.f5642f = (List[]) aVar.f5626e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f5627f;
        kotlin.jvm.internal.h.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i6] = ((Boolean) it.next()).booleanValue();
            i6++;
        }
        this.f5643g = zArr;
        String[] strArr = this.f5640d;
        kotlin.jvm.internal.h.e(strArr, "<this>");
        k kVar = new k(1, new l(4, strArr));
        ArrayList arrayList3 = new ArrayList(AbstractC5131l.y(kVar, 10));
        Iterator it2 = kVar.iterator();
        while (true) {
            P7.b bVar = (P7.b) it2;
            if (!bVar.f2604u.hasNext()) {
                this.f5644h = t.T(arrayList3);
                this.i = I.b(list);
                this.f5645j = AbstractC0422a.q(new r(2, this));
                return;
            }
            s sVar = (s) bVar.next();
            arrayList3.add(new C5089g(sVar.f41446b, Integer.valueOf(sVar.f41445a)));
        }
    }

    @Override // c8.e
    public final String a() {
        return this.f5637a;
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer num = (Integer) this.f5644h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // c8.e
    public final t8.g d() {
        return this.f5638b;
    }

    @Override // c8.e
    public final int e() {
        return this.f5639c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.f5637a.equals(eVar.a()) && Arrays.equals(this.i, ((f) obj).i)) {
                int e9 = eVar.e();
                int i6 = this.f5639c;
                if (i6 == e9) {
                    for (0; i < i6; i + 1) {
                        e[] eVarArr = this.f5641e;
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
        return this.f5640d[i];
    }

    @Override // c8.e
    public final boolean g() {
        return false;
    }

    @Override // c8.e
    public final List getAnnotations() {
        return C5135p.f41442n;
    }

    @Override // c8.e
    public final List h(int i) {
        return this.f5642f[i];
    }

    public final int hashCode() {
        return ((Number) this.f5645j.getValue()).intValue();
    }

    @Override // c8.e
    public final e i(int i) {
        return this.f5641e[i];
    }

    @Override // c8.e
    public final boolean j(int i) {
        return this.f5643g[i];
    }

    public final String toString() {
        return AbstractC5129j.E(V2.a.x(0, this.f5639c), ", ", this.f5637a.concat("("), ")", new J0.l(4, this), 24);
    }

    @Override // c8.e
    public final void b() {
    }
}
