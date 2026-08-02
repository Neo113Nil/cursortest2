package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class p9t implements o9t {
    public final Set a;
    public final de2 b;
    public final t9t c;

    public p9t(Set set, de2 de2Var, t9t t9tVar) {
        this.a = set;
        this.b = de2Var;
        this.c = t9tVar;
    }

    public final n3m a(String str, p6b p6bVar, m7t m7tVar) {
        Set set = this.a;
        if (set.contains(p6bVar)) {
            return new n3m(this.b, str, p6bVar, m7tVar, this.c);
        }
        b6e.p("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{p6bVar, set});
        return null;
    }
}
