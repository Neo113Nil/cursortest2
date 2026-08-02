package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ch7 {
    public static final jpc c = new jpc(String.valueOf(','), 2);
    public static final ch7 d = new ch7(e3s.b, false, new ch7(new b3i(17), true, new ch7()));
    public final Map a;
    public final byte[] b;

    public ch7(nq4 nq4Var, boolean z, ch7 ch7Var) {
        String z2 = nq4Var.z();
        o2g.J("Comma is currently not allowed in message encoding", !z2.contains(StringUtils.COMMA));
        int size = ch7Var.a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ch7Var.a.containsKey(nq4Var.z()) ? size : size + 1);
        for (bh7 bh7Var : ch7Var.a.values()) {
            String z3 = bh7Var.a.z();
            if (!z3.equals(z2)) {
                linkedHashMap.put(z3, new bh7(bh7Var.a, bh7Var.b));
            }
        }
        linkedHashMap.put(z2, new bh7(nq4Var, z));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.a = unmodifiableMap;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((bh7) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.b = c.e(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public ch7() {
        this.a = new LinkedHashMap(0);
        this.b = new byte[0];
    }
}
