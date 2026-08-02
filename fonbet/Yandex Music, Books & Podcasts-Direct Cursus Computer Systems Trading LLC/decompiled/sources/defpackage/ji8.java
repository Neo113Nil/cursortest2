package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ji8 implements u1f {
    public final szb a;
    public final szb b;
    public final szb c;
    public final wx9 d;
    public Integer e;

    public ji8(szb szbVar, szb szbVar2, szb szbVar3, wx9 wx9Var) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = wx9Var;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ki8) rj3.b.P0.getValue()).b(rj3.a, this);
    }
}
