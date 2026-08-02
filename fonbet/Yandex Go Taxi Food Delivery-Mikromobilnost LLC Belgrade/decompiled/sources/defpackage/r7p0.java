package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r7p0 {
    public static final r7p0 c = new r7p0(d8p0.a, "");
    public final String a;
    public final e8p0 b;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r5 != null) goto L23;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r7p0(String str, String str2) {
        this(r0 != null ? r0 : r1, str);
        e8p0 e8p0Var;
        boolean l = jl40.l(str2, "yandex");
        e8p0 e8p0Var2 = d8p0.a;
        if (l) {
            e8p0Var = e8p0Var2;
        } else {
            e8p0Var = dab1.P;
            if (!jl40.l(str2, "jet")) {
                e8p0Var = xpb1.Q;
                if (!jl40.l(str2, "jet_abroad")) {
                    e8p0Var = msb1.S;
                    if (!jl40.l(str2, "velobike")) {
                        e8p0Var = null;
                        if (str2 != null) {
                            str2 = str2.length() <= 0 ? null : str2;
                        }
                        str2 = null;
                        if (str2 != null) {
                            e8p0Var = new c8p0(str2);
                        }
                    }
                }
            }
        }
    }

    public final String a() {
        return this.a;
    }

    public final e8p0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7p0)) {
            return false;
        }
        r7p0 r7p0Var = (r7p0) obj;
        return jl40.l(this.a, r7p0Var.a) && jl40.l(this.b, r7p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScootersVehicleNumber(number=" + this.a + ", vendor=" + this.b + Extension.C_BRAKE;
    }

    public r7p0(e8p0 e8p0Var, String str) {
        this.a = str;
        this.b = e8p0Var;
    }
}
