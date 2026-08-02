package defpackage;

/* loaded from: classes4.dex */
public final class tni extends uni {
    public final mqs a;

    public tni(mqs mqsVar) {
        this.a = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tni) && this.a.equals(((tni) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "TrackFound(track=" + this.a + ")";
    }
}
