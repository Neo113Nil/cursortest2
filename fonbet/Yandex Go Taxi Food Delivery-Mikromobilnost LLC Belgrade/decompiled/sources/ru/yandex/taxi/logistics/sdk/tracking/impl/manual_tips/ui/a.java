package ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bns;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.df00;
import defpackage.did;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.gf00;
import defpackage.gi91;
import defpackage.gl51;
import defpackage.gxv;
import defpackage.i43;
import defpackage.i8d;
import defpackage.iez;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.kq5;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lkx;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.qm51;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.t0;
import defpackage.tfx;
import defpackage.tlb1;
import defpackage.tls;
import defpackage.uzh0;
import defpackage.vfc;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.yur;
import defpackage.zm1;
import defpackage.zpn;
import defpackage.zvr;
import defpackage.zx40;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(int i, fid fidVar, sls slsVar, sls slsVar2, f530 f530Var) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-301118298);
        int i2 = i | (btsVar2.e(slsVar) ? 32 : 16) | (btsVar2.e(slsVar2) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar2, 6);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            c530 c530Var = c530.a;
            f530 e = ljs0.e(c530Var, 48.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 k = e.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            long g = ((el51) btsVar2.m(gl51.a)).g();
            a7u0 a7u0Var = qm51.a;
            byk0 b = ((YandexShapes) btsVar2.m(a7u0Var)).b();
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new zvr(5, slsVar);
                btsVar2.o0(Q);
            }
            i8d.a.getClass();
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) Q, k, b, g, 0L, null, false, null, null, null, i8d.b, btsVar2, 0, 4080);
            boolean z2 = (i2 & 896) == 256;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new zvr(6, slsVar2);
                btsVar2.o0(Q2);
            }
            sls slsVar4 = (sls) Q2;
            f530 e2 = ljs0.e(c530Var, 48.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar4, e2.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), ((YandexShapes) btsVar2.m(a7u0Var)).b(), 0L, 0L, null, false, null, null, null, i8d.c, btsVar2, 0, 4088);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zm1(f530Var, slsVar, slsVar2, i, 2);
        }
    }

    public static final void b(b bVar, fid fidVar, int i) {
        int i2;
        o430 o430Var;
        int i3;
        boolean z;
        c530 c530Var;
        boolean z2;
        o430 o430Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(465874950);
        int i4 = (btsVar.e(bVar) ? 4 : 2) | i;
        if (btsVar.V(i4 & 1, (i4 & 3) != 2)) {
            oz40 b = f.b(bVar.D, btsVar);
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            String str = null;
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
            qje.W(btsVar, d.d, d);
            f530 k = an91.k(c530Var2, 16.0f);
            Object Q = btsVar.Q();
            o430 o430Var3 = did.a;
            if (Q == o430Var3) {
                Q = new iez(23);
                btsVar.o0(Q);
            }
            ymb1.c(ohb1.e(btsVar, ((gf00) b.getValue()).a), fnq0.b(k, false, (tls) Q), 0L, null, lzr.E, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65516);
            btsVar = btsVar;
            String str2 = ((gf00) b.getValue()).d;
            String str3 = ((gf00) b.getValue()).e;
            gf00 gf00Var = (gf00) b.getValue();
            ErrorType errorType = gf00Var.f;
            int i5 = errorType == null ? -1 : df00.a[errorType.ordinal()];
            if (i5 == 1) {
                btsVar.e0(1098534128);
                str = ohb1.e(btsVar, uzh0.delivery_manual_tip_validation_message);
                btsVar.t(false);
            } else if (i5 == 2) {
                btsVar.e0(1098667149);
                str = ohb1.d(uzh0.delivery_tips_error_another_amount_too_small, new Object[]{gf00Var.b}, btsVar);
                btsVar.t(false);
            } else if (i5 != 3) {
                btsVar.e0(1099033104);
                btsVar.t(false);
            } else {
                btsVar.e0(1098864495);
                str = ohb1.d(uzh0.delivery_tips_error_another_amount_too_big, new Object[]{gf00Var.c}, btsVar);
                btsVar.t(false);
            }
            String str4 = str;
            boolean e = btsVar.e(bVar);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var3) {
                o430Var = o430Var3;
                i3 = 23;
                z = true;
                c530Var = c530Var2;
                ManualTipScreenKt$ManualTipScreen$1$2$1 manualTipScreenKt$ManualTipScreen$1$2$1 = new ManualTipScreenKt$ManualTipScreen$1$2$1(1, bVar, b.class, "onTextChanged", "onTextChanged(Ljava/lang/String;)V", 0);
                btsVar.o0(manualTipScreenKt$ManualTipScreen$1$2$1);
                Q2 = manualTipScreenKt$ManualTipScreen$1$2$1;
            } else {
                c530Var = c530Var2;
                i3 = 23;
                z = true;
                o430Var = o430Var3;
            }
            tls tlsVar = (tls) ((tfx) Q2);
            boolean e2 = btsVar.e(bVar);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                ManualTipScreenKt$ManualTipScreen$1$3$1 manualTipScreenKt$ManualTipScreen$1$3$1 = new ManualTipScreenKt$ManualTipScreen$1$3$1(0, bVar, b.class, "onTextInputClicked", "onTextInputClicked()V", 0);
                btsVar.o0(manualTipScreenKt$ManualTipScreen$1$3$1);
                Q3 = manualTipScreenKt$ManualTipScreen$1$3$1;
            }
            sls slsVar2 = (sls) ((tfx) Q3);
            boolean e3 = btsVar.e(bVar);
            Object Q4 = btsVar.Q();
            if (e3 || Q4 == o430Var) {
                ManualTipScreenKt$ManualTipScreen$1$4$1 manualTipScreenKt$ManualTipScreen$1$4$1 = new ManualTipScreenKt$ManualTipScreen$1$4$1(1, bVar, b.class, "onErrorShown", "onErrorShown(Ljava/lang/String;)V", 0);
                btsVar.o0(manualTipScreenKt$ManualTipScreen$1$4$1);
                Q4 = manualTipScreenKt$ManualTipScreen$1$4$1;
            }
            tls tlsVar2 = (tls) ((tfx) Q4);
            o430 o430Var4 = o430Var;
            int i6 = i3;
            boolean z3 = z;
            c(str2, str3, str4, tlsVar, slsVar2, tlsVar2, btsVar, 0);
            f530 k2 = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
            boolean e4 = btsVar.e(bVar);
            Object Q5 = btsVar.Q();
            if (e4 || Q5 == o430Var4) {
                i2 = i6;
                z2 = z3;
                o430Var2 = o430Var4;
                ManualTipScreenKt$ManualTipScreen$1$5$1 manualTipScreenKt$ManualTipScreen$1$5$1 = new ManualTipScreenKt$ManualTipScreen$1$5$1(0, bVar, b.class, "onBackClicked", "onBackClicked()V", 0);
                btsVar.o0(manualTipScreenKt$ManualTipScreen$1$5$1);
                Q5 = manualTipScreenKt$ManualTipScreen$1$5$1;
            } else {
                i2 = i6;
                z2 = z3;
                o430Var2 = o430Var4;
            }
            sls slsVar3 = (sls) ((tfx) Q5);
            boolean e5 = btsVar.e(bVar);
            Object Q6 = btsVar.Q();
            if (e5 || Q6 == o430Var2) {
                ManualTipScreenKt$ManualTipScreen$1$6$1 manualTipScreenKt$ManualTipScreen$1$6$1 = new ManualTipScreenKt$ManualTipScreen$1$6$1(0, bVar, b.class, "onConfirmClicked", "onConfirmClicked()V", 0);
                btsVar.o0(manualTipScreenKt$ManualTipScreen$1$6$1);
                Q6 = manualTipScreenKt$ManualTipScreen$1$6$1;
            }
            a(6, btsVar, slsVar3, (sls) ((tfx) Q6), k2);
            btsVar.t(z2);
        } else {
            i2 = 23;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(bVar, i, i2);
        }
    }

    public static final void c(String str, String str2, String str3, tls tlsVar, sls slsVar, tls tlsVar2, fid fidVar, int i) {
        String str4;
        tls tlsVar3;
        long o;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1439756488);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.k(str3) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024) | (btsVar.e(slsVar) ? 16384 : 8192) | (btsVar.e(tlsVar2) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q;
            String str5 = str3 == null ? str : str3;
            if (str3 != null) {
                btsVar.e0(626526477);
                o = ((el51) btsVar.m(gl51.a)).h();
            } else {
                btsVar.e0(626527441);
                o = ((el51) btsVar.m(gl51.a)).o();
            }
            btsVar.t(false);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q2;
            long j = o;
            boolean z = false;
            String str6 = str5;
            tlb1.b(str2, tlsVar, ljs0.c(an91.o(gi91.b(c530.a, yurVar), 16.0f, 0.0f, 16.0f, 0.0f, 10), 1.0f), false, false, null, wwg.S(-624769124, true, new kq5(str2, str6, 4), btsVar), wwg.S(1847010909, true, new kq5(str2, str6, 5), btsVar), str3 != null, null, new lkx(0, 3, 0, HProv.PP_PASSWD_TERM), null, true, 0, zx40Var, null, tlb1.d(0L, 0L, 0L, 0L, j, j, btsVar, 6, 1540095), null, btsVar, ((i2 >> 3) & 14) | 14155776 | ((i2 >> 6) & 112), 1597824, 699192);
            btsVar = btsVar;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new ManualTipScreenKt$TipInput$3$1(yurVar, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, zy11.a);
            boolean z2 = (i2 & 896) == 256;
            if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object Q4 = btsVar.Q();
            if (z3 || Q4 == o430Var) {
                str4 = str3;
                tlsVar3 = tlsVar2;
                Q4 = new ManualTipScreenKt$TipInput$4$1(tlsVar3, str4, null);
                btsVar.o0(Q4);
            } else {
                str4 = str3;
                tlsVar3 = tlsVar2;
            }
            zpn.e(btsVar, (wls) Q4, str4);
            if (((Boolean) androidx.compose.foundation.interaction.a.c(zx40Var, btsVar).getValue()).booleanValue()) {
                slsVar.invoke();
            }
        } else {
            str4 = str3;
            tlsVar3 = tlsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(str, str2, str4, tlsVar, slsVar, tlsVar3, i);
        }
    }
}
