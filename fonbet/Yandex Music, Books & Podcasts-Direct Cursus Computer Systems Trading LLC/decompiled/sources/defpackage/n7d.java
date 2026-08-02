package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class n7d {
    public final List a;

    public n7d(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            xq0.x("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List<ms6> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (ms6 ms6Var : list2) {
                }
            }
            for (ms6 ms6Var2 : this.a) {
            }
        }
    }
}
