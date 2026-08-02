package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class uzj implements vzj {
    public static final tzj Companion = new tzj();
    public final int a;

    public /* synthetic */ uzj(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            qje.Z(i, 1, szj.a.getDescriptor());
            throw null;
        }
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzj) && this.a == ((uzj) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Fix(value="), this.a, ')');
    }

    public uzj(int i) {
        this.a = i;
    }
}
