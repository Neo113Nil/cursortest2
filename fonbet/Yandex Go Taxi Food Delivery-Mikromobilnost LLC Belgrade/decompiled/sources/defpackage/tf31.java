package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class tf31 implements s0y {
    public final yny0 a;
    public final int b;
    public final vw01 c;
    public final sls w;

    public tf31(yny0 yny0Var, int i, vw01 vw01Var, sls slsVar) {
        this.a = yny0Var;
        this.b = i;
        this.c = vw01Var;
        this.w = slsVar;
    }

    @Override // defpackage.s0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        o l0 = x910Var.l0(n8e.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(l0.b, n8e.h(j));
        return kVar.w(l0.a, min, b.f(), new v45(this, l0, min, 8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tf31) {
            tf31 tf31Var = (tf31) obj;
            if (this.a == tf31Var.a && this.b == tf31Var.b && this.c.equals(tf31Var.c) && jl40.l(this.w, tf31Var.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.w + ')';
    }
}
