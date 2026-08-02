package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes9.dex */
public class xcc extends wcc {
    public static void p(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void q(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
