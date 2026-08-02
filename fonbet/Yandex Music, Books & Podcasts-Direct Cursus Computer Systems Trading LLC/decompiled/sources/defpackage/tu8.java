package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tu8 implements u1f, w59 {
    public final szb a;
    public final String b;
    public Integer c;

    public tu8(szb szbVar, String str) {
        this.a = szbVar;
        this.b = str;
    }

    @Override // defpackage.w59
    public final String a() {
        return this.b;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        uu8 uu8Var = (uu8) rj3.b.H2.getValue();
        pt0 pt0Var = rj3.a;
        uu8Var.getClass();
        return uu8.d(pt0Var, this);
    }
}
