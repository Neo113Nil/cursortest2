package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class sic implements z910, ghl0 {
    public final k43 a;
    public final it1 b;

    public sic(k43 k43Var, it1 it1Var) {
        this.a = k43Var;
        this.b = it1Var;
    }

    @Override // defpackage.ghl0
    public final void a(int i, int[] iArr, int[] iArr2, k kVar) {
        this.a.m(kVar, i, iArr, iArr2);
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        return jva1.b(this, n8e.j(j), n8e.k(j), n8e.h(j), n8e.i(j), kVar.f0(this.a.b()), kVar, list, new o[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.ghl0
    public final long c(int i, int i2, int i3, boolean z) {
        return !z ? p8e.a(0, i3, i, i2) : qje.l(0, i3, i, i2);
    }

    @Override // defpackage.ghl0
    public final int d(o oVar) {
        return oVar.a;
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        int f0 = yuwVar.f0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * f0, i);
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            x910 x910Var = (x910) list.get(i3);
            float c = cva1.c(cva1.b(x910Var));
            if (c == 0.0f) {
                int min2 = Math.min(x910Var.y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, x910Var.k0(min2));
            } else if (c > 0.0f) {
                f += c;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            x910 x910Var2 = (x910) list.get(i4);
            float c2 = cva1.c(cva1.b(x910Var2));
            if (c2 > 0.0f) {
                i2 = Math.max(i2, x910Var2.k0(round != Integer.MAX_VALUE ? Math.round(round * c2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sic)) {
            return false;
        }
        sic sicVar = (sic) obj;
        return jl40.l(this.a, sicVar.a) && jl40.l(this.b, sicVar.b);
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        int f0 = yuwVar.f0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * f0, i);
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            x910 x910Var = (x910) list.get(i3);
            float c = cva1.c(cva1.b(x910Var));
            if (c == 0.0f) {
                int min2 = Math.min(x910Var.y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, x910Var.e0(min2));
            } else if (c > 0.0f) {
                f += c;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            x910 x910Var2 = (x910) list.get(i4);
            float c2 = cva1.c(cva1.b(x910Var2));
            if (c2 > 0.0f) {
                i2 = Math.max(i2, x910Var2.e0(round != Integer.MAX_VALUE ? Math.round(round * c2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        int f0 = yuwVar.f0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            x910 x910Var = (x910) list.get(i4);
            float c = cva1.c(cva1.b(x910Var));
            int y = x910Var.y(i);
            if (c == 0.0f) {
                i3 += y;
            } else if (c > 0.0f) {
                f += c;
                i2 = Math.max(i2, Math.round(y / c));
            }
        }
        return ((list.size() - 1) * f0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.ghl0
    public final int h(o oVar) {
        return oVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        int f0 = yuwVar.f0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            x910 x910Var = (x910) list.get(i4);
            float c = cva1.c(cva1.b(x910Var));
            int V = x910Var.V(i);
            if (c == 0.0f) {
                i3 += V;
            } else if (c > 0.0f) {
                f += c;
                i2 = Math.max(i2, Math.round(V / c));
            }
        }
        return ((list.size() - 1) * f0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.ghl0
    public final aa10 j(o[] oVarArr, k kVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        aa10 w;
        w = kVar.w(i2, i, b.f(), new ric(oVarArr, this, i2, kVar, iArr));
        return w;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
