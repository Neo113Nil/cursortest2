package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u4 {
    public static final t4 NCTxEWno = new t4();
    public final Object qoPGr6Ce;

    public /* synthetic */ u4(Object obj) {
        this.qoPGr6Ce = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u4) {
            return fn.qoPGr6Ce(this.qoPGr6Ce, ((u4) obj).qoPGr6Ce);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.qoPGr6Ce;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.qoPGr6Ce;
        if (obj instanceof s4) {
            return ((s4) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
