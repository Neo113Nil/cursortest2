package defpackage;

import com.connectsdk.device.ConnectableDevice;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class du9 implements gip, py7 {
    public final t6f a;

    public du9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.t1;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        ns9 ns9Var = fu9.b;
        ozb ozbVar = fu9.a;
        szb e = e5f.e(t7kVar, jSONObject, "duration", ox8Var, kzjVar, ns9Var, ozbVar);
        if (e == null) {
            e = ozbVar;
        }
        List Y = etn.Y(t7kVar, jSONObject, "end_actions", jyrVar);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            throw a8k.g(ConnectableDevice.KEY_ID, jSONObject);
        }
        String str = (String) opt;
        List Y2 = etn.Y(t7kVar, jSONObject, "tick_actions", jyrVar);
        szb e2 = e5f.e(t7kVar, jSONObject, "tick_interval", ox8Var, kzjVar, fu9.c, null);
        Object opt2 = jSONObject.opt("value_variable");
        if (opt2 == obj) {
            opt2 = null;
        }
        return new au9(e, Y, str, Y2, e2, (String) (opt2 != null ? opt2 : null));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, au9 au9Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "duration", au9Var.a);
        List list = au9Var.b;
        jyr jyrVar = this.a.t1;
        etn.n0(t7kVar, jSONObject, "end_actions", list, jyrVar);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, au9Var.c);
        etn.n0(t7kVar, jSONObject, "tick_actions", au9Var.d, jyrVar);
        e5f.g(t7kVar, jSONObject, "tick_interval", au9Var.e);
        etn.l0(t7kVar, jSONObject, "value_variable", au9Var.f);
        return jSONObject;
    }
}
