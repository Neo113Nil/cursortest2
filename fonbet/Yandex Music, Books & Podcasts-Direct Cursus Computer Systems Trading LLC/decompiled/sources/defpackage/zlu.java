package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes4.dex */
public abstract class zlu {
    public static final long a;
    public static final ylu b;
    public static final ylu c;
    public static final agr d;

    static {
        long j = d85.f;
        long b2 = d85.b(j, 0.15f, 0.0f, 0.0f, 0.0f, 14);
        a = b2;
        d85 d85Var = new d85(b2);
        Float valueOf = Float.valueOf(0.0f);
        Pair pair = new Pair(d85Var, valueOf);
        d85 d85Var2 = new d85(ixf.G(b2));
        Float valueOf2 = Float.valueOf(40.0f);
        List h = u75.h(pair, new Pair(d85Var2, valueOf2), new Pair(new d85(b2), valueOf2));
        List h2 = u75.h(new Pair(new d85(b2), valueOf), new Pair(new d85(d85.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14)), valueOf2), new Pair(new d85(b2), valueOf2));
        Pair[] pairArr = (Pair[]) h.toArray(new Pair[0]);
        afn q = sk3.q(fgq.u((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        long b3 = d85.b(j, 0.8f, 0.0f, 0.0f, 0.0f, 14);
        long b4 = d85.b(j, 0.72f, 0.0f, 0.0f, 0.0f, 14);
        b = new ylu(b2, q, j, b3, b4);
        Pair[] pairArr2 = (Pair[]) h2.toArray(new Pair[0]);
        c = new ylu(b2, sk3.q(fgq.u((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length))), j, b3, b4);
        d = new agr(new hft(26));
    }
}
