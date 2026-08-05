package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class p60 extends g50 {
    public static LinkedHashSet OxcuoDLp(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(zq.ESscZ9M1(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static LinkedHashSet sjUBp5pO(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(zq.ESscZ9M1(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && fn.qoPGr6Ce(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }
}
