package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ufc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public ufc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufc)) {
            return false;
        }
        ufc ufcVar = (ufc) obj;
        return this.a == ufcVar.a && this.b == ufcVar.b && this.c == ufcVar.c && this.d == ufcVar.d && this.e == ufcVar.e && this.f == ufcVar.f && this.g == ufcVar.g && this.h == ufcVar.h && this.i == ufcVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + oyr.b(this.h, oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ColorPalette(backgroundColor=", ", titleColor=", ", carPlateBackgroundColor=");
        vfc.u(this.c, this.d, ", carPlateTextColor=", ", shimmerTitleColor=", s);
        vfc.u(this.e, this.f, ", outlineIconBackgroundColor=", ", secondaryButtonBackgroundColor=", s);
        vfc.u(this.g, this.h, ", secondaryButtonTintColor=", ", ratingStarColor=", s);
        return oyr.m(this.i, Extension.C_BRAKE, s);
    }
}
