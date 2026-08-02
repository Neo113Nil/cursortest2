package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ahm implements r6t, nin {
    public final imp a;
    public final t66 b;
    public final boolean c;
    public final zx0 d;
    public volatile boolean e;

    public ahm(imp impVar, t66 t66Var, boolean z) {
        impVar.getClass();
        this.a = impVar;
        this.b = t66Var;
        this.c = z;
        this.d = new zx0();
    }

    @Override // defpackage.r6t
    public final Object a(q6t q6tVar, Function2 function2, aur aurVar) {
        if (this.e) {
            p6g.H(21, "Connection is recycled");
            throw null;
        }
        x56 x56Var = (x56) aurVar.getContext().get(this.a);
        if (x56Var != null && x56Var.b == this) {
            return g(q6tVar, function2, aurVar);
        }
        p6g.H(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Function1 function1, cg6 cg6Var) {
        zgm zgmVar;
        int i;
        t66 t66Var;
        try {
            try {
                if (cg6Var instanceof zgm) {
                    zgmVar = (zgm) cg6Var;
                    int i2 = zgmVar.o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        zgmVar.o = i2 - Integer.MIN_VALUE;
                        Object obj = zgmVar.m;
                        nm6 nm6Var = nm6.a;
                        i = zgmVar.o;
                        if (i != 0) {
                            qgg.h0(obj);
                            if (this.e) {
                                p6g.H(21, "Connection is recycled");
                                throw null;
                            }
                            x56 x56Var = (x56) zgmVar.getContext().get(this.a);
                            if (x56Var == null || x56Var.b != this) {
                                p6g.H(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            t66Var = this.b;
                            zgmVar.j = str;
                            zgmVar.k = function1;
                            zgmVar.l = t66Var;
                            zgmVar.o = 1;
                            if (t66Var.b.a(zgmVar) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            t66 t66Var2 = zgmVar.l;
                            function1 = zgmVar.k;
                            String str2 = zgmVar.j;
                            qgg.h0(obj);
                            t66Var = t66Var2;
                            str = str2;
                        }
                        ugm ugmVar = new ugm(this, this.b.D0(str));
                        Object invoke = function1.invoke(ugmVar);
                        i4w.w(ugmVar, null);
                        return invoke;
                    }
                }
                Object invoke2 = function1.invoke(ugmVar);
                i4w.w(ugmVar, null);
                return invoke2;
            } finally {
            }
            ugm ugmVar2 = new ugm(this, this.b.D0(str));
        } finally {
            t66Var.b(null);
        }
        zgmVar = new zgm(this, cg6Var);
        Object obj2 = zgmVar.m;
        nm6 nm6Var2 = nm6.a;
        i = zgmVar.o;
        if (i != 0) {
        }
    }

    @Override // defpackage.r6t
    public final Boolean c(Continuation continuation) {
        if (this.e) {
            p6g.H(21, "Connection is recycled");
            throw null;
        }
        x56 x56Var = (x56) continuation.getContext().get(this.a);
        if (x56Var != null && x56Var.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.inTransaction());
        }
        p6g.H(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.nin
    public final xjo d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004e, B:14:0x0056, B:19:0x0061, B:20:0x008f, B:24:0x0069, B:25:0x006e, B:26:0x006f, B:27:0x0075, B:28:0x007b), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004e, B:14:0x0056, B:19:0x0061, B:20:0x008f, B:24:0x0069, B:25:0x006e, B:26:0x006f, B:27:0x0075, B:28:0x007b), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(q6t q6tVar, cg6 cg6Var) {
        wgm wgmVar;
        int i;
        t66 t66Var;
        zx0 zx0Var = this.d;
        try {
            if (cg6Var instanceof wgm) {
                wgmVar = (wgm) cg6Var;
                int i2 = wgmVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wgmVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = wgmVar.l;
                    nm6 nm6Var = nm6.a;
                    i = wgmVar.n;
                    t66 t66Var2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj);
                        wgmVar.j = q6tVar;
                        wgmVar.k = t66Var2;
                        wgmVar.n = 1;
                        if (t66Var2.b.a(wgmVar) == nm6Var) {
                            return nm6Var;
                        }
                        t66Var = t66Var2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t66 t66Var3 = wgmVar.k;
                        q6t q6tVar2 = wgmVar.j;
                        qgg.h0(obj);
                        t66Var = t66Var3;
                        q6tVar = q6tVar2;
                    }
                    int i3 = zx0Var.c;
                    if (zx0Var.isEmpty()) {
                        p6g.s(t66Var2, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int ordinal = q6tVar.ordinal();
                        if (ordinal == 0) {
                            p6g.s(t66Var2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            p6g.s(t66Var2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new x7j();
                            }
                            p6g.s(t66Var2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    zx0Var.addLast(new vgm(i3));
                    Unit unit = Unit.a;
                    t66Var.b(null);
                    return unit;
                }
            }
            int i32 = zx0Var.c;
            if (zx0Var.isEmpty()) {
            }
            zx0Var.addLast(new vgm(i32));
            Unit unit2 = Unit.a;
            t66Var.b(null);
            return unit2;
        } catch (Throwable th) {
            t66Var.b(null);
            throw th;
        }
        wgmVar = new wgm(this, cg6Var);
        Object obj2 = wgmVar.l;
        nm6 nm6Var2 = nm6.a;
        i = wgmVar.n;
        t66 t66Var22 = this.b;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x004e, B:14:0x0054, B:16:0x005e, B:18:0x0067, B:19:0x00a4, B:23:0x006f, B:24:0x0084, B:26:0x008a, B:27:0x0090, B:28:0x00aa, B:29:0x00b1), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x004e, B:14:0x0054, B:16:0x005e, B:18:0x0067, B:19:0x00a4, B:23:0x006f, B:24:0x0084, B:26:0x008a, B:27:0x0090, B:28:0x00aa, B:29:0x00b1), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, cg6 cg6Var) {
        xgm xgmVar;
        int i;
        t66 t66Var;
        zx0 zx0Var = this.d;
        try {
            if (cg6Var instanceof xgm) {
                xgmVar = (xgm) cg6Var;
                int i2 = xgmVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xgmVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = xgmVar.l;
                    nm6 nm6Var = nm6.a;
                    i = xgmVar.n;
                    t66 t66Var2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj);
                        xgmVar.k = t66Var2;
                        xgmVar.j = z;
                        xgmVar.n = 1;
                        if (t66Var2.b.a(xgmVar) == nm6Var) {
                            return nm6Var;
                        }
                        t66Var = t66Var2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = xgmVar.j;
                        t66Var = xgmVar.k;
                        qgg.h0(obj);
                    }
                    if (!zx0Var.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    vgm vgmVar = (vgm) z75.A(zx0Var);
                    if (z) {
                        vgmVar.getClass();
                        if (zx0Var.isEmpty()) {
                            p6g.s(t66Var2, "END TRANSACTION");
                        } else {
                            p6g.s(t66Var2, "RELEASE SAVEPOINT '" + vgmVar.a + '\'');
                        }
                    } else if (zx0Var.isEmpty()) {
                        p6g.s(t66Var2, "ROLLBACK TRANSACTION");
                    } else {
                        p6g.s(t66Var2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + vgmVar.a + '\'');
                    }
                    Unit unit = Unit.a;
                    t66Var.b(null);
                    return unit;
                }
            }
            if (!zx0Var.isEmpty()) {
            }
        } catch (Throwable th) {
            t66Var.b(null);
            throw th;
        }
        xgmVar = new xgm(this, cg6Var);
        Object obj2 = xgmVar.l;
        nm6 nm6Var2 = nm6.a;
        i = xgmVar.n;
        t66 t66Var22 = this.b;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(2:12|(1:(2:15|16)(3:18|19|20))(2:21|22))(2:23|24))(5:25|26|(1:28)|29|(1:32)(1:31)))(1:34))(3:38|(1:40)|41)|35|(4:37|(0)|29|(0))|32))|55|6|7|(0)(0)|35|(0)|32|(3:(0)|(1:47)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        if (e(r9, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        if (f(false, r0) != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0042, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
    
        if (r10 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        defpackage.fob.a(r10, r11);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        throw r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ahm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(q6t th, Function2 function2, cg6 cg6Var) {
        ygm ygmVar;
        Object obj;
        nm6 nm6Var;
        int i;
        ?? r9;
        Function2 function22;
        try {
            if (cg6Var instanceof ygm) {
                ygmVar = (ygm) cg6Var;
                int i2 = ygmVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ygmVar.o = i2 - Integer.MIN_VALUE;
                    obj = ygmVar.m;
                    nm6Var = nm6.a;
                    i = ygmVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        q6t q6tVar = th;
                        if (th == null) {
                            q6tVar = q6t.a;
                        }
                        ygmVar.j = function2;
                        ygmVar.o = 1;
                        function22 = function2;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                ?? r92 = ygmVar.l;
                                qgg.h0(obj);
                                th = r92;
                                function2 = function2;
                                boolean z = th != null;
                                ygmVar.j = obj;
                                ygmVar.o = 3;
                                return f(z, ygmVar) != nm6Var ? nm6Var : obj;
                            }
                            if (i == 3) {
                                Object obj2 = ygmVar.j;
                                qgg.h0(obj);
                                return obj2;
                            }
                            if (i == 4) {
                                Object obj3 = ygmVar.j;
                                qgg.h0(obj);
                                return obj3;
                            }
                            if (i != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th2 = ygmVar.k;
                            qgg.h0(obj);
                            r9 = th2;
                            throw r9;
                        }
                        Function2 function23 = (Function2) ygmVar.j;
                        qgg.h0(obj);
                        function22 = function23;
                    }
                    t9k t9kVar = new t9k(1, this);
                    ygmVar.j = null;
                    ygmVar.l = 1;
                    ygmVar.o = 2;
                    obj = function22.invoke(t9kVar, ygmVar);
                    if (obj != nm6Var) {
                        th = 1;
                        function2 = function22;
                        if (th != null) {
                        }
                        ygmVar.j = obj;
                        ygmVar.o = 3;
                        if (f(z, ygmVar) != nm6Var) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            t9k t9kVar2 = new t9k(1, this);
            ygmVar.j = null;
            ygmVar.l = 1;
            ygmVar.o = 2;
            obj = function22.invoke(t9kVar2, ygmVar);
            if (obj != nm6Var) {
            }
        } catch (Throwable th3) {
            th = th3;
            function2 = th;
            try {
                throw function2;
            } catch (Throwable th4) {
                ygmVar.j = function2;
                ygmVar.k = th4;
                ygmVar.o = 5;
                r9 = th4;
            }
        }
        ygmVar = new ygm(this, cg6Var);
        obj = ygmVar.m;
        nm6Var = nm6.a;
        i = ygmVar.o;
    }
}
