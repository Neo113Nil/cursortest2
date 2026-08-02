package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class uug extends kr {
    public static final tug Companion = new tug();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ uug(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, sug.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uug.class != obj.getClass()) {
            return false;
        }
        uug uugVar = (uug) obj;
        return jl40.l(this.a, uugVar.a) && jl40.l(this.b, uugVar.b) && jl40.l(this.c, uugVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str != null ? str.hashCode() : 0) * 31, 31, this.b);
        String str2 = this.c;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("DebugAction(type=", this.a, ", message=", this.b, ", details="), this.c, Extension.C_BRAKE);
    }

    public uug(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
