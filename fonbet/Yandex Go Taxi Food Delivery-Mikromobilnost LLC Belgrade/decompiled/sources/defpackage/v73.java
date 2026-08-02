package defpackage;

/* loaded from: classes10.dex */
public final class v73 {
    public static void a() {
        Exception exc = new Exception();
        String simpleName = vf61.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
