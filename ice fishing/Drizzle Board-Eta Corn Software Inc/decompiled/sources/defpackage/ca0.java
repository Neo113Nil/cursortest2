package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ca0 extends e50 {
    public static String OxcuoDLp(String str) {
        if (ba0.WYNAV5pd("|")) {
            m1.sjUBp5pO("marginPrefix must be non-blank string.");
            return null;
        }
        List DK9slbsy = ba0.DK9slbsy(str);
        int length = str.length();
        DK9slbsy.size();
        int size = DK9slbsy.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : DK9slbsy) {
            int i2 = i + 1;
            if (i < 0) {
                y5.ZyZthT5G();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && ba0.WYNAV5pd(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!le0.U0LaHZX7(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        x5.pP9Y2m6O(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String sjUBp5pO(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        hp hpVar = new hp(str);
        int i = 0;
        while (hpVar.hasNext()) {
            String str2 = (String) hpVar.next();
            str2.getClass();
            if (!ba0.WYNAV5pd(str2)) {
                str2 = "    ".concat(str2);
            } else if (str2.length() < 4) {
                str2 = "    ";
            }
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            e50.qoPGr6Ce(sb, str2, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
