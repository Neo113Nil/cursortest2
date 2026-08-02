package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xf9 {
    public static final xf9 g = new xf9("", false, "", 0, 0, 0);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public xf9(String str, boolean z, String str2, int i, int i2, int i3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf9)) {
            return false;
        }
        xf9 xf9Var = (xf9) obj;
        return this.a.equals(xf9Var.a) && this.b.equals(xf9Var.b) && this.c == xf9Var.c && this.d == xf9Var.d && this.e == xf9Var.e && this.f == xf9Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChangeSourcePointEntryPinConfig(title=", this.a, ", subtitle=", this.b, ", showTime=");
        vfc.u(this.c, this.d, ", timeBeforeShow=", ", tapsCountForNoShow=", v);
        v.append(this.e);
        v.append(", isEnabled=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
