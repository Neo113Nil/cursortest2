package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class ri {
    public static String ThreeDS2Service(Throwable th, Class cls) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (th != null) {
            if (!z) {
                sb.append("; caused by: ");
            }
            sb.append(th);
            sb.append(" at ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (stackTraceElement.getClassName().equals(cls.getName())) {
                        sb.append("...omitted...");
                        break;
                    }
                    sb.append(stackTraceElement);
                    sb.append("; ");
                    i++;
                }
            }
            th = th.getCause();
            z = false;
        }
        return sb.toString();
    }

    public static String ThreeDS2Service(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th);
        while (th.getCause() != null) {
            th = th.getCause();
            sb.append("; caused by: ");
            sb.append(th);
        }
        return sb.toString();
    }
}
