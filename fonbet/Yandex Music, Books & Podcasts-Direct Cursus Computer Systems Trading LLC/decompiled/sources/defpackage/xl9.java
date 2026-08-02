package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xl9 implements u1f {
    public final szb a;
    public Integer b;

    public xl9(szb szbVar) {
        this.a = szbVar;
    }

    public final int a() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + ern.a(xl9.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        yl9 yl9Var = (yl9) rj3.b.F7.getValue();
        pt0 pt0Var = rj3.a;
        yl9Var.getClass();
        return yl9.d(pt0Var, this);
    }
}
