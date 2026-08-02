package defpackage;

import java.util.TreeMap;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class t6i0 {
    public final TreeMap a = new TreeMap();

    public final void a(d6w d6wVar) {
        int i = d6wVar.a;
        int i2 = d6wVar.b;
        TreeMap treeMap = this.a;
        int i3 = i2;
        int i4 = i;
        for (Pair pair : iw00.x(treeMap)) {
            int intValue = ((Number) pair.getFirst()).intValue();
            int intValue2 = ((Number) pair.getSecond()).intValue();
            if (intValue2 >= i && intValue <= i2) {
                treeMap.remove(Integer.valueOf(intValue));
                i4 = Math.min(i4, intValue);
                i3 = Math.max(i3, intValue2);
            }
        }
        treeMap.put(Integer.valueOf(i4), Integer.valueOf(i3));
    }
}
