package u1;

import f0.C0141f;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class v extends h0.f {
    public static LinkedHashSet E(Set set, C0141f c0141f) {
        D1.i.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(s.E(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c0141f);
        return linkedHashSet;
    }
}
