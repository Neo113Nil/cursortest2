package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w9k implements r6t, nin {
    public final ezc a;
    public final xjo b;
    public final AtomicInteger c;
    public q6t d;

    /* JADX WARN: Multi-variable type inference failed */
    public w9k(Function2 function2, xjo xjoVar) {
        xjoVar.getClass();
        this.a = (ezc) function2;
        this.b = xjoVar;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ezc, kotlin.jvm.functions.Function2] */
    @Override // defpackage.r6t
    public final Object a(q6t q6tVar, Function2 function2, aur aurVar) {
        Object invoke = this.a.invoke(new aa0(this, q6tVar, function2, (Continuation) null), aurVar);
        nm6 nm6Var = nm6.a;
        return invoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v5, types: [ezc, kotlin.jvm.functions.Function2] */
    @Override // defpackage.tgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Function1 function1, cg6 cg6Var) {
        v9k v9kVar;
        Object obj;
        int i;
        if (cg6Var instanceof v9k) {
            v9kVar = (v9k) cg6Var;
            int i2 = v9kVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v9kVar.n = i2 - Integer.MIN_VALUE;
                obj = v9kVar.l;
                Object obj2 = nm6.a;
                i = v9kVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    v9kVar.j = str;
                    v9kVar.k = function1;
                    v9kVar.n = 1;
                    obj = c(v9kVar);
                    if (obj == obj2) {
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = v9kVar.k;
                    str = v9kVar.j;
                    qgg.h0(obj);
                }
                String str2 = str;
                Function1 function12 = function1;
                Continuation continuation = null;
                if (!((Boolean) obj).booleanValue()) {
                    jw jwVar = new jw(this, str2, function12, continuation, 2);
                    v9kVar.j = null;
                    v9kVar.k = null;
                    v9kVar.n = 2;
                    Object invoke = this.a.invoke(jwVar, v9kVar);
                    return invoke == obj2 ? obj2 : invoke;
                }
                cko D0 = this.b.D0(str2);
                try {
                    Object invoke2 = function12.invoke(D0);
                    i4w.w(D0, null);
                    return invoke2;
                } finally {
                }
            }
        }
        v9kVar = new v9k(this, cg6Var);
        obj = v9kVar.l;
        Object obj22 = nm6.a;
        i = v9kVar.n;
        if (i != 0) {
        }
        String str22 = str;
        Function1 function122 = function1;
        Continuation continuation2 = null;
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.r6t
    public final Boolean c(Continuation continuation) {
        return Boolean.valueOf(this.d != null || this.b.inTransaction());
    }

    @Override // defpackage.nin
    public final xjo d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(q6t q6tVar, Function2 function2, cg6 cg6Var) {
        u9k u9kVar;
        int i;
        AtomicInteger atomicInteger;
        int i2;
        xjo xjoVar;
        try {
            if (cg6Var instanceof u9k) {
                u9kVar = (u9k) cg6Var;
                int i3 = u9kVar.m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    u9kVar.m = i3 - Integer.MIN_VALUE;
                    Object obj = u9kVar.k;
                    Object obj2 = nm6.a;
                    i = u9kVar.m;
                    atomicInteger = this.c;
                    i2 = 1;
                    xjoVar = this.b;
                    if (i != 0) {
                        qgg.h0(obj);
                        int ordinal = q6tVar.ordinal();
                        if (ordinal == 0) {
                            p6g.s(xjoVar, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            p6g.s(xjoVar, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            p6g.s(xjoVar, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (atomicInteger.incrementAndGet() > 0) {
                            this.d = q6tVar;
                        }
                        Object t9kVar = new t9k(0, this);
                        u9kVar.j = 1;
                        u9kVar.m = 1;
                        obj = function2.invoke(t9kVar, u9kVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = u9kVar.j;
                        qgg.h0(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    if (i2 == 0) {
                        p6g.s(xjoVar, "END TRANSACTION");
                        return obj;
                    }
                    p6g.s(xjoVar, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i != 0) {
            }
            if (atomicInteger.decrementAndGet() == 0) {
            }
            if (i2 == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    p6g.s(xjoVar, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    fob.a(th, e);
                }
                throw th2;
            }
        }
        u9kVar = new u9k(this, cg6Var);
        Object obj3 = u9kVar.k;
        Object obj22 = nm6.a;
        i = u9kVar.m;
        atomicInteger = this.c;
        i2 = 1;
        xjoVar = this.b;
    }
}
