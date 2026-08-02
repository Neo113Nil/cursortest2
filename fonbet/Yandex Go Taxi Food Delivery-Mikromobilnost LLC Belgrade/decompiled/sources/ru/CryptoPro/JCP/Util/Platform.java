package ru.CryptoPro.JCP.Util;

import java.io.PrintStream;
import java.security.Provider;
import java.security.Security;

/* loaded from: classes4.dex */
public class Platform {
    public static final String[] OS_PROPERTIES_LIST = {"os.arch", "os.name", "os.version"};
    public static final String[] JAVA_PROPERTIES_LIST = {"java.runtime.name", "java.vm.version", ru.CryptoPro.JCP.tools.Platform.STR_VM_VENDOR_PROPERTY, "java.vm.name"};
    public static final String[] LOCALE_PROPERTIES_LIST = {"user.country", "file.encoding", "user.language"};
    public static final String[] USER_PROPERTIES_LIST = {"user.name", "user.dir", "user.language"};

    public static void main(String[] strArr) throws Exception {
        printSeparator("System");
        printPropertiesList(OS_PROPERTIES_LIST);
        printSeparator("Java");
        printPropertiesList(JAVA_PROPERTIES_LIST);
        printSeparator("Locale");
        printPropertiesList(LOCALE_PROPERTIES_LIST);
        printSeparator("System properties");
        printSystemProperties();
        printSeparator("Providers");
        printProviders();
    }

    public static void printPropertiesList(String[] strArr) {
        for (String str : strArr) {
            try {
                System.out.getClass();
            } catch (Exception unused) {
                System.out.getClass();
                return;
            }
        }
    }

    public static void printProviders() {
        for (Provider provider : Security.getProviders()) {
            PrintStream printStream = System.out;
            provider.getName();
            printStream.getClass();
        }
    }

    public static void printSeparator(String str) {
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
    }

    public static void printSystemProperties() {
        try {
            GetProperties.main(null);
        } catch (Exception unused) {
            System.out.getClass();
        }
    }
}
