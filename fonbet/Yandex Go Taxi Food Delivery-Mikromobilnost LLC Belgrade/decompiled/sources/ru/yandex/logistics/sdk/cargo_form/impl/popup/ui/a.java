package ru.yandex.logistics.sdk.cargo_form.impl.popup.ui;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.cma1;
import defpackage.did;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ivy;
import defpackage.jl40;
import defpackage.kae0;
import defpackage.l3t0;
import defpackage.l9e0;
import defpackage.ljs0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.r8e0;
import defpackage.rb0;
import defpackage.rbn;
import defpackage.rmb1;
import defpackage.sb2;
import defpackage.sls;
import defpackage.sz40;
import defpackage.tls;
import defpackage.ttm;
import defpackage.w2o;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.z5w;
import defpackage.z910;
import defpackage.zii0;
import defpackage.zls;
import defpackage.zmo;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupModel$TextHintPopup$ArrowDirection;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.a;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(l9e0 l9e0Var, zii0 zii0Var, zii0 zii0Var2, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-679645519);
        int i2 = (btsVar.k(l9e0Var) ? 4 : 2) | i | (btsVar.k(zii0Var) ? 32 : 16) | (btsVar.k(zii0Var2) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new CargoFormPopupKt$CargoFormPopup$1$1(slsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            btsVar.e0(-304307118);
            rmb1.e(l9e0Var, zii0Var, zii0Var2, btsVar, i2 & 1022);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0(l9e0Var, zii0Var, zii0Var2, slsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v3, types: [l9e0] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupModel$TextHintPopup$ArrowDirection] */
    public static final void b(List list, int i, f530 f530Var, wls wlsVar, fid fidVar, int i2) {
        final oz40 oz40Var;
        o430 o430Var;
        l3t0 l3t0Var;
        r8e0 r8e0Var;
        boolean z;
        Iterator it;
        sz40 sz40Var;
        String str;
        ?? r11;
        bts btsVar = (bts) fidVar;
        btsVar.g0(708050228);
        final int i3 = i;
        wls wlsVar2 = wlsVar;
        int i4 = i2 | (btsVar.e(list) ? 4 : 2) | (btsVar.c(i3) ? 32 : 16) | (btsVar.e(wlsVar2) ? 2048 : 1024);
        boolean z2 = false;
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = f.j(new z5w(0L));
                btsVar.o0(Q);
            }
            oz40 oz40Var2 = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var2) {
                Q2 = new l3t0();
                btsVar.o0(Q2);
            }
            l3t0 l3t0Var2 = (l3t0) Q2;
            boolean e = btsVar.e(list);
            Object Q3 = btsVar.Q();
            rbn rbnVar = null;
            if (e || Q3 == o430Var2) {
                Q3 = new PopupsScreenOverlayKt$PopupsScreenOverlay$1$1(list, l3t0Var2, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, list);
            f530 k = f530Var.k(ljs0.c);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var2) {
                Q4 = new ttm(11, oz40Var2);
                btsVar.o0(Q4);
            }
            f530 y = eja1.y(k, (tls) Q4);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, y);
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
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            qje.W(btsVar, d.d, d2);
            final fwi fwiVar = (fwi) btsVar.m(j.h);
            btsVar.e0(785482381);
            Iterator it2 = l3t0Var2.b.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                final String str2 = (String) entry.getKey();
                final r8e0 r8e0Var2 = (r8e0) entry.getValue();
                btsVar.c0(1205165529, str2);
                final kae0 kae0Var = r8e0Var2.a;
                sz40 sz40Var2 = r8e0Var2.b;
                l9e0 l9e0Var = kae0Var.b;
                ?? r15 = l9e0Var;
                if (l9e0Var == null) {
                    r15 = rbnVar;
                }
                final ?? r152 = r15 != 0 ? r15.c : rbnVar;
                if (r152 != 0) {
                    btsVar.e0(-1294399144);
                    o430 o430Var3 = o430Var2;
                    sz40 sz40Var3 = r8e0Var2.b;
                    oz40Var = oz40Var2;
                    l3t0 l3t0Var3 = l3t0Var2;
                    w2o e2 = k.e(sb2.K(200, 0, rbnVar, 6), 2);
                    zmo f = k.f(sb2.K(200, 0, rbnVar, 6), 2);
                    sz40Var = sz40Var2;
                    final wls wlsVar4 = wlsVar2;
                    zls zlsVar = new zls() { // from class: qae0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            int i5 = i3;
                            boolean c = fidVar2.c(i5);
                            kae0 kae0Var2 = kae0Var;
                            boolean e3 = c | fidVar2.e(kae0Var2);
                            PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection = r152;
                            boolean c2 = e3 | fidVar2.c(popupModel$TextHintPopup$ArrowDirection.ordinal());
                            bts btsVar2 = (bts) fidVar2;
                            fwi fwiVar2 = fwiVar;
                            boolean k2 = c2 | btsVar2.k(fwiVar2);
                            Object Q5 = btsVar2.Q();
                            o430 o430Var4 = did.a;
                            if (k2 || Q5 == o430Var4) {
                                rae0 rae0Var = new rae0(i5, kae0Var2, popupModel$TextHintPopup$ArrowDirection, fwiVar2, oz40Var);
                                btsVar2.o0(rae0Var);
                                Q5 = rae0Var;
                            }
                            z910 z910Var = (z910) Q5;
                            int hashCode2 = Long.hashCode(btsVar2.T);
                            r1b0 o2 = btsVar2.o();
                            f530 d3 = b.d(fidVar2, c530.a);
                            ohd.G1.getClass();
                            sls slsVar2 = d.b;
                            if (btsVar2.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar2.i0();
                            if (btsVar2.S) {
                                btsVar2.n(slsVar2);
                            } else {
                                btsVar2.r0();
                            }
                            qje.W(fidVar2, d.f, z910Var);
                            qje.W(fidVar2, d.e, o2);
                            wls wlsVar5 = d.g;
                            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                                b64.z(hashCode2, btsVar2, hashCode2, wlsVar5);
                            }
                            qje.W(fidVar2, d.d, d3);
                            l9e0 l9e0Var2 = kae0Var2.b;
                            zii0 zii0Var = kae0Var2.c;
                            zii0 zii0Var2 = kae0Var2.d;
                            wls wlsVar6 = wlsVar4;
                            boolean k3 = btsVar2.k(wlsVar6);
                            String str3 = str2;
                            boolean k4 = k3 | btsVar2.k(str3);
                            r8e0 r8e0Var3 = r8e0Var2;
                            boolean e4 = k4 | fidVar2.e(r8e0Var3);
                            Object Q6 = btsVar2.Q();
                            if (e4 || Q6 == o430Var4) {
                                Q6 = new b700(29, wlsVar6, str3, r8e0Var3);
                                btsVar2.o0(Q6);
                            }
                            a.a(l9e0Var2, zii0Var, zii0Var2, (sls) Q6, fidVar2, 0);
                            btsVar2.t(true);
                            return zy11.a;
                        }
                    };
                    str = str2;
                    r8e0Var = r8e0Var2;
                    z = false;
                    it = it2;
                    o430Var = o430Var3;
                    r11 = rbnVar;
                    l3t0Var = l3t0Var3;
                    g.c(sz40Var3, null, e2, f, null, wwg.S(-621707, true, zlsVar, btsVar), btsVar, 200064, 18);
                    btsVar.t(false);
                } else {
                    oz40Var = oz40Var2;
                    o430Var = o430Var2;
                    l3t0Var = l3t0Var2;
                    r8e0Var = r8e0Var2;
                    z = z2;
                    it = it2;
                    sz40Var = sz40Var2;
                    str = str2;
                    r11 = rbnVar;
                    btsVar.e0(-1292164819);
                    btsVar.t(z);
                }
                Boolean valueOf = Boolean.valueOf(sz40Var.a());
                Object value = sz40Var.b.getValue();
                boolean e3 = btsVar.e(r8e0Var) | btsVar.k(str);
                Object Q5 = btsVar.Q();
                if (e3 || Q5 == o430Var) {
                    Q5 = new PopupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1(r8e0Var, l3t0Var, str, r11);
                    btsVar.o0(Q5);
                }
                zpn.f(valueOf, value, (wls) Q5, btsVar);
                btsVar.t(z);
                i3 = i;
                wlsVar2 = wlsVar;
                l3t0Var2 = l3t0Var;
                rbnVar = r11;
                o430Var2 = o430Var;
                z2 = z;
                it2 = it;
                oz40Var2 = oz40Var;
            }
            btsVar.t(z2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(list, i, f530Var, wlsVar, i2);
        }
    }
}
