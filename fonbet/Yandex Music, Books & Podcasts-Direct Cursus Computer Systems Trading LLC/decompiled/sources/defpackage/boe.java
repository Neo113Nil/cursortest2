package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class boe extends rr4 implements Runnable, jpj, View.OnAttachStateChangeListener {
    public final rqv c;
    public boolean d;
    public boolean e;
    public kqv f;

    public boe(rqv rqvVar) {
        super(!rqvVar.t ? 1 : 0);
        this.c = rqvVar;
    }

    @Override // defpackage.jpj
    public final kqv G(View view, kqv kqvVar) {
        this.f = kqvVar;
        rqv rqvVar = this.c;
        wwt wwtVar = rqvVar.r;
        hqv hqvVar = kqvVar.a;
        wwtVar.f(t7g.I(hqvVar.g(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            rqvVar.s.f(t7g.I(hqvVar.g(8)));
            rqv.a(rqvVar, kqvVar);
        }
        return rqvVar.t ? kqv.b : kqvVar;
    }

    @Override // defpackage.rr4
    public final void f(vpv vpvVar) {
        this.d = false;
        this.e = false;
        kqv kqvVar = this.f;
        if (vpvVar.a.b() != 0 && kqvVar != null) {
            hqv hqvVar = kqvVar.a;
            rqv rqvVar = this.c;
            rqvVar.s.f(t7g.I(hqvVar.g(8)));
            rqvVar.r.f(t7g.I(hqvVar.g(8)));
            rqv.a(rqvVar, kqvVar);
        }
        this.f = null;
    }

    @Override // defpackage.rr4
    public final void g(vpv vpvVar) {
        this.d = true;
        this.e = true;
    }

    @Override // defpackage.rr4
    public final kqv h(kqv kqvVar, List list) {
        rqv rqvVar = this.c;
        rqv.a(rqvVar, kqvVar);
        return rqvVar.t ? kqv.b : kqvVar;
    }

    @Override // defpackage.rr4
    public final nur i(vpv vpvVar, nur nurVar) {
        this.d = false;
        return nurVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            kqv kqvVar = this.f;
            if (kqvVar != null) {
                rqv rqvVar = this.c;
                rqvVar.s.f(t7g.I(kqvVar.a.g(8)));
                rqv.a(rqvVar, kqvVar);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
