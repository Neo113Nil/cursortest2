package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g3e implements cpf {
    public final lbs a;
    public final int b;
    public final l7t c;
    public final Function0 d;

    public g3e(lbs lbsVar, int i, l7t l7tVar, Function0 function0) {
        this.a = lbsVar;
        this.b = i;
        this.c = l7tVar;
        this.d = function0;
    }

    @Override // defpackage.cpf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        long j2;
        if (ffhVar.J(ga6.h(j)) < ga6.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = ga6.b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        ksk M = ffhVar.M(j);
        int min = Math.min(M.a, ga6.i(j2));
        return mfh.m0(mfhVar, min, M.b, new yx7(mfhVar, this, M, min, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3e)) {
            return false;
        }
        g3e g3eVar = (g3e) obj;
        return this.a.equals(g3eVar.a) && this.b == g3eVar.b && this.c.equals(g3eVar.c) && Intrinsics.d(this.d, g3eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
