package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class y9z implements eq60 {
    public y9z a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // defpackage.eq60
    public final void e(Object obj) {
        vd41 vd41Var = (vd41) obj;
        y9z y9zVar = this.a;
        if (y9zVar != null) {
            y9zVar.e(vd41Var);
        } else {
            this.b.add(vd41Var);
        }
    }

    @Override // defpackage.eq60
    public final void f(Object obj) {
        vd41 vd41Var = (vd41) obj;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (!copyOnWriteArrayList.isEmpty()) {
            copyOnWriteArrayList.remove(vd41Var);
        }
        y9z y9zVar = this.a;
        if (y9zVar != null) {
            y9zVar.f(vd41Var);
        }
    }
}
