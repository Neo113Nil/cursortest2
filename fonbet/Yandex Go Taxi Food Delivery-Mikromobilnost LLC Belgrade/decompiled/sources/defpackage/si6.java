package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public final class si6 implements z910 {
    public final jt1 a;
    public final boolean b;

    public si6(jt1 jt1Var, boolean z) {
        this.a = jt1Var;
        this.b = z;
    }

    @Override // defpackage.z910
    public final aa10 b(final k kVar, List list, long j) {
        aa10 w;
        int k;
        int j2;
        o l0;
        aa10 w2;
        aa10 w3;
        if (list.isEmpty()) {
            w3 = kVar.w(n8e.k(j), n8e.j(j), b.f(), new p0u(5));
            return w3;
        }
        long j3 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final x910 x910Var = (x910) list.get(0);
            Object a = x910Var.a();
            ni6 ni6Var = a instanceof ni6 ? (ni6) a : null;
            if (ni6Var != null ? ni6Var.b : false) {
                k = n8e.k(j);
                j2 = n8e.j(j);
                int k2 = n8e.k(j);
                int j4 = n8e.j(j);
                if (!((j4 >= 0) & (k2 >= 0))) {
                    kxv.a("width and height must be >= 0");
                }
                l0 = x910Var.l0(p8e.h(k2, k2, j4, j4));
            } else {
                l0 = x910Var.l0(j3);
                k = Math.max(n8e.k(j), l0.a);
                j2 = Math.max(n8e.j(j), l0.b);
            }
            final int i = j2;
            final int i2 = k;
            final o oVar = l0;
            w2 = kVar.w(i2, i, b.f(), new tls() { // from class: qi6
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    pi6.b((o.a) obj, o.this, x910Var, kVar.getLayoutDirection(), i2, i, this.a);
                    return zy11.a;
                }
            });
            return w2;
        }
        o[] oVarArr = new o[list.size()];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = n8e.k(j);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = n8e.j(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            x910 x910Var2 = (x910) list.get(i3);
            Object a2 = x910Var2.a();
            ni6 ni6Var2 = a2 instanceof ni6 ? (ni6) a2 : null;
            if (ni6Var2 != null ? ni6Var2.b : false) {
                z = true;
            } else {
                o l02 = x910Var2.l0(j3);
                oVarArr[i3] = l02;
                ref$IntRef.element = Math.max(ref$IntRef.element, l02.a);
                ref$IntRef2.element = Math.max(ref$IntRef2.element, l02.b);
            }
        }
        if (z) {
            int i4 = ref$IntRef.element;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = ref$IntRef2.element;
            long a3 = p8e.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                x910 x910Var3 = (x910) list.get(i7);
                Object a4 = x910Var3.a();
                ni6 ni6Var3 = a4 instanceof ni6 ? (ni6) a4 : null;
                if (ni6Var3 != null ? ni6Var3.b : false) {
                    oVarArr[i7] = x910Var3.l0(a3);
                }
            }
        }
        w = kVar.w(ref$IntRef.element, ref$IntRef2.element, b.f(), new ri6(oVarArr, list, kVar, ref$IntRef, ref$IntRef2, this, 0));
        return w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si6)) {
            return false;
        }
        si6 si6Var = (si6) obj;
        return jl40.l(this.a, si6Var.a) && this.b == si6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return unr0.u(sb, this.b, ')');
    }
}
