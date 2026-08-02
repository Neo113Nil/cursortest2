package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class t1w {
    public static final t1w h = new t1w(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final boolean f;
    public final int g;

    public t1w(int i, int i2, int i3, int i4, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = num;
        this.f = num != null;
        this.g = num != null ? num.intValue() : i4;
    }

    public static t1w a(t1w t1wVar, int i) {
        int i2 = t1wVar.a;
        int i3 = t1wVar.c;
        int i4 = t1wVar.d;
        Integer num = t1wVar.e;
        t1wVar.getClass();
        return new t1w(i2, i, i3, i4, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1w)) {
            return false;
        }
        t1w t1wVar = (t1w) obj;
        return this.a == t1wVar.a && this.b == t1wVar.b && this.c == t1wVar.c && this.d == t1wVar.d && jl40.l(this.e, t1wVar.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        Integer num = this.e;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "Insets(left=", ", top=", ", right=");
        vfc.u(this.c, this.d, ", navigationBar=", ", ime=", s);
        return oo31.j(s, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ t1w(int i) {
        this(0, 0, 0, i, null);
    }
}
