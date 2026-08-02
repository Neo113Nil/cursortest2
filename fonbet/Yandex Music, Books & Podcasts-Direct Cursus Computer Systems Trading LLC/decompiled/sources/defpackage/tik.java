package defpackage;

import android.graphics.Rect;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes4.dex */
public final /* synthetic */ class tik implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tik(w4r w4rVar) {
        this.a = 21;
        this.b = w4rVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        zfr zfrVar = (zfr) this.b;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            float f = 20;
            xcs.c(zfrVar.a, androidx.compose.foundation.layout.a.p(d.c(vci.a, 1.0f), f, 32, f, 0), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, tqc.n, 0L, null, 0L, 0, false, 0, 0, null, null, nu0.j(), oq5Var, 196608, 0, 131032);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        x3h x3hVar = (x3h) this.b;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((a) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        String str = x3hVar.b;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-527427070);
        u7g.d(str, oq5Var2, 0);
        oq5Var2.p(false);
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ges gesVar = (ges) this.b;
        tmt tmtVar = (tmt) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        tmtVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(tmtVar) : ((oq5) hq5Var).h(tmtVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        boolean z = tmtVar instanceof qmt;
        vci vciVar = vci.a;
        if (z) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-1137936181);
            xcs.b(((qmt) tmtVar).a, d.d(vciVar, 1.0f), ((dq0) oq5Var2.j(eq0.a)).b.b, v7g.z(48), null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, gesVar, oq5Var2, 3120, 0, 65008);
            oq5Var2.p(false);
        } else if (tmtVar.equals(smt.a)) {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(-1137570257);
            yci d = d.d(vciVar, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i = oq5Var3.P;
            androidx.compose.runtime.internal.a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, d2, wp5.f);
            g0g.U(oq5Var3, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var3, i, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            k8a.b(androidx.compose.foundation.layout.a.m(b.a.a(vciVar, b2c.f), y2h.a), oq5Var3, 0);
            oq5Var3.p(true);
            oq5Var3.p(false);
        } else {
            if (!tmtVar.equals(rmt.a)) {
                throw vz1.i((oq5) hq5Var, 1902953067, false);
            }
            oq5 oq5Var4 = (oq5) hq5Var;
            oq5Var4.Z(1902977578);
            oq5Var4.p(false);
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        zwr zwrVar = (zwr) this.b;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            String str = zwrVar.c;
            if (str == null) {
                oq5Var.Z(1469149187);
            } else {
                oq5Var.Z(1469149188);
                xcs.b(str, androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.a.m(vci.a, 16), 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, null, false, 131067), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 48, 0, 65016);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        final v3s v3sVar = (v3s) this.b;
        final o3s o3sVar = (o3s) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o3sVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o3sVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            v1g v1gVar = o3sVar.a;
            w3g w3gVar = o3sVar.b;
            int i = intValue & 14;
            boolean f = oq5Var.f(v3sVar) | (i == 4);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                final int i2 = 0;
                K = new Function0() { // from class: t3s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                cvl cvlVar = o3sVar.c;
                                cvlVar.getClass();
                                s3s s3sVar = v3sVar.b;
                                s3sVar.getClass();
                                t tVar = s3sVar.a;
                                tVar.startActivity(ixf.E(tVar, cvlVar, new h(Page.MIX)));
                                break;
                            default:
                                cvl cvlVar2 = o3sVar.c;
                                cvlVar2.getClass();
                                s3s s3sVar2 = v3sVar.b;
                                s3sVar2.getClass();
                                lwg G = g0g.G(cvlVar2);
                                y supportFragmentManager = s3sVar2.a.getSupportFragmentManager();
                                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), new h(Page.MIX));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean f2 = oq5Var.f(v3sVar) | (i == 4);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                final int i3 = 1;
                K2 = new Function0() { // from class: t3s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                cvl cvlVar = o3sVar.c;
                                cvlVar.getClass();
                                s3s s3sVar = v3sVar.b;
                                s3sVar.getClass();
                                t tVar = s3sVar.a;
                                tVar.startActivity(ixf.E(tVar, cvlVar, new h(Page.MIX)));
                                break;
                            default:
                                cvl cvlVar2 = o3sVar.c;
                                cvlVar2.getClass();
                                s3s s3sVar2 = v3sVar.b;
                                s3sVar2.getClass();
                                lwg G = g0g.G(cvlVar2);
                                y supportFragmentManager = s3sVar2.a.getSupportFragmentManager();
                                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), new h(Page.MIX));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            y1g.d(function0, v1gVar, w3gVar, null, false, (Function0) K2, oq5Var, 0, 24);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        jfs jfsVar = (jfs) this.b;
        c cVar = (c) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        cVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        List list = jfsVar.d;
        oq5 oq5Var2 = (oq5) hq5Var;
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new d5s(25);
            oq5Var2.k0(K);
        }
        mn0 mn0Var = new mn0(6, CollectionsKt.X(list, null, null, null, (Function1) K, 31), (ArrayList) null);
        ges j = nu0.j();
        long j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
        boolean h = oq5Var2.h(jfsVar);
        Object K2 = oq5Var2.K();
        if (h || K2 == kjnVar) {
            K2 = new r3s(3, jfsVar);
            oq5Var2.k0(K2);
        }
        xv7.i(mn0Var, null, j2, 0L, 0L, 3, 0L, 2, false, 2, 0, null, null, j, vut.s(cVar, (Function1) K2), null, oq5Var2, 0, 134220848, 644858);
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        rhs rhsVar = (rhs) this.b;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((oho) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            if (rhsVar.d) {
                i = -267666389;
                i2 = R.string.timer_stop;
            } else {
                i = -267664692;
                i2 = R.string.timer_start;
            }
            xcs.b(vz1.n(oq5Var, i, i2, oq5Var, false), androidx.compose.foundation.layout.a.o(vci.a, 64, 0.0f, 2), kg5.r(R.color.text_primary_day, oq5Var), 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.j(), oq5Var, 48, 3072, 57336);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        b bVar = b.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                wik wikVar = (wik) obj4;
                uik uikVar = (uik) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                uikVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(uikVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                yci b = androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), uikVar.a, vnj.i);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i2 = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, b);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, d, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var2, i2, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                int ordinal = ((zik) bcx.x(wikVar.a.H(), hq5Var, 0).getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        oq5Var2.Z(413566243);
                        oq5Var2.p(false);
                        oq5Var2.p(true);
                        return Unit.a;
                    }
                    if (ordinal != 2) {
                        throw vz1.i(oq5Var2, 413555562, false);
                    }
                }
                oq5Var2.Z(-64534415);
                j66.d.invoke(bVar.a(vciVar, b2c.f), hq5Var, 0);
                oq5Var2.p(false);
                oq5Var2.p(true);
                return Unit.a;
            case 1:
                rmk rmkVar = (rmk) obj4;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String str = rmkVar.a;
                    zpd zpdVar = zpd.h;
                    j66.r(str, null, null, zpdVar.a, oq5Var3, 0, 6);
                    u1g.l(oq5Var3, d.e(vciVar, upd.a));
                    String str2 = rmkVar.b;
                    long j = ((dq0) oq5Var3.j(eq0.a)).b.b;
                    ges a = upd.a();
                    yci a2 = androidx.compose.ui.platform.a.a(vciVar, "personal_playlist_description");
                    int i3 = zpdVar.b;
                    xv7.j(str2, a2, j, 0L, 0L, 0, 0L, 2, false, i3, i3, null, a, oq5Var3, 48, 48, 38904);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 2:
                lwl lwlVar = (lwl) obj4;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue3 & 17) == 16) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                ivf.p(48, hq5Var3, d.c(vciVar, 1.0f), lwlVar.c);
                return Unit.a;
            case 3:
                eoe eoeVar = (eoe) obj4;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                    u1g.l(oq5Var5, androidx.compose.foundation.layout.a.l(d.d(vciVar, 1.0f), eoeVar));
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 4:
                oxn oxnVar = (oxn) obj4;
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).f(dh3Var) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var7 = (oq5) hq5Var5;
                msd msdVar = (msd) oq5Var7.j(es5.l);
                w4k E = a0g.E(R.drawable.ic_burger, 0, oq5Var7);
                long j2 = ((dq0) oq5Var7.j(eq0.a)).a.c;
                yci a3 = dh3Var.a(d.m(vciVar, 24), b2c.f);
                boolean h = oq5Var7.h(msdVar);
                Object K = oq5Var7.K();
                Object obj5 = K;
                if (h || K == kjnVar) {
                    k2m k2mVar = new k2m(msdVar, 0);
                    oq5Var7.k0(k2mVar);
                    obj5 = k2mVar;
                }
                yci B = gut.B(oxnVar, a3, (Function1) obj5);
                boolean h2 = oq5Var7.h(msdVar);
                Object K2 = oq5Var7.K();
                Object obj6 = K2;
                if (h2 || K2 == kjnVar) {
                    k2m k2mVar2 = new k2m(msdVar, 1);
                    oq5Var7.k0(k2mVar2);
                    obj6 = k2mVar2;
                }
                gae.b(E, null, gut.X(oxnVar, B, (Function1) obj6), j2, oq5Var7, 48, 0);
                return Unit.a;
            case 5:
                final fem femVar = (fem) obj4;
                final zdm zdmVar = (zdm) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                zdmVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(zdmVar) ? 4 : 2;
                }
                oq5 oq5Var8 = (oq5) hq5Var6;
                if (!oq5Var8.P(intValue6 & 1, (intValue6 & 19) != 18)) {
                    oq5Var8.S();
                } else if (zdmVar instanceof xdm) {
                    oq5Var8.Z(1195369671);
                    xdm xdmVar = (xdm) zdmVar;
                    x1g x1gVar = xdmVar.a;
                    w3g w3gVar = xdmVar.b;
                    int i4 = intValue6 & 14;
                    boolean f = oq5Var8.f(femVar) | (i4 == 4);
                    Object K3 = oq5Var8.K();
                    if (f || K3 == kjnVar) {
                        final int i5 = false ? 1 : 0;
                        K3 = new Function0() { // from class: gdm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        oq oqVar = ((xdm) zdmVar).c;
                                        fem femVar2 = femVar;
                                        tnb.d((tnb) femVar2.d.a.getValue(), wjb.AlbumScreen);
                                        ncm ncmVar = femVar2.c;
                                        ncmVar.getClass();
                                        t tVar = ncmVar.a;
                                        tVar.startActivity(quj.T(tVar, oqVar, ru.yandex.music.common.media.context.d.v()));
                                        break;
                                    case 1:
                                        oq oqVar2 = ((xdm) zdmVar).c;
                                        ncm ncmVar2 = femVar.c;
                                        ncmVar2.getClass();
                                        lwg C = g0g.C(oqVar2, null);
                                        y supportFragmentManager = ncmVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), ru.yandex.music.common.media.context.d.v());
                                        break;
                                    case 2:
                                        cvl cvlVar = ((ydm) zdmVar).c;
                                        fem femVar3 = femVar;
                                        tnb.d((tnb) femVar3.d.a.getValue(), wjb.PlaylistScreen);
                                        ncm ncmVar3 = femVar3.c;
                                        ncmVar3.getClass();
                                        t tVar2 = ncmVar3.a;
                                        tVar2.startActivity(ixf.E(tVar2, cvlVar, ru.yandex.music.common.media.context.d.v()));
                                        break;
                                    default:
                                        cvl cvlVar2 = ((ydm) zdmVar).c;
                                        ncm ncmVar4 = femVar.c;
                                        ncmVar4.getClass();
                                        lwg G = g0g.G(cvlVar2);
                                        y supportFragmentManager2 = ncmVar4.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager2, vz1.f(supportFragmentManager2, G), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var8.k0(K3);
                    }
                    Function0 function0 = (Function0) K3;
                    boolean f2 = (i4 == 4) | oq5Var8.f(femVar);
                    Object K4 = oq5Var8.K();
                    if (f2 || K4 == kjnVar) {
                        final int i6 = 1;
                        K4 = new Function0() { // from class: gdm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i6) {
                                    case 0:
                                        oq oqVar = ((xdm) zdmVar).c;
                                        fem femVar2 = femVar;
                                        tnb.d((tnb) femVar2.d.a.getValue(), wjb.AlbumScreen);
                                        ncm ncmVar = femVar2.c;
                                        ncmVar.getClass();
                                        t tVar = ncmVar.a;
                                        tVar.startActivity(quj.T(tVar, oqVar, ru.yandex.music.common.media.context.d.v()));
                                        break;
                                    case 1:
                                        oq oqVar2 = ((xdm) zdmVar).c;
                                        ncm ncmVar2 = femVar.c;
                                        ncmVar2.getClass();
                                        lwg C = g0g.C(oqVar2, null);
                                        y supportFragmentManager = ncmVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), ru.yandex.music.common.media.context.d.v());
                                        break;
                                    case 2:
                                        cvl cvlVar = ((ydm) zdmVar).c;
                                        fem femVar3 = femVar;
                                        tnb.d((tnb) femVar3.d.a.getValue(), wjb.PlaylistScreen);
                                        ncm ncmVar3 = femVar3.c;
                                        ncmVar3.getClass();
                                        t tVar2 = ncmVar3.a;
                                        tVar2.startActivity(ixf.E(tVar2, cvlVar, ru.yandex.music.common.media.context.d.v()));
                                        break;
                                    default:
                                        cvl cvlVar2 = ((ydm) zdmVar).c;
                                        ncm ncmVar4 = femVar.c;
                                        ncmVar4.getClass();
                                        lwg G = g0g.G(cvlVar2);
                                        y supportFragmentManager2 = ncmVar4.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager2, vz1.f(supportFragmentManager2, G), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var8.k0(K4);
                    }
                    w1g.a(function0, x1gVar, w3gVar, null, false, (Function0) K4, oq5Var8, 0, 24);
                    oq5Var8.p(false);
                } else {
                    if (!(zdmVar instanceof ydm)) {
                        throw vz1.i(oq5Var8, -931273438, false);
                    }
                    oq5Var8.Z(1195757915);
                    ydm ydmVar = (ydm) zdmVar;
                    v1g v1gVar = ydmVar.a;
                    w3g w3gVar2 = ydmVar.b;
                    int i7 = intValue6 & 14;
                    boolean f3 = oq5Var8.f(femVar) | (i7 == 4);
                    Object K5 = oq5Var8.K();
                    if (f3 || K5 == kjnVar) {
                        final int i8 = 2;
                        K5 = new Function0() { // from class: gdm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i8) {
                                    case 0:
                                        oq oqVar = ((xdm) zdmVar).c;
                                        fem femVar2 = femVar;
                                        tnb.d((tnb) femVar2.d.a.getValue(), wjb.AlbumScreen);
                                        ncm ncmVar = femVar2.c;
                                        ncmVar.getClass();
                                        t tVar = ncmVar.a;
                                        tVar.startActivity(quj.T(tVar, oqVar, ru.yandex.music.common.media.context.d.v()));
                                        break;
                                    case 1:
                                        oq oqVar2 = ((xdm) zdmVar).c;
                                        ncm ncmVar2 = femVar.c;
                                        ncmVar2.getClass();
                                        lwg C = g0g.C(oqVar2, null);
                                        y supportFragmentManager = ncmVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), ru.yandex.music.common.media.context.d.v());
                                        break;
                                    case 2:
                                        cvl cvlVar = ((ydm) zdmVar).c;
                                        fem femVar3 = femVar;
                                        tnb.d((tnb) femVar3.d.a.getValue(), wjb.PlaylistScreen);
                                        ncm ncmVar3 = femVar3.c;
                                        ncmVar3.getClass();
                                        t tVar2 = ncmVar3.a;
                                        tVar2.startActivity(ixf.E(tVar2, cvlVar, ru.yandex.music.common.media.context.d.v()));
                                        break;
                                    default:
                                        cvl cvlVar2 = ((ydm) zdmVar).c;
                                        ncm ncmVar4 = femVar.c;
                                        ncmVar4.getClass();
                                        lwg G = g0g.G(cvlVar2);
                                        y supportFragmentManager2 = ncmVar4.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager2, vz1.f(supportFragmentManager2, G), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var8.k0(K5);
                    }
                    Function0 function02 = (Function0) K5;
                    boolean f4 = oq5Var8.f(femVar) | (i7 == 4);
                    Object K6 = oq5Var8.K();
                    if (f4 || K6 == kjnVar) {
                        final int i9 = 3;
                        K6 = new Function0() { // from class: gdm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        oq oqVar = ((xdm) zdmVar).c;
                                        fem femVar2 = femVar;
                                        tnb.d((tnb) femVar2.d.a.getValue(), wjb.AlbumScreen);
                                        ncm ncmVar = femVar2.c;
                                        ncmVar.getClass();
                                        t tVar = ncmVar.a;
                                        tVar.startActivity(quj.T(tVar, oqVar, ru.yandex.music.common.media.context.d.v()));
                                        break;
                                    case 1:
                                        oq oqVar2 = ((xdm) zdmVar).c;
                                        ncm ncmVar2 = femVar.c;
                                        ncmVar2.getClass();
                                        lwg C = g0g.C(oqVar2, null);
                                        y supportFragmentManager = ncmVar2.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), ru.yandex.music.common.media.context.d.v());
                                        break;
                                    case 2:
                                        cvl cvlVar = ((ydm) zdmVar).c;
                                        fem femVar3 = femVar;
                                        tnb.d((tnb) femVar3.d.a.getValue(), wjb.PlaylistScreen);
                                        ncm ncmVar3 = femVar3.c;
                                        ncmVar3.getClass();
                                        t tVar2 = ncmVar3.a;
                                        tVar2.startActivity(ixf.E(tVar2, cvlVar, ru.yandex.music.common.media.context.d.v()));
                                        break;
                                    default:
                                        cvl cvlVar2 = ((ydm) zdmVar).c;
                                        ncm ncmVar4 = femVar.c;
                                        ncmVar4.getClass();
                                        lwg G = g0g.G(cvlVar2);
                                        y supportFragmentManager2 = ncmVar4.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager2, vz1.f(supportFragmentManager2, G), ru.yandex.music.common.media.context.d.v());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var8.k0(K6);
                    }
                    y1g.d(function02, v1gVar, w3gVar2, null, false, (Function0) K6, oq5Var8, 0, 24);
                    oq5Var8.p(false);
                }
                return Unit.a;
            case 6:
                at5 at5Var = (at5) obj4;
                us5 us5Var = (us5) obj;
                int intValue7 = ((Integer) obj3).intValue();
                us5Var.getClass();
                oq5 oq5Var9 = (oq5) ((hq5) obj2);
                boolean f5 = oq5Var9.f(at5Var) | oq5Var9.h(us5Var);
                Object K7 = oq5Var9.K();
                if (f5 || K7 == kjnVar) {
                    K7 = new iik(20, at5Var, us5Var);
                    oq5Var9.k0(K7);
                }
                wyf.a(us5Var, (Function0) K7, oq5Var9, intValue7 & 14);
                return Unit.a;
            case 7:
                rjm rjmVar = (rjm) obj4;
                c cVar = (c) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var7).f(cVar) ? 4 : 2;
                }
                if ((intValue8 & 19) == 18) {
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                jzb jzbVar = rjmVar.c;
                boolean z2 = jzbVar != null;
                xme E2 = ox6.E(jzbVar, 0L, hq5Var7, 6);
                kn0 kn0Var = new kn0();
                kn0Var.c(rjmVar.b);
                xv7.i(kn0Var.h(), androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "pre_save_bottom_sheet_dialog_header_title"), ((dq0) ((oq5) hq5Var7).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 4, 0, bow.l(E2), null, nu0.b(), z2 ? bow.k(cVar, new xme[]{E2}) : null, null, hq5Var7, 48, 134220848, 612344);
                return Unit.a;
            case 8:
                u6k u6kVar = (u6k) obj4;
                List list = (List) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                list.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var8).f(list) ? 4 : 2;
                }
                oq5 oq5Var11 = (oq5) hq5Var8;
                if (oq5Var11.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    o1s o1sVar = (o1s) list.get(u6kVar.h());
                    o1sVar.getClass();
                    ug3.a(d.b(androidx.compose.foundation.a.b(xp3.u(androidx.compose.foundation.layout.a.m(vnj.q(vciVar, new tt5(6, o1sVar)), 2), ugo.a), ((dq0) oq5Var11.j(eq0.a)).c.c, vnj.i), 1.0f), oq5Var11, 0);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 9:
                e4n e4nVar = (e4n) obj4;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((o0k) obj).getClass();
                oq5 oq5Var12 = (oq5) hq5Var9;
                if (oq5Var12.P(intValue10 & 1, (intValue10 & 17) != 16)) {
                    yci c = d.c(vciVar, 1.0f);
                    ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var12, 0);
                    int i10 = oq5Var12.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var12.l();
                    yci H2 = vnj.H(oq5Var12, c);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var12.d0();
                    if (oq5Var12.O) {
                        oq5Var12.k(grbVar2);
                    } else {
                        oq5Var12.n0();
                    }
                    kb5 kb5Var2 = wp5.f;
                    g0g.U(oq5Var12, a4, kb5Var2);
                    kb5 kb5Var3 = wp5.e;
                    g0g.U(oq5Var12, l2, kb5Var3);
                    kb5 kb5Var4 = wp5.g;
                    if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i10))) {
                        ouj.x(i10, oq5Var12, i10, kb5Var4);
                    }
                    kb5 kb5Var5 = wp5.d;
                    g0g.U(oq5Var12, H2, kb5Var5);
                    l4n l4nVar = (l4n) szf.Q(((i4n) e4nVar.b.getValue()).l, oq5Var12).getValue();
                    if (Intrinsics.d(l4nVar, j4n.a)) {
                        oq5Var12.Z(1855141819);
                        yci c2 = d.c(vciVar, 1.0f);
                        kfh d2 = ug3.d(b2c.b, false);
                        int i11 = oq5Var12.P;
                        androidx.compose.runtime.internal.a l3 = oq5Var12.l();
                        yci H3 = vnj.H(oq5Var12, c2);
                        oq5Var12.d0();
                        if (oq5Var12.O) {
                            oq5Var12.k(grbVar2);
                        } else {
                            oq5Var12.n0();
                        }
                        g0g.U(oq5Var12, d2, kb5Var2);
                        g0g.U(oq5Var12, l3, kb5Var3);
                        if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i11))) {
                            ouj.x(i11, oq5Var12, i11, kb5Var4);
                        }
                        g0g.U(oq5Var12, H3, kb5Var5);
                        c3x.m(0, 2, 0L, oq5Var12, bVar.a(vciVar, b2c.f));
                        oq5Var12.p(true);
                        oq5Var12.p(false);
                    } else {
                        if (!(l4nVar instanceof k4n)) {
                            throw vz1.i(oq5Var12, -1464180625, false);
                        }
                        oq5Var12.Z(1855577524);
                        String str3 = ((k4n) l4nVar).a;
                        yci c3 = d.c(vciVar, 1.0f);
                        Object K8 = oq5Var12.K();
                        Object obj7 = K8;
                        if (K8 == kjnVar) {
                            xfv xfvVar = new xfv(38);
                            oq5Var12.k0(xfvVar);
                            obj7 = xfvVar;
                        }
                        xfv xfvVar2 = (xfv) obj7;
                        boolean h3 = oq5Var12.h(e4nVar);
                        Object K9 = oq5Var12.K();
                        if (h3 || K9 == kjnVar) {
                            ujd ujdVar = new ujd(5, e4nVar, e4n.class, "onDownloadRequest", "onDownloadRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", 0, 2);
                            oq5Var12.k0(ujdVar);
                            K9 = ujdVar;
                        }
                        g4n g4nVar = new g4n((tyc) ((h9f) K9));
                        long j3 = d85.m;
                        cgv a0 = wyf.a0(oq5Var12);
                        boolean f6 = oq5Var12.f(str3);
                        Object K10 = oq5Var12.K();
                        Object obj8 = K10;
                        if (f6 || K10 == kjnVar) {
                            x6k g0 = szf.g0(new xcv(str3, (String) null, 6));
                            oq5Var12.k0(g0);
                            obj8 = g0;
                        }
                        ixf.n((xcv) ((aqi) obj8).getValue(), c3, null, j3, xfvVar2, a0, null, null, g4nVar, false, oq5Var12, 196992, 0, 0);
                        oq5Var12.p(false);
                    }
                    oq5Var12.p(true);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 10:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                int L = mfhVar.L(24);
                float f7 = 32;
                int L2 = mfhVar.L(f7);
                int L3 = mfhVar.L(f7);
                int L4 = mfhVar.L(411);
                long j4 = ((ga6) obj3).a;
                float min = Math.min(ga6.i(j4) / L4, 1.0f);
                Rect rect = ((ayg) obj4).k;
                int b2 = eeh.b((L4 + L + L2) * min);
                int b3 = rect.width() > 0 ? eeh.b((b2 * rect.height()) / rect.width()) : ga6.h(j4);
                return mfh.m0(mfhVar, ga6.i(j4), ga6.h(j4), new dt4(ffhVar.M(ga6.a(b2, b2, b3, b3)), L3 - eeh.b(min * (L + L3)), Math.max(0, (b3 - ga6.h(j4)) / 2), 3));
            case 11:
                qtn qtnVar = (qtn) obj4;
                c cVar2 = (c) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var10).f(cVar2) ? 4 : 2;
                }
                if ((intValue11 & 19) == 18) {
                    oq5 oq5Var13 = (oq5) hq5Var10;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        return Unit.a;
                    }
                }
                jzb jzbVar2 = qtnVar.e;
                z = jzbVar2 != null;
                xme E3 = ox6.E(jzbVar2, 0L, hq5Var10, 6);
                mn0 mn0Var = new mn0(6, qtnVar.b, (ArrayList) null);
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xv7.i(mn0Var, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "release_title"), ((dq0) ((oq5) hq5Var10).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(E3), null, nu0.j(), z ? bow.k(cVar2, new xme[]{E3}) : null, null, hq5Var10, 48, 134220848, 612344);
                return Unit.a;
            case 12:
                a2p a2pVar = (a2p) obj4;
                k2p k2pVar = (k2p) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                k2pVar.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((oq5) hq5Var11).f(k2pVar) ? 4 : 2;
                }
                oq5 oq5Var14 = (oq5) hq5Var11;
                if (!oq5Var14.P(intValue12 & 1, (intValue12 & 19) != 18)) {
                    oq5Var14.S();
                } else if (k2pVar instanceof j2p) {
                    oq5Var14.Z(1388271542);
                    v3g.m((j2p) k2pVar, a2pVar, null, oq5Var14, intValue12 & 14);
                    oq5Var14.p(false);
                } else if (k2pVar instanceof i2p) {
                    oq5Var14.Z(1388276989);
                    v3g.l((i2p) k2pVar, null, oq5Var14, intValue12 & 14);
                    oq5Var14.p(false);
                } else {
                    if (!(k2pVar instanceof h2p)) {
                        throw vz1.i(oq5Var14, 1388269625, false);
                    }
                    oq5Var14.Z(1388280465);
                    v3g.k((h2p) k2pVar, null, oq5Var14, intValue12 & 14);
                    oq5Var14.p(false);
                }
                return Unit.a;
            case 13:
                c0p c0pVar = (c0p) obj4;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var15 = (oq5) hq5Var12;
                if (oq5Var15.P(intValue13 & 1, (intValue13 & 17) != 16)) {
                    o5g.g(c0pVar, null, oq5Var15, 0);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 14:
                s2p s2pVar = (s2p) obj4;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var16 = (oq5) hq5Var13;
                if (oq5Var16.P(intValue14 & 1, (intValue14 & 17) != 16)) {
                    yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 24, 0.0f, 0.0f, 13);
                    ta5 a5 = sa5.a(qx0.c, b2c.n, oq5Var16, 0);
                    int i12 = oq5Var16.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var16.l();
                    yci H4 = vnj.H(oq5Var16, q);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var16.d0();
                    if (oq5Var16.O) {
                        oq5Var16.k(grbVar3);
                    } else {
                        oq5Var16.n0();
                    }
                    g0g.U(oq5Var16, a5, wp5.f);
                    g0g.U(oq5Var16, l4, wp5.e);
                    kb5 kb5Var6 = wp5.g;
                    if (oq5Var16.O || !Intrinsics.d(oq5Var16.K(), Integer.valueOf(i12))) {
                        ouj.x(i12, oq5Var16, i12, kb5Var6);
                    }
                    g0g.U(oq5Var16, H4, wp5.d);
                    String M = rvf.M(R.string.clear_own_search_history, oq5Var16);
                    boolean h4 = oq5Var16.h(s2pVar);
                    Object K11 = oq5Var16.K();
                    if (h4 || K11 == kjnVar) {
                        K11 = new r9n(0, s2pVar, s2p.class, "onClearHistoryClick", "onClearHistoryClick()V", 0, 24);
                        oq5Var16.k0(K11);
                    }
                    hdg.t(M, (Function0) ((h9f) K11), androidx.compose.ui.platform.a.a(new HorizontalAlignElement(b2c.o), "search_history_clear_button"), null, oq5Var16, 0, 8);
                    oq5Var16.p(true);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 15:
                ((agp) obj4).e();
                return Unit.a;
            case 16:
                urp urpVar = (urp) obj4;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue15 & 17) == 16) {
                    oq5 oq5Var17 = (oq5) hq5Var14;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                int i13 = urpVar.a;
                for (int i14 = 0; i14 < i13; i14++) {
                    pm0.c(xp3.u(d.o(vciVar, trp.b, trp.a), ugo.a), hq5Var14, 0);
                }
                return Unit.a;
            case 17:
                String str4 = (String) obj2;
                str4.getClass();
                ((lrp) obj4).a(((Boolean) obj).booleanValue(), str4, (gjl) obj3);
                return Unit.a;
            case 18:
                mhq mhqVar = (mhq) obj;
                int intValue16 = ((Integer) obj3).intValue();
                mhqVar.getClass();
                ((wn5) ((y3) obj4).c).invoke(mhqVar, (hq5) obj2, Integer.valueOf(intValue16 & 14));
                return Unit.a;
            case 19:
                shq shqVar = (shq) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str5 = (String) obj2;
                qkl qklVar = (qkl) obj3;
                str5.getClass();
                shqVar.getClass();
                mhq mhqVar2 = shqVar.a;
                mhqVar2.getClass();
                if (qklVar != null) {
                    hjl hjlVar = mhqVar2.b;
                    gjl gjlVar = qklVar.a;
                    hjlVar.e(booleanValue, str5, qklVar.b, gjlVar.b, gjlVar.a, gjlVar.c);
                }
                return Unit.a;
            case 20:
                a5r a5rVar = (a5r) obj4;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var18 = (oq5) hq5Var15;
                if (oq5Var18.P(intValue17 & 1, (intValue17 & 17) != 16)) {
                    z4r z4rVar = a5rVar.i;
                    String str6 = pd.M() ? z4rVar.a : z4rVar.b;
                    if (str6 == null) {
                        oq5Var18.Z(-390135247);
                    } else {
                        oq5Var18.Z(-390135246);
                        ltg.e(qo6.k, str6, androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "special_image"), hd6.b, a5rVar.j == x4r.a ? b2c.g : b2c.e, bow.f, bow.g, null, oq5Var18, 1772934, 128);
                    }
                    oq5Var18.p(false);
                } else {
                    oq5Var18.S();
                }
                return Unit.a;
            case 21:
                w4r w4rVar = (w4r) obj4;
                bht bhtVar = (bht) obj;
                hq5 hq5Var16 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                bhtVar.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((oq5) hq5Var16).f(bhtVar) ? 4 : 2;
                }
                oq5 oq5Var19 = (oq5) hq5Var16;
                if (!oq5Var19.P(intValue18 & 1, (intValue18 & 19) != 18)) {
                    oq5Var19.S();
                } else if (bhtVar.equals(zft.a)) {
                    oq5Var19.Z(222614643);
                    Object K12 = oq5Var19.K();
                    if (K12 == kjnVar) {
                        K12 = new xnq(28);
                        oq5Var19.k0(K12);
                    }
                    a4g.l(6, oq5Var19, nfp.a(vciVar, (Function1) K12), true);
                    oq5Var19.p(false);
                } else if (bhtVar.equals(yft.a)) {
                    oq5Var19.Z(222618484);
                    Object K13 = oq5Var19.K();
                    if (K13 == kjnVar) {
                        K13 = new xnq(29);
                        oq5Var19.k0(K13);
                    }
                    a4g.l(6, oq5Var19, nfp.a(vciVar, (Function1) K13), false);
                    oq5Var19.p(false);
                } else {
                    if (!(bhtVar instanceof ogt)) {
                        throw vz1.i(oq5Var19, 222613499, false);
                    }
                    oq5Var19.Z(222622603);
                    a4g.m(((ogt) bhtVar).a, w4rVar, vciVar, oq5Var19, 0);
                    oq5Var19.p(false);
                }
                return Unit.a;
            case 22:
                return a(obj, obj2, obj3);
            case 23:
                return d(obj, obj2, obj3);
            case 24:
                return g(obj, obj2, obj3);
            case 25:
                return h(obj, obj2, obj3);
            case 26:
                return j(obj, obj2, obj3);
            case 27:
                return k(obj, obj2, obj3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return l(obj, obj2, obj3);
            default:
                a3u a3uVar = (a3u) obj4;
                c cVar3 = (c) obj;
                hq5 hq5Var17 = (hq5) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((oq5) hq5Var17).f(cVar3) ? 4 : 2;
                }
                if ((intValue19 & 19) == 18) {
                    oq5 oq5Var20 = (oq5) hq5Var17;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                jzb jzbVar3 = a3uVar.c;
                z = jzbVar3 != null;
                xme E4 = ox6.E(jzbVar3, 0L, hq5Var17, 6);
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(a3uVar.b);
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList2.add(((jn0) arrayList.get(i15)).a(sb.length()));
                }
                xv7.i(new mn0(sb2, arrayList2), d.d(vciVar, 1.0f), ((dq0) ((oq5) hq5Var17).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 4, 0, bow.l(E4), null, nu0.b(), z ? bow.k(cVar3, new xme[]{E4}) : null, null, hq5Var17, 48, 134220848, 612344);
                return Unit.a;
        }
    }

    public /* synthetic */ tik(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
