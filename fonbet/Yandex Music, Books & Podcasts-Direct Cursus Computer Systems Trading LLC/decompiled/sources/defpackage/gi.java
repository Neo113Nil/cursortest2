package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.t;
import com.yandex.passport.api.p;
import com.yandex.passport.api.r;
import com.yandex.passport.api.v;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.analytics.e;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.links.LinksHandlingActivity;
import com.yandex.passport.internal.links.h;
import com.yandex.passport.internal.report.c;
import com.yandex.passport.internal.report.e6;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.j4;
import com.yandex.passport.internal.report.p0;
import com.yandex.passport.internal.report.q0;
import com.yandex.passport.internal.report.q9;
import com.yandex.passport.internal.report.r0;
import com.yandex.passport.internal.report.r9;
import com.yandex.passport.internal.report.reporters.g;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.report.reporters.m;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.a;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.authsdk.d;
import com.yandex.passport.internal.ui.authsdk.l;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.delete.t0;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.internal.ui.sloth.q;
import com.yandex.passport.internal.ui.social.i;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.sloth.u0;
import com.yandex.passport.sloth.ui.b0;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.w;
import com.yandex.payment.sdk.ui.SplashActivity;
import com.yandex.plus.pay.ui.core.b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginResult;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.cover.upload.UploadCoverService;

