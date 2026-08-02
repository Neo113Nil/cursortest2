package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.text_input_screen.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.an51;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.d0;
import defpackage.did;
import defpackage.dl51;
import defpackage.eja1;
import defpackage.el51;
import defpackage.ety0;
import defpackage.ew0;
import defpackage.f360;
import defpackage.f530;
import defpackage.fid;
import defpackage.gi0;
import defpackage.gi91;
import defpackage.gl51;
import defpackage.hoy0;
import defpackage.i43;
import defpackage.jl40;
import defpackage.l71;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.mfa;
import defpackage.mpy0;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.qm51;
import defpackage.qpm0;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.tlb1;
import defpackage.tls;
import defpackage.tpy0;
import defpackage.un1;
import defpackage.vfc;
import defpackage.vqr;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.yur;
import defpackage.zgb1;
import defpackage.zhb0;
import defpackage.zm51;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(CharSequence charSequence, CharSequence charSequence2, boolean z, sls slsVar, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1948168604);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(charSequence2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar2.e(slsVar2) ? 2048 : 1024;
        } else {
            slsVar2 = slsVar;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar2, ljs0.e(an91.o(ljs0.c(c530.a, 1.0f), 8.0f, 0.0f, 8.0f, 16.0f, 2), 56.0f), ((YandexShapes) btsVar2.m(qm51.a)).b(), 0L, 0L, null, z, null, null, null, wwg.S(-3674541, true, new mfa(charSequence, charSequence2, 3), btsVar2), btsVar, ((i2 >> 9) & 14) | ((i2 << 18) & 234881024), 3832);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(charSequence, charSequence2, z, slsVar, i, 27);
        }
    }

    public static final void b(hoy0 hoy0Var, String str, CharSequence charSequence, String str2, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        tls tlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1005989140);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(hoy0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(charSequence) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(str2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            tlsVar3 = tlsVar2;
            i2 |= btsVar.e(tlsVar3) ? 131072 : 65536;
        } else {
            tlsVar3 = tlsVar2;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new TextInputScreenKt$NeuroTextInput$1$1(yurVar, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
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
            qje.W(btsVar, d.d, d);
            f530 b = gi91.b(an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8), yurVar);
            ety0 ety0Var = ((zm51) btsVar.m(an51.a)).f;
            a7u0 a7u0Var = gl51.a;
            tlb1.a(0, (i2 & 14) | 817889280 | ((i2 >> 12) & 112), HProv.ALG_CLASS_DATA_ENCRYPT, 244056, btsVar, tlsVar3, null, wwg.S(1629642349, true, new qpm0(str, 6), btsVar), wwg.S(1146247723, true, new un1(23, charSequence), btsVar), null, null, b, null, null, tlb1.d(0L, dl51.I, ((el51) btsVar.m(a7u0Var)).n(), ((el51) btsVar.m(a7u0Var)).n(), 0L, 0L, btsVar, 6, 2097047), hoy0Var, ety0Var, null, false, charSequence != null, true);
            if (charSequence == null) {
                btsVar.e0(-777753315);
                btsVar.t(false);
            } else {
                btsVar.e0(-777753314);
                boolean z = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
                Object Q3 = btsVar.Q();
                if (z || Q3 == o430Var) {
                    Q3 = new TextInputScreenKt$NeuroTextInput$2$3$1$1(tlsVar, str2, null);
                    btsVar.o0(Q3);
                }
                zpn.e(btsVar, (wls) Q3, charSequence);
                zgb1.a(charSequence, an91.o(c530Var, 16.0f, 8.0f, 16.0f, 0.0f, 8), 8388611, false, null, null, false, null, btsVar, 384, 248);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(hoy0Var, str, charSequence, str2, tlsVar, tlsVar2, i);
        }
    }

    public static final void c(List list, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1383259211);
        int i2 = (btsVar.e(list) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (list == null) {
            btsVar.e0(-1535910315);
            btsVar.t(false);
        } else {
            btsVar.e0(-1535910314);
            if (list.isEmpty()) {
                btsVar.e0(-245176058);
                btsVar.t(false);
            } else {
                btsVar.e0(-245864134);
                c530 c530Var = c530.a;
                oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                vqr.c(an91.m(c530Var, 16.0f, 0.0f, 2), new i43(8.0f, true, new quz(11)), new i43(8.0f, true, new quz(11)), null, 0, 0, wwg.S(724954396, true, new mpy0(list, tlsVar, 0), btsVar), btsVar, 1573302, 56);
                btsVar.t(false);
            }
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new l71(list, tlsVar, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b4, code lost:
    
        if (r10 == r9) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(tpy0 tpy0Var, tls tlsVar, sls slsVar, tls tlsVar2, fid fidVar, int i) {
        o430 o430Var;
        bts btsVar;
        boolean z;
        c530 c530Var;
        o430 o430Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-979144986);
        int i2 = i | (btsVar2.k(tpy0Var) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128) | (btsVar2.e(tlsVar2) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean k = btsVar2.k(tpy0Var.a);
            Object Q = btsVar2.Q();
            o430 o430Var3 = did.a;
            if (k || Q == o430Var3) {
                String str = tpy0Var.b;
                int length = str.length();
                Q = f.j(new hoy0(str, eja1.c(length, length), 4));
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            so5 so5Var = x4c.G;
            sic a = qic.a(lr20.c, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            c530 c530Var2 = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar2, c530Var2);
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
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            f360 f360Var = tpy0Var.c;
            if (f360Var == null) {
                btsVar2.e0(1946873801);
                btsVar2.t(false);
                o430Var = o430Var3;
                btsVar = btsVar2;
                z = false;
            } else {
                btsVar2.e0(1946873802);
                o430Var = o430Var3;
                btsVar = btsVar2;
                z = false;
                s3b1.f(f360Var.a, vfc.j(so5Var, an91.o(c530Var2, 10.0f, 10.0f, 10.0f, 0.0f, 8)), null, btsVar, 0, 4);
                btsVar.t(false);
            }
            boolean z2 = z;
            o430 o430Var4 = o430Var;
            bts btsVar3 = btsVar;
            zgb1.a(tpy0Var.d, an91.o(ljs0.c(c530Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), 8388611, false, null, null, false, null, btsVar3, 384, 248);
            CharSequence charSequence = tpy0Var.e;
            if (charSequence == null) {
                btsVar3.e0(1947380713);
                btsVar3.t(z2);
                c530Var = c530Var2;
            } else {
                btsVar3.e0(1947380714);
                c530Var = c530Var2;
                zgb1.a(charSequence, an91.o(ljs0.c(c530Var2, 1.0f), 16.0f, 12.0f, 16.0f, 0.0f, 8), 8388611, false, null, null, false, null, btsVar3, 384, 248);
                btsVar3.t(z2);
            }
            hoy0 hoy0Var = (hoy0) oz40Var.getValue();
            String str2 = tpy0Var.g;
            CharSequence charSequence2 = tpy0Var.f;
            String str3 = tpy0Var.l;
            int i3 = i2 & 7168;
            boolean k2 = btsVar3.k(oz40Var) | (i3 == 2048 ? true : z2 ? 1 : 0);
            Object Q2 = btsVar3.Q();
            if (k2) {
                o430Var2 = o430Var4;
            } else {
                o430Var2 = o430Var4;
            }
            Q2 = new d0(tlsVar2, oz40Var, 15);
            btsVar3.o0(Q2);
            o430 o430Var5 = o430Var2;
            b(hoy0Var, str2, charSequence2, str3, tlsVar, (tls) Q2, btsVar3, 57344 & (i2 << 9));
            List list = tpy0Var.h;
            boolean k3 = btsVar3.k(oz40Var) | (i3 == 2048 ? true : z2 ? 1 : 0);
            Object Q3 = btsVar3.Q();
            if (k3 || Q3 == o430Var5) {
                Q3 = new d0(tlsVar2, oz40Var, 16);
                btsVar3.o0(Q3);
            }
            c(list, (tls) Q3, btsVar3, z2 ? 1 : 0);
            oeb1.c(btsVar3, ljs0.e(c530Var, 20.0f));
            a(tpy0Var.i, tpy0Var.j, tpy0Var.f == null ? true : z2 ? 1 : 0, slsVar, btsVar3, (i2 << 3) & 7168);
            btsVar2 = btsVar3;
            btsVar2.t(true);
        } else {
            btsVar2.Y();
        }
        aii0 v = btsVar2.v();
        if (v != null) {
            v.d = new zhb0(tpy0Var, tlsVar, slsVar, tlsVar2, i, 20);
        }
    }
}
