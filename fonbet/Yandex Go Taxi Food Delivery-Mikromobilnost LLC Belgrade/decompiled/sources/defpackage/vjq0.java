package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vjq0 implements wjq0 {
    public final mfq0 a;
    public final String b;
    public final eh01 c;

    public vjq0(mfq0 mfq0Var, String str, eh01 eh01Var) {
        this.a = mfq0Var;
        this.b = str;
        this.c = eh01Var;
    }

    public static vjq0 c(vjq0 vjq0Var, eh01 eh01Var) {
        mfq0 mfq0Var = vjq0Var.a;
        String str = vjq0Var.b;
        vjq0Var.getClass();
        return new vjq0(mfq0Var, str, eh01Var);
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjq0)) {
            return false;
        }
        vjq0 vjq0Var = (vjq0) obj;
        return this.a.equals(vjq0Var.a) && jl40.l(this.b, vjq0Var.b) && jl40.l(this.c, vjq0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SelfTransfer(targetAccount=" + this.a + ", selfTransferSheetItemId=" + this.b + ", fromCircleButton=" + this.c + Extension.C_BRAKE;
    }
}
