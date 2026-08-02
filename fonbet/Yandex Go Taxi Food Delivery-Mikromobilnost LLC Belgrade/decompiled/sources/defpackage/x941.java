package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class x941 implements xbi0 {
    public WeakReference a;

    public x941(hd1 hd1Var) {
        this.a = hd1Var != null ? new WeakReference(hd1Var) : null;
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

    public x941() {
        this(null);
    }
}
