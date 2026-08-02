package ru.CryptoPro.JCP.tools;

import defpackage.b64;
import defpackage.bt61;
import defpackage.eq61;
import defpackage.g8e;
import defpackage.gr61;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class CPContainerQuestSet {
    public static final String HELP;

    static {
        StringBuilder v = b64.v("HELP\nrun: CPContainerQuestSet <option>\noptions:\n", "-allow", "     ", "always allow read container(security level will be lost)", "\n");
        g8e.D(v, "-forbid", Extension.TAB_CHAR, "always forbid read container", "\n");
        HELP = g8e.r(v, "-dialog", Extension.TAB_CHAR, "use the window dialog for this question", "\n\n");
    }

    public static boolean getFunc(String str, String[] strArr) {
        boolean z = false;
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                z = true;
            }
        }
        return z;
    }

    public static void main(String[] strArr) {
        if (getFunc("-forbid", strArr)) {
            setAlwaysForbid();
            JCPLogger.info("chosen option: ", "always forbid read container");
            System.exit(0);
        } else if (getFunc("-dialog", strArr)) {
            setWindowQuestion();
            JCPLogger.info("chosen option: ", "use the window dialog for this question");
            System.exit(0);
        } else {
            if (!getFunc("-allow", strArr)) {
                JCPLogger.info(HELP);
                return;
            }
            setAlwaysAllow();
            JCPLogger.info("chosen option: ", "always allow read container(security level will be lost)");
            System.exit(0);
        }
    }

    public static void setAlwaysAllow() {
        try {
            new gr61().set(gr61.class.getName());
        } catch (ConfigurationException unused) {
        }
    }

    public static void setAlwaysForbid() {
        try {
            new bt61().set(bt61.class.getName());
        } catch (ConfigurationException unused) {
        }
    }

    public static void setWindowQuestion() {
        try {
            new eq61().set(eq61.class.getName());
        } catch (ConfigurationException unused) {
        }
    }
}
