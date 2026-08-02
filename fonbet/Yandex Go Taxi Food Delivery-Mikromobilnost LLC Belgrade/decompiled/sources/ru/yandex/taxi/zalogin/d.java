package ru.yandex.taxi.zalogin;

import android.app.Activity;
import android.view.ViewGroup;
import defpackage.b7;
import defpackage.cne0;
import defpackage.eky;
import defpackage.h3y;
import defpackage.im51;
import defpackage.mdh;
import defpackage.n20;
import defpackage.ou4;
import defpackage.sjh;
import defpackage.sjy;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uch0;
import defpackage.uyj;
import defpackage.xjy;
import defpackage.y50;
import defpackage.yjy;
import defpackage.zky;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes10.dex */
public final class d {
    public final tse a;
    public final ru.yandex.taxi.am.g b;
    public final h3y c;
    public final h3y d;
    public final Activity e;
    public final eky f;
    public final y50 g;
    public final h3y h;
    public final h3y i;
    public final ru.yandex.taxi.activity.g j;
    public final zky k;
    public final tt2 l;
    public final im51 m;
    public Events$Zalogin$LinkageContext n;
    public SimpleSpinnerModalView o;
    public boolean p;
    public boolean q = true;
    public final a r = new a(this);

    public d(tse tseVar, ru.yandex.taxi.am.g gVar, h3y h3yVar, h3y h3yVar2, Activity activity, eky ekyVar, y50 y50Var, h3y h3yVar3, h3y h3yVar4, ru.yandex.taxi.activity.g gVar2, zky zkyVar, tt2 tt2Var, im51 im51Var) {
        this.a = tseVar;
        this.b = gVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = activity;
        this.f = ekyVar;
        this.g = y50Var;
        this.h = h3yVar3;
        this.i = h3yVar4;
        this.j = gVar2;
        this.k = zkyVar;
        this.l = tt2Var;
        this.m = im51Var;
    }

    public final void a() {
        SimpleSpinnerModalView simpleSpinnerModalView = this.o;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
        this.o = null;
    }

    public final void b(Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, yjy yjyVar, Runnable runnable, Runnable runnable2) {
        this.n = events$Zalogin$LinkageContext;
        if (((j) this.d.get()).f == null) {
            tje.N(this.a, null, null, new CoreAccountLinker$loginPortalAndLink$1(this, events$Zalogin$LinkageContext, null, runnable, null), 3);
            return;
        }
        k kVar = (k) this.i.get();
        xjy xjyVar = (xjy) kVar.h.get();
        Activity activity = kVar.f;
        LinkAccountsFullscreen a = xjyVar.a(activity, true, yjyVar, events$Zalogin$LinkageContext);
        a.setOnSuccessLinkage(runnable);
        a.setOnAppearingListener(new ou4(5, kVar, runnable2));
        ((ViewGroup) activity.requireViewById(uch0.splash_view_overlay)).addView(a);
    }

    public final boolean c() {
        if (!this.q) {
            return false;
        }
        this.m.getClass();
        eky ekyVar = this.f;
        if (!((cne0) ekyVar.b).f(ekyVar.x)) {
            return false;
        }
        ru.yandex.taxi.am.g gVar = this.b;
        return gVar.f() && gVar.a.Mg() && !((com.yandex.go.taxi.order.provider.a) ((n20) this.c.get())).r();
    }

    public final void d(boolean z) {
        zky zkyVar = this.k;
        if (z) {
            zkyVar.a(this.e, new b7(18, this));
        } else {
            AlertDialog alertDialog = zkyVar.a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }
    }

    public final void e() {
        this.p = false;
        ((sjy) this.h.get()).b(this.r);
        f();
        tje.N(this.a, null, null, new CoreAccountLinker$startCheckAccounts$$inlined$safeCollectIn$1(new c(((j) this.d.get()).g), null, this), 3);
    }

    public final void f() {
        tpr e = ((j) this.d.get()).e();
        this.l.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, null, null, new CoreAccountLinker$subscribeToLinkCandidate$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(e, mdh.b), null, this), 3);
    }
}
