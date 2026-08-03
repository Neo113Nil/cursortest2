package dd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1885a = 0;

    static {
        Object s10;
        Object s11;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            s10 = hc.a.class.getCanonicalName();
        } catch (Throwable th) {
            s10 = v6.a.s(th);
        }
        if (ac.l.a(s10) != null) {
            s10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            s11 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            s11 = v6.a.s(th2);
        }
        if (ac.l.a(s11) != null) {
            s11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
