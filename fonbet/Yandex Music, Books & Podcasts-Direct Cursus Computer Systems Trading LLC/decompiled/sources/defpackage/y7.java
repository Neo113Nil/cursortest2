package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class y7 extends f8 implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map d;
    public transient int e;

    public final void c() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.d.clear();
        this.e = 0;
    }

    public abstract Map d();

    public abstract Collection e();

    public abstract Set f();

    public final Collection g() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        e8 e8Var = new e8(0, this);
        this.b = e8Var;
        return e8Var;
    }
}
