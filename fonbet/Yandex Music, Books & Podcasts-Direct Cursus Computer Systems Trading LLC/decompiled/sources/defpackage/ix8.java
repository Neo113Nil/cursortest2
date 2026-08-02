package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ix8 implements u1f {
    public static final ozb i;
    public final szb a;
    public final szb b;
    public final szb c;
    public final szb d;
    public final szb e;
    public final szb f;
    public final szb g;
    public Integer h;

    static {
        e3s.L(0L);
        e3s.L(0L);
        e3s.L(0L);
        e3s.L(0L);
        i = e3s.L(jk9.DP);
    }

    public ix8(szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = szbVar4;
        this.e = szbVar5;
        this.f = szbVar6;
        this.g = szbVar7;
    }

    public final boolean a(ix8 ix8Var, xzb xzbVar, xzb xzbVar2) {
        if (ix8Var == null || ((Number) this.a.a(xzbVar)).longValue() != ((Number) ix8Var.a.a(xzbVar2)).longValue()) {
            return false;
        }
        szb szbVar = this.b;
        Long l = szbVar != null ? (Long) szbVar.a(xzbVar) : null;
        szb szbVar2 = ix8Var.b;
        if (!Intrinsics.d(l, szbVar2 != null ? (Long) szbVar2.a(xzbVar2) : null) || ((Number) this.c.a(xzbVar)).longValue() != ((Number) ix8Var.c.a(xzbVar2)).longValue() || ((Number) this.d.a(xzbVar)).longValue() != ((Number) ix8Var.d.a(xzbVar2)).longValue()) {
            return false;
        }
        szb szbVar3 = this.e;
        Long l2 = szbVar3 != null ? (Long) szbVar3.a(xzbVar) : null;
        szb szbVar4 = ix8Var.e;
        return Intrinsics.d(l2, szbVar4 != null ? (Long) szbVar4.a(xzbVar2) : null) && ((Number) this.f.a(xzbVar)).longValue() == ((Number) ix8Var.f.a(xzbVar2)).longValue() && this.g.a(xzbVar) == ix8Var.g.a(xzbVar2);
    }

    public final int b() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + ern.a(ix8.class).hashCode();
        szb szbVar = this.b;
        int hashCode2 = this.d.hashCode() + this.c.hashCode() + hashCode + (szbVar != null ? szbVar.hashCode() : 0);
        szb szbVar2 = this.e;
        int hashCode3 = this.g.hashCode() + this.f.hashCode() + hashCode2 + (szbVar2 != null ? szbVar2.hashCode() : 0);
        this.h = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        jx8 jx8Var = (jx8) rj3.b.h3.getValue();
        pt0 pt0Var = rj3.a;
        jx8Var.getClass();
        return jx8.c(pt0Var, this);
    }

    public /* synthetic */ ix8(ozb ozbVar, ozb ozbVar2, ozb ozbVar3, ozb ozbVar4) {
        this(ozbVar, null, ozbVar2, ozbVar3, null, ozbVar4, i);
    }
}
