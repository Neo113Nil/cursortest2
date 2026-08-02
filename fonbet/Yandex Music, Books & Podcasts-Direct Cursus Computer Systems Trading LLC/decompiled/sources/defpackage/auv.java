package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class auv {
    public final n0w a;
    public final dxr b;
    public final cq4 c;
    public final xdr d;
    public final xdr e;
    public final x0q f;
    public final zi3 g;
    public rar h;
    public final AtomicBoolean i;

    public auv(duv duvVar, n0w n0wVar, dxr dxrVar, cq4 cq4Var) {
        this.a = n0wVar;
        this.b = dxrVar;
        this.c = cq4Var;
        xdr a = ydr.a(new s2w(new HashMap(), new HashMap(), new LinkedHashSet(), c5b.a, null, "all", wwv.a));
        this.d = a;
        this.e = a;
        this.f = y0q.b(0, 0, null, 7);
        this.g = men.g(Integer.MAX_VALUE, 6, null);
        this.i = new AtomicBoolean(false);
        x97.y(cq4Var, dm6.b, null, new y6v(this, (Continuation) null, 9), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(auv auvVar, s2w s2wVar, uwv uwvVar, cg6 cg6Var) {
        wtv wtvVar;
        int i;
        s2w s2wVar2;
        uwv uwvVar2;
        List list;
        String str;
        auvVar.getClass();
        if (cg6Var instanceof wtv) {
            wtvVar = (wtv) cg6Var;
            int i2 = wtvVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtvVar.p = i2 - Integer.MIN_VALUE;
                Object obj = wtvVar.n;
                Object obj2 = nm6.a;
                i = wtvVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    List list2 = s2wVar.d.isEmpty() ? uwvVar.b : s2wVar.d;
                    String str2 = s2wVar.f;
                    Set set = uwvVar.c;
                    wtvVar.j = s2wVar;
                    wtvVar.k = uwvVar;
                    wtvVar.l = list2;
                    wtvVar.m = str2;
                    wtvVar.p = 1;
                    Object f = auvVar.f(set, wtvVar);
                    if (f == obj2) {
                        return obj2;
                    }
                    s2wVar2 = s2wVar;
                    uwvVar2 = uwvVar;
                    list = list2;
                    obj = f;
                    str = str2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = wtvVar.m;
                    List list3 = wtvVar.l;
                    uwv uwvVar3 = wtvVar.k;
                    s2w s2wVar3 = wtvVar.j;
                    qgg.h0(obj);
                    list = list3;
                    uwvVar2 = uwvVar3;
                    str = str3;
                    s2wVar2 = s2wVar3;
                }
                return h(auvVar, s2wVar2, uwvVar2.a, uah.i(s2wVar2.b, (Map) obj), null, list, uwvVar2.d, str, null, 68);
            }
        }
        wtvVar = new wtv(auvVar, cg6Var);
        Object obj3 = wtvVar.n;
        Object obj22 = nm6.a;
        i = wtvVar.p;
        if (i != 0) {
        }
        return h(auvVar, s2wVar2, uwvVar2.a, uah.i(s2wVar2.b, (Map) obj3), null, list, uwvVar2.d, str, null, 68);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r5.i((defpackage.rj6) r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(auv auvVar, ltv ltvVar, cg6 cg6Var) {
        xtv xtvVar;
        int i;
        if (cg6Var instanceof xtv) {
            xtvVar = (xtv) cg6Var;
            int i2 = xtvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xtvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xtvVar.j;
                Object obj2 = nm6.a;
                i = xtvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    n0w n0wVar = auvVar.a;
                    String str = ltvVar.a;
                    xtvVar.l = 1;
                    obj = n0wVar.a(str, xtvVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xtvVar.l = 2;
            }
        }
        xtvVar = new xtv(auvVar, cg6Var);
        Object obj3 = xtvVar.j;
        Object obj22 = nm6.a;
        i = xtvVar.l;
        if (i != 0) {
        }
        xtvVar.l = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x021a, code lost:
    
        if (r0.emit(r1, r11) == r10) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0085 -> B:18:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(auv auvVar, mtv mtvVar, cg6 cg6Var) {
        ytv ytvVar;
        int i;
        xdr xdrVar;
        ytv ytvVar2;
        int i2;
        mtv mtvVar2;
        Object d;
        int i3;
        int i4;
        xdr xdrVar2;
        int i5;
        ytv ytvVar3;
        s2w s2wVar;
        int i6;
        xdr xdrVar3;
        int i7;
        int i8;
        auv auvVar2 = auvVar;
        if (cg6Var instanceof ytv) {
            ytvVar = (ytv) cg6Var;
            int i9 = ytvVar.r;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                ytvVar.r = i9 - Integer.MIN_VALUE;
                Object obj = ytvVar.p;
                nm6 nm6Var = nm6.a;
                i = ytvVar.r;
                int i10 = 0;
                int i11 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    xdrVar = auvVar2.d;
                    ytvVar2 = ytvVar;
                    i2 = 0;
                    mtvVar2 = mtvVar;
                    Object value = xdrVar.getValue();
                    s2w s2wVar2 = (s2w) value;
                    zrv zrvVar = mtvVar2.a;
                    n0w n0wVar = auvVar2.a;
                    String str = s2wVar2.f;
                    List w0 = CollectionsKt.w0(s2wVar2.a());
                    b3w b3wVar = b3w.BOTH_DIMENSIONS;
                    ytvVar2.j = mtvVar2;
                    ytvVar2.k = xdrVar;
                    ytvVar2.l = value;
                    ytvVar2.m = s2wVar2;
                    ytvVar2.n = i2;
                    ytvVar2.o = i10;
                    ytvVar2.r = i11;
                    d = n0wVar.d(str, zrvVar, w0, b3wVar, ytvVar2);
                    if (d != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i12 = ytvVar.o;
                int i13 = ytvVar.n;
                s2w s2wVar3 = ytvVar.m;
                Object obj2 = ytvVar.l;
                xdr xdrVar4 = ytvVar.k;
                mtv mtvVar3 = ytvVar.j;
                qgg.h0(obj);
                Object obj3 = obj2;
                xdrVar = xdrVar4;
                mtv mtvVar4 = mtvVar3;
                ytvVar2 = ytvVar;
                i2 = i13;
                rj6 rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    o2w o2wVar = (o2w) ((qj6) rj6Var).a;
                    zrv zrvVar2 = mtvVar4.a;
                    wrv wrvVar = zrvVar2.b;
                    Map map = s2wVar3.a;
                    LinkedHashSet linkedHashSet = s2wVar3.c;
                    int i14 = i11;
                    String str2 = s2wVar3.f;
                    yrv yrvVar = (yrv) map.get(wrvVar);
                    boolean d2 = Intrinsics.d(zrvVar2.a, yrvVar != null ? yrvVar.a : null);
                    if (Intrinsics.d(str2, mtvVar4.b)) {
                        List list = o2wVar.a;
                        if (!list.isEmpty() && d2) {
                            List<yrv> a = s2wVar3.a();
                            list.getClass();
                            a.getClass();
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(list2);
                            for (yrv yrvVar2 : a) {
                                wrv wrvVar2 = yrvVar2.b;
                                int i15 = wrvVar2.b;
                                s2w s2wVar4 = s2wVar3;
                                int i16 = wrvVar2.a;
                                ytv ytvVar4 = ytvVar2;
                                int i17 = wrvVar.b;
                                if (i15 == i17) {
                                    int i18 = wrvVar.a;
                                    if (i16 > i18) {
                                        wrvVar2 = wrv.a(wrvVar2, i16 + 1, 0, 2);
                                        i8 = 0;
                                        i6 = i2;
                                    } else {
                                        i6 = i2;
                                        if (i16 < i18) {
                                            wrvVar2 = wrv.a(wrvVar2, i16 - 1, 0, 2);
                                        }
                                        i8 = 0;
                                    }
                                    xdrVar3 = xdrVar;
                                    i7 = i14;
                                } else {
                                    i6 = i2;
                                    int i19 = i15 > i17 ? i14 : 0;
                                    int i20 = wrvVar.a;
                                    xdrVar3 = xdrVar;
                                    int i21 = (i20 + (-1) > i16 || i16 > i20 + 1) ? 0 : i14;
                                    if (i19 == 0 || i21 == 0) {
                                        i7 = i14;
                                        i8 = 0;
                                    } else {
                                        if (i15 > i17) {
                                            i15++;
                                        }
                                        i7 = i14;
                                        i8 = 0;
                                        wrvVar2 = wrv.a(wrvVar2, 0, i15, i7);
                                    }
                                }
                                if (!wrvVar2.equals(yrvVar2.b)) {
                                    yrvVar2 = new yrv(yrvVar2.a, wrvVar2, yrvVar2.c, yrvVar2.d, yrvVar2.e);
                                }
                                arrayList.add(yrvVar2);
                                i10 = i8;
                                i14 = i7;
                                s2wVar3 = s2wVar4;
                                i2 = i6;
                                xdrVar = xdrVar3;
                                ytvVar2 = ytvVar4;
                            }
                            linkedHashSet.addAll(list2);
                            i5 = i10;
                            ytvVar3 = ytvVar2;
                            i3 = i14;
                            xdrVar2 = xdrVar;
                            auvVar2 = auvVar;
                            s2wVar = h(auvVar2, s2wVar3, arrayList, null, linkedHashSet, null, o2wVar.c, null, new vwv(wrvVar, mtvVar4.c), 42);
                            i4 = i2;
                            if (!xdrVar2.k(obj3, s2wVar)) {
                                return Unit.a;
                            }
                            i2 = i4;
                            ytvVar2 = ytvVar3;
                            xdrVar = xdrVar2;
                            mtvVar2 = mtvVar4;
                            i10 = i5;
                            i11 = i3;
                            Object value2 = xdrVar.getValue();
                            s2w s2wVar22 = (s2w) value2;
                            zrv zrvVar3 = mtvVar2.a;
                            n0w n0wVar2 = auvVar2.a;
                            String str3 = s2wVar22.f;
                            List w02 = CollectionsKt.w0(s2wVar22.a());
                            b3w b3wVar2 = b3w.BOTH_DIMENSIONS;
                            ytvVar2.j = mtvVar2;
                            ytvVar2.k = xdrVar;
                            ytvVar2.l = value2;
                            ytvVar2.m = s2wVar22;
                            ytvVar2.n = i2;
                            ytvVar2.o = i10;
                            ytvVar2.r = i11;
                            d = n0wVar2.d(str3, zrvVar3, w02, b3wVar2, ytvVar2);
                            if (d != nm6Var) {
                                i12 = i10;
                                s2wVar3 = s2wVar22;
                                obj3 = value2;
                                mtvVar4 = mtvVar2;
                                obj = d;
                                rj6 rj6Var2 = (rj6) obj;
                                if (!(rj6Var2 instanceof qj6)) {
                                    ytv ytvVar5 = ytvVar2;
                                    int i22 = i2;
                                    if (!(rj6Var2 instanceof pj6)) {
                                        b6e.s();
                                        return null;
                                    }
                                    x0q x0qVar = auvVar2.f;
                                    Unit unit = Unit.a;
                                    ytvVar5.j = null;
                                    ytvVar5.k = null;
                                    ytvVar5.l = null;
                                    ytvVar5.m = null;
                                    ytvVar5.n = i22;
                                    ytvVar5.o = i12;
                                    ytvVar5.r = 2;
                                }
                            }
                            return nm6Var;
                        }
                    }
                    i3 = i14;
                    i4 = i2;
                    xdrVar2 = xdrVar;
                    i5 = i10;
                    ytvVar3 = ytvVar2;
                    b0w b0wVar = o2wVar.c;
                    Map map2 = s2wVar3.a;
                    Map map3 = s2wVar3.b;
                    List list3 = s2wVar3.d;
                    xwv xwvVar = s2wVar3.g;
                    map3.getClass();
                    linkedHashSet.getClass();
                    list3.getClass();
                    str2.getClass();
                    xwvVar.getClass();
                    s2wVar = new s2w(map2, map3, linkedHashSet, list3, b0wVar, str2, xwvVar);
                    if (!xdrVar2.k(obj3, s2wVar)) {
                    }
                }
            }
        }
        ytvVar = new ytv(auvVar2, cg6Var);
        Object obj4 = ytvVar.p;
        nm6 nm6Var2 = nm6.a;
        i = ytvVar.r;
        int i102 = 0;
        int i112 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r5.i((defpackage.rj6) r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(auv auvVar, ntv ntvVar, cg6 cg6Var) {
        ztv ztvVar;
        int i;
        if (cg6Var instanceof ztv) {
            ztvVar = (ztv) cg6Var;
            int i2 = ztvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ztvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ztvVar.j;
                Object obj2 = nm6.a;
                i = ztvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    n0w n0wVar = auvVar.a;
                    String str = ntvVar.a;
                    ztvVar.l = 1;
                    obj = n0wVar.e(str, ztvVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ztvVar.l = 2;
            }
        }
        ztvVar = new ztv(auvVar, cg6Var);
        Object obj3 = ztvVar.j;
        Object obj22 = nm6.a;
        i = ztvVar.l;
        if (i != 0) {
        }
        ztvVar.l = 2;
    }

    public static s2w h(auv auvVar, s2w s2wVar, Collection collection, Map map, LinkedHashSet linkedHashSet, List list, b0w b0wVar, String str, vwv vwvVar, int i) {
        if ((i & 1) != 0) {
            collection = s2wVar.a.values();
        }
        if ((i & 2) != 0) {
            map = s2wVar.b;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            linkedHashSet = s2wVar.c;
        }
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if ((i & 8) != 0) {
            list = s2wVar.d;
        }
        List list2 = list;
        b0w b0wVar2 = (i & 16) != 0 ? s2wVar.e : b0wVar;
        String str2 = (i & 32) != 0 ? s2wVar.f : str;
        xwv xwvVar = (i & 64) != 0 ? wwv.a : vwvVar;
        auvVar.getClass();
        Collection collection2 = collection;
        int a = tah.a(v75.o(collection2, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : collection2) {
            linkedHashMap.put(((yrv) obj).b, obj);
        }
        return new s2w(linkedHashMap, map2, linkedHashSet2, list2, b0wVar2, str2, xwvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[LOOP:0: B:11:0x0053->B:13:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(Set set, cg6 cg6Var) {
        utv utvVar;
        int i;
        if (cg6Var instanceof utv) {
            utvVar = (utv) cg6Var;
            int i2 = utvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                utvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = utvVar.j;
                nm6 nm6Var = nm6.a;
                i = utvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    List w0 = CollectionsKt.w0(set);
                    utvVar.l = 1;
                    obj = this.b.c(w0, utvVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable<c01> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (c01 c01Var : iterable) {
                    arrayList.add(new bsv(c01Var.a, c01Var.b, c01Var.k));
                }
                return arrayList;
            }
        }
        utvVar = new utv(this, cg6Var);
        Object obj2 = utvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = utvVar.l;
        if (i != 0) {
        }
        Iterable<c01> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        while (r6.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[LOOP:0: B:11:0x005a->B:13:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Set set, cg6 cg6Var) {
        vtv vtvVar;
        int i;
        LinkedHashMap linkedHashMap;
        if (cg6Var instanceof vtv) {
            vtvVar = (vtv) cg6Var;
            int i2 = vtvVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vtvVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vtvVar.k;
                Serializable serializable = nm6.a;
                i = vtvVar.m;
                AtomicBoolean atomicBoolean = this.i;
                if (i != 0) {
                    qgg.h0(obj);
                    if (atomicBoolean.get()) {
                        return new LinkedHashMap();
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    vtvVar.j = linkedHashMap2;
                    vtvVar.m = 1;
                    Serializable e = e(set, vtvVar);
                    if (e == serializable) {
                        return serializable;
                    }
                    obj = e;
                    linkedHashMap = linkedHashMap2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = vtvVar.j;
                    qgg.h0(obj);
                }
                for (xrv xrvVar : (Iterable) obj) {
                    linkedHashMap.put(xrvVar.getId(), xrvVar);
                }
                atomicBoolean.set(true);
                return linkedHashMap;
            }
        }
        vtvVar = new vtv(this, cg6Var);
        Object obj2 = vtvVar.k;
        Serializable serializable2 = nm6.a;
        i = vtvVar.m;
        AtomicBoolean atomicBoolean2 = this.i;
        if (i != 0) {
        }
        while (r8.hasNext()) {
        }
        atomicBoolean2.set(true);
        return linkedHashMap;
    }

    public final void g(String str) {
        xdr xdrVar;
        Object value;
        s2w s2wVar;
        do {
            xdrVar = this.d;
            value = xdrVar.getValue();
            s2wVar = (s2w) value;
        } while (!xdrVar.k(value, h(this, s2wVar, null, uah.f(str, s2wVar.b), null, null, null, null, null, 125)));
        this.g.c(new ntv(str));
    }

    public final Object i(rj6 rj6Var, cg6 cg6Var) {
        xdr xdrVar;
        Object value;
        if (rj6Var instanceof qj6) {
            do {
                xdrVar = this.d;
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, h(this, (s2w) value, null, null, null, null, ((cxv) ((qj6) rj6Var).a).b, null, null, 111)));
            return Unit.a;
        }
        if (!(rj6Var instanceof pj6)) {
            b6e.s();
            return null;
        }
        Unit unit = Unit.a;
        Object emit = this.f.emit(unit, cg6Var);
        return emit == nm6.a ? emit : unit;
    }
}
