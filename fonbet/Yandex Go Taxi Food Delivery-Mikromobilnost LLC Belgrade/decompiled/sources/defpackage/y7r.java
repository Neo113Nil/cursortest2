package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class y7r {
    public static int a(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            uhx0 uhx0Var = (uhx0) it.next();
            if ((uhx0Var instanceof kij0) || (uhx0Var instanceof ikt)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
