package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.photocomments.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class wkb0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ wkb0(jva jvaVar, int i, List list) {
        this.a = 3;
        this.c = jvaVar;
        this.b = i;
        this.w = list;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Object obj4;
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        int i3 = this.b;
        Object obj5 = this.w;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                String str2 = (String) obj6;
                Float f = (Float) obj5;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    k3r k3rVar = ljs0.c;
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, k3rVar);
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
                    pa90 m = mt71.m(i3, 0, btsVar);
                    f530 m2 = ljs0.m(c530Var, 20.0f);
                    uo5 uo5Var = x4c.y;
                    cj6 cj6Var = cj6.a;
                    o4b1.b(m, str2, cj6Var.a(m2, uo5Var), null, null, 0.0f, null, btsVar, 0, 120);
                    if (f == null) {
                        btsVar.e0(-1160309426);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1160309425);
                        a.g(f.floatValue(), 0, btsVar, cj6Var.a(an91.k(c530Var, 2.0f), uo5Var));
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            str3 = "";
                        } else {
                            str = str4;
                            ymb1.e(str, an91.m(c530Var, 14.0f, 0.0f, 2), ldc.f, null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, 25008, 0, 65512);
                        }
                    }
                    str = str3;
                    ymb1.e(str, an91.m(c530Var, 14.0f, 0.0f, 2), ldc.f, null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, 25008, 0, 65512);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                String[] strArr = (String[]) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                List list = (List) obj3;
                ArrayList arrayList2 = new ArrayList(strArr.length);
                int length = strArr.length;
                while (true) {
                    if (i2 < length) {
                        String str5 = strArr[i2];
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj4 = it.next();
                                if (jl40.l(str5, ((j12) obj4).a)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        j12 j12Var = (j12) obj4;
                        if (j12Var != null) {
                            arrayList2.add(Integer.valueOf(j12Var.b));
                            i2++;
                        }
                    } else {
                        ((List) arrayList.get(i3)).add(new i12(new d6w(intValue3, intValue4 - 1, 1), arrayList2));
                    }
                }
                return zy11Var;
            case 3:
                jva jvaVar = (jva) obj6;
                List list2 = (List) obj5;
                fid fidVar3 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
                    int hashCode2 = Long.hashCode(btsVar3.T);
                    r1b0 o2 = btsVar3.o();
                    f530 d3 = b.d(btsVar3, c530Var);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar2);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a);
                    qje.W(btsVar3, d.e, o2);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d3);
                    qgy.b(jvaVar.a, null, an91.m(c530Var, 0.0f, 12.0f, 1), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 384, 0, 16378);
                    if (i3 < scc.f(list2)) {
                        btsVar3.e0(1694317907);
                        yrl.b(0, 7, btsVar3, null);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(1694360191);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                bms bmsVar = (bms) obj6;
                Object obj7 = (mg2) obj;
                fid fidVar4 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= (intValue6 & 8) == 0 ? ((bts) fidVar4).k(obj7) : fidVar4.e(obj7) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                    bmsVar.invoke(obj7, obj5, btsVar4, Integer.valueOf((intValue6 & 14) | ((i3 & 8) << 3)));
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ wkb0(int i, int i2, Object obj, String str) {
        this.a = i2;
        this.b = i;
        this.c = str;
        this.w = obj;
    }

    public /* synthetic */ wkb0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }
}
