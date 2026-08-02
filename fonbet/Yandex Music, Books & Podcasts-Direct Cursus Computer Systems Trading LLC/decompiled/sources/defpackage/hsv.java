package defpackage;

/* loaded from: classes4.dex */
public final class hsv implements jsv {
    public final boolean a;

    public hsv(boolean z) {
        this.a = z;
    }

    @Override // defpackage.jsv
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hsv) && this.a == ((hsv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Primary(isClickEnabled=", ")", this.a);
    }
}
