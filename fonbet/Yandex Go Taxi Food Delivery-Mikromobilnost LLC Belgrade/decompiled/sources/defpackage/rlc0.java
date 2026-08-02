package defpackage;

import com.yandex.plus.core.graphql.type.HORIZONTAL_RULE;
import com.yandex.plus.core.graphql.type.HorizontalAlignment;
import com.yandex.plus.core.graphql.type.PLAQUE_NOTIFICATION_POSITION;
import com.yandex.plus.core.graphql.type.VERTICAL_RULE;
import com.yandex.plus.core.graphql.type.VerticalAlignment;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$HorizontalRuleDto;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$VerticalRuleDto;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.NotificationDto$Position;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.WidgetDto$Group$Line$Orientation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes8.dex */
public final class rlc0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static hle0 a(fpc0 fpc0Var, HashMap hashMap, Set set) {
        fpc0 fpc0Var2;
        fpc0 fpc0Var3;
        switch (qlc0.k[fpc0Var.a.ordinal()]) {
            case 1:
                yoc0 yoc0Var = fpc0Var.b;
                if (yoc0Var != null) {
                    int i = qlc0.l[yoc0Var.b().ordinal()];
                    if (i == 1) {
                        return new qje0(yoc0Var.a());
                    }
                    if (i == 2) {
                        return new lke0(yoc0Var.a());
                    }
                    if (i == 3) {
                        return new xke0(yoc0Var.a());
                    }
                    if (i != 4) {
                        w511.b();
                        return null;
                    }
                }
                return null;
            case 2:
                zoc0 zoc0Var = fpc0Var.c;
                if (zoc0Var != null) {
                    return new tje0(zoc0Var.a());
                }
                return null;
            case 3:
                apc0 apc0Var = fpc0Var.f;
                if (apc0Var != null) {
                    uie0 qie0Var = apc0Var.c() != null ? new qie0(apc0Var.c().intValue()) : apc0Var.b() != null ? new nie0(apc0Var.b().doubleValue()) : apc0Var.d() != null ? new tie0(apc0Var.d()) : null;
                    if (qie0Var != null) {
                        switch (qlc0.m[apc0Var.e().ordinal()]) {
                            case 1:
                                return new zje0(apc0Var.a(), qie0Var);
                            case 2:
                                return new cke0(apc0Var.a(), qie0Var);
                            case 3:
                                return new fke0(apc0Var.a(), qie0Var);
                            case 4:
                                return new oke0(apc0Var.a(), qie0Var);
                            case 5:
                                return new rke0(apc0Var.a(), qie0Var);
                            case 6:
                                break;
                            default:
                                w511.b();
                                return null;
                        }
                    }
                }
                return null;
            case 4:
                bpc0 bpc0Var = fpc0Var.g;
                if (bpc0Var != null) {
                    cje0 yie0Var = bpc0Var.b() != null ? new yie0(bpc0Var.b().intValue()) : bpc0Var.c() != null ? new bje0(bpc0Var.c()) : null;
                    if (yie0Var != null) {
                        return new wje0(bpc0Var.a(), yie0Var);
                    }
                }
                return null;
            case 5:
                cpc0 cpc0Var = fpc0Var.h;
                if (cpc0Var != null) {
                    kje0 gje0Var = cpc0Var.b() != null ? new gje0(a.N0(cpc0Var.b())) : cpc0Var.c() != null ? new jje0(a.N0(cpc0Var.c())) : null;
                    if (gje0Var != null) {
                        return new ike0(cpc0Var.a(), gje0Var);
                    }
                }
                return null;
            case 6:
                dpc0 dpc0Var = fpc0Var.d;
                if (dpc0Var != null) {
                    int a = dpc0Var.a();
                    hle0 a2 = (set.contains(Integer.valueOf(a)) || (fpc0Var2 = (fpc0) hashMap.get(Integer.valueOf(a))) == null) ? null : a(fpc0Var2, hashMap, v4r0.i(set, Integer.valueOf(a)));
                    if (a2 != null) {
                        return new uke0(a2);
                    }
                }
                return null;
            case 7:
                epc0 epc0Var = fpc0Var.e;
                if (epc0Var != null) {
                    ArrayList arrayList = epc0Var.b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        hle0 a3 = (set.contains(Integer.valueOf(intValue)) || (fpc0Var3 = (fpc0) hashMap.get(Integer.valueOf(intValue))) == null) ? null : a(fpc0Var3, hashMap, v4r0.i(set, Integer.valueOf(intValue)));
                        if (a3 != null) {
                            arrayList2.add(a3);
                        }
                    }
                    if (arrayList2.size() == arrayList.size()) {
                        int i2 = qlc0.n[epc0Var.a.ordinal()];
                        if (i2 == 1) {
                            return new ble0(arrayList2);
                        }
                        if (i2 == 2) {
                            return new ele0(arrayList2);
                        }
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                    }
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x000d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [wv] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r13v16, types: [com.yandex.plus.core.graphql.type.HorizontalAlignment] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static plc0 b(klc0 klc0Var) {
        ?? r3;
        Map map;
        e3n e3nVar;
        e3n e3nVar2;
        Integer num;
        Integer num2;
        List a;
        String str;
        Object obj;
        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto;
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto;
        vzj vzjVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        y251 p251Var;
        y251 y251Var;
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto2;
        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto2;
        ArrayList arrayList3 = klc0Var.a;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            EmptyList emptyList = EmptyList.a;
            if (!hasNext) {
                sfe sfeVar = null;
                List list = klc0Var.b;
                if (list != null) {
                    r3 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        xsc0 a2 = ((ilc0) it2.next()).a();
                        xo11 c = a2.d().a().c();
                        if (c != null) {
                            String e = a2.e();
                            tsc0 a3 = a2.a();
                            sfe f = a3 != null ? f(a3.a()) : sfeVar;
                            vsc0 c2 = a2.c();
                            obj = new c251(e, f, c2 != null ? d(c2.a()) : sfeVar, g(a2.b().a(), sfeVar, c.a()), a2.f(), WidgetDto$Group$Line$Orientation.HORIZONTAL);
                        } else {
                            wo11 b = a2.d().a().b();
                            if (b != null) {
                                String e2 = a2.e();
                                tsc0 a4 = a2.a();
                                sfe f2 = a4 != null ? f(a4.a()) : null;
                                vsc0 c3 = a2.c();
                                obj = new c251(e2, f2, c3 != null ? d(c3.a()) : null, g(a2.b().a(), b.a(), null), a2.f(), WidgetDto$Group$Line$Orientation.VERTICAL);
                            } else {
                                vo11 a5 = a2.d().a().a();
                                if (a5 != null) {
                                    String e3 = a2.e();
                                    tsc0 a6 = a2.a();
                                    sfe f3 = a6 != null ? f(a6.a()) : null;
                                    vsc0 c4 = a2.c();
                                    obj = new x151(e3, f3, c4 != null ? d(c4.a()) : null, g(a2.b().a(), a5.a(), a5.b()), a2.f());
                                } else {
                                    obj = null;
                                }
                            }
                        }
                        if (obj != null) {
                            r3.add(obj);
                        }
                        sfeVar = null;
                    }
                } else {
                    r3 = 0;
                }
                if (r3 != 0) {
                    emptyList = r3;
                }
                ArrayList m0 = a.m0(emptyList, arrayList4);
                ArrayList arrayList5 = klc0Var.c;
                ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    juc0 juc0Var = ((jlc0) it3.next()).b;
                    String str2 = juc0Var.a;
                    dmc0 dmc0Var = juc0Var.d.b;
                    vqv h = h(dmc0Var.a.b);
                    ArrayList arrayList7 = dmc0Var.b;
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        tgc e4 = e(((amc0) it4.next()).b);
                        if (e4 != null) {
                            arrayList8.add(e4);
                        }
                    }
                    wzj wzjVar = new wzj(h, arrayList8, n(dmc0Var.c.b), null, null, null, qzj.INSTANCE);
                    fuc0 fuc0Var = juc0Var.b;
                    sfe f4 = fuc0Var != null ? f(fuc0Var.a()) : null;
                    iuc0 iuc0Var = juc0Var.e;
                    wv d = iuc0Var != null ? d(iuc0Var.a()) : null;
                    ArrayList arrayList9 = juc0Var.c;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        lnc0 lnc0Var = ((huc0) it5.next()).b;
                        int i = qlc0.b[lnc0Var.c.ordinal()];
                        if (i == 1) {
                            str = lnc0Var.a;
                        } else if (i == 2) {
                            str = lnc0Var.b;
                        } else {
                            if (i != 3) {
                                w511.b();
                                return null;
                            }
                            str = null;
                        }
                        if (str != null) {
                            arrayList10.add(str);
                        }
                    }
                    arrayList6.add(new c251(str2, f4, d, wzjVar, arrayList10, WidgetDto$Group$Line$Orientation.HORIZONTAL));
                }
                ArrayList m02 = a.m0(arrayList6, m0);
                ArrayList arrayList11 = klc0Var.d;
                ArrayList arrayList12 = new ArrayList(tcc.n(arrayList11, 10));
                Iterator it6 = arrayList11.iterator();
                while (it6.hasNext()) {
                    yhc0 a7 = ((flc0) it6.next()).a();
                    String str3 = a7.a;
                    vhc0 vhc0Var = a7.i;
                    c251 p = p(a7);
                    thc0 thc0Var = a7.h;
                    if (thc0Var == null || (a = thc0Var.a().a()) == null) {
                        map = null;
                    } else {
                        List<doc0> list2 = a;
                        int d2 = gw00.d(tcc.n(list2, 10));
                        if (d2 < 16) {
                            d2 = 16;
                        }
                        map = new LinkedHashMap(d2);
                        for (doc0 doc0Var : list2) {
                            Pair pair = new Pair(doc0Var.a(), doc0Var.b());
                            map.put(pair.c(), pair.f());
                        }
                    }
                    if (map == null) {
                        map = b.f();
                    }
                    Map map2 = map;
                    uhc0 uhc0Var = a7.k;
                    rh60 k = uhc0Var != null ? k(uhc0Var) : null;
                    Map map3 = a7.l;
                    int i2 = a7.b;
                    if (vhc0Var == null || (num2 = vhc0Var.a) == null) {
                        e3nVar = null;
                    } else {
                        o430 o430Var = e3n.b;
                        e3nVar = new e3n(kp50.U(num2.intValue(), DurationUnit.SECONDS));
                    }
                    if (vhc0Var == null || (num = vhc0Var.b) == null) {
                        e3nVar2 = null;
                    } else {
                        o430 o430Var2 = e3n.b;
                        e3nVar2 = new e3n(kp50.U(num.intValue(), DurationUnit.SECONDS));
                    }
                    arrayList12.add(new qyd(str3, p, map2, k, map3, i2, e3nVar, e3nVar2, a7.j, l(a7.e.b)));
                }
                ArrayList arrayList13 = klc0Var.e;
                ArrayList arrayList14 = new ArrayList(tcc.n(arrayList13, 10));
                Iterator it7 = arrayList13.iterator();
                while (it7.hasNext()) {
                    arrayList14.add(c(((glc0) it7.next()).a()));
                }
                ArrayList arrayList15 = klc0Var.f;
                ArrayList arrayList16 = new ArrayList(tcc.n(arrayList15, 10));
                Iterator it8 = arrayList15.iterator();
                while (it8.hasNext()) {
                    arrayList16.add(c(((dlc0) it8.next()).b));
                }
                ArrayList arrayList17 = klc0Var.g;
                ArrayList arrayList18 = new ArrayList(tcc.n(arrayList17, 10));
                Iterator it9 = arrayList17.iterator();
                while (it9.hasNext()) {
                    arrayList18.add(c(((elc0) it9.next()).a()));
                }
                return new plc0(m02, arrayList12, arrayList14, arrayList16, arrayList18);
            }
            rsc0 rsc0Var = ((hlc0) it.next()).b;
            String str4 = rsc0Var.a;
            lsc0 lsc0Var = rsc0Var.b;
            ?? r11 = rsc0Var.c;
            sfe f5 = lsc0Var != null ? f(lsc0Var.b) : null;
            osc0 osc0Var = rsc0Var.d;
            wv d3 = osc0Var != null ? d(osc0Var.a()) : null;
            xtc0 xtc0Var = rsc0Var.e.b;
            dmc0 dmc0Var2 = xtc0Var.a.b;
            vqv h2 = h(dmc0Var2.a.b);
            ArrayList arrayList19 = dmc0Var2.b;
            ArrayList arrayList20 = new ArrayList();
            Iterator it10 = arrayList19.iterator();
            while (it10.hasNext()) {
                tgc e5 = e(((amc0) it10.next()).b);
                if (e5 != null) {
                    arrayList20.add(e5);
                }
            }
            oir0 n = n(dmc0Var2.c.b);
            Integer num3 = xtc0Var.b;
            HORIZONTAL_RULE horizontal_rule = xtc0Var.c;
            if (horizontal_rule != null) {
                int i3 = qlc0.f[horizontal_rule.ordinal()];
                if (i3 == 1) {
                    displayRulesDto$HorizontalRuleDto2 = DisplayRulesDto$HorizontalRuleDto.CENTER;
                } else if (i3 == 2) {
                    displayRulesDto$HorizontalRuleDto2 = DisplayRulesDto$HorizontalRuleDto.LEFT;
                } else if (i3 == 3) {
                    displayRulesDto$HorizontalRuleDto2 = DisplayRulesDto$HorizontalRuleDto.RIGHT;
                } else {
                    if (i3 != 4) {
                        w511.b();
                        return null;
                    }
                    displayRulesDto$HorizontalRuleDto2 = null;
                }
                displayRulesDto$HorizontalRuleDto = displayRulesDto$HorizontalRuleDto2;
            } else {
                displayRulesDto$HorizontalRuleDto = null;
            }
            VERTICAL_RULE vertical_rule = xtc0Var.d;
            if (vertical_rule != null) {
                int i4 = qlc0.g[vertical_rule.ordinal()];
                if (i4 == 1) {
                    displayRulesDto$VerticalRuleDto2 = DisplayRulesDto$VerticalRuleDto.CENTER;
                } else if (i4 == 2) {
                    displayRulesDto$VerticalRuleDto2 = DisplayRulesDto$VerticalRuleDto.TOP;
                } else if (i4 == 3) {
                    displayRulesDto$VerticalRuleDto2 = DisplayRulesDto$VerticalRuleDto.BOTTOM;
                } else {
                    if (i4 != 4) {
                        w511.b();
                        return null;
                    }
                    displayRulesDto$VerticalRuleDto2 = null;
                }
                displayRulesDto$VerticalRuleDto = displayRulesDto$VerticalRuleDto2;
            } else {
                displayRulesDto$VerticalRuleDto = null;
            }
            int i5 = qlc0.h[xtc0Var.f.ordinal()];
            if (i5 == 1) {
                vzjVar = qzj.INSTANCE;
            } else if (i5 == 2) {
                vzjVar = rzj.INSTANCE;
            } else if (i5 == 3) {
                Integer num4 = xtc0Var.e;
                vzjVar = num4 != null ? new uzj(num4.intValue()) : null;
            } else {
                if (i5 != 4) {
                    w511.b();
                    return null;
                }
                vzjVar = null;
            }
            if (vzjVar == null) {
                vzjVar = rzj.INSTANCE;
            }
            wzj wzjVar2 = new wzj(h2, arrayList20, n, num3, displayRulesDto$HorizontalRuleDto, displayRulesDto$VerticalRuleDto, vzjVar);
            switch (qlc0.a[rsc0Var.f.ordinal()]) {
                case 1:
                    sfe sfeVar2 = f5;
                    jsc0 jsc0Var = rsc0Var.h;
                    if (jsc0Var != null) {
                        tic0 a8 = jsc0Var.a();
                        EmptyList emptyList2 = r11 == 0 ? emptyList : r11;
                        sic0 c5 = a8.c();
                        if (c5 != null) {
                            List<qic0> a9 = c5.a();
                            ArrayList arrayList21 = new ArrayList();
                            for (qic0 qic0Var : a9) {
                                a2x j = qic0Var != null ? j(qic0Var.a()) : null;
                                if (j != null) {
                                    arrayList21.add(j);
                                }
                            }
                            arrayList = arrayList21;
                        } else {
                            arrayList = null;
                        }
                        ric0 b2 = a8.b();
                        if (b2 != null) {
                            List<oic0> a10 = b2.a();
                            ArrayList arrayList22 = new ArrayList();
                            for (oic0 oic0Var : a10) {
                                a2x j2 = oic0Var != null ? j(oic0Var.a()) : null;
                                if (j2 != null) {
                                    arrayList22.add(j2);
                                }
                            }
                            arrayList2 = arrayList22;
                        } else {
                            arrayList2 = null;
                        }
                        List<pic0> a11 = a8.a().a();
                        ArrayList arrayList23 = new ArrayList();
                        for (pic0 pic0Var : a11) {
                            a2x j3 = pic0Var != null ? j(pic0Var.a()) : null;
                            if (j3 != null) {
                                arrayList23.add(j3);
                            }
                        }
                        y251Var = new g251(str4, sfeVar2, d3, wzjVar2, arrayList, arrayList2, arrayList23, emptyList2);
                        p251Var = y251Var;
                        if (p251Var == null) {
                            arrayList4.add(p251Var);
                        }
                    }
                    p251Var = null;
                    if (p251Var == null) {
                    }
                case 2:
                    sfe sfeVar3 = f5;
                    ksc0 ksc0Var = rsc0Var.i;
                    if (ksc0Var != null) {
                        djc0 a12 = ksc0Var.a();
                        EmptyList emptyList3 = r11 == 0 ? emptyList : r11;
                        List<bjc0> a13 = a12.a().a();
                        ArrayList arrayList24 = new ArrayList();
                        for (bjc0 bjc0Var : a13) {
                            a2x j4 = bjc0Var != null ? j(bjc0Var.a()) : null;
                            if (j4 != null) {
                                arrayList24.add(j4);
                            }
                        }
                        y251Var = new j251(str4, sfeVar3, d3, wzjVar2, arrayList24, emptyList3);
                        p251Var = y251Var;
                        if (p251Var == null) {
                        }
                    }
                    p251Var = null;
                    if (p251Var == null) {
                    }
                    break;
                case 3:
                    sfe sfeVar4 = f5;
                    nsc0 nsc0Var = rsc0Var.k;
                    if (nsc0Var != null) {
                        y251Var = new m251(str4, sfeVar4, d3, wzjVar2, nsc0Var.a().a());
                        p251Var = y251Var;
                        if (p251Var == null) {
                        }
                    }
                    p251Var = null;
                    if (p251Var == null) {
                    }
                    break;
                case 4:
                    p251Var = new p251(str4, f5, d3, wzjVar2);
                    if (p251Var == null) {
                    }
                    break;
                case 5:
                    sfe sfeVar5 = f5;
                    psc0 psc0Var = rsc0Var.j;
                    if (psc0Var != null) {
                        irc0 a14 = psc0Var.a();
                        EmptyList emptyList4 = r11 == 0 ? emptyList : r11;
                        List<grc0> a15 = a14.a().a();
                        ArrayList arrayList25 = new ArrayList();
                        for (grc0 grc0Var : a15) {
                            a2x j5 = grc0Var != null ? j(grc0Var.a()) : null;
                            if (j5 != null) {
                                arrayList25.add(j5);
                            }
                        }
                        y251Var = new t251(str4, sfeVar5, d3, wzjVar2, arrayList25, emptyList4);
                        p251Var = y251Var;
                        if (p251Var == null) {
                        }
                    }
                    p251Var = null;
                    if (p251Var == null) {
                    }
                    break;
                case 6:
                    qsc0 qsc0Var = rsc0Var.g;
                    if (qsc0Var != null) {
                        qrc0 a16 = qsc0Var.a();
                        EmptyList emptyList5 = r11 == 0 ? emptyList : r11;
                        List<orc0> a17 = a16.b().a();
                        ArrayList arrayList26 = new ArrayList();
                        for (orc0 orc0Var : a17) {
                            a2x j6 = orc0Var != null ? j(orc0Var.a()) : null;
                            if (j6 != null) {
                                arrayList26.add(j6);
                            }
                        }
                        y251Var = new w251(str4, f5, d3, wzjVar2, arrayList26, emptyList5, a16.a());
                        p251Var = y251Var;
                        if (p251Var == null) {
                        }
                    }
                    p251Var = null;
                    if (p251Var == null) {
                    }
                    break;
                case 7:
                    p251Var = null;
                    if (p251Var == null) {
                    }
                    break;
                default:
                    w511.b();
                    break;
            }
            return null;
        }
    }

    public static uhh c(yhc0 yhc0Var) {
        Map map;
        List a;
        String str = yhc0Var.a;
        c251 p = p(yhc0Var);
        thc0 thc0Var = yhc0Var.h;
        if (thc0Var == null || (a = thc0Var.a().a()) == null) {
            map = null;
        } else {
            List<doc0> list = a;
            int d = gw00.d(tcc.n(list, 10));
            if (d < 16) {
                d = 16;
            }
            map = new LinkedHashMap(d);
            for (doc0 doc0Var : list) {
                Pair pair = new Pair(doc0Var.a(), doc0Var.b());
                map.put(pair.c(), pair.f());
            }
        }
        if (map == null) {
            map = b.f();
        }
        uhc0 uhc0Var = yhc0Var.k;
        return new uhh(str, p, map, uhc0Var != null ? k(uhc0Var) : null, yhc0Var.l, yhc0Var.b, l(yhc0Var.e.b));
    }

    public static wv d(psu0 psu0Var) {
        lsu0 b = psu0Var.b();
        if (b != null) {
            return new lv(b.a());
        }
        nsu0 d = psu0Var.d();
        if (d != null) {
            String b2 = d.b();
            List<osu0> M = a.M(d.a());
            int d2 = gw00.d(tcc.n(M, 10));
            if (d2 < 16) {
                d2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
            for (osu0 osu0Var : M) {
                Pair pair = new Pair(osu0Var.a(), osu0Var.b());
                linkedHashMap.put(pair.c(), pair.f());
            }
            return new uv(b2, linkedHashMap);
        }
        mv mvVar = psu0Var.c() != null ? mv.INSTANCE : null;
        if (mvVar != null) {
            return mvVar;
        }
        ksu0 a = psu0Var.a();
        if (a == null) {
            return null;
        }
        String a2 = a.a();
        String c = a.c();
        Map b3 = a.b();
        if (b3 == null) {
            b3 = b.f();
        }
        return new qv(a2, c, b3);
    }

    public static tgc e(ujc0 ujc0Var) {
        int i = qlc0.i[ujc0Var.a.ordinal()];
        if (i == 1) {
            sjc0 sjc0Var = ujc0Var.b;
            if (sjc0Var != null) {
                qnc0 a = sjc0Var.a();
                List a2 = a.a();
                ArrayList arrayList = new ArrayList(tcc.n(a2, 10));
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    qjc0 a3 = ((nnc0) it.next()).a();
                    arrayList.add(new hgc(a3.a(), a3.b(), a3.c()));
                }
                woc0 a4 = a.c().a();
                ogc ogcVar = new ogc(a4.a(), a4.b());
                woc0 a5 = a.b().a();
                return new lgc(arrayList, ogcVar, new ogc(a5.a(), a5.b()));
            }
        } else if (i == 2) {
            tjc0 tjc0Var = ujc0Var.c;
            if (tjc0Var != null) {
                hqc0 a6 = tjc0Var.a();
                List b = a6.b();
                ArrayList arrayList2 = new ArrayList(tcc.n(b, 10));
                Iterator it2 = b.iterator();
                while (it2.hasNext()) {
                    qjc0 a7 = ((gqc0) it2.next()).a();
                    arrayList2.add(new hgc(a7.a(), a7.b(), a7.c()));
                }
                woc0 a8 = a6.a().a();
                return new rgc(arrayList2, new ogc(a8.a(), a8.b()));
            }
        } else {
            if (i == 3) {
                return sgc.INSTANCE;
            }
            if (i != 4) {
                w511.b();
                return null;
            }
        }
        return null;
    }

    public static sfe f(pkc0 pkc0Var) {
        String str = pkc0Var.a;
        List list = pkc0Var.b;
        if (list == null) {
            list = EmptyList.a;
        }
        return new sfe(pkc0Var.d, str, pkc0Var.c, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wzj g(i2u i2uVar, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment) {
        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto;
        int i;
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto;
        vzj uzjVar;
        vzj vzjVar;
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto2;
        vqv h = h(i2uVar.c().a());
        List a = i2uVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            tgc e = e(((e2u) it.next()).a());
            if (e != null) {
                arrayList.add(e);
            }
        }
        oir0 n = n(i2uVar.b().a());
        int i2 = horizontalAlignment == null ? -1 : qlc0.d[horizontalAlignment.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                displayRulesDto$HorizontalRuleDto = DisplayRulesDto$HorizontalRuleDto.CENTER;
            } else if (i2 == 2) {
                displayRulesDto$HorizontalRuleDto = DisplayRulesDto$HorizontalRuleDto.LEFT;
            } else if (i2 == 3) {
                displayRulesDto$HorizontalRuleDto = DisplayRulesDto$HorizontalRuleDto.RIGHT;
            } else if (i2 != 4) {
                w511.b();
                return null;
            }
            i = verticalAlignment != null ? -1 : qlc0.e[verticalAlignment.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    displayRulesDto$VerticalRuleDto2 = DisplayRulesDto$VerticalRuleDto.CENTER;
                } else if (i == 2) {
                    displayRulesDto$VerticalRuleDto2 = DisplayRulesDto$VerticalRuleDto.TOP;
                } else if (i == 3) {
                    displayRulesDto$VerticalRuleDto2 = DisplayRulesDto$VerticalRuleDto.BOTTOM;
                } else if (i != 4) {
                    w511.b();
                    return null;
                }
                displayRulesDto$VerticalRuleDto = displayRulesDto$VerticalRuleDto2;
                if (i2uVar.d().a().b() != null || (vzjVar = rzj.INSTANCE) == null) {
                    if (i2uVar.d().a().a() == null) {
                        f351 c = i2uVar.d().a().c();
                        uzjVar = c != null ? new uzj(c.a()) : null;
                        if (uzjVar == null) {
                            vzjVar = rzj.INSTANCE;
                        }
                        return new wzj(h, arrayList, n, null, displayRulesDto$HorizontalRuleDto, displayRulesDto$VerticalRuleDto, uzjVar);
                    }
                    vzjVar = qzj.INSTANCE;
                }
                uzjVar = vzjVar;
                return new wzj(h, arrayList, n, null, displayRulesDto$HorizontalRuleDto, displayRulesDto$VerticalRuleDto, uzjVar);
            }
            displayRulesDto$VerticalRuleDto = null;
            if (i2uVar.d().a().b() != null) {
            }
            if (i2uVar.d().a().a() == null) {
            }
            uzjVar = vzjVar;
            return new wzj(h, arrayList, n, null, displayRulesDto$HorizontalRuleDto, displayRulesDto$VerticalRuleDto, uzjVar);
        }
        displayRulesDto$HorizontalRuleDto = null;
        if (verticalAlignment != null) {
        }
        if (i != -1) {
        }
        displayRulesDto$VerticalRuleDto = null;
        if (i2uVar.d().a().b() != null) {
        }
        if (i2uVar.d().a().a() == null) {
        }
        uzjVar = vzjVar;
        return new wzj(h, arrayList, n, null, displayRulesDto$HorizontalRuleDto, displayRulesDto$VerticalRuleDto, uzjVar);
    }

    public static vqv h(jnc0 jnc0Var) {
        return new vqv(jnc0Var.a, jnc0Var.b, jnc0Var.c, jnc0Var.d);
    }

    public static z1x i(mrc0 mrc0Var) {
        return new z1x(mrc0Var.g(), mrc0Var.h(), mrc0Var.a(), mrc0Var.e(), mrc0Var.f(), mrc0Var.b(), mrc0Var.c(), mrc0Var.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [t1x] */
    /* JADX WARN: Type inference failed for: r4v3, types: [w1x] */
    public static a2x j(zrc0 zrc0Var) {
        t1x t1xVar;
        z1x z1xVar;
        spc0 a;
        z1x z1xVar2;
        tpc0 b;
        upc0 c;
        yrc0 d = zrc0Var.d();
        if (d != null) {
            return i(d.a());
        }
        xrc0 c2 = zrc0Var.c();
        if (c2 != null) {
            wnc0 a2 = c2.a();
            return new w1x(a2.b(), i(a2.a().a()));
        }
        wrc0 b2 = zrc0Var.b();
        if (b2 != null) {
            zmc0 a3 = b2.a();
            t1xVar = new t1x(a3.a(), a3.d(), a3.e(), a3.c(), a3.f(), a3.b());
        } else {
            t1xVar = null;
        }
        if (t1xVar != null) {
            return t1xVar;
        }
        vrc0 a4 = zrc0Var.a();
        if (a4 == null) {
            return null;
        }
        String b3 = a4.a().b();
        List<ikc0> a5 = a4.a().a();
        ArrayList arrayList = new ArrayList();
        for (ikc0 ikc0Var : a5) {
            vpc0 a6 = ikc0Var != null ? ikc0Var.a() : null;
            if (a6 == null || (c = a6.c()) == null) {
                if (a6 != null && (b = a6.b()) != null) {
                    wnc0 a7 = b.a();
                    z1xVar2 = new w1x(a7.b(), i(a7.a().a()));
                } else if (a6 == null || (a = a6.a()) == null) {
                    z1xVar = null;
                } else {
                    zmc0 a8 = a.a();
                    z1xVar2 = new t1x(a8.a(), a8.d(), a8.e(), a8.c(), a8.f(), a8.b());
                }
                z1xVar = z1xVar2;
            } else {
                z1xVar = i(c.a());
            }
            if (z1xVar != null) {
                arrayList.add(z1xVar);
            }
        }
        return new q1x(b3, arrayList);
    }

    public static rh60 k(uhc0 uhc0Var) {
        tmc0 b = uhc0Var.b();
        if (b != null) {
            return new qh60(o(b.a().a().a()), b.b());
        }
        wkc0 a = uhc0Var.a();
        if (a != null) {
            return new nh60(o(a.b().a().a()), a.a());
        }
        return null;
    }

    public static hle0 l(ppc0 ppc0Var) {
        ArrayList arrayList = ppc0Var.b;
        int i = ppc0Var.a;
        HashMap hashMap = new HashMap(arrayList.size());
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            hashMap.put(Integer.valueOf(i2), ((opc0) obj).b);
            i2 = i3;
        }
        fpc0 fpc0Var = (fpc0) hashMap.get(Integer.valueOf(i));
        if (fpc0Var != null) {
            return a(fpc0Var, hashMap, Collections.singleton(Integer.valueOf(i)));
        }
        return null;
    }

    public static nir0 m(skc0 skc0Var) {
        int i = qlc0.j[skc0Var.a.ordinal()];
        if (i == 1) {
            Integer num = skc0Var.b;
            if (num != null) {
                return new lir0(num.intValue());
            }
        } else {
            if (i == 2) {
                return mir0.INSTANCE;
            }
            if (i != 3) {
                w511.b();
                return null;
            }
        }
        return null;
    }

    public static oir0 n(qqc0 qqc0Var) {
        return new oir0(m(qqc0Var.a.b), m(qqc0Var.b.b), m(qqc0Var.c.b), m(qqc0Var.d.b));
    }

    public static NotificationDto$Position o(PLAQUE_NOTIFICATION_POSITION plaque_notification_position) {
        int i = qlc0.c[plaque_notification_position.ordinal()];
        if (i == 1) {
            return NotificationDto$Position.BOTTOM_LEFT;
        }
        if (i == 2) {
            return NotificationDto$Position.BOTTOM_RIGHT;
        }
        if (i == 3) {
            return NotificationDto$Position.TOP_LEFT;
        }
        if (i == 4) {
            return NotificationDto$Position.TOP_RIGHT;
        }
        if (i == 5) {
            return null;
        }
        w511.b();
        return null;
    }

    public static c251 p(yhc0 yhc0Var) {
        qhc0 qhc0Var = yhc0Var.d;
        sfe f = qhc0Var != null ? f(qhc0Var.a()) : null;
        dmc0 dmc0Var = yhc0Var.f.b;
        vqv h = h(dmc0Var.a.b);
        ArrayList arrayList = dmc0Var.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tgc e = e(((amc0) it.next()).b);
            if (e != null) {
                arrayList2.add(e);
            }
        }
        wzj wzjVar = new wzj(h, arrayList2, n(dmc0Var.c.b), null, null, null, rzj.INSTANCE);
        whc0 whc0Var = yhc0Var.g;
        return new c251(JCSP.ROOT_STORE_NAME, f, whc0Var != null ? d(whc0Var.a()) : null, wzjVar, a.M(yhc0Var.c), WidgetDto$Group$Line$Orientation.VERTICAL);
    }
}
