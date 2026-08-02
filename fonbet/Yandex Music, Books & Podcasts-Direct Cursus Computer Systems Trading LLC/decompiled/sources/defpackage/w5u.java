package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class w5u {
    public final vyk a;
    public final k1l b;
    public final g4u c;
    public final t3g d;
    public final p6u e;
    public final jyr f;
    public final xdr g;
    public final jyr h;
    public final x0q i;

    public w5u(vyk vykVar, k1l k1lVar, g4u g4uVar, t3g t3gVar, p6u p6uVar) {
        this.a = vykVar;
        this.b = k1lVar;
        this.c = g4uVar;
        this.d = t3gVar;
        this.e = p6uVar;
        bdt I = hag.I(oq7.class);
        l18 l18Var = l18.b;
        this.f = l18Var.b(I, true);
        l18Var.b(hag.I(b8u.class), true);
        this.g = ydr.a(null);
        this.h = btf.b(new hft(14));
        x0q a = y0q.a(1, 1, oi3.b);
        a.a(Unit.a);
        this.i = a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c8 -> B:11:0x0152). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x011b -> B:10:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x013c -> B:11:0x0152). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, int i, Map map, Map map2, Map map3, cg6 cg6Var) {
        j5u j5uVar;
        int i2;
        Throwable th;
        mqs mqsVar;
        j1g j1gVar;
        Iterator it;
        j5u j5uVar2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        Map map4;
        Map map5;
        Map map6;
        w5u w5uVar = this;
        if (cg6Var instanceof j5u) {
            j5uVar = (j5u) cg6Var;
            int i7 = j5uVar.A;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                j5uVar.A = i7 - Integer.MIN_VALUE;
                Object obj = j5uVar.y;
                nm6 nm6Var = nm6.a;
                i2 = j5uVar.A;
                if (i2 != 0) {
                    th = null;
                    qgg.h0(obj);
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    mqsVar = null;
                    j1gVar = null;
                    it = list2.iterator();
                    j5uVar2 = j5uVar;
                    arrayList = arrayList2;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = i;
                    map4 = map;
                    map5 = map2;
                    map6 = map3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = j5uVar.x;
                    int i9 = j5uVar.w;
                    int i10 = j5uVar.v;
                    int i11 = j5uVar.u;
                    int i12 = j5uVar.t;
                    Collection collection = j5uVar.s;
                    mqs mqsVar2 = j5uVar.r;
                    x1u x1uVar = j5uVar.q;
                    Iterator it2 = j5uVar.p;
                    Collection collection2 = j5uVar.o;
                    th = null;
                    mqs mqsVar3 = j5uVar.n;
                    j1g j1gVar2 = j5uVar.m;
                    Map map7 = j5uVar.l;
                    Map map8 = j5uVar.k;
                    Map map9 = j5uVar.j;
                    qgg.h0(obj);
                    Iterator it3 = it2;
                    ArrayList arrayList3 = collection2;
                    mqs mqsVar4 = mqsVar2;
                    x1u x1uVar2 = x1uVar;
                    int i13 = i12;
                    ArrayList arrayList4 = collection;
                    i4 = i10;
                    i5 = i11;
                    mqsVar = mqsVar3;
                    j1gVar = j1gVar2;
                    map6 = map7;
                    j5uVar2 = j5uVar;
                    Map map10 = map9;
                    Object obj2 = obj;
                    Map map11 = map8;
                    j1g j1gVar3 = j1gVar;
                    j1gVar = (j1g) obj2;
                    i6 = i13;
                    int i14 = i5;
                    int i15 = i4;
                    j1g j1gVar4 = j1gVar3;
                    int i16 = i8;
                    Map map12 = map10;
                    mqs mqsVar5 = mqsVar4;
                    x1u x1uVar3 = x1uVar2;
                    int i17 = i9;
                    i3 = i16;
                    if (i3 == i6 && mqsVar != null) {
                        mqsVar5 = mqsVar;
                    }
                    arrayList4.add(new o3u(x1uVar3, mqsVar5, j1gVar));
                    w5uVar = this;
                    map4 = map12;
                    j1gVar = j1gVar4;
                    i4 = i15;
                    i5 = i14;
                    i3 = i17;
                    it = it3;
                    map5 = map11;
                    arrayList = arrayList3;
                    if (it.hasNext()) {
                        Object next = it.next();
                        i17 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw th;
                        }
                        x1u x1uVar4 = (x1u) next;
                        Map map13 = map4;
                        mqsVar5 = (mqs) map5.get((String) map4.get(x1uVar4));
                        if (i6 == i3 && j1gVar != null) {
                            map11 = map5;
                            arrayList3 = arrayList;
                            it3 = it;
                            map12 = map13;
                            i14 = i5;
                            x1uVar3 = x1uVar4;
                            i15 = i4;
                            arrayList4 = arrayList3;
                            j1gVar4 = j1gVar;
                        } else if (mqsVar5 != null) {
                            map11 = map5;
                            pjc w = w5uVar.d.w(mqsVar5);
                            j5uVar2.getClass();
                            j5uVar2.j = map13;
                            j5uVar2.k = map11;
                            j5uVar2.l = map6;
                            j5uVar2.m = j1gVar;
                            j5uVar2.n = mqsVar;
                            ArrayList arrayList5 = arrayList;
                            j5uVar2.o = arrayList5;
                            j5uVar2.p = it;
                            j5uVar2.q = x1uVar4;
                            j5uVar2.r = mqsVar5;
                            j5uVar2.s = arrayList5;
                            j5uVar2.t = i6;
                            j5uVar2.u = i5;
                            j5uVar2.v = i4;
                            j5uVar2.w = i17;
                            j5uVar2.x = i3;
                            j5uVar2.A = 1;
                            Object g0 = zsd.g0(w, j5uVar2);
                            if (g0 == nm6Var) {
                                return nm6Var;
                            }
                            arrayList3 = arrayList;
                            it3 = it;
                            i13 = i6;
                            mqsVar4 = mqsVar5;
                            obj2 = g0;
                            i8 = i3;
                            i9 = i17;
                            map10 = map13;
                            x1uVar2 = x1uVar4;
                            arrayList4 = arrayList3;
                            j1g j1gVar32 = j1gVar;
                            j1gVar = (j1g) obj2;
                            i6 = i13;
                            int i142 = i5;
                            int i152 = i4;
                            j1g j1gVar42 = j1gVar32;
                            int i162 = i8;
                            Map map122 = map10;
                            mqs mqsVar52 = mqsVar4;
                            x1u x1uVar32 = x1uVar2;
                            int i172 = i9;
                            i3 = i162;
                        } else {
                            map11 = map5;
                            j1g j1gVar5 = (j1g) map6.get(x1uVar4);
                            arrayList3 = arrayList;
                            it3 = it;
                            i142 = i5;
                            x1uVar32 = x1uVar4;
                            i152 = i4;
                            arrayList4 = arrayList3;
                            j1gVar42 = j1gVar;
                            j1gVar = j1gVar5;
                            map122 = map13;
                        }
                        if (i3 == i6) {
                            mqsVar52 = mqsVar;
                        }
                        arrayList4.add(new o3u(x1uVar32, mqsVar52, j1gVar));
                        w5uVar = this;
                        map4 = map122;
                        j1gVar = j1gVar42;
                        i4 = i152;
                        i5 = i142;
                        i3 = i172;
                        it = it3;
                        map5 = map11;
                        arrayList = arrayList3;
                        if (it.hasNext()) {
                            return new n6u(arrayList, i6);
                        }
                    }
                }
            }
        }
        j5uVar = new j5u(w5uVar, cg6Var);
        Object obj3 = j5uVar.y;
        nm6 nm6Var2 = nm6.a;
        i2 = j5uVar.A;
        if (i2 != 0) {
        }
    }

    public final oq7 b() {
        return (oq7) this.f.getValue();
    }
}
