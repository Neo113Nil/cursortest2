package defpackage;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ru.yandex.video.m3.ott.data.dto.Vh;

/* loaded from: classes4.dex */
public final class eh implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;

    public eh() {
        this.a = 0;
        List h = u75.h(dh.a, dh.D, dh.c, dh.e, dh.f, dh.g, dh.j, dh.h, dh.i, dh.m, dh.b, dh.l, dh.k, dh.d, dh.s, dh.t, dh.n, dh.o, dh.p, dh.w, dh.x, dh.y, dh.z, dh.A, dh.B, dh.u, dh.v, dh.q, dh.r, dh.C);
        EnumMap enumMap = new EnumMap(dh.class);
        int i = 0;
        for (Object obj : h) {
            enumMap.put((EnumMap) obj, (Object) Integer.valueOf(i));
            i++;
        }
        this.b = enumMap;
        if (enumMap.size() == dh.F.f()) {
            return;
        }
        su4.s(2, null, "Some elements of ActionOrder are missed in JuicyActionOrder", null);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                xe xeVar = (xe) obj;
                xe xeVar2 = (xe) obj2;
                xeVar.getClass();
                xeVar2.getClass();
                EnumMap enumMap = (EnumMap) obj3;
                Integer num = (Integer) enumMap.get(xeVar.b);
                int i3 = 100;
                if (num != null) {
                    i = num.intValue();
                } else {
                    su4.s(2, null, "ActionOrder " + xeVar + " wasn't found in juicyActionOrder", null);
                    i = 100;
                }
                Integer num2 = (Integer) enumMap.get(xeVar2.b);
                if (num2 != null) {
                    i3 = num2.intValue();
                } else {
                    su4.s(2, null, "ActionOrder " + xeVar + " wasn't found in juicyActionOrder", null);
                }
                return Intrinsics.e(i, i3);
            case 1:
                int compare = ((Comparator) obj3).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return mpf.y0.compare(((qfp) obj).c, ((qfp) obj2).c);
            case 2:
                int compare2 = ((eh) obj3).compare(obj, obj2);
                return compare2 != 0 ? compare2 : gl5.b(Integer.valueOf(((qfp) obj).g), Integer.valueOf(((qfp) obj2).g));
            case 3:
                int compare3 = ((dl4) obj3).compare(obj, obj2);
                if (compare3 != 0) {
                    return compare3;
                }
                oq4 oq4Var = ((vaa) obj).a;
                oq4 oq4Var2 = oq4.f;
                return gl5.b(Boolean.valueOf(oq4Var == oq4Var2), Boolean.valueOf(((vaa) obj2).a == oq4Var2));
            case 4:
                int compare4 = ((dl4) obj3).compare(obj, obj2);
                return compare4 != 0 ? compare4 : gl5.b(Integer.valueOf(Math.abs(((vaa) obj2).b - 128)), Integer.valueOf(Math.abs(((vaa) obj).b - 128)));
            case 5:
                int compare5 = ((dl4) obj3).compare(obj, obj2);
                return compare5 != 0 ? compare5 : gl5.b(Integer.valueOf(Math.abs(((vaa) obj2).b - 192)), Integer.valueOf(Math.abs(((vaa) obj).b - 192)));
            case 6:
                int compare6 = ((zda) obj3).compare(obj, obj2);
                return compare6 != 0 ? compare6 : gl5.b(((jja) obj2).a.x, ((jja) obj).a.x);
            case 7:
                ybg ybgVar = (ybg) obj3;
                return gl5.b((Comparable) ybgVar.invoke(obj), (Comparable) ybgVar.invoke(obj2));
            case 8:
                int compare7 = ((zda) obj3).compare(obj, obj2);
                if (compare7 != 0) {
                    return compare7;
                }
                lqs I = ((jja) obj2).a.I();
                lqs lqsVar = lqs.d;
                return gl5.b(Boolean.valueOf(I == lqsVar), Boolean.valueOf(((jja) obj).a.I() == lqsVar));
            case 9:
                int compare8 = ((zda) obj3).compare(obj, obj2);
                if (compare8 != 0) {
                    return compare8;
                }
                lqs I2 = ((jja) obj2).a.I();
                lqs lqsVar2 = lqs.c;
                return gl5.b(Boolean.valueOf(I2 == lqsVar2), Boolean.valueOf(((jja) obj).a.I() == lqsVar2));
            case 10:
                int compare9 = ((ehf) obj3).compare(obj, obj2);
                if (compare9 != 0) {
                    return compare9;
                }
                lqs I3 = ((mqs) obj2).I();
                lqs lqsVar3 = lqs.d;
                return gl5.b(Boolean.valueOf(I3 == lqsVar3), Boolean.valueOf(((mqs) obj).I() == lqsVar3));
            case 11:
                int compare10 = ((ehf) obj3).compare(obj, obj2);
                if (compare10 != 0) {
                    return compare10;
                }
                lqs I4 = ((mqs) obj2).I();
                lqs lqsVar4 = lqs.c;
                return gl5.b(Boolean.valueOf(I4 == lqsVar4), Boolean.valueOf(((mqs) obj).I() == lqsVar4));
            case 12:
                int compare11 = ((ehf) obj3).compare(obj, obj2);
                return compare11 != 0 ? compare11 : gl5.b(((mqs) obj2).x, ((mqs) obj).x);
            case 13:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                return gl5.b((Integer) linkedHashMap.get(((cvl) obj).g()), (Integer) linkedHashMap.get(((cvl) obj2).g()));
            case 14:
                e44 e44Var = (e44) obj3;
                Long l = (Long) e44Var.a.a.get(((r34) obj2).b);
                Long valueOf = Long.valueOf(l != null ? l.longValue() : Long.MIN_VALUE);
                Long l2 = (Long) e44Var.a.a.get(((r34) obj).b);
                return gl5.b(valueOf, Long.valueOf(l2 != null ? l2.longValue() : Long.MIN_VALUE));
            case 15:
                woi woiVar = (woi) obj3;
                return gl5.b(Integer.valueOf(woiVar.c(((Number) obj).longValue())), Integer.valueOf(woiVar.c(((Number) obj2).longValue())));
            case 16:
                jkp jkpVar = (jkp) obj3;
                int H = jkpVar.H(obj) - jkpVar.H(obj2);
                return H != 0 ? H : obj.getClass().getName().compareTo(obj2.getClass().getName());
            case 17:
                List list = (List) obj3;
                return gl5.b(Integer.valueOf(list.indexOf(((mqs) obj).a)), Integer.valueOf(list.indexOf(((mqs) obj2).a)));
            case 18:
                i1u i1uVar = (i1u) obj3;
                int i4 = i1uVar.c;
                Regex regex = i1uVar.b;
                String url = ((Vh.Stream) obj).getUrl();
                irn irnVar = Regex.b;
                jch b = regex.b(url);
                Integer valueOf2 = Integer.valueOf(Math.abs(i4 - (b != null ? Integer.parseInt((String) ((fb9) b.a()).get(2)) * Integer.parseInt((String) ((fb9) b.a()).get(1)) : 0)));
                jch b2 = regex.b(((Vh.Stream) obj2).getUrl());
                return gl5.b(valueOf2, Integer.valueOf(Math.abs(i4 - (b2 != null ? Integer.parseInt((String) ((fb9) b2.a()).get(1)) * Integer.parseInt((String) ((fb9) b2.a()).get(2)) : 0))));
            default:
                Function1 function1 = (Function1) obj3;
                return gl5.b((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
        }
    }

    public eh(Comparator comparator) {
        this.a = 1;
        this.b = comparator;
    }

    public /* synthetic */ eh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
