package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qv9 implements u1f {
    public final xd9 a;
    public final xd9 b;
    public final szb c;
    public Integer d;

    public qv9(xd9 xd9Var, xd9 xd9Var2, szb szbVar) {
        this.a = xd9Var;
        this.b = xd9Var2;
        this.c = szbVar;
    }

    public final boolean a(qv9 qv9Var, xzb xzbVar, xzb xzbVar2) {
        if (qv9Var == null || !this.a.a(qv9Var.a, xzbVar, xzbVar2) || !this.b.a(qv9Var.b, xzbVar, xzbVar2)) {
            return false;
        }
        szb szbVar = this.c;
        Double d = szbVar != null ? (Double) szbVar.a(xzbVar) : null;
        szb szbVar2 = qv9Var.c;
        return Intrinsics.b(d, szbVar2 != null ? (Double) szbVar2.a(xzbVar2) : null);
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int b = this.b.b() + this.a.b() + ern.a(qv9.class).hashCode();
        szb szbVar = this.c;
        int hashCode = b + (szbVar != null ? szbVar.hashCode() : 0);
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((rv9) rj3.b.q9.getValue()).b(rj3.a, this);
    }
}
