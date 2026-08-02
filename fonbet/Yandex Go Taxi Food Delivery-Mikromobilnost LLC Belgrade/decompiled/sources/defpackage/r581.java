package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class r581 implements xbi0 {
    public WeakReference a;

    public r581(Object obj) {
        this.a = new WeakReference(obj);
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        return this.a.get();
    }

    @Override // defpackage.xbi0
    public final void setValue(Object obj, kgx kgxVar, Object obj2) {
        this.a = new WeakReference(obj2);
    }
}
