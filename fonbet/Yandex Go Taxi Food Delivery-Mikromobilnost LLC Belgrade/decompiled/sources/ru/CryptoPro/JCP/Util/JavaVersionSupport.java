package ru.CryptoPro.JCP.Util;

import defpackage.dy31;

/* loaded from: classes4.dex */
public class JavaVersionSupport {
    private static final String UNSUPPORTED_JAVA_VERSION = "Unsupported Java version. Expected version: 8, version in use: ";

    public static void validateJavaVersion() {
        if (ru.CryptoPro.JCP.tools.Platform.isAndroid || System.getProperty("java.version").matches(".\\..*")) {
            return;
        }
        dy31.l(System.getProperty("java.version"), "Unsupported Java version. Expected version: 8, version in use: ");
    }
}
