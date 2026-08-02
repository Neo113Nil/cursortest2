package defpackage;

import android.graphics.PointF;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.MtPerforationEdge;
import com.yandex.mapkit.maps.core.geometry.FloatPointKt;
import com.yandex.mapkit.maps.core.utils.SizeInt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.PinCollider$PlacedLabel;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes11.dex */
public abstract class ul91 {
    public static final char[] a = {'.', HexString.CHAR_SPACE, 8594};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, f530 f530Var2, z8m z8mVar, int i, boolean z, boolean z2, sls slsVar, sls slsVar2, fid fidVar, int i2, int i3) {
        f530 f530Var3;
        int i4;
        f530 f530Var4;
        f530 f530Var5;
        aii0 v;
        f530 a2;
        boolean z3;
        c530 c530Var;
        ?? r8;
        f530 f530Var6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-260583684);
        dmw0 dmw0Var = btsVar.a;
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            f530Var3 = f530Var;
        } else if ((i2 & 6) == 0) {
            f530Var3 = f530Var;
            i4 = (btsVar.k(f530Var3) ? 4 : 2) | i2;
        } else {
            f530Var3 = f530Var;
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= btsVar.k(f530Var2) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i4 |= btsVar.k(z8mVar) ? 256 : 128;
            }
            if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i4 |= btsVar.c(i) ? 2048 : 1024;
            }
            if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i4 |= btsVar.a(z) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i4 |= btsVar.a(z2) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i4 |= btsVar.e(slsVar) ? 1048576 : 524288;
            }
            if ((12582912 & i2) == 0) {
                i4 |= btsVar.e(slsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
            }
            if (btsVar.V(i4 & 1, (4793491 & i4) == 4793490)) {
                btsVar.Y();
                f530Var4 = f530Var3;
                f530Var5 = f530Var2;
            } else {
                c530 c530Var2 = c530.a;
                if (i5 != 0) {
                    f530Var3 = c530Var2;
                }
                f530 f530Var7 = i6 != 0 ? c530Var2 : f530Var2;
                boolean z4 = (29360128 & i4) == 8388608;
                Object Q = btsVar.Q();
                Object obj = did.a;
                if (z4 || Q == obj) {
                    Q = new jc0(26, slsVar2);
                    btsVar.o0(Q);
                }
                a2 = b.a(f530Var3, m.a(), new wu40(6, (sls) Q));
                f530 o = an91.o(a2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                f530 f530Var8 = f530Var7;
                sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
                f530 f530Var9 = f530Var3;
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d = b.d(btsVar, o);
                ohd.G1.getClass();
                sls slsVar3 = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar3);
                } else {
                    btsVar.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar, wlsVar, a3);
                wls wlsVar2 = d.e;
                qje.W(btsVar, wlsVar2, o2);
                wls wlsVar3 = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar3);
                }
                wls wlsVar4 = d.d;
                qje.W(btsVar, wlsVar4, d);
                lhl0 a4 = khl0.a(lr20.a, x4c.E, btsVar, 48);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d2 = b.d(btsVar, c530Var2);
                btsVar.i0();
                int i7 = i4;
                if (btsVar.S) {
                    btsVar.n(slsVar3);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a4);
                qje.W(btsVar, wlsVar2, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d2);
                if (z2) {
                    btsVar.e0(59535011);
                    f530 m = ljs0.m(c530Var2, 56.0f);
                    z910 d3 = pi6.d(x4c.y, false);
                    int hashCode3 = Long.hashCode(btsVar.T);
                    r1b0 o4 = btsVar.o();
                    f530 d4 = b.d(btsVar, m);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar3);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, d3);
                    qje.W(btsVar, wlsVar2, o4);
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                        b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
                    }
                    qje.W(btsVar, wlsVar4, d4);
                    b(i, (i7 >> 9) & 14, btsVar);
                    btsVar.t(true);
                    z3 = false;
                    btsVar.t(false);
                } else {
                    z3 = false;
                    btsVar.e0(59758924);
                    btsVar.t(false);
                }
                f530 c = ljs0.c(new x2y(1.0f, z3), 1.0f);
                z910 d5 = pi6.d(x4c.b, z3);
                int hashCode4 = Long.hashCode(btsVar.T);
                r1b0 o5 = btsVar.o();
                f530 d6 = b.d(btsVar, c);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar3);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d5);
                qje.W(btsVar, wlsVar2, o5);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode4))) {
                    b64.z(hashCode4, btsVar, hashCode4, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d6);
                z8mVar.a.invoke(Integer.valueOf(i), btsVar, Integer.valueOf((i7 >> 9) & 14));
                btsVar.t(true);
                if (((Boolean) z8mVar.f.invoke(Integer.valueOf(i))).booleanValue()) {
                    btsVar.e0(59912064);
                    String e = ohb1.e(btsVar, rzh0.common_delete);
                    cuj0 cuj0Var = new cuj0(wzg0.ic_delete_stop, null, null, null, 30);
                    f530 o6 = an91.o(c530Var2, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    c530Var = c530Var2;
                    boolean z5 = (i7 & 3670016) == 1048576;
                    Object Q2 = btsVar.Q();
                    if (z5 || Q2 == obj) {
                        Q2 = new jc0(27, slsVar);
                        btsVar.o0(Q2);
                    }
                    f530 d7 = q791.d(o6, false, null, null, (sls) Q2, 15);
                    boolean k = btsVar.k(e);
                    Object Q3 = btsVar.Q();
                    if (k || Q3 == obj) {
                        Q3 = new wwb(e, 18);
                        btsVar.o0(Q3);
                    }
                    f530 b = fnq0.b(d7, false, (tls) Q3);
                    r8 = 0;
                    s3b1.f(cuj0Var, b, null, btsVar, 0, 4);
                    btsVar.t(false);
                } else {
                    c530Var = c530Var2;
                    r8 = 0;
                    btsVar.e0(60477132);
                    btsVar.t(false);
                }
                if (z8mVar.g) {
                    btsVar.e0(60524066);
                    f530Var6 = f530Var8;
                    s3b1.f(new cuj0(wzg0.ic_drag_stop, null, null, new zez0(((el51) btsVar.m(gl51.a)).q()), 22), an91.o(f530Var6, 16.0f, 0.0f, 0.0f, 0.0f, 14), null, btsVar, 0, 4);
                    btsVar.t(r8);
                } else {
                    f530Var6 = f530Var8;
                    btsVar.e0(60841196);
                    btsVar.t(r8);
                }
                nnm.s(c530Var, 16.0f, btsVar, true);
                if (z) {
                    btsVar.e0(1599401200);
                    btsVar.t(r8);
                } else {
                    btsVar.e0(-1056785762);
                    wls wlsVar5 = z8mVar.b;
                    if (wlsVar5 == null) {
                        btsVar.e0(1599379747);
                    } else {
                        btsVar.e0(1599379748);
                        wlsVar5.invoke(btsVar, Integer.valueOf((int) r8));
                    }
                    btsVar.t(r8);
                    btsVar.t(r8);
                }
                btsVar.t(true);
                f530Var5 = f530Var6;
                f530Var4 = f530Var9;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new gj9(f530Var4, f530Var5, z8mVar, i, z, z2, slsVar, slsVar2, i2, i3);
                return;
            }
            return;
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if (btsVar.V(i4 & 1, (4793491 & i4) == 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(int i, int i2, fid fidVar) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(31471082);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.c(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b = 0;
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            u3b1.g(null, 0.0f, ((el51) btsVar.m(gl51.a)).g(), 12.0f, wwg.S(-966772400, true, new vm1(i, i4), btsVar), btsVar, 27648, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hp5(i, i2, i4, b);
        }
    }

    public static final void c(u510 u510Var, final float f, final tls tlsVar, fid fidVar, final int i) {
        final u510 u510Var2;
        bts btsVar;
        wp2 up2Var;
        ldc ldcVar;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1608905668);
        int i2 = 2;
        int i3 = (btsVar2.k(u510Var) ? 4 : 2) | i | 48 | (btsVar2.b(f) ? 256 : 128);
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        int i4 = i3;
        boolean z2 = false;
        if (btsVar2.V(i4 & 1, (i4 & 1171) != 1170)) {
            btsVar2.a0();
            if ((i & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            v8u v8uVar = u510Var.c;
            if (v8uVar == null || (up2Var = v8uVar.c) == null) {
                up2Var = new up2(ldc.f);
            }
            wp2 wp2Var = up2Var;
            String str = v8uVar != null ? v8uVar.a : null;
            String str2 = str == null ? "" : str;
            c530 c530Var = c530.a;
            f530 l = ymb1.l(ljs0.e(ljs0.c(c530Var, 1.0f), 140.0f), cyk0.e(32.0f, 32.0f, 0.0f, 0.0f, 12));
            wp2 wp2Var2 = u510Var.f;
            if (wp2Var2 == null) {
                btsVar2.e0(-925781674);
                btsVar2.t(false);
                ldcVar = null;
            } else {
                btsVar2.e0(-29863925);
                long n = tje.n(wp2Var2, btsVar2);
                btsVar2.t(false);
                ldcVar = new ldc(n);
            }
            f530 b = m4m0.b(l, ldcVar != null ? ldcVar.a : ldc.l, qke.q);
            MtPerforationEdge mtPerforationEdge = MtPerforationEdge.Bottom;
            if (f < 0.5f) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            boolean z3 = z;
            f530 g = ipb1.g(b, mtPerforationEdge, false, z2, btsVar2, 48, 506);
            int i5 = i4 >> 3;
            long n2 = tje.n(AppColor$Palette.Background, btsVar2);
            boolean d = (((((i5 & 112) ^ 48) <= 32 || !btsVar2.b(f)) && (i5 & 48) != 32) ? z3 : true) | btsVar2.d(n2) | btsVar2.b(0.5f);
            Object Q = btsVar2.Q();
            Object obj = did.a;
            if (d || Q == obj) {
                Q = new yql(f, n2, i2);
                btsVar2.o0(Q);
            }
            f530 k = an91.k(bb1.i(g, (tls) Q), 24.0f);
            sic a2 = qic.a(lr20.e, x4c.H, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, k);
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
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d2);
            String str3 = str2;
            jeb1.f(str3, null, wp2Var, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.d(btsVar2).d.d, btsVar2, 805306368, 48, 13818);
            oeb1.c(btsVar2, ljs0.e(c530Var, 4.0f));
            String str4 = v8uVar != null ? v8uVar.b : null;
            String str5 = str4 != null ? str4 : "";
            String lowerCase = ohb1.e(btsVar2, cyh0.mt_sdk_route_more_detailed).toLowerCase(Locale.ROOT);
            long b2 = ldc.b(tje.n(AppColor$Palette.EverFront, btsVar2), 0.5f, 0.0f, 0.0f, 0.0f, 14);
            boolean z4 = (i4 & 7168) == 2048 ? true : z3;
            if ((i4 & 14) == 4) {
                z3 = true;
            }
            boolean k2 = z4 | z3 | btsVar2.k(str3);
            Object Q2 = btsVar2.Q();
            if (k2 || Q2 == obj) {
                u510Var2 = u510Var;
                Q2 = new ynn(tlsVar, u510Var2, str3, 29);
                btsVar2.o0(Q2);
            } else {
                u510Var2 = u510Var;
            }
            d(str5, lowerCase, wp2Var, b2, null, 0, null, (tls) Q2, btsVar2, 0);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            u510Var2 = u510Var;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: j740
                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int O = vng.O(i | 1);
                    ul91.c(u510.this, f, tlsVar, (fid) obj2, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void d(String str, String str2, wp2 wp2Var, long j, f530 f530Var, int i, ety0 ety0Var, tls tlsVar, fid fidVar, int i2) {
        bts btsVar;
        f530 f530Var2;
        int i3;
        ety0 ety0Var2;
        ety0 ety0Var3;
        int i4;
        f530 f530Var3;
        boolean z;
        int i5;
        int i6;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1649567963);
        int i7 = 2;
        int i8 = i2 | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(str2) ? 32 : 16) | (btsVar2.k(wp2Var) ? 256 : 128) | (btsVar2.d(j) ? 2048 : 1024) | 745472 | (btsVar2.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar2.V(i8 & 1, (4793491 & i8) != 4793490)) {
            btsVar2.a0();
            if ((i2 & 1) == 0 || btsVar2.C()) {
                ety0Var3 = xya1.d(btsVar2).g.a;
                i4 = i8 & (-3670017);
                f530Var3 = c530.a;
            } else {
                btsVar2.Y();
                i4 = i8 & (-3670017);
                f530Var3 = f530Var;
                i7 = i;
                ety0Var3 = ety0Var;
            }
            btsVar2.u();
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(str);
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Boolean.FALSE);
                btsVar2.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            int i9 = i4;
            hk2 hk2Var = new hk2(0);
            hk2Var.d((String) oz40Var.getValue());
            if (((Boolean) oz40Var2.getValue()).booleanValue()) {
                z = false;
                int h = hk2Var.h(new bmt0(j, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534));
                try {
                    hk2Var.d(" ".concat(str2));
                } finally {
                    hk2Var.g(h);
                }
            } else {
                z = false;
            }
            kk2 i10 = hk2Var.i();
            boolean booleanValue = ((Boolean) oz40Var2.getValue()).booleanValue();
            int i11 = i9 & 14;
            boolean z2 = ((i9 & 29360128) == 8388608 ? true : z) | (i11 == 4 ? true : z);
            Object Q3 = btsVar2.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new a91(tlsVar, str, 9);
                btsVar2.o0(Q3);
            }
            sls slsVar = (sls) Q3;
            f530 f530Var4 = f530Var3;
            f530 d = q791.d(f530Var4, booleanValue, null, null, slsVar, 14);
            sjy0 sjy0Var = new sjy0(3);
            boolean z3 = (i11 == 4 ? true : z) | ((i9 & 112) != 32 ? z : true);
            Object Q4 = btsVar2.Q();
            if (z3 || Q4 == o430Var) {
                int i12 = i7;
                i5 = i9;
                ric ricVar = new ric(i12, str, str2, oz40Var2, oz40Var);
                i6 = i12;
                btsVar2.o0(ricVar);
                Q4 = ricVar;
            } else {
                i5 = i9;
                i6 = i7;
            }
            btsVar = btsVar2;
            ety0 ety0Var4 = ety0Var3;
            jeb1.d(i10, d, wp2Var, 0L, 0L, sjy0Var, 0L, 1, false, i6, 0, null, (tls) Q4, ety0Var4, btsVar, (i5 & 896) | 805306368, 48, 13688);
            i3 = i6;
            ety0Var2 = ety0Var4;
            f530Var2 = f530Var4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
            i3 = i;
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new thd(str, str2, wp2Var, j, f530Var2, i3, ety0Var2, tlsVar, i2);
        }
    }

    public static final ArrayList e(List list) {
        List<jvb0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (jvb0 jvb0Var : list2) {
            arrayList.add(new jvb0(jvb0Var.a, f(jvb0Var.b), f(jvb0Var.c), jvb0Var.d, jvb0Var.e, jvb0Var.f, jvb0Var.g, jvb0Var.h));
        }
        return arrayList;
    }

    public static final LinkedHashMap f(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new LinkedHashMap((Map) entry.getValue()));
        }
        return new LinkedHashMap(linkedHashMap);
    }

    public static final boolean g(jvb0 jvb0Var, PinCollider$PlacedLabel pinCollider$PlacedLabel, jvb0 jvb0Var2) {
        PlacemarkType l;
        PlacemarkType l2 = l(pinCollider$PlacedLabel);
        if (l2 == null || (l = l(jvb0Var2.f)) == null) {
            return false;
        }
        return h(jvb0Var, l2, jvb0Var.g, jvb0Var2, l, jvb0Var2.g, 0);
    }

    public static final boolean h(jvb0 jvb0Var, PlacemarkType placemarkType, c3c0 c3c0Var, jvb0 jvb0Var2, PlacemarkType placemarkType2, c3c0 c3c0Var2, int i) {
        PointF pointF = jvb0Var.e;
        PointF pointF2 = jvb0Var2.e;
        if (jl40.l(jvb0Var.a.a, jvb0Var2.a.a)) {
            return false;
        }
        i2c0 b = jvb0Var.b(placemarkType, c3c0Var);
        i2c0 b2 = jvb0Var2.b(placemarkType2, c3c0Var2);
        PointF a2 = jvb0Var.a(placemarkType, c3c0Var);
        PointF a3 = jvb0Var2.a(placemarkType2, c3c0Var2);
        float obtainX = FloatPointKt.obtainX(pointF);
        int i2 = b.a;
        int i3 = b.b;
        float obtainX2 = obtainX - (FloatPointKt.obtainX(a2) * i2);
        float f = i3;
        float obtainY = FloatPointKt.obtainY(pointF) - (FloatPointKt.obtainY(a2) * f);
        float obtainX3 = FloatPointKt.obtainX(pointF2);
        int i4 = b2.a;
        int i5 = b2.b;
        float obtainX4 = obtainX3 - (FloatPointKt.obtainX(a3) * i4);
        float f2 = i5;
        float obtainY2 = FloatPointKt.obtainY(pointF2) - (FloatPointKt.obtainY(a3) * f2);
        float f3 = i;
        if (Math.max(obtainX2 - f3, obtainX4) <= Math.min(obtainX2 + b.a + f3, b2.a + obtainX4)) {
            if (Math.max(obtainY - f3, obtainY2) <= Math.min(obtainY + f + f3, f2 + obtainY2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(jvb0 jvb0Var, PinCollider$PlacedLabel pinCollider$PlacedLabel, c3c0 c3c0Var, List list) {
        jvb0 jvb0Var2;
        c3c0 c3c0Var2;
        boolean h;
        PlacemarkType l = l(pinCollider$PlacedLabel);
        if (l != null) {
            List<jvb0> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (jvb0 jvb0Var3 : list2) {
                    if (jl40.l(jvb0Var3.a.a, jvb0Var.a.a)) {
                        jvb0Var2 = jvb0Var;
                        h = false;
                        c3c0Var2 = c3c0Var;
                    } else {
                        jvb0Var2 = jvb0Var;
                        c3c0Var2 = c3c0Var;
                        h = h(jvb0Var2, l, c3c0Var2, jvb0Var3, PlacemarkType.ICON, null, 0);
                    }
                    if (h) {
                        return true;
                    }
                    jvb0Var = jvb0Var2;
                    c3c0Var = c3c0Var2;
                }
            }
        }
        return false;
    }

    public static final boolean j(jvb0 jvb0Var, PinCollider$PlacedLabel pinCollider$PlacedLabel, c3c0 c3c0Var, ArrayList arrayList, int i) {
        jvb0 jvb0Var2;
        c3c0 c3c0Var2;
        int i2;
        boolean h;
        PlacemarkType l = l(pinCollider$PlacedLabel);
        if (l != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jvb0 jvb0Var3 = (jvb0) it.next();
                PlacemarkType l2 = l(jvb0Var3.f);
                if (l2 == null) {
                    jvb0Var2 = jvb0Var;
                    h = false;
                    c3c0Var2 = c3c0Var;
                    i2 = i;
                } else {
                    jvb0Var2 = jvb0Var;
                    c3c0Var2 = c3c0Var;
                    i2 = i;
                    h = h(jvb0Var2, l, c3c0Var2, jvb0Var3, l2, jvb0Var3.g, i2);
                }
                if (h) {
                    return true;
                }
                jvb0Var = jvb0Var2;
                c3c0Var = c3c0Var2;
                i = i2;
            }
        }
        return false;
    }

    public static final CookieManager k() {
        try {
            return CookieManager.getInstance();
        } catch (Exception e) {
            Log.e("WebViewExt", "CookieManager.getInstance() throws " + e);
            return null;
        }
    }

    public static final PlacemarkType l(PinCollider$PlacedLabel pinCollider$PlacedLabel) {
        int i = rvb0.a[pinCollider$PlacedLabel.ordinal()];
        if (i == 2) {
            return PlacemarkType.LABEL_S;
        }
        if (i != 3) {
            return null;
        }
        return PlacemarkType.LABEL_M;
    }

    public static final float m(jvb0 jvb0Var, c3c0 c3c0Var, SizeInt sizeInt) {
        PlacemarkType placemarkType = PlacemarkType.LABEL_S;
        i2c0 b = jvb0Var.b(placemarkType, c3c0Var);
        int i = b.a;
        int i2 = b.b;
        PointF a2 = jvb0Var.a(placemarkType, c3c0Var);
        PointF pointF = jvb0Var.e;
        float f = i;
        float obtainX = FloatPointKt.obtainX(pointF) - (FloatPointKt.obtainX(a2) * f);
        float f2 = i2;
        float obtainY = FloatPointKt.obtainY(pointF) - (FloatPointKt.obtainY(a2) * f2);
        float min = Math.min(f + obtainX, sizeInt.getWidth()) - Math.max(obtainX, 0.0f);
        if (min < 0.0f) {
            min = 0.0f;
        }
        float min2 = Math.min(f2 + obtainY, sizeInt.getHeight()) - Math.max(obtainY, 0.0f);
        float f3 = (min2 >= 0.0f ? min2 : 0.0f) * min;
        int i3 = i * i2;
        if (i3 < 1) {
            i3 = 1;
        }
        return f3 / i3;
    }
}
