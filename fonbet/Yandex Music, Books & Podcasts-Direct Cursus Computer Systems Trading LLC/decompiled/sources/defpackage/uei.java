package defpackage;

/* loaded from: classes.dex */
public final class uei implements n2i {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public uei(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uei.class == obj.getClass()) {
            uei ueiVar = (uei) obj;
            if (this.a == ueiVar.a && this.b == ueiVar.b && this.c == ueiVar.c && this.d == ueiVar.d && this.e == ueiVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return cb0.A(this.e) + ((cb0.A(this.d) + ((cb0.A(this.c) + ((cb0.A(this.b) + ((cb0.A(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
