package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class w6a implements g7a {
    public final String a;
    public final ir9 b;

    public w6a(String str, ir9 ir9Var) {
        this.a = str;
        this.b = ir9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w6a) {
            w6a w6aVar = (w6a) obj;
            return jl40.l(this.a, w6aVar.a) && this.b == w6aVar.b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "OpenDiscountDetails(offerId=" + this.a + ", discount=" + this.b + Extension.C_BRAKE;
    }
}
