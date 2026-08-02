package defpackage;

/* loaded from: classes3.dex */
public final class uxl implements xxl {
    public final nyl a;
    public final boolean b;

    public uxl(nyl nylVar, boolean z) {
        this.a = nylVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxl)) {
            return false;
        }
        uxl uxlVar = (uxl) obj;
        return this.a.equals(uxlVar.a) && this.b == uxlVar.b;
    }

    @Override // defpackage.xxl
    public final int getCount() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EmptyBlock(playlistInfo=" + this.a + ", offlineMode=" + this.b + ")";
    }
}
