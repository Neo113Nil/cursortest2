package defpackage;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class e6k extends p1g {
    public final String a;
    public final pj3 b;

    public e6k(String str) {
        pj3 pj3Var = pj3.b;
        Objects.requireNonNull(str, "name == null");
        this.a = str;
        this.b = pj3Var;
    }

    @Override // defpackage.p1g
    public final void y(j0o j0oVar, Object obj) {
        if (obj == null) {
            return;
        }
        this.b.getClass();
        String obj2 = obj.toString();
        if (obj2 == null) {
            return;
        }
        j0oVar.b(this.a, obj2);
    }
}
