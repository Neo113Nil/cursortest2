package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokq;", "T", "Lwb7;", "a", "b", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class okq<T> implements wb7<T> {
    public static final LinkedHashSet j = new LinkedHashSet();
    public static final Object k = new Object();
    public final Function0 a;
    public final hip b;
    public final xm6 c;
    public final eno d;
    public final String e;
    public final jyr f;
    public final xdr g;
    public List h;
    public final biq i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokq$a;", "T", "", "a", "b", "Lokq$a$a;", "Lokq$a$b;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static abstract class a<T> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokq$a$a;", "T", "Lokq$a;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
        /* renamed from: okq$a$a, reason: collision with other inner class name */
        public static final class C0021a<T> extends a<T> {
            public final odr a;

            public C0021a(odr odrVar) {
                this.a = odrVar;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokq$a$b;", "T", "Lokq$a;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class b<T> extends a<T> {
            public final Function2 a;
            public final gm5 b;
            public final odr c;
            public final CoroutineContext d;

            public b(Function2 function2, gm5 gm5Var, odr odrVar, CoroutineContext coroutineContext) {
                function2.getClass();
                coroutineContext.getClass();
                this.a = function2;
                this.b = gm5Var;
                this.c = odrVar;
                this.d = coroutineContext;
            }
        }
    }

    public okq(Function0 function0, hip hipVar, List list, xm6 xm6Var, mm6 mm6Var) {
        list.getClass();
        mm6Var.getClass();
        this.a = function0;
        this.b = hipVar;
        this.c = xm6Var;
        this.d = new eno(new C1319wkq(this, null));
        this.e = ".tmp";
        this.f = btf.b(new xkq(this));
        this.g = ydr.a(zht.a);
        this.h = CollectionsKt.w0(list);
        this.i = new biq(mm6Var, new pkq(this), new C0959rkq(this, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(8:(1:(1:(2:12|13))(3:15|16|17))|30|31|21|22|(1:24)(1:27)|25|26)(5:32|33|34|(8:36|(1:38)|20|21|22|(0)(0)|25|26)(3:39|(1:41)(1:56)|(2:43|(2:45|(1:47))(2:48|49))(2:50|(2:52|53)(2:54|55)))|29)|18))|61|6|7|(0)(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0033, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [okq] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(okq okqVar, a.b bVar, cg6 cg6Var) {
        ykq ykqVar;
        int i;
        gm5 gm5Var;
        Throwable a2;
        gm5 gm5Var2;
        odr odrVar;
        Object i2;
        okq okqVar2;
        if (cg6Var instanceof ykq) {
            ykqVar = (ykq) cg6Var;
            int i3 = ykqVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ykqVar.o = i3 - Integer.MIN_VALUE;
                Object obj = ykqVar.m;
                nm6 nm6Var = nm6.a;
                i = ykqVar.o;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            gm5 gm5Var3 = ykqVar.l;
                            okq okqVar3 = ykqVar.k;
                            a.b bVar2 = (a.b) ykqVar.j;
                            qgg.h0(obj);
                            gm5Var2 = gm5Var3;
                            okqVar2 = okqVar3;
                            bVar = bVar2;
                        } else if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    gm5 gm5Var4 = (gm5) ykqVar.j;
                    qgg.h0(obj);
                    okqVar = gm5Var4;
                    r7o r7oVar = z7o.b;
                    gm5Var = okqVar;
                    a2 = z7o.a(obj);
                    if (a2 == null) {
                        gm5Var.U(obj);
                    } else {
                        gm5Var.m0(a2);
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                gm5Var2 = bVar.b;
                try {
                    r7o r7oVar2 = z7o.b;
                    odrVar = (odr) okqVar.g.getValue();
                } catch (Throwable th) {
                    th = th;
                    okqVar = gm5Var2;
                    r7o r7oVar3 = z7o.b;
                    obj = new t7o(th);
                    gm5Var = okqVar;
                    a2 = z7o.a(obj);
                    if (a2 == null) {
                    }
                    return Unit.a;
                }
                if (odrVar instanceof r97) {
                    Function2 function2 = bVar.a;
                    CoroutineContext coroutineContext = bVar.d;
                    ykqVar.j = gm5Var2;
                    ykqVar.o = 1;
                    i2 = okqVar.i(function2, coroutineContext, ykqVar);
                    if (i2 == nm6Var) {
                    }
                    gm5 gm5Var5 = gm5Var2;
                    obj = i2;
                    okqVar = gm5Var5;
                    r7o r7oVar4 = z7o.b;
                    gm5Var = okqVar;
                    a2 = z7o.a(obj);
                    if (a2 == null) {
                    }
                    return Unit.a;
                }
                if (!(odrVar instanceof qjn)) {
                    z = odrVar instanceof zht;
                }
                if (!z) {
                    if (odrVar instanceof pdc) {
                        throw ((pdc) odrVar).a;
                    }
                    throw new x7j();
                }
                if (odrVar != bVar.c) {
                    throw ((qjn) odrVar).a;
                }
                ykqVar.j = bVar;
                ykqVar.k = okqVar;
                ykqVar.l = gm5Var2;
                ykqVar.o = 2;
                Object e = okqVar.e(ykqVar);
                okqVar2 = okqVar;
                if (e == nm6Var) {
                }
                return nm6Var;
                Function2 function22 = bVar.a;
                CoroutineContext coroutineContext2 = bVar.d;
                ykqVar.j = gm5Var2;
                ykqVar.k = null;
                ykqVar.l = null;
                ykqVar.o = 3;
                i2 = okqVar2.i(function22, coroutineContext2, ykqVar);
            }
        }
        ykqVar = new ykq(okqVar, cg6Var);
        Object obj2 = ykqVar.m;
        nm6 nm6Var2 = nm6.a;
        i = ykqVar.o;
        boolean z2 = true;
        if (i == 0) {
        }
        Function2 function222 = bVar.a;
        CoroutineContext coroutineContext22 = bVar.d;
        ykqVar.j = gm5Var2;
        ykqVar.k = null;
        ykqVar.l = null;
        ykqVar.o = 3;
        i2 = okqVar2.i(function222, coroutineContext22, ykqVar);
    }

    @Override // defpackage.wb7
    public final Object a(Function2 function2, Continuation continuation) {
        gm5 j2 = hld.j();
        this.i.a(new a.b(function2, j2, (odr) this.g.getValue(), continuation.getContext()));
        Object s = j2.s(continuation);
        nm6 nm6Var = nm6.a;
        return s;
    }

    public final File c() {
        return (File) this.f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        zkq zkqVar;
        int i;
        oqi a2;
        xqn xqnVar;
        okq<T> okqVar;
        xqn xqnVar2;
        List list;
        okq<T> okqVar2;
        xqn xqnVar3;
        blq blqVar;
        Iterator<T> it;
        oqi oqiVar;
        tqn tqnVar;
        tqn tqnVar2;
        zkq zkqVar2;
        okq<T> okqVar3;
        xqn xqnVar4;
        oqi oqiVar2;
        if (cg6Var instanceof zkq) {
            zkqVar = (zkq) cg6Var;
            int i2 = zkqVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zkqVar.r = i2 - Integer.MIN_VALUE;
                Object obj = zkqVar.p;
                nm6 nm6Var = nm6.a;
                i = zkqVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    xdr xdrVar = this.g;
                    if (!Intrinsics.d(xdrVar.getValue(), zht.a) && !(xdrVar.getValue() instanceof qjn)) {
                        xq0.q("Check failed.");
                        return null;
                    }
                    a2 = rqi.a();
                    xqnVar = new xqn();
                    zkqVar.j = this;
                    zkqVar.k = a2;
                    zkqVar.l = xqnVar;
                    zkqVar.m = xqnVar;
                    zkqVar.r = 1;
                    obj = h(zkqVar);
                    if (obj != nm6Var) {
                        okqVar = this;
                        xqnVar2 = xqnVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar2 = (oqi) zkqVar.m;
                        tqnVar2 = (tqn) zkqVar.l;
                        xqnVar4 = (xqn) zkqVar.k;
                        okqVar3 = zkqVar.j;
                        qgg.h0(obj);
                        try {
                            tqnVar2.a = true;
                            oqiVar2.b(null);
                            xdr xdrVar2 = okqVar3.g;
                            Object obj2 = xqnVar4.a;
                            r97 r97Var = new r97(obj2 == null ? obj2.hashCode() : 0, obj2);
                            xdrVar2.getClass();
                            xdrVar2.m(null, r97Var);
                            return Unit.a;
                        } catch (Throwable th) {
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    it = zkqVar.o;
                    blqVar = zkqVar.n;
                    tqnVar = (tqn) zkqVar.m;
                    xqnVar3 = (xqn) zkqVar.l;
                    oqiVar = (oqi) zkqVar.k;
                    okqVar2 = zkqVar.j;
                    qgg.h0(obj);
                    while (it.hasNext()) {
                        Function2 function2 = (Function2) it.next();
                        zkqVar.j = okqVar2;
                        zkqVar.k = oqiVar;
                        zkqVar.l = xqnVar3;
                        zkqVar.m = tqnVar;
                        zkqVar.n = blqVar;
                        zkqVar.o = it;
                        zkqVar.r = 2;
                        if (function2.invoke(blqVar, zkqVar) == nm6Var) {
                            break;
                        }
                    }
                    zkqVar2 = zkqVar;
                    tqnVar2 = tqnVar;
                    xqnVar2 = xqnVar3;
                    a2 = oqiVar;
                    okqVar3 = okqVar2;
                    okqVar3.h = null;
                    zkqVar2.j = okqVar3;
                    zkqVar2.k = xqnVar2;
                    zkqVar2.l = tqnVar2;
                    zkqVar2.m = a2;
                    zkqVar2.n = null;
                    zkqVar2.o = null;
                    zkqVar2.r = 3;
                    if (a2.a(zkqVar2) != nm6Var) {
                        xqnVar4 = xqnVar2;
                        oqiVar2 = a2;
                        tqnVar2.a = true;
                        oqiVar2.b(null);
                        xdr xdrVar22 = okqVar3.g;
                        Object obj22 = xqnVar4.a;
                        r97 r97Var2 = new r97(obj22 == null ? obj22.hashCode() : 0, obj22);
                        xdrVar22.getClass();
                        xdrVar22.m(null, r97Var2);
                        return Unit.a;
                    }
                    return nm6Var;
                }
                xqnVar = (xqn) zkqVar.m;
                xqnVar2 = (xqn) zkqVar.l;
                a2 = (oqi) zkqVar.k;
                okqVar = zkqVar.j;
                qgg.h0(obj);
                xqnVar.a = obj;
                tqn tqnVar3 = new tqn();
                blq blqVar2 = new blq(a2, tqnVar3, xqnVar2, okqVar);
                list = okqVar.h;
                if (list != null) {
                    tqnVar2 = tqnVar3;
                    zkqVar2 = zkqVar;
                    okqVar3 = okqVar;
                    okqVar3.h = null;
                    zkqVar2.j = okqVar3;
                    zkqVar2.k = xqnVar2;
                    zkqVar2.l = tqnVar2;
                    zkqVar2.m = a2;
                    zkqVar2.n = null;
                    zkqVar2.o = null;
                    zkqVar2.r = 3;
                    if (a2.a(zkqVar2) != nm6Var) {
                    }
                    return nm6Var;
                }
                okqVar2 = okqVar;
                xqnVar3 = xqnVar2;
                blqVar = blqVar2;
                it = list.iterator();
                oqiVar = a2;
                tqnVar = tqnVar3;
                while (it.hasNext()) {
                }
                zkqVar2 = zkqVar;
                tqnVar2 = tqnVar;
                xqnVar2 = xqnVar3;
                a2 = oqiVar;
                okqVar3 = okqVar2;
                okqVar3.h = null;
                zkqVar2.j = okqVar3;
                zkqVar2.k = xqnVar2;
                zkqVar2.l = tqnVar2;
                zkqVar2.m = a2;
                zkqVar2.n = null;
                zkqVar2.o = null;
                zkqVar2.r = 3;
                if (a2.a(zkqVar2) != nm6Var) {
                }
                return nm6Var;
            }
        }
        zkqVar = new zkq(this, cg6Var);
        Object obj3 = zkqVar.p;
        nm6 nm6Var2 = nm6.a;
        i = zkqVar.r;
        if (i != 0) {
        }
        xqnVar.a = obj3;
        tqn tqnVar32 = new tqn();
        blq blqVar22 = new blq(a2, tqnVar32, xqnVar2, okqVar);
        list = okqVar.h;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        clq clqVar;
        int i;
        okq<T> okqVar;
        if (cg6Var instanceof clq) {
            clqVar = (clq) cg6Var;
            int i2 = clqVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clqVar.m = i2 - Integer.MIN_VALUE;
                Object obj = clqVar.k;
                nm6 nm6Var = nm6.a;
                i = clqVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        clqVar.j = this;
                        clqVar.m = 1;
                        if (d(clqVar) == nm6Var) {
                            return nm6Var;
                        }
                    } catch (Throwable th) {
                        th = th;
                        okqVar = this;
                        xdr xdrVar = okqVar.g;
                        qjn qjnVar = new qjn(th);
                        xdrVar.getClass();
                        xdrVar.m(null, qjnVar);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    okqVar = clqVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        xdr xdrVar2 = okqVar.g;
                        qjn qjnVar2 = new qjn(th);
                        xdrVar2.getClass();
                        xdrVar2.m(null, qjnVar2);
                        throw th;
                    }
                }
                return Unit.a;
            }
        }
        clqVar = new clq(this, cg6Var);
        Object obj2 = clqVar.k;
        nm6 nm6Var2 = nm6.a;
        i = clqVar.m;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        dlq dlqVar;
        int i;
        okq<T> okqVar;
        if (cg6Var instanceof dlq) {
            dlqVar = (dlq) cg6Var;
            int i2 = dlqVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dlqVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dlqVar.k;
                nm6 nm6Var = nm6.a;
                i = dlqVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        dlqVar.j = this;
                        dlqVar.m = 1;
                        if (d(dlqVar) == nm6Var) {
                            return nm6Var;
                        }
                    } catch (Throwable th) {
                        th = th;
                        okqVar = this;
                        xdr xdrVar = okqVar.g;
                        qjn qjnVar = new qjn(th);
                        xdrVar.getClass();
                        xdrVar.m(null, qjnVar);
                        return Unit.a;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    okqVar = dlqVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        xdr xdrVar2 = okqVar.g;
                        qjn qjnVar2 = new qjn(th);
                        xdrVar2.getClass();
                        xdrVar2.m(null, qjnVar2);
                        return Unit.a;
                    }
                }
                return Unit.a;
            }
        }
        dlqVar = new dlq(this, cg6Var);
        Object obj2 = dlqVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dlqVar.m;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [okq] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [elq, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [okq] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [hip] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var) {
        ?? r0;
        int i;
        FileInputStream fileInputStream;
        Throwable th;
        try {
            if (cg6Var instanceof elq) {
                elq elqVar = (elq) cg6Var;
                int i2 = elqVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    elqVar.n = i2 - Integer.MIN_VALUE;
                    r0 = elqVar;
                    Object obj = r0.l;
                    nm6 nm6Var = nm6.a;
                    i = r0.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(c());
                            try {
                                ?? r2 = this.b;
                                r0.j = this;
                                r0.k = fileInputStream2;
                                r0.n = 1;
                                Object c = r2.c(fileInputStream2, r0);
                                if (c == nm6Var) {
                                    return nm6Var;
                                }
                                fileInputStream = fileInputStream2;
                                obj = c;
                            } catch (Throwable th2) {
                                fileInputStream = fileInputStream2;
                                th = th2;
                                r0 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e) {
                            e = e;
                            r0 = this;
                            if (r0.c().exists()) {
                                throw e;
                            }
                            return r0.b.a();
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fileInputStream = r0.k;
                        r0 = r0.j;
                        try {
                            qgg.h0(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                yd5.q(fileInputStream, th);
                                throw th4;
                            }
                        }
                    }
                    yd5.q(fileInputStream, null);
                    return obj;
                }
            }
            if (i != 0) {
            }
            yd5.q(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e2) {
            e = e2;
        }
        r0 = new elq(this, cg6Var);
        Object obj2 = r0.l;
        nm6 nm6Var2 = nm6.a;
        i = r0.n;
    }

    @Override // defpackage.wb7
    public final pjc getData() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cg6 cg6Var) {
        flq flqVar;
        nm6 nm6Var;
        int i;
        okq<T> okqVar;
        Object a2;
        wm6 wm6Var;
        okq<T> okqVar2;
        wm6 wm6Var2;
        if (cg6Var instanceof flq) {
            flqVar = (flq) cg6Var;
            int i2 = flqVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flqVar.n = i2 - Integer.MIN_VALUE;
                Object obj = flqVar.l;
                nm6Var = nm6.a;
                i = flqVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        flqVar.j = this;
                        flqVar.n = 1;
                        Object g = g(flqVar);
                        if (g != nm6Var) {
                            return g;
                        }
                    } catch (wm6 e) {
                        e = e;
                        okqVar = this;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj2 = flqVar.k;
                            wm6Var2 = (wm6) flqVar.j;
                            try {
                                qgg.h0(obj);
                                return obj2;
                            } catch (IOException e2) {
                                e = e2;
                                fob.a(wm6Var2, e);
                                throw wm6Var2;
                            }
                        }
                        wm6Var = (wm6) flqVar.k;
                        okqVar2 = (okq) flqVar.j;
                        qgg.h0(obj);
                        try {
                            flqVar.j = wm6Var;
                            flqVar.k = obj;
                            flqVar.n = 3;
                            return okqVar2.j(obj, flqVar) != nm6Var ? nm6Var : obj;
                        } catch (IOException e3) {
                            e = e3;
                            wm6Var2 = wm6Var;
                            fob.a(wm6Var2, e);
                            throw wm6Var2;
                        }
                    }
                    okqVar = (okq) flqVar.j;
                    try {
                        qgg.h0(obj);
                        return obj;
                    } catch (wm6 e4) {
                        e = e4;
                    }
                }
                xm6 xm6Var = okqVar.c;
                flqVar.j = okqVar;
                flqVar.k = e;
                flqVar.n = 2;
                a2 = xm6Var.a(e);
                if (a2 != nm6Var) {
                    okq<T> okqVar3 = okqVar;
                    wm6Var = e;
                    obj = a2;
                    okqVar2 = okqVar3;
                    flqVar.j = wm6Var;
                    flqVar.k = obj;
                    flqVar.n = 3;
                    if (okqVar2.j(obj, flqVar) != nm6Var) {
                    }
                }
            }
        }
        flqVar = new flq(this, cg6Var);
        Object obj3 = flqVar.l;
        nm6Var = nm6.a;
        i = flqVar.n;
        if (i != 0) {
        }
        xm6 xm6Var2 = okqVar.c;
        flqVar.j = okqVar;
        flqVar.k = e;
        flqVar.n = 2;
        a2 = xm6Var2.a(e);
        if (a2 != nm6Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Function2 function2, CoroutineContext coroutineContext, cg6 cg6Var) {
        glq glqVar;
        int i;
        r97 r97Var;
        Object obj;
        okq<T> okqVar;
        Object obj2;
        Object obj3;
        okq<T> okqVar2;
        if (cg6Var instanceof glq) {
            glqVar = (glq) cg6Var;
            int i2 = glqVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glqVar.o = i2 - Integer.MIN_VALUE;
                Object obj4 = glqVar.m;
                nm6 nm6Var = nm6.a;
                i = glqVar.o;
                if (i != 0) {
                    qgg.h0(obj4);
                    r97 r97Var2 = (r97) this.g.getValue();
                    Object obj5 = r97Var2.a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != r97Var2.b) {
                        xq0.q("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        return null;
                    }
                    Object obj6 = r97Var2.a;
                    C0090hlq c0090hlq = new C0090hlq(function2, obj6, null);
                    glqVar.j = this;
                    glqVar.k = r97Var2;
                    glqVar.l = obj6;
                    glqVar.o = 1;
                    Object V = x97.V(coroutineContext, c0090hlq, glqVar);
                    if (V != nm6Var) {
                        r97Var = r97Var2;
                        obj4 = V;
                        obj = obj6;
                        okqVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = glqVar.k;
                    okqVar2 = glqVar.j;
                    qgg.h0(obj4);
                    xdr xdrVar = okqVar2.g;
                    r97 r97Var3 = new r97(obj3 != null ? obj3.hashCode() : 0, obj3);
                    xdrVar.getClass();
                    xdrVar.m(null, r97Var3);
                    return obj3;
                }
                obj = glqVar.l;
                r97Var = (r97) glqVar.k;
                okqVar = glqVar.j;
                qgg.h0(obj4);
                obj2 = r97Var.a;
                if ((obj2 == null ? obj2.hashCode() : 0) == r97Var.b) {
                    xq0.q("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    return null;
                }
                if (Intrinsics.d(obj, obj4)) {
                    return obj;
                }
                glqVar.j = okqVar;
                glqVar.k = obj4;
                glqVar.l = null;
                glqVar.o = 2;
                if (okqVar.j(obj4, glqVar) != nm6Var) {
                    obj3 = obj4;
                    okqVar2 = okqVar;
                    xdr xdrVar2 = okqVar2.g;
                    r97 r97Var32 = new r97(obj3 != null ? obj3.hashCode() : 0, obj3);
                    xdrVar2.getClass();
                    xdrVar2.m(null, r97Var32);
                    return obj3;
                }
                return nm6Var;
            }
        }
        glqVar = new glq(this, cg6Var);
        Object obj42 = glqVar.m;
        nm6 nm6Var2 = nm6.a;
        i = glqVar.o;
        if (i != 0) {
        }
        obj2 = r97Var.a;
        if ((obj2 == null ? obj2.hashCode() : 0) == r97Var.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: IOException -> 0x00b8, TRY_ENTER, TryCatch #1 {IOException -> 0x00b8, blocks: (B:14:0x0091, B:19:0x00a1, B:20:0x00b7, B:27:0x00be, B:28:0x00c1, B:44:0x0069, B:24:0x00bc), top: B:43:0x0069, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, cg6 cg6Var) {
        ilq ilqVar;
        int i;
        File file;
        FileOutputStream fileOutputStream;
        okq<T> okqVar;
        FileOutputStream fileOutputStream2;
        if (cg6Var instanceof ilq) {
            ilqVar = (ilq) cg6Var;
            int i2 = ilqVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ilqVar.p = i2 - Integer.MIN_VALUE;
                Object obj2 = ilqVar.n;
                nm6 nm6Var = nm6.a;
                i = ilqVar.p;
                if (i != 0) {
                    qgg.h0(obj2);
                    File c = c();
                    File parentFile = c.getCanonicalFile().getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            kac.f(Intrinsics.h(c, "Unable to create parent directories of "));
                            return null;
                        }
                    }
                    file = new File(Intrinsics.h(this.e, c().getAbsolutePath()));
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            hip hipVar = this.b;
                            b bVar = new b(fileOutputStream3);
                            ilqVar.j = this;
                            ilqVar.k = file;
                            ilqVar.l = fileOutputStream3;
                            ilqVar.m = fileOutputStream3;
                            ilqVar.p = 1;
                            if (hipVar.b(obj, bVar, ilqVar) == nm6Var) {
                                return nm6Var;
                            }
                            okqVar = this;
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (IOException e) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = ilqVar.m;
                    fileOutputStream = ilqVar.l;
                    file = ilqVar.k;
                    okqVar = ilqVar.j;
                    try {
                        qgg.h0(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            yd5.q(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                yd5.q(fileOutputStream, null);
                if (!file.renameTo(okqVar.c())) {
                    return Unit.a;
                }
                throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        ilqVar = new ilq(this, cg6Var);
        Object obj22 = ilqVar.n;
        nm6 nm6Var2 = nm6.a;
        i = ilqVar.p;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        yd5.q(fileOutputStream, null);
        if (!file.renameTo(okqVar.c())) {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokq$b;", "Ljava/io/OutputStream;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class b extends OutputStream {
        public final FileOutputStream a;

        public b(FileOutputStream fileOutputStream) {
            this.a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            bArr.getClass();
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            bArr.getClass();
            this.a.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
