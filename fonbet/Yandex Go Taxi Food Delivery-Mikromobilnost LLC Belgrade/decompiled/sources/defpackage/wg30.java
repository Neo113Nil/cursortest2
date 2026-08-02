package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.a;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final /* synthetic */ class wg30 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wg30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        sda0 sda0Var = (sda0) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            tka0.c(sda0Var.c, btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        sja0 sja0Var = (sja0) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            jeb1.f(sja0Var.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 0, 0, 16382);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0994, code lost:
    
        if (r5 == defpackage.did.a) goto L317;
     */
    @Override // defpackage.zls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Address address;
        Object obj4;
        int i = this.a;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        zzs zzsVar = null;
        boolean z = true;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                lm30 lm30Var = (lm30) obj5;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    qgy.b(lm30Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16382);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                si30 si30Var = (si30) obj5;
                PointType pointType = (PointType) obj;
                Address address2 = (Address) obj2;
                pv0 pv0Var = (pv0) obj3;
                e90 e90Var = si30Var.H;
                if (e90Var != null) {
                    e90Var.f();
                }
                int i2 = oi30.a[pointType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    if (pv0Var != null && (address = pv0Var.a) != null) {
                        zzsVar = address.B();
                    }
                } else if (address2 != null) {
                    zzsVar = address2.B();
                }
                lc30 lc30Var = new lc30(pointType, pv0Var, zzsVar);
                si30Var.E((m950) si30Var.G.get(), lc30Var, new ri30(lc30Var, si30Var), hxx.a);
                return zy11Var;
            case 2:
                PointType pointType2 = (PointType) obj;
                Address address3 = (Address) obj2;
                pv0 pv0Var2 = (pv0) obj3;
                wg30 wg30Var = ((ti30) obj5).e;
                if (wg30Var != null) {
                    wg30Var.invoke(pointType2, address3, pv0Var2);
                }
                return zy11Var;
            case 3:
                km30 km30Var = (km30) obj5;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    u92 u92Var = km30Var.d;
                    if (u92Var == null) {
                        btsVar2.e0(-1234431493);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1234431492);
                        o4b1.c(u92Var, null, null, null, null, 0.0f, null, 0, btsVar2, 48, 252);
                        btsVar2.t(false);
                    }
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 4:
                fu30 fu30Var = (fu30) obj5;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    jeb1.f(fu30Var.b, ljs0.c(c530Var, 1.0f), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.a, btsVar3, 432, 0, 16376);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 5:
                my6 my6Var = (my6) obj5;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    jeb1.f(my6Var.a.toString(), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.b, btsVar4, 0, 0, 16382);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 6:
                g140 g140Var = (g140) obj5;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    tdu tduVar = g140Var.a;
                    String str = tduVar.a;
                    ety0 ety0Var = xya1.e(btsVar5).f.c;
                    hk2 hk2Var = new hk2(0);
                    String str2 = tduVar.b;
                    String str3 = tduVar.c;
                    hk2Var.d(str2);
                    if (str3.length() > 0) {
                        hk2Var.d(" · ");
                        n6b1.a(hk2Var, "[walkman_icon]", "walkman");
                        hk2Var.d(" ");
                        hk2Var.d(str3);
                    }
                    kk2 i3 = hk2Var.i();
                    boolean k = btsVar5.k(str3);
                    Object Q = btsVar5.Q();
                    if (!k) {
                        obj4 = Q;
                        break;
                    }
                    r3c0 r3c0Var = new r3c0(4, uh6.E(13), uh6.E(13));
                    i9d.a.getClass();
                    Map e = gw00.e(new Pair("[walkman_icon]", new oxv(r3c0Var, i9d.b)));
                    btsVar5.o0(e);
                    obj4 = e;
                    p9b1.a(ebp0Var, str, null, null, ety0Var, 0, 0, i3, (Map) obj4, AppColor$Palette.Text, null, 0, 0, btsVar5, (intValue5 & 14) | 805306368);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 7:
                p440 p440Var = (p440) obj5;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    sic a = qic.a(g43Var, x4c.G, btsVar6, 0);
                    int hashCode = Long.hashCode(btsVar6.T);
                    r1b0 o = btsVar6.o();
                    c530 c530Var2 = c530.a;
                    f530 d = b.d(btsVar6, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a);
                    qje.W(btsVar6, d.e, o);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d);
                    n440 n440Var = (n440) p440Var;
                    String str4 = n440Var.a;
                    List list = n440Var.d;
                    jeb1.f(str4, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar6).f.c, btsVar6, 384, 0, 16378);
                    if (list.isEmpty()) {
                        btsVar6.e0(761377931);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(761153057);
                        bpb1.c(list, xya1.e(btsVar6).h.a, an91.o(c530Var2, 0.0f, 1.0f, 0.0f, 0.0f, 13), btsVar6, 384);
                        btsVar6.t(false);
                    }
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 8:
                u540 u540Var = (u540) obj5;
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((bts) fidVar7).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                    p9b1.c(ebp0Var2, u540Var.a.a.a, null, null, xya1.e(btsVar7).f.c, 0, 0, u540Var.a.a.b, AppColor$Palette.Text, null, 0, 0, null, btsVar7, (intValue7 & 14) | 100663296, 0, 7990);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 9:
                czy0 czy0Var = (czy0) obj5;
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar8).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    p9b1.c(ebp0Var3, czy0Var.a.a.a, null, null, xya1.e(btsVar8).f.c, 0, 0, czy0Var.a.a.b, AppColor$Palette.Text, null, 0, 0, null, btsVar8, (intValue8 & 14) | 100663296, 0, 7990);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 10:
                u510 u510Var = (u510) obj5;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    qgy.b(u510Var.d, null, c530.a, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar9).f.d, null, btsVar9, 3456, 0, 12274);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 11:
                lja0 lja0Var = (lja0) obj5;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    qgy.b(lja0Var.a, null, c530.a, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar10).f.d, null, btsVar10, 3456, 0, 12274);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 12:
                m1a0 m1a0Var = (m1a0) obj5;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    jeb1.f(cvu0.v(m1a0Var.a(), "••••", ChallengerInputView.DEFAULT_SMS_HINT, false), c530.a, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar11).g.a, btsVar11, 432, 0, 16376);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 13:
                nn40 nn40Var = (nn40) obj5;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((bts) fidVar12).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 19) != 18)) {
                    dqb1.f(ibp0Var, nn40Var, null, btsVar12, intValue12 & 14);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 14:
                ln40 ln40Var = (ln40) obj5;
                ebp0 ebp0Var4 = (ebp0) obj;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((bts) fidVar13).k(ebp0Var4) ? 4 : 2;
                }
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 19) != 18)) {
                    dqb1.d(ebp0Var4, ln40Var, null, btsVar13, intValue13 & 14);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 15:
                on40 on40Var = (on40) obj5;
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((bts) fidVar14).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 19) != 18)) {
                    dqb1.g(ibp0Var2, on40Var, null, btsVar14, intValue14 & 14);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 16:
                pn40 pn40Var = (pn40) obj5;
                ibp0 ibp0Var3 = (ibp0) obj;
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((bts) fidVar15).k(ibp0Var3) ? 4 : 2;
                }
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 19) != 18)) {
                    dqb1.h(ibp0Var3, pn40Var, null, btsVar15, intValue15 & 14);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 17:
                lz6 lz6Var = (lz6) obj5;
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    qgy.b(lz6Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar16, 0, 0, 16382);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 18:
                cu40 cu40Var = (cu40) obj5;
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    qgy.b(cu40Var.b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar17, 0, 0, 16382);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 19:
                fao faoVar = (fao) obj5;
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar18, faoVar.b), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar18, 0, 0, 32766);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 20:
                a360 a360Var = (a360) obj5;
                fid fidVar19 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    zgb1.b(a360Var.a, a360Var.b, null, x4c.H, 0, false, null, null, null, null, btsVar19, HProv.ALG_TYPE_SECURECHANNEL, 1012);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 21:
                String str5 = ((sa01) obj5).e;
                fid fidVar20 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar20 = (bts) fidVar20;
                if (!btsVar20.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    btsVar20.Y();
                } else if (str5.length() > 0) {
                    btsVar20.e0(-1769783325);
                    v0b1.a(mja1.b(str5, null, 6), ljs0.q(c530Var, r14.f), null, null, null, null, null, null, 0.0f, 0, btsVar20, 0, 1020);
                    btsVar20.t(false);
                } else {
                    btsVar20.e0(-1769661092);
                    btsVar20.t(false);
                }
                return zy11Var;
            case 22:
                uo9 uo9Var = (uo9) obj5;
                fid fidVar21 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                bts btsVar21 = (bts) fidVar21;
                if (btsVar21.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    sic a2 = qic.a(g43Var, x4c.G, btsVar21, 0);
                    int hashCode2 = Long.hashCode(btsVar21.T);
                    r1b0 o2 = btsVar21.o();
                    f530 d2 = b.d(btsVar21, c530Var);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar21.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar21.i0();
                    if (btsVar21.S) {
                        btsVar21.n(slsVar2);
                    } else {
                        btsVar21.r0();
                    }
                    qje.W(btsVar21, d.f, a2);
                    qje.W(btsVar21, d.e, o2);
                    qje.W(btsVar21, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar21, d.h);
                    qje.W(btsVar21, d.d, d2);
                    qgy.b(uo9Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar21).g.b, null, btsVar21, 0, 0, 12286);
                    CharSequence charSequence = uo9Var.b;
                    if (charSequence == null) {
                        btsVar21.e0(-1320718566);
                        btsVar21.t(false);
                    } else {
                        btsVar21.e0(-1320718565);
                        if (evu0.J(charSequence)) {
                            btsVar21.e0(378582898);
                            btsVar21.t(false);
                        } else {
                            btsVar21.e0(378471422);
                            qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar21).h.a, null, btsVar21, 0, 0, 12286);
                            btsVar21.t(false);
                        }
                        btsVar21.t(false);
                    }
                    btsVar21.t(true);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
            case 23:
                n07 n07Var = (n07) obj5;
                bj6 bj6Var = (bj6) obj;
                fid fidVar22 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((bts) fidVar22).k(bj6Var) ? 4 : 2;
                }
                bts btsVar22 = (bts) fidVar22;
                if (btsVar22.V(intValue22 & 1, (intValue22 & 19) != 18)) {
                    v4v v4vVar = n07Var.c;
                    if (v4vVar == null) {
                        btsVar22.e0(367466842);
                        btsVar22.t(false);
                    } else {
                        btsVar22.e0(367466843);
                        s3b1.f(v4vVar, an91.o(bj6Var.a(c530Var, x4c.x), 18.0f, 0.0f, 0.0f, 0.0f, 14), null, btsVar22, 0, 4);
                        btsVar22.t(false);
                    }
                    aib1.c(null, n07Var.a, n07Var.b, x4c.H, btsVar22, HProv.ALG_TYPE_SECURECHANNEL, 1);
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
            case 24:
                l2a0 l2a0Var = (l2a0) obj5;
                fid fidVar23 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                bts btsVar23 = (bts) fidVar23;
                if (btsVar23.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                    a.b(l2a0Var, btsVar23, 0);
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
            case 25:
                dx90 dx90Var = (dx90) obj5;
                fid fidVar24 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                bts btsVar24 = (bts) fidVar24;
                boolean V = btsVar24.V(intValue24 & 1, (intValue24 & 17) != 16);
                dmw0 dmw0Var = btsVar24.a;
                if (V) {
                    lhl0 a3 = khl0.a(lr20.a, x4c.E, btsVar24, 48);
                    int hashCode3 = Long.hashCode(btsVar24.T);
                    r1b0 o3 = btsVar24.o();
                    c530 c530Var3 = c530.a;
                    f530 d3 = b.d(btsVar24, c530Var3);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar24.i0();
                    if (btsVar24.S) {
                        btsVar24.n(slsVar3);
                    } else {
                        btsVar24.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar24, wlsVar, a3);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar24, wlsVar2, o3);
                    wls wlsVar3 = d.g;
                    if (btsVar24.S || !jl40.l(btsVar24.Q(), Integer.valueOf(hashCode3))) {
                        b64.z(hashCode3, btsVar24, hashCode3, wlsVar3);
                    }
                    wls wlsVar4 = d.d;
                    qje.W(btsVar24, wlsVar4, d3);
                    f530 m = ljs0.m(c530Var3, dx90Var.c);
                    z910 d4 = pi6.d(x4c.y, false);
                    int hashCode4 = Long.hashCode(btsVar24.T);
                    r1b0 o4 = btsVar24.o();
                    f530 d5 = b.d(btsVar24, m);
                    btsVar24.i0();
                    if (btsVar24.S) {
                        btsVar24.n(slsVar3);
                    } else {
                        btsVar24.r0();
                    }
                    qje.W(btsVar24, wlsVar, d4);
                    qje.W(btsVar24, wlsVar2, o4);
                    if (btsVar24.S || !jl40.l(btsVar24.Q(), Integer.valueOf(hashCode4))) {
                        b64.z(hashCode4, btsVar24, hashCode4, wlsVar3);
                    }
                    qje.W(btsVar24, wlsVar4, d5);
                    s3b1.f(dx90Var.d, null, null, btsVar24, 0, 6);
                    btsVar24.t(true);
                    f530 o5 = an91.o(c530Var3, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    sic a4 = qic.a(lr20.e, x4c.G, btsVar24, 6);
                    int hashCode5 = Long.hashCode(btsVar24.T);
                    r1b0 o6 = btsVar24.o();
                    f530 d6 = b.d(btsVar24, o5);
                    btsVar24.i0();
                    if (btsVar24.S) {
                        btsVar24.n(slsVar3);
                    } else {
                        btsVar24.r0();
                    }
                    qje.W(btsVar24, wlsVar, a4);
                    qje.W(btsVar24, wlsVar2, o6);
                    if (btsVar24.S || !jl40.l(btsVar24.Q(), Integer.valueOf(hashCode5))) {
                        b64.z(hashCode5, btsVar24, hashCode5, wlsVar3);
                    }
                    qje.W(btsVar24, wlsVar4, d6);
                    CharSequence charSequence2 = dx90Var.g;
                    if (charSequence2 == null) {
                        btsVar24.e0(-124719134);
                        btsVar24.t(false);
                    } else {
                        btsVar24.e0(-124719133);
                        zgb1.a(charSequence2, null, 0, false, null, null, false, new jrn(1), btsVar24, 12582912, HProv.PP_DELETE_SAVED_PASSWD);
                        btsVar24.t(false);
                    }
                    cib1.d(dx90Var.e, null, dx90Var.f, null, 1, 2, btsVar24, 221184, 10);
                    btsVar24.t(true);
                    btsVar24.t(true);
                } else {
                    btsVar24.Y();
                }
                return zy11Var;
            case 26:
                final cx90 cx90Var = (cx90) obj5;
                fid fidVar25 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                bts btsVar25 = (bts) fidVar25;
                if (btsVar25.V(intValue25 & 1, (intValue25 & 17) != 16)) {
                    final int i4 = r11 ? 1 : 0;
                    androidx.compose.runtime.internal.a S = wwg.S(-857692837, true, new wls() { // from class: yw90
                        @Override // defpackage.wls
                        public final Object invoke(Object obj6, Object obj7) {
                            int i5 = i4;
                            zy11 zy11Var2 = zy11.a;
                            cx90 cx90Var2 = cx90Var;
                            switch (i5) {
                                case 0:
                                    fid fidVar26 = (fid) obj6;
                                    int intValue26 = ((Integer) obj7).intValue();
                                    bts btsVar26 = (bts) fidVar26;
                                    if (!btsVar26.V(intValue26 & 1, (intValue26 & 3) != 2)) {
                                        btsVar26.Y();
                                        break;
                                    } else {
                                        s3b1.f(cx90Var2.e, null, null, btsVar26, 0, 6);
                                        break;
                                    }
                                default:
                                    fid fidVar27 = (fid) obj6;
                                    int intValue27 = ((Integer) obj7).intValue();
                                    bts btsVar27 = (bts) fidVar27;
                                    if (!btsVar27.V(intValue27 & 1, (intValue27 & 3) != 2)) {
                                        btsVar27.Y();
                                        break;
                                    } else {
                                        web1.e(null, null, null, cx90Var2.c, null, 0L, null, null, null, 0, false, 0, null, cx90Var2.d, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar27, 0, 0, 0, 268402679);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar25);
                    final boolean z2 = z ? 1 : 0;
                    androidx.compose.runtime.internal.a S2 = wwg.S(-992275526, true, new wls() { // from class: yw90
                        @Override // defpackage.wls
                        public final Object invoke(Object obj6, Object obj7) {
                            int i5 = z2;
                            zy11 zy11Var2 = zy11.a;
                            cx90 cx90Var2 = cx90Var;
                            switch (i5) {
                                case 0:
                                    fid fidVar26 = (fid) obj6;
                                    int intValue26 = ((Integer) obj7).intValue();
                                    bts btsVar26 = (bts) fidVar26;
                                    if (!btsVar26.V(intValue26 & 1, (intValue26 & 3) != 2)) {
                                        btsVar26.Y();
                                        break;
                                    } else {
                                        s3b1.f(cx90Var2.e, null, null, btsVar26, 0, 6);
                                        break;
                                    }
                                default:
                                    fid fidVar27 = (fid) obj6;
                                    int intValue27 = ((Integer) obj7).intValue();
                                    bts btsVar27 = (bts) fidVar27;
                                    if (!btsVar27.V(intValue27 & 1, (intValue27 & 3) != 2)) {
                                        btsVar27.Y();
                                        break;
                                    } else {
                                        web1.e(null, null, null, cx90Var2.c, null, 0L, null, null, null, 0, false, 0, null, cx90Var2.d, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar27, 0, 0, 0, 268402679);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar25);
                    bad.a.getClass();
                    web1.c(null, 0.0f, false, 0.0f, null, S, S2, null, null, bad.b, null, oa01.a, false, btsVar25, 807075840, 0, 5535);
                } else {
                    btsVar25.Y();
                }
                return zy11Var;
            case 27:
                return b(obj, obj2, obj3);
            case 28:
                return d(obj, obj2, obj3);
            default:
                ((com.yandex.go.places.impl.navigation.d) obj5).e0((xl80) obj, ((Boolean) obj2).booleanValue(), new e350(7, (sls) obj3));
                return zy11Var;
        }
    }
}
