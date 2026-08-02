package defpackage;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class u1w {
    public static final u1w e = new u1w(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public u1w(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static u1w a(u1w u1wVar, u1w u1wVar2) {
        return c(Math.max(u1wVar.a, u1wVar2.a), Math.max(u1wVar.b, u1wVar2.b), Math.max(u1wVar.c, u1wVar2.c), Math.max(u1wVar.d, u1wVar2.d));
    }

    public static u1w b(u1w u1wVar, u1w u1wVar2) {
        return c(Math.min(u1wVar.a, u1wVar2.a), Math.min(u1wVar.b, u1wVar2.b), Math.min(u1wVar.c, u1wVar2.c), Math.min(u1wVar.d, u1wVar2.d));
    }

    public static u1w c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new u1w(i, i2, i3, i4);
    }

    public static u1w d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1w.class != obj.getClass()) {
            return false;
        }
        u1w u1wVar = (u1w) obj;
        return this.d == u1wVar.d && this.a == u1wVar.a && this.c == u1wVar.c && this.b == u1wVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return oyr.s(sb, this.d, '}');
    }
}
