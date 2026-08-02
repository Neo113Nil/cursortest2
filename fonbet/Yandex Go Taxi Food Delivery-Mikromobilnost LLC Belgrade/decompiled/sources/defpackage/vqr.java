package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class vqr {
    public static final void a(f530 f530Var, k43 k43Var, h43 h43Var, it1 it1Var, int i, int i2, a aVar, fid fidVar, int i3) {
        a aVar2;
        k43 k43Var2;
        h43 h43Var2;
        it1 it1Var2;
        int i4;
        int i5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1371845627);
        int i6 = i3 | 224688;
        if (btsVar.V(i6 & 1, (599187 & i6) != 599186)) {
            so5 so5Var = x4c.G;
            aVar2 = aVar;
            b(f530Var, wpr.c, aVar2, btsVar, 14380470);
            it1Var2 = so5Var;
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            k43Var2 = lr20.c;
            h43Var2 = lr20.a;
        } else {
            aVar2 = aVar;
            btsVar.Y();
            k43Var2 = k43Var;
            h43Var2 = h43Var;
            it1Var2 = it1Var;
            i4 = i;
            i5 = i2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(f530Var, k43Var2, h43Var2, it1Var2, i4, i5, aVar2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, wpr wprVar, a aVar, fid fidVar, int i) {
        int i2;
        Object crrVar;
        int i3;
        Object obj;
        int i4;
        int i5;
        Object obj2;
        boolean z;
        Object obj3;
        boolean k;
        Object Q;
        so5 so5Var = x4c.G;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1944405121);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i & 48;
        g43 g43Var = lr20.c;
        if (i6 == 0) {
            i2 |= btsVar.k(g43Var) ? 32 : 16;
        }
        int i7 = i & 384;
        f43 f43Var = lr20.a;
        if (i7 == 0) {
            i2 |= btsVar.k(f43Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(so5Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.c(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.c(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.k(wprVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.e(aVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (btsVar.V(i2 & 1, (4793491 & i2) != 4793490)) {
            int i8 = 3670016 & i2;
            boolean z2 = i8 == 1048576;
            Object Q2 = btsVar.Q();
            Object obj4 = did.a;
            if (z2 || Q2 == obj4) {
                Q2 = new zqr((FlowLayoutOverflow$OverflowType) wprVar.b);
                btsVar.o0(Q2);
            }
            zqr zqrVar = (zqr) Q2;
            int i9 = i2 >> 3;
            boolean k2 = ((((i9 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.c(Integer.MAX_VALUE)) || (i9 & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | ((((i9 & 14) ^ 6) > 4 && btsVar.k(g43Var)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && btsVar.k(f43Var)) || (i9 & 48) == 32) | ((((i9 & 896) ^ 384) > 256 && btsVar.k(so5Var)) || (i9 & 384) == 256) | ((((57344 & i9) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar.c(Integer.MAX_VALUE)) || (i9 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | btsVar.k(zqrVar);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == obj4) {
                acf acfVar = new acf(so5Var);
                i3 = 131072;
                obj = obj4;
                i4 = 1048576;
                i5 = SelfTester_JCP.ENCRYPT_CNT;
                crrVar = new crr(false, f43Var, g43Var, 0.0f, acfVar, 0.0f, Integer.MAX_VALUE, zqrVar);
                zqrVar = zqrVar;
                btsVar.o0(crrVar);
            } else {
                crrVar = Q3;
                obj = obj4;
                i4 = 1048576;
                i5 = SelfTester_JCP.ENCRYPT_CNT;
                i3 = 131072;
            }
            crr crrVar2 = (crr) crrVar;
            boolean z3 = (i8 == i4) | ((29360128 & i2) == i5) | ((458752 & i2) == i3);
            Object Q4 = btsVar.Q();
            if (z3) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (Q4 != obj2) {
                    z = true;
                    obj3 = Q4;
                    a c = e.c((List) obj3);
                    k = btsVar.k(crrVar2);
                    Q = btsVar.Q();
                    if (!k || Q == obj2) {
                        Q = new hl40(crrVar2);
                        btsVar.o0(Q);
                    }
                    z910 z910Var = (z910) Q;
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, f530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a != null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, z910Var);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    nnm.p(0, c, btsVar, z);
                }
            }
            ArrayList arrayList = new ArrayList();
            z = true;
            arrayList.add(new a(-1720407857, new k2z0(aVar, 15), true));
            wprVar.Bg(zqrVar, arrayList);
            btsVar.o0(arrayList);
            obj3 = arrayList;
            a c2 = e.c((List) obj3);
            k = btsVar.k(crrVar2);
            Q = btsVar.Q();
            if (!k) {
            }
            Q = new hl40(crrVar2);
            btsVar.o0(Q);
            z910 z910Var2 = (z910) Q;
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a != null) {
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(f530Var, (Object) wprVar, (cms) aVar, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f530 f530Var, h43 h43Var, k43 k43Var, to5 to5Var, int i, int i2, zls zlsVar, fid fidVar, int i3, int i4) {
        f530 f530Var2;
        int i5;
        h43 h43Var2;
        int i6;
        to5 to5Var2;
        int i7;
        int i8;
        bts btsVar;
        int i9;
        f530 f530Var3;
        h43 h43Var3;
        to5 to5Var3;
        int i10;
        aii0 v;
        int i11;
        f530 f530Var4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1303174015);
        int i12 = i4 & 1;
        if (i12 != 0) {
            i5 = i3 | 6;
            f530Var2 = f530Var;
        } else if ((i3 & 6) == 0) {
            f530Var2 = f530Var;
            i5 = (btsVar2.k(f530Var2) ? 4 : 2) | i3;
        } else {
            f530Var2 = f530Var;
            i5 = i3;
        }
        int i13 = i4 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            h43Var2 = h43Var;
            i5 |= btsVar2.k(h43Var2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i5 |= btsVar2.k(k43Var) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                to5Var2 = to5Var;
                i5 |= btsVar2.k(to5Var2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i5 |= btsVar2.c(i) ? 16384 : 8192;
                    i8 = i5 | ImageMetadata.EDGE_MODE;
                    if (btsVar2.V(i8 & 1, (599187 & i8) == 599186)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        i9 = i2;
                        f530Var3 = f530Var2;
                        h43Var3 = h43Var2;
                        to5Var3 = to5Var2;
                        i10 = i;
                    } else {
                        if (i12 != 0) {
                            f530Var4 = c530.a;
                            i11 = i7;
                        } else {
                            i11 = i7;
                            f530Var4 = f530Var2;
                        }
                        h43 h43Var4 = i13 != 0 ? lr20.a : h43Var2;
                        to5 to5Var4 = i6 != 0 ? x4c.D : to5Var2;
                        int i14 = i11 != 0 ? Integer.MAX_VALUE : i;
                        btsVar = btsVar2;
                        d(f530Var4, h43Var4, k43Var, to5Var4, i14, drr.c, zlsVar, btsVar, (i8 & 14) | 1572864 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & HProv.ALG_CLASS_ALL) | 12779520);
                        i9 = Integer.MAX_VALUE;
                        f530Var3 = f530Var4;
                        h43Var3 = h43Var4;
                        to5Var3 = to5Var4;
                        i10 = i14;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new xwb(f530Var3, h43Var3, k43Var, to5Var3, i10, i9, zlsVar, i3, i4);
                        return;
                    }
                    return;
                }
                i8 = i5 | ImageMetadata.EDGE_MODE;
                if (btsVar2.V(i8 & 1, (599187 & i8) == 599186)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            to5Var2 = to5Var;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i5 | ImageMetadata.EDGE_MODE;
            if (btsVar2.V(i8 & 1, (599187 & i8) == 599186)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        h43Var2 = h43Var;
        if ((i3 & 384) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        to5Var2 = to5Var;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i5 | ImageMetadata.EDGE_MODE;
        if (btsVar2.V(i8 & 1, (599187 & i8) == 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void d(f530 f530Var, h43 h43Var, k43 k43Var, to5 to5Var, int i, drr drrVar, zls zlsVar, fid fidVar, int i2) {
        int i3;
        int i4;
        zqr zqrVar;
        int i5;
        boolean z;
        Object obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(h43Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.k(k43Var) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(to5Var) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.c(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= btsVar.c(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= btsVar.k(drrVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= btsVar.e(zlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        int i6 = i3;
        if (btsVar.V(i6 & 1, (i6 & 4793491) != 4793490)) {
            int i7 = i6 & 3670016;
            boolean z2 = i7 == 1048576;
            Object Q = btsVar.Q();
            Object obj2 = did.a;
            Object obj3 = Q;
            if (z2 || Q == obj2) {
                Object zqrVar2 = new zqr((FlowLayoutOverflow$OverflowType) drrVar.b);
                btsVar.o0(zqrVar2);
                obj3 = zqrVar2;
            }
            zqr zqrVar3 = (zqr) obj3;
            int i8 = i6 >> 3;
            boolean k = ((((57344 & i8) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar.c(Integer.MAX_VALUE)) || (i8 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | ((((i8 & 14) ^ 6) > 4 && btsVar.k(h43Var)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && btsVar.k(k43Var)) || (i8 & 48) == 32) | ((((i8 & 896) ^ 384) > 256 && btsVar.k(to5Var)) || (i8 & 384) == 256) | ((((i8 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.c(i)) || (i8 & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | btsVar.k(zqrVar3);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj2) {
                float b = h43Var.b();
                bcf bcfVar = new bcf(to5Var);
                float b2 = k43Var.b();
                i4 = i7;
                zqrVar = zqrVar3;
                i5 = SelfTester_JCP.ENCRYPT_CNT;
                Object crrVar = new crr(true, h43Var, k43Var, b, bcfVar, b2, i, zqrVar);
                btsVar.o0(crrVar);
                Q2 = crrVar;
            } else {
                i4 = i7;
                zqrVar = zqrVar3;
                i5 = SelfTester_JCP.ENCRYPT_CNT;
            }
            crr crrVar2 = (crr) Q2;
            boolean z3 = (i4 == 1048576) | ((i6 & 29360128) == i5) | ((i6 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072);
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == obj2) {
                ArrayList arrayList = new ArrayList();
                z = true;
                arrayList.add(new a(-1192950673, new xor(zlsVar, true ? 1 : 0), true));
                drrVar.Bg(zqrVar, arrayList);
                btsVar.o0(arrayList);
                obj = arrayList;
            } else {
                z = true;
                obj = Q3;
            }
            a c = e.c((List) obj);
            boolean k2 = btsVar.k(crrVar2);
            Object Q4 = btsVar.Q();
            Object obj4 = Q4;
            if (k2 || Q4 == obj2) {
                Object hl40Var = new hl40(crrVar2);
                btsVar.o0(hl40Var);
                obj4 = hl40Var;
            }
            z910 z910Var = (z910) obj4;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            nnm.p(0, c, btsVar, z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tq0(f530Var, h43Var, k43Var, to5Var, i, drrVar, zlsVar, i2);
        }
    }

    public static final void e(x910 x910Var, crr crrVar, long j, tls tlsVar) {
        boolean z = crrVar.a;
        if (cva1.c(cva1.b(x910Var)) == 0.0f) {
            cva1.b(x910Var);
            o l0 = x910Var.l0(j);
            tlsVar.invoke(l0);
            crrVar.h(l0);
            crrVar.d(l0);
            return;
        }
        int e0 = z ? x910Var.e0(Integer.MAX_VALUE) : x910Var.V(Integer.MAX_VALUE);
        if (z) {
            x910Var.V(e0);
        } else {
            x910Var.e0(e0);
        }
    }
}
