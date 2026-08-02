package defpackage;

/* loaded from: classes3.dex */
public final class vc0 extends wc0 {
    public final s9p a;

    public vc0(s9p s9pVar) {
        this.a = s9pVar;
    }

    @Override // defpackage.wc0
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc0) && this.a.equals(((vc0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "WaveAndroidAutoPlayableItem(seeds=" + this.a + ")";
    }
}
