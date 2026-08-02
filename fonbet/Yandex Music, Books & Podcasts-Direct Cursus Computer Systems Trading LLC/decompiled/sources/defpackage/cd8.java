package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cd8 implements u1f {
    public final String a;
    public final szb b;
    public final szb c;
    public final wx9 d;
    public final szb e;
    public final lu8 f;
    public final szb g;
    public final wx9 h;
    public Integer i;

    public cd8(String str, szb szbVar, szb szbVar2, wx9 wx9Var, szb szbVar3, lu8 lu8Var, szb szbVar4, wx9 wx9Var2) {
        this.a = str;
        this.b = szbVar;
        this.c = szbVar2;
        this.d = wx9Var;
        this.e = szbVar3;
        this.f = lu8Var;
        this.g = szbVar4;
        this.h = wx9Var2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((dd8) rj3.b.K.getValue()).b(rj3.a, this);
    }
}
