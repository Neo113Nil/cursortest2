package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lj9 implements u1f {
    public final szb a;
    public final kj9 b;
    public final ln9 c;
    public Integer d;

    public lj9(szb szbVar, kj9 kj9Var, ln9 ln9Var) {
        this.a = szbVar;
        this.b = kj9Var;
        this.c = ln9Var;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((mj9) rj3.b.h7.getValue()).b(rj3.a, this);
    }
}
