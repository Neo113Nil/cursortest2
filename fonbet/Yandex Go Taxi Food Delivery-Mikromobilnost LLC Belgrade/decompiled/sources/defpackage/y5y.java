package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class y5y {
    public final Object a;
    public final z5y b;
    public int d;
    public y5y e;
    public boolean f;
    public int c = -1;
    public final oz40 g = f.j(null);

    public y5y(Object obj, z5y z5yVar) {
        this.a = obj;
        this.b = z5yVar;
    }

    public final y5y a() {
        if (this.f) {
            lxv.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            y5y y5yVar = (y5y) this.g.getValue();
            if (y5yVar != null) {
                y5yVar.a();
            } else {
                y5yVar = null;
            }
            this.e = y5yVar;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            lxv.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            y5y y5yVar = this.e;
            if (y5yVar != null) {
                y5yVar.b();
            }
            this.e = null;
        }
    }
}
