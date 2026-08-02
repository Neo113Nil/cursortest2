package defpackage;

import androidx.compose.foundation.relocation.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqk6;", "Lj530;", "Lsk6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class qk6 extends j530 {
    public final pk6 a;

    public qk6(pk6 pk6Var) {
        this.a = pk6Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        sk6 sk6Var = new sk6();
        sk6Var.a = this.a;
        return sk6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qk6) {
            return jl40.l(this.a, ((qk6) obj).a);
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        sk6 sk6Var = (sk6) e530Var;
        pk6 pk6Var = sk6Var.a;
        if (pk6Var instanceof a) {
            ((a) pk6Var).a.j(sk6Var);
        }
        pk6 pk6Var2 = this.a;
        if (pk6Var2 instanceof a) {
            ((a) pk6Var2).a.b(sk6Var);
        }
        sk6Var.a = pk6Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
