package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jre implements u1f {
    public final String a;
    public final szb b;
    public Integer c;

    public jre(szb szbVar, String str) {
        this.a = str;
        this.b = szbVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        kre kreVar = (kre) rj3.b.ma.getValue();
        pt0 pt0Var = rj3.a;
        kreVar.getClass();
        return kre.d(pt0Var, this);
    }
}
