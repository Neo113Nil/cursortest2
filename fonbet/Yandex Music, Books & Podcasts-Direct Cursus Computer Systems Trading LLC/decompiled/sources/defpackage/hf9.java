package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class hf9 extends n7w {
    public final ff9 i;
    public final LinkedHashMap j = new LinkedHashMap();
    public final c11 k = new c11(2);
    public final AtomicBoolean l = new AtomicBoolean();
    public final AtomicBoolean m = new AtomicBoolean();

    public hf9(ff9 ff9Var) {
        this.i = ff9Var;
    }

    public static final void h0(hf9 hf9Var) {
        Map o;
        int i;
        int i2;
        synchronized (d51.l) {
        }
        qht qhtVar = qht.a;
        if (!qhtVar.a()) {
            qhtVar.b(new gf9(hf9Var, 3));
            return;
        }
        synchronized (hf9Var.j) {
            o = uah.o(hf9Var.j);
        }
        int size = o.size();
        if (o.isEmpty()) {
            i = 0;
        } else {
            Iterator it = o.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (((dom) ((Map.Entry) it.next()).getValue()).c) {
                    i++;
                }
            }
        }
        int i3 = size - i;
        int i4 = hf9Var.k.b;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i4 + i3;
        if (o.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it2 = o.entrySet().iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((dom) ((Map.Entry) it2.next()).getValue()).b) {
                    i2++;
                }
            }
        }
        int size2 = hf9Var.k.a.size() + i2;
        if (i5 == 0 && hf9Var.l.get() && hf9Var.m.compareAndSet(false, true)) {
            hf9Var.i.a(size2 != 0);
        }
    }

    @Override // defpackage.n7w
    public final void S() {
        i0();
    }

    @Override // defpackage.n7w
    public final void U(Throwable th) {
        synchronized (d51.l) {
        }
        qht qhtVar = qht.a;
        if (!qhtVar.a()) {
            qhtVar.b(new pv7(this, th, false, 3));
            return;
        }
        c11 c11Var = this.k;
        if (th == null) {
            th = new UnknownError("No stack provided");
        }
        c11Var.a.add(th);
        c11Var.b--;
        h0(this);
    }

    @Override // defpackage.n7w
    public final void W(p9 p9Var) {
        i0();
    }

    @Override // defpackage.n7w
    public final void X(qq3 qq3Var) {
        i0();
    }

    public final void i0() {
        synchronized (d51.l) {
        }
        qht qhtVar = qht.a;
        if (!qhtVar.a()) {
            qhtVar.b(new gf9(this, 0));
            return;
        }
        c11 c11Var = this.k;
        c11Var.b--;
        h0(this);
    }

    public final void j0() {
        synchronized (d51.l) {
        }
        qht qhtVar = qht.a;
        if (!qhtVar.a()) {
            qhtVar.b(new gf9(this, 1));
        } else {
            this.l.set(true);
            h0(this);
        }
    }

    public final dom k0(String str) {
        String str2 = "preload#" + new Object().hashCode() + '/' + str;
        dom domVar = new dom(str, new rs6(25, this));
        synchronized (this.j) {
            this.j.put(str2, domVar);
        }
        return domVar;
    }
}
