package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class clp {
    public final ce5 a;
    public final blp b;

    public clp(ce5 ce5Var) {
        this.a = ce5Var;
        HashSet hashSet = new HashSet();
        hashSet.add(new alp(40010));
        String str = xgh.c.a;
        Bundle bundle = Bundle.EMPTY;
        hashSet.add(new alp(bundle, str));
        hashSet.add(new alp(bundle, xgh.d.a));
        hashSet.add(new alp(bundle, xgh.e.a));
        hashSet.add(new alp(bundle, xgh.f.a));
        hashSet.add(new alp(bundle, xgh.g.a));
        hashSet.add(new alp(bundle, xgh.h.a));
        this.b = new blp(hashSet);
    }
}
