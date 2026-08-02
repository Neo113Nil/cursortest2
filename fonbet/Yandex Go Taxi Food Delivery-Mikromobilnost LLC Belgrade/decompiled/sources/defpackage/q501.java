package defpackage;

import android.app.Activity;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.cloudmessaging.a;
import com.google.android.gms.tasks.Task;
import com.yandex.voip_calls.calls_go.CallsGoActivity;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import io.appmetrica.analytics.RtmMessageConstraints;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public final class q501 implements s501, fm41, lo51, h3v0, gor, h43, k43, i8j0, gg90, b6h, pi2, y7p, f8p, qdr {
    public static final q501 b = new q501(0);
    public static final q501 c = new q501(2);
    public static final q501 w = new q501(3);
    public static final q501 x = new q501(4);
    public static final /* synthetic */ q501 y = new q501(5);
    public final /* synthetic */ int a;

    public q501(o501 o501Var, o501 o501Var2) {
        this.a = 14;
    }

    public static mf21 B(qe21 qe21Var, re21 re21Var, se21 se21Var, jf21 jf21Var, kf21 kf21Var, lf21 lf21Var, xf21 xf21Var, ag21 ag21Var, Context context) {
        return new mf21(qe21Var, re21Var, se21Var, jf21Var, kf21Var, lf21Var, xf21Var, ag21Var, context);
    }

    public static void C(String str, String str2) {
        if (nl7.A) {
            v5c0 v5c0Var = nl7.B;
            if (v5c0Var == null) {
                v5c0Var = null;
            }
            v5c0Var.K(str, str2);
        }
    }

    public static void D(Context context, rl7 rl7Var, boolean z) {
        if (!nl7.A) {
            ny61.r("invoke CallsGoPlugin.init(...) before call function");
            return;
        }
        if (z()) {
            ny61.r("Flutter Engine with call already exist. Use `hasActiveCall` to check it and `expandCall` to expand active call");
            return;
        }
        if (rl7Var.i == null) {
            ny61.g("You must to provide incomingCallArgs");
            return;
        }
        E(context.getApplicationContext(), rl7Var);
        if (z) {
            context.startActivity(v(context));
        }
    }

    public static void E(Context context, rl7 rl7Var) {
        FlutterEngine flutterEngine = new FlutterEngine(context, null, new d(), nl7.E, true, false);
        psr psrVar = jsr.d().a;
        String c2 = tje.a(sbx.d, new wk6(16)).c(rl7Var, rl7.Companion.serializer());
        flutterEngine.c.a(new tfg((String) psrVar.d.c, "callsGoMain"), Collections.singletonList(c2));
        u30.a().b("VOIP_CALLS_ENGINE_ID", flutterEngine);
    }

    public static final void q() {
        q501 q501Var = nl7.b;
        ll7 ll7Var = nl7.D;
        if (ll7Var == null) {
            ll7Var = null;
        }
        ll7Var.getClass();
        try {
            StatusBarNotification[] activeNotifications = ll7Var.a.getActiveNotifications();
            int length = activeNotifications.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (activeNotifications[i].getId() == 228) {
                    C("uncancelled_notification_on_engine_destroy", "Notification was still active when destroying engine - Flutter forgot to cancel it");
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            e.toString();
        }
        ll7 ll7Var2 = nl7.D;
        if (ll7Var2 == null) {
            ll7Var2 = null;
        }
        ll7Var2.a.cancel(228);
        ((FlutterEngine) u30.a().a.get("VOIP_CALLS_ENGINE_ID")).a();
        u30.a().b("VOIP_CALLS_ENGINE_ID", null);
        nl7.z = null;
        nl7.w = false;
        sls slsVar = nl7.x;
        if (slsVar != null) {
            slsVar.invoke();
        }
        nl7.x = null;
    }

    public static rp8 r(CardPaymentSystem cardPaymentSystem, boolean z) {
        switch (lp8.a[cardPaymentSystem.ordinal()]) {
            case 1:
                return new rp8(CardPaymentSystem.AmericanExpress, scc.i(new hl8("34", null), new hl8("37", null)), scc.i(15), 4, rp8.f);
            case 2:
                return new rp8(CardPaymentSystem.DinersClub, scc.i(new hl8("300", "305"), new hl8("36", null), new hl8("38", "39")), scc.i(14, 15, 16, 17, 18, 19), 3, rp8.g);
            case 3:
                return new rp8(CardPaymentSystem.DiscoverCard, scc.i(new hl8("6011", null), new hl8("622126", "622925"), new hl8("644", "649"), new hl8("65", null)), scc.i(16), 3, rp8.g);
            case 4:
                return new rp8(CardPaymentSystem.JCB, scc.i(new hl8("3528", "3589")), scc.i(16), 3, rp8.g);
            case 5:
                return new rp8(CardPaymentSystem.HUMO, scc.i(new hl8("986001", "986004"), new hl8("986006", null), new hl8("986008", "986010"), new hl8("986012", "986020"), new hl8("986023", "986027"), new hl8("986029", "986037"), new hl8("986060", null)), scc.i(16), 0, rp8.g);
            case 6:
                return new rp8(CardPaymentSystem.Maestro, scc.i(new hl8("50", null), new hl8("56", "561467"), new hl8("561469", "59"), new hl8("61", null), new hl8("63", null), new hl8("66", "69")), scc.i(12, 13, 14, 15, 16, 17, 18, 19), 3, rp8.g);
            case 7:
                return new rp8(CardPaymentSystem.MasterCard, scc.i(new hl8("222100", "272099"), new hl8("51", "544080"), new hl8("544082", "55")), scc.i(16), 3, rp8.g);
            case 8:
                return new rp8(CardPaymentSystem.MIR, scc.i(new hl8("2200", "2204")), scc.i(16, 17, 18, 19), z ? 0 : 3, rp8.g);
            case 9:
                return new rp8(CardPaymentSystem.UnionPay, scc.i(new hl8("35", null), new hl8("620", "622125"), new hl8("622926", "626246"), new hl8("626250", "626254"), new hl8("626258", "626271"), new hl8("626274", "626281"), new hl8("626284", "626290"), new hl8("626293", "626417"), new hl8("626419", "626424"), new hl8("626426", "625"), new hl8("88", null)), scc.i(16, 17, 18, 19), 3, rp8.g);
            case 10:
                return new rp8(CardPaymentSystem.Uzcard, scc.i(new hl8("544081", null), new hl8("561468", null), new hl8("860002", "860006"), new hl8("860008", "860009"), new hl8("860011", "860014"), new hl8("860020", null), new hl8("860030", "860031"), new hl8("860033", "860034"), new hl8("860038", null), new hl8("860043", null), new hl8("860048", "860051"), new hl8("860053", null), new hl8("860055", "860060"), new hl8("277707", null), new hl8("626418", null), new hl8("626425", null), new hl8("626249", null), new hl8("626272", null), new hl8("626291", null), new hl8("626257", null), new hl8("626255", null), new hl8("626273", null), new hl8("626247", null), new hl8("626282", null), new hl8("626296", null), new hl8("626283", null), new hl8("626248", null), new hl8("626253", null), new hl8("626256", null), new hl8("626292", null), new hl8("626263", null), new hl8("860061", "860063")), scc.i(16), 0, rp8.g);
            case 11:
                return new rp8(CardPaymentSystem.VISA, scc.i(new hl8("4", null)), scc.i(13, 16, 18, 19), 3, rp8.g);
            case 12:
                return new rp8(CardPaymentSystem.VISA_ELECTRON, scc.i(new hl8("4026", null), new hl8("417500", null), new hl8("4405", null), new hl8("4508", null), new hl8("4844", null), new hl8("4913", null), new hl8("4917", null)), scc.i(16), 3, rp8.g);
            case 13:
                return new rp8(CardPaymentSystem.UNKNOWN, new ArrayList(), scc.i(12, 13, 14, 15, 16, 17, 18, 19), 3, rp8.g);
            default:
                w511.b();
                return null;
        }
    }

    public static rp8 s(String str) {
        gl8.a.getClass();
        CardPaymentSystem a = gl8.a(str);
        ArrayList arrayList = rp8.f;
        return r(a, false);
    }

    public static Intent v(Context context) {
        Intent putExtra = new Intent(context, (Class<?>) CallsGoActivity.class).putExtra("cached_engine_id", "VOIP_CALLS_ENGINE_ID").putExtra("destroy_engine_with_activity", false).putExtra("background_mode", mrr.a);
        q501 q501Var = nl7.b;
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return putExtra;
            }
        }
        putExtra.setFlags(SelfTester_JCP.IMITA);
        return putExtra;
    }

    public static void w(sls slsVar) {
        if (u30.a().a.containsKey("VOIP_CALLS_ENGINE_ID")) {
            nl7.x = slsVar;
        } else {
            slsVar.invoke();
        }
    }

    public static void x(Context context) {
        if (z()) {
            context.startActivity(v(context));
        } else {
            ny61.r("Can't expand call, Flutter Engine with call doesn't exist. Use `hasActiveCall` to check it");
        }
    }

    public static int y(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
            case 11:
                return 16000;
            case 12:
                return RtmMessageConstraints.MAX_STACK_LENGTH_DEFAULT;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        w511.q();
                        return 0;
                }
        }
    }

    public static boolean z() {
        return u30.a().a.containsKey("VOIP_CALLS_ENGINE_ID") && !nl7.w;
    }

    public void A(Context context, v5c0 v5c0Var, q6c0 q6c0Var, jl7 jl7Var, String[] strArr) {
        if (nl7.A) {
            return;
        }
        synchronized (this) {
            q501 q501Var = nl7.b;
            if (nl7.A) {
                return;
            }
            nl7.B = v5c0Var;
            nl7.C = q6c0Var;
            ll7 ll7Var = new ll7(context.getApplicationContext());
            nl7.D = ll7Var;
            String str = jl7Var.a;
            String str2 = jl7Var.b;
            NotificationChannel notificationChannel = new NotificationChannel("inapp_call", str, 4);
            if (str2 != null) {
                notificationChannel.setDescription(str2);
            }
            notificationChannel.setShowBadge(false);
            ll7Var.a.createNotificationChannel(notificationChannel);
            nl7.E = strArr;
            nl7.A = true;
        }
    }

    @Override // defpackage.qdr
    public boolean a(sdr sdrVar) {
        return sdrVar.d > sdrVar.f;
    }

    @Override // defpackage.h43, defpackage.k43
    public float b() {
        return 0.0f;
    }

    @Override // defpackage.gor
    public float c() {
        return 0.0f;
    }

    @Override // defpackage.qdr
    public sdr d(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float d = sy01.d(f4, f6, f2, f3, f, true);
        float f8 = d / f4;
        float f9 = d / f6;
        return new sdr(f8, f9, d, f5 * f8, d, f7 * f9);
    }

    @Override // defpackage.fm41
    public void e(int i, String str) {
    }

    @Override // defpackage.f8p
    public h8p f(float f, float f2, float f3) {
        float b2 = g8e.b(f3, f2, 0.35f, f2);
        return new h8p(ry01.e(f2, b2, f, 255, 0), ry01.e(b2, f3, f, 0, 255), false);
    }

    @Override // defpackage.h3v0
    public Task g(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = a.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? udq0.p(bundle) : udq0.p(null);
    }

    @Override // defpackage.y7p
    public void h(Object obj) {
    }

    @Override // defpackage.gor
    public long i(float f) {
        return 0L;
    }

    @Override // defpackage.gor
    public float j(float f, float f2) {
        return 0.0f;
    }

    @Override // defpackage.gor
    public float k(float f, long j) {
        return 0.0f;
    }

    @Override // defpackage.gor
    public float l(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // defpackage.k43
    public void m(fwi fwiVar, int i, int[] iArr, int[] iArr2) {
        lr20.d(i, iArr, iArr2, false);
    }

    @Override // defpackage.qdr
    public void n(RectF rectF, float f, sdr sdrVar) {
        rectF.bottom -= Math.abs(sdrVar.f - sdrVar.d) * f;
    }

    @Override // defpackage.fm41
    public void o(String str, String str2) {
    }

    @Override // defpackage.fm41
    public void onPageCommitVisible(String str) {
    }

    @Override // defpackage.fm41
    public void onPageStarted(String str) {
    }

    @Override // defpackage.pi2
    public void p(tg2 tg2Var, ryh ryhVar) {
    }

    @Override // defpackage.gg90
    public Object parse(Uri uri, InputStream inputStream) {
        return Long.valueOf(tw21.Z(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }

    public void t(yyn yynVar) {
        yynVar.a(r8b1.class, s8a1.a);
        yynVar.a(onb1.class, uua1.a);
        yynVar.a(u8b1.class, y8a1.a);
        yynVar.a(d9b1.class, k9a1.a);
        yynVar.a(y8b1.class, d9a1.a);
        yynVar.a(a9b1.class, q9a1.a);
        yynVar.a(h1b1.class, n0a1.a);
        yynVar.a(d1b1.class, g0a1.a);
        yynVar.a(y5b1.class, x5a1.a);
        yynVar.a(dlb1.class, era1.a);
        yynVar.a(w0b1.class, b0a1.a);
        yynVar.a(r0b1.class, vz91.a);
        yynVar.a(ceb1.class, rha1.a);
        yynVar.a(ypb1.class, e4a1.a);
        yynVar.a(z4b1.class, y4a1.a);
        yynVar.a(f4b1.class, y3a1.a);
        yynVar.a(geb1.class, xha1.a);
        yynVar.a(skb1.class, mqa1.a);
        yynVar.a(vkb1.class, sqa1.a);
        yynVar.a(okb1.class, gqa1.a);
        yynVar.a(u9b1.class, jba1.a);
        yynVar.a(vpb1.class, tv91.a);
        yynVar.a(z9b1.class, pba1.a);
        yynVar.a(lfb1.class, vja1.a);
        yynVar.a(dgb1.class, oka1.a);
        yynVar.a(sfb1.class, jka1.a);
        yynVar.a(ofb1.class, cka1.a);
        yynVar.a(hhb1.class, sma1.a);
        yynVar.a(khb1.class, zma1.a);
        yynVar.a(shb1.class, lna1.a);
        yynVar.a(ohb1.class, gna1.a);
        yynVar.a(p9b1.class, cba1.a);
        yynVar.a(vhb1.class, rna1.a);
        yynVar.a(zhb1.class, vna1.a);
        yynVar.a(cib1.class, zna1.a);
        yynVar.a(fib1.class, eoa1.a);
        yynVar.a(uib1.class, voa1.a);
        yynVar.a(qib1.class, bpa1.a);
        yynVar.a(ehb1.class, qla1.a);
        yynVar.a(r6b1.class, g7a1.a);
        yynVar.a(ygb1.class, ama1.a);
        yynVar.a(ugb1.class, vla1.a);
        yynVar.a(bhb1.class, lma1.a);
        yynVar.a(zkb1.class, yqa1.a);
        yynVar.a(eob1.class, dwa1.a);
        yynVar.a(nya1.class, ix91.a);
        yynVar.a(dya1.class, kw91.a);
        yynVar.a(qxa1.class, dw91.a);
        yynVar.a(hya1.class, sw91.a);
        yynVar.a(xya1.class, ux91.a);
        yynVar.a(sya1.class, nx91.a);
        yynVar.a(cza1.class, by91.a);
        yynVar.a(hza1.class, hy91.a);
        yynVar.a(mza1.class, my91.a);
        yynVar.a(rza1.class, sy91.a);
        yynVar.a(wza1.class, yy91.a);
        yynVar.a(nm91.class, zu91.a);
        yynVar.a(ym91.class, jv91.a);
        yynVar.a(sm91.class, dv91.a);
        yynVar.a(h6b1.class, s6a1.a);
        yynVar.a(l1b1.class, s0a1.a);
        yynVar.a(oe91.class, hn91.a);
        yynVar.a(ke91.class, ln91.a);
        yynVar.a(v3b1.class, c3a1.a);
        yynVar.a(te91.class, pn91.a);
        yynVar.a(re91.class, tn91.a);
        yynVar.a(gh91.class, rp91.a);
        yynVar.a(lg91.class, up91.a);
        yynVar.a(cf91.class, xn91.a);
        yynVar.a(xe91.class, bo91.a);
        yynVar.a(gi91.class, yq91.a);
        yynVar.a(bi91.class, kr91.a);
        yynVar.a(bj91.class, zr91.a);
        yynVar.a(wi91.class, fs91.a);
        yynVar.a(im91.class, ou91.a);
        yynVar.a(tl91.class, uu91.a);
        yynVar.a(ij91.class, ks91.a);
        yynVar.a(ej91.class, rs91.a);
        yynVar.a(oj91.class, ws91.a);
        yynVar.a(lj91.class, ct91.a);
        yynVar.a(epb1.class, ura1.a);
        yynVar.a(hob1.class, y0a1.a);
        yynVar.a(vob1.class, xaa1.a);
        yynVar.a(sob1.class, qaa1.a);
        yynVar.a(kob1.class, l4a1.a);
        yynVar.a(cpb1.class, pra1.a);
        yynVar.a(yob1.class, kra1.a);
        yynVar.a(ipb1.class, ksa1.a);
        yynVar.a(oob1.class, e6a1.a);
        yynVar.a(rpb1.class, owa1.a);
        yynVar.a(npb1.class, uwa1.a);
        yynVar.a(lpb1.class, jwa1.a);
        yynVar.a(klb1.class, tsa1.a);
        yynVar.a(d6b1.class, l6a1.a);
        yynVar.a(x6b1.class, o7a1.a);
        yynVar.a(lxa1.class, xv91.a);
        yynVar.a(d5b1.class, e5a1.a);
        yynVar.a(m6b1.class, a7a1.a);
        yynVar.a(z3b1.class, s3a1.a);
        yynVar.a(v1b1.class, j1a1.a);
        yynVar.a(y1b1.class, o1a1.a);
        yynVar.a(q1b1.class, c1a1.a);
        yynVar.a(d2b1.class, w1a1.a);
        yynVar.a(l9b1.class, laa1.a);
        yynVar.a(g9b1.class, y9a1.a);
        yynVar.a(he91.class, bn91.a);
        yynVar.a(wnb1.class, lva1.a);
        yynVar.a(bob1.class, yva1.a);
        yynVar.a(ynb1.class, rva1.a);
        yynVar.a(fxa1.class, mv91.a);
        yynVar.a(l0b1.class, pz91.a);
        yynVar.a(f0b1.class, kz91.a);
        yynVar.a(b0b1.class, dz91.a);
        yynVar.a(qdb1.class, zga1.a);
        yynVar.a(xdb1.class, kha1.a);
        yynVar.a(tdb1.class, eha1.a);
        yynVar.a(hg91.class, jp91.a);
        yynVar.a(cg91.class, mp91.a);
        yynVar.a(leb1.class, dia1.a);
        yynVar.a(web1.class, uia1.a);
        yynVar.a(peb1.class, iia1.a);
        yynVar.a(seb1.class, nia1.a);
        yynVar.a(qh91.class, bq91.a);
        yynVar.a(kh91.class, gq91.a);
        yynVar.a(amb1.class, tta1.a);
        yynVar.a(xlb1.class, ota1.a);
        yynVar.a(pnb1.class, zua1.a);
        yynVar.a(tnb1.class, eva1.a);
        yynVar.a(ggb1.class, vka1.a);
        yynVar.a(qgb1.class, lla1.a);
        yynVar.a(jgb1.class, ala1.a);
        yynVar.a(ngb1.class, gla1.a);
        yynVar.a(n5b1.class, t5a1.a);
        yynVar.a(si91.class, qr91.a);
        yynVar.a(mi91.class, vr91.a);
        yynVar.a(h5b1.class, m5a1.a);
        yynVar.a(j4b1.class, r4a1.a);
        yynVar.a(afb1.class, bja1.a);
        yynVar.a(hfb1.class, oja1.a);
        yynVar.a(dfb1.class, ija1.a);
        yynVar.a(wh91.class, lq91.a);
        yynVar.a(uh91.class, rq91.a);
        yynVar.a(bcb1.class, pea1.a);
        yynVar.a(c9y.class, vea1.a);
        yynVar.a(icb1.class, bfa1.a);
        yynVar.a(tf91.class, oo91.a);
        yynVar.a(of91.class, to91.a);
        yynVar.a(ibb1.class, zda1.a);
        yynVar.a(mbb1.class, eea1.a);
        yynVar.a(xbb1.class, iea1.a);
        yynVar.a(kf91.class, go91.a);
        yynVar.a(gf91.class, lo91.a);
        yynVar.a(ncb1.class, hfa1.a);
        yynVar.a(scb1.class, mfa1.a);
        yynVar.a(vcb1.class, rfa1.a);
        yynVar.a(zcb1.class, xfa1.a);
        yynVar.a(zf91.class, zo91.a);
        yynVar.a(wf91.class, ep91.a);
        yynVar.a(rlb1.class, zsa1.a);
        yynVar.a(nlb1.class, eta1.a);
        yynVar.a(c7b1.class, w7a1.a);
        yynVar.a(k7b1.class, i8a1.a);
        yynVar.a(f7b1.class, c8a1.a);
        yynVar.a(o7b1.class, n8a1.a);
        yynVar.a(yib1.class, fpa1.a);
        yynVar.a(bjb1.class, lpa1.a);
        yynVar.a(ik91.class, rt91.a);
        yynVar.a(ck91.class, xt91.a);
        yynVar.a(fmb1.class, zta1.a);
        yynVar.a(jib1.class, loa1.a);
        yynVar.a(nib1.class, poa1.a);
        yynVar.a(wj91.class, ht91.a);
        yynVar.a(tj91.class, mt91.a);
        yynVar.a(tlb1.class, jta1.a);
        yynVar.a(gbb1.class, bca1.a);
        yynVar.a(dbb1.class, tda1.a);
        yynVar.a(uab1.class, fda1.a);
        yynVar.a(qab1.class, zca1.a);
        yynVar.a(xab1.class, jda1.a);
        yynVar.a(abb1.class, pda1.a);
        yynVar.a(nab1.class, sca1.a);
        yynVar.a(eab1.class, uba1.a);
        yynVar.a(lab1.class, mca1.a);
        yynVar.a(hab1.class, fca1.a);
        yynVar.a(hdb1.class, oga1.a);
        yynVar.a(t2b1.class, p2a1.a);
        yynVar.a(ddb1.class, hga1.a);
        yynVar.a(mdb1.class, vga1.a);
        yynVar.a(o2b1.class, i2a1.a);
        yynVar.a(x2b1.class, v2a1.a);
        yynVar.a(glb1.class, osa1.a);
        yynVar.a(ljb1.class, rpa1.a);
        yynVar.a(wmb1.class, oua1.a);
        yynVar.a(kkb1.class, cqa1.a);
        yynVar.a(dkb1.class, xpa1.a);
        yynVar.a(nmb1.class, eua1.a);
        yynVar.a(ol91.class, du91.a);
        yynVar.a(yk91.class, ju91.a);
        yynVar.a(pmb1.class, iua1.a);
        yynVar.a(j2b1.class, b2a1.a);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.h43
    public void u(fwi fwiVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            lr20.d(i, iArr, iArr2, false);
        } else {
            lr20.d(i, iArr, iArr2, true);
        }
    }

    public /* synthetic */ q501(int i) {
        this.a = i;
    }
}
