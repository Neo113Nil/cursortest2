package ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager;

import androidx.compose.foundation.pager.d;
import androidx.compose.runtime.f;
import defpackage.a990;
import defpackage.aii0;
import defpackage.bts;
import defpackage.byk0;
import defpackage.ctq;
import defpackage.cyk0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g700;
import defpackage.gxm;
import defpackage.jo0;
import defpackage.ljs0;
import defpackage.m3u0;
import defpackage.mx00;
import defpackage.nx00;
import defpackage.ny8;
import defpackage.o430;
import defpackage.ox00;
import defpackage.oz40;
import defpackage.q791;
import defpackage.r3b1;
import defpackage.s0v;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.ugh;
import defpackage.ux00;
import defpackage.w01;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wzr;
import defpackage.xab1;
import defpackage.ymb1;
import defpackage.ynn;
import defpackage.yx40;
import defpackage.zls;
import defpackage.zpn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b;

/* loaded from: classes5.dex */
public abstract class b {
    public static final void a(f530 f530Var, mx00 mx00Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(505999328);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(mx00Var) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 l = ymb1.l(f530Var, cyk0.c(8.0f));
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new g700(12, slsVar, mx00Var);
                btsVar.o0(Q);
            }
            r3b1.a(q791.d(l, false, null, null, (sls) Q, 15), mx00Var.c, cyk0.c(8.0f), null, wwg.S(-395743478, true, new ctq(22, mx00Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm((Object) f530Var, (Object) mx00Var, slsVar, i, 25);
        }
    }

    public static final void b(d dVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1827110384);
        int i2 = (btsVar.k(dVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = f.d(new ny8(dVar, 5));
                btsVar.o0(Q);
            }
            tlsVar.invoke(Integer.valueOf(((Number) ((m3u0) Q).getValue()).intValue()));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(dVar, tlsVar, i, 20);
        }
    }

