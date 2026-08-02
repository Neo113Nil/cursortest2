package defpackage;

import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.maps.core.geometry.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public final class ve61 {
    public final ewi a;
    public final float b;
    public final l2c0 c;
    public final int g;
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final int h = 0;
    public int i = -1;

    public ve61(ewi ewiVar, float f, l2c0 l2c0Var, float f2) {
        this.a = ewiVar;
        this.b = f;
        this.c = l2c0Var;
        this.g = m810.b(1.0f / f2);
    }

    public static final float a(ve61 ve61Var, Object obj) {
        qzb0 qzb0Var = (qzb0) ve61Var.d.get(obj);
        if (qzb0Var != null) {
            return qzb0Var.b;
        }
        return 0.0f;
    }

    public final void b(qzb0 qzb0Var) {
        this.d.put(qzb0Var.a.a(), qzb0Var);
        Object a = qzb0Var.a.a();
        Point point = qzb0Var.c;
        go10 go10Var = (go10) this.c;
        XYPoint worldToXY = ((Projection) go10Var.a.getValue()).worldToXY(new com.yandex.mapkit.geometry.Point(point.getLat(), point.getLon()), 0);
        this.e.put(a, new h041(worldToXY.getX() / go10Var.a(), worldToXY.getY() / go10Var.a()));
    }

    public final Integer c(float f) {
        int i = this.i;
        int i2 = this.h;
        if (i >= i2) {
            return Integer.valueOf(y6i0.d((int) (f * this.g), i2, i));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    public final void d() {
        int i;
        int i2;
        int i3;
        EmptyList emptyList;
        int i4;
        HashMap hashMap;
        LinkedHashMap linkedHashMap;
        Integer num;
        EmptyList emptyList2;
        char c;
        LinkedHashMap linkedHashMap2;
        int i5;
        double d;
        int i6;
        boolean[] zArr;
        Integer num2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        float f;
        List list;
        double d2;
        s7c q7cVar;
        h041 h041Var;
        int i7;
        int i8;
        boolean[] zArr2;
        float f2;
        LinkedHashMap linkedHashMap4 = this.f;
        HashMap hashMap2 = new HashMap(linkedHashMap4);
        linkedHashMap4.clear();
        LinkedHashMap linkedHashMap5 = this.d;
        if (linkedHashMap5.isEmpty() || (i = this.i) < (i2 = this.h)) {
            this.i = -1;
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        Collection values = linkedHashMap5.values();
        char c2 = '\n';
        ArrayList arrayList2 = new ArrayList(tcc.n(values, 10));
        Iterator it = values.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i3 = this.g;
            emptyList = EmptyList.a;
            if (!hasNext) {
                break;
            }
            qzb0 qzb0Var = (qzb0) it.next();
            Object a = qzb0Var.a.a();
            arrayList2.add(new a8c(qzb0Var, this.i / i3, a, (h041) this.e.get(a), Collections.singleton(a), emptyList));
        }
        linkedHashMap4.put(valueOf, arrayList2);
        boolean z = true;
        int i9 = this.i - 1;
        if (i2 > i9) {
            return;
        }
        while (true) {
            float f3 = i9 / i3;
            ?? r9 = (List) linkedHashMap4.get(Integer.valueOf(i9 + 1));
            List list2 = (List) hashMap2.get(Integer.valueOf(i9));
            if (list2 == null) {
                list2 = emptyList;
            }
            Integer valueOf2 = Integer.valueOf(i9);
            if (r9.isEmpty()) {
                hashMap = hashMap2;
                linkedHashMap = linkedHashMap5;
                i4 = i3;
                num = valueOf2;
                c = c2;
                emptyList2 = emptyList;
            } else if (r9.size() == z) {
                hashMap = hashMap2;
                linkedHashMap = linkedHashMap5;
                i4 = i3;
                num = valueOf2;
                c = c2;
                emptyList2 = r9;
            } else {
                List list3 = r9;
                i4 = i3;
                List<a8c> list4 = list2;
                double pow = (this.b * this.a.a) / (Math.pow(2.0d, f3) * 256.0d);
                double d3 = pow * pow;
                int size = list3.size();
                boolean[] zArr3 = new boolean[size];
                ArrayList arrayList3 = new ArrayList();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (a8c a8cVar : list4) {
                    boolean z2 = z;
                    HashMap hashMap3 = hashMap2;
                    Iterator it2 = a8cVar.e.iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = it2;
                        Object next = it3.next();
                        Object obj = linkedHashMap6.get(next);
                        if (obj == null) {
                            f2 = f3;
                            ArrayList arrayList4 = new ArrayList();
                            linkedHashMap6.put(next, arrayList4);
                            obj = arrayList4;
                        } else {
                            f2 = f3;
                        }
                        ((List) obj).add(a8cVar);
                        it2 = it3;
                        f3 = f2;
                    }
                    z = z2;
                    hashMap2 = hashMap3;
                }
                hashMap = hashMap2;
                boolean z3 = z;
                float f4 = f3;
                int i10 = 0;
                ?? r13 = arrayList3;
                while (i10 < size) {
                    if (zArr3[i10]) {
                        linkedHashMap2 = linkedHashMap5;
                        i5 = i10;
                        d = d3;
                        i6 = size;
                        zArr = zArr3;
                        num2 = valueOf2;
                        arrayList = r13;
                        linkedHashMap3 = linkedHashMap6;
                        f = f4;
                        list = list3;
                    } else {
                        List list5 = list3;
                        h041 h041Var2 = ((a8c) list5.get(i10)).d;
                        d = d3;
                        ArrayList i11 = scc.i(Integer.valueOf(i10));
                        int i12 = i10 + 1;
                        while (i12 < size) {
                            if (zArr3[i12]) {
                                h041Var = h041Var2;
                                i7 = i12;
                                i8 = size;
                                zArr2 = zArr3;
                            } else {
                                i8 = size;
                                zArr2 = zArr3;
                                double d4 = h041Var2.a - ((a8c) list5.get(i12)).d.a;
                                h041Var = h041Var2;
                                i7 = i12;
                                double d5 = h041Var2.b - ((a8c) list5.get(i12)).d.b;
                                if ((d5 * d5) + (d4 * d4) <= d) {
                                    i11.add(Integer.valueOf(i7));
                                }
                            }
                            i12 = i7 + 1;
                            zArr3 = zArr2;
                            h041Var2 = h041Var;
                            size = i8;
                        }
                        i6 = size;
                        boolean[] zArr4 = zArr3;
                        Iterator it4 = i11.iterator();
                        while (it4.hasNext()) {
                            zArr4[((Number) it4.next()).intValue()] = z3;
                        }
                        if (i11.size() == z3) {
                            r13.add(list5.get(i10));
                            linkedHashMap2 = linkedHashMap5;
                            i5 = i10;
                            list = list5;
                            num2 = valueOf2;
                            arrayList = r13;
                            linkedHashMap3 = linkedHashMap6;
                            zArr = zArr4;
                            f = f4;
                        } else {
                            ArrayList arrayList5 = new ArrayList(tcc.n(i11, 10));
                            Iterator it5 = i11.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add((a8c) list5.get(((Number) it5.next()).intValue()));
                            }
                            HashSet hashSet = new HashSet();
                            Iterator it6 = arrayList5.iterator();
                            while (it6.hasNext()) {
                                hashSet.addAll(((a8c) it6.next()).e);
                            }
                            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                            Iterator it7 = hashSet.iterator();
                            while (it7.hasNext()) {
                                List list6 = (List) linkedHashMap6.get(it7.next());
                                if (list6 != null) {
                                    Iterator it8 = list6.iterator();
                                    while (it8.hasNext()) {
                                        ArrayList arrayList6 = arrayList5;
                                        Object obj2 = ((a8c) it8.next()).c;
                                        Integer num3 = (Integer) linkedHashMap7.get(obj2);
                                        linkedHashMap7.put(obj2, Integer.valueOf((num3 != null ? num3.intValue() : 0) + 1));
                                        arrayList5 = arrayList6;
                                        i10 = i10;
                                    }
                                }
                            }
                            ArrayList arrayList7 = arrayList5;
                            i5 = i10;
                            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap7.entrySet()) {
                                if (hashSet.contains(entry.getKey())) {
                                    linkedHashMap8.put(entry.getKey(), entry.getValue());
                                }
                            }
                            Object key = !linkedHashMap8.isEmpty() ? ((Map.Entry) a.g0(linkedHashMap8.entrySet(), new pzo(10, new w83(2, new ue61(), this)))).getKey() : a.g0(hashSet, new pzo(11, new pzo(9, this)));
                            Iterator it9 = arrayList7.iterator();
                            double d6 = 0.0d;
                            double d7 = 0.0d;
                            double d8 = 0.0d;
                            while (it9.hasNext()) {
                                a8c a8cVar2 = (a8c) it9.next();
                                double size2 = a8cVar2.e.size();
                                d7 += size2;
                                h041 h041Var3 = a8cVar2.d;
                                d6 = (h041Var3.a * size2) + d6;
                                d8 = (h041Var3.b * size2) + d8;
                                list5 = list5;
                                hashSet = hashSet;
                            }
                            list = list5;
                            HashSet hashSet2 = hashSet;
                            double d9 = d6 / d7;
                            double d10 = d8 / d7;
                            h041 h041Var4 = new h041(d9, d10);
                            Point b = ((go10) this.c).b(h041Var4);
                            ArrayList arrayList8 = new ArrayList();
                            Iterator it10 = hashSet2.iterator();
                            while (it10.hasNext()) {
                                h041 h041Var5 = h041Var4;
                                qzb0 qzb0Var2 = (qzb0) linkedHashMap5.get(it10.next());
                                if (qzb0Var2 != null) {
                                    arrayList8.add(qzb0Var2);
                                }
                                h041Var4 = h041Var5;
                            }
                            h041 h041Var6 = h041Var4;
                            double d11 = 0.0d;
                            while (arrayList8.iterator().hasNext()) {
                                d11 += ((qzb0) r1.next()).b;
                                d9 = d9;
                            }
                            double d12 = d9;
                            float c3 = y6i0.c((float) (d11 / arrayList8.size()), 0.0f, 0.9999999f);
                            ArrayList arrayList9 = new ArrayList(tcc.n(arrayList8, 10));
                            Iterator it11 = arrayList8.iterator();
                            while (it11.hasNext()) {
                                arrayList9.add(((qzb0) it11.next()).f);
                            }
                            Set N0 = a.N0(arrayList9);
                            if (N0.size() == 1) {
                                int size3 = arrayList8.size();
                                String str = (String) a.O(N0);
                                ArrayList arrayList10 = new ArrayList(tcc.n(arrayList8, 10));
                                Iterator it12 = arrayList8.iterator();
                                while (it12.hasNext()) {
                                    arrayList10.add(((qzb0) it12.next()).a.a);
                                }
                                ArrayList arrayList11 = new ArrayList(tcc.n(arrayList8, 10));
                                Iterator it13 = arrayList8.iterator();
                                while (it13.hasNext()) {
                                    arrayList11.add(((qzb0) it13.next()).c);
                                }
                                ArrayList arrayList12 = new ArrayList(tcc.n(arrayList8, 10));
                                Iterator it14 = arrayList8.iterator();
                                while (it14.hasNext()) {
                                    arrayList12.add(((qzb0) it14.next()).a.a());
                                }
                                s7c r7cVar = new r7c(size3, str, arrayList10, arrayList11, arrayList12);
                                linkedHashMap2 = linkedHashMap5;
                                d2 = d10;
                                num2 = valueOf2;
                                arrayList = r13;
                                linkedHashMap3 = linkedHashMap6;
                                zArr = zArr4;
                                q7cVar = r7cVar;
                            } else {
                                int size4 = arrayList8.size();
                                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                                Iterator it15 = arrayList8.iterator();
                                while (it15.hasNext()) {
                                    Object next2 = it15.next();
                                    LinkedHashMap linkedHashMap10 = linkedHashMap5;
                                    String str2 = ((qzb0) next2).f;
                                    Object obj3 = linkedHashMap9.get(str2);
                                    if (obj3 == null) {
                                        obj3 = qv10.w(str2, linkedHashMap9);
                                    }
                                    ((List) obj3).add(next2);
                                    linkedHashMap5 = linkedHashMap10;
                                }
                                linkedHashMap2 = linkedHashMap5;
                                ArrayList arrayList13 = new ArrayList(linkedHashMap9.size());
                                Iterator it16 = linkedHashMap9.entrySet().iterator();
                                ArrayList arrayList14 = r13;
                                while (it16.hasNext()) {
                                    Map.Entry entry2 = (Map.Entry) it16.next();
                                    String str3 = (String) entry2.getKey();
                                    List list7 = (List) entry2.getValue();
                                    Integer num4 = valueOf2;
                                    int size5 = list7.size();
                                    List list8 = list7;
                                    LinkedHashMap linkedHashMap11 = linkedHashMap6;
                                    Iterator it17 = it16;
                                    double d13 = d10;
                                    ArrayList arrayList15 = new ArrayList(tcc.n(list8, 10));
                                    Iterator it18 = list8.iterator();
                                    while (it18.hasNext()) {
                                        arrayList15.add(((qzb0) it18.next()).a.a);
                                    }
                                    ArrayList arrayList16 = new ArrayList(tcc.n(list8, 10));
                                    Iterator it19 = list8.iterator();
                                    while (it19.hasNext()) {
                                        arrayList16.add(((qzb0) it19.next()).a.a());
                                    }
                                    arrayList13.add(new r7c(size5, str3, arrayList15, emptyList, arrayList16));
                                    valueOf2 = num4;
                                    zArr4 = zArr4;
                                    arrayList14 = arrayList14;
                                    linkedHashMap6 = linkedHashMap11;
                                    it16 = it17;
                                    d10 = d13;
                                }
                                d2 = d10;
                                num2 = valueOf2;
                                arrayList = arrayList14;
                                linkedHashMap3 = linkedHashMap6;
                                zArr = zArr4;
                                ArrayList arrayList17 = new ArrayList(tcc.n(arrayList8, 10));
                                Iterator it20 = arrayList8.iterator();
                                while (it20.hasNext()) {
                                    arrayList17.add(((qzb0) it20.next()).c);
                                }
                                q7cVar = new q7c(size4, arrayList13, arrayList17);
                            }
                            f = f4;
                            arrayList.add(new a8c(new qzb0(new g8c(q7cVar, key, d12, d2), c3, b, q7cVar instanceof r7c ? PinState.CLUSTER : PinState.SUPERCLUSTER, 40), f, key, h041Var6, hashSet2, arrayList7));
                            valueOf2 = num2;
                            zArr3 = zArr;
                            r13 = arrayList;
                            linkedHashMap6 = linkedHashMap3;
                            f4 = f;
                            d3 = d;
                            size = i6;
                            list3 = list;
                            linkedHashMap5 = linkedHashMap2;
                            z3 = true;
                            i10 = i5 + 1;
                        }
                    }
                    valueOf2 = num2;
                    zArr3 = zArr;
                    r13 = arrayList;
                    linkedHashMap6 = linkedHashMap3;
                    f4 = f;
                    d3 = d;
                    size = i6;
                    list3 = list;
                    linkedHashMap5 = linkedHashMap2;
                    z3 = true;
                    i10 = i5 + 1;
                }
                linkedHashMap = linkedHashMap5;
                num = valueOf2;
                emptyList2 = r13;
                c = '\n';
            }
            linkedHashMap4.put(num, emptyList2);
            if (i9 == i2) {
                return;
            }
            i9--;
            c2 = c;
            i3 = i4;
            hashMap2 = hashMap;
            linkedHashMap5 = linkedHashMap;
            z = true;
        }
    }

    public final h041 e(float f, Object obj) {
        List list;
        Object obj2;
        Integer c = c(f);
        if (c != null && (list = (List) this.f.get(c)) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((a8c) obj2).e.contains(obj)) {
                    break;
                }
            }
            a8c a8cVar = (a8c) obj2;
            if (a8cVar != null) {
                return a8cVar.d;
            }
        }
        return null;
    }

    public final h041 f(float f, Object obj) {
        int intValue;
        List list;
        Object obj2;
        if (c(f) != null && r3.intValue() - 1 >= this.h && (list = (List) this.f.get(Integer.valueOf(intValue))) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((a8c) obj2).e.contains(obj)) {
                    break;
                }
            }
            a8c a8cVar = (a8c) obj2;
            if (a8cVar != null) {
                return a8cVar.d;
            }
        }
        return null;
    }

    public final h041 g(float f, Object obj) {
        List list;
        Object obj2;
        Integer c = c(f);
        if (c != null && (list = (List) this.f.get(c)) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((a8c) obj2).c, obj)) {
                    break;
                }
            }
            a8c a8cVar = (a8c) obj2;
            if (a8cVar != null) {
                return a8cVar.d;
            }
        }
        return null;
    }
}
