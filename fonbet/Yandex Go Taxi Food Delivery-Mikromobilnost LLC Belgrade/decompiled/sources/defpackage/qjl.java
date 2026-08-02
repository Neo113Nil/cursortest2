package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qjl {
    public final rr51 a;
    public final kao b;
    public final qc70 c;

    public qjl(rr51 rr51Var, kao kaoVar, pc70 pc70Var) {
        this.a = rr51Var;
        this.b = kaoVar;
        this.c = pc70Var;
    }

    public final rr51 a() {
        return this.a;
    }

    public final kao b() {
        return this.b;
    }

    public final qc70 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjl)) {
            return false;
        }
        qjl qjlVar = (qjl) obj;
        return jl40.l(this.a, qjlVar.a) && jl40.l(this.b, qjlVar.b) && jl40.l(this.c, qjlVar.c);
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int hashCode = (rr51Var == null ? 0 : rr51Var.hashCode()) * 31;
        kao kaoVar = this.b;
        int hashCode2 = (hashCode + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31;
        qc70 qc70Var = this.c;
        return hashCode2 + (qc70Var != null ? qc70Var.hashCode() : 0);
    }

    public final String toString() {
        return "DivTransactionInfoViewState(content=" + this.a + ", error=" + this.b + ", progress=" + this.c + Extension.C_BRAKE;
    }
}
