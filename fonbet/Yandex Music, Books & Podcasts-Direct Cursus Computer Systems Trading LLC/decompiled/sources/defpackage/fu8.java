package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fu8 implements u1f {
    public final szb a;
    public final szb b;
    public final szb c;
    public final szb d;
    public Integer e;

    public fu8(szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = szbVar4;
    }

    public final boolean a(fu8 fu8Var, xzb xzbVar, xzb xzbVar2) {
        if (fu8Var == null) {
            return false;
        }
        szb szbVar = this.a;
        Long l = szbVar != null ? (Long) szbVar.a(xzbVar) : null;
        szb szbVar2 = fu8Var.a;
        if (!Intrinsics.d(l, szbVar2 != null ? (Long) szbVar2.a(xzbVar2) : null)) {
            return false;
        }
        szb szbVar3 = this.b;
        Long l2 = szbVar3 != null ? (Long) szbVar3.a(xzbVar) : null;
        szb szbVar4 = fu8Var.b;
        if (!Intrinsics.d(l2, szbVar4 != null ? (Long) szbVar4.a(xzbVar2) : null)) {
            return false;
        }
        szb szbVar5 = this.c;
        Long l3 = szbVar5 != null ? (Long) szbVar5.a(xzbVar) : null;
        szb szbVar6 = fu8Var.c;
        if (!Intrinsics.d(l3, szbVar6 != null ? (Long) szbVar6.a(xzbVar2) : null)) {
            return false;
        }
        szb szbVar7 = this.d;
        Long l4 = szbVar7 != null ? (Long) szbVar7.a(xzbVar) : null;
        szb szbVar8 = fu8Var.d;
        return Intrinsics.d(l4, szbVar8 != null ? (Long) szbVar8.a(xzbVar2) : null);
    }

    public final int b() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(fu8.class).hashCode();
        szb szbVar = this.a;
        int hashCode2 = hashCode + (szbVar != null ? szbVar.hashCode() : 0);
        szb szbVar2 = this.b;
        int hashCode3 = hashCode2 + (szbVar2 != null ? szbVar2.hashCode() : 0);
        szb szbVar3 = this.c;
        int hashCode4 = hashCode3 + (szbVar3 != null ? szbVar3.hashCode() : 0);
        szb szbVar4 = this.d;
        int hashCode5 = hashCode4 + (szbVar4 != null ? szbVar4.hashCode() : 0);
        this.e = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        gu8 gu8Var = (gu8) rj3.b.B2.getValue();
        pt0 pt0Var = rj3.a;
        gu8Var.getClass();
        return gu8.c(pt0Var, this);
    }
}
