package defpackage;

/* loaded from: classes.dex */
public final class uvh {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public uvh(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final uvh a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new uvh(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvh)) {
            return false;
        }
        uvh uvhVar = (uvh) obj;
        return this.a.equals(uvhVar.a) && this.b == uvhVar.b && this.c == uvhVar.c && this.d == uvhVar.d && this.e == uvhVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public uvh(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public uvh(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public uvh(Object obj) {
        this(-1L, obj);
    }
}
