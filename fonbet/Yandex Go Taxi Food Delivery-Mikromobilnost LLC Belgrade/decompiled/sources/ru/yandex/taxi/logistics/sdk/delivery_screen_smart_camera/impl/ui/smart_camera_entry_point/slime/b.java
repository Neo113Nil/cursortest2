package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime;

import android.content.res.Configuration;
import androidx.compose.runtime.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import defpackage.aii0;
import defpackage.apn0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.did;
import defpackage.dmw0;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.gji0;
import defpackage.hzt;
import defpackage.j0v;
import defpackage.jl40;
import defpackage.jzt;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lvi0;
import defpackage.lxy0;
import defpackage.m4m0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ohd;
import defpackage.om9;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qjf0;
import defpackage.qke;
import defpackage.qti;
import defpackage.quq0;
import defpackage.qwd;
import defpackage.r1b0;
import defpackage.rx21;
import defpackage.s2a1;
import defpackage.s3b1;
import defpackage.sh4;
import defpackage.sic;
import defpackage.sls;
import defpackage.sm91;
import defpackage.tcc;
import defpackage.tig0;
import defpackage.tls;
import defpackage.tse;
import defpackage.uo5;
import defpackage.wls;
import defpackage.wu60;
import defpackage.x4c;
import defpackage.xps0;
import defpackage.y6i0;
import defpackage.yps0;
import defpackage.z5w;
import defpackage.z910;
import defpackage.zoy0;
import defpackage.zpn;
import defpackage.zps0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.c;

