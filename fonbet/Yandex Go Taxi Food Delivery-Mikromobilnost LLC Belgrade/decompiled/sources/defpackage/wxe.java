package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class wxe {
    public final String a;
    public final String b;

    public wxe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxe)) {
            return false;
        }
        wxe wxeVar = (wxe) obj;
        return jl40.l(this.a, wxeVar.a) && jl40.l(this.b, wxeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CostDetailModel(title=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
