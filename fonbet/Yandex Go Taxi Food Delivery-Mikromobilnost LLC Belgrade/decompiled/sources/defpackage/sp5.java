package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.rida.bids.ui.c;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.xplat.common.YSError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.wheel_picker.a;
import ru.yandex.taxi.masstransit.stoproute.router.ComposableSingletons$MtStopRouteRouterKt;

/* loaded from: classes12.dex */
public final /* synthetic */ class sp5 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sp5(xnb xnbVar, tls tlsVar) {
        this.a = 18;
        this.b = xnbVar;
        this.c = tlsVar;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        apb apbVar = (apb) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            jeb1.f(apbVar.a, an91.n(c530Var, 16.0f, 20.0f, 16.0f, 16.0f), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).e.d, btsVar, 0, 0, 16380);
            boolean k = btsVar.k(apbVar) | btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new a7b(13, apbVar, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(null, null, null, null, null, null, false, null, (tls) Q, btsVar, 0, 511);
            f530 c = ljs0.c(an91.o(c530Var, 8.0f, 0.0f, 8.0f, 8.0f, 2), 1.0f);
            ButtonSize buttonSize = ButtonSize.L;
            boolean k2 = btsVar.k(tlsVar);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new fv9(18, tlsVar);
                btsVar.o0(Q2);
            }
            ohb1.b(c, true, buttonSize, (sls) Q2, wwg.S(1994068315, true, new ota(i, apbVar), btsVar), btsVar, 24966, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        by41 by41Var = (by41) this.b;
        tls tlsVar = (tls) this.c;
        dj6 dj6Var = (dj6) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(dj6Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            float d = dj6Var.d() - 32.0f;
            f530 c = ljs0.c(an91.m(c530.a, 16.0f, 0.0f, 2), 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            btsVar.e0(-363889840);
            Iterator it = by41Var.c.iterator();
            while (it.hasNext()) {
                a.b((vx41) it.next(), d, tlsVar, btsVar, 6);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        float f;
        c530 c530Var;
        fvd fvdVar = (fvd) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var2 = c530.a;
            f530 d = b.d(btsVar, c530Var2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            jeb1.f(fvdVar.a, an91.k(c530Var2, 16.0f), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).e.c, btsVar, 48, 0, 16380);
            bts btsVar2 = btsVar;
            if (fvdVar.b.length() > 0) {
                btsVar2.e0(1969126622);
                c530Var = c530Var2;
                f = 16.0f;
                jeb1.f(fvdVar.b, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 8.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 432, 0, 16376);
                btsVar2 = btsVar2;
                btsVar2.t(false);
            } else {
                f = 16.0f;
                c530Var = c530Var2;
                btsVar2.e0(1969357510);
                btsVar2.t(false);
            }
            x2y x2yVar = new x2y(1.0f, false);
            boolean k = btsVar2.k(fvdVar) | btsVar2.k(tlsVar);
            Object Q = btsVar2.Q();
            int i = 28;
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new a7b(i, fvdVar, tlsVar);
                btsVar2.o0(Q);
            }
            bts btsVar3 = btsVar2;
            adb1.a(x2yVar, null, null, null, null, null, false, null, (tls) Q, btsVar3, 0, 510);
            f530 c = ljs0.c(an91.n(c530Var, f, 4.0f, f, 8.0f), 1.0f);
            ButtonSize buttonSize = ButtonSize.L;
            boolean k2 = btsVar3.k(tlsVar);
            Object Q2 = btsVar3.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new fv9(28, tlsVar);
                btsVar3.o0(Q2);
            }
            ulb1.a(c, false, buttonSize, (sls) Q2, wwg.S(1560589659, true, new ota(5, fvdVar), btsVar3), btsVar3, 24960, 2);
            btsVar3.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.b;
        ste steVar = (ste) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 16;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            boolean k = btsVar.k(tlsVar) | btsVar.k(steVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new jhd(i, tlsVar, steVar);
                btsVar.o0(Q);
            }
            mab1.a(null, null, null, null, null, null, (sls) Q, btsVar, 0, 63);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        t0f t0fVar = (t0f) this.b;
        tls tlsVar = (tls) this.c;
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 4;
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            f530 o = an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10);
            int i2 = t0fVar.b;
            boolean z = !t0fVar.g;
            int i3 = t0fVar.c;
            int i4 = t0fVar.d;
            ButtonSize buttonSize = ButtonSize.S;
            boolean k = btsVar.k(t0fVar) | btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new dke(i, t0fVar, tlsVar);
                btsVar.o0(Q);
            }
            ncb1.a(i2, o, z, i3, i4, (tls) Q, null, null, buttonSize, btsVar, 100663296, 192);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        irl irlVar = (irl) this.b;
        ety0 ety0Var = (ety0) this.c;
        ebp0 ebp0Var = (ebp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            p9b1.c(ebp0Var, irlVar.c, null, irlVar.d, ety0Var, 0, 0, null, null, null, 0, 0, null, btsVar, intValue & 14, 0, 8178);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        String str = (String) this.b;
        tls tlsVar = (tls) obj3;
        try {
            ((tls) obj2).invoke(((com.yandex.payment.sdk.core.impl.bind.a) this.c).a(str.getBytes(uza.a)));
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getName();
            }
            tlsVar.invoke(new YSError(message, th));
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        f530 f530Var;
        int i = this.a;
        g43 g43Var = lr20.c;
        int i2 = 4;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        int i3 = 16;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                eq5 eq5Var = (eq5) obj5;
                tx40 tx40Var = (tx40) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                } else if (eq5Var.a != null) {
                    btsVar.e0(-388538692);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    bmb1.a(tx40Var, new up2(hq2.a), AppColor$Palette.ControlMinor, ljs0.m(an91.k(c530Var, 8.0f), 40.0f), null, 0.0f, 0, btsVar, 3462);
                    jeb1.f(String.valueOf(eq5Var.b), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.c, btsVar, 0, 0, 16382);
                    btsVar.t(true);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-388033082);
                    nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
                }
                return zy11Var;
            case 1:
                gq5 gq5Var = (gq5) obj5;
                tls tlsVar = (tls) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    c.f(gq5Var, null, tlsVar, btsVar2, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                int i4 = 4;
                cq5 cq5Var = (cq5) obj5;
                tls tlsVar2 = (tls) obj4;
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    if (!((bts) fidVar3).k(ibp0Var2)) {
                        i4 = 2;
                    }
                    intValue3 |= i4;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean z2 = cq5Var.b;
                    boolean k = btsVar3.k(tlsVar2);
                    Object Q = btsVar3.Q();
                    if (k || Q == o430Var) {
                        Q = new a0(i3, tlsVar2);
                        btsVar3.o0(Q);
                    }
                    ijb1.b(z2, an91.o(c530.a, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, null, (tls) Q, true, btsVar3, 0, 28);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                z69 z69Var = (z69) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                int intValue4 = ((Integer) obj).intValue();
                fid fidVar4 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= fidVar4.c(intValue4) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    bts btsVar4 = (bts) fidVar4;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        return zy11Var;
                    }
                }
                wqy0.b((String) arrayList.get(intValue4), null, z69Var.b.getIntValue() == intValue4 ? ldc.f : rzo.f(2583691263L), uh6.E(20), null, new lzr(700), null, 0L, null, null, uh6.E(22), 0, false, 0, 0, null, null, fidVar4, 199680, 6, 130002);
                return zy11Var;
            case 4:
                sub1.a((tls) obj5, obj4, (fse) obj3);
                return zy11Var;
            case 5:
                ((Integer) obj3).getClass();
                bts btsVar5 = (bts) ((fid) obj2);
                btsVar5.e0(405466283);
                f530 a = aab1.a(d17.d, tje.n((wp2) obj5, btsVar5), (f530) obj, (ehr0) obj4);
                btsVar5.t(false);
                return a;
            case 6:
                tls tlsVar3 = (tls) obj5;
                tj7 tj7Var = (tj7) obj4;
                fid fidVar5 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar5;
                boolean V = btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16);
                dmw0 dmw0Var = btsVar6.a;
                if (V) {
                    f530 k2 = an91.k(c530Var, 16.0f);
                    so5 so5Var = x4c.H;
                    sic a2 = qic.a(g43Var, so5Var, btsVar6, 48);
                    int hashCode2 = Long.hashCode(btsVar6.T);
                    r1b0 o2 = btsVar6.o();
                    f530 d3 = b.d(btsVar6, k2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar2);
                    } else {
                        btsVar6.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar6, wlsVar, a2);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar6, wlsVar2, o2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar6, wlsVar3, valueOf);
                    tls tlsVar4 = d.h;
                    qje.M(btsVar6, tlsVar4);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar6, wlsVar4, d3);
                    sic a3 = qic.a(new i43(4.0f, true, new quz(11)), so5Var, btsVar6, 54);
                    int hashCode3 = Long.hashCode(btsVar6.T);
                    r1b0 o3 = btsVar6.o();
                    f530 d4 = b.d(btsVar6, c530Var);
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar2);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, wlsVar, a3);
                    qje.W(btsVar6, wlsVar2, o3);
                    vfc.v(hashCode3, btsVar6, wlsVar3, btsVar6, tlsVar4);
                    qje.W(btsVar6, wlsVar4, d4);
                    jeb1.f(tj7Var.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar6).e.d, btsVar6, 0, 0, 16382);
                    String str = tj7Var.b;
                    if (str == null) {
                        btsVar6.e0(158066072);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(158066073);
                        jeb1.f(str, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar6).g.a, btsVar6, 0, 0, 16382);
                        btsVar6.t(false);
                    }
                    n.y(btsVar6, true, c530Var, 28.0f, btsVar6);
                    boolean k3 = btsVar6.k(tlsVar3);
                    Object Q2 = btsVar6.Q();
                    if (k3 || Q2 == o430Var) {
                        Q2 = new zp5(4, tlsVar3);
                        btsVar6.o0(Q2);
                    }
                    phb1.b((sls) Q2, null, false, null, null, wwg.S(853906223, true, new bj0(19, tj7Var), btsVar6), null, null, null, btsVar6, ImageMetadata.EDGE_MODE, 990);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 7:
                bz7 bz7Var = (bz7) obj5;
                tls tlsVar5 = (tls) obj4;
                fid fidVar6 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar6;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Iterator it = bz7Var.c.iterator();
                    while (it.hasNext()) {
                        com.yandex.go.taxi.order.cancel.v3.ui.a.a((zy7) it.next(), tlsVar5, btsVar7, 0);
                    }
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 8:
                cz7 cz7Var = (cz7) obj5;
                tls tlsVar6 = (tls) obj4;
                fid fidVar7 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar7;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    sic a4 = qic.a(g43Var, x4c.G, btsVar8, 0);
                    int hashCode4 = Long.hashCode(btsVar8.T);
                    r1b0 o4 = btsVar8.o();
                    f530 d5 = b.d(btsVar8, c530Var);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar8.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar8.i0();
                    if (btsVar8.S) {
                        btsVar8.n(slsVar3);
                    } else {
                        btsVar8.r0();
                    }
                    qje.W(btsVar8, d.f, a4);
                    qje.W(btsVar8, d.e, o4);
                    qje.W(btsVar8, d.g, Integer.valueOf(hashCode4));
                    qje.M(btsVar8, d.h);
                    com.yandex.go.taxi.order.cancel.v3.ui.a.d(n.d(btsVar8, d5, d.d, 1.0f, false), cz7Var, tlsVar6, btsVar8, 0);
                    com.yandex.go.taxi.order.cancel.v3.ui.a.e(cz7Var, tlsVar6, btsVar8, 0);
                    btsVar8.t(true);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 9:
                xy7 xy7Var = (xy7) obj5;
                tls tlsVar7 = (tls) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar8;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    com.yandex.go.taxi.order.cancel.v3.ui.a.c(xy7Var, tlsVar7, btsVar9, 0);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 10:
                e88 e88Var = (e88) obj5;
                tls tlsVar8 = (tls) obj4;
                bj6 bj6Var = (bj6) obj;
                fid fidVar9 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((bts) fidVar9).k(bj6Var) ? 4 : 2;
                }
                bts btsVar10 = (bts) fidVar9;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                    jeb1.f(e88Var.a, bj6Var.a(c530Var, x4c.y), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar10, 0, 0, 32764);
                    f530 o5 = an91.o(an91.m(bj6Var.a(c530Var, x4c.B), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    boolean b = btsVar10.b(4.0f) | btsVar10.c(2) | btsVar10.a(false);
                    Object Q3 = btsVar10.Q();
                    if (b || Q3 == o430Var) {
                        Q3 = new jg0(i2);
                        btsVar10.o0(Q3);
                    }
                    z910 z910Var = (z910) Q3;
                    int hashCode5 = Long.hashCode(btsVar10.T);
                    r1b0 o6 = btsVar10.o();
                    f530 d6 = b.d(btsVar10, o5);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar10.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar10.i0();
                    if (btsVar10.S) {
                        btsVar10.n(slsVar4);
                    } else {
                        btsVar10.r0();
                    }
                    qje.W(btsVar10, d.f, z910Var);
                    qje.W(btsVar10, d.e, o6);
                    qje.W(btsVar10, d.g, Integer.valueOf(hashCode5));
                    qje.M(btsVar10, d.h);
                    qje.W(btsVar10, d.d, d6);
                    boolean k4 = btsVar10.k(tlsVar8);
                    Object Q4 = btsVar10.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new zp5(21, tlsVar8);
                        btsVar10.o0(Q4);
                    }
                    h4d.a.getClass();
                    ohb1.b(null, false, null, (sls) Q4, h4d.b, btsVar10, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                    btsVar10.t(true);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 11:
                wz8 wz8Var = (wz8) obj5;
                String str2 = (String) obj4;
                Bitmap bitmap = (Bitmap) obj;
                ru.yandex.taxi.preorder.source.cars.a aVar = wz8Var.b;
                uz8 uz8Var = wz8Var.a;
                aVar.getClass();
                try {
                    ImageProvider fromBitmap = ImageProvider.fromBitmap(aVar.c(bitmap, str2));
                    unr0.C(new Object[]{str2}, 1, "Save an image for tariff %s", jst.e);
                    uz8Var.a(str2, fromBitmap);
                } catch (Exception e) {
                    jst.e.k(e, String.format("Error while creating car ImageProvider for tariff %s, with size_hint %d", Arrays.copyOf(new Object[]{str2, Integer.valueOf(((avj0) aVar.b).j())}, 2)));
                }
                return zy11Var;
            case 12:
                vd9 vd9Var = (vd9) obj5;
                tls tlsVar9 = (tls) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar10;
                if (!btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    btsVar11.Y();
                } else {
                    if (vd9Var == null) {
                        throw unr0.y(-103663496, btsVar11, false);
                    }
                    btsVar11.e0(1081459217);
                    ygb1.a(vd9Var, tlsVar9, btsVar11, 0);
                    btsVar11.t(false);
                }
                return zy11Var;
            case 13:
                t0a t0aVar = (t0a) obj5;
                tls tlsVar10 = (tls) obj4;
                fid fidVar11 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar11;
                if (!btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    btsVar12.Y();
                } else if (t0aVar instanceof q0a) {
                    btsVar12.e0(1476934848);
                    dz9 dz9Var = ((q0a) t0aVar).a.e;
                    boolean k5 = btsVar12.k(t0aVar) | btsVar12.k(tlsVar10);
                    Object Q5 = btsVar12.Q();
                    if (k5 || Q5 == o430Var) {
                        Q5 = new pz9(t0aVar, tlsVar10);
                        btsVar12.o0(Q5);
                    }
                    sls slsVar5 = (sls) Q5;
                    boolean k6 = btsVar12.k(tlsVar10) | btsVar12.k(t0aVar);
                    Object Q6 = btsVar12.Q();
                    if (k6 || Q6 == o430Var) {
                        Q6 = new pz9(tlsVar10, t0aVar);
                        btsVar12.o0(Q6);
                    }
                    com.yandex.go.chargers.feedback.ui.b.f(dz9Var, slsVar5, (sls) Q6, btsVar12, 8);
                    btsVar12.t(false);
                } else if (t0aVar instanceof r0a) {
                    btsVar12.e0(1478757338);
                    btsVar12.t(false);
                } else {
                    if (!jl40.l(t0aVar, s0a.a)) {
                        throw unr0.y(-1614926697, btsVar12, false);
                    }
                    btsVar12.e0(1478832451);
                    bz9.b(btsVar12, 0);
                    btsVar12.t(false);
                }
                return zy11Var;
            case 14:
                iga igaVar = (iga) obj5;
                tls tlsVar11 = (tls) obj4;
                fid fidVar12 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar13 = (bts) fidVar12;
                if (!btsVar13.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    btsVar13.Y();
                } else if (igaVar.c.isEmpty()) {
                    btsVar13.e0(1356714176);
                    btsVar13.t(false);
                } else {
                    btsVar13.e0(1356556572);
                    List list = igaVar.c;
                    boolean k7 = btsVar13.k(tlsVar11);
                    Object Q7 = btsVar13.Q();
                    if (k7 || Q7 == o430Var) {
                        Q7 = new dv9(12, tlsVar11);
                        btsVar13.o0(Q7);
                    }
                    t791.b(list, false, (tls) Q7, btsVar13, 0, 2);
                    btsVar13.t(false);
                }
                return zy11Var;
            case 15:
                yha yhaVar = (yha) obj5;
                tls tlsVar12 = (tls) obj4;
                fid fidVar13 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar13;
                if (!btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    btsVar14.Y();
                } else if (yhaVar.f) {
                    btsVar14.e0(-1233476344);
                    zib1.b(btsVar14, 0);
                    btsVar14.t(false);
                } else {
                    btsVar14.e0(-1233430371);
                    if (yhaVar.e.isEmpty()) {
                        z = false;
                        btsVar14.e0(-1233180759);
                        btsVar14.t(false);
                    } else {
                        btsVar14.e0(-1233390257);
                        List list2 = yhaVar.e;
                        boolean z3 = yhaVar.g;
                        boolean k8 = btsVar14.k(tlsVar12);
                        Object Q8 = btsVar14.Q();
                        if (k8 || Q8 == o430Var) {
                            Q8 = new dv9(15, tlsVar12);
                            btsVar14.o0(Q8);
                        }
                        t791.b(list2, z3, (tls) Q8, btsVar14, 0, 0);
                        z = false;
                        btsVar14.t(false);
                    }
                    btsVar14.t(z);
                }
                return zy11Var;
            case 16:
                bja bjaVar = (bja) obj5;
                tls tlsVar13 = (tls) obj4;
                fid fidVar14 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar14;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    bjb1.b(bjaVar, tlsVar13, btsVar15, 0);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 17:
                wg6 wg6Var = (wg6) obj5;
                tls tlsVar14 = (tls) obj4;
                fid fidVar15 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar15;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    boolean k9 = btsVar16.k(tlsVar14);
                    Object Q9 = btsVar16.Q();
                    if (k9 || Q9 == o430Var) {
                        Q9 = new fv9(13, tlsVar14);
                        btsVar16.o0(Q9);
                    }
                    mab1.c(wg6Var, null, null, null, null, null, null, (sls) Q9, btsVar16, 0);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 18:
                xnb xnbVar = (xnb) obj5;
                tls tlsVar15 = (tls) obj4;
                fid fidVar16 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar16;
                if (!btsVar17.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    btsVar17.Y();
                } else if (xnbVar instanceof unb) {
                    btsVar17.e0(1730740700);
                    ohe.a(c530Var, (unb) xnbVar, tlsVar15, btsVar17, 0);
                    btsVar17.t(false);
                } else if (xnbVar instanceof vnb) {
                    btsVar17.e0(1730907294);
                    oaa1.a((vnb) xnbVar, tlsVar15, btsVar17, 0);
                    btsVar17.t(false);
                } else if (xnbVar instanceof wnb) {
                    btsVar17.e0(1731074012);
                    j0z.a(c530Var, (wnb) xnbVar, tlsVar15, btsVar17, 0);
                    btsVar17.t(false);
                } else {
                    btsVar17.e0(1731217015);
                    btsVar17.t(false);
                }
                return zy11Var;
            case 19:
                return b(obj, obj2, obj3);
            case 20:
                wg6 wg6Var2 = (wg6) obj5;
                xfd xfdVar = (xfd) obj4;
                fid fidVar17 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ComposableSingletons$MtStopRouteRouterKt composableSingletons$MtStopRouteRouterKt = ComposableSingletons$MtStopRouteRouterKt.a;
                bts btsVar18 = (bts) fidVar17;
                if (btsVar18.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    f530 a5 = androidx.compose.ui.graphics.d.a(c530Var, new of6(wg6Var2, 0));
                    boolean e2 = btsVar18.e(xfdVar);
                    Object Q10 = btsVar18.Q();
                    if (e2 || Q10 == o430Var) {
                        Q10 = new x1d(xfdVar, 2);
                        btsVar18.o0(Q10);
                    }
                    qe61.a(a5, (tls) Q10, btsVar18, 0, 0);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 21:
                return d(obj, obj2, obj3);
            case 22:
                return e(obj, obj2, obj3);
            case 23:
                bzd bzdVar = (bzd) obj5;
                fid fidVar18 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar19 = (bts) fidVar18;
                if (btsVar19.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    bzdVar.getClass();
                    btsVar19.e0(-1024958299);
                    m791.d(false, false, btsVar19, 0);
                    btsVar19.t(false);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 24:
                tls tlsVar16 = (tls) obj5;
                yje yjeVar = (yje) obj4;
                fid fidVar19 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar20 = (bts) fidVar19;
                if (btsVar20.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Object Q11 = btsVar20.Q();
                    if (Q11 == o430Var) {
                        d6d.a.getClass();
                        Q11 = new zje(d6d.b);
                        btsVar20.o0(Q11);
                    }
                    zje zjeVar = (zje) Q11;
                    zjeVar.b.clear();
                    tlsVar16.invoke(zjeVar);
                    zjeVar.a(yjeVar, btsVar20, 0);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 25:
                return f(obj, obj2, obj3);
            case 26:
                return g(obj, obj2, obj3);
            case 27:
                return i(obj, obj2, obj3);
            case 28:
                return j(obj, obj2, obj3);
            default:
                final urh urhVar = (urh) obj5;
                tls tlsVar17 = (tls) obj4;
                fid fidVar20 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                bts btsVar21 = (bts) fidVar20;
                boolean V2 = btsVar21.V(intValue21 & 1, (intValue21 & 17) != 16);
                dmw0 dmw0Var2 = btsVar21.a;
                if (!V2) {
                    btsVar21.Y();
                    return zy11Var;
                }
                sic a6 = qic.a(g43Var, x4c.G, btsVar21, 0);
                int hashCode6 = Long.hashCode(btsVar21.T);
                r1b0 o7 = btsVar21.o();
                c530 c530Var2 = c530.a;
                f530 d7 = b.d(btsVar21, c530Var2);
                ohd.G1.getClass();
                sls slsVar6 = d.b;
                if (dmw0Var2 == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar21.i0();
                if (btsVar21.S) {
                    btsVar21.n(slsVar6);
                } else {
                    btsVar21.r0();
                }
                wls wlsVar5 = d.f;
                qje.W(btsVar21, wlsVar5, a6);
                wls wlsVar6 = d.e;
                qje.W(btsVar21, wlsVar6, o7);
                Integer valueOf2 = Integer.valueOf(hashCode6);
                wls wlsVar7 = d.g;
                qje.W(btsVar21, wlsVar7, valueOf2);
                tls tlsVar18 = d.h;
                qje.M(btsVar21, tlsVar18);
                wls wlsVar8 = d.d;
                qje.W(btsVar21, wlsVar8, d7);
                f530 n = an91.n(c530Var2, 10.0f, 10.0f, 10.0f, 8.0f);
                AppColor$Palette appColor$Palette = AppColor$Palette.Error;
                hdu hduVar = new hdu(appColor$Palette, new up2(zp2.a));
                IconSpotSize iconSpotSize = IconSpotSize.M;
                m6d.a.getClass();
                e5v.a(n, hduVar, appColor$Palette, iconSpotSize, m6d.b, btsVar21, 28038, 0);
                f530 o8 = an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 12.0f, 2);
                String str3 = urhVar.a;
                trh trhVar = urhVar.d;
                boolean z4 = trhVar.d;
                jeb1.f(str3, o8, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar21).e.d, btsVar21, 48, 0, 16380);
                String str4 = urhVar.b;
                if (str4 == null || evu0.J(str4)) {
                    btsVar21.e0(600718063);
                    btsVar21.t(false);
                } else {
                    btsVar21.e0(600537147);
                    jeb1.f(urhVar.b, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar21).g.a, btsVar21, 48, 0, 16380);
                    btsVar21.t(false);
                }
                f530 o9 = an91.o(ljs0.c(c530Var2, 1.0f), 8.0f, 4.0f, 8.0f, 0.0f, 8);
                boolean z5 = urhVar.c.c;
                ButtonStyle buttonStyle = ButtonStyle.Minor;
                boolean k10 = btsVar21.k(tlsVar17);
                Object Q12 = btsVar21.Q();
                if (k10 || Q12 == o430Var) {
                    f530Var = o9;
                    Q12 = new azd(5, tlsVar17);
                    btsVar21.o0(Q12);
                } else {
                    f530Var = o9;
                }
                sls slsVar7 = (sls) Q12;
                final int i5 = 0;
                d17.c(f530Var, z5, null, buttonStyle, null, slsVar7, wwg.S(-1096012361, true, new zls() { // from class: prh
                    @Override // defpackage.zls
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i6 = i5;
                        zy11 zy11Var2 = zy11.a;
                        urh urhVar2 = urhVar;
                        switch (i6) {
                            case 0:
                                fid fidVar21 = (fid) obj7;
                                int intValue22 = ((Integer) obj8).intValue();
                                bts btsVar22 = (bts) fidVar21;
                                if (!btsVar22.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                                    btsVar22.Y();
                                    break;
                                } else {
                                    jeb1.f(urhVar2.c.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar22).g.b, btsVar22, 0, 0, 16382);
                                    break;
                                }
                            default:
                                fid fidVar22 = (fid) obj7;
                                int intValue23 = ((Integer) obj8).intValue();
                                bts btsVar23 = (bts) fidVar22;
                                if (!btsVar23.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                                    btsVar23.Y();
                                    break;
                                } else {
                                    jeb1.f(urhVar2.d.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar23).g.b, btsVar23, 0, 0, 16382);
                                    break;
                                }
                        }
                        return zy11Var2;
                    }
                }, btsVar21), btsVar21, 1575936, 20);
                f530 b2 = pfb1.b(ljs0.c(c530Var2, 1.0f), z4, 30);
                z910 d8 = pi6.d(x4c.b, false);
                int hashCode7 = Long.hashCode(btsVar21.T);
                r1b0 o10 = btsVar21.o();
                f530 d9 = b.d(btsVar21, b2);
                btsVar21.i0();
                if (btsVar21.S) {
                    btsVar21.n(slsVar6);
                } else {
                    btsVar21.r0();
                }
                qje.W(btsVar21, wlsVar5, d8);
                qje.W(btsVar21, wlsVar6, o10);
                vfc.v(hashCode7, btsVar21, wlsVar7, btsVar21, tlsVar18);
                qje.W(btsVar21, wlsVar8, d9);
                f530 n2 = an91.n(ljs0.c(c530Var2, 1.0f), 8.0f, 4.0f, 8.0f, 8.0f);
                boolean z6 = trhVar.c;
                if (!z4) {
                    buttonStyle = ButtonStyle.Main;
                }
                boolean k11 = btsVar21.k(tlsVar17);
                Object Q13 = btsVar21.Q();
                if (k11 || Q13 == o430Var) {
                    Q13 = new azd(6, tlsVar17);
                    btsVar21.o0(Q13);
                }
                final int i6 = 1;
                d17.c(n2, z6, null, buttonStyle, null, (sls) Q13, wwg.S(-1580078991, true, new zls() { // from class: prh
                    @Override // defpackage.zls
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i62 = i6;
                        zy11 zy11Var2 = zy11.a;
                        urh urhVar2 = urhVar;
                        switch (i62) {
                            case 0:
                                fid fidVar21 = (fid) obj7;
                                int intValue22 = ((Integer) obj8).intValue();
                                bts btsVar22 = (bts) fidVar21;
                                if (!btsVar22.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                                    btsVar22.Y();
                                    break;
                                } else {
                                    jeb1.f(urhVar2.c.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar22).g.b, btsVar22, 0, 0, 16382);
                                    break;
                                }
                            default:
                                fid fidVar22 = (fid) obj7;
                                int intValue23 = ((Integer) obj8).intValue();
                                bts btsVar23 = (bts) fidVar22;
                                if (!btsVar23.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                                    btsVar23.Y();
                                    break;
                                } else {
                                    jeb1.f(urhVar2.d.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar23).g.b, btsVar23, 0, 0, 16382);
                                    break;
                                }
                        }
                        return zy11Var2;
                    }
                }, btsVar21), btsVar21, 1572864, 20);
                btsVar21.t(true);
                btsVar21.t(true);
                return zy11Var;
        }
    }

    public /* synthetic */ sp5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ sp5(t0f t0fVar, tls tlsVar) {
        this.a = 26;
        this.b = t0fVar;
        this.c = tlsVar;
    }

    public /* synthetic */ sp5(by41 by41Var, tls tlsVar) {
        this.a = 21;
        this.b = by41Var;
        this.c = tlsVar;
    }
}
