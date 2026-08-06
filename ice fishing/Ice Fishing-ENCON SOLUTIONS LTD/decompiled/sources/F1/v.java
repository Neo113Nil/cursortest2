package F1;

import a.AbstractC0083a;
import h1.AbstractC0236f;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f632a = 0;

    static {
        Object h2;
        Object h3;
        Exception exc = new Exception();
        String simpleName = AbstractC0083a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            h2 = AbstractC0991b.class.getCanonicalName();
        } catch (Throwable th) {
            h2 = R1.l.h(th);
        }
        if (AbstractC0236f.a(h2) != null) {
            h2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            h3 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            h3 = R1.l.h(th2);
        }
        if (AbstractC0236f.a(h3) != null) {
            h3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
