package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w79 implements u1f {
    public final String a;
    public final String b;
    public Integer c;

    public w79(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean a(w79 w79Var) {
        return w79Var != null && Intrinsics.d(this.a, w79Var.a) && Intrinsics.d(this.b, w79Var.b);
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(w79.class).hashCode();
        String str = this.a;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.c = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        z79 z79Var = (z79) rj3.b.Y4.getValue();
        pt0 pt0Var = rj3.a;
        z79Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(pt0Var, jSONObject, "height_variable_name", this.a);
        etn.l0(pt0Var, jSONObject, "width_variable_name", this.b);
        return jSONObject;
    }
}
