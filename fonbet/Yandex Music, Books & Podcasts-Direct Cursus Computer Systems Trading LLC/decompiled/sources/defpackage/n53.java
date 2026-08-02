package defpackage;

/* loaded from: classes3.dex */
public final class n53 implements o53 {
    public final boolean a;
    public final long b;
    public final boolean c;
    public final thr d;

    public n53(boolean z, long j, boolean z2, thr thrVar) {
        thrVar.getClass();
        this.a = z;
        this.b = j;
        this.c = z2;
        this.d = thrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n53)) {
            return false;
        }
        n53 n53Var = (n53) obj;
        return this.a == n53Var.a && this.b == n53Var.b && this.c == n53Var.c && this.d == n53Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e(tlm.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Success(isOfflineMode=" + this.a + ", downloadedTracksSize=" + this.b + ", isChangeStorageAvailable=" + this.c + ", storageRoot=" + this.d + ")";
    }
}
