package defpackage;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wx20 {
    public static final twt0 a = sb2.G(0.5f, 200.0f, 4, null);

    /* JADX WARN: Removed duplicated region for block: B:133:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, rz20 rz20Var, gz20 gz20Var, v2o v2oVar, ymo ymoVar, boolean z, boolean z2, a aVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        gz20 gz20Var2;
        v2o v2oVar2;
        int i4;
        ymo ymoVar2;
        int i5;
        boolean z3;
        rz20 rz20Var2;
        f530 f530Var3;
        gz20 gz20Var3;
        bts btsVar;
        ymo ymoVar3;
        boolean z4;
        boolean z5;
        v2o v2oVar3;
        aii0 v;
        int i6;
        rz20 rz20Var3;
        v2o v2oVar4;
        ymo ymoVar4;
        f530 f530Var4;
        boolean z6;
        gz20 gz20Var4;
        boolean z7;
        boolean z8;
        f530 f530Var5;
        boolean z9;
        v2o v2oVar5;
        ymo ymoVar5;
        boolean z10;
        Object c;
        String e;
        boolean z11;
        Object obj;
        tls tlsVar;
        int i7;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(323585757);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        }
        int i9 = i3 | 16;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                gz20Var2 = gz20Var;
                if (btsVar2.k(gz20Var2)) {
                    i7 = 256;
                    i9 |= i7;
                }
            } else {
                gz20Var2 = gz20Var;
            }
            i7 = 128;
            i9 |= i7;
        } else {
            gz20Var2 = gz20Var;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i4 = i9 | HProv.ALG_TYPE_SECURECHANNEL;
            v2oVar2 = v2oVar;
        } else {
            v2oVar2 = v2oVar;
            i4 = i9 | (btsVar2.k(v2oVar2) ? 2048 : 1024);
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i5 = i4 | HProv.ALG_CLASS_DATA_ENCRYPT;
            ymoVar2 = ymoVar;
        } else {
            ymoVar2 = ymoVar;
            i5 = i4 | (btsVar2.k(ymoVar2) ? 16384 : 8192);
        }
        int i12 = 196608 | i5;
        int i13 = i2 & 64;
        if (i13 != 0) {
            i12 = 1769472 | i5;
        } else if ((i & 1572864) == 0) {
            z3 = z2;
            i12 |= btsVar2.a(z3) ? 1048576 : 524288;
            if (btsVar2.V(i12 & 1, (i12 & 4793491) == 4793490)) {
                btsVar2.Y();
                rz20Var2 = rz20Var;
                f530Var3 = f530Var2;
                gz20Var3 = gz20Var2;
                btsVar = btsVar2;
                ymoVar3 = ymoVar2;
                z4 = z;
                z5 = z3;
                v2oVar3 = v2oVar2;
            } else {
                btsVar2.a0();
                int i14 = i & 1;
                o430 o430Var = did.a;
                if (i14 == 0 || btsVar2.C()) {
                    f530 f530Var6 = i8 != 0 ? c530.a : f530Var2;
                    rz20 a2 = com.yandex.go.design.compose.modal.utils.a.a(false, null, btsVar2, 0, 7);
                    i6 = i12 & (-113);
                    if ((i2 & 4) != 0) {
                        i6 = i12 & (-1009);
                        gz20Var2 = tnb1.e(null, null, btsVar2, 7);
                    }
                    if (i10 != 0) {
                        w2o e2 = k.e(sb2.K(200, 0, null, 6), 2);
                        ck11 K = sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6);
                        Object Q = btsVar2.Q();
                        Object obj2 = Q;
                        if (Q == o430Var) {
                            ps20 ps20Var = new ps20(16);
                            btsVar2.o0(ps20Var);
                            obj2 = ps20Var;
                        }
                        v2oVar2 = e2.a(k.p(K, (tls) obj2)).a(k.g(a, 0.8f, 4));
                    }
                    if (i11 != 0) {
                        zmo f = k.f(sb2.K(200, 0, null, 6), 2);
                        ck11 K2 = sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6);
                        Object Q2 = btsVar2.Q();
                        Object obj3 = Q2;
                        if (Q2 == o430Var) {
                            ps20 ps20Var2 = new ps20(16);
                            btsVar2.o0(ps20Var2);
                            obj3 = ps20Var2;
                        }
                        ymoVar2 = f.a(k.u(K2, (tls) obj3)).a(k.h(sb2.K(200, 0, null, 6), 0.8f, 4));
                    }
                    rz20Var3 = a2;
                    v2oVar4 = v2oVar2;
                    ymoVar4 = ymoVar2;
                    if (i13 != 0) {
                        z7 = true;
                        f530Var4 = f530Var6;
                        gz20Var4 = gz20Var2;
                        z6 = true;
                    } else {
                        f530Var4 = f530Var6;
                        z6 = z3;
                        gz20Var4 = gz20Var2;
                        z7 = true;
                    }
                } else {
                    btsVar2.Y();
                    int i15 = i12 & (-113);
                    if ((i2 & 4) != 0) {
                        i15 = i12 & (-1009);
                    }
                    rz20Var3 = rz20Var;
                    i6 = i15;
                    z6 = z3;
                    v2oVar4 = v2oVar2;
                    z7 = z;
                    f530Var4 = f530Var2;
                    ymoVar4 = ymoVar2;
                    gz20Var4 = gz20Var2;
                }
                btsVar2.u();
                zx01 O = bvf0.O(rz20Var3.a, "Modal View Appear Animation", btsVar2, 48, 0);
                if (gz20Var4 instanceof cz20) {
                    btsVar2.e0(2037539372);
                    cz20 cz20Var = (cz20) gz20Var4;
                    int i16 = i6 >> 3;
                    long n = tje.n(cz20Var.a, btsVar2);
                    nhs nhsVar = nhs.a;
                    gl11 gl11Var = gtq0.f;
                    if (O.g()) {
                        z9 = z6;
                        v2oVar5 = v2oVar4;
                        ymoVar5 = ymoVar4;
                        z10 = z7;
                        btsVar2.e0(1666827533);
                        btsVar2.t(false);
                        c = O.c();
                    } else {
                        z9 = z6;
                        btsVar2.e0(1666573488);
                        boolean k = btsVar2.k(O);
                        c = btsVar2.Q();
                        if (k || c == o430Var) {
                            v2o v2oVar6 = v2oVar4;
                            i2t0 D = tje.D();
                            if (D != null) {
                                ymoVar5 = ymoVar4;
                                tlsVar = D.e();
                            } else {
                                ymoVar5 = ymoVar4;
                                tlsVar = null;
                            }
                            z10 = z7;
                            i2t0 O2 = tje.O(D);
                            v2oVar5 = v2oVar6;
                            try {
                                c = O.c();
                                tje.W(D, O2, tlsVar);
                                btsVar2.o0(c);
                            } catch (Throwable th) {
                                tje.W(D, O2, tlsVar);
                                throw th;
                            }
                        } else {
                            v2oVar5 = v2oVar4;
                            ymoVar5 = ymoVar4;
                            z10 = z7;
                        }
                        btsVar2.t(false);
                    }
                    boolean booleanValue = ((Boolean) c).booleanValue();
                    btsVar2.e0(1753794890);
                    float f2 = booleanValue ? 1.0f : 0.0f;
                    btsVar2.t(false);
                    Float valueOf = Float.valueOf(f2);
                    boolean k2 = btsVar2.k(O);
                    Object Q3 = btsVar2.Q();
                    Object obj4 = Q3;
                    if (k2 || Q3 == o430Var) {
                        qxi d = f.d(new fw0(O, 4));
                        btsVar2.o0(d);
                        obj4 = d;
                    }
                    boolean booleanValue2 = ((Boolean) ((m3u0) obj4).getValue()).booleanValue();
                    btsVar2.e0(1753794890);
                    float f3 = booleanValue2 ? 1.0f : 0.0f;
                    btsVar2.t(false);
                    Float valueOf2 = Float.valueOf(f3);
                    boolean k3 = btsVar2.k(O);
                    Object Q4 = btsVar2.Q();
                    Object obj5 = Q4;
                    if (k3 || Q4 == o430Var) {
                        qxi d2 = f.d(new fw0(O, 5));
                        btsVar2.o0(d2);
                        obj5 = d2;
                    }
                    tx01 s = bvf0.s(O, valueOf, valueOf2, (qar) nhsVar.invoke(((m3u0) obj5).getValue(), btsVar2, 0), gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                    Integer num = cz20Var.d;
                    if (num == null) {
                        btsVar2.e0(252750009);
                        btsVar2.t(false);
                        e = null;
                    } else {
                        btsVar2.e0(252750010);
                        e = ohb1.e(btsVar2, num.intValue());
                        btsVar2.t(false);
                    }
                    k3r k3rVar = ljs0.c;
                    boolean d3 = btsVar2.d(n) | btsVar2.k(s);
                    Object Q5 = btsVar2.Q();
                    if (d3 || Q5 == o430Var) {
                        z11 = false;
                        mhs mhsVar = new mhs(n, s, false ? 1 : 0);
                        btsVar2.o0(mhsVar);
                        obj = mhsVar;
                    } else {
                        z11 = false;
                        obj = Q5;
                    }
                    f530 c2 = i470.c(bb1.g(k3rVar, (tls) obj), cz20Var.b, e);
                    z910 d4 = pi6.d(x4c.b, z11);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d5 = b.d(btsVar2, c2);
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
                    qje.W(btsVar2, d.f, d4);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d5);
                    v2oVar4 = v2oVar5;
                    boolean z12 = z11;
                    z8 = z9;
                    ymoVar4 = ymoVar5;
                    z7 = z10;
                    b(an91.k(cj6.a.a(cz20Var.c ? i9a1.c(i9a1.g(f530Var4)) : f530Var4, x4c.y), 24.0f), O, v2oVar4, ymoVar4, z7, z8, aVar, btsVar2, i16 & 4194176);
                    btsVar2.t(true);
                    btsVar2.t(z12);
                    f530Var5 = f530Var4;
                } else {
                    z8 = z6;
                    if (!jl40.l(gz20Var4, dz20.a)) {
                        throw unr0.y(1728293948, btsVar2, false);
                    }
                    btsVar2.e0(2038119754);
                    int i17 = i6 >> 3;
                    f530Var5 = f530Var4;
                    b(f530Var5, O, v2oVar4, ymoVar4, z7, z8, aVar, btsVar2, (i6 & 14) | (i17 & 896) | (i17 & 7168) | HProv.ALG_CLASS_DATA_ENCRYPT | (i17 & ImageMetadata.JPEG_GPS_COORDINATES) | 1572864);
                    btsVar2.t(false);
                }
                f530Var3 = f530Var5;
                z4 = z7;
                btsVar = btsVar2;
                v2oVar3 = v2oVar4;
                z5 = z8;
                rz20Var2 = rz20Var3;
                ymoVar3 = ymoVar4;
                gz20Var3 = gz20Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new ux20(f530Var3, rz20Var2, gz20Var3, v2oVar3, ymoVar3, z4, z5, aVar, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        if (btsVar2.V(i12 & 1, (i12 & 4793491) == 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(f530 f530Var, zx01 zx01Var, v2o v2oVar, ymo ymoVar, boolean z, boolean z2, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2138574064);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(zx01Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(v2oVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(ymoVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.a(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(aVar) ? 1048576 : 524288;
        }
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            ((nx2) btsVar.m(uy2.c)).getClass();
            byk0 c = cyk0.c(24.0f);
            f530 f530Var2 = c530.a;
            if (z) {
                f530Var2 = ymb1.l(f530Var2, c);
            }
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new qu(13);
                btsVar.o0(Q);
            }
            a S = wwg.S(1475292857, true, new xp5(z2, c, f530Var2, aVar), btsVar);
            int i3 = ((i2 >> 3) & 14) | 196656 | ((i2 << 6) & 896);
            int i4 = i2 << 3;
            g.d(zx01Var, (tls) Q, f530Var, v2oVar, ymoVar, S, btsVar, i3 | (i4 & 7168) | (i4 & HProv.ALG_CLASS_ALL), 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vx20(f530Var, zx01Var, v2oVar, ymoVar, z, z2, aVar, i);
        }
    }
}
