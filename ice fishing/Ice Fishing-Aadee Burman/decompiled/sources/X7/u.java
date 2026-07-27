package X7;

import a.AbstractC0422a;
import u7.AbstractC5091i;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3861a = 0;

    static {
        Object f3;
        Object f9;
        Exception exc = new Exception();
        String simpleName = AbstractC0422a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            f3 = B7.a.class.getCanonicalName();
        } catch (Throwable th) {
            f3 = com.bumptech.glide.d.f(th);
        }
        if (AbstractC5091i.a(f3) != null) {
            f3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            f9 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            f9 = com.bumptech.glide.d.f(th2);
        }
        if (AbstractC5091i.a(f9) != null) {
            f9 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
