package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class bsm extends zz4 {
    public final asm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsm(t9f t9fVar) {
        super(t9fVar);
        t9fVar.getClass();
        this.c = new asm(t9fVar.getDescriptor());
    }

    @Override // defpackage.x5
    public final Object a() {
        return (zrm) j(m());
    }

    @Override // defpackage.x5
    public final int b(Object obj) {
        zrm zrmVar = (zrm) obj;
        zrmVar.getClass();
        return zrmVar.d();
    }

    @Override // defpackage.x5
    public final void c(int i, Object obj) {
        zrm zrmVar = (zrm) obj;
        zrmVar.getClass();
        zrmVar.b(i);
    }

    @Override // defpackage.x5
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.x5, defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return f(eg7Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.c;
    }

    @Override // defpackage.x5
    public final Object k(Object obj) {
        zrm zrmVar = (zrm) obj;
        zrmVar.getClass();
        return zrmVar.a();
    }

    @Override // defpackage.zz4
    public final void l(int i, Object obj, Object obj2) {
        ((zrm) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object m();

    public abstract void n(wq5 wq5Var, Object obj, int i);

    @Override // defpackage.zz4, defpackage.x5, defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        int e = e(obj);
        asm asmVar = this.c;
        wq5 t = l6bVar.t(asmVar, e);
        n(t, obj, e);
        t.b(asmVar);
    }
}
