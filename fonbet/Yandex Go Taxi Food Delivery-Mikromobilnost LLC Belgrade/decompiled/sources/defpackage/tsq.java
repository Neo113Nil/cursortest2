package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tsq {
    public final String a;
    public final String b;
    public final boolean c;

    public tsq(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsq)) {
            return false;
        }
        tsq tsqVar = (tsq) obj;
        return jl40.l(this.a, tsqVar.a) && jl40.l(this.b, tsqVar.b) && this.c == tsqVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("FeedbackHintsUiState(id=", this.a, ", text=", this.b, ", isSelected="), this.c, Extension.C_BRAKE);
    }
}
