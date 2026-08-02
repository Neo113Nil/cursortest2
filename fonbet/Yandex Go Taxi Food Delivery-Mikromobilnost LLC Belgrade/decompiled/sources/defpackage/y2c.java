package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y2c {
    public final Set a;
    public final Set b;
    public final Map c;
    public final String d;
    public final String e;
    public final hbs0 f;
    public Integer g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public y2c(Set set, w53 w53Var, String str, String str2, hbs0 hbs0Var) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        w53 w53Var2 = w53Var == null ? Collections.EMPTY_MAP : w53Var;
        this.c = w53Var2;
        this.d = str;
        this.e = str2;
        this.f = hbs0Var == null ? hbs0.a : hbs0Var;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = w53Var2.values().iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        this.b = Collections.unmodifiableSet(hashSet);
    }
}
