package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bf0 implements fo, Serializable {
    public Object MdtA4re8;
    public ok NCTxEWno;

    @Override // defpackage.fo
    public final Object getValue() {
        Object obj = this.MdtA4re8;
        if (obj != re.jb9XjC4I) {
            return obj;
        }
        ok okVar = this.NCTxEWno;
        okVar.getClass();
        Object qoPGr6Ce = okVar.qoPGr6Ce();
        this.MdtA4re8 = qoPGr6Ce;
        this.NCTxEWno = null;
        return qoPGr6Ce;
    }

    public final String toString() {
        return this.MdtA4re8 != re.jb9XjC4I ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
