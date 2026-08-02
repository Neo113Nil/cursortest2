package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ohp implements mhp, fr3 {
    public final String a;
    public final ivf b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final mhp[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final mhp[] k;
    public final jyr l;

    public ohp(String str, ivf ivfVar, int i, List list, mm4 mm4Var) {
        list.getClass();
        this.a = str;
        this.b = ivfVar;
        this.c = i;
        this.d = mm4Var.b;
        ArrayList arrayList = mm4Var.c;
        this.e = CollectionsKt.u0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = gld.P(mm4Var.e);
        this.h = (List[]) mm4Var.f.toArray(new List[0]);
        this.i = CollectionsKt.s0(mm4Var.g);
        strArr.getClass();
        vz0 vz0Var = new vz0(2, new z3(16, strArr));
        ArrayList arrayList2 = new ArrayList(v75.o(vz0Var, 10));
        Iterator it = vz0Var.iterator();
        while (true) {
            ora oraVar = (ora) it;
            if (!oraVar.b.hasNext()) {
                this.j = uah.n(arrayList2);
                this.k = gld.P(list);
                this.l = btf.b(new oxo(7, this));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) oraVar.next();
            arrayList2.add(new Pair(indexedValue.b, Integer.valueOf(indexedValue.a)));
        }
    }

    @Override // defpackage.mhp
    public final ivf a() {
        return this.b;
    }

    @Override // defpackage.fr3
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.mhp
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mhp
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.mhp
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ohp) {
            mhp mhpVar = (mhp) obj;
            if (this.a.equals(mhpVar.i()) && Arrays.equals(this.k, ((ohp) obj).k)) {
                int e = mhpVar.e();
                int i2 = this.c;
                if (i2 == e) {
                    for (0; i < i2; i + 1) {
                        mhp[] mhpVarArr = this.g;
                        i = (Intrinsics.d(mhpVarArr[i].i(), mhpVar.h(i).i()) && Intrinsics.d(mhpVarArr[i].a(), mhpVar.h(i).a())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mhp
    public final String f(int i) {
        return this.f[i];
    }

    @Override // defpackage.mhp
    public final List g(int i) {
        return this.h[i];
    }

    @Override // defpackage.mhp
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.mhp
    public final mhp h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.mhp
    public final String i() {
        return this.a;
    }

    @Override // defpackage.mhp
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.mhp
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return v7g.Q(this);
    }
}
