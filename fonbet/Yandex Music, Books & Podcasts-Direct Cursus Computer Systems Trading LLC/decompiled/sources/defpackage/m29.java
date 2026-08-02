package defpackage;

import android.net.Uri;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m29 implements gip, py7 {
    public final t6f a;

    public m29(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k29 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = p29.i;
        ozb ozbVar = p29.a;
        ?? e = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, l29Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        tct tctVar = p29.f;
        va8 va8Var = va8.x0;
        ozb ozbVar3 = p29.b;
        ns9 ns9Var = bcx.h;
        szb e2 = e5f.e(t7kVar, jSONObject, "content_alignment_horizontal", tctVar, va8Var, ns9Var, ozbVar3);
        if (e2 == null) {
            e2 = ozbVar3;
        }
        tct tctVar2 = p29.g;
        va8 va8Var2 = va8.z0;
        ozb ozbVar4 = p29.c;
        szb e3 = e5f.e(t7kVar, jSONObject, "content_alignment_vertical", tctVar2, va8Var2, ns9Var, ozbVar4);
        if (e3 == null) {
            e3 = ozbVar4;
        }
        List Y = etn.Y(t7kVar, jSONObject, "filters", this.a.t3);
        szb b = e5f.b(t7kVar, jSONObject, "image_url", vct.e, kzj.C, ns9Var);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar5 = p29.d;
        szb e4 = e5f.e(t7kVar, jSONObject, "preload_required", ox8Var2, kzjVar2, ns9Var, ozbVar5);
        if (e4 == null) {
            e4 = ozbVar5;
        }
        tct tctVar3 = p29.h;
        p19 p19Var = p19.J;
        ozb ozbVar6 = p29.e;
        szb e5 = e5f.e(t7kVar, jSONObject, "scale", tctVar3, p19Var, ns9Var, ozbVar6);
        if (e5 == null) {
            e5 = ozbVar6;
        }
        return new k29(ozbVar2, e2, e3, Y, b, e4, e5);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, k29 k29Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "alpha", k29Var.a);
        szb szbVar = k29Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("content_alignment_horizontal", b);
                } else {
                    jSONObject.put("content_alignment_horizontal", ((om8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        szb szbVar2 = k29Var.c;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("content_alignment_vertical", b2);
                } else {
                    jSONObject.put("content_alignment_vertical", ((pm8) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        etn.n0(t7kVar, jSONObject, "filters", k29Var.d, this.a.t3);
        szb szbVar3 = k29Var.e;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("image_url", b3);
                } else {
                    jSONObject.put("image_url", ((Uri) b3).toString());
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        e5f.g(t7kVar, jSONObject, "preload_required", k29Var.f);
        szb szbVar4 = k29Var.g;
        if (szbVar4 != null) {
            Object b4 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("scale", b4);
                } else {
                    jSONObject.put("scale", ((g39) b4).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "image");
        return jSONObject;
    }
}
