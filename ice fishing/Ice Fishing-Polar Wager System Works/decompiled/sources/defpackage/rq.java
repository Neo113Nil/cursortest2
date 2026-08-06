package defpackage;

/* loaded from: classes.dex */
public final class rq implements defpackage.oy0 {
    public static final java.lang.Object r1MBDhnF = new java.lang.Object();
    public volatile defpackage.oy0 IHQe1A4L2xu;
    public volatile java.lang.Object oh6vYeIP;

    public static defpackage.oy0 IHQe1A4L2xu(defpackage.oy0 oy0Var) {
        if (oy0Var instanceof defpackage.rq) {
            return oy0Var;
        }
        defpackage.rq rqVar = new defpackage.rq();
        rqVar.oh6vYeIP = r1MBDhnF;
        rqVar.IHQe1A4L2xu = oy0Var;
        return rqVar;
    }

    @Override // defpackage.oy0
    public final java.lang.Object get() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.oh6vYeIP;
        java.lang.Object obj3 = r1MBDhnF;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.oh6vYeIP;
            if (obj == obj3) {
                obj = this.IHQe1A4L2xu.get();
                java.lang.Object obj4 = this.oh6vYeIP;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.oh6vYeIP = obj;
                this.IHQe1A4L2xu = null;
            }
        }
        return obj;
    }
}
