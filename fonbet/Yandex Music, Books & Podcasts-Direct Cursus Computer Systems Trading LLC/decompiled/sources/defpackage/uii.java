package defpackage;

/* loaded from: classes3.dex */
public final class uii implements zii {
    public final n7n a;

    public uii(n7n n7nVar) {
        this.a = n7nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uii) && this.a.equals(((uii) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.zii
    public final boolean r() {
        return true;
    }

    public final String toString() {
        return "QueryToVibe(queryToVibeWaveItem=" + this.a + ")";
    }
}
