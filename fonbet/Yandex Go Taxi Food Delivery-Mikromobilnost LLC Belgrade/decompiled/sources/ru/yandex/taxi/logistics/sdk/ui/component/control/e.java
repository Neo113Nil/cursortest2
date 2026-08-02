package ru.yandex.taxi.logistics.sdk.ui.component.control;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.l;
import androidx.compose.material.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.aii0;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.ejb1;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.g131;
import defpackage.gl51;
import defpackage.gsk0;
import defpackage.h8w;
import defpackage.hi91;
import defpackage.hzr;
import defpackage.ibb1;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.lic;
import defpackage.ljs0;
import defpackage.lo1;
import defpackage.lr20;
import defpackage.lrv;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.m3u0;
import defpackage.m4m0;
import defpackage.mic;
import defpackage.n;
import defpackage.nah;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oxv0;
import defpackage.oz40;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.qti;
import defpackage.r1b0;
import defpackage.r5a1;
import defpackage.rbn;
import defpackage.sls;
import defpackage.sm91;
import defpackage.sty0;
import defpackage.tls;
import defpackage.to5;
import defpackage.tra1;
import defpackage.uo5;
import defpackage.urj0;
import defpackage.v2w;
import defpackage.vah;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xab1;
import defpackage.xqn;
import defpackage.y7m;
import defpackage.ycm0;
import defpackage.ymb1;
import defpackage.yql;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes5.dex */
public abstract class e {
    public static final ck11 a = new ck11(100, (rbn) null, 6);
    public static final float b = 1.0f;
    public static final float c = 4.0f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final f530 f530Var, final boolean z, boolean z2, long j, long j2, long j3, final tls tlsVar, zx40 zx40Var, fid fidVar, final int i, final int i2) {
        int i3;
        long j4;
        int i4;
        long j5;
        long j6;
        int i5;
        final long j7;
        final long j8;
        final long j9;
        final boolean z3;
        final zx40 zx40Var2;
        aii0 v;
        final boolean z4;
        final long j10;
        final zx40 zx40Var3;
        boolean z5;
        long j11;
        boolean z6;
        Object Q;
        boolean z7;
        Object Q2;
        int i6;
        int i7;
        int i8;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-653967);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.a(z) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.a(z2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j;
                    if (btsVar.d(j4)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    j4 = j;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                j4 = j;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                if ((i2 & 16) == 0) {
                    i6 = i3;
                    j5 = j2;
                    if (btsVar.d(j5)) {
                        i7 = 16384;
                        i4 = i6 | i7;
                    }
                } else {
                    i6 = i3;
                    j5 = j2;
                }
                i7 = 8192;
                i4 = i6 | i7;
            } else {
                i4 = i3;
                j5 = j2;
            }
            if ((196608 & i) != 0) {
                j6 = j3;
                i4 |= ((i2 & 32) == 0 && btsVar.d(j6)) ? 131072 : 65536;
            } else {
                j6 = j3;
            }
            if ((1572864 & i) == 0) {
                i4 |= btsVar.e(tlsVar) ? 1048576 : 524288;
            }
            i5 = i4 | 12582912;
            if (btsVar.V(i5 & 1, (4793491 & i5) == 4793490)) {
                btsVar.Y();
                long j12 = j6;
                j7 = j5;
                j8 = j4;
                j9 = j12;
                z3 = z2;
                zx40Var2 = zx40Var;
            } else {
                btsVar.a0();
                int i10 = i & 1;
                o430 o430Var = did.a;
                if (i10 == 0 || btsVar.C()) {
                    boolean z8 = i9 != 0 ? true : z2;
                    if ((i2 & 8) != 0) {
                        j4 = ((el51) btsVar.m(gl51.a)).f();
                        i5 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        j5 = ((el51) btsVar.m(gl51.a)).g();
                        i5 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        if (((Boolean) btsVar.m(qti.e)).booleanValue()) {
                            btsVar.e0(-628452423);
                            j6 = ((el51) btsVar.m(gl51.a)).b();
                            z5 = false;
                        } else {
                            z5 = false;
                            btsVar.e0(-628451369);
                            j6 = ((el51) btsVar.m(gl51.a)).c();
                        }
                        btsVar.t(z5);
                        i5 &= -458753;
                    }
                    Object Q3 = btsVar.Q();
                    if (Q3 == o430Var) {
                        Q3 = ly3.i(btsVar);
                    }
                    z4 = z8;
                    j10 = j6;
                    zx40Var3 = (zx40) Q3;
                } else {
                    btsVar.Y();
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i5 &= -458753;
                    }
                    z4 = z2;
                    zx40Var3 = zx40Var;
                    j10 = j6;
                }
                btsVar.u();
                Boolean valueOf = Boolean.valueOf(z);
                int i11 = 14;
                int i12 = ((i5 >> 3) & 14) | 384 | ((i5 >> 15) & 112);
                Object Q4 = btsVar.Q();
                if (Q4 == o430Var) {
                    Q4 = new androidx.compose.material.e(valueOf, a, new oxv0(i11));
                    btsVar.o0(Q4);
                }
                final androidx.compose.material.e eVar = (androidx.compose.material.e) Q4;
                Object Q5 = btsVar.Q();
                if (Q5 == o430Var) {
                    Q5 = androidx.compose.runtime.f.j(Boolean.FALSE);
                    btsVar.o0(Q5);
                }
                oz40 oz40Var = (oz40) Q5;
                Object value = oz40Var.getValue();
                int i13 = (i12 & 14) ^ 6;
                if (i13 <= 4 || !btsVar.e(valueOf)) {
                    j11 = j5;
                    if ((i12 & 6) != 4) {
                        z6 = false;
                        Q = btsVar.Q();
                        if (!z6 || Q == o430Var) {
                            Q = new SwitchKt$rememberSwipeableStateFor$1$1(eVar, valueOf, null);
                            btsVar.o0(Q);
                        }
                        zpn.f(valueOf, value, (wls) Q, btsVar);
                        Object value2 = eVar.b.getValue();
                        z7 = ((i13 <= 4 && btsVar.e(valueOf)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) <= 32 && btsVar.k(tlsVar)) || (i12 & 48) == 32);
                        Q2 = btsVar.Q();
                        if (!z7 || Q2 == o430Var) {
                            Q2 = new ycm0(valueOf, eVar, tlsVar, oz40Var, 7);
                            btsVar.o0(Q2);
                        }
                        zpn.a(value2, (tls) Q2, btsVar);
                        final boolean z9 = btsVar.m(j.n) != LayoutDirection.Rtl;
                        final f530 u = r5a1.u(c530.a, z, zx40Var3, null, z4, new awk0(2), tlsVar);
                        final long j13 = j11;
                        final long j14 = j4;
                        xab1.a(f530Var, null, wwg.S(-2035267877, true, new zls() { // from class: czw0
                            @Override // defpackage.zls
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                final e eVar2;
                                final boolean z10;
                                final boolean z11;
                                final zx40 zx40Var4;
                                tls a2;
                                dj6 dj6Var = (dj6) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                long j15 = dj6Var.b;
                                fwi fwiVar = dj6Var.a;
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    float H = (fwiVar.H(n8e.j(j15)) / 2.0f) - 1.5f;
                                    float H2 = fwiVar.H(n8e.j(j15)) / 2.0f;
                                    long j16 = z ? j14 : j13;
                                    float H3 = (fwiVar.H(n8e.k(j15)) - 1.5f) - (2.0f * H);
                                    f530 k = ljs0.c.k(u);
                                    final Map i14 = b.i(new Pair(Float.valueOf(1.5f), Boolean.FALSE), new Pair(Float.valueOf(H3), Boolean.TRUE));
                                    final Orientation orientation = Orientation.Horizontal;
                                    Object Q6 = btsVar2.Q();
                                    if (Q6 == did.a) {
                                        Q6 = new pjv0(3);
                                        btsVar2.o0(Q6);
                                    }
                                    final wls wlsVar = (wls) Q6;
                                    boolean z12 = m.b;
                                    e eVar3 = eVar;
                                    boolean z13 = z4;
                                    boolean z14 = z9;
                                    zx40 zx40Var5 = zx40Var3;
                                    if (z12) {
                                        eVar2 = eVar3;
                                        z10 = z13;
                                        z11 = z14;
                                        zx40Var4 = zx40Var5;
                                        a2 = new tls() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
                                            final /* synthetic */ urj0 $resistance$inlined = null;
                                            final /* synthetic */ float $velocityThreshold$inlined = 125.0f;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj4) {
                                                v2w v2wVar = (v2w) obj4;
                                                v2wVar.getClass();
                                                g131 g131Var = v2wVar.a;
                                                g131Var.b(ClidProvider.STATE, eVar2);
                                                g131Var.b("anchors", i14);
                                                g131Var.b("orientation", orientation);
                                                g131Var.b(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(z10));
                                                g131Var.b("reverseDirection", Boolean.valueOf(z11));
                                                g131Var.b("interactionSource", zx40Var4);
                                                g131Var.b("thresholds", wlsVar);
                                                g131Var.b("resistance", this.$resistance$inlined);
                                                n.x(this.$velocityThreshold$inlined, g131Var, "velocityThreshold");
                                                return zy11.a;
                                            }
                                        };
                                    } else {
                                        eVar2 = eVar3;
                                        z10 = z13;
                                        z11 = z14;
                                        zx40Var4 = zx40Var5;
                                        a2 = m.a();
                                    }
                                    e eVar4 = eVar2;
                                    f530 v2 = ljs0.v(androidx.compose.ui.b.a(k, a2, new zls() { // from class: androidx.compose.material.b
                                        @Override // defpackage.zls
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            ((Integer) obj6).getClass();
                                            bts btsVar3 = (bts) ((fid) obj5);
                                            btsVar3.e0(43594985);
                                            Map map = i14;
                                            if (map.isEmpty()) {
                                                ny61.g("You must have at least one anchor.");
                                                return null;
                                            }
                                            if (kotlin.collections.a.I(map.values()).size() != map.size()) {
                                                ny61.g("You cannot have two anchors mapped to the same state.");
                                                return null;
                                            }
                                            fwi fwiVar2 = (fwi) btsVar3.m(androidx.compose.ui.platform.j.h);
                                            e eVar5 = eVar2;
                                            if (((Map) eVar5.h.getValue()).isEmpty()) {
                                                Float a3 = ejb1.a(eVar5.b.getValue(), map);
                                                if (a3 == null) {
                                                    ny61.g("The initial value must have an associated anchor.");
                                                    return null;
                                                }
                                                eVar5.d.setFloatValue(a3.floatValue());
                                                eVar5.f.setFloatValue(a3.floatValue());
                                            }
                                            boolean k2 = btsVar3.k(eVar5) | btsVar3.e(map) | btsVar3.k(null);
                                            wls wlsVar2 = wlsVar;
                                            boolean k3 = k2 | btsVar3.k(wlsVar2) | btsVar3.k(fwiVar2) | btsVar3.b(125.0f);
                                            Object Q7 = btsVar3.Q();
                                            Object obj7 = did.a;
                                            if (k3 || Q7 == obj7) {
                                                Q7 = new SwipeableKt$swipeable$3$3$1(eVar5, map, null, fwiVar2, wlsVar2, 125.0f, null);
                                                btsVar3.o0(Q7);
                                            }
                                            zpn.f(map, eVar5, (wls) Q7, btsVar3);
                                            boolean booleanValue = ((Boolean) eVar5.c.getValue()).booleanValue();
                                            nah nahVar = eVar5.o;
                                            boolean k4 = btsVar3.k(eVar5);
                                            Object Q8 = btsVar3.Q();
                                            if (k4 || Q8 == obj7) {
                                                Q8 = new SwipeableKt$swipeable$3$4$1(eVar5, null);
                                                btsVar3.o0(Q8);
                                            }
                                            f530 a4 = l.a(c530.a, nahVar, orientation, z10, zx40Var4, booleanValue, null, (zls) Q8, z11, 32);
                                            btsVar3.t(false);
                                            return a4;
                                        }
                                    }), x4c.y, 2);
                                    z910 d = pi6.d(x4c.b, false);
                                    int hashCode = Long.hashCode(btsVar2.T);
                                    r1b0 o = btsVar2.o();
                                    f530 d2 = androidx.compose.ui.b.d(btsVar2, v2);
                                    ohd.G1.getClass();
                                    sls slsVar = d.b;
                                    if (btsVar2.a == null) {
                                        cma1.b0();
                                        throw null;
                                    }
                                    btsVar2.i0();
                                    if (btsVar2.S) {
                                        btsVar2.n(slsVar);
                                    } else {
                                        btsVar2.r0();
                                    }
                                    qje.W(btsVar2, d.f, d);
                                    qje.W(btsVar2, d.e, o);
                                    wls wlsVar2 = d.g;
                                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                                        b64.z(hashCode, btsVar2, hashCode, wlsVar2);
                                    }
                                    qje.W(btsVar2, d.d, d2);
                                    ru.yandex.taxi.logistics.sdk.ui.component.control.e.b(j16, j10, eVar4.d, zx40Var4, H2, H, btsVar2, 6);
                                    btsVar2.t(true);
                                } else {
                                    btsVar2.Y();
                                }
                                return zy11.a;
                            }
                        }, btsVar), btsVar, (i5 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 6);
                        j8 = j14;
                        j7 = j13;
                        z3 = z4;
                        zx40Var2 = zx40Var3;
                        j9 = j10;
                    }
                } else {
                    j11 = j5;
                }
                z6 = true;
                Q = btsVar.Q();
                if (!z6) {
                }
                Q = new SwitchKt$rememberSwipeableStateFor$1$1(eVar, valueOf, null);
                btsVar.o0(Q);
                zpn.f(valueOf, value, (wls) Q, btsVar);
                Object value22 = eVar.b.getValue();
                z7 = ((i13 <= 4 && btsVar.e(valueOf)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) <= 32 && btsVar.k(tlsVar)) || (i12 & 48) == 32);
                Q2 = btsVar.Q();
                if (!z7) {
                }
                Q2 = new ycm0(valueOf, eVar, tlsVar, oz40Var, 7);
                btsVar.o0(Q2);
                zpn.a(value22, (tls) Q2, btsVar);
                if (btsVar.m(j.n) != LayoutDirection.Rtl) {
                }
                final f530 u2 = r5a1.u(c530.a, z, zx40Var3, null, z4, new awk0(2), tlsVar);
                final long j132 = j11;
                final long j142 = j4;
                xab1.a(f530Var, null, wwg.S(-2035267877, true, new zls() { // from class: czw0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final e eVar2;
                        final boolean z10;
                        final boolean z11;
                        final zx40 zx40Var4;
                        tls a2;
                        dj6 dj6Var = (dj6) obj;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        long j15 = dj6Var.b;
                        fwi fwiVar = dj6Var.a;
                        if ((intValue & 6) == 0) {
                            intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                        }
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                            float H = (fwiVar.H(n8e.j(j15)) / 2.0f) - 1.5f;
                            float H2 = fwiVar.H(n8e.j(j15)) / 2.0f;
                            long j16 = z ? j142 : j132;
                            float H3 = (fwiVar.H(n8e.k(j15)) - 1.5f) - (2.0f * H);
                            f530 k = ljs0.c.k(u2);
                            final Map i14 = b.i(new Pair(Float.valueOf(1.5f), Boolean.FALSE), new Pair(Float.valueOf(H3), Boolean.TRUE));
                            final Orientation orientation = Orientation.Horizontal;
                            Object Q6 = btsVar2.Q();
                            if (Q6 == did.a) {
                                Q6 = new pjv0(3);
                                btsVar2.o0(Q6);
                            }
                            final wls wlsVar = (wls) Q6;
                            boolean z12 = m.b;
                            e eVar3 = eVar;
                            boolean z13 = z4;
                            boolean z14 = z9;
                            zx40 zx40Var5 = zx40Var3;
                            if (z12) {
                                eVar2 = eVar3;
                                z10 = z13;
                                z11 = z14;
                                zx40Var4 = zx40Var5;
                                a2 = new tls() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
                                    final /* synthetic */ urj0 $resistance$inlined = null;
                                    final /* synthetic */ float $velocityThreshold$inlined = 125.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj4) {
                                        v2w v2wVar = (v2w) obj4;
                                        v2wVar.getClass();
                                        g131 g131Var = v2wVar.a;
                                        g131Var.b(ClidProvider.STATE, eVar2);
                                        g131Var.b("anchors", i14);
                                        g131Var.b("orientation", orientation);
                                        g131Var.b(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(z10));
                                        g131Var.b("reverseDirection", Boolean.valueOf(z11));
                                        g131Var.b("interactionSource", zx40Var4);
                                        g131Var.b("thresholds", wlsVar);
                                        g131Var.b("resistance", this.$resistance$inlined);
                                        n.x(this.$velocityThreshold$inlined, g131Var, "velocityThreshold");
                                        return zy11.a;
                                    }
                                };
                            } else {
                                eVar2 = eVar3;
                                z10 = z13;
                                z11 = z14;
                                zx40Var4 = zx40Var5;
                                a2 = m.a();
                            }
                            e eVar4 = eVar2;
                            f530 v2 = ljs0.v(androidx.compose.ui.b.a(k, a2, new zls() { // from class: androidx.compose.material.b
                                @Override // defpackage.zls
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    ((Integer) obj6).getClass();
                                    bts btsVar3 = (bts) ((fid) obj5);
                                    btsVar3.e0(43594985);
                                    Map map = i14;
                                    if (map.isEmpty()) {
                                        ny61.g("You must have at least one anchor.");
                                        return null;
                                    }
                                    if (kotlin.collections.a.I(map.values()).size() != map.size()) {
                                        ny61.g("You cannot have two anchors mapped to the same state.");
                                        return null;
                                    }
                                    fwi fwiVar2 = (fwi) btsVar3.m(androidx.compose.ui.platform.j.h);
                                    e eVar5 = eVar2;
                                    if (((Map) eVar5.h.getValue()).isEmpty()) {
                                        Float a3 = ejb1.a(eVar5.b.getValue(), map);
                                        if (a3 == null) {
                                            ny61.g("The initial value must have an associated anchor.");
                                            return null;
                                        }
                                        eVar5.d.setFloatValue(a3.floatValue());
                                        eVar5.f.setFloatValue(a3.floatValue());
                                    }
                                    boolean k2 = btsVar3.k(eVar5) | btsVar3.e(map) | btsVar3.k(null);
                                    wls wlsVar2 = wlsVar;
                                    boolean k3 = k2 | btsVar3.k(wlsVar2) | btsVar3.k(fwiVar2) | btsVar3.b(125.0f);
                                    Object Q7 = btsVar3.Q();
                                    Object obj7 = did.a;
                                    if (k3 || Q7 == obj7) {
                                        Q7 = new SwipeableKt$swipeable$3$3$1(eVar5, map, null, fwiVar2, wlsVar2, 125.0f, null);
                                        btsVar3.o0(Q7);
                                    }
                                    zpn.f(map, eVar5, (wls) Q7, btsVar3);
                                    boolean booleanValue = ((Boolean) eVar5.c.getValue()).booleanValue();
                                    nah nahVar = eVar5.o;
                                    boolean k4 = btsVar3.k(eVar5);
                                    Object Q8 = btsVar3.Q();
                                    if (k4 || Q8 == obj7) {
                                        Q8 = new SwipeableKt$swipeable$3$4$1(eVar5, null);
                                        btsVar3.o0(Q8);
                                    }
                                    f530 a4 = l.a(c530.a, nahVar, orientation, z10, zx40Var4, booleanValue, null, (zls) Q8, z11, 32);
                                    btsVar3.t(false);
                                    return a4;
                                }
                            }), x4c.y, 2);
                            z910 d = pi6.d(x4c.b, false);
                            int hashCode = Long.hashCode(btsVar2.T);
                            r1b0 o = btsVar2.o();
                            f530 d2 = androidx.compose.ui.b.d(btsVar2, v2);
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            if (btsVar2.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar2.i0();
                            if (btsVar2.S) {
                                btsVar2.n(slsVar);
                            } else {
                                btsVar2.r0();
                            }
                            qje.W(btsVar2, d.f, d);
                            qje.W(btsVar2, d.e, o);
                            wls wlsVar2 = d.g;
                            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                                b64.z(hashCode, btsVar2, hashCode, wlsVar2);
                            }
                            qje.W(btsVar2, d.d, d2);
                            ru.yandex.taxi.logistics.sdk.ui.component.control.e.b(j16, j10, eVar4.d, zx40Var4, H2, H, btsVar2, 6);
                            btsVar2.t(true);
                        } else {
                            btsVar2.Y();
                        }
                        return zy11.a;
                    }
                }, btsVar), btsVar, (i5 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 6);
                j8 = j142;
                j7 = j132;
                z3 = z4;
                zx40Var2 = zx40Var3;
                j9 = j10;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: ezw0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int O = vng.O(i | 1);
                        ru.yandex.taxi.logistics.sdk.ui.component.control.e.a(f530.this, z, z3, j8, j7, j9, tlsVar, zx40Var2, (fid) obj, O, i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i5 = i4 | 12582912;
        if (btsVar.V(i5 & 1, (4793491 & i5) == 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(final long j, final long j2, final m3u0 m3u0Var, final h8w h8wVar, final float f, final float f2, fid fidVar, final int i) {
        long j3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(298130408);
        int i2 = i | (btsVar.d(j) ? 32 : 16) | (btsVar.d(j2) ? 256 : 128) | (btsVar.k(m3u0Var) ? 2048 : 1024) | (btsVar.k(h8wVar) ? 16384 : 8192) | (btsVar.b(f) ? 131072 : 65536) | (btsVar.b(f2) ? 1048576 : 524288);
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new SnapshotStateList();
                btsVar.o0(Q);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) Q;
            boolean z = (i2 & HProv.ALG_CLASS_ALL) == 16384;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new SwitchKt$SwitchImpl$1$1(h8wVar, snapshotStateList, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, h8wVar);
            float f3 = !snapshotStateList.isEmpty() ? c : b;
            uo5 uo5Var = x4c.y;
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            f530 k = cj6Var.a(c530Var, uo5Var).k(ljs0.c);
            boolean z2 = ((458752 & i2) == 131072) | ((i2 & 112) == 32);
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new yql(j, f, 3);
                btsVar.o0(Q3);
            }
            qeb1.a(0, btsVar, (tls) Q3, k);
            vah vahVar = (vah) btsVar.m(xqn.a);
            float f4 = ((y7m) btsVar.m(xqn.b)).a + f3;
            if (!ldc.c(j2, ((lic) btsVar.m(mic.a)).d()) || vahVar == null) {
                btsVar.e0(-387750504);
                btsVar.t(false);
                j3 = j2;
            } else {
                btsVar.e0(-387831507);
                j3 = vah.a(f4, (i2 >> 6) & 14, j2, btsVar);
                btsVar.t(false);
            }
            f530 i3 = ljs0.i(lrv.a(sm91.e(cj6Var.a(c530Var, x4c.x), ((Number) m3u0Var.getValue()).floatValue(), 0.0f), h8wVar, gsk0.a(f2, 4)), 2.0f * f2);
            byk0 byk0Var = cyk0.a;
            oeb1.c(btsVar, m4m0.b(ibb1.c(i3, f3, byk0Var, 0L, 0L, 24), j3, byk0Var));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(j, j2, m3u0Var, h8wVar, f, f2, i) { // from class: gzw0
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ m3u0 c;
                public final /* synthetic */ h8w w;
                public final /* synthetic */ float x;
                public final /* synthetic */ float y;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(7);
                    ru.yandex.taxi.logistics.sdk.ui.component.control.e.b(this.a, this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(final f530 f530Var, final tls tlsVar, final String str, final boolean z, final ldc ldcVar, final ldc ldcVar2, final ldc ldcVar3, final lzr lzrVar, long j, fid fidVar, final int i) {
        final long j2;
        int i2;
        long j3;
        long j4;
        long j5;
        boolean z2;
        o430 o430Var;
        int i3;
        boolean z3;
        zx40 zx40Var;
        boolean z4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1896978343);
        int i4 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL | (btsVar.a(true) ? 16384 : 8192) | (btsVar.a(z) ? 131072 : 65536) | (btsVar.k(ldcVar) ? 1048576 : 524288) | (btsVar.k(ldcVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.k(ldcVar3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | SelfTester_JCP.IMITA;
        if (btsVar.V(i4 & 1, (306783379 & i4) != 306783378)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                i2 = i4 & (-1879048193);
                j3 = sty0.c;
            } else {
                btsVar.Y();
                i2 = i4 & (-1879048193);
                j3 = j;
            }
            btsVar.u();
            if (ldcVar == null) {
                btsVar.e0(1930072850);
                long f = ((el51) btsVar.m(gl51.a)).f();
                btsVar.t(false);
                j4 = f;
            } else {
                btsVar.e0(1930071300);
                btsVar.t(false);
                j4 = ldcVar.a;
            }
            if (ldcVar2 == null) {
                btsVar.e0(1930075859);
                j5 = ((el51) btsVar.m(gl51.a)).g();
                btsVar.t(false);
            } else {
                btsVar.e0(1930074247);
                btsVar.t(false);
                j5 = ldcVar2.a;
            }
            long j6 = j5;
            long j7 = ldcVar3 != null ? ldcVar3.a : ldc.f;
            to5 to5Var = x4c.E;
            c530 c530Var = c530.a;
            f530 b2 = tra1.b(c530Var, 1.0f);
            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            boolean z5 = !(str == null || str.length() == 0);
            int i5 = 15;
            o430 o430Var2 = did.a;
            if (str == null) {
                btsVar.e0(-259324190);
                btsVar.t(false);
                zx40Var = null;
                i3 = i2;
                o430Var = o430Var2;
                z2 = false;
                z3 = true;
            } else {
                btsVar.e0(-259324189);
                f530 b3 = tra1.b(c530Var, z5 == z ? 1.0f : 0.5f);
                Object Q = btsVar.Q();
                if (Q == o430Var2) {
                    Q = new oxv0(i5);
                    btsVar.o0(Q);
                }
                long j8 = j3;
                z2 = false;
                o430Var = o430Var2;
                i3 = i2;
                ymb1.f(str, fnq0.a(b3, (tls) Q), 0L, null, lzrVar, new hzr(0), j8, 0L, 0L, null, 0, false, 0, null, null, btsVar, 1597440, 0, 65420);
                j3 = j8;
                btsVar = btsVar;
                btsVar.t(false);
                z3 = true;
                zx40Var = null;
            }
            f530 d2 = hi91.d(f530Var, z3, zx40Var, 2);
            int i6 = i3;
            boolean z6 = ((i6 & 896) == 256 ? true : z2) | ((458752 & i6) == 131072 ? true : z2);
            Object Q2 = btsVar.Q();
            if (z6 || Q2 == o430Var) {
                z4 = z;
                Q2 = new lo1(z4, str, 15);
                btsVar.o0(Q2);
            } else {
                z4 = z;
            }
            a(fnq0.b(d2, z2, (tls) Q2), z4, true, j4, j6, j7, tlsVar, null, btsVar, ((i6 >> 12) & 112) | ((i6 >> 6) & 896) | ((i6 << 15) & 3670016), 128);
            btsVar.e0(-258309374);
            btsVar.t(z2);
            btsVar.t(true);
            j2 = j3;
        } else {
            btsVar.Y();
            j2 = j;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(tlsVar, str, z, ldcVar, ldcVar2, ldcVar3, lzrVar, j2, i) { // from class: hzw0
                public final /* synthetic */ lzr A;
                public final /* synthetic */ long B;
                public final /* synthetic */ tls b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ ldc x;
                public final /* synthetic */ ldc y;
                public final /* synthetic */ ldc z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    ru.yandex.taxi.logistics.sdk.ui.component.control.e.c(f530.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }
}
