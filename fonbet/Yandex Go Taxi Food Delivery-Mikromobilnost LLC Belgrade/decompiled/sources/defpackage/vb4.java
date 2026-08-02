package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes9.dex */
public final class vb4 extends t8x {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(vb4.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long E = wb4.a.objectFieldOffset(vb4.class.getDeclaredField("_disposer$volatile"));
    public final j18 A;
    public m1k B;
    public final /* synthetic */ yb4 C;
    private volatile /* synthetic */ Object _disposer$volatile;

    public vb4(yb4 yb4Var, j18 j18Var) {
        this.C = yb4Var;
        this.A = j18Var;
    }

    @Override // defpackage.t8x
    public final boolean n() {
        return false;
    }

    @Override // defpackage.t8x
    public final void o(Throwable th) {
        j18 j18Var = this.A;
        if (th != null) {
            j18Var.getClass();
            jb20 I = j18Var.I(new tzc(th, false), null);
            if (I != null) {
                j18Var.j(I);
                xb4 p = p();
                if (p != null) {
                    p.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yb4.b;
        yb4 yb4Var = this.C;
        if (atomicIntegerFieldUpdater.decrementAndGet(yb4Var) == 0) {
            noh[] nohVarArr = yb4Var.a;
            ArrayList arrayList = new ArrayList(nohVarArr.length);
            for (noh nohVar : nohVarArr) {
                arrayList.add(nohVar.c());
            }
            j18Var.resumeWith(arrayList);
        }
    }

    public final xb4 p() {
        D.getClass();
        return (xb4) wb4.a.getObjectVolatile(this, E);
    }

    public final void q(xb4 xb4Var) {
        D.getClass();
        wb4.a.putObjectVolatile(this, E, xb4Var);
    }
}
