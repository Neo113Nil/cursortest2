package com.yandex.passport.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.api.a2;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.i1;
import com.yandex.passport.api.j1;
import com.yandex.passport.api.k0;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.o1;
import com.yandex.passport.api.p0;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.network.p;
import com.yandex.passport.internal.properties.o;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.push.w0;
import com.yandex.passport.internal.report.af;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ze;
import com.yandex.passport.internal.social.esia.d0;
import com.yandex.passport.internal.social.esia.e0;
import com.yandex.passport.internal.social.esia.n0;
import com.yandex.passport.internal.ui.bouncer.challenge.n;
import com.yandex.passport.internal.ui.bouncer.challenge.r;
import com.yandex.passport.internal.ui.challenge.c0;
import com.yandex.passport.internal.ui.challenge.logout.t;
import com.yandex.passport.internal.ui.challenge.vpn.VpnJsBridge;
import com.yandex.passport.internal.ui.challenge.vpn.q;
import com.yandex.passport.internal.ui.challenge.vpn.y;
import com.yandex.passport.internal.ui.sloth.ebs.g1;
import com.yandex.passport.internal.ui.sloth.ebs.n1;
import com.yandex.passport.internal.ui.sloth.ebs.r0;
import com.yandex.passport.internal.ui.sloth.ebs.s0;
import com.yandex.passport.internal.ui.sloth.webauthn.s;
import com.yandex.passport.internal.ui.sloth.webauthn.x;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.data.m;
import com.yandex.passport.sloth.h0;
import defpackage.a0g;
import defpackage.act;
import defpackage.aqi;
import defpackage.avf;
import defpackage.b2c;
import defpackage.b6;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.bxe;
import defpackage.cqi;
import defpackage.d4n;
import defpackage.d85;
import defpackage.dzf;
import defpackage.eev;
import defpackage.ern;
import defpackage.etn;
import defpackage.f9h;
import defpackage.g0g;
import defpackage.g4i;
import defpackage.gct;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gs6;
import defpackage.gut;
import defpackage.hd6;
import defpackage.hdj;
import defpackage.hq5;
import defpackage.huw;
import defpackage.i95;
import defpackage.ild;
import defpackage.itv;
import defpackage.j95;
import defpackage.j9w;
import defpackage.jjb;
import defpackage.k5b;
import defpackage.kb5;
import defpackage.kfh;
import defpackage.kfu;
import defpackage.kjn;
import defpackage.kwd;
import defpackage.l1p;
import defpackage.mrl;
import defpackage.ngg;
import defpackage.nme;
import defpackage.nya;
import defpackage.nzo;
import defpackage.o2g;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.p97;
import defpackage.pd;
import defpackage.pjt;
import defpackage.q0v;
import defpackage.qh;
import defpackage.qt;
import defpackage.qu;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.ro6;
import defpackage.rpg;
import defpackage.rvf;
import defpackage.s7h;
import defpackage.ss3;
import defpackage.ssd;
import defpackage.szf;
import defpackage.t7o;
import defpackage.tah;
import defpackage.uah;
import defpackage.uf4;
import defpackage.ug3;
import defpackage.v4w;
import defpackage.v75;
import defpackage.vci;
import defpackage.vh;
import defpackage.vnj;
import defpackage.vq1;
import defpackage.vz1;
import defpackage.w4k;
import defpackage.w77;
import defpackage.w85;
import defpackage.wis;
import defpackage.wl3;
import defpackage.wp5;
import defpackage.x97;
import defpackage.xla;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.xq0;
import defpackage.xv7;
import defpackage.yci;
import defpackage.yt;
import defpackage.z18;
import defpackage.z7o;
import defpackage.zzq;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes4.dex */
public abstract class a {
    public static String a = "com.yandex.passport";

