package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class fr5 extends js2 {
    public final HashMap h = new HashMap();
    public Handler i;
    public t6t j;

    public abstract void D(Object obj, wvh wvhVar, sis sisVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [cr5, vvh] */
    public final void E(final Object obj, wvh wvhVar) {
        HashMap hashMap = this.h;
        vq1.v(!hashMap.containsKey(obj));
        ?? r1 = new vvh() { // from class: cr5
            @Override // defpackage.vvh
            public final void a(wvh wvhVar2, sis sisVar) {
                fr5.this.D(obj, wvhVar2, sisVar);
            }
        };
        dr5 dr5Var = new dr5(this, obj);
        hashMap.put(obj, new er5(wvhVar, r1, dr5Var));
        Handler handler = this.i;
        handler.getClass();
        wvhVar.b(handler, dr5Var);
        Handler handler2 = this.i;
        handler2.getClass();
        wvhVar.k(handler2, dr5Var);
        t6t t6tVar = this.j;
        ndl ndlVar = this.g;
        vq1.B(ndlVar);
        wvhVar.l(r1, t6tVar, ndlVar);
        if (this.b.isEmpty()) {
            wvhVar.m(r1);
        }
    }

    @Override // defpackage.wvh
    public void p() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((er5) it.next()).a.p();
        }
    }

    @Override // defpackage.js2
    public final void u() {
        for (er5 er5Var : this.h.values()) {
            er5Var.a.m(er5Var.b);
        }
    }

    @Override // defpackage.js2
    public final void w() {
        for (er5 er5Var : this.h.values()) {
            er5Var.a.j(er5Var.b);
        }
    }

    @Override // defpackage.js2
    public void z() {
        HashMap hashMap = this.h;
        for (er5 er5Var : hashMap.values()) {
            wvh wvhVar = er5Var.a;
            dr5 dr5Var = er5Var.c;
            wvhVar.h(er5Var.b);
            wvhVar.c(dr5Var);
            wvhVar.e(dr5Var);
        }
        hashMap.clear();
    }

    public uvh A(Object obj, uvh uvhVar) {
        return uvhVar;
    }

    public long B(long j, Object obj) {
        return j;
    }

    public int C(int i, Object obj) {
        return i;
    }
}
