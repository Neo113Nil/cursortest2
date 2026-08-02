package defpackage;

/* loaded from: classes3.dex */
public final class drr implements yqr {
    public static final eb7 d = new eb7(4);
    public final Object a = new Object();
    public volatile yqr b;
    public Object c;

    public drr(yqr yqrVar) {
        this.b = yqrVar;
    }

    @Override // defpackage.yqr
    public final Object get() {
        yqr yqrVar = this.b;
        eb7 eb7Var = d;
        if (yqrVar != eb7Var) {
            synchronized (this.a) {
                try {
                    if (this.b != eb7Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = eb7Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
