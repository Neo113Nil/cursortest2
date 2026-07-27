package P0;

import a.AbstractC0069a;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f906a = 0;

    static {
        Object f2;
        Object f3;
        Exception exc = new Exception();
        String simpleName = AbstractC0069a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            f2 = x0.b.class.getCanonicalName();
        } catch (Throwable th) {
            f2 = o.g.f(th);
        }
        if (t0.d.a(f2) != null) {
            f2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            f3 = w.class.getCanonicalName();
        } catch (Throwable th2) {
            f3 = o.g.f(th2);
        }
        if (t0.d.a(f3) != null) {
            f3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
