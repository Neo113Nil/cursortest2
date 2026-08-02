package defpackage;

/* loaded from: classes3.dex */
public final class n1t {
    public final o1t a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public n1t(o1t o1tVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = o1tVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1t)) {
            return false;
        }
        n1t n1tVar = (n1t) obj;
        return this.a == n1tVar.a && this.b == n1tVar.b && this.c == n1tVar.c && this.d == n1tVar.d && this.e == n1tVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.e(k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackSheetConfig(usage=");
        sb.append(this.a);
        sb.append(", showDevicePickerAction=");
        sb.append(this.b);
        sb.append(", showTrailerAction=");
        dfi.t(sb, this.c, ", showShareAction=", this.d, ", showDeleteActionForUnavailableTrack=");
        return ouj.r(sb, this.e, ")");
    }
}
