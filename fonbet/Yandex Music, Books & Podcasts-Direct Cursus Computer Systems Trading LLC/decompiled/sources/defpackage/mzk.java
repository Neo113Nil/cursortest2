package defpackage;

/* loaded from: classes6.dex */
public final class mzk {
    public final boolean a;

    public mzk(Boolean bool) {
        this.a = bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mzk.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a == ((mzk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("PlaybackFeatures(lowLatency="), this.a, ')');
    }
}
