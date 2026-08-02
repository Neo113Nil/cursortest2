package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class jv7 extends bg3 {
    public final bg3 t;
    public volatile boolean u;
    public List v = new ArrayList();

    public jv7(bg3 bg3Var) {
        this.t = bg3Var;
    }

    @Override // defpackage.bg3
    public final void Q(sgr sgrVar, s2i s2iVar) {
        s0(new nud(4, this, sgrVar, s2iVar));
    }

    @Override // defpackage.bg3
    public final void R(s2i s2iVar) {
        if (this.u) {
            this.t.R(s2iVar);
        } else {
            s0(new x8x(this, s2iVar, false, 22));
        }
    }

    @Override // defpackage.bg3
    public final void S(Object obj) {
        if (this.u) {
            this.t.S(obj);
        } else {
            s0(new x8x(this, obj, false, 23));
        }
    }

    @Override // defpackage.bg3
    public final void T() {
        if (this.u) {
            this.t.T();
        } else {
            s0(new q9(16, this));
        }
    }

    public final void s0(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.u) {
                    runnable.run();
                } else {
                    this.v.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
