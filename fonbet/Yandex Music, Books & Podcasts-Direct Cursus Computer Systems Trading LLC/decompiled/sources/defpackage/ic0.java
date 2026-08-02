package defpackage;

/* loaded from: classes3.dex */
public final class ic0 implements jc0 {
    public final s9p a;

    public ic0(s9p s9pVar) {
        this.a = s9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic0) && this.a.equals(((ic0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "WaveAndroidAutoMediaId(seeds=" + this.a + ")";
    }
}
