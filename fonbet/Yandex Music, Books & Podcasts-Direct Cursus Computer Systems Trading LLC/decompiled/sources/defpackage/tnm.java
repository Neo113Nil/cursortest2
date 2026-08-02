package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.preload_manager.k;

/* loaded from: classes6.dex */
public final class tnm {
    public long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;

    public tnm(mm6 mm6Var, w4i w4iVar) {
        mm6Var.getClass();
        this.b = mm6Var;
        this.c = w4iVar;
        this.d = new ArrayList();
        this.a = System.currentTimeMillis();
        this.g = rqi.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(tnm tnmVar, x3r x3rVar, cg6 cg6Var) {
        y3r y3rVar;
        int i;
        qqi qqiVar;
        tnmVar.getClass();
        try {
            if (cg6Var instanceof y3r) {
                y3rVar = (y3r) cg6Var;
                int i2 = y3rVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    y3rVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = y3rVar.m;
                    nm6 nm6Var = nm6.a;
                    i = y3rVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) tnmVar.g;
                        y3rVar.j = tnmVar;
                        y3rVar.k = x3rVar;
                        y3rVar.l = qqiVar;
                        y3rVar.o = 1;
                        if (qqiVar.a(y3rVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = y3rVar.l;
                        x3rVar = y3rVar.k;
                        tnm tnmVar2 = y3rVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        tnmVar = tnmVar2;
                    }
                    ((ArrayList) tnmVar.d).add(x3rVar);
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            ((ArrayList) tnmVar.d).add(x3rVar);
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        y3rVar = new y3r(tnmVar, cg6Var);
        Object obj2 = y3rVar.m;
        nm6 nm6Var2 = nm6.a;
        i = y3rVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(tnm tnmVar, cg6 cg6Var) {
        z3r z3rVar;
        int i;
        qqi qqiVar;
        tnmVar.getClass();
        try {
            if (cg6Var instanceof z3r) {
                z3rVar = (z3r) cg6Var;
                int i2 = z3rVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    z3rVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = z3rVar.l;
                    nm6 nm6Var = nm6.a;
                    i = z3rVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) tnmVar.g;
                        z3rVar.j = tnmVar;
                        z3rVar.k = qqiVar;
                        z3rVar.n = 1;
                        if (qqiVar.a(z3rVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = z3rVar.k;
                        tnm tnmVar2 = z3rVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        tnmVar = tnmVar2;
                    }
                    return Boolean.valueOf(!((ArrayList) tnmVar.d).isEmpty());
                }
            }
            return Boolean.valueOf(!((ArrayList) tnmVar.d).isEmpty());
        } finally {
            qqiVar.b(null);
        }
        z3rVar = new z3r(tnmVar, cg6Var);
        Object obj2 = z3rVar.l;
        nm6 nm6Var2 = nm6.a;
        i = z3rVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r7v9, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(tnm tnmVar, cg6 cg6Var) {
        a4r a4rVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        Throwable th;
        oqi oqiVar;
        w4i w4iVar;
        List w0;
        tnm tnmVar2;
        tnmVar.getClass();
        try {
            if (cg6Var instanceof a4r) {
                a4rVar = (a4r) cg6Var;
                int i2 = a4rVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    a4rVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = a4rVar.l;
                    nm6Var = nm6.a;
                    i = a4rVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) tnmVar.g;
                        a4rVar.j = tnmVar;
                        a4rVar.k = qqiVar;
                        a4rVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = a4rVar.k;
                            tnmVar2 = a4rVar.j;
                            try {
                                qgg.h0(obj);
                                ((ArrayList) tnmVar2.d).clear();
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        ?? r7 = a4rVar.k;
                        tnm tnmVar3 = a4rVar.j;
                        qgg.h0(obj);
                        qqiVar = r7;
                        tnmVar = tnmVar3;
                    }
                    w4iVar = (w4i) tnmVar.c;
                    w0 = CollectionsKt.w0((ArrayList) tnmVar.d);
                    a4rVar.j = tnmVar;
                    a4rVar.k = qqiVar;
                    a4rVar.n = 2;
                    if (w4iVar.invoke(w0, a4rVar) != nm6Var) {
                        tnmVar2 = tnmVar;
                        oqiVar = qqiVar;
                        ((ArrayList) tnmVar2.d).clear();
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            w4iVar = (w4i) tnmVar.c;
            w0 = CollectionsKt.w0((ArrayList) tnmVar.d);
            a4rVar.j = tnmVar;
            a4rVar.k = qqiVar;
            a4rVar.n = 2;
            if (w4iVar.invoke(w0, a4rVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar2 = qqiVar;
            th = th3;
            oqiVar = qqiVar2;
            oqiVar.b(null);
            throw th;
        }
        a4rVar = new a4r(tnmVar, cg6Var);
        Object obj2 = a4rVar.l;
        nm6Var = nm6.a;
        i = a4rVar.n;
        if (i != 0) {
        }
    }

    public tnm(xiu xiuVar, ExecutorService executorService, Handler handler, k kVar, long j, liq liqVar, vp3 vp3Var) {
        xiuVar.getClass();
        vp3Var.getClass();
        this.b = xiuVar;
        this.c = executorService;
        this.d = handler;
        this.e = kVar;
        this.a = j;
        this.f = liqVar;
        this.g = vp3Var;
    }
}
