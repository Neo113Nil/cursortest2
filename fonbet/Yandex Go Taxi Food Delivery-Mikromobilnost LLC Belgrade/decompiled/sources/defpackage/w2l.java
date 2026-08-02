package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class w2l implements c4x {
    public final String a;
    public final List b;
    public Integer c;
    public Integer d;

    public w2l(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        a3l a3lVar = (a3l) ft6.b.P5.getValue();
        lb7 lb7Var = ft6.a;
        a3lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(lb7Var, jSONObject, "id", this.a);
        wwg.c0(lb7Var, jSONObject, "items", this.b, a3lVar.a.X9);
        return jSONObject;
    }
}
