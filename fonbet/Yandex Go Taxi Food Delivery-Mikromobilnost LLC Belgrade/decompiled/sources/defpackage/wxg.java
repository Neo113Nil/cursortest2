package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class wxg {
    public final q7v a;
    public final boolean b;

    public wxg(q7v q7vVar, boolean z) {
        this.a = q7vVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxg)) {
            return false;
        }
        wxg wxgVar = (wxg) obj;
        return jl40.l(this.a, wxgVar.a) && this.b == wxgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + Extension.C_BRAKE;
    }
}
