package com.yandex.plus.core.network.api.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.api.a2;
import com.yandex.passport.api.d2;
import com.yandex.passport.api.e2;
import com.yandex.passport.api.f2;
import com.yandex.passport.api.g2;
import com.yandex.passport.api.h2;
import com.yandex.passport.api.k0;
import com.yandex.passport.api.n;
import com.yandex.passport.api.p;
import com.yandex.passport.api.q1;
import com.yandex.passport.api.r;
import com.yandex.passport.api.t;
import com.yandex.passport.api.u;
import com.yandex.passport.api.v;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.x0;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.common.network.i;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.entities.s;
import com.yandex.passport.internal.properties.h;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.reporters.m;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.challenge.changecurrent.q;
import com.yandex.passport.internal.ui.challenge.logout.LogoutComposeActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.d;
import com.yandex.passport.internal.ui.sloth.authsdk.e;
import com.yandex.passport.internal.ui.sloth.authsdk.g;
import com.yandex.passport.internal.ui.sloth.plusdevices.g0;
import com.yandex.passport.internal.ui.sloth.plusdevices.h0;
import com.yandex.passport.internal.ui.sloth.plusdevices.n0;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.command.data.a1;
import com.yandex.passport.sloth.data.j;
import com.yandex.passport.sloth.data.o;
import com.yandex.passport.sloth.m0;
import com.yandex.passport.sloth.ui.e1;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.b;
import com.yandex.plus.bdui.a0;
import defpackage.agr;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.bxe;
import defpackage.cxb;
import defpackage.e7o;
import defpackage.eev;
import defpackage.ern;
import defpackage.fd4;
import defpackage.fgp;
import defpackage.g0g;
import defpackage.ges;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gs6;
import defpackage.gut;
import defpackage.hq5;
import defpackage.i50;
import defpackage.i95;
import defpackage.j95;
import defpackage.joj;
import defpackage.jqj;
import defpackage.k32;
import defpackage.k5r;
import defpackage.kb5;
import defpackage.kfu;
import defpackage.kjn;
import defpackage.kwd;
import defpackage.l1p;
import defpackage.l48;
import defpackage.lho;
import defpackage.meo;
import defpackage.n0d;
import defpackage.ngg;
import defpackage.nho;
import defpackage.o2g;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.q5b;
import defpackage.qh;
import defpackage.qr;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.rpg;
import defpackage.rvf;
import defpackage.s7h;
import defpackage.sa5;
import defpackage.ss3;
import defpackage.ssd;
import defpackage.szf;
import defpackage.t75;
import defpackage.ta5;
import defpackage.tah;
import defpackage.tf6;
import defpackage.uoi;
import defpackage.v75;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vh;
import defpackage.vnj;
import defpackage.vq1;
import defpackage.vq2;
import defpackage.vz1;
import defpackage.wcs;
import defpackage.wop;
import defpackage.wp5;
import defpackage.x97;
import defpackage.x9v;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.yci;
import defpackage.yvi;
import defpackage.z75;
import defpackage.zzq;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes4.dex */
public abstract class a {
    public static final String A(String str) {
        return new Regex("[^\\x00-\\x7F]").replace(str, "");
    }

    public static s B(PackageManager packageManager, String str) {
        packageManager.getClass();
        str.getClass();
        try {
            return q(packageManager, str);
        } catch (PackageManager.NameNotFoundException unused) {
            return s.g;
        } catch (NoSuchAlgorithmException unused2) {
            return s.g;
        }
    }

    public static final void D(b bVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.a aVar) {
        bVar.getClass();
        String str = aVar.a;
        String str2 = aVar.b;
        boolean z = true;
        boolean z2 = str == null || StringsKt.U(str);
        if (str2 != null && !StringsKt.U(str2)) {
            z = false;
        }
        if (z2 && z) {
            bVar.getView().setVisibility(8);
            return;
        }
        bVar.getView().setVisibility(0);
        if (z2) {
            bVar.getDiscountBadgeTextView().setVisibility(8);
        } else {
            bVar.getDiscountBadgeTextView().setVisibility(0);
            bVar.getDiscountBadgeTextView().setText(str);
        }
        if (z) {
            bVar.getPlusPointsBadgeContainer().setVisibility(8);
        } else {
            bVar.getPlusPointsBadgeContainer().setVisibility(0);
            bVar.getPlusPointsBadgeTextView().setText(str2);
        }
    }

