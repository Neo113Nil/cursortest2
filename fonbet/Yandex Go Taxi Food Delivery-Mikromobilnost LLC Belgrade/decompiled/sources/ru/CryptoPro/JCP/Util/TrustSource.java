package ru.CryptoPro.JCP.Util;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.JarChecker;

/* loaded from: classes4.dex */
public class TrustSource {
    private static final String ALLOWED_TRUSTED_SOURCE;
    public static final TrustSourceData TRUSTED;

    public static class TrustSourceData {
        public final boolean isTrusted;
        public final String logData;

        public TrustSourceData(boolean z, String str) {
            this.isTrusted = z;
            this.logData = str;
        }
    }

    static {
        String stringProperty = GetProperty.getStringProperty("trusted_source", null);
        ALLOWED_TRUSTED_SOURCE = stringProperty;
        JCPLogger.finer("Allowed trusted source: " + stringProperty);
        TRUSTED = new TrustSourceData(true, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
    
        r1.append(" <---\n");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TrustSourceData isTrusted(boolean z) {
        String methodName;
        String className;
        Class<?> cls;
        String str;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = false;
        for (int i = 0; i < stackTrace.length; i++) {
            try {
                methodName = stackTrace[i].getMethodName();
                className = stackTrace[i].getClassName();
                cls = Class.forName(className);
                if (z) {
                    stringBuffer.append("[");
                    stringBuffer.append(i);
                    stringBuffer.append("]");
                    stringBuffer.append(" class: ");
                    stringBuffer.append(className);
                    stringBuffer.append(", method: ");
                    stringBuffer.append(methodName);
                    stringBuffer.append(" (file: ");
                    stringBuffer.append(stackTrace[i].getFileName());
                    stringBuffer.append(", line: ");
                    stringBuffer.append(stackTrace[i].getLineNumber());
                    stringBuffer.append(Extension.C_BRAKE);
                }
            } catch (ClassNotFoundException unused) {
            }
            if ((!methodName.equalsIgnoreCase("<init>") || !Certificate.class.isAssignableFrom(cls)) && !X509Certificate.class.isAssignableFrom(cls) && ((!methodName.equalsIgnoreCase("createPublicKey") || !JarChecker.class.isAssignableFrom(cls)) && ((str = ALLOWED_TRUSTED_SOURCE) == null || (!str.contains(className) && !str.contains(methodName))))) {
                if (z) {
                    stringBuffer.append("\n");
                }
            }
            z2 = true;
        }
        return new TrustSourceData(z2, stringBuffer.toString());
    }
}
