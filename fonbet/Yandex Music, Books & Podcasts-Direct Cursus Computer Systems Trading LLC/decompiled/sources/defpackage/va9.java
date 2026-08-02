package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class va9 implements gip, r8s {
    public static ya9 c(t7k t7kVar, ya9 ya9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c P = y2x.P(Y, jSONObject, "interpolator", xa9.f, d, ya9Var != null ? ya9Var.a : null, qm8.v, bcx.h);
        ox8 ox8Var = vct.d;
        c9c c9cVar = ya9Var != null ? ya9Var.b : null;
        kzj kzjVar = kzj.E;
        return new ya9(P, y2x.P(Y, jSONObject, "next_page_alpha", ox8Var, d, c9cVar, kzjVar, xa9.g), y2x.P(Y, jSONObject, "next_page_scale", ox8Var, d, ya9Var != null ? ya9Var.c : null, kzjVar, xa9.h), y2x.P(Y, jSONObject, "previous_page_alpha", ox8Var, d, ya9Var != null ? ya9Var.d : null, kzjVar, xa9.i), y2x.P(Y, jSONObject, "previous_page_scale", ox8Var, d, ya9Var != null ? ya9Var.e : null, kzjVar, xa9.j));
    }

    public static JSONObject d(t7k t7kVar, ya9 ya9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(ya9Var.a, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.f0(t7kVar, jSONObject, "next_page_alpha", ya9Var.b);
        y2x.f0(t7kVar, jSONObject, "next_page_scale", ya9Var.c);
        y2x.f0(t7kVar, jSONObject, "previous_page_alpha", ya9Var.d);
        y2x.f0(t7kVar, jSONObject, "previous_page_scale", ya9Var.e);
        etn.l0(t7kVar, jSONObject, "type", "slide");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ya9) obj);
    }
}
