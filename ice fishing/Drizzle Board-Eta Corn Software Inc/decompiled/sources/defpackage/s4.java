package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s4 extends t4 {
    public final Throwable qoPGr6Ce;

    public s4(Throwable th) {
        this.qoPGr6Ce = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s4) {
            return fn.qoPGr6Ce(this.qoPGr6Ce, ((s4) obj).qoPGr6Ce);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.qoPGr6Ce;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.t4
    public final String toString() {
        return "Closed(" + this.qoPGr6Ce + ')';
    }
}
