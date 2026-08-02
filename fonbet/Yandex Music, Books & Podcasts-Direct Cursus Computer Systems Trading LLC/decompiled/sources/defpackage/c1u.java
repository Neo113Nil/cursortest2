package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c1u implements cpf {
    public final lbs a;
    public final int b;
    public final l7t c;
    public final Function0 d;

    public c1u(lbs lbsVar, int i, l7t l7tVar, Function0 function0) {
        this.a = lbsVar;
        this.b = i;
        this.c = l7tVar;
        this.d = function0;
    }

    @Override // defpackage.cpf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ksk M = ffhVar.M(ga6.b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(M.b, ga6.h(j));
        return mfh.m0(mfhVar, M.a, min, new yx7(mfhVar, this, M, min, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1u)) {
            return false;
        }
        c1u c1uVar = (c1u) obj;
        return this.a.equals(c1uVar.a) && this.b == c1uVar.b && this.c.equals(c1uVar.c) && Intrinsics.d(this.d, c1uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
