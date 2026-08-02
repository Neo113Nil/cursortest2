package defpackage;

/* loaded from: classes3.dex */
public final class q0b {
    public final String a;
    public final boolean b;

    public q0b(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0b)) {
            return false;
        }
        q0b q0bVar = (q0b) obj;
        return this.a.equals(q0bVar.a) && this.b == q0bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("EasyLoginTv(id=", this.a, ", online=", ")", this.b);
    }
}
