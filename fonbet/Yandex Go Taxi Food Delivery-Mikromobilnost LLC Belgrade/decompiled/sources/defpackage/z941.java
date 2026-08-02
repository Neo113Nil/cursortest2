package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class z941 implements xbi0 {
    public WeakReference a;

    public z941(int i) {
        this.a = null;
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

    public z941() {
        this(0);
    }
}
