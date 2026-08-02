package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class yug extends see {
    public static final xug Companion = new xug();
    public final String a;
    public final String b;

    public /* synthetic */ yug(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wug.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yug.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yug yugVar = (yug) obj;
        return jl40.l(this.a, yugVar.a) && jl40.l(this.b, yugVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("DebugContent(message='", this.a, "', details=", this.b, Extension.C_BRAKE);
    }

    public yug(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
