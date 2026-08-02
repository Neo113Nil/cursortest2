package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class kli extends s4k {
    public final ArrayList b;
    public final aqd c;
    public final d20 d;
    public final no6 e;
    public final hwl f;
    public final sy7 g;
    public final int h;
    public final m2g i;
    public final boolean j;
    public final int k;
    public final int l;
    public final boolean m;

    public kli(ArrayList arrayList, aqd aqdVar, d20 d20Var, no6 no6Var, hwl hwlVar, sy7 sy7Var, m2g m2gVar) {
        aqdVar.getClass();
        d20Var.getClass();
        no6Var.getClass();
        hwlVar.getClass();
        sy7Var.getClass();
        this.b = arrayList;
        this.c = aqdVar;
        this.d = d20Var;
        this.e = no6Var;
        this.f = hwlVar;
        this.g = sy7Var;
        this.h = 10;
        this.i = m2gVar;
        this.j = true;
        int size = arrayList.size();
        this.k = size;
        int i = size / 10;
        int i2 = size % 10;
        this.l = i + (i2 > 1 ? 1 : i2);
        this.m = true;
    }

    @Override // defpackage.s4k
    public final boolean a() {
        return this.j;
    }

    @Override // defpackage.s4k
    public final boolean b() {
        return this.m;
    }

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        Integer num = t4kVar.b;
        if (num != null) {
            return Integer.valueOf(yhn.d(num.intValue() / this.h, 0, this.l - 1));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0360  */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x01ec -> B:14:0x031d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x02cd -> B:11:0x02d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x02e1 -> B:12:0x02e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x031a -> B:14:0x031d). Please report as a decompilation issue!!! */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        jli jliVar;
        int i;
        int intValue;
        int i2;
        List subList;
        int i3;
        Object obj;
        int i4;
        rj6 rj6Var;
        int i5;
        ArrayList arrayList;
        Iterator it;
        int i6;
        int i7;
        int i8;
        int i9;
        rj6 rj6Var2;
        int i10;
        w2r w2rVar;
        if (cg6Var instanceof jli) {
            jliVar = (jli) cg6Var;
            int i11 = jliVar.x;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jliVar.x = i11 - Integer.MIN_VALUE;
                Object obj2 = jliVar.v;
                nm6 nm6Var = nm6.a;
                i = jliVar.x;
                int i12 = this.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    Integer num = (Integer) o4kVar.a();
                    intValue = num != null ? num.intValue() : 0;
                    int i13 = this.h;
                    i2 = intValue * i13;
                    int i14 = i13 + i2;
                    ArrayList arrayList2 = this.b;
                    int size = arrayList2.size();
                    if (i14 > size) {
                        i14 = size;
                    }
                    subList = arrayList2.subList(i2, i14);
                    n8g b = t75.b();
                    List list = subList;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof bli) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        hji hjiVar = (hji) ((bli) it2.next()).b().b;
                        gji gjiVar = hjiVar instanceof gji ? (gji) hjiVar : null;
                        if (gjiVar != null) {
                            arrayList4.add(gjiVar);
                        }
                    }
                    b.addAll(CollectionsKt.A0(arrayList4));
                    ArrayList arrayList5 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(new kmi((rr5) ((bli) it3.next()).b().d));
                    }
                    b.addAll(arrayList5);
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof yji) {
                            arrayList6.add(obj4);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(((yji) it4.next()).d());
                    }
                    b.addAll(arrayList7);
                    n8g a = t75.a(b);
                    int i15 = this.k - i14;
                    jliVar.j = subList;
                    jliVar.p = intValue;
                    jliVar.q = i2;
                    jliVar.r = i14;
                    jliVar.s = i15;
                    jliVar.x = 1;
                    Object k = this.c.k(a, jliVar);
                    if (k == nm6Var) {
                        return nm6Var;
                    }
                    i3 = i14;
                    obj = k;
                    i4 = i15;
                } else if (i == 1) {
                    int i16 = jliVar.s;
                    i3 = jliVar.r;
                    i2 = jliVar.q;
                    intValue = jliVar.p;
                    subList = jliVar.j;
                    qgg.h0(obj2);
                    i4 = i16;
                    obj = obj2;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i17 = jliVar.u;
                    int i18 = jliVar.t;
                    int i19 = jliVar.s;
                    i5 = jliVar.r;
                    int i20 = jliVar.q;
                    i9 = jliVar.p;
                    Collection collection = jliVar.o;
                    gli gliVar = jliVar.n;
                    it = jliVar.m;
                    Collection collection2 = jliVar.l;
                    rj6Var2 = jliVar.k;
                    List list2 = jliVar.j;
                    qgg.h0(obj2);
                    Object obj5 = obj2;
                    int i21 = i12;
                    nm6 nm6Var2 = nm6Var;
                    ArrayList arrayList8 = collection;
                    ArrayList arrayList9 = collection2;
                    gli gliVar2 = gliVar;
                    gliVar = (nki) obj5;
                    i10 = i17;
                    i6 = i20;
                    i7 = i19;
                    i8 = i18;
                    gli gliVar3 = gliVar2;
                    ArrayList arrayList10 = arrayList9;
                    if (gliVar == null) {
                        gliVar = o5g.K(gliVar3);
                    }
                    arrayList8.add(gliVar);
                    nm6Var = nm6Var2;
                    arrayList = arrayList10;
                    i12 = i21;
                    if (it.hasNext()) {
                        gliVar = (gli) it.next();
                        if (gliVar instanceof bli) {
                            qj6 qj6Var = (qj6) rj6Var2;
                            ArrayList arrayList11 = arrayList;
                            i21 = i12;
                            bli bliVar = (bli) gliVar;
                            nm6 nm6Var3 = nm6Var;
                            Object obj6 = ((Map) qj6Var.a).get(new kmi((rr5) bliVar.b().d));
                            jmi jmiVar = obj6 instanceof jmi ? (jmi) obj6 : null;
                            mqs mqsVar = jmiVar != null ? jmiVar.a : null;
                            if (mqsVar == null) {
                                gliVar = o5g.K(gliVar);
                            } else {
                                hji hjiVar2 = (hji) bliVar.b().b;
                                if (hjiVar2 instanceof zii) {
                                    anx b2 = bliVar.b();
                                    w2rVar = new w2r(b2.a, (zii) hjiVar2, (ArrayList) b2.c, mqsVar);
                                } else {
                                    if (!(hjiVar2 instanceof gji)) {
                                        b6e.s();
                                        return null;
                                    }
                                    anx b3 = bliVar.b();
                                    Object obj7 = ((Map) qj6Var.a).get(hjiVar2);
                                    zii ziiVar = obj7 instanceof zii ? (zii) obj7 : null;
                                    if (ziiVar == null) {
                                        ziiVar = vii.a;
                                    }
                                    w2rVar = new w2r(b3.a, ziiVar, (ArrayList) b3.c, mqsVar);
                                }
                                if (bliVar instanceof zki) {
                                    gliVar = a4g.w(this.d, w2rVar, ((zki) bliVar).b);
                                } else {
                                    if (!(bliVar instanceof ali)) {
                                        b6e.s();
                                        return null;
                                    }
                                    w70 w70Var = ((ali) bliVar).b;
                                    no6 no6Var = this.e;
                                    no6Var.getClass();
                                    w70Var.getClass();
                                    gliVar = new dli(no6Var.a((mqs) w2rVar.d), w70Var, w2rVar);
                                }
                            }
                            arrayList8 = arrayList11;
                            arrayList10 = arrayList8;
                            nm6Var2 = nm6Var3;
                        } else {
                            nm6 nm6Var4 = nm6Var;
                            i21 = i12;
                            ArrayList arrayList12 = arrayList;
                            if (gliVar instanceof yji) {
                                yji yjiVar = (yji) gliVar;
                                Object obj8 = ((Map) ((qj6) rj6Var2).a).get(yjiVar.d());
                                zii ziiVar2 = obj8 instanceof zii ? (zii) obj8 : null;
                                if (ziiVar2 != null) {
                                    w70 a2 = yjiVar.a();
                                    jliVar.getClass();
                                    jliVar.j = null;
                                    jliVar.k = rj6Var2;
                                    ArrayList arrayList13 = arrayList12;
                                    jliVar.l = arrayList13;
                                    jliVar.m = it;
                                    jliVar.n = yjiVar;
                                    jliVar.o = arrayList13;
                                    jliVar.p = i9;
                                    jliVar.q = i6;
                                    jliVar.r = i5;
                                    jliVar.s = i7;
                                    jliVar.t = i8;
                                    jliVar.u = i10;
                                    jliVar.x = 2;
                                    Object N = tt0.N(this.f, ziiVar2, a2, this.g, jliVar);
                                    nm6Var2 = nm6Var4;
                                    if (N == nm6Var2) {
                                        return nm6Var2;
                                    }
                                    ArrayList arrayList14 = arrayList12;
                                    i18 = i8;
                                    i19 = i7;
                                    i20 = i6;
                                    i17 = i10;
                                    obj5 = N;
                                    arrayList8 = arrayList14;
                                    arrayList9 = arrayList14;
                                    gli gliVar22 = gliVar;
                                    gliVar = (nki) obj5;
                                    i10 = i17;
                                    i6 = i20;
                                    i7 = i19;
                                    i8 = i18;
                                    gli gliVar32 = gliVar22;
                                    ArrayList arrayList102 = arrayList9;
                                    if (gliVar == null) {
                                    }
                                } else {
                                    nm6Var2 = nm6Var4;
                                    arrayList8 = arrayList12;
                                    arrayList102 = arrayList8;
                                    gliVar32 = gliVar;
                                    gliVar = null;
                                    if (gliVar == null) {
                                    }
                                }
                            } else {
                                nm6Var2 = nm6Var4;
                                if ((gliVar instanceof yki) || (gliVar instanceof rji)) {
                                    dfi.r("Unexpected behaviour, error item not must be here", "MusicHistory:PagingSource");
                                } else if (!(gliVar instanceof nki) && !(gliVar instanceof qki) && !(gliVar instanceof vki) && !(gliVar instanceof eli)) {
                                    b6e.s();
                                    return null;
                                }
                                arrayList8 = arrayList12;
                                arrayList102 = arrayList8;
                            }
                        }
                        arrayList8.add(gliVar);
                        nm6Var = nm6Var2;
                        arrayList = arrayList102;
                        i12 = i21;
                        if (it.hasNext()) {
                            int i22 = i12;
                            ArrayList arrayList15 = arrayList;
                            this.i.invoke(yhn.m(i6, i5), arrayList15);
                            Integer num2 = i9 == 0 ? null : new Integer(i9 - 1);
                            Integer num3 = new Integer(i9 + 1);
                            return new q4k(arrayList15, num2, num3.intValue() < i22 ? num3 : null, i6, i7);
                        }
                    }
                }
                int i23 = i2;
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    List list3 = subList;
                    int i24 = intValue;
                    ArrayList arrayList16 = new ArrayList(v75.o(list3, 10));
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        arrayList16.add(o5g.K((gli) it5.next()));
                    }
                    Integer num4 = i24 == 0 ? null : new Integer(i24 - 1);
                    Integer num5 = new Integer(i24 + 1);
                    return new q4k(arrayList16, num4, num5.intValue() < i12 ? num5 : null, i23, i4);
                }
                List list4 = subList;
                i5 = i3;
                arrayList = new ArrayList(v75.o(list4, 10));
                it = list4.iterator();
                i6 = i23;
                i7 = i4;
                i8 = 0;
                i9 = intValue;
                rj6Var2 = rj6Var;
                i10 = 0;
                if (it.hasNext()) {
                }
            }
        }
        jliVar = new jli(this, cg6Var);
        Object obj22 = jliVar.v;
        nm6 nm6Var5 = nm6.a;
        i = jliVar.x;
        int i122 = this.l;
        if (i != 0) {
        }
        int i232 = i2;
        rj6Var = (rj6) obj;
        if (rj6Var instanceof qj6) {
        }
    }
}
