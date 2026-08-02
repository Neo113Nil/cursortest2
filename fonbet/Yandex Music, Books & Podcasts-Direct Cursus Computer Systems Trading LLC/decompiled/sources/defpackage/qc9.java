package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qc9 implements v7k {
    public final y7k a;
    public final sld b;
    public final sld c;
    public final y19 d;

    public qc9(y7k y7kVar) {
        sld sldVar = new sld(new mka(7), new vpl());
        this.a = y7kVar;
        this.b = sldVar;
        this.c = sldVar;
        this.d = new y19(7);
    }

    @Override // defpackage.t7k
    public final y7k a() {
        return this.a;
    }

    @Override // defpackage.t7k
    public final t8s b() {
        return this.c;
    }

    public final void e(JSONObject jSONObject) {
        sld sldVar = this.b;
        y7k y7kVar = this.a;
        xy0 xy0Var = new xy0(0);
        xy0 xy0Var2 = new xy0(0);
        try {
            LinkedHashMap K = kg5.K(this, jSONObject);
            xy0Var.putAll((xy0) ((mka) sldVar.b).a);
            hjp hjpVar = new hjp(7, xy0Var);
            for (Map.Entry entry : K.entrySet()) {
                String str = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                try {
                    w7k w7kVar = new w7k(hjpVar, new s8s(y7kVar, str));
                    y19 y19Var = this.d;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    y19Var.getClass();
                    xy0Var.put(str, ((n79) rj3.b.ba.getValue()).a(w7kVar, jSONObject2));
                    if (!set.isEmpty()) {
                        xy0Var2.put(str, set);
                    }
                } catch (z7k e) {
                    y7kVar.a(e);
                }
            }
        } catch (Exception e2) {
            y7kVar.a(e2);
        }
        sldVar.getClass();
        Iterator it = ((sy0) xy0Var.entrySet()).iterator();
        while (true) {
            vy0 vy0Var = (vy0) it;
            if (!vy0Var.hasNext()) {
                return;
            }
            vy0Var.next();
            vy0 vy0Var2 = vy0Var;
            mka mkaVar = (mka) sldVar.b;
            ((xy0) mkaVar.a).put((String) vy0Var2.getKey(), (d7f) vy0Var2.getValue());
        }
    }
}