/* loaded from: classes5.dex */
public abstract class b {
    /* JADX WARN: Code restructure failed: missing block: B:74:0x035d, code lost:
    
        if (r11 == r7) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03d4, code lost:
    
        if (defpackage.jl40.l(r5.Q(), java.lang.Integer.valueOf(r13)) == false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, lvi0 lvi0Var, long j, sls slsVar, Long l, lxy0 lxy0Var, fid fidVar, int i) {
        int i2;
        fwi fwiVar;
        tse tseVar;
        hzt hztVar;
        float f;
        float f2;
        o430 o430Var;
        c cVar;
        boolean z;
        boolean z2;
        f530 b;
        boolean a;
        o430 o430Var2;
        wls wlsVar;
        sls slsVar2;
        lvi0 lvi0Var2 = lvi0Var;
        gji0 gji0Var = qke.q;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1253521192);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(lvi0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.d(j) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(lxy0Var) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            fwi fwiVar2 = (fwi) btsVar.m(j.h);
            btsVar.e0(2043031692);
            qwd qwdVar = AndroidCompositionLocals_androidKt.a;
            float w0 = fwiVar2.w0(((Configuration) btsVar.m(qwdVar)).screenWidthDp);
            btsVar.t(false);
            btsVar.e0(2043034701);
            float w02 = fwiVar2.w0(((Configuration) btsVar.m(qwdVar)).screenHeightDp);
            btsVar.t(false);
            xps0 xps0Var = new xps0(fwiVar2.w0(14.0f), fwiVar2.w0(20.0f));
            float w03 = fwiVar2.w0(32.0f);
            float w04 = fwiVar2.w0(120.0f);
            yps0 yps0Var = new yps0(xps0Var, w0, w02, w03, w04);
            final float e = rx21.e(((Configuration) btsVar.m(qwdVar)).screenHeightDp, btsVar) * 0.5f;
            Object[] objArr = new Object[0];
            tig0 tig0Var = c.i;
            boolean b2 = btsVar.b(e);
            Object Q = btsVar.Q();
            o430 o430Var3 = did.a;
            if (b2 || Q == o430Var3) {
                Q = new sls() { // from class: bqs0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        return new c(e);
                    }
                };
                btsVar.o0(Q);
            }
            c cVar2 = (c) cvw.W(objArr, tig0Var, (sls) Q, btsVar, 0);
            cVar2.a = yps0Var;
            float c = (cVar2.c() * (w0 - w03)) + w03;
            float c2 = (cVar2.c() * (w02 - w04)) + w04;
            float I = fwiVar2.I(c);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var3) {
                Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q2);
            }
            tse tseVar2 = (tse) Q2;
            int i3 = i2;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var3) {
                fwiVar = fwiVar2;
                tseVar = tseVar2;
                Q3 = f.j(new wu60(0L));
                btsVar.o0(Q3);
            } else {
                fwiVar = fwiVar2;
                tseVar = tseVar2;
            }
            oz40 oz40Var = (oz40) Q3;
            boolean z3 = cVar2.c() >= 0.99f;
            if (((Boolean) btsVar.m(qti.e)).booleanValue()) {
                if (lxy0Var == null || (hztVar = lxy0Var.b) == null) {
                    if (lxy0Var != null) {
                        hztVar = lxy0Var.a;
                    }
                    hztVar = null;
                }
                c530 c530Var = c530.a;
                if (hztVar == null) {
                    btsVar.e0(1460698097);
                    btsVar.t(false);
                    o430Var = o430Var3;
                    f = w0;
                    cVar = cVar2;
                    f2 = I;
                    z = z3;
                    b = null;
                } else {
                    btsVar.e0(1460698098);
                    f = w0;
                    f2 = I;
                    float c3 = (1.0f - y6i0.c(cVar2.c() * 2.0f, 0.0f, 1.0f)) * ((Number) cVar2.h.getValue()).floatValue();
                    float floatValue = cVar2.f.getFloatValue() - (c2 / 2.0f);
                    ArrayList arrayList = hztVar.a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jzt jztVar = (jzt) it.next();
                        Iterator it2 = it;
                        ldc ldcVar = jztVar.a;
                        o430 o430Var4 = o430Var3;
                        long j2 = ldcVar != null ? ldcVar.a : j;
                        arrayList2.add(new Pair(Float.valueOf((float) jztVar.b), new ldc(ldc.b(j2, ldc.d(j2) * c3, 0.0f, 0.0f, 0.0f, 14))));
                        cVar2 = cVar2;
                        it = it2;
                        o430Var3 = o430Var4;
                    }
                    o430Var = o430Var3;
                    c cVar3 = cVar2;
                    List x0 = kotlin.collections.a.x0(arrayList2, new sh4());
                    if (x0.size() >= 2) {
                        List list = x0;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                List list2 = x0;
                                cVar = cVar3;
                                if (!ldc.c(((ldc) ((Pair) it3.next()).f()).a, ((ldc) ((Pair) kotlin.collections.a.P(x0)).f()).a)) {
                                    btsVar.e0(-1700579186);
                                    Pair[] pairArr = (Pair[]) list2.toArray(new Pair[0]);
                                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
                                    double d = hztVar.b;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(floatValue) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                    Pair d2 = ru.yandex.taxi.logistics.sdk.ui.component.misc.b.d((int) c, (int) c2, d);
                                    z = z3;
                                    b = m4m0.a(c530Var, zoy0.E((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length), wu60.f(((wu60) d2.getSecond()).a, floatToRawIntBits), wu60.f(((wu60) d2.getFirst()).a, floatToRawIntBits), 8), null, 6);
                                    z2 = false;
                                    btsVar.t(false);
                                    break;
                                }
                                cVar3 = cVar;
                                x0 = list2;
                            }
                        }
                    }
                    cVar = cVar3;
                    z = z3;
                    z2 = false;
                    btsVar.e0(-1700107211);
                    btsVar.t(false);
                    b = m4m0.b(c530Var, j, gji0Var);
                    btsVar.t(z2);
                }
                if (b == null) {
                    b = m4m0.b(c530Var, j, gji0Var);
                }
                Boolean valueOf = Boolean.valueOf(z);
                c cVar4 = cVar;
                a = btsVar.a(z) | ((i3 & HProv.ALG_CLASS_ALL) == 16384) | btsVar.k(cVar4);
                Object Q4 = btsVar.Q();
                if (a) {
                    o430Var2 = o430Var;
                } else {
                    o430Var2 = o430Var;
                }
                Q4 = new SlimeKt$Slime$1$1(z, l, cVar4, null);
                btsVar.o0(Q4);
                zpn.f(valueOf, l, (wls) Q4, btsVar);
                float e2 = rx21.e(84.0f, btsVar);
                float e3 = rx21.e(150.0f, btsVar);
                f530 k = f530Var.k(ljs0.c);
                uo5 uo5Var = x4c.b;
                z910 d3 = pi6.d(uo5Var, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d4 = androidx.compose.ui.b.d(btsVar, k);
                ohd.G1.getClass();
                sls slsVar3 = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                boolean z4 = z;
                if (btsVar.S) {
                    btsVar.n(slsVar3);
                } else {
                    btsVar.r0();
                }
                wls wlsVar2 = d.f;
                qje.W(btsVar, wlsVar2, d3);
                wls wlsVar3 = d.e;
                qje.W(btsVar, wlsVar3, o);
                wls wlsVar4 = d.g;
                if (btsVar.S) {
                    wlsVar = wlsVar3;
                } else {
                    wlsVar = wlsVar3;
                }
                b64.z(hashCode, btsVar, hashCode, wlsVar4);
                wls wlsVar5 = d.d;
                qje.W(btsVar, wlsVar5, d4);
                f530 k2 = cj6.a.a(c530Var, x4c.z).k(ljs0.b).k(z4 ? ljs0.c(c530Var, 1.0f) : ljs0.q(c530Var, f2));
                float f3 = f;
                boolean k3 = btsVar.k(cVar4) | btsVar.b(f3);
                Object Q5 = btsVar.Q();
                if (k3 || Q5 == o430Var2) {
                    Q5 = new qjf0(cVar4, f3, 3);
                    btsVar.o0(Q5);
                }
                f530 k4 = m4m0.b(androidx.compose.ui.graphics.d.a(k2, (tls) Q5), j, gji0Var).k(b);
                boolean k5 = btsVar.k(cVar4) | btsVar.b(e3) | btsVar.b(e2);
                Object Q6 = btsVar.Q();
                if (k5 || Q6 == o430Var2) {
                    Q6 = new zps0(e3, e2, 0, cVar4);
                    btsVar.o0(Q6);
                }
                f530 d5 = s2a1.d(k4, (tls) Q6);
                fwi fwiVar3 = fwiVar;
                tse tseVar3 = tseVar;
                boolean k6 = btsVar.k(cVar4) | btsVar.b(f3) | btsVar.k(fwiVar3) | btsVar.e(tseVar3) | ((i3 & 7168) == 2048);
                Object Q7 = btsVar.Q();
                if (k6 || Q7 == o430Var2) {
                    slsVar2 = slsVar3;
                    a aVar = new a(cVar4, f3, fwiVar3, oz40Var, tseVar3, slsVar);
                    btsVar.o0(aVar);
                    Q7 = aVar;
                } else {
                    slsVar2 = slsVar3;
                }
                f530 a2 = exw0.a(d5, zy11.a, (PointerInputEventHandler) Q7);
                z910 d6 = pi6.d(uo5Var, false);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d7 = androidx.compose.ui.b.d(btsVar, a2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar2, d6);
                qje.W(btsVar, wlsVar, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
                }
                qje.W(btsVar, wlsVar5, d7);
                lvi0Var2 = lvi0Var;
                b(lvi0Var2, cVar4, btsVar, (i3 >> 3) & 14);
                btsVar.t(true);
                btsVar.t(true);
            } else {
                if (lxy0Var != null) {
                    hztVar = lxy0Var.a;
                    c530 c530Var2 = c530.a;
                    if (hztVar == null) {
                    }
                    if (b == null) {
                    }
                    Boolean valueOf2 = Boolean.valueOf(z);
                    c cVar42 = cVar;
                    a = btsVar.a(z) | ((i3 & HProv.ALG_CLASS_ALL) == 16384) | btsVar.k(cVar42);
                    Object Q42 = btsVar.Q();
                    if (a) {
                    }
                    Q42 = new SlimeKt$Slime$1$1(z, l, cVar42, null);
                    btsVar.o0(Q42);
                    zpn.f(valueOf2, l, (wls) Q42, btsVar);
                    float e22 = rx21.e(84.0f, btsVar);
                    float e32 = rx21.e(150.0f, btsVar);
                    f530 k7 = f530Var.k(ljs0.c);
                    uo5 uo5Var2 = x4c.b;
                    z910 d32 = pi6.d(uo5Var2, false);
                    int hashCode3 = Long.hashCode(btsVar.T);
                    r1b0 o3 = btsVar.o();
                    f530 d42 = androidx.compose.ui.b.d(btsVar, k7);
                    ohd.G1.getClass();
                    sls slsVar32 = d.b;
                    if (dmw0Var == null) {
                    }
                }
                hztVar = null;
                c530 c530Var22 = c530.a;
                if (hztVar == null) {
                }
                if (b == null) {
                }
                Boolean valueOf22 = Boolean.valueOf(z);
                c cVar422 = cVar;
                a = btsVar.a(z) | ((i3 & HProv.ALG_CLASS_ALL) == 16384) | btsVar.k(cVar422);
                Object Q422 = btsVar.Q();
                if (a) {
                }
                Q422 = new SlimeKt$Slime$1$1(z, l, cVar422, null);
                btsVar.o0(Q422);
                zpn.f(valueOf22, l, (wls) Q422, btsVar);
                float e222 = rx21.e(84.0f, btsVar);
                float e322 = rx21.e(150.0f, btsVar);
                f530 k72 = f530Var.k(ljs0.c);
                uo5 uo5Var22 = x4c.b;
                z910 d322 = pi6.d(uo5Var22, false);
                int hashCode32 = Long.hashCode(btsVar.T);
                r1b0 o32 = btsVar.o();
                f530 d422 = androidx.compose.ui.b.d(btsVar, k72);
                ohd.G1.getClass();
                sls slsVar322 = d.b;
                if (dmw0Var == null) {
                }
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new om9(f530Var, lvi0Var2, j, slsVar, l, lxy0Var, i);
        }
    }

    public static final void b(lvi0 lvi0Var, c cVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1350406779);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(lvi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(cVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            int f0 = ((int) (((z5w) cVar.g.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - fwiVar.f0(40.0f);
            int f02 = fwiVar.f0(14.0f);
            c530 c530Var = c530.a;
            f530 q = ljs0.q(ljs0.e(c530Var, 120.0f), 40.0f);
            int i3 = i2 & 112;
            boolean c = (i3 == 32) | btsVar.c(f02) | btsVar.c(f0);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = new j0v(cVar, f02, f0, 5);
                btsVar.o0(Q);
            }
            f530 d = sm91.d(q, (tls) Q);
            boolean z = i3 == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new quq0(16, cVar);
                btsVar.o0(Q2);
            }
            f530 a = androidx.compose.ui.graphics.d.a(d, (tls) Q2);
            sic a2 = qic.a(lr20.e, x4c.I, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            s3b1.f(lvi0Var, ljs0.m(c530Var, 40.0f), null, btsVar, (i2 & 14) | 48, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(lvi0Var, cVar, i, 17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, sls slsVar, ContinuationImpl continuationImpl) {
        SlimeKt$onDragEnd$1 slimeKt$onDragEnd$1;
        int i;
        if (continuationImpl instanceof SlimeKt$onDragEnd$1) {
            slimeKt$onDragEnd$1 = (SlimeKt$onDragEnd$1) continuationImpl;
            int i2 = slimeKt$onDragEnd$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slimeKt$onDragEnd$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slimeKt$onDragEnd$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slimeKt$onDragEnd$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (cVar.c() < 0.2f) {
                        slimeKt$onDragEnd$1.L$0 = null;
                        slimeKt$onDragEnd$1.L$1 = null;
                        slimeKt$onDragEnd$1.label = 1;
                        Object a = cVar.a(0.0f, slimeKt$onDragEnd$1);
                        if (a != obj2) {
                            a = obj3;
                        }
                        if (a != obj2) {
                            return obj3;
                        }
                    } else {
                        slimeKt$onDragEnd$1.L$0 = null;
                        slimeKt$onDragEnd$1.L$1 = slsVar;
                        slimeKt$onDragEnd$1.label = 2;
                        Object a2 = cVar.a(1.0f, slimeKt$onDragEnd$1);
                        if (a2 != obj2) {
                            a2 = obj3;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj3;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                slsVar = (sls) slimeKt$onDragEnd$1.L$1;
                kotlin.b.b(obj);
                slsVar.invoke();
                return obj3;
            }
        }
        slimeKt$onDragEnd$1 = new SlimeKt$onDragEnd$1(continuationImpl);
        Object obj4 = slimeKt$onDragEnd$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slimeKt$onDragEnd$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        slsVar.invoke();
        return obj32;
    }
}
