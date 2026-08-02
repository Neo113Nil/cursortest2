package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jz8 implements u1f {
    public static final ozb d = new ozb(jk9.DP);
    public final szb a;
    public final szb b;
    public Integer c;

    public jz8(szb szbVar, szb szbVar2) {
        this.a = szbVar;
        this.b = szbVar2;
    }

    public final boolean a(jz8 jz8Var, xzb xzbVar, xzb xzbVar2) {
        return jz8Var != null && this.a.a(xzbVar) == jz8Var.a.a(xzbVar2) && ((Number) this.b.a(xzbVar)).longValue() == ((Number) jz8Var.b.a(xzbVar2)).longValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + ern.a(jz8.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        kz8 kz8Var = (kz8) rj3.b.F3.getValue();
        pt0 pt0Var = rj3.a;
        kz8Var.getClass();
        return kz8.d(pt0Var, this);
    }

    public /* synthetic */ jz8(ozb ozbVar) {
        this(d, ozbVar);
    }
}
