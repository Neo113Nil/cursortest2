package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.provider.ssdp.Argument;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t99 implements u8s {
    public final t6f a;

    public t99(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v8, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q99 a(t7k t7kVar, v99 v99Var, JSONObject jSONObject) {
        c9c c9cVar = v99Var.a;
        t6f t6fVar = this.a;
        List V = h4a.V(t7kVar, c9cVar, jSONObject, "cancel_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar2 = v99Var.b;
        tct tctVar = u99.e;
        qm8 qm8Var = qm8.t;
        ozb ozbVar = u99.a;
        ?? P = h4a.P(t7kVar, c9cVar2, jSONObject, Argument.TAG_DIRECTION, tctVar, qm8Var, ozbVar);
        ozb ozbVar2 = P == 0 ? ozbVar : P;
        c9c c9cVar3 = v99Var.c;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        szb H = h4a.H(t7kVar, c9cVar3, jSONObject, "duration", ox8Var, kzjVar, u99.g);
        List V2 = h4a.V(t7kVar, v99Var.d, jSONObject, "end_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar4 = v99Var.e;
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        szb G = h4a.G(t7kVar, c9cVar4, jSONObject, "end_value", ox8Var2, kzjVar2);
        c9c c9cVar5 = v99Var.f;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        String str = (String) h4a.C(c9cVar5, jSONObject, ConnectableDevice.KEY_ID, s3fVar, ns9Var);
        c9c c9cVar6 = v99Var.g;
        tct tctVar2 = u99.f;
        qm8 qm8Var2 = qm8.v;
        ozb ozbVar3 = u99.b;
        ?? P2 = h4a.P(t7kVar, c9cVar6, jSONObject, "interpolator", tctVar2, qm8Var2, ozbVar3);
        ozb ozbVar4 = P2 == 0 ? ozbVar3 : P2;
        lu8 lu8Var = (lu8) h4a.K(t7kVar, v99Var.h, jSONObject, "repeat_count", t6fVar.G2, t6fVar.E2);
        if (lu8Var == null) {
            lu8Var = u99.c;
        }
        lu8 lu8Var2 = lu8Var;
        c9c c9cVar7 = v99Var.i;
        l29 l29Var = u99.h;
        ozb ozbVar5 = u99.d;
        ?? R = h4a.R(t7kVar, c9cVar7, jSONObject, "start_delay", ox8Var, kzjVar, l29Var, ozbVar5);
        if (R != 0) {
            ozbVar5 = R;
        }
        return new q99(V, ozbVar2, H, V2, G, str, ozbVar4, lu8Var2, ozbVar5, h4a.O(t7kVar, v99Var.j, jSONObject, "start_value", ox8Var2, kzjVar2), (String) h4a.C(v99Var.k, jSONObject, "variable_name", s3fVar, ns9Var));
    }
}
