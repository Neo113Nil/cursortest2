package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ly9 {
    public final Map a;
    public final ky9 b;

    public ly9(Map map, ky9 ky9Var) {
        this.a = map;
        this.b = ky9Var;
    }

    public final ky9 a(String str) {
        ky9 ky9Var;
        return (str == null || (ky9Var = (ky9) this.a.get(str)) == null) ? this.b : ky9Var;
    }
}
