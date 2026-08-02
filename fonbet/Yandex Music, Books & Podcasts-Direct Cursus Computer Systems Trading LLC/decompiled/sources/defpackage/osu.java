package defpackage;

/* loaded from: classes4.dex */
public final class osu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public osu(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osu)) {
            return false;
        }
        osu osuVar = (osu) obj;
        return this.a == osuVar.a && this.b == osuVar.b && this.c == osuVar.c && this.d == osuVar.d && this.e == osuVar.e && this.f == osuVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + f1d.a(this.e, f1d.a(this.d, f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("WaveHueSet(topStart=", this.a, this.b, ", topEnd=", ", middleStart=");
        hrg.w(this.c, this.d, ", middleEnd=", ", bottomStart=", l);
        l.append(this.e);
        l.append(", bottomEnd=");
        l.append(this.f);
        l.append(")");
        return l.toString();
    }
}
