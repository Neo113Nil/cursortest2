package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kk9 implements u1f {
    public final szb a;
    public final szb b;
    public Integer c;

    public kk9(szb szbVar, szb szbVar2) {
        this.a = szbVar;
        this.b = szbVar2;
    }

    public final boolean a(kk9 kk9Var, xzb xzbVar, xzb xzbVar2) {
        return kk9Var != null && this.a.a(xzbVar) == kk9Var.a.a(xzbVar2) && ((Number) this.b.a(xzbVar)).longValue() == ((Number) kk9Var.b.a(xzbVar2)).longValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + ern.a(kk9.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        lk9 lk9Var = (lk9) rj3.b.n7.getValue();
        pt0 pt0Var = rj3.a;
        lk9Var.getClass();
        return lk9.c(pt0Var, this);
    }
}
