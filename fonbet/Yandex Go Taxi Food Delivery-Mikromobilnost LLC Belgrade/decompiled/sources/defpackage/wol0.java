package defpackage;

import defpackage.yol0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wol0 extends yol0.a implements Iterator {
    public vol0 a;
    public boolean b = true;
    public final /* synthetic */ yol0 c;

    public wol0(yol0 yol0Var) {
        this.c = yol0Var;
    }

    @Override // yol0.a
    public final void a(vol0 vol0Var) {
        vol0 vol0Var2 = this.a;
        if (vol0Var == vol0Var2) {
            vol0 vol0Var3 = vol0Var2.w;
            this.a = vol0Var3;
            this.b = vol0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        vol0 vol0Var = this.a;
        return (vol0Var == null || vol0Var.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            vol0 vol0Var = this.a;
            this.a = vol0Var != null ? vol0Var.c : null;
        }
        return this.a;
    }
}
