package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vnv0 implements ynv0 {
    public final qnv0 a;
    public final lsw b;

    public vnv0(lsw lswVar, qnv0 qnv0Var) {
        this.a = qnv0Var;
        this.b = lswVar;
    }

    public final qnv0 a() {
        return this.a;
    }

    public final lsw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnv0)) {
            return false;
        }
        vnv0 vnv0Var = (vnv0) obj;
        return jl40.l(this.a, vnv0Var.a) && jl40.l(this.b, vnv0Var.b);
    }

    public final int hashCode() {
        qnv0 qnv0Var = this.a;
        int hashCode = (qnv0Var == null ? 0 : qnv0Var.hashCode()) * 31;
        lsw lswVar = this.b;
        return hashCode + (lswVar != null ? lswVar.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppMain(additionalInfo=" + this.a + ", returnDeeplink=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ vnv0(int i) {
        this(null, null);
    }

    public vnv0() {
        this(null, null);
    }
}
