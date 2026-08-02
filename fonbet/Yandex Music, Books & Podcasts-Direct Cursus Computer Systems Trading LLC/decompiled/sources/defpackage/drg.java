package defpackage;

/* loaded from: classes3.dex */
public final class drg {
    public final String a;
    public final String b;

    public drg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drg)) {
            return false;
        }
        drg drgVar = (drg) obj;
        return this.a.equals(drgVar.a) && this.b.equals(drgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("LogFile(data=", this.a, ", mimeType=", this.b, ")");
    }
}
