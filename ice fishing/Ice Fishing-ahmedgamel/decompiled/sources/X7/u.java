package X7;

import a.AbstractC0426a;
import u7.AbstractC5083i;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3816a = 0;

    static {
        Object b9;
        Object b10;
        Exception exc = new Exception();
        String simpleName = AbstractC0426a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            b9 = B7.a.class.getCanonicalName();
        } catch (Throwable th) {
            b9 = Q3.b.b(th);
        }
        if (AbstractC5083i.a(b9) != null) {
            b9 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            b10 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            b10 = Q3.b.b(th2);
        }
        if (AbstractC5083i.a(b10) != null) {
            b10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
