package ru.yandex.taxi.am;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.a60;
import defpackage.bd90;
import defpackage.ck;
import defpackage.dhv;
import defpackage.ec1;
import defpackage.ep90;
import defpackage.fhz;
import defpackage.i3y;
import defpackage.nk3;
import defpackage.no90;
import defpackage.on2;
import defpackage.pux;
import defpackage.qz10;
import defpackage.rx2;
import defpackage.tje;
import defpackage.tse;
import defpackage.vo90;
import defpackage.y50;
import io.appmetrica.analytics.BuildConfig;
import java.util.HashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes9.dex */
public final class f {
    public final Activity a;
    public final g b;
    public final y50 c;
    public final ru.yandex.taxi.startup.launch.h d;
    public final ru.yandex.taxi.startup.launch.c e;
    public final pux f;
    public final fhz g;
    public final tse h;
    public final ep90 i;
    public nk3 j;
    public ru.yandex.taxi.zalogin.e k;
    public SimpleSpinnerModalView l;
    public boolean m;
    public final i3y n;

    public f(on2 on2Var, Activity activity, g gVar, y50 y50Var, ru.yandex.taxi.startup.launch.h hVar, ru.yandex.taxi.startup.launch.c cVar, pux puxVar, fhz fhzVar, tse tseVar, ep90 ep90Var) {
        this.a = activity;
        this.b = gVar;
        this.c = y50Var;
        this.d = hVar;
        this.e = cVar;
        this.f = puxVar;
        this.g = fhzVar;
        this.h = tseVar;
        this.i = ep90Var;
        this.n = kotlin.a.a(new ck(on2Var, 0));
    }

    public final void a(ru.yandex.taxi.zalogin.e eVar, dhv dhvVar) {
        this.k = eVar;
        tje.N(this.h, null, null, new AccountConfirmationHandler$checkConfirmation$1(this, eVar, dhvVar, null), 3);
    }

    public final void b(String str) {
        g gVar = this.b;
        if (gVar.f()) {
            boolean Mg = gVar.a.Mg();
            y50 y50Var = this.c;
            fhz fhzVar = this.g;
            try {
                if (Mg) {
                    rx2 rx2Var = fhzVar.e;
                    Long valueOf = Long.valueOf(fhzVar.b.x.a().a);
                    rx2Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("phone_uid", valueOf);
                    rx2Var.a.a("Zalogin.ConfirmPhonishShown", hashMap, 1, new HashMap());
                    no90 no90Var = gVar.c;
                    long j = gVar.a.x.a().a;
                    com.yandex.passport.internal.autologin.ui.h b = no90Var.f.b();
                    Application application = no90Var.a;
                    vo90 vo90Var = no90Var.c;
                    Filter a = no90Var.e.a(new bd90(9));
                    vo90Var.getClass();
                    LoginProperties.a aVar = new LoginProperties.a();
                    aVar.e(a);
                    aVar.h(vo90Var.b.a());
                    aVar.d();
                    LoginProperties.Companion.getClass();
                    LoginProperties b2 = com.yandex.passport.internal.properties.i.b(aVar);
                    LoginProperties.a aVar2 = new LoginProperties.a();
                    aVar2.b(b2);
                    aVar2.A = no90Var.c(j);
                    aVar2.k(no90Var.g);
                    Intent i = b.b.i(application, com.yandex.passport.internal.properties.i.b(aVar2));
                    a60 a60Var = (a60) y50Var;
                    a60Var.getClass();
                    a60Var.e(HProv.PP_NK_SYNC, i);
                } else {
                    fhzVar.e();
                    no90 no90Var2 = gVar.c;
                    long j2 = gVar.a.x.a().a;
                    com.yandex.passport.internal.autologin.ui.h b3 = no90Var2.f.b();
                    Intent i2 = b3.b.i(no90Var2.a, no90Var2.c.b(no90Var2.e.a(new qz10(16)), new ec1(no90Var2, j2, str, 9)));
                    a60 a60Var2 = (a60) y50Var;
                    a60Var2.getClass();
                    a60Var2.e(BuildConfig.API_LEVEL, i2);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public final void c() {
        this.m = false;
        SimpleSpinnerModalView simpleSpinnerModalView = this.l;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
            this.l = null;
        }
    }

    public final void d(Throwable th) {
        nk3 nk3Var = this.j;
        if (nk3Var != null) {
            nk3Var.b(th);
        }
    }

    public final void e() {
        fhz fhzVar = this.g;
        rx2 rx2Var = fhzVar.e;
        Long valueOf = Long.valueOf(fhzVar.b.x.a().a);
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("portal_uid", valueOf);
        rx2Var.a.a("Zalogin.ConfirmPortalSuccess", hashMap, 1, new HashMap());
        tje.N(this.h, null, null, new AccountConfirmationHandler$requestLaunch$1(this, "processPortalConfirmResult", null), 3);
    }
}
