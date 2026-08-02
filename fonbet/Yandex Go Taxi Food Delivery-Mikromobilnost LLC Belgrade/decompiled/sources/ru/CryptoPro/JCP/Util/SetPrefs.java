package ru.CryptoPro.JCP.Util;

import defpackage.b64;
import defpackage.oyr;
import java.text.MessageFormat;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import ru.CryptoPro.JCP.tools.CPVerify.Prompt;

/* loaded from: classes4.dex */
public final class SetPrefs {
    private static final String HELP;
    private static final String STR_HELP;
    private static final String SYS_HELP;
    private static final String USER_HELP;
    private static final String ent = "\n";
    private static final String[] help = {Prompt.ACTION_HELP_STR, "-hel", "-he", "-h", "?"};
    private static final String[] key;
    private static final String[] node;
    private static final String[] system;
    private static final String[] user;
    private static final String[] value;

    static {
        String[] strArr = {"-node", "-nod", "-no", "-n"};
        node = strArr;
        String[] strArr2 = {"-user", "-use", "-us", "-u"};
        user = strArr2;
        String[] strArr3 = {"-system", "-syste", "-syst", "-sys", "-sy", "-s"};
        system = strArr3;
        String[] strArr4 = {"-key", "-ke", "-k"};
        key = strArr4;
        String[] strArr5 = {"-value", "-valu", "-val", "-va", "-v"};
        value = strArr5;
        StringBuilder sb = new StringBuilder("setPref {0} preferences: \n");
        sb.append(strArr[0]);
        sb.append(" node ");
        sb.append(strArr4[0]);
        sb.append(" key ");
        String t = oyr.t(sb, strArr5[0], " value {1}");
        STR_HELP = t;
        String format = new MessageFormat(t).format(new String[]{"user", strArr2[0]});
        USER_HELP = format;
        String format2 = new MessageFormat(t).format(new String[]{"system", strArr3[0]});
        SYS_HELP = format2;
        HELP = b64.l("HELP\n", format2, "\n", format);
    }

    private SetPrefs() {
    }

    public static boolean getFunc(String[] strArr, String[] strArr2) {
        for (String str : strArr2) {
            for (String str2 : strArr) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getValue(String[] strArr, String[] strArr2, String str) {
        String str2 = null;
        for (int i = 0; i < strArr2.length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                }
                if (strArr2[i].equalsIgnoreCase(strArr[i2])) {
                    int i3 = i + 1;
                    if (!"-".equals(strArr2[i3].substring(0, 1))) {
                        str2 = strArr2[i3];
                        break;
                    }
                }
                i2++;
            }
        }
        return str2 == null ? str : str2;
    }

    public static void main(String[] strArr) throws BackingStoreException {
        if (strArr.length != 0 && getFunc(user, strArr)) {
            setPref(strArr, true);
        } else if (strArr.length == 0 || !getFunc(system, strArr)) {
            System.out.getClass();
        } else {
            setPref(strArr, false);
        }
    }

    private static void setPref(String[] strArr, boolean z) throws BackingStoreException {
        if (getFunc(help, strArr)) {
            System.out.getClass();
            return;
        }
        String value2 = getValue(node, strArr, null);
        String value3 = getValue(key, strArr, null);
        String value4 = getValue(value, strArr, null);
        if (value2 == null || value3 == null || value4 == null) {
            return;
        }
        Preferences node2 = (z ? Preferences.userRoot() : Preferences.systemRoot()).node(value2);
        String str = node2.get(value3, null);
        if (str == null || !str.equals(value4)) {
            node2.put(value3, value4);
            node2.flush();
        }
    }
}
