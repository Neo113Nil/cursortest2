package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class zut {
    public final int a;
    public final String b;
    public final boolean c;

    public /* synthetic */ zut(int i, String str, int i2) {
        this(i, (i2 & 2) != 0 ? null : str, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zut)) {
            return false;
        }
        zut zutVar = (zut) obj;
        return this.a == zutVar.a && jl40.l(this.b, zutVar.b) && this.c == zutVar.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(unr0.v(this.a, "GooglePayBindTokenParams(regionId=", ", serviceToken=", this.b, ", bindTokenToTrust="), this.c, Extension.C_BRAKE);
    }

    public zut(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }
}
