package ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.a91;
import defpackage.aad;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dk91;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fzv;
import defpackage.gl51;
import defpackage.gv40;
import defpackage.gza1;
import defpackage.h12;
import defpackage.iu30;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.kj5;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lvi0;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.m4m0;
import defpackage.my30;
import defpackage.n;
import defpackage.nnm;
import defpackage.o430;
import defpackage.o990;
import defpackage.oa01;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.p990;
import defpackage.pi6;
import defpackage.q791;
import defpackage.q990;
import defpackage.qic;
import defpackage.qje;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.r5y;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.sm91;
import defpackage.so5;
import defpackage.t990;
import defpackage.teb;
import defpackage.tfx;
import defpackage.tls;
import defpackage.tse0;
import defpackage.u290;
import defpackage.u990;
import defpackage.ur70;
import defpackage.v990;
import defpackage.vwb;
import defpackage.w990;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wzr;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.x990;
import defpackage.ya2;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zgb1;
import defpackage.zl50;
import defpackage.zy11;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.logistics.sdk.screen_paid_insurance.PaidInsuranceScreen$Companion$ButtonStyle;
import ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui.a;
import ru.yandex.taxi.logistics.sdk.ui.component.control.e;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(CharSequence charSequence, CharSequence charSequence2, PaidInsuranceScreen$Companion$ButtonStyle paidInsuranceScreen$Companion$ButtonStyle, String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-188121776);
        int i2 = i | (btsVar.e(charSequence) ? 4 : 2) | (btsVar.e(charSequence2) ? 32 : 16) | (btsVar.c(paidInsuranceScreen$Companion$ButtonStyle == null ? -1 : paidInsuranceScreen$Companion$ButtonStyle.ordinal()) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024);
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.Y();
        } else if (charSequence != null) {
            btsVar.e0(596686340);
            so5 so5Var = x4c.H;
            boolean e = btsVar.e(charSequence) | btsVar.e(charSequence2);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new vwb(charSequence, charSequence2, 3);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(c530.a, (tls) Q);
            sic a2 = qic.a(lr20.c, so5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a);
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
            qje.W(btsVar, d.d, d);
            zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, i2 & 14, 254);
            if (charSequence2 == null) {
                btsVar.e0(-492917944);
                btsVar.t(false);
            } else {
                btsVar.e0(-492917943);
                zgb1.a(charSequence2, null, 0, false, null, null, false, null, btsVar, 0, 254);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(false);
        } else {
            btsVar.e0(597058619);
            ymb1.e(str, null, ((el51) btsVar.m(gl51.a)).p(), null, paidInsuranceScreen$Companion$ButtonStyle == PaidInsuranceScreen$Companion$ButtonStyle.MINOR ? lzr.D : lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 >> 9) & 14, 0, 65514);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(charSequence, charSequence2, paidInsuranceScreen$Companion$ButtonStyle, str, i, 25);
        }
    }

    public static final void b(String str, String str2, String str3, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        f530 a;
        androidx.compose.runtime.internal.a aVar;
        androidx.compose.runtime.internal.a aVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(964295749);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(str2) ? 32 : 16) | (btsVar2.k(str3) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            if (str2 == null) {
                btsVar2.e0(-1701427407);
                btsVar2.t(false);
                a = null;
            } else {
                btsVar2.e0(-1701427406);
                boolean k = ((i2 & 7168) == 2048) | btsVar2.k(str2);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    Q = new a91(tlsVar, str2, 11);
                    btsVar2.o0(Q);
                }
                f530 d = q791.d(c530Var, false, null, null, (sls) Q, 15);
                boolean z = (i2 & 14) == 4;
                Object Q2 = btsVar2.Q();
                if (z || Q2 == o430Var) {
                    Q2 = new my30(str, 14);
                    btsVar2.o0(Q2);
                }
                a = fnq0.a(d, (tls) Q2);
                btsVar2.t(false);
            }
            if (a == null) {
                a = c530Var;
            }
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, a);
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
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d3);
            f530 m = an91.m(c530Var, 7.5f, 0.0f, 2);
            if (str3 == null) {
                btsVar2.e0(-156164035);
                btsVar2.t(false);
                aVar = null;
            } else {
                btsVar2.e0(-156164034);
                androidx.compose.runtime.internal.a S = wwg.S(-1646632601, true, new fzv(str3, 11), btsVar2);
                btsVar2.t(false);
                aVar = S;
            }
            androidx.compose.runtime.internal.a S2 = wwg.S(-1284499301, true, new fzv(str, 12), btsVar2);
            if (str2 != null) {
                aad.a.getClass();
                aVar2 = aad.b;
            } else {
                aVar2 = null;
            }
            web1.c(m, 0.0f, false, 0.0f, null, aVar, S2, null, null, aVar2, null, str2 == null ? oa01.c : oa01.a, false, btsVar2, 1572870, 0, 5534);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) str, (Object) str2, (Object) str3, tlsVar, i, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void c(final List list, fid fidVar, final int i) {
        final int i2;
        final List list2;
        final int i3;
        bts btsVar;
        androidx.compose.runtime.internal.a S;
        char c;
        List list3 = list;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1899523285);
        dmw0 dmw0Var = btsVar2.a;
        int i4 = btsVar2.S ? -btsVar2.I.v : btsVar2.G.i;
        int i5 = 2;
        int i6 = (i & 6) == 0 ? i | (btsVar2.e(list3) ? 4 : 2) : i;
        ?? r8 = 0;
        ?? r9 = 1;
        if (btsVar2.V(i6 & 1, (i6 & 3) != 2)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (Q == o430Var) {
                teb tebVar = new teb(20);
                btsVar2.o0(tebVar);
                obj = tebVar;
            }
            c530 c530Var = c530.a;
            f530 b = fnq0.b(c530Var, true, (tls) obj);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, b);
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
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            btsVar2.e0(1304935624);
            btsVar2.e0(1704663055);
            bts btsVar3 = btsVar2;
            for (Object obj2 : list3) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Object Q2 = btsVar3.Q();
                Object obj3 = Q2;
                if (Q2 == o430Var) {
                    btsVar3.o0("");
                    obj3 = "";
                }
                ref$ObjectRef.element = (String) obj3;
                if (obj2 instanceof String) {
                    btsVar3.e0(-1493367146);
                    S = wwg.S(-1536362191, r9, new iu30(28, (String) obj2, ref$ObjectRef), btsVar3);
                    btsVar3.t(r8);
                } else {
                    if (!(obj2 instanceof CharSequence)) {
                        boolean z = r8;
                        btsVar3.e0(-1492872324);
                        btsVar3.t(z);
                        btsVar3.x(i4);
                        aii0 v = btsVar3.v();
                        if (v != null) {
                            final int i7 = z ? 1 : 0;
                            v.d = new wls() { // from class: n990
                                @Override // defpackage.wls
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i8 = i7;
                                    zy11 zy11Var = zy11.a;
                                    int i9 = i;
                                    List list4 = list;
                                    fid fidVar2 = (fid) obj4;
                                    ((Integer) obj5).getClass();
                                    switch (i8) {
                                        case 0:
                                            a.c(list4, fidVar2, vng.O(i9 | 1));
                                            break;
                                        default:
                                            a.c(list4, fidVar2, vng.O(i9 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    btsVar3.e0(-1493156811);
                    S = wwg.S(-1703449062, r9, new iu30((CharSequence) obj2, ref$ObjectRef), btsVar3);
                    btsVar3.t(r8);
                }
                f530 a2 = fnq0.a(an91.m(c530Var, 16.0f, 0.0f, i5), new h12(i5, ref$ObjectRef));
                lhl0 a3 = khl0.a(lr20.a, x4c.D, btsVar3, r8);
                int hashCode2 = Long.hashCode(btsVar3.T);
                r1b0 o2 = btsVar3.o();
                f530 d2 = b.d(btsVar3, a2);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar2);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, d.f, a3);
                qje.W(btsVar3, d.e, o2);
                wls wlsVar2 = d.g;
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar3, hashCode2, wlsVar2);
                }
                qje.W(btsVar3, d.d, d2);
                lzr lzrVar = lzr.G;
                f530 f = sm91.f(an91.m(c530Var, 10.0f, 0.0f, i5), 0.0f, -4.0f, r9);
                Object Q3 = btsVar3.Q();
                if (Q3 == o430Var) {
                    c = 20;
                    Q3 = new teb(20);
                    btsVar3.o0(Q3);
                } else {
                    c = 20;
                }
                bts btsVar4 = btsVar3;
                c530 c530Var2 = c530Var;
                ymb1.e(Extension.DOT_CHAR, fnq0.a(f, (tls) Q3), 0L, null, lzrVar, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar4, 24582, 0, 65516);
                bts btsVar5 = btsVar4;
                nnm.p(0, S, btsVar5, true);
                oeb1.c(btsVar5, ljs0.e(c530Var2, 16.0f));
                r8 = 0;
                c530Var = c530Var2;
                r9 = 1;
                i5 = i5;
                o430Var = o430Var;
                i4 = i4;
                list3 = list;
                btsVar3 = btsVar5;
            }
            i2 = i;
            list2 = list3;
            boolean z2 = r8;
            boolean z3 = r9;
            tse0.t(btsVar3, z2, z2, z3);
            btsVar = btsVar3;
            i3 = z3;
        } else {
            i2 = i;
            list2 = list3;
            i3 = 1;
            btsVar2.Y();
            btsVar = btsVar2;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls() { // from class: n990
                @Override // defpackage.wls
                public final Object invoke(Object obj4, Object obj5) {
                    int i8 = i3;
                    zy11 zy11Var = zy11.a;
                    int i9 = i2;
                    List list4 = list2;
                    fid fidVar2 = (fid) obj4;
                    ((Integer) obj5).getClass();
                    switch (i8) {
                        case 0:
                            a.c(list4, fidVar2, vng.O(i9 | 1));
                            break;
                        default:
                            a.c(list4, fidVar2, vng.O(i9 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    public static final void d(x990 x990Var, q990 q990Var, fid fidVar, int i) {
        ?? r0;
        bts btsVar;
        c530 c530Var;
        zy11 zy11Var;
        String str;
        String str2;
        boolean z;
        o430 o430Var;
        Triple triple;
        long f;
        float f2;
        String str3;
        q990 q990Var2 = q990Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1281571853);
        int i2 = (btsVar2.k(x990Var) ? 4 : 2) | i | (btsVar2.k(q990Var2) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = n.f(x990Var.B, btsVar2);
            }
            oz40 oz40Var = (oz40) Q;
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            c530 c530Var2 = c530.a;
            f530 d = b.d(btsVar2, c530Var2);
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
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            String str4 = x990Var.x;
            if (str4 == null) {
                btsVar2.e0(-688786250);
                btsVar2.t(false);
                zy11Var = null;
                c530Var = c530Var2;
            } else {
                btsVar2.e0(-688786249);
                c530Var = c530Var2;
                s3b1.f(new lvi0(str4, null, null, null, null, 62), ljs0.e(c530Var2, 128.0f), null, btsVar2, 48, 4);
                btsVar2.t(false);
                zy11Var = zy11.a;
            }
            if (zy11Var == null) {
                tse0.s(btsVar2, -1823329659, c530Var, 8.0f, btsVar2);
            } else {
                btsVar2.e0(-1823334650);
            }
            btsVar2.t(false);
            String str5 = x990Var.a;
            List list = x990Var.b;
            List list2 = x990Var.c;
            v990 v990Var = x990Var.w;
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var2) {
                Q2 = new zl50(26, q990Var2, oz40Var);
                btsVar2.o0(Q2);
            }
            e(str5, list, list2, v990Var, booleanValue, (tls) Q2, btsVar2, 0);
            dk91.a(0.0f, 6, 6, 0L, btsVar2, an91.m(c530Var, 16.0f, 0.0f, 2));
            w990 w990Var = x990Var.y;
            if (w990Var == null) {
                btsVar2.e0(-688135808);
                btsVar2.t(false);
                o430Var = o430Var2;
                z = false;
            } else {
                btsVar2.e0(-688135807);
                String str6 = w990Var.a;
                String str7 = w990Var.b;
                String str8 = w990Var.c;
                boolean z3 = i3 == 32;
                Object Q3 = btsVar2.Q();
                if (z3 || Q3 == o430Var2) {
                    str = str8;
                    str2 = str7;
                    z = false;
                    o430Var = o430Var2;
                    PaidInsuranceKt$PaidInsurance$1$3$1$1 paidInsuranceKt$PaidInsurance$1$3$1$1 = new PaidInsuranceKt$PaidInsurance$1$3$1$1(1, q990Var2, q990.class, "openDeeplink", "openDeeplink(Ljava/lang/String;)V", 0);
                    btsVar2.o0(paidInsuranceKt$PaidInsurance$1$3$1$1);
                    Q3 = paidInsuranceKt$PaidInsurance$1$3$1$1;
                } else {
                    o430Var = o430Var2;
                    str = str8;
                    str2 = str7;
                    z = false;
                }
                b(str6, str2, str, (tls) ((tfx) Q3), btsVar2, 0);
                btsVar2.t(z);
            }
            oeb1.c(btsVar2, ljs0.e(c530Var, 4.0f));
            u990 u990Var = x990Var.A;
            if (u990Var == null) {
                triple = new Triple(null, null, null);
            } else if (((Boolean) oz40Var.getValue()).booleanValue()) {
                t990 t990Var = u990Var.a;
                triple = new Triple(t990Var.a, t990Var.b, t990Var.c);
            } else {
                t990 t990Var2 = u990Var.b;
                triple = new Triple(t990Var2.a, t990Var2.b, t990Var2.c);
            }
            CharSequence charSequence = (CharSequence) triple.getFirst();
            CharSequence charSequence2 = (CharSequence) triple.getSecond();
            PaidInsuranceScreen$Companion$ButtonStyle paidInsuranceScreen$Companion$ButtonStyle = (PaidInsuranceScreen$Companion$ButtonStyle) triple.getThird();
            if ((paidInsuranceScreen$Companion$ButtonStyle == null ? -1 : p990.a[paidInsuranceScreen$Companion$ButtonStyle.ordinal()]) == 1) {
                btsVar2.e0(-1823292503);
                f = ((el51) btsVar2.m(gl51.a)).g();
                btsVar2.t(z);
            } else {
                btsVar2.e0(-1823290840);
                f = ((el51) btsVar2.m(gl51.a)).f();
                btsVar2.t(z);
            }
            long j = f;
            f530 m = an91.m(ljs0.c(ljs0.e(c530Var, 56.0f), 1.0f), 8.0f, 0.0f, 2);
            boolean z4 = i3 != 32 ? z : true;
            Object Q4 = btsVar2.Q();
            if (z4 || Q4 == o430Var) {
                f2 = 8.0f;
                q990Var2 = q990Var;
                Q4 = new PaidInsuranceKt$PaidInsurance$1$5$1(0, q990Var2, q990.class, "dismissView", "dismissView()V", 0);
                btsVar2.o0(Q4);
            } else {
                q990Var2 = q990Var;
                f2 = 8.0f;
            }
            tfx tfxVar = (tfx) Q4;
            if (charSequence == null || (str3 = charSequence.toString()) == null) {
                str3 = x990Var.z;
            }
            String str9 = str3;
            r0 = z;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) tfxVar, m, null, j, 0L, null, false, str9, null, null, wwg.S(100834534, true, new r5y(charSequence, charSequence2, paidInsuranceScreen$Companion$ButtonStyle, x990Var, 11), btsVar2), btsVar2, 0, 3572);
            btsVar = btsVar2;
            ly3.B(c530Var, f2, btsVar, true);
        } else {
            r0 = 0;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o990(x990Var, q990Var2, i, r0);
        }
    }

    public static final void e(String str, List list, List list2, v990 v990Var, boolean z, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2002971166);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.e(list) ? 32 : 16) | (btsVar2.e(list2) ? 256 : 128) | (btsVar2.k(v990Var) ? 2048 : 1024) | (btsVar2.a(z) ? 16384 : 8192) | (btsVar2.e(tlsVar) ? 131072 : 65536);
        if (btsVar2.V(i2 & 1, (i2 & 74899) != 74898)) {
            f530 o = an91.o(c530.a, 16.0f, 0.0f, 16.0f, 12.0f, 2);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new ur70(28);
                btsVar2.o0(Q);
            }
            ymb1.j(str, fnq0.b(o, false, (tls) Q), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65516);
            btsVar = btsVar2;
            if (v990Var == null) {
                btsVar.e0(-532901170);
            } else {
                btsVar.e0(-532901169);
                f(v990Var, z, tlsVar, btsVar, (i2 >> 9) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
            }
            btsVar.t(false);
            if (list2 != null) {
                btsVar.e0(-532820135);
                c(list2, btsVar, (i2 >> 6) & 14);
                btsVar.t(false);
            } else if (list != null) {
                btsVar.e0(-532750757);
                c(list, btsVar, (i2 >> 3) & 14);
                btsVar.t(false);
            } else {
                btsVar.e0(-532715200);
                btsVar.t(false);
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ya2(str, list, list2, v990Var, z, tlsVar, i);
        }
    }

    public static final void f(v990 v990Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1733808038);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(v990Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(m4m0.b(an91.o(c530Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), ((el51) btsVar.m(gl51.a)).g(), ((YandexShapes) btsVar.m(qm51.a)).b()), 56.0f);
            boolean z2 = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new u290(4, v990Var);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(e, true, (tls) Q);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            x2y d4 = n.d(btsVar, d3, wlsVar4, 1.0f, true);
            z910 d5 = pi6.d(x4c.b, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d6 = b.d(btsVar, d4);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d5);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d6);
            zgb1.a(v990Var.a, an91.m(c530Var, 16.0f, 0.0f, 2), 3, false, null, null, false, null, btsVar, 432, 248);
            btsVar.t(true);
            CharSequence charSequence = v990Var.b;
            if (charSequence == null) {
                btsVar.e0(1449495093);
            } else {
                btsVar.e0(1449495094);
                zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
            }
            btsVar.t(false);
            f530 b2 = gza1.b(ljs0.e(ljs0.q(an91.o(c530Var, 8.0f, 0.0f, 16.0f, 0.0f, 10), 52.0f), 34.0f), 1.0f, 1.0f);
            long j = ldc.f;
            boolean z3 = (i2 & 896) == 256;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new gv40(5, tlsVar);
                btsVar.o0(Q2);
            }
            e.a(b2, z, false, 0L, 0L, j, (tls) Q2, null, btsVar, (i2 & 112) | ImageMetadata.EDGE_MODE, 156);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(v990Var, z, tlsVar, i, 9);
        }
    }
}
