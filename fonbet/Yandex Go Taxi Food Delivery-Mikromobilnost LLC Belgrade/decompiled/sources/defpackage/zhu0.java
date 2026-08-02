package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.sdk.common.StopWordRule$RuleType;

/* loaded from: classes5.dex */
public final class zhu0 {
    public static boolean a(String str, List list) {
        List Y = evu0.Y(b64.k("[0-9]", b64.k("\\p{Punct}", str, ""), "").toLowerCase(Locale.ROOT), new char[]{HexString.CHAR_SPACE}, 0, 6);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xhu0 xhu0Var = (xhu0) it.next();
            StopWordRule$RuleType stopWordRule$RuleType = xhu0Var.a;
            String str2 = xhu0Var.b;
            int i = yhu0.a[stopWordRule$RuleType.ordinal()];
            if (i == 1) {
                List list2 = Y;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (cvu0.x((String) it2.next(), str2.toLowerCase(Locale.ROOT), false)) {
                            return true;
                        }
                    }
                }
            } else if (i == 2) {
                Locale locale = Locale.ROOT;
                if (evu0.y(str.toLowerCase(locale), str2.toLowerCase(locale), false)) {
                    return true;
                }
            } else {
                if (i != 3) {
                    w511.b();
                    return false;
                }
                if (Y.contains(str2.toLowerCase(Locale.ROOT))) {
                    return true;
                }
            }
        }
        return false;
    }
}
