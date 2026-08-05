package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qd implements n00 {
    public static final Object MdtA4re8 = new Object();
    public volatile Object NCTxEWno;
    public volatile n00 qoPGr6Ce;

    public static n00 qoPGr6Ce(n00 n00Var) {
        if (n00Var instanceof qd) {
            return n00Var;
        }
        qd qdVar = new qd();
        qdVar.NCTxEWno = MdtA4re8;
        qdVar.qoPGr6Ce = n00Var;
        return qdVar;
    }

    @Override // defpackage.n00
    public final Object get() {
        Object obj;
        Object obj2 = this.NCTxEWno;
        Object obj3 = MdtA4re8;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.NCTxEWno;
            if (obj == obj3) {
                obj = this.qoPGr6Ce.get();
                Object obj4 = this.NCTxEWno;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.NCTxEWno = obj;
                this.qoPGr6Ce = null;
            }
        }
        return obj;
    }
}