    public static final ArrayList E(String str, Pattern pattern) {
        Integer num;
        pattern.getClass();
        List t = c.t(str, pattern);
        ArrayList arrayList = new ArrayList();
        Iterator it = t.iterator();
        while (it.hasNext()) {
            try {
                num = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException unused) {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    public static final qh F(v vVar) {
        vVar.getClass();
        if (!(vVar instanceof t)) {
            if (vVar.equals(p.a)) {
                return b(0);
            }
            if (vVar.equals(com.yandex.passport.api.s.a)) {
                return b(6);
            }
            if (vVar instanceof r) {
                return a(13, cxb.K(new Pair(Constants.KEY_EXCEPTION, ((r) vVar).a)));
            }
            if (vVar instanceof u) {
                u uVar = (u) vVar;
                return a(42, cxb.K(new Pair("passport-result-url", uVar.a), new Pair("passport-result-purpose", uVar.b)));
            }
            b6e.s();
            return null;
        }
        t tVar = (t) vVar;
        z1 z1Var = tVar.a;
        Pair pair = new Pair("passport-login-result-environment", Integer.valueOf(z1Var.a.a));
        Pair pair2 = new Pair("passport-login-result-uid", Long.valueOf(z1Var.b));
        Pair pair3 = new Pair("passport-login-action", Integer.valueOf(tVar.c.ordinal()));
        String str = tVar.d;
        if (str == null) {
            str = null;
        }
        Bundle K = cxb.K(pair, pair2, pair3, new Pair("passport-login-additional-action", str), new Pair("phone-number", tVar.e));
        f fVar = tVar.b;
        if (fVar == null) {
            fVar = null;
        }
        Bundle K2 = fVar != null ? cxb.K(new Pair("passport-account", fVar)) : null;
        Bundle bundle = new Bundle();
        bundle.putAll(K);
        if (K2 != null) {
            bundle.putAll(K2);
        }
        return a(-1, bundle);
    }

    public static final qh G(h2 h2Var) {
        if (h2Var instanceof g2) {
            g2 g2Var = (g2) h2Var;
            return a(42, cxb.K(new Pair("url", g2Var.a), new Pair("purpose", g2Var.b)));
        }
        if (h2Var instanceof f2) {
            f2 f2Var = (f2) h2Var;
            return a(-1, cxb.K(new Pair("item", f2Var.a), new Pair("params", f2Var.b)));
        }
        if (h2Var.equals(d2.a)) {
            return b(0);
        }
        if (h2Var instanceof e2) {
            return a(13, cxb.K(new Pair(Constants.KEY_EXCEPTION, ((e2) h2Var).a)));
        }
        b6e.s();
        return null;
    }

    public static final qh H(g gVar) {
        gVar.getClass();
        if (gVar instanceof com.yandex.passport.internal.ui.sloth.authsdk.b) {
            return b(0);
        }
        if (gVar instanceof com.yandex.passport.internal.ui.sloth.authsdk.a) {
            com.yandex.passport.common.core.f fVar = ((com.yandex.passport.internal.ui.sloth.authsdk.a) gVar).a;
            return a(666, cxb.K(new Pair("passport-result-environment", Integer.valueOf(fVar.a.a)), new Pair("passport-result-uid", Long.valueOf(fVar.b))));
        }
        if (gVar instanceof com.yandex.passport.internal.ui.sloth.authsdk.f) {
            com.yandex.passport.internal.ui.sloth.authsdk.f fVar2 = (com.yandex.passport.internal.ui.sloth.authsdk.f) gVar;
            return a(-1, cxb.K(new Pair("passport-result-token", fVar2.a), new Pair("passport-result-token-type", fVar2.b), new Pair("passport-result-expires-in", Long.valueOf(fVar2.c))));
        }
        if (gVar instanceof d) {
            return a(13, cxb.K(new Pair(Constants.KEY_EXCEPTION, ((d) gVar).a)));
        }
        if (gVar instanceof e) {
            com.yandex.passport.common.core.f fVar3 = ((e) gVar).a;
            return a(392, cxb.K(new Pair("passport-result-environment", Integer.valueOf(fVar3.a.a)), new Pair("passport-result-uid", Long.valueOf(fVar3.b))));
        }
        b6e.s();
        return null;
    }

    public static final t I(m0 m0Var) {
        m0Var.getClass();
        z1 J = com.yandex.plus.pay.ui.core.b.J(m0Var.b);
        f B = com.yandex.plus.core.locale.b.B(m0Var.a);
        w0 Q = Q(m0Var.c);
        String str = m0Var.d;
        if (str == null) {
            str = null;
        }
        return new t(J, B, Q, str, null);
    }

    public static final com.yandex.passport.common.properties.a J(com.yandex.passport.internal.properties.m0 m0Var, boolean z) {
        Boolean valueOf = m0Var != null ? Boolean.valueOf(m0Var.d) : null;
        String str = m0Var != null ? m0Var.e : null;
        Boolean valueOf2 = m0Var != null ? Boolean.valueOf(m0Var.f) : null;
        return new com.yandex.passport.common.properties.a(str, valueOf != null ? valueOf.booleanValue() : false, valueOf2 != null ? valueOf2.booleanValue() : false, z);
    }

    public static final com.yandex.passport.common.core.b K(k0 k0Var) {
        k0Var.getClass();
        com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(k0Var);
        b.getClass();
        return L(b);
    }

    public static final com.yandex.passport.common.core.b L(com.yandex.passport.api.impl.b bVar) {
        bVar.getClass();
        return Intrinsics.d(bVar, com.yandex.passport.api.impl.b.c) ? com.yandex.passport.common.core.b.c : Intrinsics.d(bVar, com.yandex.passport.api.impl.b.e) ? com.yandex.passport.common.core.b.e : Intrinsics.d(bVar, com.yandex.passport.api.impl.b.g) ? com.yandex.passport.common.core.b.g : Intrinsics.d(bVar, com.yandex.passport.api.impl.b.d) ? com.yandex.passport.common.core.b.d : Intrinsics.d(bVar, com.yandex.passport.api.impl.b.f) ? com.yandex.passport.common.core.b.f : com.yandex.passport.common.core.b.c;
    }

    public static final h M(h hVar) {
        hVar.getClass();
        y1 y1Var = hVar.a;
        z1 D = com.yandex.passport.internal.ui.a.D(hVar.b);
        String str = hVar.c;
        boolean z = hVar.d;
        com.yandex.passport.internal.properties.m0 m0Var = hVar.e;
        return new h(y1Var, D, str, z, m0Var != null ? N(m0Var) : null, hVar.f, hVar.g);
    }

    public static final com.yandex.passport.internal.properties.m0 N(com.yandex.passport.internal.properties.m0 m0Var) {
        m0Var.getClass();
        m0Var.getClass();
        return new com.yandex.passport.internal.properties.m0(m0Var.e, m0Var.a, m0Var.b, m0Var.c, m0Var.d, m0Var.f);
    }

    public static final com.yandex.passport.api.h O(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return com.yandex.passport.api.h.c;
        }
        if (ordinal == 1) {
            return com.yandex.passport.api.h.d;
        }
        if (ordinal == 2) {
            return com.yandex.passport.api.h.e;
        }
        if (ordinal == 3) {
            return com.yandex.passport.api.h.f;
        }
        if (ordinal == 4) {
            return com.yandex.passport.api.h.g;
        }
        b6e.s();
        return null;
    }

    public static final com.yandex.passport.api.impl.b P(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return com.yandex.passport.api.impl.b.c;
        }
        if (ordinal == 1) {
            return com.yandex.passport.api.impl.b.d;
        }
        if (ordinal == 2) {
            return com.yandex.passport.api.impl.b.e;
        }
        if (ordinal == 3) {
            return com.yandex.passport.api.impl.b.f;
        }
        if (ordinal == 4) {
            return com.yandex.passport.api.impl.b.g;
        }
        b6e.s();
        return null;
    }

    public static final w0 Q(j jVar) {
        switch (jVar.ordinal()) {
            case 0:
                return w0.h;
            case 1:
                return w0.c;
            case 2:
                return w0.e;
            case 3:
                return w0.j;
            case 4:
                return w0.l;
            case 5:
                return w0.m;
            case 6:
                return w0.n;
            default:
                b6e.s();
                return null;
        }
    }

    public static final a1 R(n nVar) {
        switch (nVar) {
            case PORTAL:
                return a1.a;
            case LITE:
                return a1.b;
            case SOCIAL:
                return a1.c;
            case PDD:
                return a1.d;
            case PHONISH:
                return a1.e;
            case MAILISH:
                return a1.f;
            case MUSIC_PHONISH:
                return a1.g;
            case CHILDISH:
                return a1.h;
            case UNDEFINED:
                return a1.i;
            default:
                b6e.s();
                return null;
        }
    }

    public static final o S(y1 y1Var) {
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return o.b;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return o.c;
                }
                b6e.s();
                return null;
            }
        }
        return o.a;
    }

    public static final o T(com.yandex.passport.common.ui.a aVar) {
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return o.a;
        }
        if (ordinal == 1) {
            return o.b;
        }
        if (ordinal == 2) {
            return o.c;
        }
        b6e.s();
        return null;
    }

    public static final com.yandex.passport.common.account.a U(i iVar) {
        iVar.getClass();
        String str = null;
        if (iVar instanceof com.yandex.passport.common.network.h) {
            String a = ((com.yandex.passport.data.models.r) ((com.yandex.passport.common.network.h) iVar).a).a();
            if (a != null && a.length() > 0 && !a.equals("-")) {
                str = a;
            }
            return new com.yandex.passport.common.account.a(str);
        }
        if (!(iVar instanceof com.yandex.passport.common.network.f)) {
            b6e.s();
            return null;
        }
        List list = ((com.yandex.passport.common.network.u) ((com.yandex.passport.common.network.f) iVar).a).a;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            b6e.l(list, "Internal error: Can't throw exception for error list ");
            return null;
        }
        BackendError backendError = (BackendError) it.next();
        com.yandex.passport.common.network.a aVar = BackendError.Companion;
        com.yandex.plus.core.locale.b.v(backendError);
        throw null;
    }

    public static final qh a(int i, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return new qh(i, intent);
    }

    public static qh b(int i) {
        return new qh(i, null);
    }

    public static final void c(com.yandex.passport.internal.ui.challenge.webview.i iVar, o0 o0Var, com.yandex.passport.internal.ui.common.web.d dVar, xpi xpiVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        boolean z;
        Object obj;
        Object obj2;
        WebView webView;
        oq5 oq5Var;
        o0Var.getClass();
        dVar.getClass();
        xpiVar.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2037271250);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(o0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(xpiVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            Object K = oq5Var2.K();
            Object obj3 = gq5.a;
            if (K == obj3) {
                K = new com.yandex.passport.internal.push.w0(14);
                oq5Var2.k0(K);
            }
            Object obj4 = (Bundle) o2g.g0(objArr, null, (Function0) K, oq5Var2, 0, 6);
            Object[] objArr2 = {Unit.a};
            Object K2 = oq5Var2.K();
            if (K2 == obj3) {
                K2 = new com.yandex.passport.internal.push.w0(15);
                oq5Var2.k0(K2);
            }
            Object obj5 = (aqi) o2g.g0(objArr2, null, (Function0) K2, oq5Var2, 3072, 6);
            boolean f = oq5Var2.f(context);
            Object K3 = oq5Var2.K();
            if (f || K3 == obj3) {
                WebView webView2 = new WebView(context);
                webView2.setWebViewClient(new com.yandex.passport.internal.ui.challenge.webview.b(iVar, function1, o0Var, dVar));
                WebSettings settings = webView2.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setUserAgentString(settings.getUserAgentString() + ' ' + com.yandex.passport.common.web.b.b);
                z = true;
                settings.setDomStorageEnabled(true);
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView2, true);
                oq5Var2.k0(webView2);
                obj = webView2;
            } else {
                z = true;
                obj = K3;
            }
            WebView webView3 = (WebView) obj;
            boolean h = oq5Var2.h(xpiVar) | oq5Var2.h(webView3);
            Object K4 = oq5Var2.K();
            if (h || K4 == obj3) {
                K4 = new l1p(xpiVar, webView3, (Continuation) null, 17);
                oq5Var2.k0(K4);
            }
            gld.w(oq5Var2, xpiVar, (Function2) K4);
            yci r1 = gut.r1(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.c(vci.a, 1.0f), ((i95) oq5Var2.j(j95.a)).n, vnj.i));
            boolean h2 = oq5Var2.h(webView3);
            Object K5 = oq5Var2.K();
            if (h2 || K5 == obj3) {
                K5 = new eev(webView3, 4);
                oq5Var2.k0(K5);
            }
            Function1 function12 = (Function1) K5;
            boolean h3 = oq5Var2.h(webView3) | oq5Var2.h(obj4);
            Object K6 = oq5Var2.K();
            if (h3 || K6 == obj3) {
                K6 = new com.yandex.passport.internal.ui.bouncer.o(10, webView3, obj4);
                oq5Var2.k0(K6);
            }
            Function1 function13 = (Function1) K6;
            boolean f2 = oq5Var2.f(obj5) | oq5Var2.h(obj4) | ((i2 & 14) == 4 ? z : false) | oq5Var2.h(webView3);
            Object K7 = oq5Var2.K();
            if (f2 || K7 == obj3) {
                obj2 = obj3;
                webView = webView3;
                Object i50Var = new i50(obj5, obj4, iVar, webView, 27);
                oq5Var2.k0(i50Var);
                K7 = i50Var;
            } else {
                obj2 = obj3;
                webView = webView3;
            }
            Object obj6 = obj2;
            androidx.compose.ui.viewinterop.a.b(function12, r1, null, function13, (Function1) K7, oq5Var2, 0, 4);
            oq5 oq5Var3 = oq5Var2;
            boolean h4 = oq5Var3.h(webView);
            Object K8 = oq5Var3.K();
            if (h4 || K8 == obj6) {
                K8 = new eev(webView, 5);
                oq5Var3.k0(K8);
            }
            gld.k(context, (Function1) K8, oq5Var3);
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x9v(i, 5, iVar, o0Var, dVar, xpiVar, function1);
        }
    }

    public static final void d(com.yandex.passport.internal.ui.bouncer.u uVar, p1 p1Var, hq5 hq5Var, int i) {
        Object weVar;
        p1 p1Var2;
        uVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(922071603);
        if ((((oq5Var.f(uVar) ? 4 : 2) | i | (oq5Var.h(p1Var) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            p1Var2 = p1Var;
        } else {
            com.yandex.passport.internal.ui.bouncer.s wishSource = uVar.getWishSource();
            m reporter = uVar.getReporter();
            vh vhVar = new vh(17);
            boolean h = oq5Var.h(reporter) | oq5Var.h(p1Var) | oq5Var.h(wishSource);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new zzq(28, reporter, p1Var, wishSource);
                oq5Var.k0(K);
            }
            s7h d0 = vq1.d0(vhVar, (Function1) K, oq5Var);
            Unit unit = Unit.a;
            boolean h2 = oq5Var.h(reporter) | oq5Var.h(p1Var) | oq5Var.h(d0);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                p1Var2 = p1Var;
                weVar = new we(reporter, p1Var2, d0, (Continuation) null, 4);
                oq5Var.k0(weVar);
            } else {
                weVar = K2;
                p1Var2 = p1Var;
            }
            gld.w(oq5Var, unit, (Function2) weVar);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new com.yandex.passport.internal.ui.bouncer.p(uVar, p1Var2, i, 2);
        }
    }

    public static final void e(boolean z, String str, String str2, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        str.getClass();
        str2.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1146253831);
        int i2 = i | (oq5Var2.g(z) ? 4 : 2) | (oq5Var2.f(str) ? 32 : 16) | (oq5Var2.f(str2) ? 256 : 128) | (oq5Var2.h(function0) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var2);
            }
            meo meoVar = new meo(3);
            vci vciVar = vci.a;
            yci d = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.selection.b.a(vciVar, z, (uoi) K, null, true, meoVar, function0), 1.0f);
            nho a = lho.a(qx0.a, b2c.k, oq5Var2, 0);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            com.yandex.passport.internal.ui.common.component.a.a((i2 & 14) | 432, 0, oq5Var2, androidx.compose.foundation.layout.d.m(vciVar, 48), z);
            float f = 10;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f, 0.0f, f, 5);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, q);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            agr agrVar = vdt.a;
            ges gesVar = ((rdt) oq5Var2.j(agrVar)).k;
            agr agrVar2 = j95.a;
            wcs.b(str, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, 2, 7), ((i95) oq5Var2.j(agrVar2)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, gesVar, oq5Var2, ((i2 >> 3) & 14) | 48, 0, 65528);
            wcs.b(str2, null, ((i95) oq5Var2.j(agrVar2)).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var2.j(agrVar)).l, oq5Var2, (i2 >> 6) & 14, 0, 65530);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(z, str, str2, function0, yciVar2, i);
        }
    }

    public static final void f(final com.yandex.passport.internal.ui.sloth.plusdevices.b bVar, final Function0 function0, final Function1 function1, hq5 hq5Var, final int i) {
        bVar.getClass();
        function0.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-825957899);
        final int i2 = 2;
        int i3 = i | (oq5Var.f(bVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            g0 viewModelFactory = bVar.getViewModelFactory();
            oq5Var.a0(1729797275);
            kfu a = rpg.a(oq5Var);
            if (a == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(n0.class), a, null, viewModelFactory, a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
            oq5Var = oq5Var;
            final int i4 = 0;
            oq5Var.p(false);
            final n0 n0Var = (n0) R;
            aqi Q = szf.Q(n0Var.l, oq5Var);
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new com.yandex.passport.internal.push.w0(18);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            ss3 ss3Var = n0Var.m;
            final int i5 = 1;
            boolean z = (i3 & 112) == 32;
            Object K2 = oq5Var.K();
            Continuation continuation = null;
            if (z || K2 == obj) {
                K2 = new bxe(function0, continuation, i5);
                oq5Var.k0(K2);
            }
            com.yandex.plus.pay.ui.core.b.b(ss3Var, (Function2) K2, oq5Var, 0);
            Unit unit = Unit.a;
            boolean f = oq5Var.f(aqiVar);
            Object K3 = oq5Var.K();
            if (f || K3 == obj) {
                K3 = new yvi(aqiVar, continuation, i2);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, unit, (Function2) K3);
            Integer num = ((h0) Q.getValue()).a;
            if (num == null) {
                oq5Var.Z(-243432545);
            } else {
                oq5Var.Z(-243432544);
                int intValue = num.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                boolean d = ((i3 & 896) == 256) | oq5Var.d(intValue);
                Object K4 = oq5Var.K();
                if (d || K4 == obj) {
                    K4 = new jqj(function1, intValue, (Continuation) null);
                    oq5Var.k0(K4);
                }
                gld.w(oq5Var, valueOf, (Function2) K4);
            }
            oq5Var.p(false);
            ((h0) Q.getValue()).getClass();
            oq5Var.Z(-243302345);
            oq5Var.p(false);
            com.yandex.passport.sloth.data.m mVar = ((h0) Q.getValue()).b;
            if (mVar != null) {
                oq5Var.Z(-243058839);
                com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = bVar.getSlothScreenComponentBuilder();
                boolean h = oq5Var.h(n0Var);
                Object K5 = oq5Var.K();
                if (h || K5 == obj) {
                    K5 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i4) {
                                case 0:
                                    b1 b1Var = (b1) obj2;
                                    b1Var.getClass();
                                    n0Var.a(new l0(b1Var));
                                    break;
                                case 1:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                    h0Var.getClass();
                                    n0Var.a(new j0(h0Var));
                                    break;
                                default:
                                    e1 e1Var = (e1) obj2;
                                    e1Var.getClass();
                                    n0Var.a(new k0(e1Var));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K5);
                }
                Function1 function12 = (Function1) K5;
                boolean h2 = oq5Var.h(n0Var);
                Object K6 = oq5Var.K();
                if (h2 || K6 == obj) {
                    K6 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i5) {
                                case 0:
                                    b1 b1Var = (b1) obj2;
                                    b1Var.getClass();
                                    n0Var.a(new l0(b1Var));
                                    break;
                                case 1:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                    h0Var.getClass();
                                    n0Var.a(new j0(h0Var));
                                    break;
                                default:
                                    e1 e1Var = (e1) obj2;
                                    e1Var.getClass();
                                    n0Var.a(new k0(e1Var));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K6);
                }
                Function1 function13 = (Function1) K6;
                boolean h3 = oq5Var.h(n0Var);
                Object K7 = oq5Var.K();
                if (h3 || K7 == obj) {
                    K7 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    b1 b1Var = (b1) obj2;
                                    b1Var.getClass();
                                    n0Var.a(new l0(b1Var));
                                    break;
                                case 1:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                    h0Var.getClass();
                                    n0Var.a(new j0(h0Var));
                                    break;
                                default:
                                    e1 e1Var = (e1) obj2;
                                    e1Var.getClass();
                                    n0Var.a(new k0(e1Var));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K7);
                }
                com.yandex.plus.pay.ui.core.b.g(mVar, slothScreenComponentBuilder, function12, function13, (Function1) K7, null, oq5Var, 0, 32);
                oq5Var.p(false);
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i6 = 0;
                    r.d = new Function2(bVar, function0, function1, i, i6) { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.n
                        public final /* synthetic */ int a;
                        public final /* synthetic */ b b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function1 d;

                        {
                            this.a = i6;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i7 = this.a;
                            hq5 hq5Var2 = (hq5) obj2;
                            ((Integer) obj3).getClass();
                            switch (i7) {
                                case 0:
                                    com.yandex.plus.core.network.api.utils.a.f(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    com.yandex.plus.core.network.api.utils.a.f(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var.Z(-243058840);
            oq5Var.p(false);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var.Z(-242593281);
                com.yandex.passport.common.ui.progress.g progressProperties = bVar.getProgressProperties();
                com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.passport.internal.ui.a.i(null, progressProperties, false, oq5Var, 384, 1);
            } else {
                oq5Var.Z(-244995347);
            }
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i7 = 1;
            r2.d = new Function2(bVar, function0, function1, i, i7) { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.n
                public final /* synthetic */ int a;
                public final /* synthetic */ b b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                {
                    this.a = i7;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i72 = this.a;
                    hq5 hq5Var2 = (hq5) obj2;
                    ((Integer) obj3).getClass();
                    switch (i72) {
                        case 0:
                            com.yandex.plus.core.network.api.utils.a.f(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                        default:
                            com.yandex.plus.core.network.api.utils.a.f(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final com.yandex.passport.internal.ui.challenge.changecurrent.i iVar, final Function1 function1, final Function1 function12, final Function1 function13, hq5 hq5Var, final int i) {
        com.yandex.passport.internal.ui.challenge.changecurrent.i iVar2;
        Function1 function14;
        function1.getClass();
        function12.getClass();
        function13.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1637078103);
        int i2 = i | (oq5Var.f(iVar) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.h(function12) ? 256 : 128) | (oq5Var.h(function13) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            iVar2 = iVar;
            function14 = function12;
        } else {
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = com.yandex.passport.internal.di.a.a().createSetCurrentComposeComponentBuilder().setProperties(iVar).build();
                oq5Var.k0(K);
            }
            com.yandex.passport.internal.ui.challenge.changecurrent.n nVar = (com.yandex.passport.internal.ui.challenge.changecurrent.n) K;
            q viewModelFactory = nVar.getViewModelFactory();
            oq5Var.a0(1729797275);
            kfu a = rpg.a(oq5Var);
            if (a == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(com.yandex.passport.internal.ui.challenge.changecurrent.t.class), a, null, viewModelFactory, a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
            oq5Var.p(false);
            com.yandex.passport.internal.ui.challenge.changecurrent.t tVar = (com.yandex.passport.internal.ui.challenge.changecurrent.t) R;
            aqi Q = szf.Q(tVar.l, oq5Var);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            int i3 = 1;
            if (((com.yandex.passport.internal.ui.challenge.changecurrent.r) Q.getValue()).d != null) {
                oq5Var.Z(840838076);
                Boolean bool = ((com.yandex.passport.internal.ui.challenge.changecurrent.r) Q.getValue()).d;
                boolean f = ((i2 & 112) == 32) | oq5Var.f(Q);
                Object K2 = oq5Var.K();
                if (f || K2 == obj) {
                    K2 = new n0d(function1, Q, null, i3);
                    oq5Var.k0(K2);
                }
                gld.w(oq5Var, bool, (Function2) K2);
            } else {
                oq5Var.Z(839480555);
            }
            oq5Var.p(false);
            Throwable th = ((com.yandex.passport.internal.ui.challenge.changecurrent.r) Q.getValue()).b;
            if (th != null) {
                if (th instanceof Exception) {
                    function13.invoke(th);
                } else {
                    function13.invoke(new RuntimeException(th));
                }
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i4 = 0;
                    r.d = new Function2(iVar, function1, function12, function13, i, i4) { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.o
                        public final /* synthetic */ int a;
                        public final /* synthetic */ i b;
                        public final /* synthetic */ Function1 c;
                        public final /* synthetic */ Function1 d;
                        public final /* synthetic */ Function1 e;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int R2 = rvf.R(1);
                                    com.yandex.plus.core.network.api.utils.a.g(this.b, this.c, this.d, this.e, (hq5) obj2, R2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int R3 = rvf.R(1);
                                    com.yandex.plus.core.network.api.utils.a.g(this.b, this.c, this.d, this.e, (hq5) obj2, R3);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            iVar2 = iVar;
            function14 = function12;
            com.yandex.passport.internal.ui.challenge.webview.i iVar3 = ((com.yandex.passport.internal.ui.challenge.changecurrent.r) Q.getValue()).e;
            o0 eventReporter = nVar.getEventReporter();
            com.yandex.passport.internal.ui.common.web.d urlChecker = nVar.getUrlChecker();
            com.yandex.passport.common.ui.progress.g gVar = iVar2.b;
            boolean z = (i2 & 896) == 256;
            Object K3 = oq5Var.K();
            if (z || K3 == obj) {
                K3 = new k32(10, function14);
                oq5Var.k0(K3);
            }
            Function1 function15 = (Function1) K3;
            boolean h = oq5Var.h(tVar);
            Object K4 = oq5Var.K();
            if (h || K4 == obj) {
                K4 = new com.yandex.passport.common.util.e(2, tVar);
                oq5Var.k0(K4);
            }
            Function1 function16 = (Function1) K4;
            boolean h2 = oq5Var.h(context);
            Object K5 = oq5Var.K();
            if (h2 || K5 == obj) {
                K5 = new kwd(context, 3);
                oq5Var.k0(K5);
            }
            Function1 function17 = (Function1) K5;
            com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.plus.core.locale.b.b(iVar3, eventReporter, urlChecker, gVar, function15, function16, function17, true, oq5Var, 12582912, 0);
            oq5Var = oq5Var;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i5 = 1;
            final com.yandex.passport.internal.ui.challenge.changecurrent.i iVar4 = iVar2;
            final Function1 function18 = function14;
            r2.d = new Function2(iVar4, function1, function18, function13, i, i5) { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.o
                public final /* synthetic */ int a;
                public final /* synthetic */ i b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;

                {
                    this.a = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int R2 = rvf.R(1);
                            com.yandex.plus.core.network.api.utils.a.g(this.b, this.c, this.d, this.e, (hq5) obj2, R2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int R3 = rvf.R(1);
                            com.yandex.plus.core.network.api.utils.a.g(this.b, this.c, this.d, this.e, (hq5) obj2, R3);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final com.yandex.passport.sloth.dependencies.e h(x xVar, l lVar) {
        xVar.getClass();
        lVar.getClass();
        String str = lVar.r;
        if (str == null) {
            str = "null";
        }
        String str2 = str;
        com.yandex.passport.internal.properties.k0 k0Var = lVar.p;
        boolean z = k0Var.e;
        boolean z2 = k0Var.a;
        xVar.getClass();
        String str3 = lVar.w;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = str3;
        o S = S(lVar.e);
        EnumSet<n> j = lVar.d.j();
        ArrayList arrayList = new ArrayList(v75.o(j, 10));
        for (n nVar : j) {
            nVar.getClass();
            arrayList.add(R(nVar));
        }
        EnumSet noneOf = EnumSet.noneOf(a1.class);
        noneOf.addAll(arrayList);
        return new com.yandex.passport.sloth.dependencies.e(str2, z, z2, false, str4, S, noneOf, lVar.A, lVar.z);
    }

    public static final void i(int i, String str) {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, k5r.l("ConnectivityManager.", i, str, ", callbackHashcode = "), 8);
        }
    }

    public static final void j(int i, Exception exc, String str) {
        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.c, null, k5r.l("ConnectivityManager.", i, str, ", callbackHashcode = "), exc);
        }
    }

    public static final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z75.t(arrayList2, ((com.yandex.passport.internal.network.response.f) it.next()).b);
        }
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((com.yandex.passport.internal.network.response.e) it2.next()).b);
        }
        return arrayList3;
    }

    public static final void l(fgp fgpVar, com.yandex.passport.sloth.ui.b bVar, tf6 tf6Var) {
        if (fgpVar.c(bVar) instanceof fd4) {
            x97.y(tf6Var, null, null, new com.yandex.passport.internal.ui.sloth.q(fgpVar, bVar, (Continuation) null, 18), 3);
        }
    }

    public static Intent n(Context context, com.yandex.passport.internal.properties.u uVar, com.yandex.passport.internal.ui.challenge.logout.d dVar) {
        context.getClass();
        uVar.getClass();
        dVar.getClass();
        Bundle[] bundleArr = {cxb.K(new Pair("passport-logout-properties", uVar)), cxb.K(new Pair("passport-logout-behaviour", dVar))};
        Bundle bundle = new Bundle();
        for (int i = 0; i < 2; i++) {
            bundle.putAll(bundleArr[i]);
        }
        return vq2.A(context, LogoutComposeActivity.class, bundle);
    }

    public static void o(StringBuilder sb, CharsetDecoder charsetDecoder, ByteBuffer byteBuffer) {
        if (byteBuffer.position() == 0) {
            return;
        }
        byteBuffer.flip();
        try {
            try {
                sb.append((CharSequence) charsetDecoder.decode(byteBuffer));
            } catch (CharacterCodingException unused) {
                sb.append((char) 65533);
            }
        } finally {
            byteBuffer.flip();
            byteBuffer.limit(byteBuffer.capacity());
        }
    }

    public static s p(PackageInfo packageInfo) {
        Signature[] c = com.yandex.passport.common.util.a.c(packageInfo);
        if (c == null) {
            c = new Signature[0];
        }
        ArrayList arrayList = new ArrayList(c.length);
        for (Signature signature : c) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.update(signature.toByteArray());
            arrayList.add(messageDigest.digest());
        }
        if (!arrayList.isEmpty()) {
            return new s(arrayList, c);
        }
        byte[] bytes = "unknown".getBytes(Charsets.UTF_8);
        bytes.getClass();
        return new s(t75.c(bytes), c);
    }

    public static s q(PackageManager packageManager, String str) {
        packageManager.getClass();
        str.getClass();
        PackageInfo packageInfo = packageManager.getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217728 : 64);
        packageInfo.getClass();
        return p(packageInfo);
    }

    public static x r(q1 q1Var) {
        Map p = q1Var.p();
        Map s = q1Var.s();
        String f = q1Var.f();
        String o = q1Var.o();
        Long v = q1Var.v();
        String l = q1Var.l();
        String w = q1Var.w();
        List B = q1Var.B();
        List k = q1Var.k();
        joj D = q1Var.D();
        String C = q1Var.C();
        String h = q1Var.h();
        l48 j = q1Var.j();
        List q = q1Var.q();
        Boolean A = q1Var.A();
        x0 y = q1Var.y();
        l t = y != null ? com.yandex.plus.pay.ui.core.b.t((com.yandex.passport.api.limited.a) y) : null;
        com.yandex.passport.api.q i = q1Var.i();
        Locale r = q1Var.r();
        a2 z = q1Var.z();
        z.getClass();
        return new x(p, s, f, o, v, l, w, B, k, D, C, h, j, q, A, t, i, r, new com.yandex.passport.internal.network.p(z.d()), com.yandex.passport.internal.ui.a.F(q1Var.u()), q1Var.g(), q1Var.m(), q1Var.x(), q1Var.isWhiteLabel(), q1Var.t(), q1Var.n());
    }

    public static final com.yandex.passport.sloth.ui.b s(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        com.yandex.passport.sloth.ui.b bVar = com.yandex.passport.sloth.ui.b.b;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            boolean hasCapability = networkCapabilities.hasCapability(12);
            if (hasCapability) {
                return com.yandex.passport.sloth.ui.b.a;
            }
            if (hasCapability) {
                b6e.s();
                return null;
            }
        }
        return bVar;
    }

    public static final int t(Context context, int i) {
        context.getClass();
        context.getClass();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        b6e.p("%1$s requires a value for the %2$s attribute to be set in your theme.", Arrays.copyOf(new Object[]{context.getClass().getCanonicalName(), context.getResources().getResourceName(i)}, 2));
        return 0;
    }

    public static String u(int i, String str) {
        return str + '-' + i;
    }

    public static ArrayList v(Bundle bundle) {
        com.yandex.passport.internal.b bVar;
        ArrayList arrayList = new ArrayList();
        int i = bundle.getInt("size");
        for (int i2 = 0; i2 < i; i2++) {
            com.yandex.passport.internal.sso.b k = com.yandex.plus.core.locale.b.k(bundle.getInt(u(i2, "last-action-timestamp")), bundle.getString(u(i2, "uid")), bundle.getString(u(i2, "last-action")), bundle.getLong(u(i2, "last-action-local-timestamp")));
            Iterator it = com.yandex.passport.internal.sso.c.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    Set set = com.yandex.passport.internal.sso.c.c;
                    if (!bundle.containsKey(u(i2, str))) {
                        bVar = null;
                        break;
                    }
                } else {
                    String string = bundle.getString(u(i2, "name"));
                    if (string == null) {
                        e7o.f("no account name for ".concat(u(i2, "name")));
                        return null;
                    }
                    bVar = new com.yandex.passport.internal.b(string, bundle.getString(u(i2, "token")), bundle.getString(u(i2, "uid")), bundle.getString(u(i2, "user-info-body")), bundle.getString(u(i2, "user-info-meta")), bundle.getString(u(i2, "stash-body")), null, null, null);
                }
            }
            com.yandex.passport.internal.sso.c cVar = k == null ? null : new com.yandex.passport.internal.sso.c(k, bVar);
            if (cVar != null) {
                arrayList.add(cVar);
            } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Error while unpacking bundle, continue: " + bundle, 8);
            }
        }
        return arrayList;
    }

    public static Bundle w(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putInt("size", arrayList.size());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            com.yandex.passport.internal.sso.c cVar = (com.yandex.passport.internal.sso.c) it.next();
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            Set set = com.yandex.passport.internal.sso.c.c;
            String u = u(i, "uid");
            com.yandex.passport.internal.sso.b bVar = cVar.a;
            com.yandex.passport.common.core.f fVar = bVar.a;
            fVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.a.a);
            sb.append(':');
            sb.append(fVar.b);
            bundle2.putString(u, sb.toString());
            bundle2.putInt(u(i, "last-action-timestamp"), bVar.b);
            bundle2.putString(u(i, "last-action"), bVar.c.name());
            bundle2.putLong(u(i, "last-action-local-timestamp"), bVar.d);
            com.yandex.passport.internal.b bVar2 = cVar.b;
            if (bVar2 != null) {
                bundle2.putString(u(i, "name"), bVar2.a);
                bundle2.putString(u(i, "token"), bVar2.b);
                bundle2.putString(u(i, "user-info-body"), bVar2.d);
                bundle2.putString(u(i, "user-info-meta"), bVar2.e);
                bundle2.putString(u(i, "stash-body"), bVar2.f);
            }
            bundle.putAll(bundle2);
            i = i2;
        }
        return bundle;
    }

    public static final i x(i iVar, Function1 function1) {
        iVar.getClass();
        if (iVar instanceof com.yandex.passport.common.network.h) {
            return new com.yandex.passport.common.network.h(function1.invoke(((com.yandex.passport.common.network.h) iVar).a));
        }
        if (iVar instanceof com.yandex.passport.common.network.f) {
            return new com.yandex.passport.common.network.f(((com.yandex.passport.common.network.f) iVar).a);
        }
        b6e.s();
        return null;
    }

    public static final LinkedHashMap y(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashSet i = wop.i(map.keySet(), map2.keySet());
        int a = tah.a(v75.o(i, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : i) {
            a0 a0Var = (a0) obj;
            Set set = (Set) map.get(a0Var);
            if (set == null) {
                set = q5b.a;
            }
            Iterable iterable = (Set) map2.get(a0Var);
            if (iterable == null) {
                iterable = q5b.a;
            }
            linkedHashMap.put(obj, wop.i(set, iterable));
        }
        return linkedHashMap;
    }

    public static final String z(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public abstract void C(com.yandex.passport.internal.ui.util.r rVar, com.yandex.passport.internal.ui.util.r rVar2, Window window, View view, boolean z, boolean z2);

    public void m(Window window) {
        window.getClass();
    }
}