    public static final Object A(Function2 function2) {
        try {
            return C(new w77(function2, (Continuation) null, 4));
        } catch (wis e) {
            r7o r7oVar = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    public static final Object B(Function2 function2) {
        try {
            return avf.u(x97.D(kotlin.coroutines.g.a, new w77(function2, (Continuation) null, 5)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            r7o r7oVar = z7o.b;
            return new t7o(e);
        }
    }

    public static final Object C(Function2 function2) {
        try {
            return ((z7o) x97.D(kotlin.coroutines.g.a, new w77(function2, (Continuation) null, 6))).a;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            r7o r7oVar = z7o.b;
            return new t7o(e);
        }
    }

    public static final z1 D(z1 z1Var) {
        z1Var.getClass();
        z1Var.getClass();
        com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(z1Var.a);
        b.getClass();
        return new z1(b, z1Var.b);
    }

    public static final o E(e1 e1Var) {
        e1Var.getClass();
        return new o(e1Var.getTheme(), D(e1Var.getUid()), e1Var.d(), e1Var.e(), e1Var.f());
    }

    public static final Map F(Map map) {
        map.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            a2 a2Var = (a2) entry.getValue();
            a2Var.getClass();
            arrayList.add(new Pair(key, new p(a2Var.d())));
        }
        return uah.n(arrayList);
    }

    public static final com.yandex.passport.common.util.b G(Long l) {
        return (l != null && l.longValue() == 1) ? com.yandex.passport.common.util.b.b : (l != null && l.longValue() == 2) ? com.yandex.passport.common.util.b.c : com.yandex.passport.common.util.b.a;
    }

    public static final t H(u uVar) {
        uVar.getClass();
        return new t(com.yandex.plus.pay.ui.core.b.L(uVar.a), com.yandex.plus.pay.ui.core.b.G(uVar.b), uVar.c, uVar.d, com.yandex.plus.core.locale.b.C(uVar.e), uVar.f);
    }

    public static final ArrayList I(o1 o1Var) {
        o1Var.getClass();
        List list = ((com.yandex.passport.internal.entities.p) o1Var).a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((m1) it.next()).a;
            Parcelable.Creator<com.yandex.passport.common.core.e> creator = com.yandex.passport.common.core.e.CREATOR;
            str.getClass();
            arrayList.add(new com.yandex.passport.common.core.e(str));
        }
        return arrayList;
    }

    public static String J(String str) {
        return ouj.k(')', "AdditionalActionResponse(rawValue=", str);
    }

    public static final void a(final com.yandex.passport.internal.ui.sloth.ebs.b bVar, final Function0 function0, final Function2 function2, hq5 hq5Var, final int i) {
        int i2;
        boolean z;
        int i3;
        bVar.getClass();
        function0.getClass();
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1887177817);
        final int i4 = 2;
        int i5 = i | (oq5Var.f(bVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128);
        if ((i5 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            r0 viewModelFactory = bVar.getViewModelFactory();
            oq5Var.a0(1729797275);
            kfu a2 = rpg.a(oq5Var);
            if (a2 == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(g1.class), a2, null, viewModelFactory, a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
            final int i6 = 0;
            oq5Var.p(false);
            final g1 g1Var = (g1) R;
            aqi Q = szf.Q(g1Var.n, oq5Var);
            dzf dzfVar = (dzf) oq5Var.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            ((com.yandex.passport.internal.ui.sloth.ebs.o1) bVar.getBiometricApi()).getClass();
            final int i7 = 1;
            n1 n1Var = new n1(i7);
            boolean h = oq5Var.h(g1Var);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (h || K == obj) {
                K = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i6) {
                            case 0:
                                com.yandex.passport.common.ebs.j jVar = (com.yandex.passport.common.ebs.j) obj2;
                                jVar.getClass();
                                boolean equals = jVar.equals(com.yandex.passport.common.ebs.h.a);
                                g1 g1Var2 = g1Var;
                                if (!equals) {
                                    if (!jVar.equals(com.yandex.passport.common.ebs.i.a)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        g1Var2.a(new u0());
                                    }
                                } else {
                                    g1Var2.a(v0.a);
                                }
                                break;
                            case 1:
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                g1 g1Var3 = g1Var;
                                if (booleanValue) {
                                    g1Var3.a(d1.a);
                                } else {
                                    g1Var3.a(a1.a);
                                }
                                break;
                            case 2:
                                com.yandex.passport.common.ebs.e eVar = (com.yandex.passport.common.ebs.e) obj2;
                                eVar.getClass();
                                boolean equals2 = eVar.equals(com.yandex.passport.common.ebs.c.a);
                                g1 g1Var4 = g1Var;
                                if (!equals2) {
                                    if (!eVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                        if (!eVar.equals(com.yandex.passport.common.ebs.d.a)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            g1Var4.a(new w0("biometric_module_connection_error"));
                                        }
                                    } else {
                                        g1Var4.a(new w0(UgcLiveVideoData$UgcLiveStatus.CANCELLED));
                                    }
                                } else {
                                    g1Var4.a(x0.a);
                                }
                                break;
                            case 3:
                                com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj2;
                                o0Var.getClass();
                                boolean z2 = o0Var instanceof com.yandex.passport.api.n0;
                                g1 g1Var5 = g1Var;
                                if (!z2) {
                                    if (!(o0Var instanceof com.yandex.passport.api.m0)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        g1Var5.a(new y0(((com.yandex.passport.api.m0) o0Var).a));
                                    }
                                } else {
                                    g1Var5.a(z0.a);
                                }
                                break;
                            case 4:
                                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                h0Var.getClass();
                                g1Var.a(new b1(h0Var));
                                break;
                            default:
                                com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj2;
                                e1Var.getClass();
                                g1Var.a(new c1(e1Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            s7h d0 = vq1.d0(n1Var, (Function1) K, oq5Var);
            vh vhVar = new vh(3);
            boolean h2 = oq5Var.h(g1Var);
            Object K2 = oq5Var.K();
            if (h2 || K2 == obj) {
                K2 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i7) {
                            case 0:
                                com.yandex.passport.common.ebs.j jVar = (com.yandex.passport.common.ebs.j) obj2;
                                jVar.getClass();
                                boolean equals = jVar.equals(com.yandex.passport.common.ebs.h.a);
                                g1 g1Var2 = g1Var;
                                if (!equals) {
                                    if (!jVar.equals(com.yandex.passport.common.ebs.i.a)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        g1Var2.a(new u0());
                                    }
                                } else {
                                    g1Var2.a(v0.a);
                                }
                                break;
                            case 1:
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                g1 g1Var3 = g1Var;
                                if (booleanValue) {
                                    g1Var3.a(d1.a);
                                } else {
                                    g1Var3.a(a1.a);
                                }
                                break;
                            case 2:
                                com.yandex.passport.common.ebs.e eVar = (com.yandex.passport.common.ebs.e) obj2;
                                eVar.getClass();
                                boolean equals2 = eVar.equals(com.yandex.passport.common.ebs.c.a);
                                g1 g1Var4 = g1Var;
                                if (!equals2) {
                                    if (!eVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                        if (!eVar.equals(com.yandex.passport.common.ebs.d.a)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            g1Var4.a(new w0("biometric_module_connection_error"));
                                        }
                                    } else {
                                        g1Var4.a(new w0(UgcLiveVideoData$UgcLiveStatus.CANCELLED));
                                    }
                                } else {
                                    g1Var4.a(x0.a);
                                }
                                break;
                            case 3:
                                com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj2;
                                o0Var.getClass();
                                boolean z2 = o0Var instanceof com.yandex.passport.api.n0;
                                g1 g1Var5 = g1Var;
                                if (!z2) {
                                    if (!(o0Var instanceof com.yandex.passport.api.m0)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        g1Var5.a(new y0(((com.yandex.passport.api.m0) o0Var).a));
                                    }
                                } else {
                                    g1Var5.a(z0.a);
                                }
                                break;
                            case 4:
                                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                h0Var.getClass();
                                g1Var.a(new b1(h0Var));
                                break;
                            default:
                                com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj2;
                                e1Var.getClass();
                                g1Var.a(new c1(e1Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            s7h d02 = vq1.d0(vhVar, (Function1) K2, oq5Var);
            ((com.yandex.passport.internal.ui.sloth.ebs.o1) bVar.getBiometricApi()).getClass();
            n1 n1Var2 = new n1(i6);
            boolean h3 = oq5Var.h(g1Var);
            Object K3 = oq5Var.K();
            if (h3 || K3 == obj) {
                K3 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i4) {
                            case 0:
                                com.yandex.passport.common.ebs.j jVar = (com.yandex.passport.common.ebs.j) obj2;
                                jVar.getClass();
                                boolean equals = jVar.equals(com.yandex.passport.common.ebs.h.a);
                                g1 g1Var2 = g1Var;
                                if (!equals) {
                                    if (!jVar.equals(com.yandex.passport.common.ebs.i.a)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        g1Var2.a(new u0());
                                    }
                                } else {
                                    g1Var2.a(v0.a);
                                }
                                break;
                            case 1:
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                g1 g1Var3 = g1Var;
                                if (booleanValue) {
                                    g1Var3.a(d1.a);
                                } else {
                                    g1Var3.a(a1.a);
                                }
                                break;
                            case 2:
                                com.yandex.passport.common.ebs.e eVar = (com.yandex.passport.common.ebs.e) obj2;
                                eVar.getClass();
                                boolean equals2 = eVar.equals(com.yandex.passport.common.ebs.c.a);
                                g1 g1Var4 = g1Var;
                                if (!equals2) {
                                    if (!eVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                        if (!eVar.equals(com.yandex.passport.common.ebs.d.a)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            g1Var4.a(new w0("biometric_module_connection_error"));
                                        }
                                    } else {
                                        g1Var4.a(new w0(UgcLiveVideoData$UgcLiveStatus.CANCELLED));
                                    }
                                } else {
                                    g1Var4.a(x0.a);
                                }
                                break;
                            case 3:
                                com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj2;
                                o0Var.getClass();
                                boolean z2 = o0Var instanceof com.yandex.passport.api.n0;
                                g1 g1Var5 = g1Var;
                                if (!z2) {
                                    if (!(o0Var instanceof com.yandex.passport.api.m0)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        g1Var5.a(new y0(((com.yandex.passport.api.m0) o0Var).a));
                                    }
                                } else {
                                    g1Var5.a(z0.a);
                                }
                                break;
                            case 4:
                                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                h0Var.getClass();
                                g1Var.a(new b1(h0Var));
                                break;
                            default:
                                com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj2;
                                e1Var.getClass();
                                g1Var.a(new c1(e1Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K3);
            }
            s7h d03 = vq1.d0(n1Var2, (Function1) K3, oq5Var);
            vh vhVar2 = new vh(13);
            boolean h4 = oq5Var.h(g1Var);
            Object K4 = oq5Var.K();
            if (h4 || K4 == obj) {
                final int i8 = 3;
                K4 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i8) {
                            case 0:
                                com.yandex.passport.common.ebs.j jVar = (com.yandex.passport.common.ebs.j) obj2;
                                jVar.getClass();
                                boolean equals = jVar.equals(com.yandex.passport.common.ebs.h.a);
                                g1 g1Var2 = g1Var;
                                if (!equals) {
                                    if (!jVar.equals(com.yandex.passport.common.ebs.i.a)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        g1Var2.a(new u0());
                                    }
                                } else {
                                    g1Var2.a(v0.a);
                                }
                                break;
                            case 1:
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                g1 g1Var3 = g1Var;
                                if (booleanValue) {
                                    g1Var3.a(d1.a);
                                } else {
                                    g1Var3.a(a1.a);
                                }
                                break;
                            case 2:
                                com.yandex.passport.common.ebs.e eVar = (com.yandex.passport.common.ebs.e) obj2;
                                eVar.getClass();
                                boolean equals2 = eVar.equals(com.yandex.passport.common.ebs.c.a);
                                g1 g1Var4 = g1Var;
                                if (!equals2) {
                                    if (!eVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                        if (!eVar.equals(com.yandex.passport.common.ebs.d.a)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            g1Var4.a(new w0("biometric_module_connection_error"));
                                        }
                                    } else {
                                        g1Var4.a(new w0(UgcLiveVideoData$UgcLiveStatus.CANCELLED));
                                    }
                                } else {
                                    g1Var4.a(x0.a);
                                }
                                break;
                            case 3:
                                com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj2;
                                o0Var.getClass();
                                boolean z2 = o0Var instanceof com.yandex.passport.api.n0;
                                g1 g1Var5 = g1Var;
                                if (!z2) {
                                    if (!(o0Var instanceof com.yandex.passport.api.m0)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        g1Var5.a(new y0(((com.yandex.passport.api.m0) o0Var).a));
                                    }
                                } else {
                                    g1Var5.a(z0.a);
                                }
                                break;
                            case 4:
                                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                h0Var.getClass();
                                g1Var.a(new b1(h0Var));
                                break;
                            default:
                                com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj2;
                                e1Var.getClass();
                                g1Var.a(new c1(e1Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K4);
            }
            s7h d04 = vq1.d0(vhVar2, (Function1) K4, oq5Var);
            boolean f = oq5Var.f(Q) | oq5Var.h(g1Var) | oq5Var.h(dzfVar);
            Object K5 = oq5Var.K();
            if (f || K5 == obj) {
                K5 = new com.yandex.passport.internal.ui.sloth.ebs.i(0, dzfVar, g1Var, Q);
                oq5Var.k0(K5);
            }
            gld.k(dzfVar, (Function1) K5, oq5Var);
            ss3 ss3Var = g1Var.o;
            boolean h5 = ((i5 & 112) == 32) | oq5Var.h(d04) | oq5Var.h(d02) | oq5Var.h(d0) | oq5Var.h(d03) | oq5Var.h(context);
            Object K6 = oq5Var.K();
            if (h5 || K6 == obj) {
                i2 = i5;
                z = true;
                i3 = 256;
                jjb jjbVar = new jjb(d04, d02, d0, d03, context, function0, (Continuation) null);
                oq5Var.k0(jjbVar);
                K6 = jjbVar;
            } else {
                i2 = i5;
                i3 = 256;
                z = true;
            }
            com.yandex.plus.pay.ui.core.b.b(ss3Var, (Function2) K6, oq5Var, 0);
            Integer num = ((s0) Q.getValue()).c;
            if (num != null) {
                oq5Var.Z(-202709278);
                int intValue = num.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                boolean d = ((i2 & 896) == i3 ? z : false) | oq5Var.d(intValue) | oq5Var.f(Q);
                Object K7 = oq5Var.K();
                if (d || K7 == obj) {
                    com.yandex.passport.internal.ui.sloth.ebs.j jVar = new com.yandex.passport.internal.ui.sloth.ebs.j(function2, intValue, Q, null, 0);
                    oq5Var.k0(jVar);
                    K7 = jVar;
                }
                gld.w(oq5Var, valueOf, (Function2) K7);
                oq5Var.p(false);
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i9 = 2;
                    r.d = new Function2(bVar, function0, function2, i, i9) { // from class: com.yandex.passport.internal.ui.sloth.ebs.h
                        public final /* synthetic */ int a;
                        public final /* synthetic */ b b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function2 d;

                        {
                            this.a = i9;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i10 = this.a;
                            hq5 hq5Var2 = (hq5) obj2;
                            ((Integer) obj3).getClass();
                            switch (i10) {
                                case 0:
                                    com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                case 1:
                                    com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var.Z(-202709279);
            oq5Var.p(false);
            m mVar = ((s0) Q.getValue()).e;
            if (mVar != null) {
                oq5Var.Z(-202510134);
                com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = bVar.getSlothScreenComponentBuilder();
                Object K8 = oq5Var.K();
                if (K8 == obj) {
                    K8 = new com.yandex.passport.internal.storage.d(14);
                    oq5Var.k0(K8);
                }
                Function1 function1 = (Function1) K8;
                boolean h6 = oq5Var.h(g1Var);
                Object K9 = oq5Var.K();
                if (h6 || K9 == obj) {
                    final int i10 = 4;
                    K9 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i10) {
                                case 0:
                                    com.yandex.passport.common.ebs.j jVar2 = (com.yandex.passport.common.ebs.j) obj2;
                                    jVar2.getClass();
                                    boolean equals = jVar2.equals(com.yandex.passport.common.ebs.h.a);
                                    g1 g1Var2 = g1Var;
                                    if (!equals) {
                                        if (!jVar2.equals(com.yandex.passport.common.ebs.i.a)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            g1Var2.a(new u0());
                                        }
                                    } else {
                                        g1Var2.a(v0.a);
                                    }
                                    break;
                                case 1:
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    g1 g1Var3 = g1Var;
                                    if (booleanValue) {
                                        g1Var3.a(d1.a);
                                    } else {
                                        g1Var3.a(a1.a);
                                    }
                                    break;
                                case 2:
                                    com.yandex.passport.common.ebs.e eVar = (com.yandex.passport.common.ebs.e) obj2;
                                    eVar.getClass();
                                    boolean equals2 = eVar.equals(com.yandex.passport.common.ebs.c.a);
                                    g1 g1Var4 = g1Var;
                                    if (!equals2) {
                                        if (!eVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                            if (!eVar.equals(com.yandex.passport.common.ebs.d.a)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                g1Var4.a(new w0("biometric_module_connection_error"));
                                            }
                                        } else {
                                            g1Var4.a(new w0(UgcLiveVideoData$UgcLiveStatus.CANCELLED));
                                        }
                                    } else {
                                        g1Var4.a(x0.a);
                                    }
                                    break;
                                case 3:
                                    com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj2;
                                    o0Var.getClass();
                                    boolean z2 = o0Var instanceof com.yandex.passport.api.n0;
                                    g1 g1Var5 = g1Var;
                                    if (!z2) {
                                        if (!(o0Var instanceof com.yandex.passport.api.m0)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            g1Var5.a(new y0(((com.yandex.passport.api.m0) o0Var).a));
                                        }
                                    } else {
                                        g1Var5.a(z0.a);
                                    }
                                    break;
                                case 4:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                    h0Var.getClass();
                                    g1Var.a(new b1(h0Var));
                                    break;
                                default:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj2;
                                    e1Var.getClass();
                                    g1Var.a(new c1(e1Var));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K9);
                }
                Function1 function12 = (Function1) K9;
                boolean h7 = oq5Var.h(g1Var);
                Object K10 = oq5Var.K();
                if (h7 || K10 == obj) {
                    final int i11 = 5;
                    K10 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i11) {
                                case 0:
                                    com.yandex.passport.common.ebs.j jVar2 = (com.yandex.passport.common.ebs.j) obj2;
                                    jVar2.getClass();
                                    boolean equals = jVar2.equals(com.yandex.passport.common.ebs.h.a);
                                    g1 g1Var2 = g1Var;
                                    if (!equals) {
                                        if (!jVar2.equals(com.yandex.passport.common.ebs.i.a)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            g1Var2.a(new u0());
                                        }
                                    } else {
                                        g1Var2.a(v0.a);
                                    }
                                    break;
                                case 1:
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    g1 g1Var3 = g1Var;
                                    if (booleanValue) {
                                        g1Var3.a(d1.a);
                                    } else {
                                        g1Var3.a(a1.a);
                                    }
                                    break;
                                case 2:
                                    com.yandex.passport.common.ebs.e eVar = (com.yandex.passport.common.ebs.e) obj2;
                                    eVar.getClass();
                                    boolean equals2 = eVar.equals(com.yandex.passport.common.ebs.c.a);
                                    g1 g1Var4 = g1Var;
                                    if (!equals2) {
                                        if (!eVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                            if (!eVar.equals(com.yandex.passport.common.ebs.d.a)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                g1Var4.a(new w0("biometric_module_connection_error"));
                                            }
                                        } else {
                                            g1Var4.a(new w0(UgcLiveVideoData$UgcLiveStatus.CANCELLED));
                                        }
                                    } else {
                                        g1Var4.a(x0.a);
                                    }
                                    break;
                                case 3:
                                    com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj2;
                                    o0Var.getClass();
                                    boolean z2 = o0Var instanceof com.yandex.passport.api.n0;
                                    g1 g1Var5 = g1Var;
                                    if (!z2) {
                                        if (!(o0Var instanceof com.yandex.passport.api.m0)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            g1Var5.a(new y0(((com.yandex.passport.api.m0) o0Var).a));
                                        }
                                    } else {
                                        g1Var5.a(z0.a);
                                    }
                                    break;
                                case 4:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                    h0Var.getClass();
                                    g1Var.a(new b1(h0Var));
                                    break;
                                default:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj2;
                                    e1Var.getClass();
                                    g1Var.a(new c1(e1Var));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K10);
                }
                com.yandex.plus.pay.ui.core.b.g(mVar, slothScreenComponentBuilder, function1, function12, (Function1) K10, null, oq5Var, 384, 32);
                oq5Var.p(false);
                xmn r2 = oq5Var.r();
                if (r2 != null) {
                    final int i12 = 0;
                    r2.d = new Function2(bVar, function0, function2, i, i12) { // from class: com.yandex.passport.internal.ui.sloth.ebs.h
                        public final /* synthetic */ int a;
                        public final /* synthetic */ b b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function2 d;

                        {
                            this.a = i12;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i102 = this.a;
                            hq5 hq5Var2 = (hq5) obj2;
                            ((Integer) obj3).getClass();
                            switch (i102) {
                                case 0:
                                    com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                case 1:
                                    com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var.Z(-202510135);
            oq5Var.p(false);
            com.yandex.passport.common.ui.progress.g progressProperties = bVar.getProgressProperties();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            oq5Var = oq5Var;
            i(null, progressProperties, true, oq5Var, 384, 1);
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            final int i13 = 1;
            r3.d = new Function2(bVar, function0, function2, i, i13) { // from class: com.yandex.passport.internal.ui.sloth.ebs.h
                public final /* synthetic */ int a;
                public final /* synthetic */ b b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function2 d;

                {
                    this.a = i13;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i102 = this.a;
                    hq5 hq5Var2 = (hq5) obj2;
                    ((Integer) obj3).getClass();
                    switch (i102) {
                        case 0:
                            com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                        case 1:
                            com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                        default:
                            com.yandex.passport.internal.ui.a.a(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if ((r20 & 4) != 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final c0 c0Var, final com.yandex.passport.common.ui.progress.g gVar, String str, final Function1 function1, hq5 hq5Var, final int i, final int i2) {
        final String str2;
        int i3;
        int i4;
        kfu a2;
        c0Var.getClass();
        gVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-885151811);
        int i5 = 2;
        int i6 = (oq5Var.h(c0Var) ? 4 : 2) | i | (oq5Var.f(gVar) ? 32 : 16);
        if ((i2 & 4) == 0) {
            str2 = str;
            if (oq5Var.f(str2)) {
                i3 = 256;
                i4 = i6 | i3;
                if ((i & 3072) == 0) {
                    i4 |= oq5Var.h(function1) ? 2048 : 1024;
                }
                if ((i4 & 1171) == 1170 || !oq5Var.z()) {
                    oq5Var.U();
                    if ((i & 1) != 0 || oq5Var.y()) {
                        if ((i2 & 4) != 0) {
                            str2 = ern.a(r.class).f();
                            if (str2 == null) {
                                str2 = "BouncerChallengeScreen";
                            }
                            i4 &= -897;
                        }
                        oq5Var.q();
                        com.yandex.passport.internal.ui.bouncer.challenge.b build = com.yandex.passport.internal.di.a.a().createBouncerChallengeComponentBuilder().setWebCase(c0Var).build();
                        com.yandex.passport.internal.ui.bouncer.challenge.o viewModelFactory = build.getViewModelFactory();
                        oq5Var.a0(1729797275);
                        a2 = rpg.a(oq5Var);
                        if (a2 != null) {
                            xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        final String str3 = str2;
                        bfu R = ngg.R(ern.a(r.class), a2, str3, viewModelFactory, a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
                        oq5Var.p(false);
                        r rVar = (r) R;
                        aqi Q = szf.Q(rVar.l, oq5Var);
                        n nVar = ((com.yandex.passport.internal.ui.bouncer.challenge.p) Q.getValue()).a;
                        if (nVar != null) {
                            function1.invoke(Boolean.valueOf(nVar.a));
                            xmn r = oq5Var.r();
                            if (r != null) {
                                final int i7 = 0;
                                r.d = new Function2() { // from class: com.yandex.passport.internal.ui.bouncer.challenge.c
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i7) {
                                            case 0:
                                                ((Integer) obj2).getClass();
                                                com.yandex.passport.internal.ui.a.b(c0Var, gVar, str3, function1, (hq5) obj, rvf.R(i | 1), i2);
                                                break;
                                            default:
                                                ((Integer) obj2).getClass();
                                                com.yandex.passport.internal.ui.a.b(c0Var, gVar, str3, function1, (hq5) obj, rvf.R(i | 1), i2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                        com.yandex.passport.internal.ui.challenge.webview.i iVar = ((com.yandex.passport.internal.ui.bouncer.challenge.p) Q.getValue()).b;
                        o0 eventReporter = build.getEventReporter();
                        com.yandex.passport.internal.ui.common.web.d urlChecker = build.getUrlChecker();
                        Object K = oq5Var.K();
                        kjn kjnVar = gq5.a;
                        if (K == kjnVar) {
                            K = new com.yandex.passport.internal.storage.d(3);
                            oq5Var.k0(K);
                        }
                        Function1 function12 = (Function1) K;
                        boolean h = oq5Var.h(rVar);
                        Object K2 = oq5Var.K();
                        if (h || K2 == kjnVar) {
                            K2 = new com.yandex.passport.common.util.e(1, rVar);
                            oq5Var.k0(K2);
                        }
                        Function1 function13 = (Function1) K2;
                        boolean h2 = oq5Var.h(context);
                        Object K3 = oq5Var.K();
                        if (h2 || K3 == kjnVar) {
                            K3 = new kwd(context, i5);
                            oq5Var.k0(K3);
                        }
                        com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
                        com.yandex.plus.core.locale.b.b(iVar, eventReporter, urlChecker, gVar, function12, function13, (Function1) K3, false, oq5Var, ((i4 << 6) & 7168) | 24576, 128);
                        str2 = str3;
                    } else {
                        oq5Var.S();
                    }
                } else {
                    oq5Var.S();
                }
                xmn r2 = oq5Var.r();
                if (r2 != null) {
                    final int i8 = 1;
                    r2.d = new Function2() { // from class: com.yandex.passport.internal.ui.bouncer.challenge.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    com.yandex.passport.internal.ui.a.b(c0Var, gVar, str2, function1, (hq5) obj, rvf.R(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    com.yandex.passport.internal.ui.a.b(c0Var, gVar, str2, function1, (hq5) obj, rvf.R(i | 1), i2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            str2 = str;
        }
        i3 = 128;
        i4 = i6 | i3;
        if ((i & 3072) == 0) {
        }
        if ((i4 & 1171) == 1170) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        oq5Var.q();
        com.yandex.passport.internal.ui.bouncer.challenge.b build2 = com.yandex.passport.internal.di.a.a().createBouncerChallengeComponentBuilder().setWebCase(c0Var).build();
        com.yandex.passport.internal.ui.bouncer.challenge.o viewModelFactory2 = build2.getViewModelFactory();
        oq5Var.a0(1729797275);
        a2 = rpg.a(oq5Var);
        if (a2 != null) {
        }
    }

    public static final void c(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1000886874);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            long j = ((i95) oq5Var.j(j95.a)).a;
            boolean e = ((i2 & 14) == 4) | oq5Var.e(j);
            Object K = oq5Var.K();
            if (e || K == gq5.a) {
                K = new mrl(2, j, z);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            androidx.compose.ui.viewinterop.a.a(i2 & 112, 4, oq5Var, yciVar2, (Function1) K, null);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar2, i, 19);
        }
    }

    public static final void d(String str, String str2, String str3, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, hq5 hq5Var, int i) {
        boolean z3;
        boolean z4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2010632557);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | 48 | (oq5Var.f(str2) ? 256 : 128) | (oq5Var.f(str3) ? 2048 : 1024) | 221184 | (oq5Var.h(function0) ? 1048576 : 524288) | (oq5Var.h(function02) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.h(function03) ? 67108864 : 33554432);
        if ((38347923 & i2) == 38347922 && oq5Var.z()) {
            oq5Var.S();
            z3 = z;
            z4 = z2;
        } else {
            boolean z5 = (i2 & 234881024) == 67108864;
            Object K = oq5Var.K();
            if (z5 || K == gq5.a) {
                K = new gct(24, function03);
                oq5Var.k0(K);
            }
            xv7.h((Function0) K, new z18(4), ild.C(-1682660746, new huw(str, str2, function0, str3, function02, 1), oq5Var), oq5Var, 384);
            z3 = true;
            z4 = true;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nzo(str, str2, str3, z3, z4, function0, function02, function03, i);
        }
    }

    public static final void e(final n0 n0Var, final Function1 function1, final Function1 function12, final Function1 function13, final Function0 function0, final Function0 function02, hq5 hq5Var, final int i) {
        xmn r;
        Function2 function2;
        String str;
        kjn kjnVar;
        boolean z;
        int i2;
        n0Var.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(879937420);
        int i3 = i | (oq5Var.h(n0Var) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.h(function12) ? 256 : 128) | (oq5Var.h(function13) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi Q = szf.Q(n0Var.m, oq5Var);
            d0 d0Var = ((e0) Q.getValue()).a;
            kjn kjnVar2 = gq5.a;
            if (d0Var != null) {
                oq5Var.Z(2030616764);
                boolean h = ((i3 & 896) == 256) | oq5Var.h(d0Var);
                Object K = oq5Var.K();
                if (h || K == kjnVar2) {
                    K = new j9w(function12, d0Var, null, 29);
                    oq5Var.k0(K);
                }
                gld.w(oq5Var, d0Var, (Function2) K);
                oq5Var.p(false);
                r = oq5Var.r();
                if (r != null) {
                    final int i4 = 0;
                    function2 = new Function2(n0Var, function1, function12, function13, function0, function02, i, i4) { // from class: com.yandex.passport.internal.social.esia.g
                        public final /* synthetic */ int a;
                        public final /* synthetic */ n0 b;
                        public final /* synthetic */ Function1 c;
                        public final /* synthetic */ Function1 d;
                        public final /* synthetic */ Function1 e;
                        public final /* synthetic */ Function0 f;
                        public final /* synthetic */ Function0 g;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int R = rvf.R(1);
                                    com.yandex.passport.internal.ui.a.e(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, R);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int R2 = rvf.R(1);
                                    com.yandex.passport.internal.ui.a.e(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, R2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            oq5Var.Z(2030616763);
            oq5Var.p(false);
            String str2 = ((e0) Q.getValue()).b;
            if (str2 != null) {
                oq5Var.Z(2030764448);
                boolean z2 = ((e0) Q.getValue()).d;
                boolean h2 = oq5Var.h(n0Var) | ((i3 & 112) == 32);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar2) {
                    K2 = new itv(27, n0Var, function1);
                    oq5Var.k0(K2);
                }
                Function1 function14 = (Function1) K2;
                boolean h3 = oq5Var.h(n0Var);
                Object K3 = oq5Var.K();
                if (h3 || K3 == kjnVar2) {
                    K3 = new q0v(25, n0Var);
                    oq5Var.k0(K3);
                }
                str = str2;
                kjnVar = kjnVar2;
                z = false;
                i2 = 2029274774;
                m(z2, str, function14, (Function1) K3, function0, function02, oq5Var, 516096 & i3);
                oq5Var = oq5Var;
            } else {
                str = str2;
                kjnVar = kjnVar2;
                z = false;
                i2 = 2029274774;
                oq5Var.Z(2029274774);
            }
            oq5Var.p(z);
            if (str == null || ((e0) Q.getValue()).e) {
                oq5Var.Z(2031275204);
                i(gut.r1(vci.a), null, false, oq5Var, 0, 6);
            } else {
                oq5Var.Z(i2);
            }
            oq5Var.p(z);
            Throwable th = ((e0) Q.getValue()).c;
            if (th == null) {
                oq5Var.Z(2031375147);
            } else {
                oq5Var.Z(2031375148);
                boolean h4 = ((i3 & 7168) != 2048 ? z : true) | oq5Var.h(th);
                Object K4 = oq5Var.K();
                if (h4 || K4 == kjnVar) {
                    K4 = new com.yandex.passport.internal.social.esia.h(function13, th, null, 0);
                    oq5Var.k0(K4);
                }
                gld.w(oq5Var, th, (Function2) K4);
            }
            oq5Var.p(z);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i5 = 1;
            function2 = new Function2(n0Var, function1, function12, function13, function0, function02, i, i5) { // from class: com.yandex.passport.internal.social.esia.g
                public final /* synthetic */ int a;
                public final /* synthetic */ n0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 g;

                {
                    this.a = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int R = rvf.R(1);
                            com.yandex.passport.internal.ui.a.e(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, R);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int R2 = rvf.R(1);
                            com.yandex.passport.internal.ui.a.e(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, R2);
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final void f(com.yandex.passport.common.ui.progress.g gVar, boolean z, hq5 hq5Var, int i) {
        com.yandex.passport.common.ui.progress.g gVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1618350512);
        int i2 = (oq5Var.f(gVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            gVar2 = gVar;
        } else {
            if (z) {
                oq5Var.Z(1272353326);
                com.yandex.passport.common.ui.progress.g gVar3 = com.yandex.passport.common.ui.progress.g.e;
                gVar2 = gVar;
                i(null, gVar2, false, oq5Var, 384 | ((i2 << 3) & 112), 1);
            } else {
                gVar2 = gVar;
                oq5Var.Z(1271988146);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl3(gVar2, z, i, 13);
        }
    }

    public static final void g(final int i, final yci yciVar, Function0 function0, int i2, hq5 hq5Var, final int i3, final int i4) {
        int i5;
        Function0 function02;
        final int i6;
        final Function0 function03;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(785323946);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var.d(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= oq5Var.h(function0) ? 256 : 128;
        }
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= oq5Var.d(i2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function03 = function0;
            i6 = i2;
        } else {
            kjn kjnVar = gq5.a;
            if (i7 != 0) {
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = new com.yandex.passport.api.exception.l(10);
                    oq5Var.k0(K);
                }
                function02 = (Function0) K;
            } else {
                function02 = function0;
            }
            int i9 = i8 != 0 ? -1 : i2;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new com.yandex.passport.common.ui.progress.i(function02);
                oq5Var.k0(K2);
            }
            com.yandex.passport.common.ui.progress.i iVar = (com.yandex.passport.common.ui.progress.i) K2;
            boolean h = ((i5 & 7168) == 2048) | ((i5 & 14) == 4) | oq5Var.h(iVar);
            Object K3 = oq5Var.K();
            if (h || K3 == kjnVar) {
                K3 = new ro6(i9, i, iVar, 2);
                oq5Var.k0(K3);
            }
            androidx.compose.ui.viewinterop.a.a(i5 & 112, 4, oq5Var, yciVar, (Function1) K3, null);
            i6 = i9;
            function03 = function02;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: com.yandex.passport.common.ui.progress.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.yandex.passport.internal.ui.a.g(i, yciVar, function03, i6, (hq5) obj, rvf.R(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(com.yandex.passport.common.ui.progress.g gVar, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        gVar.getClass();
        com.yandex.passport.common.ui.progress.c cVar = gVar.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1683861310);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(gVar) : oq5Var.h(gVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci yciVar2 = vci.a;
            if (i4 != 0) {
                yciVar = yciVar2;
            }
            boolean z = ((com.yandex.passport.common.ui.compose.theme.b) oq5Var.j(com.yandex.passport.common.ui.compose.theme.d.d)).a;
            boolean z2 = ((com.yandex.passport.common.ui.compose.theme.e) oq5Var.j(com.yandex.passport.common.ui.compose.theme.d.e)).a;
            com.yandex.passport.common.ui.progress.n nVar = gVar.b;
            if (nVar instanceof com.yandex.passport.common.ui.progress.j) {
                float f = ((com.yandex.passport.common.ui.progress.j) nVar).a;
                float f2 = g4i.a.density;
                yciVar2 = androidx.compose.foundation.layout.d.o(yciVar2, (int) (f / f2), (int) (r3.b / f2));
            } else if (nVar.equals(com.yandex.passport.common.ui.progress.k.a)) {
                if (cVar instanceof com.yandex.passport.common.ui.progress.a) {
                    float f3 = 50;
                    yciVar2 = androidx.compose.foundation.layout.d.s(androidx.compose.foundation.layout.d.e(yciVar2, f3), f3, 70);
                } else {
                    float f4 = 50;
                    yciVar2 = androidx.compose.foundation.layout.d.o(yciVar2, f4, f4);
                }
            } else if (nVar.equals(com.yandex.passport.common.ui.progress.l.a)) {
                yciVar2 = androidx.compose.foundation.layout.d.c(yciVar2, 1.0f);
            } else if (!nVar.equals(com.yandex.passport.common.ui.progress.m.a)) {
                b6e.s();
                return;
            }
            j(cVar, z2, z, yciVar.f(yciVar2), oq5Var, 0);
        }
        yci yciVar3 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uf4(gVar, yciVar3, i, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(yci yciVar, com.yandex.passport.common.ui.progress.g gVar, boolean z, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        boolean z2;
        int i4;
        w4k w85Var;
        int i5;
        xmn r;
        int i6;
        com.yandex.passport.common.ui.progress.g gVar2 = gVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(357759865);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            yciVar2 = yciVar;
        } else if ((i & 6) == 0) {
            yciVar2 = yciVar;
            i3 = (oq5Var.f(yciVar2) ? 4 : 2) | i;
        } else {
            yciVar2 = yciVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                if ((i & 64) == 0 ? oq5Var.f(gVar2) : oq5Var.h(gVar2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            }
            i6 = 16;
            i3 |= i6;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 256 : 128;
            if ((i3 & 147) == 146 || !oq5Var.z()) {
                oq5Var.U();
                i4 = i & 1;
                vci vciVar = vci.a;
                if (i4 != 0 || oq5Var.y()) {
                    if (i7 != 0) {
                        yciVar2 = vciVar;
                    }
                    if ((i2 & 2) != 0) {
                        gVar2 = new com.yandex.passport.common.ui.progress.g(new com.yandex.passport.common.ui.progress.a(), com.yandex.passport.common.ui.progress.k.a, com.yandex.passport.common.ui.progress.e.a, true);
                        i3 &= -113;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                } else {
                    oq5Var.S();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                }
                oq5Var.q();
                yci c = androidx.compose.foundation.layout.d.c(yciVar2, 1.0f);
                if (z2) {
                    oq5Var.Z(-2083889694);
                    oq5Var.p(false);
                    w85Var = new w85(d85.m);
                } else {
                    oq5Var.Z(-2084203445);
                    if (gVar2.c instanceof com.yandex.passport.common.ui.progress.d) {
                        oq5Var.Z(-2084124581);
                        w85Var = a0g.E(((com.yandex.passport.common.ui.progress.d) gVar2.c).a, 0, oq5Var);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-2084009881);
                        w85Var = new w85(((i95) oq5Var.j(j95.a)).n);
                        oq5Var.p(false);
                    }
                    oq5Var.p(false);
                }
                yci d = androidx.compose.ui.draw.a.d(c, w85Var, null, hd6.g, 0.0f, null, 54);
                kfh d2 = ug3.d(b2c.f, false);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                h(gVar2, vciVar, oq5Var, ((i3 >> 3) & 14) | 48, 0);
                oq5Var.p(true);
            } else {
                oq5Var.S();
            }
            com.yandex.passport.common.ui.progress.g gVar3 = gVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new qu(yciVar2, gVar3, z2, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 147) == 146) {
        }
        oq5Var.U();
        i4 = i & 1;
        vci vciVar2 = vci.a;
        if (i4 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i8 != 0) {
        }
        oq5Var.q();
        yci c2 = androidx.compose.foundation.layout.d.c(yciVar2, 1.0f);
        if (z2) {
        }
        yci d3 = androidx.compose.ui.draw.a.d(c2, w85Var, null, hd6.g, 0.0f, null, 54);
        kfh d22 = ug3.d(b2c.f, false);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, d3);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d22, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        h(gVar2, vciVar2, oq5Var, ((i3 >> 3) & 14) | 48, 0);
        oq5Var.p(true);
        com.yandex.passport.common.ui.progress.g gVar32 = gVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void j(com.yandex.passport.common.ui.progress.c cVar, boolean z, boolean z2, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-600838773);
        int i2 = i | (oq5Var.f(cVar) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.g(z2) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new com.yandex.passport.api.exception.l(9);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            Unit unit = Unit.a;
            boolean f = ((i2 & 14) == 4) | oq5Var.f(aqiVar);
            Object K2 = oq5Var.K();
            Continuation continuation = null;
            if (f || K2 == obj) {
                K2 = new rhw(cVar, aqiVar, continuation, 12);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, unit, (Function2) K2);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var.Z(1836329760);
                if (cVar instanceof com.yandex.passport.common.ui.progress.a) {
                    oq5Var.Z(1836402765);
                    Object K3 = oq5Var.K();
                    if (K3 == obj) {
                        K3 = new cqi(Boolean.FALSE);
                        oq5Var.k0(K3);
                    }
                    cqi cqiVar = (cqi) K3;
                    if (z) {
                        oq5Var.Z(1832331287);
                    } else {
                        oq5Var.Z(1836515419);
                        boolean h = oq5Var.h(cqiVar);
                        Object K4 = oq5Var.K();
                        if (h || K4 == obj) {
                            K4 = new pjt(cqiVar, continuation, 15);
                            oq5Var.k0(K4);
                        }
                        gld.w(oq5Var, unit, (Function2) K4);
                        xla xlaVar = nya.d;
                        etn.c(cqiVar, null, androidx.compose.animation.c.e(new act(1000, 0, xlaVar), 2), androidx.compose.animation.c.f(new act(500, 0, xlaVar), 2), null, ild.C(-1567232431, new qt(z2, yciVar, cqiVar, 16), oq5Var), oq5Var, 196608);
                        oq5Var = oq5Var;
                    }
                    oq5Var.p(false);
                    if (!Intrinsics.d(cqiVar.b.getValue(), cqiVar.c.getValue()) || ((Boolean) cqiVar.a.getValue()).booleanValue() || ((Boolean) cqiVar.b.getValue()).booleanValue()) {
                        oq5Var.Z(1832331287);
                    } else {
                        oq5Var.Z(1838109067);
                        c((i2 >> 6) & 126, oq5Var, yciVar, z2);
                    }
                    oq5Var.p(false);
                    oq5Var.p(false);
                } else {
                    if (!(cVar instanceof com.yandex.passport.common.ui.progress.b)) {
                        throw vz1.i(oq5Var, -1880425902, false);
                    }
                    oq5Var.Z(1838243576);
                    g(((com.yandex.passport.common.ui.progress.b) cVar).a, yciVar, null, 0, oq5Var, (i2 >> 6) & 112, 12);
                    oq5Var.p(false);
                }
            } else {
                oq5Var.Z(1832331287);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hdj(cVar, z, z2, yciVar, i, 3);
        }
    }

    public static final void k(final com.yandex.passport.internal.ui.sloth.webauthn.b bVar, final Function0 function0, final Function2 function2, hq5 hq5Var, final int i) {
        boolean z;
        oq5 oq5Var;
        bVar.getClass();
        function0.getClass();
        function2.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(174920605);
        final int i2 = 2;
        int i3 = i | (oq5Var2.f(bVar) ? 4 : 2) | (oq5Var2.h(function0) ? 32 : 16) | (oq5Var2.h(function2) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            com.yandex.passport.internal.ui.sloth.webauthn.r viewModelFactory = bVar.getViewModelFactory();
            oq5Var2.a0(1729797275);
            kfu a2 = rpg.a(oq5Var2);
            if (a2 == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(x.class), a2, null, viewModelFactory, a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var2);
            oq5 oq5Var3 = oq5Var2;
            final int i4 = 0;
            oq5Var3.p(false);
            final x xVar = (x) R;
            aqi Q = szf.Q(xVar.l, oq5Var3);
            ss3 ss3Var = xVar.m;
            boolean z2 = (i3 & 112) == 32;
            Object K = oq5Var3.K();
            Continuation continuation = null;
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (z2 || K == kjnVar) {
                bxe bxeVar = new bxe(function0, continuation, i2);
                oq5Var3.k0(bxeVar);
                obj = bxeVar;
            }
            com.yandex.plus.pay.ui.core.b.b(ss3Var, (Function2) obj, oq5Var3, 0);
            Integer num = ((s) Q.getValue()).a;
            if (num != null) {
                oq5Var3.Z(1264904766);
                int intValue = num.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                int i5 = (oq5Var3.d(intValue) ? 1 : 0) | ((i3 & 896) != 256 ? 0 : 1) | (oq5Var3.f(Q) ? 1 : 0);
                Object K2 = oq5Var3.K();
                if (i5 != 0 || K2 == kjnVar) {
                    z = false;
                    com.yandex.passport.internal.ui.sloth.ebs.j jVar = new com.yandex.passport.internal.ui.sloth.ebs.j(function2, intValue, Q, continuation, 1);
                    oq5Var3.k0(jVar);
                    K2 = jVar;
                } else {
                    z = false;
                }
                gld.w(oq5Var3, valueOf, (Function2) K2);
                oq5Var3.p(z);
                xmn r = oq5Var3.r();
                if (r != null) {
                    final int i6 = 0;
                    r.d = new Function2(bVar, function0, function2, i, i6) { // from class: com.yandex.passport.internal.ui.sloth.webauthn.g
                        public final /* synthetic */ int a;
                        public final /* synthetic */ b b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function2 d;

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
                                    com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                case 1:
                                    com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var3.Z(1264904765);
            oq5Var3.p(false);
            m mVar = ((s) Q.getValue()).c;
            if (mVar != null) {
                oq5Var3.Z(1265104003);
                com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = bVar.getSlothScreenComponentBuilder();
                boolean h = oq5Var3.h(xVar);
                Object K3 = oq5Var3.K();
                Object obj2 = K3;
                if (h || K3 == kjnVar) {
                    Function1 function1 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.webauthn.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i4) {
                                case 0:
                                    b1 b1Var = (b1) obj3;
                                    b1Var.getClass();
                                    xVar.a(new v(b1Var));
                                    break;
                                case 1:
                                    h0 h0Var = (h0) obj3;
                                    h0Var.getClass();
                                    xVar.a(new t(h0Var));
                                    break;
                                default:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj3;
                                    e1Var.getClass();
                                    xVar.a(new u(e1Var));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(function1);
                    obj2 = function1;
                }
                Function1 function12 = (Function1) obj2;
                boolean h2 = oq5Var3.h(xVar);
                Object K4 = oq5Var3.K();
                Object obj3 = K4;
                if (h2 || K4 == kjnVar) {
                    Function1 function13 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.webauthn.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj32) {
                            switch (r2) {
                                case 0:
                                    b1 b1Var = (b1) obj32;
                                    b1Var.getClass();
                                    xVar.a(new v(b1Var));
                                    break;
                                case 1:
                                    h0 h0Var = (h0) obj32;
                                    h0Var.getClass();
                                    xVar.a(new t(h0Var));
                                    break;
                                default:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj32;
                                    e1Var.getClass();
                                    xVar.a(new u(e1Var));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(function13);
                    obj3 = function13;
                }
                Function1 function14 = (Function1) obj3;
                boolean h3 = oq5Var3.h(xVar);
                Object K5 = oq5Var3.K();
                Object obj4 = K5;
                if (h3 || K5 == kjnVar) {
                    Function1 function15 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.webauthn.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj32) {
                            switch (i2) {
                                case 0:
                                    b1 b1Var = (b1) obj32;
                                    b1Var.getClass();
                                    xVar.a(new v(b1Var));
                                    break;
                                case 1:
                                    h0 h0Var = (h0) obj32;
                                    h0Var.getClass();
                                    xVar.a(new t(h0Var));
                                    break;
                                default:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj32;
                                    e1Var.getClass();
                                    xVar.a(new u(e1Var));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(function15);
                    obj4 = function15;
                }
                com.yandex.plus.pay.ui.core.b.g(mVar, slothScreenComponentBuilder, function12, function14, (Function1) obj4, null, oq5Var3, 0, 32);
                oq5Var3.p(false);
                xmn r2 = oq5Var3.r();
                if (r2 != null) {
                    final int i7 = 1;
                    r2.d = new Function2(bVar, function0, function2, i, i7) { // from class: com.yandex.passport.internal.ui.sloth.webauthn.g
                        public final /* synthetic */ int a;
                        public final /* synthetic */ b b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function2 d;

                        {
                            this.a = i7;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj22, Object obj32) {
                            int i72 = this.a;
                            hq5 hq5Var2 = (hq5) obj22;
                            ((Integer) obj32).getClass();
                            switch (i72) {
                                case 0:
                                    com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                case 1:
                                    com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var3.Z(1265104002);
            oq5Var3.p(false);
            com.yandex.passport.common.ui.progress.g progressProperties = bVar.getProgressProperties();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            i(null, progressProperties, true, oq5Var3, 384, 1);
            oq5Var = oq5Var3;
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            final int i8 = 2;
            r3.d = new Function2(bVar, function0, function2, i, i8) { // from class: com.yandex.passport.internal.ui.sloth.webauthn.g
                public final /* synthetic */ int a;
                public final /* synthetic */ b b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function2 d;

                {
                    this.a = i8;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj32) {
                    int i72 = this.a;
                    hq5 hq5Var2 = (hq5) obj22;
                    ((Integer) obj32).getClass();
                    switch (i72) {
                        case 0:
                            com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                        case 1:
                            com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                        default:
                            com.yandex.passport.internal.ui.a.k(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(String str, Function1 function1, hq5 hq5Var, int i) {
        aqi aqiVar;
        oq5 oq5Var;
        oq5 oq5Var2;
        oq5 oq5Var3;
        str.getClass();
        function1.getClass();
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(-498807866);
        int i2 = (oq5Var4.f(str) ? 4 : 2) | i | (oq5Var4.h(function1) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var4.z()) {
            oq5Var4.S();
            oq5Var3 = oq5Var4;
        } else {
            oq5Var4.Z(1681986470);
            p97 p97Var = new p97(1);
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var4.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new v4w(str, 11);
                oq5Var4.k0(K);
            }
            p97Var.a(ern.a(y.class), (Function1) K);
            nme d = p97Var.d();
            oq5Var4.p(false);
            oq5Var4.a0(1729797275);
            kfu a2 = rpg.a(oq5Var4);
            if (a2 == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            oq5 oq5Var5 = oq5Var4;
            bfu R = ngg.R(ern.a(y.class), a2, null, d, a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var5);
            oq5Var5.p(false);
            y yVar = (y) R;
            aqi Q = szf.Q(yVar.l, oq5Var5);
            Object K2 = oq5Var5.K();
            if (K2 == kjnVar) {
                K2 = new w0(13);
                oq5Var5.k0(K2);
            }
            pd.c(48, 1, oq5Var5, (Function0) K2, false);
            com.yandex.passport.internal.ui.challenge.vpn.p pVar = ((q) Q.getValue()).c;
            Continuation continuation = null;
            if (pVar == null) {
                oq5Var5.Z(602287762);
            } else {
                oq5Var5.Z(602287763);
                boolean h = ((i2 & 112) == 32) | oq5Var5.h(pVar);
                Object K3 = oq5Var5.K();
                if (h || K3 == kjnVar) {
                    K3 = new com.yandex.passport.internal.storage.a(function1, pVar, continuation, 11);
                    oq5Var5.k0(K3);
                }
                gld.w(oq5Var5, pVar, (Function2) K3);
            }
            oq5Var5.p(false);
            Object K4 = oq5Var5.K();
            if (K4 == kjnVar) {
                K4 = new VpnJsBridge(new com.yandex.passport.internal.ui.challenge.vpn.c(1, yVar, y.class, "onWish", "onWish(Lcom/yandex/passport/internal/ui/challenge/vpn/VpnChallengeViewModel$Wish;)V", 0, 0));
                oq5Var5.k0(K4);
            }
            VpnJsBridge vpnJsBridge = (VpnJsBridge) K4;
            Context context = (Context) oq5Var5.j(AndroidCompositionLocals_androidKt.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            boolean f = oq5Var5.f(context);
            Object K5 = oq5Var5.K();
            Object obj = K5;
            if (f || K5 == kjnVar) {
                WebView webView = new WebView(context);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                webView.getSettings().setSupportMultipleWindows(true);
                webView.addJavascriptInterface(vpnJsBridge, "nativeAMAndroid");
                webView.setWebChromeClient(new com.yandex.passport.internal.ui.challenge.vpn.d(context, yVar, activity));
                webView.setWebViewClient(new d4n(2, yVar));
                oq5Var5.k0(webView);
                obj = webView;
            }
            final WebView webView2 = (WebView) obj;
            boolean h2 = oq5Var5.h(webView2);
            Object K6 = oq5Var5.K();
            if (h2 || K6 == kjnVar) {
                K6 = new eev(webView2, 3);
                oq5Var5.k0(K6);
            }
            gld.k(webView2, (Function1) K6, oq5Var5);
            Boolean valueOf = Boolean.valueOf(((q) Q.getValue()).d);
            boolean f2 = oq5Var5.f(Q) | oq5Var5.h(activity) | oq5Var5.h(yVar);
            Object K7 = oq5Var5.K();
            if (f2 || K7 == kjnVar) {
                K7 = new l1p(activity, yVar, Q, (Continuation) null);
                oq5Var5.k0(K7);
            }
            gld.w(oq5Var5, valueOf, (Function2) K7);
            vci vciVar = vci.a;
            yci b = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.c(vciVar, 1.0f), d85.f, vnj.i);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var5.P;
            androidx.compose.runtime.internal.a l = oq5Var5.l();
            yci H = vnj.H(oq5Var5, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var5.d0();
            if (oq5Var5.O) {
                oq5Var5.k(grbVar);
            } else {
                oq5Var5.n0();
            }
            g0g.U(oq5Var5, d2, wp5.f);
            g0g.U(oq5Var5, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var5, i3, kb5Var);
            }
            g0g.U(oq5Var5, H, wp5.d);
            final String str2 = ((q) Q.getValue()).b;
            if (str2 == null) {
                oq5Var5.Z(1556206095);
                oq5Var5.p(false);
                aqiVar = Q;
                oq5Var = oq5Var5;
            } else {
                oq5Var5.Z(1556206096);
                yci r1 = gut.r1(androidx.compose.foundation.layout.d.c(vciVar, 1.0f));
                boolean h3 = oq5Var5.h(webView2) | oq5Var5.f(str2);
                Object K8 = oq5Var5.K();
                if (h3 || K8 == kjnVar) {
                    final int i4 = 0;
                    K8 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.vpn.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i4) {
                                case 0:
                                    Context context2 = (Context) obj2;
                                    context2.getClass();
                                    FrameLayout frameLayout = new FrameLayout(context2);
                                    WebView webView3 = webView2;
                                    if (webView3.getParent() != null) {
                                        ViewParent parent = webView3.getParent();
                                        parent.getClass();
                                        ((ViewGroup) parent).removeView(webView3);
                                    }
                                    frameLayout.addView(webView3);
                                    String url = webView3.getUrl();
                                    String str3 = str2;
                                    if (!Intrinsics.d(url, str3)) {
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                                            StringBuilder u = ouj.u("VpnChallengeScreen loadUrl url=", str3, " current=");
                                            u.append(webView3.getUrl());
                                            com.yandex.passport.common.logger.a.c(bVar, null, u.toString(), 8);
                                        }
                                        webView3.loadUrl(str3);
                                    }
                                    return frameLayout;
                                default:
                                    ((FrameLayout) obj2).getClass();
                                    WebView webView4 = webView2;
                                    String url2 = webView4.getUrl();
                                    String str4 = str2;
                                    if (!Intrinsics.d(url2, str4)) {
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                                            StringBuilder u2 = ouj.u("VpnChallengeScreen loadUrl url=", str4, " current=");
                                            u2.append(webView4.getUrl());
                                            com.yandex.passport.common.logger.a.c(bVar2, null, u2.toString(), 8);
                                        }
                                        webView4.loadUrl(str4);
                                    }
                                    return Unit.a;
                            }
                        }
                    };
                    oq5Var5.k0(K8);
                }
                Function1 function12 = (Function1) K8;
                boolean h4 = oq5Var5.h(webView2) | oq5Var5.f(str2);
                Object K9 = oq5Var5.K();
                if (h4 || K9 == kjnVar) {
                    final int i5 = 1;
                    K9 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.vpn.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i5) {
                                case 0:
                                    Context context2 = (Context) obj2;
                                    context2.getClass();
                                    FrameLayout frameLayout = new FrameLayout(context2);
                                    WebView webView3 = webView2;
                                    if (webView3.getParent() != null) {
                                        ViewParent parent = webView3.getParent();
                                        parent.getClass();
                                        ((ViewGroup) parent).removeView(webView3);
                                    }
                                    frameLayout.addView(webView3);
                                    String url = webView3.getUrl();
                                    String str3 = str2;
                                    if (!Intrinsics.d(url, str3)) {
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                                            StringBuilder u = ouj.u("VpnChallengeScreen loadUrl url=", str3, " current=");
                                            u.append(webView3.getUrl());
                                            com.yandex.passport.common.logger.a.c(bVar, null, u.toString(), 8);
                                        }
                                        webView3.loadUrl(str3);
                                    }
                                    return frameLayout;
                                default:
                                    ((FrameLayout) obj2).getClass();
                                    WebView webView4 = webView2;
                                    String url2 = webView4.getUrl();
                                    String str4 = str2;
                                    if (!Intrinsics.d(url2, str4)) {
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                                            StringBuilder u2 = ouj.u("VpnChallengeScreen loadUrl url=", str4, " current=");
                                            u2.append(webView4.getUrl());
                                            com.yandex.passport.common.logger.a.c(bVar2, null, u2.toString(), 8);
                                        }
                                        webView4.loadUrl(str4);
                                    }
                                    return Unit.a;
                            }
                        }
                    };
                    oq5Var5.k0(K9);
                }
                Function1 function13 = (Function1) K9;
                aqiVar = Q;
                androidx.compose.ui.viewinterop.a.a(0, 0, oq5Var5, r1, function12, function13);
                oq5 oq5Var6 = oq5Var5;
                oq5Var6.p(false);
                oq5Var = oq5Var6;
            }
            if (((q) aqiVar.getValue()).a) {
                oq5Var.Z(1557167871);
                oq5 oq5Var7 = oq5Var;
                i(null, com.yandex.passport.common.ui.progress.g.e, false, oq5Var7, 0, 5);
                oq5Var2 = oq5Var7;
            } else {
                oq5Var.Z(1549244054);
                oq5Var2 = oq5Var;
            }
            oq5Var2.p(false);
            oq5Var2.p(true);
            oq5Var3 = oq5Var2;
        }
        xmn r = oq5Var3.r();
        if (r != null) {
            r.d = new com.yandex.passport.internal.ui.bouncer.p(str, function1, i, 7);
        }
    }

    public static final void m(boolean z, String str, Function1 function1, Function1 function12, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1994802167);
        int i2 = i | (oq5Var.g(z) ? 4 : 2) | (oq5Var.f(str) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function12) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.g0("");
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            boolean f = oq5Var.f(context);
            Object K2 = oq5Var.K();
            if (f || K2 == obj) {
                WebView webView = new WebView(context);
                context.getClass();
                z2 = true;
                webView.setWebViewClient(new com.yandex.passport.internal.social.esia.o0(z, (context.getPackageName() + ".passport").concat("://esia"), function1, function12, function0, function02));
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setDomStorageEnabled(true);
                settings.setUseWideViewPort(true);
                settings.setLoadWithOverviewMode(false);
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                oq5Var.k0(webView);
                K2 = webView;
            } else {
                z2 = true;
            }
            WebView webView2 = (WebView) K2;
            yci r1 = gut.r1(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.c(vci.a, 1.0f), ((i95) oq5Var.j(j95.a)).n, vnj.i));
            boolean h = oq5Var.h(webView2);
            Object K3 = oq5Var.K();
            if (h || K3 == obj) {
                K3 = new eev(webView2, 1);
                oq5Var.k0(K3);
            }
            Function1 function13 = (Function1) K3;
            boolean h2 = oq5Var.h(webView2) | ((i2 & 112) == 32 ? z2 : false);
            Object K4 = oq5Var.K();
            if (h2 || K4 == obj) {
                K4 = new zzq(27, str, webView2, aqiVar);
                oq5Var.k0(K4);
            }
            androidx.compose.ui.viewinterop.a.a(0, 0, oq5Var, r1, function13, (Function1) K4);
            boolean h3 = oq5Var.h(webView2);
            Object K5 = oq5Var.K();
            if (h3 || K5 == obj) {
                K5 = new eev(webView2, 2);
                oq5Var.k0(K5);
            }
            gld.k(context, (Function1) K5, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(z, str, function1, function12, function0, function02, i);
        }
    }

    public static final String n(String str, String str2) {
        if (str != null && str2 != null) {
            return ouj.o(str, " • ", str2);
        }
        if (str != null && str2 == null) {
            return str;
        }
        if (str != null || str2 == null) {
            return null;
        }
        return str2;
    }

    public static boolean o(com.yandex.passport.common.time.b[] bVarArr, String str) {
        bVarArr.getClass();
        for (com.yandex.passport.common.time.b bVar : bVarArr) {
            if (bVar.a == str) {
                return true;
            }
        }
        return false;
    }

    public static final f9h p(Map map) {
        map.getClass();
        f9h f9hVar = new f9h();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                f9hVar.put(key, value);
            }
        }
        return f9hVar.b();
    }

    public static final void q(Activity activity, Throwable th) {
        activity.getClass();
        th.getClass();
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_EXCEPTION, th);
        activity.setResult(13, intent);
        activity.finish();
    }

    public static final void r(Activity activity, qh qhVar) {
        activity.getClass();
        activity.setResult(qhVar.a, qhVar.b);
        activity.finish();
    }

    public static com.yandex.passport.internal.entities.k s(p0 p0Var) {
        com.yandex.passport.data.models.j jVar;
        p0Var.getClass();
        com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(p0Var.f());
        b.getClass();
        k0 e = p0Var.e();
        com.yandex.passport.api.impl.b a2 = e != null ? com.yandex.passport.api.impl.b.a(e.d()) : null;
        com.yandex.passport.common.bitflag.b bVar = new com.yandex.passport.common.bitflag.b(p0Var.j());
        o1 h = p0Var.h();
        Map d = p0Var.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(d.size()));
        for (Map.Entry entry : d.entrySet()) {
            Object key = entry.getKey();
            j1 j1Var = (j1) entry.getValue();
            j1Var.getClass();
            i1 i1Var = j1Var.a;
            Set set = j1Var.b;
            int ordinal = i1Var.ordinal();
            if (ordinal == 0) {
                jVar = new com.yandex.passport.data.models.j(com.yandex.passport.data.models.i.a, set);
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                jVar = new com.yandex.passport.data.models.j(com.yandex.passport.data.models.i.b, set);
            }
            linkedHashMap.put(key, jVar);
        }
        return new com.yandex.passport.internal.entities.k(b, a2, bVar, h, linkedHashMap);
    }

    public static final List t(List list, Set set) {
        list.getClass();
        set.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.yandex.passport.internal.badges.a aVar = (com.yandex.passport.internal.badges.a) it.next();
            if (!set.contains(aVar.a)) {
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return CollectionsKt.q0(arrayList, 5);
    }

    public static final boolean u(com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar) {
        com.yandex.plus.acquisition.sdk.pay.common.api.k kVar = aVar.a;
        String str = kVar.g.j;
        if (str != null && !StringsKt.U(str)) {
            return true;
        }
        String str2 = (String) kVar.g.m.getValue();
        return (str2 == null || StringsKt.U(str2)) ? false : true;
    }

    public static final int v(com.yandex.passport.sloth.data.o oVar) {
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return -1;
        }
        b6e.s();
        return 0;
    }

    public static final String w(com.yandex.passport.sloth.data.o oVar) {
        oVar.getClass();
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            return "light";
        }
        if (ordinal == 1) {
            return "dark";
        }
        if (ordinal == 2) {
            int i = com.yandex.plus.pay.ui.core.b.u().getResources().getConfiguration().uiMode & 48;
            return w(i != 16 ? i != 32 ? com.yandex.passport.sloth.data.o.a : com.yandex.passport.sloth.data.o.b : com.yandex.passport.sloth.data.o.a);
        }
        b6e.s();
        return null;
    }

    public static final void x(com.yandex.passport.internal.report.g gVar, b6 b6Var, ff ffVar) {
        gVar.getClass();
        b6Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ffVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ze) next).a()) {
                arrayList2.add(next);
            }
        }
        if (gVar.c.b()) {
            af afVar = gVar.a;
            String b6Var2 = b6Var.toString();
            ArrayList g0 = CollectionsKt.g0(arrayList2, gVar.b.a());
            int a2 = tah.a(v75.o(g0, 10));
            if (a2 < 16) {
                a2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
            Iterator it2 = g0.iterator();
            while (it2.hasNext()) {
                ze zeVar = (ze) it2.next();
                linkedHashMap.put(zeVar.getName(), zeVar.getValue());
            }
            afVar.a(b6Var2, linkedHashMap);
        }
    }

    public static final void y(com.yandex.passport.internal.report.g gVar, b6 b6Var, Iterable iterable) {
        gVar.getClass();
        b6Var.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ze zeVar = (ze) it.next();
            zeVar.getClass();
            arrayList.add(zeVar);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((ze) next).a()) {
                arrayList2.add(next);
            }
        }
        if (gVar.c.b()) {
            af afVar = gVar.a;
            String b6Var2 = b6Var.toString();
            ArrayList g0 = CollectionsKt.g0(arrayList2, gVar.b.a());
            int a2 = tah.a(v75.o(g0, 10));
            if (a2 < 16) {
                a2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
            Iterator it3 = g0.iterator();
            while (it3.hasNext()) {
                ze zeVar2 = (ze) it3.next();
                linkedHashMap.put(zeVar2.getName(), zeVar2.getValue());
            }
            afVar.a(b6Var2, linkedHashMap);
        }
    }

    public static final Object z(Function2 function2) {
        try {
            return C(new w77(function2, (Continuation) null, 3));
        } catch (wis e) {
            r7o r7oVar = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
