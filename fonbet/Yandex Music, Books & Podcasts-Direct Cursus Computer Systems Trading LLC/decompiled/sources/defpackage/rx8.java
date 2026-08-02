package defpackage;

import com.connectsdk.device.ConnectableDevice;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rx8 implements u1f {
    public final String a;
    public final JSONObject b;
    public Integer c;

    public rx8(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    public final boolean a(rx8 rx8Var) {
        return rx8Var != null && Intrinsics.d(this.a, rx8Var.a) && Intrinsics.d(this.b, rx8Var.b);
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + ern.a(rx8.class).hashCode();
        JSONObject jSONObject = this.b;
        int hashCode2 = hashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
        this.c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        vx8 vx8Var = (vx8) rj3.b.k3.getValue();
        pt0 pt0Var = rj3.a;
        vx8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(pt0Var, jSONObject, ConnectableDevice.KEY_ID, this.a);
        etn.l0(pt0Var, jSONObject, "params", this.b);
        return jSONObject;
    }
}
