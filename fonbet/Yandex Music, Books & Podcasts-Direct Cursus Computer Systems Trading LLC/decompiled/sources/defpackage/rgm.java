package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rgm {
    public final int a;
    public final Function0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final t66[] f;
    public final bgp g;
    public final zx0 h;

    public rgm(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
        this.f = new t66[i];
        int i2 = cgp.a;
        this.g = new bgp(i, 0);
        this.h = new zx0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:13:0x0043, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x006e, B:25:0x007c, B:26:0x0084), top: B:12:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #1 {all -> 0x007a, blocks: (B:13:0x0043, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x006e, B:25:0x007c, B:26:0x0084), top: B:12:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        pgm pgmVar;
        int i;
        bgp bgpVar;
        ReentrantLock reentrantLock;
        zx0 zx0Var = this.h;
        try {
            try {
                if (cg6Var instanceof pgm) {
                    pgmVar = (pgm) cg6Var;
                    int i2 = pgmVar.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pgmVar.l = i2 - Integer.MIN_VALUE;
                        Object obj = pgmVar.j;
                        nm6 nm6Var = nm6.a;
                        i = pgmVar.l;
                        bgpVar = this.g;
                        if (i != 0) {
                            qgg.h0(obj);
                            pgmVar.l = 1;
                            if (bgpVar.c(pgmVar) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                        }
                        reentrantLock = this.c;
                        reentrantLock.lock();
                        if (!this.e) {
                            p6g.H(21, "Connection pool is closed");
                            throw null;
                        }
                        if (zx0Var.isEmpty() && this.d < this.a) {
                            t66 t66Var = new t66((xjo) this.b.invoke());
                            t66[] t66VarArr = this.f;
                            int i3 = this.d;
                            this.d = i3 + 1;
                            t66VarArr[i3] = t66Var;
                            zx0Var.addLast(t66Var);
                        }
                        return (t66) zx0Var.removeLast();
                    }
                }
                if (!this.e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.c;
            reentrantLock.lock();
        } catch (Throwable th) {
            bgpVar.e();
            throw th;
        }
        pgmVar = new pgm(this, cg6Var);
        Object obj2 = pgmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pgmVar.l;
        bgpVar = this.g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r11 = r11;
        r10 = r10;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:14:0x006b, B:16:0x006f, B:30:0x0077, B:33:0x007e), top: B:13:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:12:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ps psVar, cg6 cg6Var) {
        qgm qgmVar;
        int i;
        xqn xqnVar;
        qgm qgmVar2;
        Throwable th;
        c5l c5lVar;
        ps psVar2;
        if (cg6Var instanceof qgm) {
            qgmVar = (qgm) cg6Var;
            int i2 = qgmVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qgmVar.o = i2 - Integer.MIN_VALUE;
                Object obj = qgmVar.m;
                nm6 nm6Var = nm6.a;
                i = qgmVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    xqn xqnVar2 = new xqn();
                    c5lVar = new c5l(xqnVar2, this, continuation, 15);
                    qgmVar.k = psVar;
                    qgmVar.l = xqnVar2;
                    qgmVar.j = j;
                    qgmVar.o = 1;
                    if (tyf.K(j, c5lVar, qgmVar) == nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = qgmVar.j;
                    xqn xqnVar3 = qgmVar.l;
                    Function0 function0 = qgmVar.k;
                    try {
                        qgg.h0(obj);
                        psVar2 = function0;
                    } catch (Throwable th2) {
                        xqnVar = xqnVar3;
                        psVar = function0;
                        qgmVar2 = qgmVar;
                        th = th2;
                    }
                    xqnVar = xqnVar3;
                    psVar = psVar2;
                    qgmVar2 = qgmVar;
                    th = null;
                    try {
                        if (th instanceof wis) {
                            psVar.invoke();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = xqnVar.a;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        qgmVar = qgmVar2;
                        xqn xqnVar22 = new xqn();
                        c5lVar = new c5l(xqnVar22, this, continuation, 15);
                        qgmVar.k = psVar;
                        qgmVar.l = xqnVar22;
                        qgmVar.j = j;
                        qgmVar.o = 1;
                        if (tyf.K(j, c5lVar, qgmVar) == nm6Var) {
                            return nm6Var;
                        }
                        psVar2 = psVar;
                        xqnVar3 = xqnVar22;
                        xqnVar = xqnVar3;
                        psVar = psVar2;
                        qgmVar2 = qgmVar;
                        th = null;
                        if (th instanceof wis) {
                        }
                        qgmVar = qgmVar2;
                        xqn xqnVar222 = new xqn();
                        c5lVar = new c5l(xqnVar222, this, continuation, 15);
                        qgmVar.k = psVar;
                        qgmVar.l = xqnVar222;
                        qgmVar.j = j;
                        qgmVar.o = 1;
                        if (tyf.K(j, c5lVar, qgmVar) == nm6Var) {
                        }
                    } catch (Throwable th3) {
                        t66 t66Var = (t66) xqnVar.a;
                        if (t66Var != null) {
                            e(t66Var);
                        }
                        throw th3;
                    }
                }
            }
        }
        qgmVar = new qgm(this, cg6Var);
        Object obj3 = qgmVar.m;
        nm6 nm6Var2 = nm6.a;
        i = qgmVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (t66 t66Var : this.f) {
                if (t66Var != null) {
                    t66Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        zx0 zx0Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            n8g b = t75.b();
            int i = zx0Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                b.add(zx0Var.get(i2));
            }
            n8g a = t75.a(b);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            bgp bgpVar = this.g;
            bgpVar.getClass();
            sb2.append(Math.max(agp.g.get(bgpVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + a.f() + ")[" + CollectionsKt.X(a, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            t66[] t66VarArr = this.f;
            int length = t66VarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                t66 t66Var = t66VarArr[i4];
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(t66Var != null ? t66Var.a.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (t66Var != null) {
                    t66Var.g(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(t66 t66Var) {
        t66Var.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(t66Var);
            reentrantLock.unlock();
            this.g.e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
