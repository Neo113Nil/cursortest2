package defpackage;

/* loaded from: classes3.dex */
public final class ruc {
    public final String a;
    public final boolean b;

    public ruc(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruc)) {
            return false;
        }
        ruc rucVar = (ruc) obj;
        return this.a.equals(rucVar.a) && this.b == rucVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("TrackingConfig(screenName=", this.a, ", mviReport=", ")", this.b);
    }
}
