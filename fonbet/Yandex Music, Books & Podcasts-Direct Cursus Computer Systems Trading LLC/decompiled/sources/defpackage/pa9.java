package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pa9 implements gip, r8s {
    public static sa9 c(t7k t7kVar, sa9 sa9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        tct tctVar = ra9.g;
        c9c c9cVar = sa9Var != null ? sa9Var.a : null;
        qm8 qm8Var = qm8.v;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "interpolator", tctVar, d, c9cVar, qm8Var, ns9Var);
        ox8 ox8Var = vct.d;
        c9c c9cVar2 = sa9Var != null ? sa9Var.b : null;
        kzj kzjVar = kzj.E;
        return new sa9(P, y2x.P(Y, jSONObject, "next_page_alpha", ox8Var, d, c9cVar2, kzjVar, ra9.h), y2x.P(Y, jSONObject, "next_page_scale", ox8Var, d, sa9Var != null ? sa9Var.c : null, kzjVar, ra9.i), y2x.P(Y, jSONObject, "previous_page_alpha", ox8Var, d, sa9Var != null ? sa9Var.d : null, kzjVar, ra9.j), y2x.P(Y, jSONObject, "previous_page_scale", ox8Var, d, sa9Var != null ? sa9Var.e : null, kzjVar, ra9.k), y2x.P(Y, jSONObject, "reversed_stacking_order", vct.a, d, sa9Var != null ? sa9Var.f : null, kzj.B, ns9Var));
    }

    public static JSONObject d(t7k t7kVar, sa9 sa9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(sa9Var.a, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.f0(t7kVar, jSONObject, "next_page_alpha", sa9Var.b);
        y2x.f0(t7kVar, jSONObject, "next_page_scale", sa9Var.c);
        y2x.f0(t7kVar, jSONObject, "previous_page_alpha", sa9Var.d);
        y2x.f0(t7kVar, jSONObject, "previous_page_scale", sa9Var.e);
        y2x.f0(t7kVar, jSONObject, "reversed_stacking_order", sa9Var.f);
        etn.l0(t7kVar, jSONObject, "type", "overlap");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (sa9) obj);
    }
}
