package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class t8f {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;

    public t8f(boolean z, String str, String str2, String str3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8f)) {
            return false;
        }
        t8f t8fVar = (t8f) obj;
        return this.a == t8fVar.a && this.b.equals(t8fVar.b) && this.c.equals(t8fVar.c) && this.d.equals(t8fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(ly3.v("CreatingLimitExceededScreenData(isScreenExists=", ", title=", this.b, ", subtitle=", this.a), this.c, ", buttonTitle=", this.d, Extension.C_BRAKE);
    }
}
