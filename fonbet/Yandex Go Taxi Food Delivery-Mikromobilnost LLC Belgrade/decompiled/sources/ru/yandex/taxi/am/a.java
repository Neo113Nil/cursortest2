package ru.yandex.taxi.am;

import android.content.Intent;
import android.view.ViewGroup;
import com.yandex.passport.api.PassportLoginAction;
import defpackage.as6;
import defpackage.bgb0;
import defpackage.fhz;
import defpackage.jst;
import defpackage.lx4;
import defpackage.na1;
import defpackage.nk3;
import defpackage.r40;
import defpackage.r660;
import defpackage.teh0;
import defpackage.tje;
import defpackage.um3;
import defpackage.vpr;
import defpackage.w511;
import defpackage.yes0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ a(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        com.yandex.passport.api.w wVar;
        com.yandex.passport.api.w wVar2;
        nk3 nk3Var;
        switch (this.a) {
            case 0:
                r40 r40Var = (r40) obj;
                f fVar = (f) this.b.i.getValue();
                fhz fhzVar = fVar.g;
                Intent intent = r40Var.c;
                if (intent != null) {
                    fVar.i.b();
                    wVar = com.yandex.passport.api.r.d(r40Var.a, intent);
                } else {
                    wVar = null;
                }
                if (wVar instanceof com.yandex.passport.api.u) {
                    String c = ((com.yandex.passport.api.u) wVar).c();
                    if (c == null || c.length() == 0) {
                        fhzVar.d("Phone from bind result is null");
                        fVar.d(new IllegalStateException("Phone from bind result is null"));
                    } else {
                        String Ig = fVar.d.Ig();
                        String b = (Ig == null || Ig.length() == 0) ? null : bgb0.b(Ig);
                        String b2 = bgb0.b(c);
                        if (fVar.m) {
                            yes0 yes0Var = SimpleSpinnerModalView.Companion;
                            ViewGroup viewGroup = (ViewGroup) fVar.a.findViewById(teh0.top_fullscreen_modal_views_container);
                            yes0Var.getClass();
                            fVar.l = yes0.c(viewGroup, false, false);
                        }
                        if (b2.equals(b)) {
                            fVar.e();
                        } else {
                            tje.N(fVar.h, null, null, new AccountConfirmationHandler$processPortalConfirmResult$1(fVar, b2, null), 3);
                        }
                    }
                } else {
                    fhzVar.d("Portal account confirm activity cancelled");
                    fVar.d(new IllegalStateException("Portal account confirm activity cancelled"));
                }
                return zy11.a;
            case 1:
                r40 r40Var2 = (r40) obj;
                f fVar2 = (f) this.b.i.getValue();
                fVar2.getClass();
                Intent intent2 = r40Var2.c;
                if (intent2 != null) {
                    fVar2.i.b();
                    wVar2 = com.yandex.passport.api.r.d(r40Var2.a, intent2);
                } else {
                    wVar2 = null;
                }
                if (wVar2 instanceof com.yandex.passport.api.u) {
                    com.yandex.passport.api.u uVar = (com.yandex.passport.api.u) wVar2;
                    if (fVar2.m) {
                        yes0 yes0Var2 = SimpleSpinnerModalView.Companion;
                        ViewGroup viewGroup2 = (ViewGroup) fVar2.a.findViewById(teh0.top_fullscreen_modal_views_container);
                        yes0Var2.getClass();
                        fVar2.l = yes0.c(viewGroup2, false, false);
                    }
                    tje.N(fVar2.h, null, null, new AccountConfirmationHandler$processPhonishConfirmResult$1(fVar2, uVar, null), 3);
                } else {
                    fVar2.g.c("Phonish account confirm activity cancelled");
                    fVar2.d(new IllegalStateException("Phonish account confirm activity cancelled"));
                }
                return zy11.a;
            default:
                r40 r40Var3 = (r40) obj;
                e eVar = (e) this.b.h.getValue();
                eVar.getClass();
                Intent intent3 = r40Var3.c;
                if (intent3 == null) {
                    eVar.b();
                } else {
                    new com.yandex.passport.internal.autologin.ui.h(eVar.j.a().t().a, 2);
                    com.yandex.passport.api.w d = com.yandex.passport.api.r.d(r40Var3.a, intent3);
                    if (d instanceof com.yandex.passport.api.u) {
                        r660 r660Var = eVar.k;
                        PassportLoginAction a = ((com.yandex.passport.api.u) d).a();
                        r660Var.a = a == PassportLoginAction.REGISTRATION || a == PassportLoginAction.REG_NEO_PHONISH;
                        fhz fhzVar2 = eVar.g;
                        lx4 lx4Var = fhzVar2.a;
                        ((na1) fhzVar2.c).getClass();
                        ((ru.yandex.taxi.analytics.j) lx4Var).v(as6.u());
                        SimpleSpinnerModalView simpleSpinnerModalView = eVar.a.b;
                        if (simpleSpinnerModalView != null) {
                            simpleSpinnerModalView.startSpinner();
                        }
                        um3 um3Var = eVar.l;
                        if (um3Var != null && (nk3Var = um3Var.b) != null) {
                            nk3Var.a();
                        }
                        tje.N(eVar.i, null, null, new AccountAuthorizationHandler$handleLoginResult$1(eVar, d, null), 3);
                    } else if (d.equals(com.yandex.passport.api.q.a)) {
                        eVar.b();
                    } else if (d.equals(com.yandex.passport.api.t.a)) {
                        jst.e.q("Passport login return Forbidden");
                        eVar.b();
                    } else if (d instanceof com.yandex.passport.api.v) {
                        jst.e.q("Passport login return OpenUrl unprocessed");
                        eVar.b();
                    } else {
                        if (!(d instanceof com.yandex.passport.api.s)) {
                            w511.b();
                            return null;
                        }
                        jst.e.r("Passport login return FailedWithException unprocessed", ((com.yandex.passport.api.s) d).a());
                        eVar.b();
                    }
                }
                return zy11.a;
        }
    }
}
