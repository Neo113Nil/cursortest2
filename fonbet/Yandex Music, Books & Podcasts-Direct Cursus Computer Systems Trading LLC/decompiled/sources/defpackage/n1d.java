package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n1d {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = dvt.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(u2i u2iVar) {
        int i = 0;
        while (true) {
            n2i[] n2iVarArr = u2iVar.a;
            if (i >= n2iVarArr.length) {
                return;
            }
            n2i n2iVar = n2iVarArr[i];
            if (n2iVar instanceof ub5) {
                ub5 ub5Var = (ub5) n2iVar;
                if ("iTunSMPB".equals(ub5Var.c) && a(ub5Var.d)) {
                    return;
                }
            } else if (n2iVar instanceof lue) {
                lue lueVar = (lue) n2iVar;
                if ("com.apple.iTunes".equals(lueVar.b) && "iTunSMPB".equals(lueVar.c) && a(lueVar.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
