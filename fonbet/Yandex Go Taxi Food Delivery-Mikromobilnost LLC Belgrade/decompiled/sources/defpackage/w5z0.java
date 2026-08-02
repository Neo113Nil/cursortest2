package defpackage;

@gsq0
/* loaded from: classes.dex */
public final class w5z0 {
    public static final q5z0 Companion = new q5z0();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ w5z0(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, o5z0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5z0) && this.a == ((w5z0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b64.o(new StringBuilder("Time(ms="), this.a, ')');
    }

    public w5z0(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
