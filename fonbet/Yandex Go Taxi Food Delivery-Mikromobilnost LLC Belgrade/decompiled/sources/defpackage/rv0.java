package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.analytics.e;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.persuggest.api.finalsuggest.Condition;
import ru.yandex.taxi.preorder.source.pickup.PickupPoint$PointType;

/* loaded from: classes.dex */
public final class rv0 {
    public final eqe a;
    public final w7v0 b;

    public rv0(eqe eqeVar, w7v0 w7v0Var) {
        this.a = eqeVar;
        this.b = w7v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlin.collections.EmptyList] */
    public final PlainAddress a(g2t g2tVar, ksw kswVar, i4v0 i4v0Var, xr0 xr0Var) {
        ArrayList arrayList;
        rtx0 rtx0Var;
        Boolean bool;
        this.b.getClass();
        v7v0 a = w7v0.a(kswVar, i4v0Var, false, null, xr0Var);
        v6r v6rVar = g2tVar.a;
        p820 p820Var = g2tVar.b;
        PlainAddress d = z81.d(a);
        d.P("suggest");
        u6r u6rVar = v6rVar.a;
        List list = u6rVar.k;
        int i = 10;
        if (list == null) {
            arrayList = null;
        } else {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                hyd hydVar = (hyd) it.next();
                List<List> a2 = hydVar.getA();
                ArrayList arrayList2 = new ArrayList(tcc.n(a2, i));
                for (List list3 : a2) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list3) {
                        Iterator it2 = it;
                        if (!jl40.l((ayd) obj, r02.INSTANCE)) {
                            arrayList3.add(obj);
                        }
                        it = it2;
                    }
                    arrayList2.add(arrayList3);
                }
                arrayList.add(new hyd(arrayList2, hydVar.getB()));
                it = it;
                i = 10;
            }
        }
        if (arrayList == null) {
            List list4 = u6rVar.j;
            ?? r8 = EmptyList.a;
            if (list4 != null) {
                List<pxd> list5 = list4;
                ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
                for (pxd pxdVar : list5) {
                    jsq0 a3 = pxdVar.getA();
                    ArrayList arrayList5 = new ArrayList(tcc.n(a3, 10));
                    Iterator it3 = a3.a.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((Condition) it3.next()) == Condition.TO_TAXI ? Collections.singletonList(vjz0.INSTANCE) : r8);
                    }
                    arrayList4.add(new hyd(arrayList5, pxdVar.getB()));
                }
                arrayList = arrayList4;
            } else {
                arrayList = r8;
            }
        }
        d.c(arrayList);
        d.i(u6rVar.i);
        d.f(p820Var.k);
        d.a(Collections.singleton(p820Var.f));
        d.b(Collections.singleton(g2tVar.c));
        d.y1(Long.valueOf(p820Var.e));
        d.k(p820Var.a);
        d.getAddress().y = u6rVar.getA();
        e a4 = this.a.a(d, i4v0Var, p820Var);
        if (a4 != null) {
            d.O1(a4);
        }
        tb90 tb90Var = a.P;
        if (tb90Var != null) {
            d.W(tb90Var);
        }
        sxq0 sxq0Var = u6rVar.d;
        d.p((sxq0Var == null || (rtx0Var = sxq0Var.a) == null || (bool = rtx0Var.a) == null || !bool.booleanValue()) ? null : rtx0Var.b);
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x020d, code lost:
    
        if (r12 == null) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v13, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pv0 b(g2t g2tVar) {
        String str;
        EmptyList emptyList;
        mq40 mq40Var;
        Address a;
        EmptyList emptyList2;
        ArrayList arrayList;
        PickupPoint$PointType pickupPoint$PointType;
        Object obj;
        rtx0 rtx0Var;
        Boolean bool;
        List list;
        ?? r12;
        String str2;
        EmptyList emptyList3;
        ksw kswVar;
        Iterator it;
        ade0 ade0Var;
        wq40 wq40Var;
        v6r v6rVar = g2tVar.a;
        u6r u6rVar = v6rVar.a;
        List list2 = u6rVar.c;
        sxq0 sxq0Var = u6rVar.d;
        k56 k56Var = u6rVar.e;
        List list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            jst.e.getClass();
            return null;
        }
        u6r u6rVar2 = v6rVar.a;
        i4v0 i4v0Var = v6rVar.b;
        u6r u6rVar3 = v6rVar.a;
        dde0 dde0Var = u6rVar2.h;
        String str3 = "";
        EmptyList emptyList4 = EmptyList.a;
        if (dde0Var == null || (list = dde0Var.a) == null) {
            str = "";
            emptyList = emptyList4;
            mq40Var = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((ade0) obj2).getB() != null) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ade0 ade0Var2 = (ade0) it2.next();
                List<b56> b = ade0Var2.getB();
                if (b != null) {
                    r12 = new ArrayList();
                    for (b56 b56Var : b) {
                        String a2 = ade0Var2.getA();
                        String str4 = a2 == null ? str3 : a2;
                        String a3 = b56Var.getA();
                        if (a3 == null) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            String b2 = b56Var.getB();
                            if (b2 != null) {
                                emptyList3 = emptyList4;
                                List list4 = u6rVar3.c;
                                if (list4 != null) {
                                    Iterator it3 = list4.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            kswVar = 0;
                                            break;
                                        }
                                        kswVar = it3.next();
                                        Iterator it4 = it3;
                                        String str5 = ((ksw) kswVar).o;
                                        if (str5 == null) {
                                            str5 = str2;
                                        }
                                        if (a3.equals(str5)) {
                                            break;
                                        }
                                        it3 = it4;
                                    }
                                    ksw kswVar2 = kswVar;
                                    if (kswVar2 != null) {
                                        it = it2;
                                        ade0Var = ade0Var2;
                                        wq40Var = new wq40(a(g2tVar, kswVar2, new i4v0("positionchoice", i4v0Var.b, null, null, str4, a3, null, false, false, 452), null), a3, b2);
                                        if (wq40Var != null) {
                                            r12.add(wq40Var);
                                        }
                                        it2 = it;
                                        ade0Var2 = ade0Var;
                                        str3 = str2;
                                        emptyList4 = emptyList3;
                                    }
                                }
                                it = it2;
                                ade0Var = ade0Var2;
                                wq40Var = null;
                                if (wq40Var != null) {
                                }
                                it2 = it;
                                ade0Var2 = ade0Var;
                                str3 = str2;
                                emptyList4 = emptyList3;
                            }
                        }
                        emptyList3 = emptyList4;
                        it = it2;
                        ade0Var = ade0Var2;
                        wq40Var = null;
                        if (wq40Var != null) {
                        }
                        it2 = it;
                        ade0Var2 = ade0Var;
                        str3 = str2;
                        emptyList4 = emptyList3;
                    }
                } else {
                    r12 = 0;
                }
                String str6 = str3;
                EmptyList emptyList5 = emptyList4;
                Iterator it5 = it2;
                ade0 ade0Var3 = ade0Var2;
                if (r12 == 0) {
                    r12 = emptyList5;
                }
                arrayList3.add(new jr40(ade0Var3.getA(), ade0Var3.getC(), r12));
                it2 = it5;
                str3 = str6;
                emptyList4 = emptyList5;
            }
            str = str3;
            emptyList = emptyList4;
            mq40Var = new mq40(arrayList3, dde0Var.b, dde0Var.c, dde0Var.d, dde0Var.e);
        }
        if (mq40Var == null) {
            mq40Var = mq40.f;
        }
        mq40 mq40Var2 = mq40Var;
        xr0 xr0Var = v6rVar.d;
        wq40 b3 = mq40Var2.b();
        if (b3 != null) {
            a = b3.a();
        } else {
            List list5 = u6rVar3.c;
            if (list5 == null) {
                list5 = emptyList;
            }
            a = a(g2tVar, (ksw) a.P(list5), i4v0Var, xr0Var);
        }
        Address address = a;
        k56 k56Var2 = k56Var == null ? new k56(0) : k56Var;
        NearestZoneResponse nearestZoneResponse = new NearestZoneResponse((sxq0Var == null || (rtx0Var = sxq0Var.a) == null || (bool = rtx0Var.a) == null || !bool.booleanValue()) ? null : rtx0Var.b, null, null, null, null, 62);
        List list6 = u6rVar.a;
        if (list6 != null) {
            List<xpb0> list7 = list6;
            ?? arrayList4 = new ArrayList(tcc.n(list7, 10));
            for (xpb0 xpb0Var : list7) {
                if (xpb0Var.c != null) {
                    Object[] enumConstants = PickupPoint$PointType.UNKNOWN.getClass().getEnumConstants();
                    int length = enumConstants.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            obj = null;
                            break;
                        }
                        obj = enumConstants[i];
                        if (cvu0.t(((PickupPoint$PointType) obj).toString(), String.valueOf(xpb0Var.c), true)) {
                            break;
                        }
                        i++;
                    }
                    pickupPoint$PointType = (PickupPoint$PointType) obj;
                    if (pickupPoint$PointType == null) {
                        pickupPoint$PointType = PickupPoint$PointType.UNKNOWN;
                    }
                }
                pickupPoint$PointType = PickupPoint$PointType.UNKNOWN;
                PickupPoint$PointType pickupPoint$PointType2 = pickupPoint$PointType;
                String str7 = xpb0Var.a;
                String str8 = str7 == null ? str : str7;
                zzs zzsVar = xpb0Var.b;
                if (zzsVar == null) {
                    zzsVar = zzs.f;
                }
                zzs zzsVar2 = zzsVar;
                String str9 = xpb0Var.n;
                String str10 = xpb0Var.g;
                hqx hqxVar = xpb0Var.l;
                String a4 = hqxVar != null ? hqxVar.getA() : null;
                List list8 = xpb0Var.o;
                rl6 rl6Var = xpb0Var.e;
                String str11 = xpb0Var.q;
                dgv dgvVar = xpb0Var.h;
                Boolean bool2 = xpb0Var.k;
                boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = xpb0Var.i;
                boolean booleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                Integer num = xpb0Var.d;
                int intValue = num != null ? num.intValue() : 0;
                ta7 ta7Var = xpb0Var.p;
                arrayList4.add(new wpb0(str8, zzsVar2, pickupPoint$PointType2, str9, str10, a4, list8, rl6Var, str11, dgvVar, booleanValue, booleanValue2, false, intValue, ta7Var != null ? ta7Var.a() : 0, xpb0Var.s));
            }
            emptyList2 = arrayList4;
        } else {
            emptyList2 = emptyList;
        }
        String str12 = u6rVar.b;
        if (str12 == null) {
            str12 = "default_tag";
        }
        String str13 = str12;
        pq1 pq1Var = u6rVar.f;
        yuf0 b4 = pq1Var != null ? qr1.b(pq1Var, k56Var != null ? k56Var.d : null) : null;
        seu seuVar = (sxq0Var != null ? sxq0Var.b : null) == null ? null : new seu(23);
        List list9 = u6rVar.c;
        if (list9 != null) {
            List<ksw> list10 = list9;
            ArrayList arrayList5 = new ArrayList(tcc.n(list10, 10));
            for (ksw kswVar3 : list10) {
                i4v0 i4v0Var2 = i4v0.j;
                arrayList5.add(w7v0.b(this.b, kswVar3, sms.c(null), false, null, 16));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        cub0 cub0Var = u6rVar.g;
        return new pv0(address, k56Var2, mq40Var2, nearestZoneResponse, emptyList2, str13, b4, seuVar, arrayList, cub0Var != null ? qr1.a(cub0Var) : null);
    }
}
