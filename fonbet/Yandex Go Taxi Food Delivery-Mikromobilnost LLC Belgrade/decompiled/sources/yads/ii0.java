package yads;

import defpackage.nj71;
import defpackage.os81;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ii0 extends Lambda implements wls {
    public final /* synthetic */ nj71 b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(nj71 nj71Var, ArrayList arrayList) {
        super(2);
        this.b = nj71Var;
        this.c = arrayList;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        yh0 yh0Var = (yh0) obj2;
        this.b.getClass();
        String str = null;
        if (jSONObject.has("view_name")) {
            try {
                obj3 = jSONObject.get("view_name");
            } catch (JSONException unused) {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
        }
        if (str != null) {
            this.c.add(new os81(yh0Var, str));
        }
        return zy11.a;
    }
}
