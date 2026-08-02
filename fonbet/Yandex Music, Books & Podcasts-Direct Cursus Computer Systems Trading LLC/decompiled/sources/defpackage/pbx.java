package defpackage;

import java.io.Serializable;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pbx implements mbx {
    public static final wul e = new wul();
    public final /* synthetic */ int a;
    public Serializable b;
    public volatile Object c;
    public Object d;

    public pbx(int i, Class cls) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new n3x();
                this.d = cls.getName();
                break;
            default:
                this.d = new Object();
                this.b = cls.getName();
                break;
        }
    }

    public Logger a() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.d) {
            try {
                Logger logger2 = (Logger) this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r9.a(r1) == r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:26:0x005b, B:29:0x0060), top: B:25:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v10, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [aur, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v5, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(cg6 cg6Var) {
        mq4 mq4Var;
        int i;
        qqi qqiVar;
        int i2;
        ?? r0;
        Throwable th;
        Object obj;
        ogp ogpVar = ogp.l;
        try {
            if (cg6Var instanceof mq4) {
                mq4Var = (mq4) cg6Var;
                int i3 = mq4Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    mq4Var.n = i3 - Integer.MIN_VALUE;
                    Object obj2 = mq4Var.l;
                    nm6 nm6Var = nm6.a;
                    i = mq4Var.n;
                    if (i != 0) {
                        qgg.h0(obj2);
                        Object obj3 = this.c;
                        if (obj3 != ogpVar) {
                            return obj3;
                        }
                        qqiVar = (qqi) this.d;
                        mq4Var.j = qqiVar;
                        i2 = 0;
                        mq4Var.k = 0;
                        mq4Var.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r0 = mq4Var.j;
                            try {
                                qgg.h0(obj2);
                                r0 = r0;
                                this.c = obj2;
                                this.b = null;
                                obj = obj2;
                                qqiVar = r0;
                                qqiVar.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                r0.b(null);
                                throw th;
                            }
                        }
                        i2 = mq4Var.k;
                        ?? r5 = mq4Var.j;
                        qgg.h0(obj2);
                        qqiVar = r5;
                    }
                    obj = this.c;
                    if (obj == ogpVar) {
                        qqiVar.b(null);
                        return obj;
                    }
                    ?? r02 = (aur) this.b;
                    r02.getClass();
                    mq4Var.j = qqiVar;
                    mq4Var.k = i2;
                    mq4Var.n = 2;
                    Object invoke = r02.invoke(mq4Var);
                    if (invoke != nm6Var) {
                        r0 = qqiVar;
                        obj2 = invoke;
                        this.c = obj2;
                        this.b = null;
                        obj = obj2;
                        qqiVar = r0;
                        qqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            obj = this.c;
            if (obj == ogpVar) {
            }
        } catch (Throwable th3) {
            r0 = qqiVar;
            th = th3;
            r0.b(null);
            throw th;
        }
        mq4Var = new mq4(this, cg6Var);
        Object obj22 = mq4Var.l;
        nm6 nm6Var2 = nm6.a;
        i = mq4Var.n;
        if (i != 0) {
        }
    }

    public Logger c() {
        Logger logger;
        Logger logger2;
        switch (this.a) {
            case 3:
                Logger logger3 = (Logger) this.c;
                if (logger3 != null) {
                    return logger3;
                }
                synchronized (((n3x) this.b)) {
                    try {
                        logger = (Logger) this.c;
                        if (logger == null) {
                            logger = Logger.getLogger((String) this.d);
                            this.c = logger;
                        }
                    } finally {
                    }
                }
                return logger;
            default:
                Logger logger4 = (Logger) this.c;
                if (logger4 != null) {
                    return logger4;
                }
                synchronized (((n3x) this.b)) {
                    try {
                        logger2 = (Logger) this.c;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger((String) this.d);
                            this.c = logger2;
                        }
                    } finally {
                    }
                }
                return logger2;
        }
    }

    @Override // defpackage.mbx
    public Object d() {
        mbx mbxVar = (mbx) this.c;
        wul wulVar = e;
        if (mbxVar != wulVar) {
            synchronized (((n3x) this.b)) {
                try {
                    if (((mbx) this.c) != wulVar) {
                        Object d = ((mbx) this.c).d();
                        this.d = d;
                        this.c = wulVar;
                        return d;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Object obj = (mbx) this.c;
                if (obj == e) {
                    obj = hrg.q("<supplier that returned ", String.valueOf(this.d), ">");
                }
                return hrg.q("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    public pbx(t7l t7lVar) {
        this.a = 0;
        this.b = new n3x();
        this.c = t7lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pbx(Function1 function1) {
        this.a = 1;
        this.b = (aur) function1;
        this.c = ogp.l;
        this.d = rqi.a();
    }

    public pbx() {
        this.a = 4;
        this.b = new n3x();
        this.d = flx.class.getName();
    }
}
