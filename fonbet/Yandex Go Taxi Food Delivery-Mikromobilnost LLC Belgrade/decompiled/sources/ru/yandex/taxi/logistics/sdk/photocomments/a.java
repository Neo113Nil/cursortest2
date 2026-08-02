package ru.yandex.taxi.logistics.sdk.photocomments;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.a990;
import defpackage.aab1;
import defpackage.adb1;
import defpackage.ah6;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.b700;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c0i0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cjf0;
import defpackage.clb0;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d4y;
import defpackage.did;
import defpackage.dl51;
import defpackage.dlb0;
import defpackage.el51;
import defpackage.ev90;
import defpackage.f530;
import defpackage.fc0;
import defpackage.fid;
import defpackage.gl51;
import defpackage.gv90;
import defpackage.hkb0;
import defpackage.i43;
import defpackage.ikb0;
import defpackage.j690;
import defpackage.jkb0;
import defpackage.jl40;
import defpackage.kkb0;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lkb0;
import defpackage.lzr;
import defpackage.m4m0;
import defpackage.m991;
import defpackage.mhb0;
import defpackage.mhe;
import defpackage.mkb0;
import defpackage.mt71;
import defpackage.nc0;
import defpackage.nub;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ocb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.p91;
import defpackage.pa90;
import defpackage.pi6;
import defpackage.q12;
import defpackage.q4v;
import defpackage.q791;
import defpackage.qgb0;
import defpackage.qje;
import defpackage.qke;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.ra3;
import defpackage.rpm;
import defpackage.rzh0;
import defpackage.scc;
import defpackage.sls;
import defpackage.t0h0;
import defpackage.tcc;
import defpackage.tkb0;
import defpackage.tls;
import defpackage.ua3;
import defpackage.uh6;
import defpackage.ukb0;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.ux00;
import defpackage.w511;
import defpackage.wkb0;
import defpackage.wls;
import defpackage.wqy0;
import defpackage.wwg;
import defpackage.wzg0;
import defpackage.x4c;
import defpackage.xkb0;
import defpackage.xw90;
import defpackage.xx8;
import defpackage.y6i0;
import defpackage.ye5;
import defpackage.ymb1;
import defpackage.z07;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zvr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.photocomments.a;
import ru.yandex.taxi.logistics.sdk.photocomments.data.PhotoModel$Type;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(hkb0 hkb0Var, String str, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        tkb0 tkb0Var2;
        PhotocommentsMode photocommentsMode2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2005770723);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(hkb0Var) : btsVar.e(hkb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.c(photocommentsMode.ordinal()) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            tkb0Var2 = tkb0Var;
            i2 |= btsVar.k(tkb0Var2) ? 16384 : 8192;
        } else {
            tkb0Var2 = tkb0Var;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.e(hkb0Var))) | ((458752 & i2) == 131072) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new b700(20, tlsVar, hkb0Var, str);
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
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
            e(hkb0Var.c, true, str, photocommentsMode, tkb0Var2, tlsVar != null ? slsVar : null, btsVar, ((i2 << 3) & 896) | 48 | (i2 & 7168) | (i2 & HProv.ALG_CLASS_ALL), 0);
            photocommentsMode2 = photocommentsMode;
            if (photocommentsMode2 != PhotocommentsMode.MUTABLE || z) {
                btsVar.e0(-1490861639);
                btsVar.t(false);
            } else {
                btsVar.e0(-1491130068);
                h(t0h0.ic_delivery_error_warning, cj6.a.a(c530Var, x4c.w), null, ohb1.e(btsVar, c0i0.delivery_photocomment_error_button_content_description), null, btsVar, 0, 20);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            photocommentsMode2 = photocommentsMode;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(hkb0Var, str, z, photocommentsMode2, tkb0Var, tlsVar, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(dlb0 dlb0Var, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, f530 f530Var, j690 j690Var, tls tlsVar, sls slsVar, sls slsVar2, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        j690 j690Var2;
        int i4;
        int i5;
        tls tlsVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        sls slsVar3;
        j690 j690Var3;
        tls tlsVar3;
        sls slsVar4;
        aii0 v;
        sls slsVar5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-549251174);
        int i12 = (btsVar.e(dlb0Var) ? 4 : 2) | i | (btsVar.k(tkb0Var) ? 256 : 128);
        int i13 = i2 & 8;
        if (i13 != 0) {
            i12 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i12 |= btsVar.k(f530Var2) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i4 = i12 | HProv.ALG_CLASS_DATA_ENCRYPT;
                j690Var2 = j690Var;
            } else {
                j690Var2 = j690Var;
                i4 = i12 | (btsVar.k(j690Var2) ? 16384 : 8192);
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i6 = i4 | ImageMetadata.EDGE_MODE;
                tlsVar2 = tlsVar;
            } else {
                tlsVar2 = tlsVar;
                i6 = i4 | (btsVar.e(tlsVar2) ? 131072 : 65536);
            }
            i7 = i2 & 64;
            if (i7 == 0) {
                i8 = i6 | 1572864;
            } else {
                i8 = i6 | (btsVar.e(slsVar) ? 1048576 : 524288);
            }
            i9 = i2 & 128;
            if (i9 == 0) {
                i10 = i8 | 12582912;
            } else {
                i10 = i8 | (btsVar.e(slsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
            }
            i11 = i10;
            int i14 = 0;
            if (btsVar.V(i11 & 1, (i11 & 4793491) == 4793490)) {
                btsVar.Y();
                slsVar3 = slsVar;
                j690Var3 = j690Var2;
                tlsVar3 = tlsVar2;
                slsVar4 = slsVar2;
            } else {
                f530 f530Var3 = i13 != 0 ? c530.a : f530Var2;
                j690 b = i3 != 0 ? an91.b(16.0f, 0.0f, 2) : j690Var2;
                tls tlsVar4 = i5 != 0 ? null : tlsVar2;
                sls slsVar6 = i7 != 0 ? null : slsVar;
                sls slsVar7 = i9 != 0 ? null : slsVar2;
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = f.j(null);
                    btsVar.o0(Q);
                }
                oz40 oz40Var = (oz40) Q;
                qgb0 qgb0Var = (qgb0) oz40Var.component1();
                tls component2 = oz40Var.component2();
                int i15 = i11 << 6;
                k(dlb0Var, ev90.a, false, photocommentsMode, tkb0Var, f530Var3, b, component2, tlsVar4, slsVar7, btsVar, (i11 & 14) | 3456 | (57344 & i15) | (458752 & i15) | (3670016 & i15) | ((i11 << 9) & 234881024) | (i15 & 1879048192), 0);
                if (qgb0Var != null) {
                    btsVar.e0(1084584776);
                    ArrayList arrayList = qgb0Var.c;
                    int i16 = qgb0Var.b;
                    boolean k = btsVar.k(component2);
                    Object Q2 = btsVar.Q();
                    if (k || Q2 == o430Var) {
                        Q2 = new ukb0(i14, component2);
                        btsVar.o0(Q2);
                    }
                    sls slsVar8 = slsVar6;
                    c(arrayList, i16, slsVar8, (sls) Q2, btsVar, (i11 >> 12) & 896);
                    slsVar5 = slsVar8;
                    btsVar.t(false);
                } else {
                    slsVar5 = slsVar6;
                    btsVar.e0(1084800040);
                    btsVar.t(false);
                }
                slsVar3 = slsVar5;
                f530Var2 = f530Var3;
                j690Var3 = b;
                tlsVar3 = tlsVar4;
                slsVar4 = slsVar7;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new ah6(dlb0Var, photocommentsMode, tkb0Var, f530Var2, j690Var3, tlsVar3, slsVar3, slsVar4, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i11 = i10;
        int i142 = 0;
        if (btsVar.V(i11 & 1, (i11 & 4793491) == 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(final ArrayList arrayList, final int i, final sls slsVar, final sls slsVar2, fid fidVar, final int i2) {
        int i3;
        final ArrayList arrayList2;
        final int i4;
        final sls slsVar3;
        final sls slsVar4;
        final int i5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1503532858);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.e(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar2) ? 2048 : 1024;
        }
        int i6 = 1;
        if (!btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            arrayList2 = arrayList;
            i4 = i;
            slsVar3 = slsVar;
            slsVar4 = slsVar2;
            i5 = i2;
            btsVar.Y();
        } else {
            if (arrayList.isEmpty()) {
                aii0 v = btsVar.v();
                if (v != null) {
                    final int i7 = 0;
                    v.d = new wls() { // from class: zkb0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i7;
                            zy11 zy11Var = zy11.a;
                            int i9 = i2;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i9 | 1);
                                    a.c(arrayList, i, slsVar, slsVar2, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i9 | 1);
                                    a.c(arrayList, i, slsVar, slsVar2, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            arrayList2 = arrayList;
            slsVar3 = slsVar;
            i4 = i;
            i5 = i2;
            slsVar4 = slsVar2;
            boolean z = (i3 & 896) == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new PhotocommentsKt$FullScreenPhotos$2$1(slsVar3, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            int d = y6i0.d(i4, 0, scc.f(arrayList2));
            boolean e = btsVar.e(arrayList2);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new ux00(arrayList2, 1);
                btsVar.o0(Q2);
            }
            m991.a(slsVar4, null, wwg.S(-1187158479, true, new xx8(i6, a990.b(d, (sls) Q2, btsVar, 0, 2), arrayList2, slsVar4), btsVar), btsVar, ((i3 >> 9) & 14) | 384);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i8 = 1;
            v2.d = new wls() { // from class: zkb0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = i8;
                    zy11 zy11Var = zy11.a;
                    int i9 = i5;
                    switch (i82) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i9 | 1);
                            a.c(arrayList2, i4, slsVar3, slsVar4, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i9 | 1);
                            a.c(arrayList2, i4, slsVar3, slsVar4, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void d(ikb0 ikb0Var, String str, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        PhotocommentsMode photocommentsMode2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1983693160);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ikb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.c(photocommentsMode.ordinal()) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(tkb0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 1048576 : 524288;
        }
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = i2 & 14;
            boolean z2 = ((458752 & i2) == 131072) | (i3 == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new b700(21, tlsVar, ikb0Var, str);
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            boolean z3 = i3 == 4;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = Float.valueOf(ikb0Var.c / ikb0Var.d);
                btsVar.o0(Q2);
            }
            float floatValue = ((Number) Q2).floatValue();
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
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
            int i4 = i2;
            e(ikb0Var.b, false, str, photocommentsMode, tkb0Var, tlsVar != null ? slsVar : null, btsVar, ((i2 << 3) & 896) | (i2 & 7168) | (57344 & i2), 2);
            btsVar = btsVar;
            photocommentsMode2 = photocommentsMode;
            if (photocommentsMode2 != PhotocommentsMode.MUTABLE || z) {
                btsVar.e0(575996644);
                btsVar.t(false);
            } else {
                btsVar.e0(575597519);
                int i5 = t0h0.ic_delivery_close;
                if (Float.isNaN(floatValue)) {
                    floatValue = 0.0f;
                }
                String e = ohb1.e(btsVar, c0i0.delivery_photocomment_delete_button_loading_content_description);
                f530 a = cj6.a.a(c530Var, x4c.w);
                Float valueOf = Float.valueOf(floatValue);
                boolean z4 = (i3 == 4) | ((3670016 & i4) == 1048576);
                Object Q3 = btsVar.Q();
                if (z4 || Q3 == o430Var) {
                    Q3 = new xw90(tlsVar2, 15, ikb0Var);
                    btsVar.o0(Q3);
                }
                h(i5, a, valueOf, e, (sls) Q3, btsVar, 0, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            photocommentsMode2 = photocommentsMode;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nub(ikb0Var, str, z, photocommentsMode2, tkb0Var, tlsVar, tlsVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String str, boolean z, String str2, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1445205880);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.k(str2) ? 256 : 128;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.c(photocommentsMode.ordinal()) ? 2048 : 1024;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar.k(tkb0Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= btsVar.e(slsVar) ? 131072 : 65536;
            }
            if (btsVar.V(i3 & 1, (74899 & i3) == 74898)) {
                btsVar.Y();
                z3 = z2;
            } else {
                boolean z4 = i4 != 0 ? false : z2;
                i(coil.compose.b.e(str, btsVar, i3 & 14), z4, str2, photocommentsMode, tkb0Var, slsVar, btsVar, i3 & 524272);
                z3 = z4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new rpm(str, z3, str2, photocommentsMode, tkb0Var, slsVar, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 384) == 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (btsVar.V(i3 & 1, (74899 & i3) == 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void f(int i, int i2, sls slsVar, f530 f530Var, fid fidVar, int i3) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(800329786);
        int i4 = i3 | (btsVar.c(i) ? 4 : 2) | (btsVar.c(i2) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            f530 e = ljs0.e(an91.o(m4m0.b(ljs0.c(f530Var, 1.0f), ldc.b(((el51) btsVar.m(gl51.a)).i(), 0.5f, 0.0f, 0.0f, 0.0f, 14), qke.q), 0.0f, 24.0f, 0.0f, 0.0f, 13), 64.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, e);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
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
            pa90 m = mt71.m(wzg0.ic_left, 0, btsVar);
            String e2 = ohb1.e(btsVar, rzh0.logistics_back_button);
            long j = ldc.f;
            uo5 uo5Var = x4c.x;
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            q4v.b(m, e2, an91.k(q791.d(ymb1.l(an91.o(cj6Var.a(c530Var, uo5Var), 16.0f, 0.0f, 0.0f, 0.0f, 14), cyk0.a), false, null, null, slsVar, 15), 8.0f), j, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0);
            wqy0.b(ohb1.d(c0i0.photo_preview_status_current_image, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, btsVar), cj6Var.a(c530Var, x4c.y), j, uh6.E(20), null, lzr.G, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar, 200064, 0, 131024);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, i2, i3, slsVar, f530Var);
        }
    }

    public static final void g(float f, int i, fid fidVar, f530 f530Var) {
        float f2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1930065166);
        int i2 = (btsVar.b(f) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f2 = f;
            f530Var2 = f530Var;
            cjf0.a(f2, f530Var2, ldc.f, 1.5f, 0L, btsVar, (i2 & 14) | 3456 | (i2 & 112));
        } else {
            f2 = f;
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xkb0(f2, f530Var2, i);
        }
    }

    public static final void h(int i, f530 f530Var, Float f, String str, sls slsVar, fid fidVar, int i2, int i3) {
        Float f2;
        int i4;
        sls slsVar2;
        int i5;
        bts btsVar;
        Float f3;
        sls slsVar3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(524725312);
        int i6 = i2 | (btsVar2.c(i) ? 4 : 2) | (btsVar2.k(f530Var) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            f2 = f;
        } else {
            f2 = f;
            i4 = i6 | (btsVar2.k(f2) ? 256 : 128);
        }
        int i8 = i4 | (btsVar2.k(str) ? 2048 : 1024);
        int i9 = i3 & 16;
        if (i9 != 0) {
            i5 = i8 | HProv.ALG_CLASS_DATA_ENCRYPT;
            slsVar2 = slsVar;
        } else {
            slsVar2 = slsVar;
            i5 = i8 | (btsVar2.e(slsVar2) ? 16384 : 8192);
        }
        int i10 = 0;
        if (btsVar2.V(i5 & 1, (i5 & 9363) != 9362)) {
            Float f4 = i7 != 0 ? null : f2;
            sls slsVar4 = i9 != 0 ? null : slsVar2;
            byk0 byk0Var = cyk0.a;
            long j = dl51.u;
            f530 m = ljs0.m(f530Var, 32.0f);
            boolean z = (i5 & HProv.ALG_CLASS_ALL) == 16384;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new zvr(20, slsVar4);
                btsVar2.o0(Q);
            }
            androidx.compose.runtime.internal.a S = wwg.S(1509397503, true, new wkb0(i, i10, f4, str), btsVar2);
            Float f5 = f4;
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q, m, byk0Var, j, 0L, null, null, null, false, null, null, null, S, btsVar, 0, 384, 4080);
            slsVar3 = slsVar4;
            f3 = f5;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f3 = f2;
            slsVar3 = slsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p91(i, f530Var, f3, str, slsVar3, i2, i3);
        }
    }

    public static final void i(pa90 pa90Var, boolean z, String str, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, sls slsVar, fid fidVar, int i) {
        pa90 pa90Var2;
        int i2;
        String str2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1646651971);
        if ((i & 6) == 0) {
            pa90Var2 = pa90Var;
            i2 = (btsVar.e(pa90Var2) ? 4 : 2) | i;
        } else {
            pa90Var2 = pa90Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= btsVar.k(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.c(photocommentsMode.ordinal()) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(tkb0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(slsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            f530 l = ymb1.l(n(photocommentsMode, tkb0Var), tkb0Var.a(btsVar));
            f530 f530Var = c530.a;
            f530 k = l.k(slsVar != null ? q791.d(f530Var, false, null, null, slsVar, 15) : f530Var);
            if (z) {
                btsVar.e0(-1706934733);
                f530Var = aab1.a(2.0f, dl51.u, f530Var, tkb0Var.a(btsVar));
                btsVar.t(false);
            } else {
                btsVar.e0(-1706731249);
                btsVar.t(false);
            }
            o4b1.b(pa90Var2, str2, k.k(f530Var), null, mhe.a, 0.0f, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i2 >> 3) & 112), 104);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(pa90Var, z, str, photocommentsMode, tkb0Var, slsVar, i, 9);
        }
    }

    public static final void j(mkb0 mkb0Var, String str, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, tls tlsVar, tls tlsVar2, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(449504444);
        int i2 = i | (btsVar.k(mkb0Var) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.c(photocommentsMode.ordinal()) ? 2048 : 1024) | (btsVar.k(tkb0Var) ? 16384 : 8192) | (btsVar.e(tlsVar) ? 131072 : 65536) | (btsVar.e(tlsVar2) ? 1048576 : 524288) | (btsVar.e(slsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (!btsVar.V(i2 & 1, (4793491 & i2) != 4793490)) {
            btsVar.Y();
        } else if (mkb0Var instanceof lkb0) {
            btsVar.e0(-1817914210);
            m((lkb0) mkb0Var, str, z, photocommentsMode, tkb0Var, tlsVar, tlsVar2, slsVar, btsVar, i2 & 33554430);
            btsVar = btsVar;
            btsVar.t(false);
        } else if (mkb0Var instanceof ikb0) {
            btsVar.e0(-1817904286);
            d((ikb0) mkb0Var, str, z, photocommentsMode, tkb0Var, tlsVar, tlsVar2, btsVar, i2 & 4194302);
            btsVar = btsVar;
            btsVar.t(false);
        } else {
            if (!(mkb0Var instanceof hkb0)) {
                throw unr0.y(-1817915690, btsVar, false);
            }
            btsVar.e0(-1817895329);
            a((hkb0) mkb0Var, str, z, photocommentsMode, tkb0Var, tlsVar, btsVar, i2 & 524286);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fc0(mkb0Var, str, z, photocommentsMode, tkb0Var, tlsVar, tlsVar2, slsVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(final dlb0 dlb0Var, final gv90 gv90Var, final boolean z, final PhotocommentsMode photocommentsMode, final tkb0 tkb0Var, f530 f530Var, j690 j690Var, final tls tlsVar, tls tlsVar2, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        j690 j690Var2;
        int i5;
        final tls tlsVar3;
        int i6;
        int i7;
        bts btsVar;
        sls slsVar2;
        f530 f530Var3;
        tls tlsVar4;
        j690 j690Var3;
        aii0 v;
        float b;
        i43 i43Var;
        Iterator it;
        mhb0 mhb0Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(208747050);
        if ((i & 6) == 0) {
            i3 = (btsVar2.e(dlb0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(gv90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.c(photocommentsMode.ordinal()) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.k(tkb0Var) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= ImageMetadata.EDGE_MODE;
        } else if ((196608 & i) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                j690Var2 = j690Var;
                i3 |= btsVar2.k(j690Var2) ? 1048576 : 524288;
                if ((i & 12582912) == 0) {
                    i3 |= btsVar2.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                }
                i5 = i2 & 256;
                if (i5 != 0) {
                    i3 |= 100663296;
                    tlsVar3 = tlsVar2;
                } else {
                    tlsVar3 = tlsVar2;
                    if ((i & 100663296) == 0) {
                        i3 |= btsVar2.e(tlsVar3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    }
                }
                i6 = i2 & 512;
                int i9 = i3;
                if (i6 != 0) {
                    i9 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i9 |= btsVar2.e(slsVar) ? 536870912 : SelfTester_JCP.IMITA;
                }
                i7 = i9;
                if (btsVar2.V(i7 & 1, (i7 & 306783379) != 306783378)) {
                    if (i8 != 0) {
                        f530Var2 = c530.a;
                    }
                    if (i4 != 0) {
                        j690Var2 = an91.b(16.0f, 0.0f, 2);
                    }
                    if (i5 != 0) {
                        tlsVar3 = null;
                    }
                    final sls slsVar3 = i6 != 0 ? null : slsVar;
                    List list = dlb0Var.a;
                    btsVar2.e0(-1563034988);
                    List list2 = list;
                    final ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    int i10 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            scc.m();
                            throw null;
                        }
                        mkb0 mkb0Var = (mkb0) next;
                        String d = ohb1.d(c0i0.delivery_photocomment_item_content_description, new Object[]{Integer.valueOf(i11)}, btsVar2);
                        if (mkb0Var instanceof jkb0) {
                            it = it2;
                            mhb0Var = new mhb0(((jkb0) mkb0Var).d, d, PhotoModel$Type.LOCAL);
                        } else {
                            it = it2;
                            if (mkb0Var instanceof kkb0) {
                                mhb0Var = new mhb0(((kkb0) mkb0Var).c, d, PhotoModel$Type.REMOTE);
                            } else if (mkb0Var instanceof ikb0) {
                                mhb0Var = new mhb0(((ikb0) mkb0Var).b, d, PhotoModel$Type.LOCAL);
                            } else {
                                if (!(mkb0Var instanceof hkb0)) {
                                    w511.b();
                                    return;
                                }
                                mhb0Var = new mhb0(((hkb0) mkb0Var).c, d, PhotoModel$Type.LOCAL);
                            }
                        }
                        arrayList.add(mhb0Var);
                        it2 = it;
                        i10 = i11;
                    }
                    btsVar2.t(false);
                    f530 f = ocb1.f(f530Var2, z, btsVar2, ((i7 >> 15) & 14) | ((i7 >> 3) & 112));
                    int i12 = clb0.b[photocommentsMode.ordinal()];
                    if (i12 == 1) {
                        b = tkb0Var.b();
                    } else {
                        if (i12 != 2) {
                            w511.b();
                            return;
                        }
                        b = tkb0Var.b() - 4.0f;
                    }
                    i43 i43Var2 = new i43(b, true, new quz(11));
                    boolean e = btsVar2.e(dlb0Var) | btsVar2.e(gv90Var) | btsVar2.e(arrayList) | ((29360128 & i7) == 8388608) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | ((57344 & i7) == 16384) | ((234881024 & i7) == 67108864) | ((1879048192 & i7) == 536870912);
                    Object Q = btsVar2.Q();
                    if (e || Q == did.a) {
                        i43Var = i43Var2;
                        tls tlsVar5 = new tls() { // from class: ykb0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                u6y u6yVar = (u6y) obj;
                                dlb0 dlb0Var2 = dlb0.this;
                                List list3 = dlb0Var2.a;
                                g990 g990Var = dlb0Var2.b ? new g990(13) : null;
                                ((m6y) u6yVar).f(list3.size(), g990Var != null ? new tj(17, g990Var, list3) : null, new qc0(list3, 24), new androidx.compose.runtime.internal.a(2039820996, new blb0(list3, gv90Var, arrayList, tlsVar, z, photocommentsMode, tkb0Var, tlsVar3, slsVar3), true));
                                return zy11.a;
                            }
                        };
                        btsVar2.o0(tlsVar5);
                        Q = tlsVar5;
                    } else {
                        i43Var = i43Var2;
                    }
                    btsVar = btsVar2;
                    adb1.b(f, null, j690Var2, i43Var, null, null, false, null, (tls) Q, btsVar, (i7 >> 12) & 896, 490);
                    f530Var3 = f530Var2;
                    slsVar2 = slsVar3;
                    j690Var3 = j690Var2;
                    tlsVar4 = tlsVar3;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    slsVar2 = slsVar;
                    f530Var3 = f530Var2;
                    tlsVar4 = tlsVar3;
                    j690Var3 = j690Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new d4y(dlb0Var, gv90Var, z, photocommentsMode, tkb0Var, f530Var3, j690Var3, tlsVar, tlsVar4, slsVar2, i, i2);
                    return;
                }
                return;
            }
            j690Var2 = j690Var;
            if ((i & 12582912) == 0) {
            }
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            i6 = i2 & 512;
            int i92 = i3;
            if (i6 != 0) {
            }
            i7 = i92;
            if (btsVar2.V(i7 & 1, (i7 & 306783379) != 306783378)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        j690Var2 = j690Var;
        if ((i & 12582912) == 0) {
        }
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        i6 = i2 & 512;
        int i922 = i3;
        if (i6 != 0) {
        }
        i7 = i922;
        if (btsVar2.V(i7 & 1, (i7 & 306783379) != 306783378)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void l(String str, String str2, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, sls slsVar, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        tkb0 tkb0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(718321215);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.k(str2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.c(photocommentsMode.ordinal()) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.k(tkb0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar.e(slsVar2) ? 131072 : 65536;
        } else {
            slsVar2 = slsVar;
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            ru.yandex.taxi.logistics.sdk.ui.component.icon.b b = ua3.b(str, mt71.m(t0h0.photocomment_placeholder, 0, btsVar), null, btsVar, 10);
            i(b, false, str2, photocommentsMode, tkb0Var, slsVar2, btsVar, i3 & 524272);
            tkb0Var2 = tkb0Var;
            if (jl40.l(b.k(), ra3.a)) {
                btsVar.e0(1980732917);
                ocb1.c(n(photocommentsMode, tkb0Var), 0.0f, 0L, 0L, tkb0Var2.a(btsVar), 0, null, btsVar, 0, 110);
                btsVar.t(false);
            } else {
                btsVar.e0(1980869379);
                btsVar.t(false);
            }
        } else {
            tkb0Var2 = tkb0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(str, str2, photocommentsMode, tkb0Var2, slsVar, i, 29);
        }
    }

    public static final void m(final lkb0 lkb0Var, final String str, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, tls tlsVar, tls tlsVar2, sls slsVar, fid fidVar, int i) {
        int i2;
        tkb0 tkb0Var2;
        PhotocommentsMode photocommentsMode2;
        int i3;
        o430 o430Var;
        final tls tlsVar3 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1540330994);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(lkb0Var) : btsVar.e(lkb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.c(photocommentsMode.ordinal()) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            tkb0Var2 = tkb0Var;
            i2 |= btsVar.k(tkb0Var2) ? 16384 : 8192;
        } else {
            tkb0Var2 = tkb0Var;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.e(slsVar) ? 8388608 : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (btsVar.V(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z2 = (29360128 & i2) == 8388608;
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z2 || Q == o430Var2) {
                Q = new PhotocommentsKt$SuccessPhotocommentItem$1$1(slsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
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
            if (lkb0Var instanceof jkb0) {
                btsVar.e0(-1265069423);
                boolean z3 = ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.e(lkb0Var))) | ((i2 & 112) == 32);
                Object Q2 = btsVar.Q();
                if (z3 || Q2 == o430Var2) {
                    tlsVar3 = tlsVar;
                    final int i4 = 0;
                    Q2 = new sls() { // from class: vkb0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            String str2 = str;
                            lkb0 lkb0Var2 = lkb0Var;
                            tls tlsVar4 = tlsVar3;
                            switch (i5) {
                                case 0:
                                    if (tlsVar4 == null) {
                                        ny61.g("onClicked is null");
                                        break;
                                    } else {
                                        tlsVar4.invoke(new mhb0(((jkb0) lkb0Var2).d, str2, PhotoModel$Type.LOCAL));
                                        break;
                                    }
                                default:
                                    if (tlsVar4 == null) {
                                        ny61.g("onClicked is null");
                                        break;
                                    } else {
                                        tlsVar4.invoke(new mhb0(((kkb0) lkb0Var2).c, str2, PhotoModel$Type.REMOTE));
                                        break;
                                    }
                            }
                            return null;
                        }
                    };
                    btsVar.o0(Q2);
                } else {
                    tlsVar3 = tlsVar;
                }
                sls slsVar3 = (sls) Q2;
                String str2 = ((jkb0) lkb0Var).d;
                sls slsVar4 = tlsVar3 != null ? slsVar3 : null;
                i3 = i2;
                o430Var = o430Var2;
                e(str2, false, str, photocommentsMode, tkb0Var2, slsVar4, btsVar, (57344 & i2) | ((i2 << 3) & 896) | (i2 & 7168), 2);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                tlsVar3 = tlsVar;
                i3 = i2;
                o430Var = o430Var2;
                if (!(lkb0Var instanceof kkb0)) {
                    throw unr0.y(97737370, btsVar, false);
                }
                btsVar.e0(-1264390306);
                boolean z4 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar.e(lkb0Var))) | ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) | ((i3 & 112) == 32);
                Object Q3 = btsVar.Q();
                if (z4 || Q3 == o430Var) {
                    final int i5 = 1;
                    Q3 = new sls() { // from class: vkb0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i52 = i5;
                            zy11 zy11Var = zy11.a;
                            String str22 = str;
                            lkb0 lkb0Var2 = lkb0Var;
                            tls tlsVar4 = tlsVar3;
                            switch (i52) {
                                case 0:
                                    if (tlsVar4 == null) {
                                        ny61.g("onClicked is null");
                                        break;
                                    } else {
                                        tlsVar4.invoke(new mhb0(((jkb0) lkb0Var2).d, str22, PhotoModel$Type.LOCAL));
                                        break;
                                    }
                                default:
                                    if (tlsVar4 == null) {
                                        ny61.g("onClicked is null");
                                        break;
                                    } else {
                                        tlsVar4.invoke(new mhb0(((kkb0) lkb0Var2).c, str22, PhotoModel$Type.REMOTE));
                                        break;
                                    }
                            }
                            return null;
                        }
                    };
                    btsVar.o0(Q3);
                }
                l(((kkb0) lkb0Var).c, str, photocommentsMode, tkb0Var, tlsVar3 != null ? (sls) Q3 : null, btsVar, ((i3 << 3) & 896) | (i3 & 7168) | (57344 & i3));
                btsVar.t(false);
            }
            photocommentsMode2 = photocommentsMode;
            if (photocommentsMode2 != PhotocommentsMode.MUTABLE || z) {
                btsVar.e0(-1263371894);
                btsVar.t(false);
            } else {
                btsVar.e0(-1263697022);
                int i6 = t0h0.ic_delivery_close;
                String e = ohb1.e(btsVar, c0i0.delivery_photocomment_delete_button_content_description);
                f530 a = cj6.a.a(c530Var, x4c.w);
                boolean z5 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar.e(lkb0Var))) | ((3670016 & i3) == 1048576);
                Object Q4 = btsVar.Q();
                if (z5 || Q4 == o430Var) {
                    Q4 = new xw90(tlsVar2, 16, lkb0Var);
                    btsVar.o0(Q4);
                }
                h(i6, a, null, e, (sls) Q4, btsVar, 0, 4);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            photocommentsMode2 = photocommentsMode;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z07(lkb0Var, str, z, photocommentsMode2, tkb0Var, tlsVar3, tlsVar2, slsVar, i);
        }
    }

    public static final f530 n(PhotocommentsMode photocommentsMode, tkb0 tkb0Var) {
        int i = clb0.b[photocommentsMode.ordinal()];
        c530 c530Var = c530.a;
        if (i == 1) {
            return ljs0.m(c530Var, tkb0Var.c());
        }
        if (i == 2) {
            return an91.o(ljs0.m(c530Var, tkb0Var.c() + 4.0f), 0.0f, 4.0f, 4.0f, 0.0f, 9);
        }
        w511.b();
        return null;
    }
}
