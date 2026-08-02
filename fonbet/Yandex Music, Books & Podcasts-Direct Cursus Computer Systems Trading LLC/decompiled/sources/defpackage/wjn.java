package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class wjn {
    public final ReentrantLock a = new ReentrantLock();
    public final xdr b;

    public wjn(int i) {
        this.b = ydr.a(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (defpackage.zsd.h0(r0, r10, r1) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (defpackage.a4g.T(r1) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:11:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:11:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        ujn ujnVar;
        int i;
        boolean z;
        boolean z2;
        xdr xdrVar = this.b;
        if (cg6Var instanceof ujn) {
            ujnVar = (ujn) cg6Var;
            int i2 = ujnVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ujnVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ujnVar.k;
                nm6 nm6Var = nm6.a;
                i = ujnVar.m;
                int i3 = 2;
                if (i != 0) {
                    qgg.h0(obj);
                    z = false;
                    if (z) {
                    }
                } else if (i == 1) {
                    z2 = ujnVar.j;
                    qgg.h0(obj);
                    ujnVar.j = z2;
                    ujnVar.m = 2;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = ujnVar.j;
                    qgg.h0(obj);
                    z = z2;
                    if (z) {
                        ReentrantLock reentrantLock = this.a;
                        reentrantLock.lock();
                        try {
                            int intValue = ((Number) xdrVar.getValue()).intValue();
                            Continuation continuation = null;
                            if (intValue == 0) {
                                Integer num = new Integer(1);
                                xdrVar.getClass();
                                xdrVar.m(null, num);
                            } else if (intValue > 0) {
                                xdrVar.m(null, new Integer(((Number) xdrVar.getValue()).intValue() + 1));
                            } else {
                                z2 = false;
                                if (!z2) {
                                    dt0 dt0Var = new dt0(i3, 12, continuation);
                                    ujnVar.j = z2;
                                    ujnVar.m = 1;
                                }
                                z = z2;
                                if (z) {
                                    return Unit.a;
                                }
                            }
                            z2 = true;
                            if (!z2) {
                            }
                            z = z2;
                            if (z) {
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                }
            }
        }
        ujnVar = new ujn(this, cg6Var);
        Object obj2 = ujnVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ujnVar.m;
        int i32 = 2;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (defpackage.zsd.h0(r0, r10, r1) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (defpackage.a4g.T(r1) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:11:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0082 -> B:11:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        vjn vjnVar;
        int i;
        boolean z;
        boolean z2;
        xdr xdrVar = this.b;
        if (cg6Var instanceof vjn) {
            vjnVar = (vjn) cg6Var;
            int i2 = vjnVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vjnVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vjnVar.k;
                nm6 nm6Var = nm6.a;
                i = vjnVar.m;
                int i3 = 2;
                if (i != 0) {
                    qgg.h0(obj);
                    z = false;
                    if (!z) {
                    }
                } else if (i == 1) {
                    z2 = vjnVar.j;
                    qgg.h0(obj);
                    vjnVar.j = z2;
                    vjnVar.m = 2;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = vjnVar.j;
                    qgg.h0(obj);
                    z = z2;
                    if (!z) {
                        ReentrantLock reentrantLock = this.a;
                        reentrantLock.lock();
                        try {
                            Continuation continuation = null;
                            if (((Number) xdrVar.getValue()).intValue() == 0) {
                                Integer num = new Integer(-1);
                                xdrVar.getClass();
                                xdrVar.m(null, num);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                dt0 dt0Var = new dt0(i3, 13, continuation);
                                vjnVar.j = z2;
                                vjnVar.m = 1;
                            }
                            z = z2;
                            if (!z) {
                                return Unit.a;
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                }
            }
        }
        vjnVar = new vjn(this, cg6Var);
        Object obj2 = vjnVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vjnVar.m;
        int i32 = 2;
        if (i != 0) {
        }
    }
}
