package defpackage;

/* loaded from: classes4.dex */
public final class b0f implements f0f {
    public final n7n a;
    public final q7n b;

    public b0f(n7n n7nVar, q7n q7nVar) {
        this.a = n7nVar;
        this.b = q7nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0f)) {
            return false;
        }
        b0f b0fVar = (b0f) obj;
        return this.a.equals(b0fVar.a) && this.b.equals(b0fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QueryToVibeWave(wave=" + this.a + ", uiWave=" + this.b + ")";
    }
}
