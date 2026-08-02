package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class tv8 {
    public final JSONObject a;
    public final JSONObject b;
    public final List c;

    public tv8(JSONObject jSONObject, JSONObject jSONObject2, List list) {
        jSONObject.getClass();
        jSONObject2.getClass();
        list.getClass();
        this.a = jSONObject;
        this.b = jSONObject2;
        this.c = list;
    }

    public static tv8 a(tv8 tv8Var, ArrayList arrayList) {
        JSONObject jSONObject = tv8Var.a;
        JSONObject jSONObject2 = tv8Var.b;
        tv8Var.getClass();
        jSONObject.getClass();
        jSONObject2.getClass();
        return new tv8(jSONObject, jSONObject2, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv8)) {
            return false;
        }
        tv8 tv8Var = (tv8) obj;
        return Intrinsics.d(this.a, tv8Var.a) && Intrinsics.d(this.b, tv8Var.b) && Intrinsics.d(this.c, tv8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivDataForRendering(templatesJson=");
        sb.append(this.a);
        sb.append(", cardsJson=");
        sb.append(this.b);
        sb.append(", variables=");
        return vz1.u(sb, this.c, ")");
    }
}
