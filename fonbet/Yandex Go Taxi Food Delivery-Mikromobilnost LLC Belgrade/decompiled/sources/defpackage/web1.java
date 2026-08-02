package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class web1 {
    public static final void a(wls wlsVar, wls wlsVar2, wls wlsVar3, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        wls wlsVar4;
        boolean z;
        wls wlsVar5 = wlsVar2;
        wls wlsVar6 = wlsVar3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1015298771);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(wlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(wlsVar5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(wlsVar6) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar7 = d.f;
            qje.W(btsVar2, wlsVar7, d);
            wls wlsVar8 = d.e;
            qje.W(btsVar2, wlsVar8, o);
            wls wlsVar9 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar9);
            }
            wls wlsVar10 = d.d;
            qje.W(btsVar2, wlsVar10, d2);
            if (wlsVar == null || wlsVar5 == null || wlsVar6 == null) {
                int i3 = i2;
                if (wlsVar == null || wlsVar5 == null) {
                    if (wlsVar == null || wlsVar6 == null) {
                        if (wlsVar2 == null || wlsVar3 == null) {
                            wlsVar5 = wlsVar2;
                            btsVar = btsVar2;
                            wlsVar4 = wlsVar3;
                            btsVar.e0(-1841210138);
                            if (wlsVar == null) {
                                btsVar.e0(-1841188532);
                                btsVar.t(false);
                            } else {
                                btsVar.e0(-613582507);
                                xvz.u(i3 & 14, wlsVar, btsVar, false);
                            }
                            if (wlsVar5 == null) {
                                btsVar.e0(-1841156788);
                                btsVar.t(false);
                            } else {
                                btsVar.e0(-613581483);
                                xvz.u((i3 >> 3) & 14, wlsVar5, btsVar, false);
                            }
                            if (wlsVar4 == null) {
                                btsVar.e0(-1841125044);
                                btsVar.t(false);
                            } else {
                                btsVar.e0(-613580459);
                                xvz.u((i3 >> 6) & 14, wlsVar4, btsVar, false);
                            }
                            btsVar.t(false);
                        } else {
                            btsVar2.e0(-1841294024);
                            ik11.a(wlsVar2, wlsVar3, null, btsVar2, (i3 >> 3) & HProv.PP_DELETE_SAVED_PASSWD, 4);
                            wlsVar5 = wlsVar2;
                            btsVar = btsVar2;
                            wlsVar4 = wlsVar3;
                            btsVar.t(false);
                        }
                        z = true;
                    } else {
                        btsVar2.e0(-1841402152);
                        ik11.a(wlsVar, wlsVar6, null, btsVar2, (i3 & 14) | ((i3 >> 3) & 112), 4);
                        btsVar2.t(false);
                        wlsVar5 = wlsVar2;
                        btsVar = btsVar2;
                        z = true;
                        wlsVar4 = wlsVar3;
                    }
                    btsVar.t(z);
                } else {
                    btsVar2.e0(-1841510280);
                    ik11.a(wlsVar, wlsVar5, null, btsVar2, i3 & HProv.PP_DELETE_SAVED_PASSWD, 4);
                    btsVar2.t(false);
                    wlsVar5 = wlsVar2;
                }
            } else {
                btsVar2.e0(-1842453517);
                c530 c530Var = c530.a;
                f530 c = ljs0.c(c530Var, 1.0f);
                int i4 = i2;
                lhl0 a = khl0.a(lr20.g, x4c.D, btsVar2, 6);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o2 = btsVar2.o();
                f530 d3 = b.d(btsVar2, c);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar7, a);
                qje.W(btsVar2, wlsVar8, o2);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar2, hashCode2, wlsVar9);
                }
                qje.W(btsVar2, wlsVar10, d3);
                nhl0 nhl0Var = nhl0.a;
                f530 a2 = nhl0Var.a(c530Var, 1.0f, false);
                to5 to5Var = x4c.E;
                f530 b = nhl0Var.b(a2, to5Var);
                z910 d4 = pi6.d(uo5Var, false);
                int hashCode3 = Long.hashCode(btsVar2.T);
                r1b0 o3 = btsVar2.o();
                f530 d5 = b.d(btsVar2, b);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar7, d4);
                qje.W(btsVar2, wlsVar8, o3);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode3))) {
                    b64.z(hashCode3, btsVar2, hashCode3, wlsVar9);
                }
                qje.W(btsVar2, wlsVar10, d5);
                xvz.u(i4 & 14, wlsVar, btsVar2, true);
                oeb1.c(btsVar2, ljs0.q(c530Var, 12.0f));
                f530 b2 = nhl0Var.b(nhl0Var.a(c530Var, 1.0f, false), to5Var);
                z910 d6 = pi6.d(uo5Var, false);
                int hashCode4 = Long.hashCode(btsVar2.T);
                r1b0 o4 = btsVar2.o();
                f530 d7 = b.d(btsVar2, b2);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar7, d6);
                qje.W(btsVar2, wlsVar8, o4);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode4))) {
                    b64.z(hashCode4, btsVar2, hashCode4, wlsVar9);
                }
                qje.W(btsVar2, wlsVar10, d7);
                xvz.u((i4 >> 3) & 14, wlsVar5, btsVar2, true);
                oeb1.c(btsVar2, ljs0.q(c530Var, 12.0f));
                f530 b3 = nhl0Var.b(nhl0Var.a(c530Var, 1.0f, false), to5Var);
                z910 d8 = pi6.d(uo5Var, false);
                int hashCode5 = Long.hashCode(btsVar2.T);
                r1b0 o5 = btsVar2.o();
                f530 d9 = b.d(btsVar2, b3);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar7, d8);
                qje.W(btsVar2, wlsVar8, o5);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode5))) {
                    b64.z(hashCode5, btsVar2, hashCode5, wlsVar9);
                }
                qje.W(btsVar2, wlsVar10, d9);
                wlsVar6 = wlsVar3;
                qv10.A((i4 >> 6) & 14, wlsVar6, btsVar2, true, true);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            wlsVar4 = wlsVar6;
            z = true;
            btsVar.t(z);
        } else {
            btsVar = btsVar2;
            wlsVar4 = wlsVar6;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ((Object) wlsVar, (cms) wlsVar5, (Object) wlsVar4, f530Var, i, 5);
        }
    }

    public static final void b(boolean z, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1107127108);
        int i2 = (btsVar.a(z) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            if (wlsVar != null) {
                btsVar.e0(-1369682892);
                f530 m = ljs0.m(c530Var, ((y7m) btsVar.m(nsy.a)).a);
                z910 d = pi6.d(x4c.y, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d2 = b.d(btsVar, m);
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
                wls wlsVar2 = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar2);
                }
                qje.W(btsVar, d.d, d2);
                qv10.A((i2 >> 3) & 14, wlsVar, btsVar, true, false);
            } else if (z) {
                btsVar.e0(-1369478695);
                oeb1.c(btsVar, ljs0.q(c530Var, 16.0f));
                btsVar.t(false);
            } else {
                btsVar.e0(-1369435450);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new uge(z, wlsVar, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f530 f530Var, float f, boolean z, float f2, to5 to5Var, wls wlsVar, final wls wlsVar2, wls wlsVar3, wls wlsVar4, wls wlsVar5, wls wlsVar6, j690 j690Var, boolean z2, fid fidVar, final int i, final int i2, final int i3) {
        f530 f530Var2;
        int i4;
        float f3;
        int i5;
        int i6;
        int i7;
        to5 to5Var2;
        int i8;
        wls wlsVar7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        final boolean z3;
        final float f4;
        final wls wlsVar8;
        final wls wlsVar9;
        final j690 j690Var2;
        final boolean z4;
        final wls wlsVar10;
        final float f5;
        final wls wlsVar11;
        final wls wlsVar12;
        aii0 v;
        int i22;
        final f530 f530Var3;
        int i23;
        final to5 to5Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-561829974);
        int i24 = i3 & 1;
        if (i24 != 0) {
            i4 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i4 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i4 = i;
        }
        int i25 = i3 & 2;
        if (i25 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            f3 = f;
            i4 |= btsVar.b(f3) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= btsVar.a(z) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i4 |= btsVar.b(f2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        to5Var2 = to5Var;
                        i4 |= btsVar.k(to5Var2) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ImageMetadata.EDGE_MODE;
                            wlsVar7 = wlsVar;
                        } else {
                            wlsVar7 = wlsVar;
                            if ((i & ImageMetadata.EDGE_MODE) == 0) {
                                i4 |= btsVar.e(wlsVar7) ? 131072 : 65536;
                            }
                        }
                        if ((i & 1572864) == 0) {
                            i4 |= btsVar.e(wlsVar2) ? 1048576 : 524288;
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i10 = i24;
                            i4 |= btsVar.e(wlsVar3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                            i11 = i3 & 256;
                            if (i11 == 0) {
                                i4 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i12 = i11;
                                i4 |= btsVar.e(wlsVar4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                                i13 = i3 & 512;
                                if (i13 != 0) {
                                    i4 |= 805306368;
                                } else if ((i & 805306368) == 0) {
                                    i14 = i13;
                                    i4 |= btsVar.e(wlsVar5) ? 536870912 : SelfTester_JCP.IMITA;
                                    i15 = i3 & 1024;
                                    if (i15 == 0) {
                                        i17 = i2 | 6;
                                        i16 = i15;
                                    } else if ((i2 & 6) == 0) {
                                        i16 = i15;
                                        i17 = i2 | (btsVar.e(wlsVar6) ? 4 : 2);
                                    } else {
                                        i16 = i15;
                                        i17 = i2;
                                    }
                                    i18 = i3 & 2048;
                                    if (i18 == 0) {
                                        i17 |= 48;
                                        i19 = i18;
                                    } else if ((i2 & 48) == 0) {
                                        i19 = i18;
                                        i17 |= btsVar.k(j690Var) ? 32 : 16;
                                    } else {
                                        i19 = i18;
                                    }
                                    i20 = i17;
                                    i21 = i3 & 4096;
                                    if (i21 == 0) {
                                        i20 |= 384;
                                    } else if ((i2 & 384) == 0) {
                                        i20 |= btsVar.a(z2) ? 256 : 128;
                                        if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
                                            if (i10 != 0) {
                                                int i26 = i12;
                                                f530Var3 = c530.a;
                                                i22 = i26;
                                            } else {
                                                i22 = i12;
                                                f530Var3 = f530Var2;
                                            }
                                            f5 = i25 != 0 ? 56.0f : f3;
                                            final boolean z5 = i5 != 0 ? true : z;
                                            final float f6 = i6 != 0 ? 12.0f : f2;
                                            if (i7 != 0) {
                                                int i27 = i14;
                                                to5Var3 = x4c.E;
                                                i23 = i27;
                                            } else {
                                                i23 = i14;
                                                to5Var3 = to5Var2;
                                            }
                                            int i28 = i19;
                                            final wls wlsVar13 = i8 != 0 ? null : wlsVar7;
                                            wlsVar8 = i9 != 0 ? null : wlsVar3;
                                            final wls wlsVar14 = i22 != 0 ? null : wlsVar4;
                                            final wls wlsVar15 = i23 != 0 ? null : wlsVar5;
                                            final wls wlsVar16 = i16 != 0 ? null : wlsVar6;
                                            final j690 j690Var3 = i28 != 0 ? oa01.c : j690Var;
                                            final boolean z6 = i21 != 0 ? true : z2;
                                            sb2.b(nsy.a.a(new y7m(f5)), wwg.S(1351429226, true, new wls() { // from class: csy
                                                @Override // defpackage.wls
                                                public final Object invoke(Object obj, Object obj2) {
                                                    f530 b;
                                                    fid fidVar2 = (fid) obj;
                                                    int intValue = ((Integer) obj2).intValue();
                                                    bts btsVar2 = (bts) fidVar2;
                                                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                                        boolean z7 = z5;
                                                        f530 f530Var4 = f530Var3;
                                                        if (z7) {
                                                            btsVar2.e0(-595311274);
                                                            b = ljs0.e(f530Var4, ((y7m) btsVar2.m(nsy.a)).a);
                                                            btsVar2.t(false);
                                                        } else {
                                                            btsVar2.e0(-595237556);
                                                            b = ljs0.b(ljs0.u(f530Var4, null, 3), 0.0f, ((y7m) btsVar2.m(nsy.a)).a, 1);
                                                            btsVar2.t(false);
                                                        }
                                                        f530 d = hi91.d(ljs0.c(b, 1.0f), false, null, 3);
                                                        Object Q = btsVar2.Q();
                                                        if (Q == did.a) {
                                                            Q = new teb(20);
                                                            btsVar2.o0(Q);
                                                        }
                                                        f530 b2 = fnq0.b(d, true, (tls) Q);
                                                        lhl0 a = khl0.a(lr20.a, to5Var3, btsVar2, 0);
                                                        int hashCode = Long.hashCode(btsVar2.T);
                                                        r1b0 o = btsVar2.o();
                                                        f530 d2 = b.d(btsVar2, b2);
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
                                                        qje.W(btsVar2, d.f, a);
                                                        qje.W(btsVar2, d.e, o);
                                                        wls wlsVar17 = d.g;
                                                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                                                            b64.z(hashCode, btsVar2, hashCode, wlsVar17);
                                                        }
                                                        qje.W(btsVar2, d.d, d2);
                                                        web1.b(z6, wlsVar13, btsVar2, 0);
                                                        web1.a(wlsVar2, wlsVar8, wlsVar14, an91.m(new x2y(1.0f, true), 0.0f, z7 ? 0.0f : f6, 1), btsVar2, 0);
                                                        web1.f(wlsVar15, wlsVar16, j690Var3, btsVar2, 0);
                                                        btsVar2.t(true);
                                                    } else {
                                                        btsVar2.Y();
                                                    }
                                                    return zy11.a;
                                                }
                                            }, btsVar), btsVar, 56);
                                            z3 = z5;
                                            f530Var2 = f530Var3;
                                            to5Var2 = to5Var3;
                                            z4 = z6;
                                            wlsVar10 = wlsVar13;
                                            wlsVar11 = wlsVar14;
                                            f4 = f6;
                                            wlsVar12 = wlsVar15;
                                            wlsVar9 = wlsVar16;
                                            j690Var2 = j690Var3;
                                        } else {
                                            btsVar.Y();
                                            z3 = z;
                                            f4 = f2;
                                            wlsVar8 = wlsVar3;
                                            wlsVar9 = wlsVar6;
                                            j690Var2 = j690Var;
                                            z4 = z2;
                                            wlsVar10 = wlsVar7;
                                            f5 = f3;
                                            wlsVar11 = wlsVar4;
                                            wlsVar12 = wlsVar5;
                                        }
                                        v = btsVar.v();
                                        if (v != null) {
                                            final f530 f530Var4 = f530Var2;
                                            final to5 to5Var4 = to5Var2;
                                            final wls wlsVar17 = wlsVar8;
                                            v.d = new wls() { // from class: dsy
                                                @Override // defpackage.wls
                                                public final Object invoke(Object obj, Object obj2) {
                                                    ((Integer) obj2).getClass();
                                                    int O = vng.O(i | 1);
                                                    int O2 = vng.O(i2);
                                                    web1.c(f530.this, f5, z3, f4, to5Var4, wlsVar10, wlsVar2, wlsVar17, wlsVar11, wlsVar12, wlsVar9, j690Var2, z4, (fid) obj, O, O2, i3);
                                                    return zy11.a;
                                                }
                                            };
                                            return;
                                        }
                                        return;
                                    }
                                    if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
                                    }
                                    v = btsVar.v();
                                    if (v != null) {
                                    }
                                }
                                i14 = i13;
                                i15 = i3 & 1024;
                                if (i15 == 0) {
                                }
                                i18 = i3 & 2048;
                                if (i18 == 0) {
                                }
                                i20 = i17;
                                i21 = i3 & 4096;
                                if (i21 == 0) {
                                }
                                if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
                                }
                                v = btsVar.v();
                                if (v != null) {
                                }
                            }
                            i12 = i11;
                            i13 = i3 & 512;
                            if (i13 != 0) {
                            }
                            i14 = i13;
                            i15 = i3 & 1024;
                            if (i15 == 0) {
                            }
                            i18 = i3 & 2048;
                            if (i18 == 0) {
                            }
                            i20 = i17;
                            i21 = i3 & 4096;
                            if (i21 == 0) {
                            }
                            if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
                            }
                            v = btsVar.v();
                            if (v != null) {
                            }
                        }
                        i10 = i24;
                        i11 = i3 & 256;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 != 0) {
                        }
                        i14 = i13;
                        i15 = i3 & 1024;
                        if (i15 == 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 == 0) {
                        }
                        i20 = i17;
                        i21 = i3 & 4096;
                        if (i21 == 0) {
                        }
                        if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
                        }
                        v = btsVar.v();
                        if (v != null) {
                        }
                    }
                    to5Var2 = to5Var;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i24;
                    i11 = i3 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 == 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 == 0) {
                    }
                    i20 = i17;
                    i21 = i3 & 4096;
                    if (i21 == 0) {
                    }
                    if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                to5Var2 = to5Var;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                i10 = i24;
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 == 0) {
                }
                i18 = i3 & 2048;
                if (i18 == 0) {
                }
                i20 = i17;
                i21 = i3 & 4096;
                if (i21 == 0) {
                }
                if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            to5Var2 = to5Var;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i24;
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 == 0) {
            }
            i18 = i3 & 2048;
            if (i18 == 0) {
            }
            i20 = i17;
            i21 = i3 & 4096;
            if (i21 == 0) {
            }
            if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f3 = f;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        to5Var2 = to5Var;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i24;
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 == 0) {
        }
        i18 = i3 & 2048;
        if (i18 == 0) {
        }
        i20 = i17;
        i21 = i3 & 4096;
        if (i21 == 0) {
        }
        if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i20 & 147) != 146)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(f530 f530Var, float f, int i, float f2, Object obj, final tls tlsVar, fid fidVar, final int i2, final int i3) {
        int i4;
        int i5;
        float f3;
        int i6;
        Object obj2;
        int i7;
        final f530 f530Var2;
        bts btsVar;
        final float f4;
        final Object obj3;
        final int i8;
        final float f5;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-47886526);
        int i9 = i2 | 54;
        int i10 = i3 & 4;
        if (i10 != 0) {
            i5 = i2 | 438;
            i4 = i;
        } else {
            i4 = i;
            i5 = i9 | (btsVar2.c(i4) ? 256 : 128);
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i5 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f3 = f2;
            i5 |= btsVar2.b(f3) ? 2048 : 1024;
            i6 = i3 & 16;
            if (i6 == 0) {
                i7 = i5 | HProv.ALG_CLASS_DATA_ENCRYPT;
                obj2 = obj;
            } else {
                obj2 = obj;
                i7 = i5 | (btsVar2.e(obj2) ? 16384 : 8192);
            }
            if ((196608 & i2) == 0) {
                i7 |= btsVar2.e(tlsVar) ? 131072 : 65536;
            }
            if (btsVar2.V(i7 & 1, (74899 & i7) == 74898)) {
                btsVar2.Y();
                f530Var2 = f530Var;
                btsVar = btsVar2;
                f4 = f3;
                obj3 = obj2;
                i8 = i4;
                f5 = f;
            } else {
                int i12 = i10 != 0 ? 6 : i4;
                float f6 = i11 != 0 ? 8.0f : f3;
                Object obj4 = i6 != 0 ? null : obj2;
                c530 c530Var = c530.a;
                xab1.a(ljs0.c(c530Var, 1.0f), null, wwg.S(-1804617556, true, new nkp0(16.0f, f6, i12, obj4, tlsVar), btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 6);
                btsVar = btsVar2;
                f530Var2 = c530Var;
                f5 = 16.0f;
                f4 = f6;
                i8 = i12;
                obj3 = obj4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: imt0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj5, Object obj6) {
                        ((Integer) obj6).getClass();
                        web1.d(f530.this, f5, i8, f4, obj3, tlsVar, (fid) obj5, vng.O(i2 | 1), i3);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if (btsVar2.V(i7 & 1, (74899 & i7) == 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(f530 f530Var, k43 k43Var, it1 it1Var, String str, eyr eyrVar, long j, lzr lzrVar, hzr hzrVar, sty0 sty0Var, int i, boolean z, int i2, tls tlsVar, String str2, eyr eyrVar2, lzr lzrVar2, hzr hzrVar2, sty0 sty0Var2, boolean z2, long j2, int i3, boolean z3, int i4, boolean z4, tls tlsVar2, boolean z5, fid fidVar, final int i5, final int i6, final int i7, final int i8) {
        f530 f530Var2;
        int i9;
        it1 it1Var2;
        int i10;
        String str3;
        int i11;
        eyr eyrVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        final k43 k43Var2;
        final boolean z6;
        final int i38;
        final eyr eyrVar4;
        final lzr lzrVar3;
        final hzr hzrVar3;
        final sty0 sty0Var3;
        final boolean z7;
        final long j3;
        final int i39;
        final boolean z8;
        final int i40;
        final boolean z9;
        final tls tlsVar3;
        final boolean z10;
        bts btsVar;
        final String str4;
        final eyr eyrVar5;
        final f530 f530Var3;
        final it1 it1Var3;
        final long j4;
        final lzr lzrVar4;
        final hzr hzrVar4;
        final sty0 sty0Var4;
        final int i41;
        final tls tlsVar4;
        final String str5;
        aii0 v;
        it1 it1Var4;
        long j5;
        lzr lzrVar5;
        hzr hzrVar5;
        sty0 sty0Var5;
        f530 f530Var4;
        hzr hzrVar6;
        sty0 sty0Var6;
        boolean z11;
        long o;
        tls tlsVar5;
        k43 k43Var3;
        int i42;
        boolean z12;
        tls tlsVar6;
        int i43;
        boolean z13;
        boolean z14;
        int i44;
        int i45;
        boolean z15;
        tls tlsVar7;
        lzr lzrVar6;
        eyr eyrVar6;
        String str6;
        int i46;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-594578402);
        int i47 = i8 & 1;
        if (i47 != 0) {
            i9 = i5 | 6;
            f530Var2 = f530Var;
        } else if ((i5 & 6) == 0) {
            f530Var2 = f530Var;
            i9 = (btsVar2.k(f530Var2) ? 4 : 2) | i5;
        } else {
            f530Var2 = f530Var;
            i9 = i5;
        }
        int i48 = i9 | 48;
        int i49 = i8 & 4;
        if (i49 != 0) {
            i48 = i9 | 432;
        } else if ((i5 & 384) == 0) {
            it1Var2 = it1Var;
            i48 |= btsVar2.k(it1Var2) ? 256 : 128;
            i10 = i8 & 8;
            if (i10 == 0) {
                i48 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                str3 = str;
                i48 |= btsVar2.k(str3) ? 2048 : 1024;
                i11 = i8 & 16;
                if (i11 != 0) {
                    i12 = i48 | HProv.ALG_CLASS_DATA_ENCRYPT;
                    eyrVar3 = eyrVar;
                } else {
                    eyrVar3 = eyrVar;
                    i12 = i48 | (btsVar2.k(eyrVar3) ? 16384 : 8192);
                }
                long j6 = j;
                int i50 = i12 | ImageMetadata.EDGE_MODE | (((i8 & 64) == 0 || !btsVar2.d(j6)) ? 524288 : 1048576);
                i13 = i8 & 128;
                int i51 = SelfTester_JCP.ENCRYPT_CBC;
                if (i13 != 0) {
                    i50 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    i50 |= btsVar2.k(lzrVar) ? 8388608 : 4194304;
                }
                i14 = i8 & 256;
                if (i14 != 0) {
                    i16 = i50 | 100663296;
                    i15 = i14;
                } else {
                    i15 = i14;
                    i16 = i50 | (btsVar2.k(hzrVar) ? 67108864 : 33554432);
                }
                i17 = i8 & 512;
                int i52 = SelfTester_JCP.IMITA;
                if (i17 != 0) {
                    i16 |= 805306368;
                } else if ((i5 & 805306368) == 0) {
                    i18 = i17;
                    i16 |= btsVar2.k(sty0Var) ? 536870912 : 268435456;
                    int i53 = i6 | 54;
                    i19 = i8 & 4096;
                    if (i19 == 0) {
                        i20 = i19;
                        i21 = i6 | 438;
                    } else {
                        i20 = i19;
                        if ((i6 & 384) == 0) {
                            i53 |= btsVar2.c(i2) ? 256 : 128;
                        }
                        i21 = i53;
                    }
                    int i54 = i21 | 27648;
                    i22 = i8 & 32768;
                    if (i22 == 0) {
                        i54 = 224256 | i21;
                    } else if ((i6 & ImageMetadata.EDGE_MODE) == 0) {
                        i54 |= btsVar2.k(str2) ? 131072 : 65536;
                        i23 = i8 & 65536;
                        if (i23 != 0) {
                            i24 = i54 | 1572864;
                        } else {
                            i24 = i54 | (btsVar2.k(eyrVar2) ? 1048576 : 524288);
                        }
                        i25 = i8 & 131072;
                        if (i25 != 0) {
                            i26 = i24 | 12582912;
                        } else {
                            i26 = i24 | (btsVar2.k(lzrVar2) ? 8388608 : 4194304);
                        }
                        i27 = i8 & 262144;
                        if (i27 != 0) {
                            i28 = i26 | 100663296;
                        } else {
                            i28 = i26 | (btsVar2.k(hzrVar2) ? 67108864 : 33554432);
                        }
                        i29 = i8 & 524288;
                        if (i29 != 0) {
                            i28 |= 805306368;
                        } else if ((i6 & 805306368) == 0) {
                            if (btsVar2.k(sty0Var2)) {
                                i52 = 536870912;
                            }
                            i28 |= i52;
                        }
                        i30 = i8 & 1048576;
                        if (i30 != 0) {
                            i31 = i7 | 6;
                        } else {
                            i31 = i7 | (btsVar2.a(z2) ? 4 : 2);
                        }
                        i32 = i28;
                        int i55 = i31 | (((i8 & 2097152) == 0 || !btsVar2.d(j2)) ? 16 : 32);
                        i33 = i55 | 3456;
                        i34 = i8 & 16777216;
                        if (i34 != 0) {
                            i33 = i55 | 28032;
                        } else if ((i7 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                            i33 |= btsVar2.c(i4) ? 16384 : 8192;
                            i35 = i8 & SelfTester_JCP.DECRYPT_CFB;
                            if (i35 == 0) {
                                i33 |= ImageMetadata.EDGE_MODE;
                            } else if ((i7 & ImageMetadata.EDGE_MODE) == 0) {
                                i33 |= btsVar2.a(z4) ? 131072 : 65536;
                            }
                            i36 = i8 & SelfTester_JCP.DECRYPT_CBC;
                            if (i36 == 0) {
                                i33 |= 1572864;
                            } else if ((i7 & 1572864) == 0) {
                                i33 |= btsVar2.e(tlsVar2) ? 1048576 : 524288;
                            }
                            i37 = i8 & SelfTester_JCP.DECRYPT_CNT;
                            if (i37 == 0) {
                                i33 |= 12582912;
                            } else if ((i7 & 12582912) == 0) {
                                if (btsVar2.a(z5)) {
                                    i51 = 8388608;
                                }
                                i33 |= i51;
                            }
                            if (btsVar2.V(i16 & 1, ((i16 & 306783379) != 306783378 && (i32 & 306783379) == 306783378 && (i33 & 4793491) == 4793490) ? false : true)) {
                                btsVar2.Y();
                                k43Var2 = k43Var;
                                z6 = z;
                                i38 = i2;
                                eyrVar4 = eyrVar2;
                                lzrVar3 = lzrVar2;
                                hzrVar3 = hzrVar2;
                                sty0Var3 = sty0Var2;
                                z7 = z2;
                                j3 = j2;
                                i39 = i3;
                                z8 = z3;
                                i40 = i4;
                                z9 = z4;
                                tlsVar3 = tlsVar2;
                                z10 = z5;
                                btsVar = btsVar2;
                                str4 = str3;
                                eyrVar5 = eyrVar3;
                                f530Var3 = f530Var2;
                                it1Var3 = it1Var2;
                                j4 = j6;
                                lzrVar4 = lzrVar;
                                hzrVar4 = hzrVar;
                                sty0Var4 = sty0Var;
                                i41 = i;
                                tlsVar4 = tlsVar;
                                str5 = str2;
                            } else {
                                btsVar2.a0();
                                if ((i5 & 1) == 0 || btsVar2.C()) {
                                    f530 f530Var5 = i47 != 0 ? c530.a : f530Var2;
                                    it1Var4 = i49 != 0 ? x4c.G : it1Var2;
                                    if (i10 != 0) {
                                        str3 = null;
                                    }
                                    if (i11 != 0) {
                                        eyrVar3 = null;
                                    }
                                    if ((i8 & 64) != 0) {
                                        j5 = ((el51) btsVar2.m(gl51.a)).n();
                                        i16 &= -3670017;
                                    } else {
                                        j5 = j6;
                                    }
                                    lzrVar5 = i13 != 0 ? null : lzrVar;
                                    hzrVar5 = i15 != 0 ? null : hzrVar;
                                    sty0Var5 = i18 != 0 ? null : sty0Var;
                                    int i56 = i20 != 0 ? 2 : i2;
                                    Object Q = btsVar2.Q();
                                    Object obj = did.a;
                                    if (Q == obj) {
                                        f530Var4 = f530Var5;
                                        Q = new wk6(6);
                                        btsVar2.o0(Q);
                                    } else {
                                        f530Var4 = f530Var5;
                                    }
                                    tls tlsVar8 = (tls) Q;
                                    String str7 = i22 != 0 ? null : str2;
                                    eyr eyrVar7 = i23 != 0 ? null : eyrVar2;
                                    lzr lzrVar7 = i25 != 0 ? null : lzrVar2;
                                    hzrVar6 = i27 != 0 ? null : hzrVar2;
                                    sty0Var6 = i29 != 0 ? null : sty0Var2;
                                    z11 = i30 != 0 ? false : z2;
                                    o = (i8 & 2097152) != 0 ? ((el51) btsVar2.m(gl51.a)).o() : j2;
                                    int i57 = i34 != 0 ? 2 : i4;
                                    boolean z16 = i35 != 0 ? false : z4;
                                    int i58 = i57;
                                    if (i36 != 0) {
                                        Object Q2 = btsVar2.Q();
                                        if (Q2 == obj) {
                                            Q2 = new wk6(6);
                                            btsVar2.o0(Q2);
                                        }
                                        tlsVar5 = (tls) Q2;
                                    } else {
                                        tlsVar5 = tlsVar2;
                                    }
                                    k43Var3 = lr20.e;
                                    i42 = i58;
                                    if (i37 != 0) {
                                        tlsVar6 = tlsVar5;
                                        i43 = i16;
                                        z13 = z16;
                                        z14 = true;
                                        i44 = 2;
                                        i45 = 2;
                                        z15 = true;
                                        z12 = false;
                                    } else {
                                        z12 = z5;
                                        tlsVar6 = tlsVar5;
                                        i43 = i16;
                                        z13 = z16;
                                        z14 = true;
                                        i44 = 2;
                                        i45 = 2;
                                        z15 = true;
                                    }
                                    tlsVar7 = tlsVar8;
                                    lzrVar6 = lzrVar7;
                                    eyrVar6 = eyrVar7;
                                    str6 = str7;
                                    long j7 = j5;
                                    f530Var2 = f530Var4;
                                    i46 = i56;
                                    j6 = j7;
                                } else {
                                    btsVar2.Y();
                                    if ((i8 & 64) != 0) {
                                        i16 &= -3670017;
                                    }
                                    k43Var3 = k43Var;
                                    lzrVar5 = lzrVar;
                                    hzrVar5 = hzrVar;
                                    sty0Var5 = sty0Var;
                                    i45 = i;
                                    z14 = z;
                                    str6 = str2;
                                    eyrVar6 = eyrVar2;
                                    lzrVar6 = lzrVar2;
                                    hzrVar6 = hzrVar2;
                                    sty0Var6 = sty0Var2;
                                    z11 = z2;
                                    o = j2;
                                    i44 = i3;
                                    z15 = z3;
                                    i42 = i4;
                                    z13 = z4;
                                    tlsVar6 = tlsVar2;
                                    z12 = z5;
                                    it1Var4 = it1Var2;
                                    i43 = i16;
                                    i46 = i2;
                                    tlsVar7 = tlsVar;
                                }
                                btsVar2.u();
                                sic a = qic.a(k43Var3, it1Var4, btsVar2, ((i43 & 1022) >> 3) & HProv.PP_DELETE_SAVED_PASSWD);
                                lzr lzrVar8 = lzrVar5;
                                k43 k43Var4 = k43Var3;
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o2 = btsVar2.o();
                                f530 d = b.d(btsVar2, f530Var2);
                                ohd.G1.getClass();
                                hzr hzrVar7 = hzrVar5;
                                sls slsVar = d.b;
                                it1 it1Var5 = it1Var4;
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
                                qje.W(btsVar2, d.f, a);
                                qje.W(btsVar2, d.e, o2);
                                wls wlsVar = d.g;
                                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                                    b64.z(hashCode, btsVar2, hashCode, wlsVar);
                                }
                                qje.W(btsVar2, d.d, d);
                                int i59 = i46;
                                tls tlsVar9 = tlsVar7;
                                final boolean z17 = z12;
                                boolean z18 = z14;
                                a S = wwg.S(339457537, true, new bsy(str3, j6, eyrVar3, lzrVar8, i45, z14, i59, tlsVar9, sty0Var5, z17, hzrVar7, 2), btsVar2);
                                final String str8 = str6;
                                final eyr eyrVar8 = eyrVar6;
                                final lzr lzrVar9 = lzrVar6;
                                final int i60 = i44;
                                final boolean z19 = z15;
                                final hzr hzrVar8 = hzrVar6;
                                final sty0 sty0Var7 = sty0Var6;
                                final int i61 = i42;
                                final boolean z20 = z11;
                                final long j8 = o;
                                final tls tlsVar10 = tlsVar6;
                                eyrVar4 = eyrVar8;
                                lzrVar3 = lzrVar9;
                                a S2 = wwg.S(-56630861, true, new wls() { // from class: esy
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj2, Object obj3) {
                                        fid fidVar2 = (fid) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        bts btsVar3 = (bts) fidVar2;
                                        if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                            String str9 = str8;
                                            if (str9 == null) {
                                                btsVar3.e0(832222737);
                                                btsVar3.t(false);
                                            } else {
                                                btsVar3.e0(832222738);
                                                rcb1.c(null, z20, 0, null, wwg.S(1085459999, true, new bsy(str9, sty0Var7, z17, j8, eyrVar8, lzrVar9, hzrVar8, i60, z19, i61, tlsVar10), btsVar3), btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 13);
                                                btsVar3.t(false);
                                            }
                                        } else {
                                            btsVar3.Y();
                                        }
                                        return zy11.a;
                                    }
                                }, btsVar2);
                                if (z13) {
                                    btsVar2.e0(1332479696);
                                    S2.invoke(btsVar2, 6);
                                    S.invoke(btsVar2, 6);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(1332547152);
                                    S.invoke(btsVar2, 6);
                                    S2.invoke(btsVar2, 6);
                                    btsVar2.t(false);
                                }
                                btsVar2.t(true);
                                btsVar = btsVar2;
                                eyrVar5 = eyrVar3;
                                f530Var3 = f530Var2;
                                sty0Var4 = sty0Var5;
                                i40 = i61;
                                i41 = i45;
                                sty0Var3 = sty0Var6;
                                z7 = z11;
                                z9 = z13;
                                k43Var2 = k43Var4;
                                i38 = i59;
                                hzrVar4 = hzrVar7;
                                str4 = str3;
                                z8 = z19;
                                tlsVar3 = tlsVar10;
                                hzrVar3 = hzrVar6;
                                j3 = o;
                                lzrVar4 = lzrVar8;
                                z10 = z17;
                                i39 = i60;
                                z6 = z18;
                                long j9 = j6;
                                tlsVar4 = tlsVar9;
                                str5 = str8;
                                j4 = j9;
                                it1Var3 = it1Var5;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new wls() { // from class: fsy
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj2, Object obj3) {
                                        ((Integer) obj3).getClass();
                                        int O = vng.O(i5 | 1);
                                        int O2 = vng.O(i6);
                                        int O3 = vng.O(i7);
                                        web1.e(f530.this, k43Var2, it1Var3, str4, eyrVar5, j4, lzrVar4, hzrVar4, sty0Var4, i41, z6, i38, tlsVar4, str5, eyrVar4, lzrVar3, hzrVar3, sty0Var3, z7, j3, i39, z8, i40, z9, tlsVar3, z10, (fid) obj2, O, O2, O3, i8);
                                        return zy11.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i35 = i8 & SelfTester_JCP.DECRYPT_CFB;
                        if (i35 == 0) {
                        }
                        i36 = i8 & SelfTester_JCP.DECRYPT_CBC;
                        if (i36 == 0) {
                        }
                        i37 = i8 & SelfTester_JCP.DECRYPT_CNT;
                        if (i37 == 0) {
                        }
                        if (btsVar2.V(i16 & 1, ((i16 & 306783379) != 306783378 && (i32 & 306783379) == 306783378 && (i33 & 4793491) == 4793490) ? false : true)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    i23 = i8 & 65536;
                    if (i23 != 0) {
                    }
                    i25 = i8 & 131072;
                    if (i25 != 0) {
                    }
                    i27 = i8 & 262144;
                    if (i27 != 0) {
                    }
                    i29 = i8 & 524288;
                    if (i29 != 0) {
                    }
                    i30 = i8 & 1048576;
                    if (i30 != 0) {
                    }
                    i32 = i28;
                    int i552 = i31 | (((i8 & 2097152) == 0 || !btsVar2.d(j2)) ? 16 : 32);
                    i33 = i552 | 3456;
                    i34 = i8 & 16777216;
                    if (i34 != 0) {
                    }
                    i35 = i8 & SelfTester_JCP.DECRYPT_CFB;
                    if (i35 == 0) {
                    }
                    i36 = i8 & SelfTester_JCP.DECRYPT_CBC;
                    if (i36 == 0) {
                    }
                    i37 = i8 & SelfTester_JCP.DECRYPT_CNT;
                    if (i37 == 0) {
                    }
                    if (btsVar2.V(i16 & 1, ((i16 & 306783379) != 306783378 && (i32 & 306783379) == 306783378 && (i33 & 4793491) == 4793490) ? false : true)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                i18 = i17;
                int i532 = i6 | 54;
                i19 = i8 & 4096;
                if (i19 == 0) {
                }
                int i542 = i21 | 27648;
                i22 = i8 & 32768;
                if (i22 == 0) {
                }
                i23 = i8 & 65536;
                if (i23 != 0) {
                }
                i25 = i8 & 131072;
                if (i25 != 0) {
                }
                i27 = i8 & 262144;
                if (i27 != 0) {
                }
                i29 = i8 & 524288;
                if (i29 != 0) {
                }
                i30 = i8 & 1048576;
                if (i30 != 0) {
                }
                i32 = i28;
                int i5522 = i31 | (((i8 & 2097152) == 0 || !btsVar2.d(j2)) ? 16 : 32);
                i33 = i5522 | 3456;
                i34 = i8 & 16777216;
                if (i34 != 0) {
                }
                i35 = i8 & SelfTester_JCP.DECRYPT_CFB;
                if (i35 == 0) {
                }
                i36 = i8 & SelfTester_JCP.DECRYPT_CBC;
                if (i36 == 0) {
                }
                i37 = i8 & SelfTester_JCP.DECRYPT_CNT;
                if (i37 == 0) {
                }
                if (btsVar2.V(i16 & 1, ((i16 & 306783379) != 306783378 && (i32 & 306783379) == 306783378 && (i33 & 4793491) == 4793490) ? false : true)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            str3 = str;
            i11 = i8 & 16;
            if (i11 != 0) {
            }
            long j62 = j;
            int i502 = i12 | ImageMetadata.EDGE_MODE | (((i8 & 64) == 0 || !btsVar2.d(j62)) ? 524288 : 1048576);
            i13 = i8 & 128;
            int i512 = SelfTester_JCP.ENCRYPT_CBC;
            if (i13 != 0) {
            }
            i14 = i8 & 256;
            if (i14 != 0) {
            }
            i17 = i8 & 512;
            int i522 = SelfTester_JCP.IMITA;
            if (i17 != 0) {
            }
            i18 = i17;
            int i5322 = i6 | 54;
            i19 = i8 & 4096;
            if (i19 == 0) {
            }
            int i5422 = i21 | 27648;
            i22 = i8 & 32768;
            if (i22 == 0) {
            }
            i23 = i8 & 65536;
            if (i23 != 0) {
            }
            i25 = i8 & 131072;
            if (i25 != 0) {
            }
            i27 = i8 & 262144;
            if (i27 != 0) {
            }
            i29 = i8 & 524288;
            if (i29 != 0) {
            }
            i30 = i8 & 1048576;
            if (i30 != 0) {
            }
            i32 = i28;
            int i55222 = i31 | (((i8 & 2097152) == 0 || !btsVar2.d(j2)) ? 16 : 32);
            i33 = i55222 | 3456;
            i34 = i8 & 16777216;
            if (i34 != 0) {
            }
            i35 = i8 & SelfTester_JCP.DECRYPT_CFB;
            if (i35 == 0) {
            }
            i36 = i8 & SelfTester_JCP.DECRYPT_CBC;
            if (i36 == 0) {
            }
            i37 = i8 & SelfTester_JCP.DECRYPT_CNT;
            if (i37 == 0) {
            }
            if (btsVar2.V(i16 & 1, ((i16 & 306783379) != 306783378 && (i32 & 306783379) == 306783378 && (i33 & 4793491) == 4793490) ? false : true)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        it1Var2 = it1Var;
        i10 = i8 & 8;
        if (i10 == 0) {
        }
        str3 = str;
        i11 = i8 & 16;
        if (i11 != 0) {
        }
        long j622 = j;
        int i5022 = i12 | ImageMetadata.EDGE_MODE | (((i8 & 64) == 0 || !btsVar2.d(j622)) ? 524288 : 1048576);
        i13 = i8 & 128;
        int i5122 = SelfTester_JCP.ENCRYPT_CBC;
        if (i13 != 0) {
        }
        i14 = i8 & 256;
        if (i14 != 0) {
        }
        i17 = i8 & 512;
        int i5222 = SelfTester_JCP.IMITA;
        if (i17 != 0) {
        }
        i18 = i17;
        int i53222 = i6 | 54;
        i19 = i8 & 4096;
        if (i19 == 0) {
        }
        int i54222 = i21 | 27648;
        i22 = i8 & 32768;
        if (i22 == 0) {
        }
        i23 = i8 & 65536;
        if (i23 != 0) {
        }
        i25 = i8 & 131072;
        if (i25 != 0) {
        }
        i27 = i8 & 262144;
        if (i27 != 0) {
        }
        i29 = i8 & 524288;
        if (i29 != 0) {
        }
        i30 = i8 & 1048576;
        if (i30 != 0) {
        }
        i32 = i28;
        int i552222 = i31 | (((i8 & 2097152) == 0 || !btsVar2.d(j2)) ? 16 : 32);
        i33 = i552222 | 3456;
        i34 = i8 & 16777216;
        if (i34 != 0) {
        }
        i35 = i8 & SelfTester_JCP.DECRYPT_CFB;
        if (i35 == 0) {
        }
        i36 = i8 & SelfTester_JCP.DECRYPT_CBC;
        if (i36 == 0) {
        }
        i37 = i8 & SelfTester_JCP.DECRYPT_CNT;
        if (i37 == 0) {
        }
        if (btsVar2.V(i16 & 1, ((i16 & 306783379) != 306783378 && (i32 & 306783379) == 306783378 && (i33 & 4793491) == 4793490) ? false : true)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void f(wls wlsVar, wls wlsVar2, j690 j690Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1573479492);
        int i2 = (btsVar.e(wlsVar) ? 4 : 2) | i | (btsVar.e(wlsVar2) ? 32 : 16) | (btsVar.k(j690Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            if (wlsVar == null && wlsVar2 == null) {
                btsVar.e0(254654857);
                oeb1.c(btsVar, ljs0.q(c530Var, 16.0f));
                btsVar.t(false);
            } else {
                btsVar.e0(254733535);
                f530 j = an91.j(ljs0.e(c530Var, ((y7m) btsVar.m(nsy.a)).a), j690Var);
                lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, j);
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
                wls wlsVar3 = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar3);
                }
                qje.W(btsVar, d.d, d);
                if (wlsVar == null) {
                    btsVar.e0(-1613609958);
                    btsVar.t(false);
                } else {
                    btsVar.e0(1194874055);
                    xvz.u(i2 & 14, wlsVar, btsVar, false);
                }
                if (wlsVar2 == null) {
                    btsVar.e0(-1613577222);
                    btsVar.t(false);
                } else {
                    btsVar.e0(1194875111);
                    xvz.u((i2 >> 3) & 14, wlsVar2, btsVar, false);
                }
                btsVar.t(true);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(wlsVar, wlsVar2, j690Var, i, 19);
        }
    }

    public static final String g(q48 q48Var, CopyInfoType copyInfoType) {
        if (q48Var == null) {
            return "";
        }
        String str = q48Var.d;
        if (str == null) {
            str = "";
        }
        String str2 = q48Var.a;
        String str3 = str2 != null ? str2 : "";
        int i = s48.a[copyInfoType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = str3;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                str = g8e.p(str, " ", str3);
            }
        }
        return str.concat(" ");
    }

    public static final ety0 h(ety0 ety0Var) {
        return ety0Var.d(new ety0(0L, 0L, null, null, null, null, 0L, 0, 0L, new iwc0(false), new ehy(bhy.b, 17, 0), 15204351));
    }

    public static final boolean i(q48 q48Var) {
        return (evu0.J(g(q48Var, CopyInfoType.CAR_MARK)) || evu0.J(g(q48Var, CopyInfoType.CAR_NUMBER)) || evu0.J(g(q48Var, CopyInfoType.CAR_NUMBER_AND_MARK))) ? false : true;
    }
}
