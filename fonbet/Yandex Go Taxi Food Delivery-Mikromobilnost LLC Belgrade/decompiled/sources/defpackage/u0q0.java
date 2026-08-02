package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class u0q0 implements s1m, dez {
    public final a1q0 a;
    public final seu b;
    public final i7x0 c;
    public final zjr w = new zjr(xfz.b(u0q0.class.getSimpleName()));

    public u0q0(a1q0 a1q0Var, seu seuVar, i7x0 i7x0Var) {
        this.a = a1q0Var;
        this.b = seuVar;
        this.c = i7x0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.Map] */
    public static xyp0 d(dzp0 dzp0Var, dzp0 dzp0Var2) {
        LinkedHashMap linkedHashMap;
        xyp0 xyp0Var = dzp0Var.d;
        xyp0 xyp0Var2 = xyp0Var == null ? new xyp0((kr) null, (kr) null, (kr) null, (kr) null, (kr) null, (LinkedHashMap) null, HProv.PP_VERSION_TIMESTAMP) : xyp0Var;
        xyp0 xyp0Var3 = dzp0Var2.d;
        LinkedHashMap linkedHashMap2 = null;
        kr krVar = xyp0Var3 != null ? xyp0Var3.f : null;
        Map map = xyp0Var != null ? xyp0Var.g : null;
        LinkedHashMap linkedHashMap3 = xyp0Var3 != null ? xyp0Var3.g : null;
        if (map == null) {
            linkedHashMap = linkedHashMap3;
        } else {
            if (linkedHashMap3 != null) {
                LinkedHashMap n = b.n(map, linkedHashMap3);
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : n.entrySet()) {
                    if (((j2q0) entry.getValue()).a() != null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            linkedHashMap = linkedHashMap2;
        }
        return new xyp0(xyp0Var2.a, xyp0Var2.b, xyp0Var2.c, xyp0Var2.d, xyp0Var2.e, krVar, linkedHashMap);
    }

    public static Map e(u1m u1mVar, List list) {
        String str;
        Map map = u1mVar.b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + Extension.COLON_SPACE + a.X((List) entry.getValue(), Extension.FIX_SPACE, null, null, null, 62));
        }
        Pair pair = new Pair("query", a.X(arrayList, "\n", null, null, null, 62));
        Map map2 = u1mVar.c;
        if (map2 != null) {
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList2.add(((String) entry2.getKey()) + Extension.COLON_SPACE + entry2.getValue());
            }
            str = a.X(arrayList2, "\n", null, null, null, 62);
        } else {
            str = "";
        }
        return b.i(pair, new Pair("body", str), new Pair("tags", a.X(list, Extension.FIX_SPACE, null, null, null, 62)));
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.w;
    }

    @Override // defpackage.s1m
    public final ywl b(kq90 kq90Var, ywl ywlVar, ywl ywlVar2, ywl ywlVar3) {
        if (kq90Var instanceof d3q0) {
            dzp0 d0 = rzo.d0(ywlVar);
            cnr0 cnr0Var = ywlVar.c;
            if (d0 != null) {
                List list = d0.b;
                dzp0 d02 = rzo.d0(ywlVar2);
                cnr0 cnr0Var2 = ywlVar2.c;
                if (d02 != null) {
                    List<pyp0> list2 = d02.b;
                    w2q0 w2q0Var = ((d3q0) kq90Var).a;
                    int i = 0;
                    if (w2q0Var instanceof q2q0) {
                        if (!list2.isEmpty()) {
                            ArrayList arrayList = new ArrayList(list);
                            for (pyp0 pyp0Var : list2) {
                                String a = pyp0Var.getA();
                                Iterator it = arrayList.iterator();
                                int i2 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i2 = -1;
                                        break;
                                    }
                                    if (jl40.l(((pyp0) it.next()).getA(), a)) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (i2 != -1) {
                                    Object obj = (pyp0) arrayList.get(i2);
                                    if (obj instanceof rr10) {
                                        arrayList.set(i2, ((rr10) obj).b(pyp0Var));
                                    }
                                }
                            }
                            list = arrayList;
                        }
                        return ywl.a(ywlVar, dzp0.a(d0, null, list, d02.c, d(d0, d02), d02.f, 17), null, cnr0Var.a(cnr0Var2), ywlVar2.d, 50);
                    }
                    if (w2q0Var instanceof u2q0) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (jl40.l(((pyp0) it2.next()).getA(), ((u2q0) w2q0Var).a())) {
                                break;
                            }
                            i++;
                        }
                        if (i == -1) {
                            return ywlVar;
                        }
                        ArrayList arrayList2 = new ArrayList(list);
                        arrayList2.remove(i);
                        arrayList2.addAll(i, list2);
                        return ywl.a(ywlVar, dzp0.a(d0, null, arrayList2, d02.c, null, d02.f, 25), null, cnr0Var.a(cnr0Var2), ywlVar2.d, 50);
                    }
                    if (w2q0Var instanceof r2q0) {
                        ArrayList arrayList3 = new ArrayList(list);
                        List list3 = list2;
                        int d = gw00.d(tcc.n(list3, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (Object obj2 : list3) {
                            linkedHashMap.put(((pyp0) obj2).getA(), obj2);
                        }
                        int size = arrayList3.size();
                        while (i < size) {
                            pyp0 pyp0Var2 = (pyp0) linkedHashMap.get(((pyp0) arrayList3.get(i)).getA());
                            if (pyp0Var2 != null) {
                                arrayList3.set(i, pyp0Var2);
                            }
                            i++;
                        }
                        return ywl.a(ywlVar, dzp0.a(d0, null, arrayList3, d02.c, null, d02.f, 25), null, cnr0Var.a(cnr0Var2), ywlVar2.d, 50);
                    }
                    if (!(w2q0Var instanceof v2q0)) {
                        if (!(w2q0Var instanceof n2q0)) {
                            w511.b();
                            return null;
                        }
                        List list4 = list;
                        ArrayList arrayList4 = new ArrayList(tcc.n(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(((pyp0) it3.next()).getA());
                        }
                        Set M0 = a.M0(arrayList4);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(list);
                        for (pyp0 pyp0Var3 : list2) {
                            if (!M0.contains(pyp0Var3.getA())) {
                                arrayList5.add(pyp0Var3);
                                M0.add(pyp0Var3.getA());
                            }
                        }
                        return ywl.a(ywlVar, dzp0.a(d0, null, arrayList5, d02.c, d(d0, d02), d02.f, 17), null, cnr0Var.a(cnr0Var2), ywlVar2.d, 50);
                    }
                    if (!list2.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList(list);
                        for (pyp0 pyp0Var4 : list2) {
                            String a2 = pyp0Var4.getA();
                            Iterator it4 = arrayList6.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    i3 = -1;
                                    break;
                                }
                                if (jl40.l(((pyp0) it4.next()).getA(), a2)) {
                                    break;
                                }
                                i3++;
                            }
                            if (i3 != -1) {
                                Object obj3 = (pyp0) arrayList6.get(i3);
                                if (obj3 instanceof h621) {
                                    arrayList6.set(i3, ((h621) obj3).a(pyp0Var4));
                                }
                            }
                        }
                        list = arrayList6;
                    }
                    return ywl.a(ywlVar, dzp0.a(d0, null, list, d02.c, null, d02.f, 25), null, cnr0Var.a(cnr0Var2), ywlVar2.d, 50);
                }
            }
        }
        return ywlVar3;
    }

    @Override // defpackage.s1m
    public final Object c(klc klcVar, u1m u1mVar, kq90 kq90Var, ywl ywlVar, Throwable th, Continuation continuation) {
        dzp0 d0;
        int i;
        StackTraceElement stackTraceElement;
        String str;
        if ((kq90Var instanceof d3q0) && (d0 = rzo.d0(ywlVar)) != null) {
            List list = d0.b;
            w2q0 w2q0Var = ((d3q0) kq90Var).a;
            String str2 = w2q0Var.a;
            this.a.e(u1mVar, str2, th);
            if (u1mVar != null) {
                seu seuVar = this.b;
                i7x0 i7x0Var = this.c;
                List list2 = EmptyList.a;
                if (seuVar != null) {
                    th.getClass();
                    ErrorTypes.SECTIONS_OPERATION_FAILED.getClass();
                    gw00.e(new Pair("operation", str2));
                    List c = i7x0Var != null ? i7x0Var.c() : null;
                    if (c == null) {
                        c = list2;
                    }
                    e(u1mVar, c);
                }
                String type = ErrorTypes.SECTIONS_OPERATION_FAILED.getType();
                c2r0 c2r0Var = new c2r0(5, 1);
                i = 0;
                c2r0Var.a(new Pair("locator", "SectionDocumentPatcher.onError"));
                c2r0Var.a(new Pair("cause", th));
                c2r0Var.a(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, oyr.p("Section patching error: failed to patch section (", th.getMessage(), Extension.C_BRAKE)));
                c2r0Var.a(new Pair("operation", str2));
                List c2 = i7x0Var != null ? i7x0Var.c() : null;
                if (c2 == null) {
                    c2 = list2;
                }
                c2r0Var.b(dai0.J(e(u1mVar, c2)));
                ArrayList arrayList = c2r0Var.b;
                i3y a = xfz.a((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                zjr zjrVar = this.w;
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str);
                }
                zjrVar.d(FlexLogLevel.ERROR, "Failed to patch section", xfz.c(a, xfz.a(new Pair("errorType", type))), list2, tjrVar.a, tjrVar.b, tjrVar.c);
            } else {
                i = 0;
            }
            if (w2q0Var instanceof q2q0) {
                ArrayList arrayList2 = new ArrayList(list);
                Iterator it = arrayList2.iterator();
                int i2 = i;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (jl40.l(((pyp0) it.next()).getA(), ((q2q0) w2q0Var).c)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    pyp0 pyp0Var = (pyp0) arrayList2.get(i2);
                    if (pyp0Var instanceof cvl) {
                        arrayList2.set(i2, ((cvl) pyp0Var).g());
                        return ywl.a(ywlVar, dzp0.a(d0, null, arrayList2, null, null, d0.f, 29), null, null, null, 62);
                    }
                }
            } else if (w2q0Var instanceof n2q0) {
                return ywl.a(ywlVar, dzp0.a(d0, null, a.o0(list, new pwg("Не удалось загрузить следующую страницу", ljo.b(th))), null, null, d0.f, 29), null, null, null, 62);
            }
        }
        return ywlVar;
    }
}
