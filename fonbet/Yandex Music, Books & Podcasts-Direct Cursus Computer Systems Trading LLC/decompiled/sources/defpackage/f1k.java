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
public final class f1k extends g1k {
    public final List a;

    public f1k(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:10:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.g1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z0i z0iVar, Continuation continuation) {
        c1k c1kVar;
        int i;
        f1k f1kVar;
        Collection arrayList;
        Iterator it;
        Function2 function2;
        if (continuation instanceof c1k) {
            c1kVar = (c1k) continuation;
            int i2 = c1kVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1kVar.q = i2 - Integer.MIN_VALUE;
                Object obj = c1kVar.o;
                nm6 nm6Var = nm6.a;
                i = c1kVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = this.a;
                    f1kVar = this;
                    arrayList = new ArrayList();
                    it = list.iterator();
                    function2 = z0iVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = c1kVar.n;
                    it = c1kVar.m;
                    arrayList = c1kVar.l;
                    Function2 function22 = c1kVar.k;
                    f1kVar = c1kVar.j;
                    qgg.h0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        arrayList.add(obj2);
                    }
                    function2 = function22;
                    if (it.hasNext()) {
                        Object next = it.next();
                        c1kVar.j = f1kVar;
                        c1kVar.k = function2;
                        c1kVar.l = arrayList;
                        c1kVar.m = it;
                        c1kVar.n = next;
                        c1kVar.q = 1;
                        Object invoke = function2.invoke(next, c1kVar);
                        if (invoke == nm6Var) {
                            return nm6Var;
                        }
                        function22 = function2;
                        obj2 = next;
                        obj = invoke;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        function2 = function22;
                        if (it.hasNext()) {
                            f1kVar.getClass();
                            return new f1k((List) arrayList);
                        }
                    }
                }
            }
        }
        c1kVar = new c1k(this, (cg6) continuation);
        Object obj3 = c1kVar.o;
        nm6 nm6Var2 = nm6.a;
        i = c1kVar.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:10:0x006f). Please report as a decompilation issue!!! */
    @Override // defpackage.g1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(m6i m6iVar, Continuation continuation) {
        d1k d1kVar;
        int i;
        Collection arrayList;
        Function2 function2;
        Iterator it;
        f1k f1kVar;
        if (continuation instanceof d1k) {
            d1kVar = (d1k) continuation;
            int i2 = d1kVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d1kVar.p = i2 - Integer.MIN_VALUE;
                Object obj = d1kVar.n;
                nm6 nm6Var = nm6.a;
                i = d1kVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = this.a;
                    arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    function2 = m6iVar;
                    it = it2;
                    f1kVar = this;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = d1kVar.m;
                    arrayList = d1kVar.l;
                    Function2 function22 = d1kVar.k;
                    f1kVar = d1kVar.j;
                    qgg.h0(obj);
                    z75.t(arrayList, (Iterable) obj);
                    function2 = function22;
                    if (it.hasNext()) {
                        Object next = it.next();
                        d1kVar.j = f1kVar;
                        d1kVar.k = function2;
                        d1kVar.l = arrayList;
                        d1kVar.m = it;
                        d1kVar.p = 1;
                        Object invoke = function2.invoke(next, d1kVar);
                        if (invoke == nm6Var) {
                            return nm6Var;
                        }
                        function22 = function2;
                        obj = invoke;
                        z75.t(arrayList, (Iterable) obj);
                        function2 = function22;
                        if (it.hasNext()) {
                            f1kVar.getClass();
                            return new f1k((List) arrayList);
                        }
                    }
                }
            }
        }
        d1kVar = new d1k(this, (cg6) continuation);
        Object obj2 = d1kVar.n;
        nm6 nm6Var2 = nm6.a;
        i = d1kVar.p;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @Override // defpackage.g1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Function2 function2, Continuation continuation) {
        e1k e1kVar;
        int i;
        Function2 function22;
        Collection collection;
        Iterator it;
        f1k f1kVar;
        if (continuation instanceof e1k) {
            e1kVar = (e1k) continuation;
            int i2 = e1kVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e1kVar.q = i2 - Integer.MIN_VALUE;
                Object obj = e1kVar.o;
                nm6 nm6Var = nm6.a;
                i = e1kVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = this.a;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it2 = list.iterator();
                    function22 = function2;
                    collection = arrayList;
                    it = it2;
                    f1kVar = this;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = e1kVar.n;
                    it = e1kVar.m;
                    Collection collection2 = e1kVar.l;
                    Function2 function23 = e1kVar.k;
                    f1kVar = e1kVar.j;
                    qgg.h0(obj);
                    collection.add(obj);
                    collection = collection2;
                    function22 = function23;
                    if (it.hasNext()) {
                        Object next = it.next();
                        e1kVar.j = f1kVar;
                        e1kVar.k = function22;
                        Collection collection3 = collection;
                        e1kVar.l = collection3;
                        e1kVar.m = it;
                        e1kVar.n = collection3;
                        e1kVar.q = 1;
                        Object invoke = function22.invoke(next, e1kVar);
                        if (invoke == nm6Var) {
                            return nm6Var;
                        }
                        function23 = function22;
                        obj = invoke;
                        collection2 = collection;
                        collection.add(obj);
                        collection = collection2;
                        function22 = function23;
                        if (it.hasNext()) {
                            f1kVar.getClass();
                            return new f1k((List) collection);
                        }
                    }
                }
            }
        }
        e1kVar = new e1k(this, (cg6) continuation);
        Object obj2 = e1kVar.o;
        nm6 nm6Var2 = nm6.a;
        i = e1kVar.q;
        if (i != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1k) && Intrinsics.d(this.a, ((f1k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
        List list = this.a;
        sb.append(list.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(CollectionsKt.firstOrNull(list));
        sb.append("\n                    |   last item: ");
        sb.append(CollectionsKt.Z(list));
        sb.append("\n                    |   sourceLoadStates: null\n                    ");
        return hlr.e(sb.toString().concat("|)"));
    }
}
