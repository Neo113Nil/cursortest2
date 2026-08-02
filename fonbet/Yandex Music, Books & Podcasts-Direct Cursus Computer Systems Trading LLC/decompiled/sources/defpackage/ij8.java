package defpackage;

import android.net.Uri;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ij8 implements gip, py7 {
    public final t6f a;

    public ij8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        List Y = etn.Y(t7kVar, jSONObject, "headers", this.a.e1);
        tct tctVar = kj8.b;
        va8 va8Var = va8.I;
        ozb ozbVar = kj8.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "method", tctVar, va8Var, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new bj8(Y, ozbVar, e5f.b(t7kVar, jSONObject, "url", vct.e, kzj.C, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bj8 bj8Var) {
        JSONObject jSONObject = new JSONObject();
        etn.n0(t7kVar, jSONObject, "headers", bj8Var.a, this.a.e1);
        szb szbVar = bj8Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("method", b);
                } else {
                    jSONObject.put("method", ((aj8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        szb szbVar2 = bj8Var.c;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("url", b2);
                } else {
                    jSONObject.put("url", ((Uri) b2).toString());
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        return jSONObject;
    }
}
