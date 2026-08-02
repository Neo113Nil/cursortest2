package defpackage;

/* loaded from: classes5.dex */
public final class frg extends myo {
    public final String c;
    public final String d;

    public frg(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frg)) {
            return false;
        }
        frg frgVar = (frg) obj;
        return this.c.equals(frgVar.c) && this.d.equals(frgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Log ID of SCT, " + this.c + ", does not match this log's ID, " + this.d;
    }
}
