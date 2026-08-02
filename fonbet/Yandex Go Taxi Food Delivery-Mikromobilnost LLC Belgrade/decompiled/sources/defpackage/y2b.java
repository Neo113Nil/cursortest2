package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class y2b {
    public final String a;
    public final String b;
    public final boolean c;

    public y2b(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2b)) {
            return false;
        }
        y2b y2bVar = (y2b) obj;
        return this.a.equals(y2bVar.a) && this.b.equals(y2bVar.b) && this.c == y2bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("ChatHeaderUiState(title=", this.a, ", subtitle=", this.b, ", isPhoneVisible="), this.c, Extension.C_BRAKE);
    }
}
