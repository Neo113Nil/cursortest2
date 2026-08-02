package ru.yandex.taxi.masstransit.geopayment.purchase;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.b64;
import defpackage.cu30;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.ms30;
import defpackage.oyr;
import defpackage.q5z;
import defpackage.qv10;
import defpackage.rr30;
import defpackage.scc;
import defpackage.tcc;
import defpackage.zt30;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class MtPurchaseMapper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/purchase/MtPurchaseMapper$MatchMode;", "", "TRANSPORT", "DEFAULT_FALLBACK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class MatchMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MatchMode[] $VALUES;
        public static final MatchMode DEFAULT_FALLBACK;
        public static final MatchMode TRANSPORT;

        static {
            MatchMode matchMode = new MatchMode("TRANSPORT", 0);
            TRANSPORT = matchMode;
            MatchMode matchMode2 = new MatchMode("DEFAULT_FALLBACK", 1);
            DEFAULT_FALLBACK = matchMode2;
            MatchMode[] matchModeArr = {matchMode, matchMode2};
            $VALUES = matchModeArr;
            $ENTRIES = kotlin.enums.a.a(matchModeArr);
        }

        public static MatchMode valueOf(String str) {
            return (MatchMode) Enum.valueOf(MatchMode.class, str);
        }

        public static MatchMode[] values() {
            return (MatchMode[]) $VALUES.clone();
        }
    }

    public static zt30 a(ms30.d dVar, MtTransportType mtTransportType, Map map) {
        rr30 rr30Var;
        int intValue;
        int intValue2;
        ms30.a aVar = dVar.a;
        if (aVar == null) {
            return null;
        }
        String str = dVar.b;
        if (str == null || evu0.J(str)) {
            str = null;
            rr30Var = null;
        } else {
            rr30Var = null;
        }
        if (str == null) {
            str = mtTransportType.getMapkitType();
        }
        kdc kdcVar = (kdc) map.get(mtTransportType);
        ms30.b bVar = aVar.d;
        if (bVar != null) {
            Integer S = q5z.S(f(bVar.a));
            Integer S2 = q5z.S(f(bVar.b));
            if (S != null) {
                intValue = S.intValue();
            } else if (S2 != null) {
                intValue = S2.intValue();
            }
            if (S2 != null) {
                intValue2 = S2.intValue();
            } else if (S != null) {
                intValue2 = S.intValue();
            }
            rr30Var = new rr30(intValue, intValue2);
        }
        return new zt30(str, aVar, mtTransportType, kdcVar, rr30Var, dVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(ms30.c cVar, List list, Map map, MatchMode matchMode) {
        Object obj;
        zt30 a;
        Object obj2;
        String i;
        List list2 = cVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list2.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                Collection values = linkedHashMap.values();
                ArrayList arrayList = new ArrayList(tcc.n(values, 10));
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    arrayList.add(kotlin.collections.a.J0((List) it2.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    List list3 = (List) it3.next();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list3) {
                        if (((ms30.d) obj3).a != null) {
                            arrayList3.add(obj3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (matchMode == MatchMode.TRANSPORT) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                MtTransportType mtTransportType = (MtTransportType) it4.next();
                                Iterator it5 = arrayList3.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it5.next();
                                    List list4 = ((ms30.d) obj2).c;
                                    String mapkitType = mtTransportType.getMapkitType();
                                    List<String> list5 = list4;
                                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                        for (String str : list5) {
                                            if (!cvu0.t(str, "default", true) && cvu0.t(str, mapkitType, true)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                ms30.d dVar = (ms30.d) obj2;
                                if (dVar != null) {
                                    a = a(dVar, mtTransportType, map);
                                    break;
                                }
                            }
                        } else {
                            Iterator it6 = arrayList3.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it6.next();
                                List list6 = ((ms30.d) obj).c;
                                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                    Iterator it7 = list6.iterator();
                                    while (it7.hasNext()) {
                                        if (cvu0.t((String) it7.next(), "default", true)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            ms30.d dVar2 = (ms30.d) obj;
                            if (dVar2 != null) {
                                MtTransportType mtTransportType2 = (MtTransportType) kotlin.collections.a.R(list);
                                if (mtTransportType2 == null) {
                                    mtTransportType2 = MtTransportType.UNKNOWN;
                                }
                                a = a(dVar2, mtTransportType2, map);
                                if (a == null) {
                                    arrayList2.add(a);
                                }
                            }
                        }
                    }
                    a = null;
                    if (a == null) {
                    }
                }
                return arrayList2;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            ms30.d dVar3 = (ms30.d) next;
            String str2 = dVar3.b;
            if (str2 != null) {
                i = evu0.J(str2) ? null : str2;
            }
            i = oyr.i(i2, "show_policy_");
            Object obj4 = linkedHashMap.get(i);
            if (obj4 == null) {
                obj4 = qv10.w(i, linkedHashMap);
            }
            ((List) obj4).add(dVar3);
            i2 = i3;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static defpackage.cu30 c(defpackage.ms30 r24, java.util.List r25, java.util.Map r26, ru.yandex.taxi.masstransit.geopayment.tickets.model.a r27, defpackage.fe01 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper.c(ms30, java.util.List, java.util.Map, ru.yandex.taxi.masstransit.geopayment.tickets.model.a, fe01, boolean):cu30");
    }

    public static cu30 d(MtPurchaseMapper mtPurchaseMapper, ms30 ms30Var, List list, ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar) {
        Map f = kotlin.collections.b.f();
        mtPurchaseMapper.getClass();
        return c(ms30Var, list, f, aVar, null, false);
    }

    public static String e(ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar, String str, String str2) {
        Set entrySet = aVar.a.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (!((List) ((Map.Entry) obj).getValue()).isEmpty()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            List list = (List) ((Map.Entry) kotlin.collections.a.P(arrayList)).getValue();
            if (list.size() == 1) {
                String str3 = (String) kotlin.collections.a.P(list);
                if (str == null || evu0.J(str)) {
                    str = null;
                }
                if (str != null) {
                    return cvu0.s(str, "id=", false) ? b64.j(str, str3) : evu0.y(str, "id=", false) ? str : g8e.p(str, "?id=", str3);
                }
            }
        }
        return str2;
    }

    public static String f(String str) {
        String obj;
        return (str == null || (obj = evu0.k0(str).toString()) == null || !cvu0.x(obj, ShimmerDivHandler.NUMBER_SING, false) || obj.length() != 9) ? str : oyr.p(ShimmerDivHandler.NUMBER_SING, obj.substring(7, 9), obj.substring(1, 7));
    }
}
