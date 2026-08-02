package defpackage;

/* loaded from: classes3.dex */
public final class pws {
    public final mqs a;
    public final int b;

    public pws(mqs mqsVar, int i) {
        this.a = mqsVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pws)) {
            return false;
        }
        pws pwsVar = (pws) obj;
        return this.a.equals(pwsVar.a) && this.b == pwsVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackInfoOutOfSize(track=" + this.a + ", trackIndex=" + this.b + ")";
    }
}
