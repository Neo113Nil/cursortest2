package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cm9 implements u1f {
    public final sm8 a;
    public final sm8 b;
    public final jc8 c;
    public final String d;
    public final List e;
    public Integer f;

    public cm9(sm8 sm8Var, sm8 sm8Var2, jc8 jc8Var, String str, List list) {
        this.a = sm8Var;
        this.b = sm8Var2;
        this.c = jc8Var;
        this.d = str;
        this.e = list;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((qm9) rj3.b.L7.getValue()).b(rj3.a, this);
    }
}
