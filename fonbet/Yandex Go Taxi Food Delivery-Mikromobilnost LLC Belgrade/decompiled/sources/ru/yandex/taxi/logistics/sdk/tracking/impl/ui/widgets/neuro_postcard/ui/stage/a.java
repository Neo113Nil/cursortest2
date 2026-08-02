package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.ui.stage;

import androidx.compose.animation.core.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d360;
import defpackage.did;
import defpackage.el51;
import defpackage.f360;
import defpackage.f530;
import defpackage.fid;
import defpackage.g360;
import defpackage.gl51;
import defpackage.i360;
import defpackage.j460;
import defpackage.jl40;
import defpackage.l700;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.psb1;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.sic;
import defpackage.sls;
import defpackage.squ;
import defpackage.tls;
import defpackage.tse0;
import defpackage.ttm;
import defpackage.wh91;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xab1;
import defpackage.ymb1;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.ui.stage.a;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(final f360 f360Var, final i360 i360Var, final CharSequence charSequence, final CharSequence charSequence2, final float f, final float f2, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(260705326);
        int i2 = i | (btsVar.k(f360Var) ? 4 : 2) | (btsVar.k(i360Var) ? 32 : 16) | (btsVar.e(charSequence) ? 256 : 128) | (btsVar.e(charSequence2) ? 2048 : 1024) | (btsVar.b(f) ? 16384 : 8192) | (btsVar.b(f2) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            xab1.a(m4m0.b(ymb1.l(ljs0.c(c530.a, 1.0f), cyk0.c(16.0f)), ((el51) btsVar.m(gl51.a)).g(), qke.q), x4c.x, wwg.S(-333966844, true, new l700(f, f2, charSequence, charSequence2, f360Var, i360Var), btsVar), btsVar, 3120, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(i360Var, charSequence, charSequence2, f, f2, i) { // from class: x360
                public final /* synthetic */ i360 b;
                public final /* synthetic */ CharSequence c;
                public final /* synthetic */ CharSequence w;
                public final /* synthetic */ float x;
                public final /* synthetic */ float y;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    a.a(f360.this, this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(j460 j460Var, d360 d360Var, wls wlsVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        int i3;
        float f;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-269087470);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(j460Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(d360Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new NeuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1(j460Var, tlsVar, oz40Var, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, zy11.a);
            if (((Boolean) oz40Var.getValue()).booleanValue() || j460Var.b) {
                i3 = i2;
                f = 1.0f;
            } else {
                i3 = i2;
                f = 0.0f;
            }
            ck11 K = sb2.K(MSException.ERROR_NOT_ALL_ASSIGNED, 0, wh91.a, 2);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new ttm(7, oz40Var2);
                btsVar.o0(Q4);
            }
            int i4 = i3;
            m3u0 b = b.b(f, K, "sending_stage_shrink_animation", (tls) Q4, btsVar, 27648, 4);
            m3u0 b2 = b.b(((Boolean) oz40Var2.getValue()).booleanValue() ? 1.0f : 0.0f, sb2.G(0.5f, 1500.0f, 4, null), "sending_stage_stable_animation", null, btsVar, 3120, 20);
            c530 c530Var = c530.a;
            f530 k = an91.k(c530Var, 16.0f);
            boolean z3 = d360Var.e != null;
            boolean z4 = ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object Q5 = btsVar.Q();
            if (z4 || Q5 == o430Var) {
                Q5 = new g360(d360Var, wlsVar, 2);
                btsVar.o0(Q5);
            }
            f530 d = q791.d(k, z3, null, null, (sls) Q5, 14);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d2);
            a(d360Var.a, j460Var.a, d360Var.b, d360Var.c, ((Number) b.getValue()).floatValue(), ((Number) b2.getValue()).floatValue(), btsVar, 0);
            if (d360Var.d.isEmpty()) {
                z = true;
                btsVar.e0(698697638);
                btsVar.t(false);
            } else {
                tse0.s(btsVar, 698430480, c530Var, 16.0f, btsVar);
                z = true;
                psb1.b(ljs0.c(c530Var, 1.0f), 8.0f, d360Var.d, false, wlsVar, btsVar, (57344 & (i4 << 6)) | 54, 8);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(j460Var, d360Var, wlsVar, tlsVar, i, 25);
        }
    }
}
