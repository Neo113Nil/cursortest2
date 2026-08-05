package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class aa {
    public final LinkedHashMap qoPGr6Ce = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof aa) {
            return this.qoPGr6Ce.equals(((aa) obj).qoPGr6Ce);
        }
        return false;
    }

    public final int hashCode() {
        return this.qoPGr6Ce.hashCode();
    }

    public abstract Object qoPGr6Ce(z9 z9Var);

    public final String toString() {
        return "CreationExtras(extras=" + this.qoPGr6Ce + ')';
    }
}
