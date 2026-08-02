package defpackage;

/* loaded from: classes6.dex */
public final class n0t implements dmv {
    public final mqs a;

    public n0t(mqs mqsVar) {
        this.a = mqsVar;
    }

    @Override // defpackage.dmv
    public final co6 a() {
        return this.a.x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0t) && this.a.equals(((n0t) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "TrackRestoredData(track=" + this.a + ")";
    }
}
