package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class cb0 implements fo, Serializable {
    public ok NCTxEWno;
    public volatile Object MdtA4re8 = re.jb9XjC4I;
    public final Object wxUZMvaN = this;

    public cb0(ok okVar) {
        this.NCTxEWno = okVar;
    }

    @Override // defpackage.fo
    public final Object getValue() {
        Object obj;
        Object obj2 = this.MdtA4re8;
        re reVar = re.jb9XjC4I;
        if (obj2 != reVar) {
            return obj2;
        }
        synchronized (this.wxUZMvaN) {
            obj = this.MdtA4re8;
            if (obj == reVar) {
                ok okVar = this.NCTxEWno;
                okVar.getClass();
                obj = okVar.qoPGr6Ce();
                this.MdtA4re8 = obj;
                this.NCTxEWno = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.MdtA4re8 != re.jb9XjC4I ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
