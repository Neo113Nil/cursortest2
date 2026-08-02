package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tq9 implements u1f {
    public final rq9 a;
    public final szb b;
    public final jz8 c;
    public final szb d;
    public final szb e;
    public final szb f;
    public final szb g;
    public final szb h;
    public final szb i;
    public final jz8 j;
    public Integer k;

    public tq9(rq9 rq9Var, szb szbVar, jz8 jz8Var, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7, jz8 jz8Var2) {
        this.a = rq9Var;
        this.b = szbVar;
        this.c = jz8Var;
        this.d = szbVar2;
        this.e = szbVar3;
        this.f = szbVar4;
        this.g = szbVar5;
        this.h = szbVar6;
        this.i = szbVar7;
        this.j = jz8Var2;
    }

    public final boolean a(tq9 tq9Var, xzb xzbVar, xzb xzbVar2) {
        if (tq9Var == null) {
            return false;
        }
        rq9 rq9Var = tq9Var.a;
        rq9 rq9Var2 = this.a;
        if (rq9Var2 != null) {
            if (rq9Var == null) {
                return false;
            }
            szb szbVar = rq9Var2.a;
            String str = szbVar != null ? (String) szbVar.a(xzbVar) : null;
            szb szbVar2 = rq9Var.a;
            if (!Intrinsics.d(str, szbVar2 != null ? (String) szbVar2.a(xzbVar2) : null) || rq9Var2.b != rq9Var.b) {
                return false;
            }
        } else if (rq9Var != null) {
            return false;
        }
        if (this.b.a(xzbVar) != tq9Var.b.a(xzbVar2) || !this.c.a(tq9Var.c, xzbVar, xzbVar2) || this.d.a(xzbVar) != tq9Var.d.a(xzbVar2) || ((Boolean) this.e.a(xzbVar)).booleanValue() != ((Boolean) tq9Var.e.a(xzbVar2)).booleanValue() || ((Number) this.f.a(xzbVar)).longValue() != ((Number) tq9Var.f.a(xzbVar2)).longValue()) {
            return false;
        }
        szb szbVar3 = this.g;
        Integer num = szbVar3 != null ? (Integer) szbVar3.a(xzbVar) : null;
        szb szbVar4 = tq9Var.g;
        return Intrinsics.d(num, szbVar4 != null ? (Integer) szbVar4.a(xzbVar2) : null) && this.h.a(xzbVar) == tq9Var.h.a(xzbVar2) && Intrinsics.d(this.i.a(xzbVar), tq9Var.i.a(xzbVar2)) && this.j.a(tq9Var.j, xzbVar, xzbVar2);
    }

    public final int b() {
        int i;
        Integer num = this.k;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(tq9.class).hashCode();
        rq9 rq9Var = this.a;
        if (rq9Var != null) {
            Integer num2 = rq9Var.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = ern.a(rq9.class).hashCode();
                szb szbVar = rq9Var.a;
                int hashCode3 = hashCode2 + (szbVar != null ? szbVar.hashCode() : 0) + rq9Var.b.hashCode();
                rq9Var.c = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        } else {
            i = 0;
        }
        int hashCode4 = this.f.hashCode() + this.e.hashCode() + this.d.hashCode() + this.c.b() + this.b.hashCode() + hashCode + i;
        szb szbVar2 = this.g;
        int b = this.j.b() + this.i.hashCode() + this.h.hashCode() + hashCode4 + (szbVar2 != null ? szbVar2.hashCode() : 0);
        this.k = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((tr9) rj3.b.S8.getValue()).b(rj3.a, this);
    }
}
