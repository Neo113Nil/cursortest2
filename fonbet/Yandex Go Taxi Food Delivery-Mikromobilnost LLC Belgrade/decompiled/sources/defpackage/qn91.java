package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yx360.design.compose.atoms.DsAlert$ButtonsOrientation;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class qn91 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sls slsVar, String str, vnm vnmVar, f530 f530Var, DsAlert$ButtonsOrientation dsAlert$ButtonsOrientation, String str2, vnm vnmVar2, fid fidVar, int i, int i2) {
        int i3;
        String str3;
        int i4;
        boolean z;
        Object Q;
        a S;
        bts btsVar;
        DsAlert$ButtonsOrientation dsAlert$ButtonsOrientation2;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(502054021);
        if ((i & 6) == 0) {
            i3 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.k(vnmVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        int i5 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        int i6 = i2 & 32;
        if (i6 != 0) {
            i5 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            str3 = str2;
            i5 |= btsVar2.k(str3) ? 131072 : 65536;
            if ((1572864 & i) == 0) {
                i5 |= btsVar2.k(vnmVar2) ? 1048576 : 524288;
            }
            i4 = i5 | 12582912;
            if ((4793491 & i4) == 4793490 || !btsVar2.E()) {
                DsAlert$ButtonsOrientation dsAlert$ButtonsOrientation3 = DsAlert$ButtonsOrientation.Horizontal;
                if (i6 != 0) {
                    str3 = null;
                }
                a S2 = wwg.S(1512880845, true, new w4f(1, dsAlert$ButtonsOrientation3, vnmVar, vnmVar2), btsVar2);
                f530 q = ljs0.q(f530Var, 560.0f);
                btsVar2.e0(-1633490746);
                boolean z2 = false;
                Object[] objArr = 0;
                z = ((i4 & 112) != 32) | ((458752 & i4) != 131072);
                Q = btsVar2.Q();
                if (!z || Q == did.a) {
                    Q = new r(str, str3, 12);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                int i7 = 1;
                f530 b = fnq0.b(q, true, (tls) Q);
                a S3 = wwg.S(416211665, true, new ynm(str, objArr == true ? 1 : 0), btsVar2);
                btsVar2.e0(1437625046);
                if (str3 != null) {
                    S = null;
                } else {
                    S = wwg.S(-2013352057, true, new ynm(str3, i7), btsVar2);
                    z2 = false;
                }
                btsVar2.t(z2);
                qnm qnmVar = qnm.a;
                btsVar = btsVar2;
                nta1.a(slsVar, S2, b, S3, S, null, qnm.c(btsVar2).a(), 0L, 0L, 0L, null, btsVar, (i4 & 14) | 221232);
                dsAlert$ButtonsOrientation2 = dsAlert$ButtonsOrientation3;
            } else {
                btsVar2.Y();
                dsAlert$ButtonsOrientation2 = dsAlert$ButtonsOrientation;
                btsVar = btsVar2;
            }
            String str4 = str3;
            v = btsVar.v();
            if (v == null) {
                v.d = new bh6(slsVar, str, vnmVar, f530Var, dsAlert$ButtonsOrientation2, str4, vnmVar2, i, i2);
                return;
            }
            return;
        }
        str3 = str2;
        if ((1572864 & i) == 0) {
        }
        i4 = i5 | 12582912;
        if ((4793491 & i4) == 4793490) {
        }
        DsAlert$ButtonsOrientation dsAlert$ButtonsOrientation32 = DsAlert$ButtonsOrientation.Horizontal;
        if (i6 != 0) {
        }
        a S22 = wwg.S(1512880845, true, new w4f(1, dsAlert$ButtonsOrientation32, vnmVar, vnmVar2), btsVar2);
        f530 q2 = ljs0.q(f530Var, 560.0f);
        btsVar2.e0(-1633490746);
        boolean z22 = false;
        Object[] objArr2 = 0;
        z = ((i4 & 112) != 32) | ((458752 & i4) != 131072);
        Q = btsVar2.Q();
        if (!z) {
        }
        Q = new r(str, str3, 12);
        btsVar2.o0(Q);
        btsVar2.t(false);
        int i72 = 1;
        f530 b2 = fnq0.b(q2, true, (tls) Q);
        a S32 = wwg.S(416211665, true, new ynm(str, objArr2 == true ? 1 : 0), btsVar2);
        btsVar2.e0(1437625046);
        if (str3 != null) {
        }
        btsVar2.t(z22);
        qnm qnmVar2 = qnm.a;
        btsVar = btsVar2;
        nta1.a(slsVar, S22, b2, S32, S, null, qnm.c(btsVar2).a(), 0L, 0L, 0L, null, btsVar, (i4 & 14) | 221232);
        dsAlert$ButtonsOrientation2 = dsAlert$ButtonsOrientation32;
        String str42 = str3;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(int i, int i2, fid fidVar, f530 f530Var) {
        f530 f530Var2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1274787050);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i | (btsVar.k(f530Var2) ? 4 : 2);
        }
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            f530 f530Var3 = i4 != 0 ? c530.a : f530Var2;
            f530 m = ljs0.m(an91.k(f530Var3, 4.0f), 16.0f);
            a7u0 a7u0Var = gl51.a;
            f530 b = m4m0.b(m, ((el51) btsVar.m(a7u0Var)).j(), uvb0.b);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
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
            ymb1.f("1", null, ((el51) btsVar.m(a7u0Var)).m(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 6, 0, 65530);
            btsVar = btsVar;
            btsVar.t(true);
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var2, i, i2, 14);
        }
    }

    public static final void c(vnm vnmVar, vnm vnmVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1920342932);
        if ((((btsVar.k(vnmVar) ? 4 : 2) | i | (btsVar.k(vnmVar2) ? 32 : 16)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            xab1.a(null, null, wwg.S(73494654, true, new z9b(1, vnmVar, vnmVar2), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wnm(vnmVar, vnmVar2, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0138, code lost:
    
        if (defpackage.jl40.l(r0.Q(), java.lang.Integer.valueOf(r6)) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final f530 f530Var, jt1 jt1Var, long j, float f, dxb0 dxb0Var, boolean z, wls wlsVar, zls zlsVar, fid fidVar, final int i, final int i2) {
        float f2;
        int i3;
        dxb0 dxb0Var2;
        int i4;
        final boolean z2;
        int i5;
        wls wlsVar2;
        final zls zlsVar2;
        final jt1 jt1Var2;
        final float f3;
        final dxb0 dxb0Var3;
        final long j2;
        aii0 v;
        jt1 jt1Var3;
        int i6;
        int i7;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1884921996);
        dmw0 dmw0Var = btsVar.a;
        int i8 = (btsVar.k(f530Var) ? 4 : 2) | i;
        int i9 = i8 | 176;
        int i10 = i2 & 8;
        if (i10 != 0) {
            i9 = i8 | 3248;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f2 = f;
            i9 |= btsVar.b(f2) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i9 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                dxb0Var2 = dxb0Var;
                i9 |= btsVar.k(dxb0Var2) ? 16384 : 8192;
                i4 = i2 & 32;
                if (i4 != 0) {
                    i9 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i9 |= btsVar.a(z2) ? 131072 : 65536;
                    i5 = i2 & 64;
                    if (i5 == 0) {
                        i9 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        wlsVar2 = wlsVar;
                        i9 |= btsVar.e(wlsVar2) ? 1048576 : 524288;
                        if (btsVar.V(i9 & 1, (4793491 & i9) != 4793490)) {
                            btsVar.a0();
                            if ((i & 1) == 0 || btsVar.C()) {
                                jt1Var3 = x4c.y;
                                long c = ((el51) btsVar.m(gl51.a)).c();
                                int i11 = i9 & (-897);
                                if (i10 != 0) {
                                    f2 = 2.0f;
                                }
                                dxb0 dxb0Var4 = i3 != 0 ? kv60.b : dxb0Var2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if (i5 != 0) {
                                    kad.a.getClass();
                                    dxb0Var2 = dxb0Var4;
                                    wlsVar2 = kad.b;
                                    f3 = f2;
                                    i6 = i11;
                                } else {
                                    i6 = i11;
                                    dxb0Var2 = dxb0Var4;
                                    f3 = f2;
                                }
                                j2 = c;
                            } else {
                                btsVar.Y();
                                jt1Var3 = jt1Var;
                                f3 = f2;
                                i6 = i9 & (-897);
                                j2 = j;
                            }
                            btsVar.u();
                            z910 b = dxb0Var2.b(f3);
                            int i12 = i6;
                            int hashCode = Long.hashCode(btsVar.T);
                            r1b0 o = btsVar.o();
                            f530 d = b.d(btsVar, c530.a);
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            if (dmw0Var == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar.i0();
                            dxb0 dxb0Var5 = dxb0Var2;
                            if (btsVar.S) {
                                btsVar.n(slsVar);
                            } else {
                                btsVar.r0();
                            }
                            wls wlsVar3 = d.f;
                            qje.W(btsVar, wlsVar3, b);
                            wls wlsVar4 = d.e;
                            qje.W(btsVar, wlsVar4, o);
                            wls wlsVar5 = d.g;
                            if (btsVar.S) {
                                i7 = i12;
                            } else {
                                i7 = i12;
                            }
                            b64.z(hashCode, btsVar, hashCode, wlsVar5);
                            wls wlsVar6 = d.d;
                            qje.W(btsVar, wlsVar6, d);
                            k3r k3rVar = ljs0.c;
                            int i13 = i7;
                            int i14 = i13 & 7168;
                            boolean z3 = i14 == 2048;
                            int i15 = i13 & ImageMetadata.JPEG_GPS_COORDINATES;
                            boolean z4 = z3 | (i15 == 131072);
                            Object Q = btsVar.Q();
                            wls wlsVar7 = wlsVar2;
                            o430 o430Var = did.a;
                            if (z4 || Q == o430Var) {
                                Q = new xwb0(f3, z2);
                                btsVar.o0(Q);
                            }
                            f530 c2 = ibb1.c(k3rVar, 4.0f, new uys((zls) Q), 0L, 0L, 24);
                            boolean d2 = (i14 == 2048) | (i15 == 131072) | btsVar.d(j2);
                            Object Q2 = btsVar.Q();
                            if (d2 || Q2 == o430Var) {
                                Q2 = new tls() { // from class: ywb0
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        qam qamVar = (qam) obj;
                                        jb2 jb2Var = gyb0.a;
                                        qam.Y(qamVar, gyb0.a(Float.intBitsToFloat((int) (qamVar.c() >> 32)), Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), f3, z2), j2, null, 60);
                                        return zy11.a;
                                    }
                                };
                                btsVar.o0(Q2);
                            }
                            qeb1.a(0, btsVar, (tls) Q2, c2);
                            z910 d3 = pi6.d(jt1Var3, false);
                            int hashCode2 = Long.hashCode(btsVar.T);
                            r1b0 o2 = btsVar.o();
                            f530 d4 = b.d(btsVar, f530Var);
                            btsVar.i0();
                            if (btsVar.S) {
                                btsVar.n(slsVar);
                            } else {
                                btsVar.r0();
                            }
                            qje.W(btsVar, wlsVar3, d3);
                            qje.W(btsVar, wlsVar4, o2);
                            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                                b64.z(hashCode2, btsVar, hashCode2, wlsVar5);
                            }
                            qje.W(btsVar, wlsVar6, d4);
                            zlsVar2 = zlsVar;
                            ly3.x(54, zlsVar2, cj6.a, btsVar, true);
                            wlsVar2 = wlsVar7;
                            xvz.u((i13 >> 18) & 14, wlsVar2, btsVar, true);
                            jt1Var2 = jt1Var3;
                            dxb0Var3 = dxb0Var5;
                        } else {
                            zlsVar2 = zlsVar;
                            btsVar.Y();
                            jt1Var2 = jt1Var;
                            f3 = f2;
                            dxb0Var3 = dxb0Var2;
                            j2 = j;
                        }
                        final boolean z5 = z2;
                        final wls wlsVar8 = wlsVar2;
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: zwb0
                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    qn91.d(f530.this, jt1Var2, j2, f3, dxb0Var3, z5, wlsVar8, zlsVar2, (fid) obj, vng.O(i | 1), i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    wlsVar2 = wlsVar;
                    if (btsVar.V(i9 & 1, (4793491 & i9) != 4793490)) {
                    }
                    final boolean z52 = z2;
                    final wls wlsVar82 = wlsVar2;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z2 = z;
                i5 = i2 & 64;
                if (i5 == 0) {
                }
                wlsVar2 = wlsVar;
                if (btsVar.V(i9 & 1, (4793491 & i9) != 4793490)) {
                }
                final boolean z522 = z2;
                final wls wlsVar822 = wlsVar2;
                v = btsVar.v();
                if (v != null) {
                }
            }
            dxb0Var2 = dxb0Var;
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            z2 = z;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            wlsVar2 = wlsVar;
            if (btsVar.V(i9 & 1, (4793491 & i9) != 4793490)) {
            }
            final boolean z5222 = z2;
            final wls wlsVar8222 = wlsVar2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f2 = f;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        dxb0Var2 = dxb0Var;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z2 = z;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        wlsVar2 = wlsVar;
        if (btsVar.V(i9 & 1, (4793491 & i9) != 4793490)) {
        }
        final boolean z52222 = z2;
        final wls wlsVar82222 = wlsVar2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void e(final float f, final int i, long j, fid fidVar) {
        final long j2;
        long j3;
        float f2;
        int i2;
        float f3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2054467094);
        int i3 = i | 22;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if (cma1.f0(btsVar)) {
                    j3 = dl51.P;
                    f2 = 0.0f;
                    i2 = 14;
                    f3 = 0.5f;
                } else {
                    j3 = dl51.P;
                    f2 = 0.0f;
                    i2 = 14;
                    f3 = 0.75f;
                }
                j2 = ldc.b(j3, f3, 0.0f, 0.0f, f2, i2);
                f = 9.0f;
            } else {
                btsVar.Y();
                j2 = j;
            }
            btsVar.u();
            float f4 = f / 5.0f;
            f530 m = ljs0.m(c530.a, f);
            byk0 byk0Var = cyk0.a;
            f530 b = m4m0.b(m, j2, byk0Var);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
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
            oeb1.c(btsVar, m4m0.b(an91.k(ljs0.c, f4), ldc.f, byk0Var));
            btsVar.t(true);
        } else {
            btsVar.Y();
            j2 = j;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f, j2, i) { // from class: axb0
                public final /* synthetic */ float a;
                public final /* synthetic */ long b;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    qn91.e(this.a, O, this.b, (fid) obj);
                    return zy11.a;
                }
            };
        }
    }

    public static final void f(vnm vnmVar, vnm vnmVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(557558814);
        int i2 = 1;
        if ((((btsVar.k(vnmVar) ? 4 : 2) | i | (btsVar.k(vnmVar2) ? 32 : 16) | (btsVar.k(null) ? 256 : 128)) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            sic a = qic.a(lr20.c, x4c.I, btsVar, 48);
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
            po91.c(vnmVar.a, vnmVar.c, vnmVar.b, null, false, null, false, btsVar, 0, 0, 4088);
            btsVar.e0(-1996790670);
            if (vnmVar2 != null) {
                po91.c(vnmVar2.a, vnmVar2.c, vnmVar2.b, null, false, null, false, btsVar, 0, 0, 4088);
            }
            btsVar.t(false);
            btsVar.e0(-1996783282);
            btsVar.t(false);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wnm(vnmVar, vnmVar2, i, i2);
        }
    }

    public static dwc0 g() {
        return dwc0.a;
    }

    public static boolean h(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }
}
