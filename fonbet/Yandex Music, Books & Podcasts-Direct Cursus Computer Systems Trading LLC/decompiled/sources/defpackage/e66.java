package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e66 implements b66 {
    public final rgm a;
    public final rgm b;
    public final imp c;
    public final ThreadLocal d;
    public volatile boolean e;
    public final long f;
    public final int g;

    public e66(final qne qneVar, final String str, int i) {
        str.getClass();
        this.c = new imp();
        this.d = new ThreadLocal();
        msa msaVar = nsa.b;
        this.f = yd5.M(30, ssa.SECONDS);
        this.g = 2;
        if (i <= 0) {
            xq0.x("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.a = new rgm(i, new Function0() { // from class: c66
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        xjo e = qneVar.e(str);
                        p6g.s(e, "PRAGMA query_only = 1");
                        return e;
                    default:
                        return qneVar.e(str);
                }
            }
        });
        final int i3 = 1;
        this.b = new rgm(1, new Function0() { // from class: c66
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        xjo e = qneVar.e(str);
                        p6g.s(e, "PRAGMA query_only = 1");
                        return e;
                    default:
                        return qneVar.e(str);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.c();
        this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #0 {all -> 0x01a3, blocks: (B:55:0x0120, B:59:0x013c, B:61:0x0147, B:65:0x01a7, B:66:0x01ae), top: B:54:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7 A[Catch: all -> 0x01a3, TRY_ENTER, TryCatch #0 {all -> 0x01a3, blocks: (B:55:0x0120, B:59:0x013c, B:61:0x0147, B:65:0x01a7, B:66:0x01ae), top: B:54:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.b66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(boolean z, Function2 function2, cg6 cg6Var) {
        d66 d66Var;
        int i;
        xqn xqnVar;
        Throwable th;
        rgm rgmVar;
        Function2 function22;
        CoroutineContext coroutineContext;
        imp impVar;
        rgm rgmVar2;
        xqn xqnVar2;
        Object obj;
        xqn xqnVar3;
        ahm ahmVar;
        boolean z2 = z;
        try {
            if (cg6Var instanceof d66) {
                d66Var = (d66) cg6Var;
                int i2 = d66Var.s;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    d66Var.s = i2 - Integer.MIN_VALUE;
                    Object obj2 = d66Var.q;
                    nm6 nm6Var = nm6.a;
                    i = d66Var.s;
                    CoroutineContext coroutineContext2 = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    if (i != 0) {
                        qgg.h0(obj2);
                        if (this.e) {
                            p6g.H(21, "Connection pool is closed");
                            throw null;
                        }
                        ahm ahmVar2 = (ahm) this.d.get();
                        if (ahmVar2 == null) {
                            x56 x56Var = (x56) d66Var.getContext().get(this.c);
                            ahmVar2 = x56Var != null ? x56Var.b : null;
                        }
                        if (ahmVar2 == null) {
                            rgm rgmVar3 = z2 ? this.a : this.b;
                            xqnVar = new xqn();
                            try {
                                CoroutineContext context = d66Var.getContext();
                                imp impVar2 = this.c;
                                long j = this.f;
                                ps psVar = new ps(this, z2, 3);
                                d66Var.k = function2;
                                d66Var.l = rgmVar3;
                                d66Var.m = xqnVar;
                                d66Var.n = context;
                                d66Var.o = xqnVar;
                                d66Var.p = impVar2;
                                d66Var.j = z2;
                                d66Var.s = 3;
                                Object b = rgmVar3.b(j, psVar, d66Var);
                                if (b != nm6Var) {
                                    function22 = function2;
                                    coroutineContext = context;
                                    impVar = impVar2;
                                    rgmVar2 = rgmVar3;
                                    obj2 = b;
                                    xqnVar2 = xqnVar;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                rgmVar = rgmVar3;
                                throw th;
                            }
                        } else {
                            if (!z2 && ahmVar2.c) {
                                p6g.H(1, "Cannot upgrade connection from reader to writer");
                                throw null;
                            }
                            if (d66Var.getContext().get(this.c) == null) {
                                x56 x56Var2 = new x56(this.c, ahmVar2);
                                ThreadLocal threadLocal = this.d;
                                threadLocal.getClass();
                                CoroutineContext c = e.c(x56Var2, new qfs(ahmVar2, threadLocal));
                                vv4 vv4Var = new vv4((Object) function2, (Object) ahmVar2, (Continuation) (objArr == true ? 1 : 0), 22);
                                d66Var.s = 1;
                                Object V = x97.V(c, vv4Var, d66Var);
                                if (V != nm6Var) {
                                    return V;
                                }
                            } else {
                                d66Var.s = 2;
                                Object invoke = function2.invoke(ahmVar2, d66Var);
                                if (invoke != nm6Var) {
                                    return invoke;
                                }
                            }
                        }
                        return nm6Var;
                    }
                    if (i == 1) {
                        qgg.h0(obj2);
                        return obj2;
                    }
                    if (i == 2) {
                        qgg.h0(obj2);
                        return obj2;
                    }
                    if (i == 3) {
                        z2 = d66Var.j;
                        impVar = d66Var.p;
                        xqn xqnVar4 = d66Var.o;
                        coroutineContext = d66Var.n;
                        xqn xqnVar5 = d66Var.m;
                        rgmVar2 = (rgm) d66Var.l;
                        function22 = (Function2) d66Var.k;
                        try {
                            qgg.h0(obj2);
                            xqnVar2 = xqnVar4;
                            xqnVar = xqnVar5;
                        } catch (Throwable th3) {
                            th = th3;
                            xqnVar = xqnVar5;
                            rgmVar = rgmVar2;
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xqnVar3 = (xqn) d66Var.l;
                        rgmVar = (rgm) d66Var.k;
                        try {
                            qgg.h0(obj2);
                            ahmVar = (ahm) xqnVar3.a;
                            if (ahmVar != null) {
                                if (!ahmVar.e) {
                                    ahmVar.e = true;
                                    if (ahmVar.b.a.inTransaction()) {
                                        p6g.s(ahmVar.b, "ROLLBACK TRANSACTION");
                                    }
                                }
                                t66 t66Var = ahmVar.b;
                                t66Var.c = null;
                                t66Var.d = null;
                                rgmVar.e(t66Var);
                            }
                            return obj2;
                        } catch (Throwable th4) {
                            xqnVar = xqnVar3;
                            th = th4;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    t66 t66Var2 = (t66) obj2;
                    t66Var2.getClass();
                    coroutineContext.getClass();
                    t66Var2.c = coroutineContext;
                    t66Var2.d = new Throwable();
                    xqnVar2.a = new ahm(impVar, t66Var2, this.a == this.b && z2);
                    obj = xqnVar.a;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ahm ahmVar3 = (ahm) obj;
                    x56 x56Var3 = new x56(this.c, ahmVar3);
                    ThreadLocal threadLocal2 = this.d;
                    threadLocal2.getClass();
                    CoroutineContext c2 = e.c(x56Var3, new qfs(ahmVar3, threadLocal2));
                    vv4 vv4Var2 = new vv4((Object) function22, (Object) xqnVar, (Continuation) (objArr2 == true ? 1 : 0), 23);
                    d66Var.k = rgmVar2;
                    d66Var.l = xqnVar;
                    d66Var.m = null;
                    d66Var.n = null;
                    d66Var.o = null;
                    d66Var.p = null;
                    d66Var.s = 4;
                    obj2 = x97.V(c2, vv4Var2, d66Var);
                    if (obj2 != nm6Var) {
                        xqnVar3 = xqnVar;
                        rgmVar = rgmVar2;
                        ahmVar = (ahm) xqnVar3.a;
                        if (ahmVar != null) {
                        }
                        return obj2;
                    }
                    return nm6Var;
                }
            }
            t66 t66Var22 = (t66) obj2;
            t66Var22.getClass();
            coroutineContext.getClass();
            t66Var22.c = coroutineContext;
            t66Var22.d = new Throwable();
            xqnVar2.a = new ahm(impVar, t66Var22, this.a == this.b && z2);
            obj = xqnVar.a;
            if (obj != null) {
            }
        } catch (Throwable th5) {
            th = th5;
            rgmVar = rgmVar2;
            throw th;
        }
        d66Var = new d66(this, cg6Var);
        Object obj22 = d66Var.q;
        nm6 nm6Var2 = nm6.a;
        i = d66Var.s;
        CoroutineContext coroutineContext22 = null;
        Object[] objArr4 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        if (i != 0) {
        }
    }

    public e66(qne qneVar) {
        this.c = new imp();
        this.d = new ThreadLocal();
        msa msaVar = nsa.b;
        this.f = yd5.M(30, ssa.SECONDS);
        this.g = 2;
        rgm rgmVar = new rgm(1, new r25(25, qneVar));
        this.a = rgmVar;
        this.b = rgmVar;
    }
}
