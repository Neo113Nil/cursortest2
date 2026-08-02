package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lb5 implements ukd {
    public final ukd a;
    public final ukd b;

    public lb5(ukd ukdVar, ukd ukdVar2) {
        this.a = ukdVar;
        this.b = ukdVar2;
    }

    @Override // defpackage.ukd
    public final Object a(Object obj, Function2 function2) {
        return this.b.a(this.a.a(obj, function2), function2);
    }

    @Override // defpackage.ukd
    public final boolean b() {
        return this.a.b() && this.b.b();
    }

    @Override // defpackage.ukd
    public final boolean c(Function1 function1) {
        return this.a.c(function1) || this.b.c(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lb5)) {
            return false;
        }
        lb5 lb5Var = (lb5) obj;
        return this.a.equals(lb5Var.a) && Intrinsics.d(this.b, lb5Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("["), (String) a("", kb5.s), ']');
    }
}
