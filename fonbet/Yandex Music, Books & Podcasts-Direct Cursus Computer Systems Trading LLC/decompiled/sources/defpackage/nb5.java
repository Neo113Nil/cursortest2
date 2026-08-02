package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nb5 implements yci {
    public final yci a;
    public final yci b;

    public nb5(yci yciVar, yci yciVar2) {
        this.a = yciVar;
        this.b = yciVar2;
    }

    @Override // defpackage.yci
    public final Object a(Object obj, Function2 function2) {
        return this.b.a(this.a.a(obj, function2), function2);
    }

    @Override // defpackage.yci
    public final boolean b(Function1 function1) {
        return this.a.b(function1) && this.b.b(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nb5)) {
            return false;
        }
        nb5 nb5Var = (nb5) obj;
        return this.a.equals(nb5Var.a) && Intrinsics.d(this.b, nb5Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("["), (String) a("", kb5.t), ']');
    }
}