    public static final void c(d dVar, List list, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1144184286);
        int i2 = i | (btsVar.k(dVar) ? 4 : 2) | (btsVar.e(list) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Integer valueOf = Integer.valueOf(dVar.o());
            boolean e = ((i2 & 14) == 4) | btsVar.e(list) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                MarketingPagerKt$LaunchedPagerScrollingEffect$3$1 marketingPagerKt$LaunchedPagerScrollingEffect$3$1 = new MarketingPagerKt$LaunchedPagerScrollingEffect$3$1(dVar, list, slsVar, slsVar2, null);
                btsVar.o0(marketingPagerKt$LaunchedPagerScrollingEffect$3$1);
                Q = marketingPagerKt$LaunchedPagerScrollingEffect$3$1;
            }
            zpn.e(btsVar, (wls) Q, valueOf);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(dVar, list, slsVar, slsVar2, i, 12);
        }
    }

    public static final void d(final ArrayList arrayList, final boolean z, final Integer num, final Integer num2, tls tlsVar, final tls tlsVar2, tls tlsVar3, final tls tlsVar4, tls tlsVar5, final tls tlsVar6, final tls tlsVar7, fid fidVar, final int i) {
        tls tlsVar8;
        final tls tlsVar9;
        final tls tlsVar10;
        bts btsVar;
        oz40 oz40Var;
        final ArrayList arrayList2;
        ugh ughVar;
        bts btsVar2;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(1336599687);
        int i2 = i | (btsVar3.e(arrayList) ? 4 : 2) | (btsVar3.a(z) ? 32 : 16) | (btsVar3.k(num) ? 256 : 128) | (btsVar3.k(num2) ? 2048 : 1024);
        final int i3 = 1;
        final int i4 = 0;
        if (btsVar3.V(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean e = btsVar3.e(arrayList);
            Object Q = btsVar3.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new ux00(arrayList, 0);
                btsVar3.o0(Q);
            }
            ugh b = a990.b(0, (sls) Q, btsVar3, 0, 3);
            Object Q2 = btsVar3.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Boolean.TRUE);
                btsVar3.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            if (z) {
                btsVar3.e0(111532);
                boolean k = btsVar3.k(arrayList);
                Object Q3 = btsVar3.Q();
                Object obj = Q3;
                if (k || Q3 == o430Var) {
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Long.valueOf(((ox00) it.next()).c));
                    }
                    btsVar3.o0(arrayList3);
                    obj = arrayList3;
                }
                List list = (List) obj;
                boolean e2 = btsVar3.e(arrayList) | btsVar3.k(b);
                Object Q4 = btsVar3.Q();
                if (e2 || Q4 == o430Var) {
                    jo0 jo0Var = new jo0(oz40Var2, tlsVar7, arrayList, b, 21);
                    oz40Var = oz40Var2;
                    arrayList2 = arrayList;
                    btsVar3.o0(jo0Var);
                    Q4 = jo0Var;
                } else {
                    oz40Var = oz40Var2;
                    arrayList2 = arrayList;
                }
                sls slsVar = (sls) Q4;
                Object Q5 = btsVar3.Q();
                if (Q5 == o430Var) {
                    Q5 = new w01(14, oz40Var);
                    btsVar3.o0(Q5);
                }
                sls slsVar2 = (sls) Q5;
                ughVar = b;
                btsVar2 = btsVar3;
                c(ughVar, list, slsVar, slsVar2, btsVar2, HProv.ALG_TYPE_SECURECHANNEL);
                btsVar2.t(false);
            } else {
                oz40Var = oz40Var2;
                arrayList2 = arrayList;
                ughVar = b;
                btsVar2 = btsVar3;
                btsVar2.e0(617979);
                btsVar2.t(false);
            }
            boolean e3 = btsVar2.e(arrayList2);
            Object Q6 = btsVar2.Q();
            if (e3 || Q6 == o430Var) {
                tlsVar9 = tlsVar3;
                Q6 = new tls() { // from class: px00
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        ArrayList arrayList4 = arrayList2;
                        tls tlsVar11 = tlsVar9;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i5) {
                            case 0:
                                tlsVar11.invoke(b.g(intValue, arrayList4));
                                break;
                            default:
                                tlsVar11.invoke(b.g(intValue, arrayList4));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q6);
            } else {
                tlsVar9 = tlsVar3;
            }
            tls tlsVar11 = (tls) Q6;
            boolean e4 = btsVar2.e(arrayList2);
            Object Q7 = btsVar2.Q();
            if (e4 || Q7 == o430Var) {
                Q7 = new tls() { // from class: px00
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        ArrayList arrayList4 = arrayList2;
                        tls tlsVar112 = tlsVar4;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i5) {
                            case 0:
                                tlsVar112.invoke(b.g(intValue, arrayList4));
                                break;
                            default:
                                tlsVar112.invoke(b.g(intValue, arrayList4));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q7);
            }
            e(ughVar, oz40Var, tlsVar11, (tls) Q7, btsVar2, 48);
            bts btsVar4 = btsVar2;
            final ugh ughVar2 = ughVar;
            boolean e5 = btsVar4.e(arrayList2);
            Object Q8 = btsVar4.Q();
            if (e5 || Q8 == o430Var) {
                tlsVar8 = tlsVar;
                tlsVar10 = tlsVar5;
                Q8 = new ynn(tlsVar8, arrayList2, tlsVar10, 25);
                btsVar4.o0(Q8);
            } else {
                tlsVar8 = tlsVar;
                tlsVar10 = tlsVar5;
            }
            b(ughVar2, (tls) Q8, btsVar4, 0);
            final float f = arrayList2.size() > 1 ? 16.0f : 0.0f;
            final ArrayList arrayList4 = arrayList2;
            xab1.a(null, null, wwg.S(-1691738787, true, new zls() { // from class: sx00
                @Override // defpackage.zls
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    dj6 dj6Var = (dj6) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                    }
                    bts btsVar5 = (bts) fidVar2;
                    if (btsVar5.V(intValue & 1, (intValue & 19) != 18)) {
                        Integer num3 = num;
                        otr0.a(ughVar2, an91.o(c530.a, 0.0f, num3 != null ? num3.intValue() : 0, 0.0f, num2 != null ? r3.intValue() : 0, 5), an91.d(8.0f, 0.0f, 0.0f, 0.0f, 14), new t790((dj6Var.d() - 8.0f) - f), 0.0f, null, null, false, null, null, null, null, wwg.S(-214231906, true, new dhj0(6, arrayList4, tlsVar2, tlsVar6), btsVar5), btsVar5, 384, 16368);
                    } else {
                        btsVar5.Y();
                    }
                    return zy11.a;
                }
            }, btsVar4), btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 7);
            btsVar = btsVar4;
        } else {
            tlsVar8 = tlsVar;
            tlsVar9 = tlsVar3;
            tlsVar10 = tlsVar5;
            btsVar = btsVar3;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final tls tlsVar12 = tlsVar8;
            final tls tlsVar13 = tlsVar9;
            v.d = new wls(arrayList, z, num, num2, tlsVar12, tlsVar2, tlsVar13, tlsVar4, tlsVar10, tlsVar6, tlsVar7, i) { // from class: tx00
                public final /* synthetic */ tls A;
                public final /* synthetic */ tls B;
                public final /* synthetic */ tls C;
                public final /* synthetic */ tls D;
                public final /* synthetic */ ArrayList a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Integer c;
                public final /* synthetic */ Integer w;
                public final /* synthetic */ tls x;
                public final /* synthetic */ tls y;
                public final /* synthetic */ tls z;

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int O = vng.O(920346625);
                    b.d(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (fid) obj2, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void e(final d dVar, final m3u0 m3u0Var, final tls tlsVar, final tls tlsVar2, fid fidVar, final int i) {
        d dVar2;
        m3u0 m3u0Var2;
        final tls tlsVar3;
        final tls tlsVar4;
        final int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(689568306);
        int i3 = (btsVar.k(dVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.g(dVar.k());
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.d(new ny8(dVar, 4));
                btsVar.o0(Q2);
            }
            m3u0 m3u0Var3 = (m3u0) Q2;
            if (!((Boolean) m3u0Var.getValue()).booleanValue()) {
                yx40Var.setIntValue(((Number) m3u0Var3.getValue()).intValue());
                aii0 v = btsVar.v();
                if (v != null) {
                    final int i4 = 0;
                    v.d = new wls(dVar, m3u0Var, tlsVar, tlsVar2, i, i4) { // from class: qx00
                        public final /* synthetic */ int a;
                        public final /* synthetic */ d b;
                        public final /* synthetic */ m3u0 c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ tls x;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(49);
                                    b.e(this.b, this.c, this.w, this.x, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(49);
                                    b.e(this.b, this.c, this.w, this.x, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            dVar2 = dVar;
            m3u0Var2 = m3u0Var;
            tlsVar3 = tlsVar;
            tlsVar4 = tlsVar2;
            i2 = i;
            if (((Number) m3u0Var3.getValue()).intValue() > yx40Var.getIntValue()) {
                tlsVar3.invoke(Integer.valueOf(yx40Var.getIntValue()));
            } else if (((Number) m3u0Var3.getValue()).intValue() < yx40Var.getIntValue()) {
                tlsVar4.invoke(Integer.valueOf(yx40Var.getIntValue()));
            }
            yx40Var.setIntValue(((Number) m3u0Var3.getValue()).intValue());
        } else {
            dVar2 = dVar;
            m3u0Var2 = m3u0Var;
            tlsVar3 = tlsVar;
            tlsVar4 = tlsVar2;
            i2 = i;
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final m3u0 m3u0Var4 = m3u0Var2;
            final d dVar3 = dVar2;
            final int i5 = 1;
            v2.d = new wls(dVar3, m3u0Var4, tlsVar3, tlsVar4, i2, i5) { // from class: qx00
                public final /* synthetic */ int a;
                public final /* synthetic */ d b;
                public final /* synthetic */ m3u0 c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ tls x;

                {
                    this.a = i5;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(49);
                            b.e(this.b, this.c, this.w, this.x, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(49);
                            b.e(this.b, this.c, this.w, this.x, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void f(f530 f530Var, nx00 nx00Var, byk0 byk0Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-471093477);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(nx00Var) ? 32 : 16) | (btsVar.k(byk0Var) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            r3b1.a(q791.d(ymb1.l(ljs0.e(ljs0.c(f530Var, 1.0f), 72.0f), byk0Var), false, null, null, slsVar, 15), nx00Var.a, byk0Var, null, wwg.S(-1660994875, true, new ctq(23, nx00Var), btsVar), btsVar, (i2 & 896) | HProv.ALG_CLASS_DATA_ENCRYPT, 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(f530Var, (Object) nx00Var, (Object) byk0Var, slsVar, i, 13);
        }
    }

    public static final String g(int i, List list) {
        String str;
        ox00 ox00Var = (ox00) kotlin.collections.a.S(i, list);
        return (ox00Var == null || (str = ox00Var.a) == null) ? "" : str;
    }
}
