package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes5.dex */
public final class tgg {
    public final LinkedHashMap a;

    public tgg(Set set) {
        Set set2 = set;
        int d = gw00.d(tcc.n(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : set2) {
            linkedHashMap.put(((a151) obj).a, obj);
        }
        this.a = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final qkg qkgVar, f530 f530Var, float f, long j, boolean z, boolean z2, wls wlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        float f2;
        long j2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        bts btsVar;
        final f530 f530Var2;
        final wls wlsVar2;
        final float f3;
        final long j3;
        final boolean z5;
        final boolean z6;
        aii0 v;
        wls wlsVar3;
        boolean z7;
        boolean z8;
        long j4;
        f530 f530Var3;
        float f4;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Iterator it;
        Boolean valueOf;
        boolean z9;
        Boolean valueOf2;
        List list;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(676870804);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(qkgVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar2.k(f530Var) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f2 = f;
                i3 |= btsVar2.b(f2) ? 256 : 128;
                if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    j2 = j;
                    i3 |= ((i2 & 8) == 0 && btsVar2.d(j2)) ? 2048 : 1024;
                } else {
                    j2 = j;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    z3 = z;
                    i3 |= btsVar2.a(z3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i) == 0) {
                        z4 = z2;
                        i3 |= btsVar2.a(z4) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= btsVar2.e(wlsVar) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            i3 |= btsVar2.e(this) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        }
                        if (btsVar2.V(i3 & 1, (i3 & 4793491) != 4793490)) {
                            btsVar2.a0();
                            int i9 = i & 1;
                            o430 o430Var = did.a;
                            if (i9 == 0 || btsVar2.C()) {
                                f530 f530Var4 = i8 != 0 ? c530.a : f530Var;
                                float f5 = i4 != 0 ? 2.0f : f2;
                                if ((i2 & 8) != 0) {
                                    j2 = ((el51) btsVar2.m(gl51.a)).e();
                                    i3 &= -7169;
                                }
                                if (i5 != 0) {
                                    z3 = false;
                                }
                                if (i6 != 0) {
                                    z4 = false;
                                }
                                if (i7 != 0) {
                                    Object Q = btsVar2.Q();
                                    if (Q == o430Var) {
                                        Q = new zbd(9);
                                        btsVar2.o0(Q);
                                    }
                                    wlsVar3 = (wls) Q;
                                } else {
                                    wlsVar3 = wlsVar;
                                }
                                z7 = z4;
                                z8 = z3;
                                j4 = j2;
                                f530Var3 = f530Var4;
                                f4 = f5;
                            } else {
                                btsVar2.Y();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                z7 = z4;
                                z8 = z3;
                                j4 = j2;
                                f530Var3 = f530Var;
                                f4 = f2;
                                wlsVar3 = wlsVar;
                            }
                            btsVar2.u();
                            btsVar2.e0(1932811951);
                            btsVar2.e0(1932805986);
                            btsVar2.e0(1932794328);
                            List list2 = qkgVar.a;
                            Iterator it2 = list2.iterator();
                            while (true) {
                                boolean hasNext = it2.hasNext();
                                linkedHashMap = this.a;
                                if (!hasNext) {
                                    break;
                                }
                                g2q0 g2q0Var = (g2q0) it2.next();
                                btsVar2.e0(1932796236);
                                Iterator it3 = g2q0Var.a.iterator();
                                while (it3.hasNext()) {
                                    n351 n351Var = (n351) it3.next();
                                    Iterator it4 = it3;
                                    Object obj = linkedHashMap.get(n351Var.a);
                                    boolean e = btsVar2.e(this) | btsVar2.k(n351Var);
                                    int i10 = i3;
                                    Object Q2 = btsVar2.Q();
                                    if (e || Q2 == o430Var) {
                                        list = list2;
                                        Q2 = new dke(12, this, n351Var);
                                        btsVar2.o0(Q2);
                                    } else {
                                        list = list2;
                                    }
                                    zpn.a(obj, (tls) Q2, btsVar2);
                                    it3 = it4;
                                    list2 = list;
                                    i3 = i10;
                                }
                                btsVar2.t(false);
                            }
                            int i11 = i3;
                            btsVar2.t(false);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it5 = list2.iterator();
                            while (it5.hasNext()) {
                                Object next = it5.next();
                                btsVar2.e0(1932808513);
                                List list3 = ((g2q0) next).a;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it6 = list3.iterator();
                                while (it6.hasNext()) {
                                    Iterator it7 = it5;
                                    n351 n351Var2 = (n351) it6.next();
                                    Iterator it8 = it6;
                                    if (((a151) linkedHashMap.get(n351Var2.a)) == null) {
                                        btsVar2.e0(-497683836);
                                        btsVar2.t(false);
                                        valueOf2 = null;
                                    } else {
                                        btsVar2.e0(-1817169635);
                                        btsVar2.e0(635009961);
                                        boolean z10 = n351Var2.b;
                                        btsVar2.t(false);
                                        btsVar2.t(false);
                                        valueOf2 = Boolean.valueOf(z10);
                                    }
                                    if (valueOf2 != null) {
                                        arrayList3.add(valueOf2);
                                    }
                                    it5 = it7;
                                    it6 = it8;
                                }
                                Iterator it9 = it5;
                                btsVar2.t(false);
                                if (!arrayList3.isEmpty()) {
                                    Iterator it10 = arrayList3.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            break;
                                        } else if (((Boolean) it10.next()).booleanValue()) {
                                            arrayList2.add(next);
                                            break;
                                        }
                                    }
                                }
                                it5 = it9;
                            }
                            btsVar2.t(false);
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it11 = arrayList2.iterator();
                            while (it11.hasNext()) {
                                Object next2 = it11.next();
                                btsVar2.e0(1932813859);
                                List list4 = ((g2q0) next2).a;
                                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                    Iterator it12 = list4.iterator();
                                    while (it12.hasNext()) {
                                        a151 a151Var = (a151) linkedHashMap.get(((n351) it12.next()).a);
                                        if (a151Var == null) {
                                            btsVar2.e0(1013120275);
                                            btsVar2.t(false);
                                            it = it11;
                                            valueOf = null;
                                        } else {
                                            it = it11;
                                            btsVar2.e0(-1214244690);
                                            boolean b = a151Var.b(btsVar2);
                                            btsVar2.t(false);
                                            valueOf = Boolean.valueOf(b);
                                        }
                                        if (jl40.l(valueOf, Boolean.TRUE)) {
                                            z9 = true;
                                            break;
                                        }
                                        it11 = it;
                                    }
                                }
                                it = it11;
                                z9 = false;
                                btsVar2.t(false);
                                if (z9) {
                                    arrayList4.add(next2);
                                }
                                it11 = it;
                            }
                            btsVar2.t(false);
                            boolean e2 = btsVar2.e(arrayList4) | btsVar2.e(this) | ((i11 & 3670016) == 1048576) | ((i11 & 14) == 4);
                            Object Q3 = btsVar2.Q();
                            if (e2 || Q3 == o430Var) {
                                Q3 = new lc0(arrayList4, wlsVar3, qkgVar, this, 12);
                                arrayList = arrayList4;
                                btsVar2.o0(Q3);
                            } else {
                                arrayList = arrayList4;
                            }
                            btsVar = btsVar2;
                            b2q0.b(f530Var3, f4, j4, z8, z7, arrayList, (tls) Q3, btsVar, (i11 >> 3) & 65534, 0);
                            wlsVar2 = wlsVar3;
                            f530Var2 = f530Var3;
                            f3 = f4;
                            j3 = j4;
                            z5 = z8;
                            z6 = z7;
                        } else {
                            btsVar = btsVar2;
                            btsVar.Y();
                            f530Var2 = f530Var;
                            wlsVar2 = wlsVar;
                            f3 = f2;
                            j3 = j2;
                            z5 = z3;
                            z6 = z4;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: rgg
                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    tgg.this.a(qkgVar, f530Var2, f3, j3, z5, z6, wlsVar2, (fid) obj2, vng.O(i | 1), i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z4 = z2;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if (btsVar2.V(i3 & 1, (i3 & 4793491) != 4793490)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z3 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z4 = z2;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (btsVar2.V(i3 & 1, (i3 & 4793491) != 4793490)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            f2 = f;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z4 = z2;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (btsVar2.V(i3 & 1, (i3 & 4793491) != 4793490)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z4 = z2;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (btsVar2.V(i3 & 1, (i3 & 4793491) != 4793490)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public final void b(g2q0 g2q0Var, fid fidVar, int i) {
        tgg tggVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1905372878);
        int i2 = (btsVar.k(g2q0Var) ? 4 : 2) | i | (btsVar.e(this) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
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
            List list = g2q0Var.a;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new suf(5);
                btsVar.o0(Q);
            }
            tggVar = this;
            tggVar.c(list, (tls) Q, btsVar, (i2 << 3) & 896, 0);
            btsVar.t(true);
        } else {
            tggVar = this;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sgg(tggVar, g2q0Var, i);
        }
    }

    public final void c(List list, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        tls tlsVar2;
        tls tlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-278998009);
        int i4 = 4;
        if ((i & 6) == 0) {
            i3 = (btsVar.e(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(this) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new suf(i4);
                    btsVar.o0(Q);
                }
                tlsVar3 = (tls) Q;
            } else {
                tlsVar3 = tlsVar;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d((n351) it.next(), tlsVar3, btsVar, i3 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, 0);
            }
            tlsVar2 = tlsVar3;
        } else {
            btsVar.Y();
            tlsVar2 = tlsVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(this, list, tlsVar2, i, i2, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(n351 n351Var, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        tls tlsVar2;
        tls tlsVar3;
        aii0 v;
        Boolean valueOf;
        String str = n351Var.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-494850809);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            tlsVar2 = tlsVar;
            i3 |= btsVar.e(tlsVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.e(this) ? 256 : 128;
            }
            if (btsVar.V(i3 & 1, (i3 & 147) == 146)) {
                btsVar.Y();
                tlsVar3 = tlsVar2;
            } else {
                if (i4 != 0) {
                    Object Q = btsVar.Q();
                    if (Q == did.a) {
                        Q = new suf(3);
                        btsVar.o0(Q);
                    }
                    tlsVar3 = (tls) Q;
                } else {
                    tlsVar3 = tlsVar2;
                }
                LinkedHashMap linkedHashMap = this.a;
                if (((a151) linkedHashMap.get(str)) == null) {
                    btsVar.e0(-1772575478);
                    btsVar.t(false);
                    valueOf = null;
                } else {
                    btsVar.e0(1189746135);
                    btsVar.e0(635009961);
                    boolean z = n351Var.b;
                    btsVar.t(false);
                    btsVar.t(false);
                    valueOf = Boolean.valueOf(z);
                }
                if (jl40.l(valueOf, Boolean.TRUE)) {
                    btsVar.e0(-1772545562);
                    f530 f530Var = n351Var.b() ? (f530) tlsVar3.invoke(Float.valueOf(1.0f)) : c530.a;
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, f530Var);
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
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    a151 a151Var = (a151) linkedHashMap.get(str);
                    if (a151Var == null) {
                        btsVar.e0(94328301);
                    } else {
                        btsVar.e0(-412599148);
                        a151Var.a(n351Var, btsVar, i3 & 14);
                    }
                    btsVar.t(false);
                    btsVar.t(true);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1772402373);
                    btsVar.t(false);
                }
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new v4(this, n351Var, tlsVar3, i, i2, 9);
                return;
            }
            return;
        }
        tlsVar2 = tlsVar;
        if ((i & 384) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 147) == 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
