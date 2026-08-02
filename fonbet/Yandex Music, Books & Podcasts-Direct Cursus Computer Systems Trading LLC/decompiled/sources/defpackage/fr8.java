package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fr8 implements u1f {
    public final szb a;
    public final szb b;
    public final ix8 c;
    public Integer d;

    public fr8(szb szbVar, szb szbVar2, ix8 ix8Var) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = ix8Var;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((gr8) rj3.b.j2.getValue()).b(rj3.a, this);
    }
}
