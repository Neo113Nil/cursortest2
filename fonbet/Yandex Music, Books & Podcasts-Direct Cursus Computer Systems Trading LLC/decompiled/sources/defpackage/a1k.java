package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a1k extends g1k {
    public static final a1k g;
    public final pfg a;
    public final List b;
    public final int c;
    public final int d;
    public final ofg e;
    public final ofg f;

    static {
        List c = t75.c(c7t.e);
        nfg nfgVar = nfg.c;
        nfg nfgVar2 = nfg.b;
        g = qgg.k(c, 0, 0, new ofg(nfgVar, nfgVar2, nfgVar2), null);
    }

    public a1k(pfg pfgVar, List list, int i, int i2, ofg ofgVar, ofg ofgVar2) {
        this.a = pfgVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = ofgVar;
        this.f = ofgVar2;
        if (pfgVar != pfg.c && i < 0) {
            xq0.o(k5r.i(i, "Prepend insert defining placeholdersBefore must be > 0, but was "));
            throw null;
        }
        if (pfgVar != pfg.b && i2 < 0) {
            xq0.o(k5r.i(i2, "Append insert defining placeholdersAfter must be > 0, but was "));
            throw null;
        }
        if (pfgVar == pfg.a && list.isEmpty()) {
            xq0.x("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ee -> B:10:0x00fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008f -> B:17:0x00b0). Please report as a decompilation issue!!! */
    @Override // defpackage.g1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z0i z0iVar, Continuation continuation) {
        x0k x0kVar;
        int i;
        a1k a1kVar;
        pfg pfgVar;
        ArrayList arrayList;
        x0k x0kVar2;
        Iterator it;
        Function2 function2;
        if (continuation instanceof x0k) {
            x0kVar = (x0k) continuation;
            int i2 = x0kVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0kVar.y = i2 - Integer.MIN_VALUE;
                Object obj = x0kVar.w;
                nm6 nm6Var = nm6.a;
                i = x0kVar.y;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = this.b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    Iterator it2 = list.iterator();
                    a1kVar = this;
                    pfgVar = this.a;
                    arrayList = arrayList2;
                    x0kVar2 = x0kVar;
                    it = it2;
                    function2 = z0iVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i3 = x0kVar.v;
                    int i4 = x0kVar.u;
                    Collection collection = x0kVar.t;
                    Object obj2 = x0kVar.s;
                    Iterator it3 = x0kVar.r;
                    List list2 = x0kVar.q;
                    List list3 = x0kVar.p;
                    c7t c7tVar = x0kVar.o;
                    Iterator it4 = x0kVar.n;
                    Collection collection2 = x0kVar.m;
                    pfg pfgVar2 = x0kVar.l;
                    a1k a1kVar2 = x0kVar.k;
                    Function2 function22 = x0kVar.j;
                    qgg.h0(obj);
                    x0k x0kVar3 = x0kVar;
                    it = it4;
                    ArrayList arrayList3 = list3;
                    ArrayList arrayList4 = list2;
                    pfg pfgVar3 = pfgVar2;
                    int i5 = i4;
                    ArrayList arrayList5 = collection2;
                    c7t c7tVar2 = c7tVar;
                    Iterator it5 = it3;
                    ArrayList arrayList6 = collection;
                    a1k a1kVar3 = a1kVar2;
                    Function2 function23 = function22;
                    Object obj3 = obj;
                    if (((Boolean) obj3).booleanValue()) {
                        arrayList3.add(obj2);
                        List list4 = c7tVar2.d;
                        if (list4 != null) {
                            i3 = ((Number) list4.get(i3)).intValue();
                        }
                        arrayList4.add(new Integer(i3));
                    }
                    function2 = function23;
                    ArrayList arrayList7 = arrayList6;
                    pfg pfgVar4 = pfgVar3;
                    ArrayList arrayList8 = arrayList4;
                    Iterator it6 = it5;
                    ArrayList arrayList9 = arrayList3;
                    c7t c7tVar3 = c7tVar2;
                    i3 = i5;
                    if (it6.hasNext()) {
                        Object next = it6.next();
                        i5 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        x0kVar3.j = function2;
                        x0kVar3.k = a1kVar3;
                        x0kVar3.l = pfgVar4;
                        x0kVar3.m = arrayList5;
                        x0kVar3.n = it;
                        x0kVar3.o = c7tVar3;
                        x0kVar3.p = arrayList9;
                        x0kVar3.q = arrayList8;
                        x0kVar3.r = it6;
                        x0kVar3.s = next;
                        x0kVar3.t = arrayList7;
                        x0kVar3.u = i5;
                        x0kVar3.v = i3;
                        x0kVar3.y = 1;
                        Object invoke = function2.invoke(next, x0kVar3);
                        if (invoke == nm6Var) {
                            return nm6Var;
                        }
                        Function2 function24 = function2;
                        obj3 = invoke;
                        function23 = function24;
                        pfg pfgVar5 = pfgVar4;
                        arrayList6 = arrayList7;
                        obj2 = next;
                        c7tVar2 = c7tVar3;
                        arrayList3 = arrayList9;
                        it5 = it6;
                        arrayList4 = arrayList8;
                        pfgVar3 = pfgVar5;
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        function2 = function23;
                        ArrayList arrayList72 = arrayList6;
                        pfg pfgVar42 = pfgVar3;
                        ArrayList arrayList82 = arrayList4;
                        Iterator it62 = it5;
                        ArrayList arrayList92 = arrayList3;
                        c7t c7tVar32 = c7tVar2;
                        i3 = i5;
                        if (it62.hasNext()) {
                            arrayList72.add(new c7t(c7tVar32.a, arrayList92, c7tVar32.c, arrayList82));
                            x0kVar2 = x0kVar3;
                            arrayList = arrayList5;
                            a1kVar = a1kVar3;
                            pfgVar = pfgVar42;
                            if (it.hasNext()) {
                                return new a1k(pfgVar, arrayList, a1kVar.c, a1kVar.d, a1kVar.e, a1kVar.f);
                            }
                            c7t c7tVar4 = (c7t) it.next();
                            ArrayList arrayList10 = new ArrayList();
                            arrayList82 = new ArrayList();
                            it62 = c7tVar4.b.iterator();
                            c7tVar32 = c7tVar4;
                            arrayList72 = arrayList;
                            x0kVar3 = x0kVar2;
                            i3 = 0;
                            arrayList92 = arrayList10;
                            pfgVar42 = pfgVar;
                            a1kVar3 = a1kVar;
                            arrayList5 = arrayList72;
                            if (it62.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        x0kVar = new x0k(this, (cg6) continuation);
        Object obj4 = x0kVar.w;
        nm6 nm6Var2 = nm6.a;
        i = x0kVar.y;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011f A[LOOP:0: B:14:0x0115->B:16:0x011f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f7 -> B:10:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0090 -> B:17:0x00b1). Please report as a decompilation issue!!! */
    @Override // defpackage.g1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(m6i m6iVar, Continuation continuation) {
        y0k y0kVar;
        int i;
        a1k a1kVar;
        pfg pfgVar;
        ArrayList arrayList;
        y0k y0kVar2;
        Iterator it;
        Function2 function2;
        if (continuation instanceof y0k) {
            y0kVar = (y0k) continuation;
            int i2 = y0kVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0kVar.y = i2 - Integer.MIN_VALUE;
                Object obj = y0kVar.w;
                nm6 nm6Var = nm6.a;
                i = y0kVar.y;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = this.b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    Iterator it2 = list.iterator();
                    a1kVar = this;
                    pfgVar = this.a;
                    arrayList = arrayList2;
                    y0kVar2 = y0kVar;
                    it = it2;
                    function2 = m6iVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i3 = y0kVar.v;
                    int i4 = y0kVar.u;
                    Collection collection = y0kVar.t;
                    Collection collection2 = y0kVar.s;
                    Iterator it3 = y0kVar.r;
                    List list2 = y0kVar.q;
                    List list3 = y0kVar.p;
                    c7t c7tVar = y0kVar.o;
                    Iterator it4 = y0kVar.n;
                    Collection collection3 = y0kVar.m;
                    pfg pfgVar2 = y0kVar.l;
                    a1k a1kVar2 = y0kVar.k;
                    Function2 function22 = y0kVar.j;
                    qgg.h0(obj);
                    int i5 = i4;
                    ArrayList arrayList3 = collection3;
                    ArrayList arrayList4 = list3;
                    ArrayList arrayList5 = list2;
                    pfg pfgVar3 = pfgVar2;
                    c7t c7tVar2 = c7tVar;
                    Iterator it5 = it3;
                    ArrayList arrayList6 = collection;
                    a1k a1kVar3 = a1kVar2;
                    y0k y0kVar3 = y0kVar;
                    Function2 function23 = function22;
                    Object obj2 = obj;
                    z75.t(collection2, (Iterable) obj2);
                    List list4 = c7tVar2.d;
                    if (list4 != null) {
                        i3 = ((Number) list4.get(i3)).intValue();
                    }
                    while (arrayList5.size() < arrayList4.size()) {
                        arrayList5.add(new Integer(i3));
                    }
                    function2 = function23;
                    ArrayList arrayList7 = arrayList6;
                    pfg pfgVar4 = pfgVar3;
                    ArrayList arrayList8 = arrayList5;
                    Iterator it6 = it5;
                    it = it4;
                    ArrayList arrayList9 = arrayList4;
                    i3 = i5;
                    c7t c7tVar3 = c7tVar2;
                    if (it6.hasNext()) {
                        Object next = it6.next();
                        i5 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        ArrayList arrayList10 = arrayList9;
                        y0kVar3.j = function2;
                        y0kVar3.k = a1kVar3;
                        y0kVar3.l = pfgVar4;
                        y0kVar3.m = arrayList3;
                        y0kVar3.n = it;
                        y0kVar3.o = c7tVar3;
                        y0kVar3.p = arrayList9;
                        y0kVar3.q = arrayList8;
                        y0kVar3.r = it6;
                        y0kVar3.s = arrayList10;
                        y0kVar3.t = arrayList7;
                        y0kVar3.u = i5;
                        y0kVar3.v = i3;
                        y0kVar3.y = 1;
                        Object invoke = function2.invoke(next, y0kVar3);
                        if (invoke == nm6Var) {
                            return nm6Var;
                        }
                        c7tVar2 = c7tVar3;
                        it4 = it;
                        function23 = function2;
                        obj2 = invoke;
                        arrayList4 = arrayList9;
                        it5 = it6;
                        arrayList5 = arrayList8;
                        pfgVar3 = pfgVar4;
                        arrayList6 = arrayList7;
                        collection2 = arrayList10;
                        z75.t(collection2, (Iterable) obj2);
                        List list42 = c7tVar2.d;
                        if (list42 != null) {
                        }
                        while (arrayList5.size() < arrayList4.size()) {
                        }
                        function2 = function23;
                        ArrayList arrayList72 = arrayList6;
                        pfg pfgVar42 = pfgVar3;
                        ArrayList arrayList82 = arrayList5;
                        Iterator it62 = it5;
                        it = it4;
                        ArrayList arrayList92 = arrayList4;
                        i3 = i5;
                        c7t c7tVar32 = c7tVar2;
                        if (it62.hasNext()) {
                            arrayList72.add(new c7t(c7tVar32.a, arrayList92, c7tVar32.c, arrayList82));
                            y0kVar2 = y0kVar3;
                            arrayList = arrayList3;
                            a1kVar = a1kVar3;
                            pfgVar = pfgVar42;
                            if (it.hasNext()) {
                                return new a1k(pfgVar, arrayList, a1kVar.c, a1kVar.d, a1kVar.e, a1kVar.f);
                            }
                            c7t c7tVar4 = (c7t) it.next();
                            ArrayList arrayList11 = new ArrayList();
                            arrayList82 = new ArrayList();
                            it62 = c7tVar4.b.iterator();
                            c7tVar32 = c7tVar4;
                            arrayList72 = arrayList;
                            y0kVar3 = y0kVar2;
                            i3 = 0;
                            arrayList92 = arrayList11;
                            pfgVar42 = pfgVar;
                            a1kVar3 = a1kVar;
                            arrayList3 = arrayList72;
                            if (it62.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        y0kVar = new y0k(this, (cg6) continuation);
        Object obj3 = y0kVar.w;
        nm6 nm6Var2 = nm6.a;
        i = y0kVar.y;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00da -> B:10:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0088 -> B:11:0x00a7). Please report as a decompilation issue!!! */
    @Override // defpackage.g1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Function2 function2, Continuation continuation) {
        z0k z0kVar;
        int i;
        a1k a1kVar;
        pfg pfgVar;
        ArrayList arrayList;
        z0k z0kVar2;
        Iterator it;
        Function2 function22;
        if (continuation instanceof z0k) {
            z0kVar = (z0k) continuation;
            int i2 = z0kVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0kVar.w = i2 - Integer.MIN_VALUE;
                Object obj = z0kVar.u;
                nm6 nm6Var = nm6.a;
                i = z0kVar.w;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = this.b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    Iterator it2 = list.iterator();
                    a1kVar = this;
                    pfgVar = this.a;
                    arrayList = arrayList2;
                    z0kVar2 = z0kVar;
                    it = it2;
                    function22 = function2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = z0kVar.t;
                    Collection collection2 = z0kVar.s;
                    Iterator it3 = z0kVar.r;
                    Collection collection3 = z0kVar.q;
                    int[] iArr = z0kVar.p;
                    c7t c7tVar = z0kVar.o;
                    Iterator it4 = z0kVar.n;
                    Collection collection4 = z0kVar.m;
                    pfg pfgVar2 = z0kVar.l;
                    a1k a1kVar2 = z0kVar.k;
                    Function2 function23 = z0kVar.j;
                    qgg.h0(obj);
                    z0k z0kVar3 = z0kVar;
                    it = it4;
                    ArrayList arrayList3 = collection2;
                    ArrayList arrayList4 = collection3;
                    pfg pfgVar3 = pfgVar2;
                    c7t c7tVar2 = c7tVar;
                    Iterator it5 = it3;
                    a1k a1kVar3 = a1kVar2;
                    ArrayList arrayList5 = collection4;
                    arrayList3.add(obj);
                    function22 = function23;
                    z0k z0kVar4 = z0kVar3;
                    ArrayList arrayList6 = arrayList5;
                    arrayList3 = arrayList4;
                    c7t c7tVar3 = c7tVar2;
                    if (it5.hasNext()) {
                        Object next = it5.next();
                        z0kVar4.j = function22;
                        z0kVar4.k = a1kVar3;
                        z0kVar4.l = pfgVar3;
                        z0kVar4.m = arrayList6;
                        z0kVar4.n = it;
                        z0kVar4.o = c7tVar3;
                        z0kVar4.p = iArr;
                        ArrayList arrayList7 = arrayList3;
                        z0kVar4.q = arrayList7;
                        z0kVar4.r = it5;
                        z0kVar4.s = arrayList7;
                        z0kVar4.t = collection;
                        z0kVar4.w = 1;
                        Object invoke = function22.invoke(next, z0kVar4);
                        if (invoke == nm6Var) {
                            return nm6Var;
                        }
                        c7tVar2 = c7tVar3;
                        arrayList5 = arrayList6;
                        z0kVar3 = z0kVar4;
                        function23 = function22;
                        obj = invoke;
                        arrayList4 = arrayList3;
                        arrayList3.add(obj);
                        function22 = function23;
                        z0k z0kVar42 = z0kVar3;
                        ArrayList arrayList62 = arrayList5;
                        arrayList3 = arrayList4;
                        c7t c7tVar32 = c7tVar2;
                        if (it5.hasNext()) {
                            collection.add(new c7t(iArr, arrayList3, c7tVar32.c, c7tVar32.d));
                            z0kVar2 = z0kVar42;
                            arrayList = arrayList62;
                            a1kVar = a1kVar3;
                            pfgVar = pfgVar3;
                            if (it.hasNext()) {
                                return new a1k(pfgVar, arrayList, a1kVar.c, a1kVar.d, a1kVar.e, a1kVar.f);
                            }
                            c7t c7tVar4 = (c7t) it.next();
                            iArr = c7tVar4.a;
                            List list2 = c7tVar4.b;
                            arrayList3 = new ArrayList(v75.o(list2, 10));
                            it5 = list2.iterator();
                            c7tVar32 = c7tVar4;
                            pfgVar3 = pfgVar;
                            a1kVar3 = a1kVar;
                            arrayList62 = arrayList;
                            z0kVar42 = z0kVar2;
                            collection = arrayList62;
                            if (it5.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        z0kVar = new z0k(this, (cg6) continuation);
        Object obj2 = z0kVar.u;
        nm6 nm6Var2 = nm6.a;
        i = z0kVar.w;
        if (i != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1k)) {
            return false;
        }
        a1k a1kVar = (a1k) obj;
        return this.a == a1kVar.a && Intrinsics.d(this.b, a1kVar.b) && this.c == a1kVar.c && this.d == a1kVar.d && Intrinsics.d(this.e, a1kVar.e) && Intrinsics.d(this.f, a1kVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + f1d.a(this.d, f1d.a(this.c, k5r.d(this.a.hashCode() * 31, 31, this.b), 31), 31)) * 31;
        ofg ofgVar = this.f;
        return hashCode + (ofgVar == null ? 0 : ofgVar.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.b;
        Iterator it = list3.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((c7t) it.next()).b.size();
        }
        int i2 = this.c;
        String valueOf = i2 != -1 ? String.valueOf(i2) : "none";
        int i3 = this.d;
        String valueOf2 = i3 != -1 ? String.valueOf(i3) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.a);
        sb.append(", with ");
        sb.append(i);
        sb.append(" items (\n                    |   first item: ");
        c7t c7tVar = (c7t) CollectionsKt.firstOrNull(list3);
        Object obj = null;
        sb.append((c7tVar == null || (list2 = c7tVar.b) == null) ? null : CollectionsKt.firstOrNull(list2));
        sb.append("\n                    |   last item: ");
        c7t c7tVar2 = (c7t) CollectionsKt.Z(list3);
        if (c7tVar2 != null && (list = c7tVar2.b) != null) {
            obj = CollectionsKt.Z(list);
        }
        sb.append(obj);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(valueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(valueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.e);
        sb.append("\n                    ");
        String sb2 = sb.toString();
        ofg ofgVar = this.f;
        if (ofgVar != null) {
            sb2 = sb2 + "|   mediatorLoadStates: " + ofgVar + '\n';
        }
        return hlr.e(sb2.concat("|)"));
    }
}
