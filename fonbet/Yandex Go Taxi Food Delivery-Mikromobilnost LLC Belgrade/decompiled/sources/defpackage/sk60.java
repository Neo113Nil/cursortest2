package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sk60 extends n351 {
    public final cqs0 c;
    public final ldc d;
    public final x2s e;
    public final String f;

    public sk60(cqs0 cqs0Var, ldc ldcVar, x2s x2sVar, String str) {
        super("notification", false, 14);
        this.c = cqs0Var;
        this.d = ldcVar;
        this.e = x2sVar;
        this.f = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk60)) {
            return false;
        }
        sk60 sk60Var = (sk60) obj;
        return this.c.equals(sk60Var.c) && jl40.l(this.d, sk60Var.d) && this.e.equals(sk60Var.e) && jl40.l(this.f, sk60Var.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        ldc ldcVar = this.d;
        int a = tse0.a(this.e, (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31, 31);
        String str = this.f;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationWidgetModel(slot=" + this.c + ", backgroundColor=" + this.d + ", analyticsData=" + this.e + ", id=" + this.f + Extension.C_BRAKE;
    }
}
