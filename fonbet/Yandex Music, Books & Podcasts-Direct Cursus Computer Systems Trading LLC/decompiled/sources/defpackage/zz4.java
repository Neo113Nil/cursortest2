package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class zz4 extends x5 {
    public final t9f b;

    public zz4(t9f t9fVar) {
        super(0);
        this.b = t9fVar;
    }

    @Override // defpackage.x5
    public final void h(tq5 tq5Var, Object obj, int i, int i2) {
        if (i2 < 0) {
            xq0.x("Size must be known in advance when using READ_ALL");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            i(tq5Var, i + i3, obj);
        }
    }

    @Override // defpackage.x5
    public void i(tq5 tq5Var, int i, Object obj) {
        l(i, obj, tq5Var.z(getDescriptor(), i, this.b, null));
    }

    public abstract void l(int i, Object obj, Object obj2);

    @Override // defpackage.x5, defpackage.t9f
    public void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        int e = e(obj);
        mhp descriptor = getDescriptor();
        wq5 t = l6bVar.t(descriptor, e);
        Iterator d = d(obj);
        for (int i = 0; i < e; i++) {
            t.k(getDescriptor(), i, this.b, d.next());
        }
        t.b(descriptor);
    }
}
