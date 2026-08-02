package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class tdu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public tdu(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        str4 = (i & 8) != 0 ? "" : str4;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdu)) {
            return false;
        }
        tdu tduVar = (tdu) obj;
        return jl40.l(this.a, tduVar.a) && jl40.l(this.b, tduVar.b) && jl40.l(this.c, tduVar.c) && jl40.l(this.d, tduVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("HeaderUiState(title=", this.a, ", stopName=", this.b, ", walkingText="), this.c, ", subtitleDescription=", this.d, Extension.C_BRAKE);
    }

    public tdu() {
        this(null, null, null, null, 15);
    }
}
