package defpackage;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class zne {
    public static final zne e = new zne(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zne(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static zne a(zne zneVar, zne zneVar2) {
        return c(Math.max(zneVar.a, zneVar2.a), Math.max(zneVar.b, zneVar2.b), Math.max(zneVar.c, zneVar2.c), Math.max(zneVar.d, zneVar2.d));
    }

    public static zne b(zne zneVar, zne zneVar2) {
        return c(Math.min(zneVar.a, zneVar2.a), Math.min(zneVar.b, zneVar2.b), Math.min(zneVar.c, zneVar2.c), Math.min(zneVar.d, zneVar2.d));
    }

    public static zne c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new zne(i, i2, i3, i4);
    }

    public static zne d(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return c(i, i2, i3, i4);
    }

    public final Insets e() {
        return mi.B(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zne.class != obj.getClass()) {
            return false;
        }
        zne zneVar = (zne) obj;
        return this.d == zneVar.d && this.a == zneVar.a && this.c == zneVar.c && this.b == zneVar.b;
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
        return vz1.r(sb, this.d, '}');
    }
}
