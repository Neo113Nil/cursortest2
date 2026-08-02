package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tbu0 {
    public final int a;
    public final int b;
    public final float c;
    public final String d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    public tbu0(int i, int i2, float f, String str, int i3, boolean z, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = str;
        this.e = i3;
        this.f = z;
        this.g = i4;
        this.h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbu0)) {
            return false;
        }
        tbu0 tbu0Var = (tbu0) obj;
        return this.a == tbu0Var.a && this.b == tbu0Var.b && Float.compare(this.c, tbu0Var.c) == 0 && jl40.l(this.d, tbu0Var.d) && this.e == tbu0Var.e && this.f == tbu0Var.f && this.g == tbu0Var.g && this.h == tbu0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + oyr.b(this.g, unr0.e(oyr.b(this.e, unr0.b(g8e.c(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "StickerData(left=", ", top=", ", angle=");
        s.append(this.c);
        s.append(", text=");
        s.append(this.d);
        s.append(", textColor=");
        tse0.z(s, this.e, ", hasHoles=", this.f, ", backgroundColor=");
        return ly3.k(this.g, this.h, ", textMargin=", Extension.C_BRAKE, s);
    }
}
