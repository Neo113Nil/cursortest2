package defpackage;

import com.connectsdk.discovery.provider.ssdp.Argument;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fd8 implements u8s {
    public final t6f a;

    public fd8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cd8 a(t7k t7kVar, hd8 hd8Var, JSONObject jSONObject) {
        String str = (String) h4a.C(hd8Var.a, jSONObject, "animator_id", bcx.i, bcx.h);
        szb O = h4a.O(t7kVar, hd8Var.b, jSONObject, Argument.TAG_DIRECTION, gd8.a, qm8.t);
        c9c c9cVar = hd8Var.c;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar, jSONObject, "duration", ox8Var, kzjVar, gd8.c);
        c9c c9cVar2 = hd8Var.d;
        t6f t6fVar = this.a;
        return new cd8(str, O, Q, (wx9) h4a.K(t7kVar, c9cVar2, jSONObject, "end_value", t6fVar.H9, t6fVar.F9), h4a.O(t7kVar, hd8Var.e, jSONObject, "interpolator", gd8.b, qm8.v), (lu8) h4a.K(t7kVar, hd8Var.f, jSONObject, "repeat_count", t6fVar.G2, t6fVar.E2), h4a.Q(t7kVar, hd8Var.g, jSONObject, "start_delay", ox8Var, kzjVar, gd8.d), (wx9) h4a.K(t7kVar, hd8Var.h, jSONObject, "start_value", t6fVar.H9, t6fVar.F9));
    }
}
