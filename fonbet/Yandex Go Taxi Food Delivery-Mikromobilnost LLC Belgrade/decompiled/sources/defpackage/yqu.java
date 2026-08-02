package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class yqu implements s0y {
    public final yny0 a;
    public final int b;
    public final vw01 c;
    public final sls w;

    public yqu(yny0 yny0Var, int i, vw01 vw01Var, sls slsVar) {
        this.a = yny0Var;
        this.b = i;
        this.c = vw01Var;
        this.w = slsVar;
    }

    @Override // defpackage.s0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        long j2;
        if (x910Var.k0(n8e.h(j)) < n8e.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = n8e.b(0, j2, Integer.MAX_VALUE, 0, 0, 13);
        }
        o l0 = x910Var.l0(j);
        int min = Math.min(l0.a, n8e.i(j2));
        return kVar.w(min, l0.b, b.f(), new mt0(this, kVar, l0, min, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yqu) {
            yqu yquVar = (yqu) obj;
            if (this.a == yquVar.a && this.b == yquVar.b && this.c.equals(yquVar.c) && jl40.l(this.w, yquVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.w + ')';
    }
}
