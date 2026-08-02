package defpackage;

import defpackage.yol0;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class xol0 extends yol0.a implements Iterator {
    public vol0 a;
    public vol0 b;

    public xol0(vol0 vol0Var, vol0 vol0Var2) {
        this.a = vol0Var2;
        this.b = vol0Var;
    }

    @Override // yol0.a
    public final void a(vol0 vol0Var) {
        vol0 vol0Var2 = null;
        if (this.a == vol0Var && vol0Var == this.b) {
            this.b = null;
            this.a = null;
        }
        vol0 vol0Var3 = this.a;
        if (vol0Var3 == vol0Var) {
            this.a = b(vol0Var3);
        }
        vol0 vol0Var4 = this.b;
        if (vol0Var4 == vol0Var) {
            vol0 vol0Var5 = this.a;
            if (vol0Var4 != vol0Var5 && vol0Var5 != null) {
                vol0Var2 = c(vol0Var4);
            }
            this.b = vol0Var2;
        }
    }

    public abstract vol0 b(vol0 vol0Var);

    public abstract vol0 c(vol0 vol0Var);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        vol0 vol0Var = this.b;
        vol0 vol0Var2 = this.a;
        this.b = (vol0Var == vol0Var2 || vol0Var2 == null) ? null : c(vol0Var);
        return vol0Var;
    }
}
