package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yk9 implements u1f {
    public final szb a;
    public final szb b;
    public final szb c;
    public final szb d;
    public final szb e;
    public final szb f;
    public final szb g;
    public final bf9 h;
    public final szb i;
    public Integer j;

    public yk9(szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7, bf9 bf9Var, szb szbVar8) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = szbVar4;
        this.e = szbVar5;
        this.f = szbVar6;
        this.g = szbVar7;
        this.h = bf9Var;
        this.i = szbVar8;
    }

    public final boolean a(yk9 yk9Var, xzb xzbVar, xzb xzbVar2) {
        if (yk9Var != null) {
            szb szbVar = this.a;
            String str = szbVar != null ? (String) szbVar.a(xzbVar) : null;
            szb szbVar2 = yk9Var.a;
            if (Intrinsics.d(str, szbVar2 != null ? (String) szbVar2.a(xzbVar2) : null) && ((Number) this.b.a(xzbVar)).longValue() == ((Number) yk9Var.b.a(xzbVar2)).longValue() && this.c.a(xzbVar) == yk9Var.c.a(xzbVar2)) {
                szb szbVar3 = this.d;
                JSONObject jSONObject = szbVar3 != null ? (JSONObject) szbVar3.a(xzbVar) : null;
                szb szbVar4 = yk9Var.d;
                if (Intrinsics.d(jSONObject, szbVar4 != null ? (JSONObject) szbVar4.a(xzbVar2) : null)) {
                    szb szbVar5 = this.e;
                    e09 e09Var = szbVar5 != null ? (e09) szbVar5.a(xzbVar) : null;
                    szb szbVar6 = yk9Var.e;
                    if (e09Var == (szbVar6 != null ? (e09) szbVar6.a(xzbVar2) : null)) {
                        szb szbVar7 = this.f;
                        Long l = szbVar7 != null ? (Long) szbVar7.a(xzbVar) : null;
                        szb szbVar8 = yk9Var.f;
                        if (Intrinsics.d(l, szbVar8 != null ? (Long) szbVar8.a(xzbVar2) : null) && ((Number) this.g.a(xzbVar)).doubleValue() == ((Number) yk9Var.g.a(xzbVar2)).doubleValue()) {
                            bf9 bf9Var = yk9Var.h;
                            bf9 bf9Var2 = this.h;
                            if ((bf9Var2 != null ? bf9Var2.a(bf9Var, xzbVar, xzbVar2) : bf9Var == null) && ((Number) this.i.a(xzbVar)).intValue() == ((Number) yk9Var.i.a(xzbVar2)).intValue()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.j;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(yk9.class).hashCode();
        szb szbVar = this.a;
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + (szbVar != null ? szbVar.hashCode() : 0);
        szb szbVar2 = this.d;
        int hashCode3 = hashCode2 + (szbVar2 != null ? szbVar2.hashCode() : 0);
        szb szbVar3 = this.e;
        int hashCode4 = hashCode3 + (szbVar3 != null ? szbVar3.hashCode() : 0);
        szb szbVar4 = this.f;
        int hashCode5 = this.g.hashCode() + hashCode4 + (szbVar4 != null ? szbVar4.hashCode() : 0);
        bf9 bf9Var = this.h;
        int hashCode6 = this.i.hashCode() + hashCode5 + (bf9Var != null ? bf9Var.b() : 0);
        this.j = Integer.valueOf(hashCode6);
        return hashCode6;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((tl9) rj3.b.z7.getValue()).b(rj3.a, this);
    }
}
