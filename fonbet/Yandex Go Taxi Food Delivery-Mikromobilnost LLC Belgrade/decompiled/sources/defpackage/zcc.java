package defpackage;

import java.util.List;

/* loaded from: classes9.dex */
public class zcc extends ycc {
    public static final int B(int i, List list) {
        if (i >= 0 && i <= scc.f(list)) {
            return scc.f(list) - i;
        }
        StringBuilder t = b64.t(i, "Element index ", " must be in range [");
        t.append(new d6w(0, scc.f(list), 1));
        t.append("].");
        throw new IndexOutOfBoundsException(t.toString());
    }

    public static final int C(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder t = b64.t(i, "Position index ", " must be in range [");
        t.append(new d6w(0, list.size(), 1));
        t.append("].");
        throw new IndexOutOfBoundsException(t.toString());
    }
}
