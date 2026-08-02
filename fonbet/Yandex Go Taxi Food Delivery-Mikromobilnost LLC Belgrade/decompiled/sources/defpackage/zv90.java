package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zv90 implements bw90 {
    public final String a;

    public zv90(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv90) && jl40.l(this.a, ((zv90) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Unavailable(message=", this.a, Extension.C_BRAKE);
    }

    public /* synthetic */ zv90(int i) {
        this((String) null);
    }

    public zv90() {
        this((String) null);
    }
}
