package com.gamericefishpro.space.ui;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final /* synthetic */ int a = 0;

    static {
        Object objQ;
        Object objQ2;
        Exception exc = new Exception();
        String simpleName = com.gamericefishpro.space.a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            objQ = com.gamericefishpro.space.vh.a.class.getCanonicalName();
        } catch (Throwable th) {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            objQ = com.gamericefishpro.space.wa.b.q(th);
        }
        if (com.gamericefishpro.space.oh.p.a(objQ) != null) {
            objQ = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objQ2 = r.class.getCanonicalName();
        } catch (Throwable th2) {
            com.gamericefishpro.space.oh.n nVar3 = com.gamericefishpro.space.oh.p.d;
            objQ2 = com.gamericefishpro.space.wa.b.q(th2);
        }
        if (com.gamericefishpro.space.oh.p.a(objQ2) != null) {
            objQ2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
