package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p90 extends defpackage.n90 {
    public static final defpackage.p90 P05cfTpS5W5L = new defpackage.p90(1, 0, 1);

    @Override // defpackage.n90
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.p90)) {
            return false;
        }
        if (isEmpty() && ((defpackage.p90) obj).isEmpty()) {
            return true;
        }
        defpackage.p90 p90Var = (defpackage.p90) obj;
        return this.WDYagTQQm9ns == p90Var.WDYagTQQm9ns && this.oh71FJcDz6S2 == p90Var.oh71FJcDz6S2;
    }

    @Override // defpackage.n90
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.WDYagTQQm9ns * 31) + this.oh71FJcDz6S2;
    }

    @Override // defpackage.n90
    public final boolean isEmpty() {
        return this.WDYagTQQm9ns > this.oh71FJcDz6S2;
    }

    @Override // defpackage.n90
    public final java.lang.String toString() {
        return this.WDYagTQQm9ns + ".." + this.oh71FJcDz6S2;
    }
}
