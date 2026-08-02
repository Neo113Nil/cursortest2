package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class zcb {
    public static final LinkedHashMap b;
    public final int a;

    static {
        List g = scc.g(ucb.c, tcb.c, rcb.c, ycb.c, scb.c, vcb.c, wcb.c);
        int d = gw00.d(tcc.n(g, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : g) {
            linkedHashMap.put(Integer.valueOf(((zcb) obj).a), obj);
        }
        b = linkedHashMap;
    }

    public zcb(int i) {
        this.a = i;
    }
}
