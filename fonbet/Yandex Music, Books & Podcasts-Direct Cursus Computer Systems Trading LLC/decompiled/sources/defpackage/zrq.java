package defpackage;

/* loaded from: classes4.dex */
public final class zrq {
    public final float a;
    public final float b;
    public final float c;

    public zrq(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrq)) {
            return false;
        }
        zrq zrqVar = (zrq) obj;
        return Float.compare(this.a, zrqVar.a) == 0 && Float.compare(this.b, zrqVar.b) == 0 && Float.compare(this.c, zrqVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + eta.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SleepAlpha(iconAlpha=");
        sb.append(this.a);
        sb.append(", cometAlpha=");
        sb.append(this.b);
        sb.append(", contentAlpha=");
        return su4.m(this.c, ")", sb);
    }
}