/* loaded from: classes.dex */
public final /* synthetic */ class gi implements rh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        String str;
        int i = 4;
        int i2 = 1;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((Function1) ((aqi) this.b).getValue()).invoke(obj);
                return;
            case 1:
                ((xv4) ((rv4) this.b).r.getValue()).G();
                return;
            case 2:
                yz4 yz4Var = (yz4) ((hz4) this.b).n.getValue();
                x97.y(ot0.F(yz4Var), null, null, new vz4(yz4Var, continuation, 6), 3);
                return;
            case 3:
                p25 p25Var = (p25) this.b;
                cvl cvlVar = (cvl) obj;
                if (cvlVar != null) {
                    mwl mwlVar = (mwl) p25Var.m.getValue();
                    mwlVar.getClass();
                    x97.y(cmd.a, dm6.a, null, new mr6(mwlVar.a, cvlVar, (Continuation) null), 2);
                    return;
                }
                return;
            case 4:
                EasyLoginResult easyLoginResult = (EasyLoginResult) obj;
                p0b p0bVar = (p0b) ((a0b) this.b).c.getValue();
                easyLoginResult.getClass();
                p0bVar.getClass();
                if (p0bVar.d) {
                    p0bVar.d = false;
                    Object obj2 = p0bVar.c;
                    p0bVar.c = c5b.a;
                    if (easyLoginResult.isAuthorized() && p6g.C((e6l) p0bVar.b.a.c.getValue())) {
                        x97.y(cmd.a, null, null, new j57(p0bVar, obj2, continuation, 21), 3);
                        return;
                    } else {
                        ssg.a(3, "EasyLoginResultHandler", vz1.q("Login result is not authorized=", " or not playing", easyLoginResult.isAuthorized()), null);
                        return;
                    }
                }
                return;
            case 5:
                Uri uri = (Uri) obj;
                iz7 iz7Var = ((FullInfoActivity) this.b).d;
                if (iz7Var == null || uri == null) {
                    return;
                }
                ixc ixcVar = (ixc) iz7Var.d;
                if (ixcVar == null) {
                    Intrinsics.j("data");
                    throw null;
                }
                String str2 = ixcVar.a;
                if (str2 == null) {
                    dfi.r("Can't change album cover", "FullInfoPresenter");
                    return;
                }
                int i3 = UploadCoverService.f;
                FullInfoActivity fullInfoActivity = (FullInfoActivity) iz7Var.a;
                String str3 = ixcVar.b;
                str3.getClass();
                cb0.F(fullInfoActivity, str2, str3, uri, null);
                return;
            case 6:
                gs4 gs4Var = (gs4) this.b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                vtm vtmVar = (vtm) gs4Var.d;
                String concat = "KEY_PERM_REQUESTED_".concat("android.permission.RECORD_AUDIO");
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ((Context) qdcVar.C(I)).getSharedPreferences("Yandex_Music", 0).edit().putBoolean(concat, true).apply();
                if (booleanValue) {
                    ((rln) gs4Var.b).invoke();
                    return;
                }
                ((b6n) gs4Var.c).invoke();
                if (((b6p) gs4Var.a).shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    return;
                }
                String concat2 = "KEY_PERM_REQUESTED_".concat("android.permission.RECORD_AUDIO");
                bdt I2 = hag.I(Context.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                if (((Context) qdcVar2.C(I2)).getSharedPreferences("Yandex_Music", 0).getBoolean(concat2, false)) {
                    b6p b6pVar = (b6p) vtmVar.a;
                    tnb tnbVar = new tnb(new cvo(wjb.RationaleMicPermissionScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), b6pVar.g.m(), null, 28);
                    sai saiVar = new sai(false);
                    fxf.O(b6pVar, b6pVar.u, saiVar, pd.t(new qzm[0]), new e5o(19), new wn5(new fb1(13, tnbVar, saiVar, b6pVar), 1251324184, true), 4);
                    return;
                }
                return;
            case 7:
                zi3 zi3Var = (zi3) this.b;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                zi3Var.c(bool2);
                return;
            case 8:
                dn9 dn9Var = (dn9) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) dn9Var.e;
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                boolean booleanValue2 = bool3.booleanValue();
                mjm mjmVar = (mjm) dn9Var.d;
                if (mjmVar == null || (str = (String) dn9Var.c) == null) {
                    return;
                }
                if (booleanValue2) {
                    dn9Var.c = null;
                    dn9Var.d = null;
                    atomicBoolean.set(false);
                    mjmVar.invoke(dlk.a);
                    return;
                }
                if (((ypp) dn9Var.b).shouldShowRequestPermissionRationale(str)) {
                    dn9Var.c = null;
                    dn9Var.d = null;
                    atomicBoolean.set(false);
                    mjmVar.invoke(blk.a);
                    return;
                }
                dn9Var.c = null;
                dn9Var.d = null;
                atomicBoolean.set(false);
                mjmVar.invoke(clk.a);
                return;
            case 9:
                b4n b4nVar = (b4n) this.b;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                a4n a4nVar = b4nVar.l;
                if (!booleanValue3) {
                    a4nVar.getClass();
                    return;
                }
                DownloadManager.Request request = a4nVar.d;
                if (request != null) {
                    x97.y(a4nVar.c, dm6.b, null, new z3n((DownloadManager) a4nVar.a.getSystemService(DownloadManager.class), request, continuation, 0), 2);
                }
                a4nVar.d = null;
                return;
            case 10:
                c4n c4nVar = (c4n) this.b;
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                x3n x3nVar = c4nVar.n;
                if (x3nVar == null) {
                    Intrinsics.j("downloadListener");
                    throw null;
                }
                if (booleanValue4) {
                    DownloadManager.Request request2 = (DownloadManager.Request) x3nVar.d;
                    if (request2 != null) {
                        x97.y((qyf) x3nVar.c, dm6.b, null, new z3n((DownloadManager) ((t) x3nVar.a).getSystemService(DownloadManager.class), request2, continuation, i2), 2);
                    }
                    x3nVar.d = null;
                    return;
                }
                return;
            case 11:
                SplashActivity splashActivity = (SplashActivity) this.b;
                n6r n6rVar = (n6r) obj;
                int i4 = SplashActivity.l;
                n6rVar.getClass();
                splashActivity.setResult(n6rVar.a, n6rVar.b);
                splashActivity.finish();
                return;
            case 12:
                LinksHandlingActivity linksHandlingActivity = (LinksHandlingActivity) this.b;
                v vVar = (v) obj;
                int i5 = LinksHandlingActivity.r;
                vVar.getClass();
                if (!(vVar instanceof com.yandex.passport.api.t)) {
                    if (!(vVar instanceof r)) {
                        linksHandlingActivity.n();
                        return;
                    }
                    Throwable th = ((r) vVar).a;
                    h hVar = linksHandlingActivity.m;
                    if (hVar == null) {
                        Intrinsics.j("mode");
                        throw null;
                    }
                    if (hVar == h.d) {
                        g0 g0Var = linksHandlingActivity.i;
                        if (g0Var == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        g0Var.n(q9.d, new ff(th));
                    }
                    linksHandlingActivity.n();
                    return;
                }
                com.yandex.passport.api.t tVar = (com.yandex.passport.api.t) vVar;
                f L = b.L(tVar.a);
                h hVar2 = linksHandlingActivity.m;
                if (hVar2 == null) {
                    Intrinsics.j("mode");
                    throw null;
                }
                if (hVar2 == h.d) {
                    g0 g0Var2 = linksHandlingActivity.i;
                    if (g0Var2 == null) {
                        Intrinsics.j("reporter");
                        throw null;
                    }
                    g0Var2.n(r9.d, new ff(L));
                }
                if (linksHandlingActivity.q && linksHandlingActivity.p != null && tVar.c == w0.a) {
                    linksHandlingActivity.p = L;
                    linksHandlingActivity.q(L);
                    return;
                }
                linksHandlingActivity.p(L);
                boolean z = linksHandlingActivity.q;
                g0 g0Var3 = linksHandlingActivity.i;
                if (z) {
                    if (g0Var3 != null) {
                        g0Var3.n(e6.d, new c(String.valueOf(L.b), 3));
                        return;
                    } else {
                        Intrinsics.j("reporter");
                        throw null;
                    }
                }
                if (g0Var3 == null) {
                    Intrinsics.j("reporter");
                    throw null;
                }
                Uri uri2 = linksHandlingActivity.k;
                if (uri2 == null) {
                    Intrinsics.j("cardUri");
                    throw null;
                }
                h hVar3 = linksHandlingActivity.m;
                if (hVar3 != null) {
                    g0Var3.u(L, uri2, hVar3);
                    return;
                } else {
                    Intrinsics.j("mode");
                    throw null;
                }
            case 13:
                AuthSdkActivity authSdkActivity = (AuthSdkActivity) this.b;
                String str4 = authSdkActivity.g;
                v vVar2 = (v) obj;
                int i6 = AuthSdkActivity.l;
                vVar2.getClass();
                if (!(vVar2 instanceof com.yandex.passport.api.t)) {
                    boolean equals = vVar2.equals(p.a);
                    d dVar = authSdkActivity.f;
                    if (equals) {
                        if (dVar == null) {
                            Intrinsics.j("component");
                            throw null;
                        }
                        g reporter = dVar.getReporter();
                        reporter.getClass();
                        str4.getClass();
                        reporter.u(p0.d, str4);
                        authSdkActivity.finish();
                        return;
                    }
                    if (dVar == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    g reporter2 = dVar.getReporter();
                    reporter2.getClass();
                    str4.getClass();
                    reporter2.u(q0.d, str4);
                    authSdkActivity.finish();
                    return;
                }
                d dVar2 = authSdkActivity.f;
                if (dVar2 == null) {
                    Intrinsics.j("component");
                    throw null;
                }
                g reporter3 = dVar2.getReporter();
                z1 z1Var = ((com.yandex.passport.api.t) vVar2).a;
                f L2 = b.L(z1Var);
                reporter3.getClass();
                str4.getClass();
                reporter3.n(r0.d, new ff(L2), new com.yandex.passport.internal.report.f(reporter3.e, 14), new c("caller_app_id", String.valueOf(reporter3.c)), new c("caller_fingerprint", String.valueOf(reporter3.d)), new c("state", str4));
                Bundle extras = authSdkActivity.getIntent().getExtras();
                if (extras == null) {
                    xq0.q("Required value was null.");
                    return;
                }
                l l = com.yandex.plus.core.locale.b.l(authSdkActivity, extras);
                z1 D = a.D(z1Var);
                String str5 = l.a;
                List list = l.b;
                String str6 = l.c;
                com.yandex.passport.internal.properties.l lVar = l.d;
                boolean z2 = l.e;
                String str7 = l.g;
                String str8 = l.h;
                String str9 = l.i;
                str5.getClass();
                list.getClass();
                str6.getClass();
                lVar.getClass();
                ((zh) authSdkActivity.j.getValue()).a(new l(str5, list, str6, lVar, z2, D, str7, str8, str9).e(b.L(z1Var), str4));
                return;
            case 14:
                com.yandex.passport.internal.ui.bouncer.fallback.b bVar = (com.yandex.passport.internal.ui.bouncer.fallback.b) this.b;
                qh qhVar = (qh) obj;
                qhVar.getClass();
                int i7 = qhVar.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "activityResult: " + qhVar, 8);
                }
                m mVar = bVar.m;
                s sVar = bVar.l;
                mVar.getClass();
                mVar.n(j4.d, new com.yandex.passport.internal.report.a(i7, 18));
                if (i7 != 0) {
                    sVar.a(new c2(i7, qhVar.b));
                    return;
                } else {
                    p1 p1Var = bVar.n;
                    sVar.a((p1Var == null || p1Var.b) ? y1.a : y1.b);
                    return;
                }
            case 15:
                DeleteForeverActivity deleteForeverActivity = (DeleteForeverActivity) this.b;
                v vVar3 = (v) obj;
                int i8 = DeleteForeverActivity.j;
                vVar3.getClass();
                if (vVar3 instanceof com.yandex.passport.api.t) {
                    deleteForeverActivity.n().H(com.yandex.passport.internal.ui.challenge.delete.s.e);
                    return;
                }
                if (vVar3 instanceof p) {
                    deleteForeverActivity.n().H(com.yandex.passport.internal.ui.challenge.delete.s.b);
                    return;
                }
                if (vVar3 instanceof r) {
                    deleteForeverActivity.n().H(new t0(((r) vVar3).a));
                    return;
                }
                if (vVar3 instanceof com.yandex.passport.api.s) {
                    deleteForeverActivity.n().H(com.yandex.passport.internal.ui.challenge.delete.s.c);
                    return;
                }
                deleteForeverActivity.n().H(new t0(new IllegalStateException("DeleteForeverActivity not support this bouncer answer: " + vVar3)));
                return;
            case 16:
                com.yandex.passport.internal.ui.domik.common.b bVar2 = (com.yandex.passport.internal.ui.domik.common.b) this.b;
                qh qhVar2 = (qh) obj;
                qhVar2.getClass();
                try {
                    ild.z(bVar2.requireActivity());
                    bVar2.M().setText(zyw.d(qhVar2.b));
                    bVar2.L();
                    if (bVar2.C) {
                        com.yandex.passport.internal.ui.base.d.B(bVar2.M(), bVar2.l);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint launcher failed", e);
                        return;
                    }
                    return;
                }
            case 17:
                com.yandex.passport.internal.ui.domik.extaction.a aVar = (com.yandex.passport.internal.ui.domik.extaction.a) this.b;
                qh qhVar3 = (qh) obj;
                qhVar3.getClass();
                Intent intent = qhVar3.b;
                int i9 = qhVar3.a;
                Continuation continuation2 = null;
                if (i9 != -1) {
                    if (i9 != 0) {
                        return;
                    }
                    n0 n0Var = aVar.q;
                    m0 m0Var = m0.EXTERNAL_ACTION;
                    n0Var.getClass();
                    l0 l0Var = l0.EXTERNAL_ACTION_AUTH_CANCEL;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    n0Var.c(m0Var, l0Var, e5bVar);
                    aVar.p.q.m(new com.yandex.passport.internal.ui.base.m(null, "pop_back", false, 1));
                    return;
                }
                if (intent == null || intent.getExtras() == null) {
                    Exception exc = new Exception("no cookie has returned from webview");
                    n0 n0Var2 = aVar.q;
                    m0 m0Var2 = m0.EXTERNAL_ACTION;
                    n0Var2.getClass();
                    xy0 xy0Var = new xy0(0);
                    xy0Var.put("error", Log.getStackTraceString(exc));
                    xy0Var.put("success", CommonUrlParts.Values.FALSE_INTEGER);
                    n0Var2.c(m0Var2, l0.EXTERNAL_ACTION_AUTH, xy0Var);
                    com.yandex.passport.internal.ui.domik.f fVar = aVar.p;
                    fVar.C = new com.yandex.passport.internal.ui.f("Session not valid", exc);
                    fVar.q.m(new com.yandex.passport.internal.ui.base.m(null, "pop_back", false, 1));
                    return;
                }
                int i10 = WebViewActivity.h;
                Parcelable parcelableExtra = intent.getParcelableExtra("webview-result");
                if (parcelableExtra == null) {
                    xq0.q("webview-result is missing");
                    return;
                }
                com.yandex.passport.internal.entities.h hVar4 = (com.yandex.passport.internal.entities.h) parcelableExtra;
                Bundle requireArguments = aVar.requireArguments();
                Bundle bundle = new Bundle();
                bundle.putParcelable("passport-cookie", hVar4);
                requireArguments.putAll(bundle);
                n0 n0Var3 = aVar.q;
                m0 m0Var3 = m0.EXTERNAL_ACTION;
                n0Var3.getClass();
                xy0 xy0Var2 = new xy0(0);
                xy0Var2.put("success", "1");
                n0Var3.c(m0Var3, l0.EXTERNAL_ACTION_AUTH, xy0Var2);
                com.yandex.passport.internal.ui.domik.extaction.b bVar3 = (com.yandex.passport.internal.ui.domik.extaction.b) aVar.g;
                com.yandex.passport.internal.ui.domik.d dVar4 = (com.yandex.passport.internal.ui.domik.d) aVar.o;
                bVar3.getClass();
                bVar3.l.m(Boolean.TRUE);
                x97.y(ot0.F(bVar3), ((com.yandex.passport.common.coroutine.b) bVar3.u).d, null, new we(bVar3, hVar4, dVar4, continuation2, 7), 2);
                return;
            case 18:
                ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity = (ManagingPlusDevicesHelperActivity) this.b;
                x97.y(wyf.F(managingPlusDevicesHelperActivity.getLifecycle()), null, null, new dv0(managingPlusDevicesHelperActivity.c, (Continuation) null, ((Integer) obj).intValue()), 3);
                return;
            case 19:
                com.yandex.passport.internal.ui.tv.c cVar = (com.yandex.passport.internal.ui.tv.c) this.b;
                qh qhVar4 = (qh) obj;
                String str10 = com.yandex.passport.internal.ui.tv.c.m;
                qhVar4.getClass();
                Intent intent2 = qhVar4.b;
                int i11 = qhVar4.a;
                if (i11 != -1) {
                    if (i11 == 0) {
                        o0 o0Var = cVar.h;
                        if (o0Var == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        o0Var.a.b(e.f, new xy0(0));
                        com.yandex.passport.internal.ui.tv.d dVar5 = cVar.g;
                        if (dVar5 != null) {
                            dVar5.k.m(new com.yandex.passport.internal.ui.f("fake.user.cancelled"));
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    }
                    if (i11 == 4) {
                        o0 o0Var2 = cVar.h;
                        if (o0Var2 == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        o0Var2.a.b(e.f, new xy0(0));
                        cVar.requireActivity().setResult(4);
                        cVar.requireActivity().finish();
                        return;
                    }
                    if (i11 == 5 && cVar.i) {
                        o0 o0Var3 = cVar.h;
                        if (o0Var3 == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        o0Var3.a.b(e.e, new xy0(0));
                        cVar.requireActivity().setResult(5, intent2);
                        cVar.requireActivity().finish();
                        return;
                    }
                    return;
                }
                if (intent2 == null || intent2.getExtras() == null) {
                    o0 o0Var4 = cVar.h;
                    if (o0Var4 == null) {
                        Intrinsics.j("eventReporter");
                        throw null;
                    }
                    o0Var4.a.b(e.e, new xy0(0));
                    com.yandex.passport.internal.ui.tv.d dVar6 = cVar.g;
                    if (dVar6 != null) {
                        dVar6.k.m(new com.yandex.passport.internal.ui.f("unknown error", new Exception("no cookie has returned from webview")));
                        return;
                    } else {
                        Intrinsics.j("viewModel");
                        throw null;
                    }
                }
                int i12 = WebViewActivity.h;
                Parcelable parcelableExtra2 = intent2.getParcelableExtra("webview-result");
                if (parcelableExtra2 == null) {
                    xq0.q("webview-result is missing");
                    return;
                }
                com.yandex.passport.internal.entities.h hVar5 = (com.yandex.passport.internal.entities.h) parcelableExtra2;
                Bundle arguments = cVar.getArguments();
                if (arguments == null) {
                    xq0.q("Required value was null.");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("passport-cookie", hVar5);
                arguments.putAll(bundle2);
                o0 o0Var5 = cVar.h;
                if (o0Var5 == null) {
                    Intrinsics.j("eventReporter");
                    throw null;
                }
                o0Var5.a.b(e.c, new xy0(0));
                com.yandex.passport.internal.ui.tv.d dVar7 = cVar.g;
                if (dVar7 == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                dVar7.l.m(Boolean.TRUE);
                x97.y(ot0.F(dVar7), null, null, new q(dVar7, hVar5, continuation, 14), 3);
                return;
            case 20:
                b0 b0Var = (b0) this.b;
                b1 b1Var = b0Var.t;
                qh qhVar5 = (qh) obj;
                qhVar5.getClass();
                try {
                    ild.z(b0Var.l);
                    x97.y(b0Var, null, null, new w(b0Var, zyw.d(qhVar5.b), continuation, i2), 3);
                    b1Var.a(new com.yandex.passport.sloth.n0(u0.SUCCESS, (String) null));
                    return;
                } catch (Exception e2) {
                    com.yandex.passport.common.logger.d dVar8 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint launcher failed", e2);
                    }
                    b1Var.a(new com.yandex.passport.sloth.n0(u0.FAILED, e2.getMessage()));
                    x97.y(b0Var, null, null, new i(b0Var, continuation, i), 3);
                    return;
                }
            default:
                com.yandex.passport.sloth.ui.v vVar4 = ((com.yandex.plus.core.activity.result.internal.m) this.b).m;
                if (vVar4 != null) {
                    vVar4.a(obj);
                    return;
                }
                return;
        }
    }
}
