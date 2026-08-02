package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public abstract class orn implements eqt {
    public final Pattern b;
    public final fyc c;

    public orn(Pattern pattern, fyc fycVar) {
        this.b = pattern;
        this.c = fycVar;
    }

    @Override // defpackage.eqt
    public final ou2 a(String str, boolean z) {
        eqt.a.getClass();
        HashSet hashSet = dqt.b;
        int indexOf = str.indexOf(58);
        ArrayList arrayList = null;
        if (!hashSet.contains(indexOf == -1 ? null : str.substring(0, indexOf))) {
            Assertions.fail("parse(): invalid uri: ".concat(str));
        }
        ou2 ou2Var = (ou2) this.c.call();
        ou2Var.b = str;
        HashMap hashMap = new HashMap();
        String[] split = str.split("\\?");
        if (split.length >= 2) {
            for (String str2 : split[1].split("&")) {
                String[] split2 = str2.split("=");
                if (split2.length > 0) {
                    String str3 = split2[0];
                    if (!str3.isEmpty()) {
                        if (split2.length > 1) {
                            hashMap.put(str3, split2[1]);
                        } else {
                            hashMap.put(str3, "");
                        }
                    }
                }
            }
        }
        ou2Var.d = hashMap;
        String str4 = str.split("\\?")[0];
        ou2Var.c = str4;
        Pattern pattern = this.b;
        Matcher matcher = pattern.matcher(str4);
        if (matcher.matches()) {
            arrayList = new ArrayList();
            for (int i = 0; i < matcher.groupCount() + 1; i++) {
                if (matcher.group(i) != null) {
                    arrayList.add(matcher.group(i));
                }
            }
        } else {
            Assertions.fail("parseArgs(): url doesn't match pattern; url = `" + pattern + "`");
        }
        ou2Var.e = arrayList;
        ou2Var.f = z;
        return ou2Var;
    }

    @Override // defpackage.eqt
    public final boolean b(String str) {
        return this.b.matcher(str.split("\\?")[0]).matches();
    }
}
