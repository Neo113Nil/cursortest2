package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tc8 implements u1f {
    public final szb a;
    public final szb b;
    public final szb c;
    public final szb d;
    public final szb e;
    public final szb f;
    public final sc8 g;
    public Integer h;

    public tc8(szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, sc8 sc8Var) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = szbVar4;
        this.e = szbVar5;
        this.f = szbVar6;
        this.g = sc8Var;
    }

    public final boolean a(tc8 tc8Var, xzb xzbVar, xzb xzbVar2) {
        if (tc8Var == null) {
            return false;
        }
        szb szbVar = this.a;
        String str = szbVar != null ? (String) szbVar.a(xzbVar) : null;
        szb szbVar2 = tc8Var.a;
        if (!Intrinsics.d(str, szbVar2 != null ? (String) szbVar2.a(xzbVar2) : null)) {
            return false;
        }
        szb szbVar3 = this.b;
        String str2 = szbVar3 != null ? (String) szbVar3.a(xzbVar) : null;
        szb szbVar4 = tc8Var.b;
        if (!Intrinsics.d(str2, szbVar4 != null ? (String) szbVar4.a(xzbVar2) : null)) {
            return false;
        }
        szb szbVar5 = this.c;
        Boolean bool = szbVar5 != null ? (Boolean) szbVar5.a(xzbVar) : null;
        szb szbVar6 = tc8Var.c;
        if (!Intrinsics.d(bool, szbVar6 != null ? (Boolean) szbVar6.a(xzbVar2) : null) || this.d.a(xzbVar) != tc8Var.d.a(xzbVar2) || ((Boolean) this.e.a(xzbVar)).booleanValue() != ((Boolean) tc8Var.e.a(xzbVar2)).booleanValue()) {
            return false;
        }
        szb szbVar7 = this.f;
        String str3 = szbVar7 != null ? (String) szbVar7.a(xzbVar) : null;
        szb szbVar8 = tc8Var.f;
        return Intrinsics.d(str3, szbVar8 != null ? (String) szbVar8.a(xzbVar2) : null) && this.g == tc8Var.g;
    }

    public final int b() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(tc8.class).hashCode();
        szb szbVar = this.a;
        int hashCode2 = hashCode + (szbVar != null ? szbVar.hashCode() : 0);
        szb szbVar2 = this.b;
        int hashCode3 = hashCode2 + (szbVar2 != null ? szbVar2.hashCode() : 0);
        szb szbVar3 = this.c;
        int hashCode4 = this.e.hashCode() + this.d.hashCode() + hashCode3 + (szbVar3 != null ? szbVar3.hashCode() : 0);
        szb szbVar4 = this.f;
        int hashCode5 = this.g.hashCode() + hashCode4 + (szbVar4 != null ? szbVar4.hashCode() : 0);
        this.h = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        vc8 vc8Var = (vc8) rj3.b.H.getValue();
        pt0 pt0Var = rj3.a;
        vc8Var.getClass();
        return vc8.c(pt0Var, this);
    }
}
