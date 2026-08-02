package defpackage;

import java.util.Iterator;

/* loaded from: classes7.dex */
public final class zw81 {
    public static String a(uc71 uc71Var) {
        Object obj;
        Iterator it = uc71Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((cj61) obj).a.equals("yandex_ad_info")) {
                break;
            }
        }
        cj61 cj61Var = (cj61) obj;
        if (cj61Var != null) {
            return cj61Var.b;
        }
        return null;
    }
}
