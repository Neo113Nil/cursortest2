package ru.CryptoPro.JCP.pref;

import defpackage.gly0;
import defpackage.k6e;
import defpackage.omy0;
import defpackage.w511;
import defpackage.wly0;
import java.io.PrintStream;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class ConsoleConfig {
    public static final ResourceBundle a = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
    public static final String[] b = {"help", "export", "import"};
    public static final k6e[] c = {new wly0(), new gly0(), new omy0()};

    public static JCPPref a(String[] strArr) {
        JCPPref jCPPref = new JCPPref(JCP.class);
        if (strArr.length == 0) {
            w511.s("Invalid argument");
            return null;
        }
        if (strArr[1].equalsIgnoreCase("sys")) {
            return jCPPref;
        }
        if (strArr[1].equalsIgnoreCase("user")) {
            return JCPPref.getUser(JCP.class);
        }
        w511.s("Invalid argument");
        return null;
    }

    public static void main(String[] strArr) {
        boolean z = false;
        boolean z2 = true;
        if (strArr.length > 0) {
            int i = 0;
            boolean z3 = false;
            boolean z4 = true;
            while (true) {
                String[] strArr2 = b;
                if (i >= strArr2.length || z3) {
                    break;
                }
                if (strArr[0].equals(strArr2[i])) {
                    try {
                        z4 = c[i].e(strArr);
                    } catch (Exception unused) {
                    }
                    z3 = true;
                }
                i++;
            }
            z = z3;
            z2 = z4;
        }
        if (z && z2) {
            return;
        }
        try {
            PrintStream printStream = System.out;
            a.getString("consoleConfig.Help");
            printStream.getClass();
        } catch (Exception unused2) {
        }
    }
}
