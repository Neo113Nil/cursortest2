package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public abstract class z001 {
    public static final Pattern a = Pattern.compile("([0-9]{1,19})D([0-9]{4})([0-9]{3})?(.*)");

    public static boolean a(rg7 rg7Var, byte[] bArr) {
        byte[] e = oqb1.e(bArr, txn.d, txn.s);
        if (e != null) {
            StringBuilder sb = new StringBuilder();
            for (byte b : e) {
                sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1)));
            }
            Matcher matcher = a.matcher(evu0.k0(sb.toString().toUpperCase(Locale.getDefault())).toString());
            if (matcher.find()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null && group2 != null) {
                    rg7Var.a = group;
                    rg7Var.b = group2.substring(2, 4);
                    rg7Var.c = group2.substring(0, 2);
                    return true;
                }
            }
        }
        return false;
    }
}
