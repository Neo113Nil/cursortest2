package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o81 implements q81 {
    public final g81 a;
    public final d91 b;
    public final e73 c;

    public o81(g81 g81Var, d91 d91Var, e73 e73Var) {
        g81Var.getClass();
        e73Var.getClass();
        this.a = g81Var;
        this.b = d91Var;
        this.c = e73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o81)) {
            return false;
        }
        o81 o81Var = (o81) obj;
        return Intrinsics.d(this.a, o81Var.a) && this.b.equals(o81Var.b) && Intrinsics.d(this.c, o81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Loaded(data=" + this.a + ", uiState=" + this.b + ", result=" + this.c + ")";
    }
}
