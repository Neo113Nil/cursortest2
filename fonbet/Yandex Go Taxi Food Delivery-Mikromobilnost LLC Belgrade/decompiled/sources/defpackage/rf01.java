package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rf01 {
    public final String a;
    public final String b;
    public final ppl c;

    public rf01(String str, String str2, ppl pplVar) {
        this.a = str;
        this.b = str2;
        this.c = pplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf01)) {
            return false;
        }
        rf01 rf01Var = (rf01) obj;
        return jl40.l(this.a, rf01Var.a) && jl40.l(this.b, rf01Var.b) && jl40.l(this.c, rf01Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TransactionsInfoEntity(title=", this.a, ", subtitle=null, amount=", this.b, ", divViewTransactionList=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
