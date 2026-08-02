package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class y941 implements xbi0 {
    public WeakReference a;

    public y941(id1 id1Var) {
        this.a = id1Var != null ? new WeakReference(id1Var) : null;
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.xbi0
    public final void setValue(Object obj, kgx kgxVar, Object obj2) {
        this.a = obj2 != null ? new WeakReference(obj2) : null;
    }

    public y941() {
        this(null);
    }
}
