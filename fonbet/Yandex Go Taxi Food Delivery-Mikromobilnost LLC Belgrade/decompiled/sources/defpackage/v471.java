package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes7.dex */
public final class v471 extends rw81 {
    public final /* synthetic */ int x;
    public final Object y;

    public v471(gp51 gp51Var) {
        this.x = 0;
        this.y = gp51Var;
    }

    @Override // defpackage.rw81
    public final void e() {
        switch (this.x) {
            case 0:
                x771 x771Var = (x771) ((gp51) this.y).b;
                this.a = 0;
                this.c = null;
                x771Var.b.add(this);
                return;
            case 1:
                zt71 zt71Var = (zt71) this.y;
                synchronized (zt71Var.b) {
                    this.a = 0;
                    this.c = null;
                    rw81[] rw81VarArr = zt71Var.f;
                    int i = zt71Var.h;
                    zt71Var.h = i + 1;
                    rw81VarArr[i] = this;
                    if (!zt71Var.c.isEmpty() && zt71Var.h > 0) {
                        zt71Var.b.notify();
                    }
                }
                return;
            default:
                ArrayDeque arrayDeque = ((qz71) this.y).b;
                if (arrayDeque.size() >= 2) {
                    ny61.k();
                    return;
                } else {
                    if (arrayDeque.contains(this)) {
                        w511.q();
                        return;
                    }
                    this.a = 0;
                    this.c = null;
                    arrayDeque.addFirst(this);
                    return;
                }
        }
    }

    public /* synthetic */ v471(pk81 pk81Var, int i) {
        this.x = i;
        this.y = pk81Var;
    }
}
