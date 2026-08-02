package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class eh2 extends y2f {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(eh2.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final zt3 e;
    public qa8 f;
    public final /* synthetic */ gh2 g;

    public eh2(gh2 gh2Var, zt3 zt3Var) {
        this.g = gh2Var;
        this.e = zt3Var;
    }

    @Override // defpackage.y2f
    public final boolean k() {
        return false;
    }

    @Override // defpackage.y2f
    public final void l(Throwable th) {
        zt3 zt3Var = this.e;
        if (th != null) {
            zt3Var.getClass();
            js3 G = zt3Var.G(new sm5(th, false), null);
            if (G != null) {
                zt3Var.r(G);
                fh2 fh2Var = (fh2) h.get(this);
                if (fh2Var != null) {
                    fh2Var.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = gh2.b;
        gh2 gh2Var = this.g;
        if (atomicIntegerFieldUpdater.decrementAndGet(gh2Var) == 0) {
            mu7[] mu7VarArr = gh2Var.a;
            ArrayList arrayList = new ArrayList(mu7VarArr.length);
            for (mu7 mu7Var : mu7VarArr) {
                arrayList.add(mu7Var.o());
            }
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(arrayList);
        }
    }
}
