package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ujq0 implements wjq0 {
    public final mfq0 a;
    public final String b;
    public final eh01 c;

    public ujq0(mfq0 mfq0Var, String str, eh01 eh01Var) {
        this.a = mfq0Var;
        this.b = str;
        this.c = eh01Var;
    }

    public static ujq0 c(ujq0 ujq0Var, eh01 eh01Var) {
        mfq0 mfq0Var = ujq0Var.a;
        String str = ujq0Var.b;
        ujq0Var.getClass();
        return new ujq0(mfq0Var, str, eh01Var);
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
        if (!(obj instanceof ujq0)) {
            return false;
        }
        ujq0 ujq0Var = (ujq0) obj;
        return this.a.equals(ujq0Var.a) && jl40.l(this.b, ujq0Var.b) && jl40.l(this.c, ujq0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SelfTopup(sourceAccount=" + this.a + ", sheetItemId=" + this.b + ", fromCircleButton=" + this.c + Extension.C_BRAKE;
    }
}
