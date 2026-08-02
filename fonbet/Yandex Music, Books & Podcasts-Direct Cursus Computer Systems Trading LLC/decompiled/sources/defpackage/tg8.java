package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tg8 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static sg8 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = wg8.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "animated", ox8Var, kzjVar, ns9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        szb b = e5f.b(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vct.c, bcx.i, ns9Var);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        ozb ozbVar3 = wg8.b;
        szb e2 = e5f.e(t7kVar, jSONObject, "item_count", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        if (e2 == null) {
            e2 = ozbVar3;
        }
        ozb ozbVar4 = wg8.c;
        szb e3 = e5f.e(t7kVar, jSONObject, "offset", ox8Var2, kzjVar2, ns9Var, ozbVar4);
        if (e3 == null) {
            e3 = ozbVar4;
        }
        tct tctVar = wg8.e;
        va8 va8Var = va8.C;
        ozb ozbVar5 = wg8.d;
        ?? e4 = e5f.e(t7kVar, jSONObject, "overflow", tctVar, va8Var, ns9Var, ozbVar5);
        return new sg8(ozbVar2, b, e2, e3, e4 == 0 ? ozbVar5 : e4);
    }

    public static JSONObject d(t7k t7kVar, sg8 sg8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "animated", sg8Var.a);
        e5f.g(t7kVar, jSONObject, ConnectableDevice.KEY_ID, sg8Var.b);
        e5f.g(t7kVar, jSONObject, "item_count", sg8Var.c);
        e5f.g(t7kVar, jSONObject, "offset", sg8Var.d);
        szb szbVar = sg8Var.e;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("overflow", b);
                } else {
                    jSONObject.put("overflow", ((rg8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "scroll_by");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (sg8) obj);
    }
}
