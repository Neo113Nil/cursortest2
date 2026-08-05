package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q40 implements fo, Serializable {
    public static final AtomicReferenceFieldUpdater wxUZMvaN = AtomicReferenceFieldUpdater.newUpdater(q40.class, Object.class, "MdtA4re8");
    public volatile Object MdtA4re8;
    public volatile ok NCTxEWno;

    @Override // defpackage.fo
    public final Object getValue() {
        Object obj = this.MdtA4re8;
        re reVar = re.jb9XjC4I;
        if (obj != reVar) {
            return obj;
        }
        ok okVar = this.NCTxEWno;
        if (okVar != null) {
            Object qoPGr6Ce = okVar.qoPGr6Ce();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wxUZMvaN;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, reVar, qoPGr6Ce)) {
                if (atomicReferenceFieldUpdater.get(this) != reVar) {
                }
            }
            this.NCTxEWno = null;
            return qoPGr6Ce;
        }
        return this.MdtA4re8;
    }

    public final String toString() {
        return this.MdtA4re8 != re.jb9XjC4I ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
