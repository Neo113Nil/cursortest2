package defpackage;

import com.yandex.go.routestats.BackendFormat;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes8.dex */
public final class sze0 implements lze0 {
    public final xdf a;

    public sze0(xdf xdfVar) {
        this.a = xdfVar;
    }

    public static qze0 d(sze0 sze0Var, yal0 yal0Var, String str, PriceMeta priceMeta) {
        sze0 sze0Var2;
        v0f0 v0f0Var;
        v0f0 h;
        sze0Var.getClass();
        if (priceMeta != null) {
            Map map = yal0Var.p;
            if (map != null) {
                fef g = yal0Var.g();
                String str2 = (String) priceMeta.b.get("multiclass_tariff_card");
                if (str2 != null) {
                    sze0Var2 = sze0Var;
                    h = sze0Var2.h(map, priceMeta, g, str2, null);
                    v0f0Var = h;
                }
            }
            sze0Var2 = sze0Var;
            h = null;
            v0f0Var = h;
        } else {
            sze0Var2 = sze0Var;
            v0f0Var = null;
        }
        if (str == null && v0f0Var == null) {
            return null;
        }
        fef g2 = yal0Var.g();
        String b = str != null ? sze0Var2.b(g2, str) : null;
        if (b == null) {
            b = "";
        }
        String str3 = b;
        return new qze0(str3, null, g2, "", "", str3, str3, false, b.f(), null, new tpj0(b.f()), priceMeta != null ? sze0Var2.e(priceMeta, EmptyList.a, yal0Var, null) : null, priceMeta != null ? sze0Var2.f(priceMeta, yal0Var, null) : null, priceMeta != null ? sze0Var2.g(priceMeta, yal0Var, null) : null, sze0Var2.a(priceMeta, yal0Var, null, str3), v0f0Var);
    }

    public final fpw a(PriceMeta priceMeta, yal0 yal0Var, Set set, String str) {
        sze0 sze0Var;
        PriceMeta priceMeta2;
        Set set2;
        v0f0 v0f0Var;
        if (priceMeta == null) {
            if (yal0Var.p != null) {
                return null;
            }
            v0f0 v0f0Var2 = new v0f0(str, FormattedText.Companion.c(str));
            return new fpw(v0f0Var2, v0f0Var2);
        }
        Map map = priceMeta.b;
        Map map2 = yal0Var.p;
        if (map2 != null) {
            fef g = yal0Var.g();
            String str2 = (String) map.get("intercity_tariff_selector");
            if (str2 != null) {
                sze0Var = this;
                priceMeta2 = priceMeta;
                set2 = set;
                v0f0Var = sze0Var.h(map2, priceMeta2, g, str2, set2);
            } else {
                sze0Var = this;
                priceMeta2 = priceMeta;
                set2 = set;
                v0f0Var = null;
            }
            String str3 = (String) map.get("intercity_tariff_selector_on_select");
            v0f0 h = str3 != null ? sze0Var.h(map2, priceMeta2, g, str3, set2) : null;
            if (v0f0Var != null && h != null) {
                return new fpw(v0f0Var, h);
            }
        }
        return null;
    }

