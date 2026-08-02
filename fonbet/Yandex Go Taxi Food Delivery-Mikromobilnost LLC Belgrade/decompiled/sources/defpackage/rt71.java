package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class rt71 {
    public final int a;
    public final String b;

    public rt71(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt71)) {
            return false;
        }
        rt71 rt71Var = (rt71) obj;
        return this.a == rt71Var.a && jl40.l(this.b, rt71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "SdkReward(amount=", ", type=", this.b, Extension.C_BRAKE);
    }
}
