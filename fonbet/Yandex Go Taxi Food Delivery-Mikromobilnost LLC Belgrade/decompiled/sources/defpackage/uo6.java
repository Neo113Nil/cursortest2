package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uo6 implements a05 {
    public final Throwable a;
    public final v7l b;
    public final lur0 c;
    public final boolean d;

    public uo6(Throwable th, v7l v7lVar, lur0 lur0Var, boolean z) {
        this.a = th;
        this.b = v7lVar;
        this.c = lur0Var;
        this.d = z;
    }

    public static uo6 b(uo6 uo6Var, Throwable th, v7l v7lVar, lur0 lur0Var, int i) {
        if ((i & 1) != 0) {
            th = uo6Var.a;
        }
        if ((i & 2) != 0) {
            v7lVar = uo6Var.b;
        }
        if ((i & 4) != 0) {
            lur0Var = uo6Var.c;
        }
        boolean z = (i & 8) != 0 ? uo6Var.d : false;
        uo6Var.getClass();
        return new uo6(th, v7lVar, lur0Var, z);
    }

    @Override // defpackage.a05
    public final lur0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo6)) {
            return false;
        }
        uo6 uo6Var = (uo6) obj;
        return jl40.l(this.a, uo6Var.a) && jl40.l(this.b, uo6Var.b) && this.c.equals(uo6Var.c) && this.d == uo6Var.d;
    }

    @Override // defpackage.a05
    public final v7l getEntity() {
        return this.b;
    }

    @Override // defpackage.a05
    public final Throwable getError() {
        return this.a;
    }

    public final int hashCode() {
        Throwable th = this.a;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        v7l v7lVar = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (v7lVar != null ? v7lVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "BudgetChargesRequisitesState(error=" + this.a + ", entity=" + this.b + ", shimmerTimerStatus=" + this.c + ", isFirstLoad=" + this.d + Extension.C_BRAKE;
    }
}
