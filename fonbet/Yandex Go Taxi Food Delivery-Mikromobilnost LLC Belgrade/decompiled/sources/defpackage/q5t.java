package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes10.dex */
public final class q5t {
    public final List a;

    public q5t(List list) {
        this.a = list;
        if (list.isEmpty()) {
            ny61.g("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List<e9f> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (e9f e9fVar : list2) {
                }
            }
            for (e9f e9fVar2 : this.a) {
            }
        }
    }
}
