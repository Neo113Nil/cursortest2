package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class js2 implements wvh {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final x0 c = new x0(new CopyOnWriteArrayList(), 0, (uvh) null);
    public final cra d = new cra(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public sis f;
    public ndl g;

    @Override // defpackage.wvh
    public final void b(Handler handler, bwh bwhVar) {
        handler.getClass();
        x0 x0Var = this.c;
        x0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) x0Var.d;
        awh awhVar = new awh();
        awhVar.a = handler;
        awhVar.b = bwhVar;
        copyOnWriteArrayList.add(awhVar);
    }

    @Override // defpackage.wvh
    public final void c(bwh bwhVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            awh awhVar = (awh) it.next();
            if (awhVar.b == bwhVar) {
                copyOnWriteArrayList.remove(awhVar);
            }
        }
    }

    @Override // defpackage.wvh
    public final void e(dra draVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            bra braVar = (bra) it.next();
            if (braVar.b == draVar) {
                copyOnWriteArrayList.remove(braVar);
            }
        }
    }

    @Override // defpackage.wvh
    public final void h(vvh vvhVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(vvhVar);
        if (!arrayList.isEmpty()) {
            m(vvhVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        z();
    }

    @Override // defpackage.wvh
    public final void j(vvh vvhVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(vvhVar);
        if (isEmpty) {
            w();
        }
    }

    @Override // defpackage.wvh
    public final void k(Handler handler, dra draVar) {
        handler.getClass();
        cra craVar = this.d;
        craVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = craVar.c;
        bra braVar = new bra();
        braVar.a = handler;
        braVar.b = draVar;
        copyOnWriteArrayList.add(braVar);
    }

    @Override // defpackage.wvh
    public final void l(vvh vvhVar, t6t t6tVar, ndl ndlVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        vq1.v(looper == null || looper == myLooper);
        this.g = ndlVar;
        sis sisVar = this.f;
        this.a.add(vvhVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(vvhVar);
            x(t6tVar);
        } else if (sisVar != null) {
            j(vvhVar);
            vvhVar.a(this, sisVar);
        }
    }

    @Override // defpackage.wvh
    public final void m(vvh vvhVar) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(vvhVar);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        u();
    }

    public final x0 t(uvh uvhVar) {
        return new x0((CopyOnWriteArrayList) this.c.d, 0, uvhVar);
    }

    public abstract void x(t6t t6tVar);

    public final void y(sis sisVar) {
        this.f = sisVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vvh) it.next()).a(this, sisVar);
        }
    }

    public abstract void z();

    public void u() {
    }

    public void w() {
    }
}