    public final String b(fef fefVar, String str) {
        return this.a.a(fefVar, str, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if (r2 != null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121 A[LOOP:1: B:48:0x011b->B:50:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167 A[LOOP:2: B:57:0x0161->B:59:0x0167, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qze0 c(yal0 yal0Var, ServiceLevel serviceLevel, Set set, ay1 ay1Var) {
        List list;
        wlq0 wlq0Var;
        String str;
        List list2;
        dg31 dg31Var;
        String str2;
        v0f0 v0f0Var;
        String b;
        ServiceLevel.DescriptionParts descriptionParts;
        String str3;
        s5r s5rVar;
        s5r s5rVar2;
        Object obj;
        Map map;
        sze0 sze0Var = this;
        fef g = yal0Var.g();
        String i = sze0Var.i(serviceLevel, g);
        Iterable iterable = serviceLevel.c;
        String str4 = serviceLevel.j;
        List list3 = serviceLevel.W.b;
        PriceMeta priceMeta = serviceLevel.h;
        zcx0 zcx0Var = null;
        if (priceMeta != null) {
            list = list3;
            wlq0Var = sze0Var.e(priceMeta, list3, yal0Var, set);
        } else {
            list = list3;
            wlq0Var = null;
        }
        if (priceMeta != null) {
            str = null;
            zcx0Var = sze0Var.f(priceMeta, yal0Var, set);
        } else {
            str = null;
        }
        if (priceMeta != null) {
            list2 = list;
            str2 = str;
            dg31Var = sze0Var.g(priceMeta, yal0Var, set);
        } else {
            list2 = list;
            dg31Var = str;
            str2 = dg31Var;
        }
        fpw a = sze0Var.a(priceMeta, yal0Var, set, i);
        if (priceMeta != null && (map = yal0Var.p) != null) {
            fef g2 = yal0Var.g();
            String str5 = (String) priceMeta.b.get("multiclass_tariff_card");
            if (str5 != null) {
                sze0Var = this;
                v0f0Var = sze0Var.h(map, priceMeta, g2, str5, set);
                String str6 = serviceLevel.i;
                Object i2 = str6 == null ? avu0.i(str6) : str2;
                String b2 = sze0Var.b(g, str4 != null ? "" : str4);
                v0f0 v0f0Var2 = v0f0Var;
                Double d = i2;
                String obj2 = evu0.k0(sze0Var.a.a(fef.e, str4, false, false)).toString();
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = str2;
                            break;
                        }
                        obj = it.next();
                        if (((ServiceLevel.TariffDetail) obj).c()) {
                            break;
                        }
                    }
                    ServiceLevel.TariffDetail tariffDetail = (ServiceLevel.TariffDetail) obj;
                    b = tariffDetail != null ? sze0Var.b(g, tariffDetail.getC()) : str2;
                }
                String str7 = serviceLevel.g;
                b = sze0Var.b(g, str7 != null ? str7 : "");
                descriptionParts = serviceLevel.b;
                if (descriptionParts != null) {
                    String c = descriptionParts.getC();
                    if (c == null || c.length() == 0) {
                        c = str2;
                    }
                    if (c != null) {
                        str3 = sze0Var.b(g, c);
                        if (str3 == null) {
                            str3 = i;
                        }
                        TariffUnavailable tariffUnavailable = serviceLevel.m;
                        boolean z = tariffUnavailable != null ? tariffUnavailable.f : false;
                        t5r o = kotlin.sequences.b.o(new h73(1, list2), new ga1(12, yal0Var, sze0Var, g));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        s5rVar = new s5r(o);
                        while (s5rVar.hasNext()) {
                            Pair pair = (Pair) s5rVar.next();
                            linkedHashMap.put((String) pair.getFirst(), (pju) pair.getSecond());
                        }
                        String a2 = ay1Var != null ? ay1Var.a() : str2;
                        if (iterable == null) {
                            iterable = EmptyList.a;
                        }
                        t5r g3 = kotlin.sequences.b.g(new h73(1, iterable), new qda0(17));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        s5rVar2 = new s5r(g3);
                        while (s5rVar2.hasNext()) {
                            ServiceLevel.TariffDetail tariffDetail2 = (ServiceLevel.TariffDetail) s5rVar2.next();
                            linkedHashMap2.put(tariffDetail2.getB(), sze0Var.b(g, tariffDetail2.getC()));
                            a2 = a2;
                        }
                        return new qze0(i, d, g, b2, obj2, b, str3, z, linkedHashMap, a2, new tpj0(linkedHashMap2), wlq0Var, zcx0Var, dg31Var, a, v0f0Var2);
                    }
                }
                str3 = str2;
                if (str3 == null) {
                }
                TariffUnavailable tariffUnavailable2 = serviceLevel.m;
                if (tariffUnavailable2 != null) {
                }
                t5r o2 = kotlin.sequences.b.o(new h73(1, list2), new ga1(12, yal0Var, sze0Var, g));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                s5rVar = new s5r(o2);
                while (s5rVar.hasNext()) {
                }
                if (ay1Var != null) {
                }
                if (iterable == null) {
                }
                t5r g32 = kotlin.sequences.b.g(new h73(1, iterable), new qda0(17));
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                s5rVar2 = new s5r(g32);
                while (s5rVar2.hasNext()) {
                }
                return new qze0(i, d, g, b2, obj2, b, str3, z, linkedHashMap3, a2, new tpj0(linkedHashMap22), wlq0Var, zcx0Var, dg31Var, a, v0f0Var2);
            }
            sze0Var = this;
        }
        v0f0Var = str2;
        String str62 = serviceLevel.i;
        if (str62 == null) {
        }
        String b22 = sze0Var.b(g, str4 != null ? "" : str4);
        v0f0 v0f0Var22 = v0f0Var;
        Double d2 = i2;
        String obj22 = evu0.k0(sze0Var.a.a(fef.e, str4, false, false)).toString();
        if (iterable != null) {
        }
        String str72 = serviceLevel.g;
        b = sze0Var.b(g, str72 != null ? str72 : "");
        descriptionParts = serviceLevel.b;
        if (descriptionParts != null) {
        }
        str3 = str2;
        if (str3 == null) {
        }
        TariffUnavailable tariffUnavailable22 = serviceLevel.m;
        if (tariffUnavailable22 != null) {
        }
        t5r o22 = kotlin.sequences.b.o(new h73(1, list2), new ga1(12, yal0Var, sze0Var, g));
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        s5rVar = new s5r(o22);
        while (s5rVar.hasNext()) {
        }
        if (ay1Var != null) {
        }
        if (iterable == null) {
        }
        t5r g322 = kotlin.sequences.b.g(new h73(1, iterable), new qda0(17));
        LinkedHashMap linkedHashMap222 = new LinkedHashMap();
        s5rVar2 = new s5r(g322);
        while (s5rVar2.hasNext()) {
        }
        return new qze0(i, d2, g, b22, obj22, b, str3, z, linkedHashMap32, a2, new tpj0(linkedHashMap222), wlq0Var, zcx0Var, dg31Var, a, v0f0Var22);
    }

    public final wlq0 e(PriceMeta priceMeta, List list, yal0 yal0Var, Set set) {
        sze0 sze0Var;
        PriceMeta priceMeta2;
        Set set2;
        v0f0 v0f0Var;
        v0f0 v0f0Var2;
        Map map = yal0Var.p;
        if (map != null) {
            fef g = yal0Var.g();
            Map map2 = priceMeta.b;
            String str = (String) map2.get("default");
            if (str != null) {
                sze0Var = this;
                priceMeta2 = priceMeta;
                set2 = set;
                v0f0Var = sze0Var.h(map, priceMeta2, g, str, set2);
            } else {
                sze0Var = this;
                priceMeta2 = priceMeta;
                set2 = set;
                v0f0Var = null;
            }
            String str2 = (String) map2.get("selector");
            if (str2 != null) {
                v0f0 h = sze0Var.h(map, priceMeta2, g, str2, set2);
                if (h != null) {
                    v0f0Var = h;
                }
            } else {
                v0f0Var = null;
            }
            String str3 = (String) map2.get("selector_on_select");
            if (str3 == null || (v0f0Var2 = sze0Var.h(map, priceMeta2, g, str3, set2)) == null) {
                v0f0Var2 = v0f0Var;
            }
            if (v0f0Var != null && v0f0Var2 != null) {
                t5r o = kotlin.sequences.b.o(new h73(1, list), new u50(yal0Var, sze0Var, map, g, set2, 18));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                s5r s5rVar = new s5r(o);
                while (s5rVar.hasNext()) {
                    Pair pair = (Pair) s5rVar.next();
                    linkedHashMap.put((String) pair.getFirst(), (v0f0) pair.getSecond());
                }
                return new wlq0(v0f0Var, v0f0Var2, linkedHashMap);
            }
        }
        return null;
    }

    public final zcx0 f(PriceMeta priceMeta, yal0 yal0Var, Set set) {
        sze0 sze0Var;
        PriceMeta priceMeta2;
        Set set2;
        v0f0 v0f0Var;
        Map map = yal0Var.p;
        if (map == null) {
            return null;
        }
        fef g = yal0Var.g();
        Map map2 = priceMeta.b;
        String str = (String) map2.get("tariff_card");
        if (str != null) {
            sze0Var = this;
            priceMeta2 = priceMeta;
            set2 = set;
            v0f0Var = sze0Var.h(map, priceMeta2, g, str, set2);
        } else {
            sze0Var = this;
            priceMeta2 = priceMeta;
            set2 = set;
            v0f0Var = null;
        }
        String str2 = (String) map2.get("full_screen_tariff_card");
        v0f0 h = str2 != null ? sze0Var.h(map, priceMeta2, g, str2, set2) : null;
        String str3 = (String) map2.get("tariff_card_details");
        return new zcx0(v0f0Var, h, str3 != null ? sze0Var.h(map, priceMeta2, g, str3, set2) : null);
    }

    public final dg31 g(PriceMeta priceMeta, yal0 yal0Var, Set set) {
        sze0 sze0Var;
        PriceMeta priceMeta2;
        Set set2;
        v0f0 v0f0Var;
        v0f0 v0f0Var2;
        Map map = yal0Var.p;
        if (map != null) {
            fef g = yal0Var.g();
            Map map2 = priceMeta.b;
            String str = (String) map2.get("default");
            if (str != null) {
                sze0Var = this;
                priceMeta2 = priceMeta;
                set2 = set;
                v0f0Var = sze0Var.h(map, priceMeta2, g, str, set2);
            } else {
                sze0Var = this;
                priceMeta2 = priceMeta;
                set2 = set;
                v0f0Var = null;
            }
            String str2 = (String) map2.get("vertical_selector");
            if (str2 != null) {
                v0f0 h = sze0Var.h(map, priceMeta2, g, str2, set2);
                if (h != null) {
                    v0f0Var = h;
                }
            } else {
                v0f0Var = null;
            }
            String str3 = (String) map2.get("vertical_selector_on_select");
            if (str3 == null || (v0f0Var2 = sze0Var.h(map, priceMeta2, g, str3, set2)) == null) {
                v0f0Var2 = v0f0Var;
            }
            if (v0f0Var != null && v0f0Var2 != null) {
                return new dg31(v0f0Var, v0f0Var2);
            }
        }
        return null;
    }

    public final v0f0 h(Map map, PriceMeta priceMeta, fef fefVar, String str, Set set) {
        BackendFormat backendFormat = (BackendFormat) map.get(str);
        if (backendFormat != null) {
            List a = backendFormat.getA();
            if (!(a instanceof Collection) || !a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    if (!priceMeta.a.containsKey((String) it.next())) {
                        if (set != null) {
                            set.add(new k7s(str));
                        }
                    }
                }
            }
            MapBuilder f = this.a.f(fefVar);
            HashMap hashMap = new HashMap(backendFormat.getA().size() + f.getSize());
            hashMap.putAll(f);
            for (String str2 : backendFormat.getA()) {
                String p = oyr.p("$", str2, "$");
                String str3 = (String) priceMeta.a.get(str2);
                if (str3 == null) {
                    if (set != null) {
                        set.add(new k7s(str));
                    }
                    str3 = "";
                }
                hashMap.put(p, str3);
            }
            return new v0f0(b9s.a(backendFormat.getB(), hashMap), b9s.b(backendFormat.getC(), hashMap));
        }
        if (set != null) {
            set.add(new l7s(str));
            return null;
        }
        return null;
    }

    public final String i(ServiceLevel serviceLevel, fef fefVar) {
        Object obj;
        ServiceLevel.DescriptionParts descriptionParts = serviceLevel.a;
        String str = null;
        if (descriptionParts != null) {
            String c = descriptionParts.getC();
            if (c == null || c.length() == 0) {
                c = null;
            }
            String b = c != null ? b(fefVar, c) : null;
            if (b != null) {
                return b;
            }
        }
        List list = serviceLevel.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ServiceLevel.TariffDetail) obj).c()) {
                    break;
                }
            }
            ServiceLevel.TariffDetail tariffDetail = (ServiceLevel.TariffDetail) obj;
            if (tariffDetail != null) {
                str = b(fefVar, tariffDetail.getC());
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = serviceLevel.g;
        if (str2 == null) {
            str2 = "";
        }
        return b(fefVar, str2);
    }
}
