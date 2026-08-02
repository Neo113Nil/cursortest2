package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class w7k implements zsq0, nyi {
    public final JsonParserComponent a;

    public w7k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1019779949:
                if (R.equals("offset")) {
                    ((yu60) jsonParserComponent.va.getValue()).getClass();
                    return new t7k(yu60.c(yf90Var, jSONObject));
                }
                break;
            case 100571:
                if (R.equals("end")) {
                    ((a0o) jsonParserComponent.aa.getValue()).getClass();
                    return new q7k(new zzn());
                }
                break;
            case 100346066:
                if (R.equals("index")) {
                    ((arv) jsonParserComponent.da.getValue()).getClass();
                    return new r7k(arv.c(yf90Var, jSONObject));
                }
                break;
            case 109757538:
                if (R.equals("start")) {
                    ((t0u0) jsonParserComponent.Ba.getValue()).getClass();
                    return new u7k(new s0u0());
                }
                break;
            case 2116204999:
                if (R.equals("item_id")) {
                    ((f2x) jsonParserComponent.ma.getValue()).getClass();
                    return new s7k(new e2x(a.a(yf90Var, jSONObject, "value", wm11.c)));
                }
                break;
        }
        hex b = yf90Var.b().b(R, jSONObject);
        e8k e8kVar = b instanceof e8k ? (e8k) b : null;
        if (e8kVar != null) {
            return ((y7k) jsonParserComponent.C0.getValue()).a(yf90Var, e8kVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, v7k v7kVar) {
        boolean z = v7kVar instanceof t7k;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            yu60 yu60Var = (yu60) jsonParserComponent.va.getValue();
            xu60 xu60Var = ((t7k) v7kVar).b;
            yu60Var.getClass();
            return yu60.d(yf90Var, xu60Var);
        }
        if (v7kVar instanceof r7k) {
            arv arvVar = (arv) jsonParserComponent.da.getValue();
            zqv zqvVar = ((r7k) v7kVar).b;
            arvVar.getClass();
            return arv.d(yf90Var, zqvVar);
        }
        if (v7kVar instanceof u7k) {
            ((t0u0) jsonParserComponent.Ba.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            wwg.Z(yf90Var, jSONObject, "type", "start");
            return jSONObject;
        }
        if (v7kVar instanceof q7k) {
            ((a0o) jsonParserComponent.aa.getValue()).getClass();
            JSONObject jSONObject2 = new JSONObject();
            wwg.Z(yf90Var, jSONObject2, "type", "end");
            return jSONObject2;
        }
        if (!(v7kVar instanceof s7k)) {
            w511.b();
            return null;
        }
        f2x f2xVar = (f2x) jsonParserComponent.ma.getValue();
        e2x e2xVar = ((s7k) v7kVar).b;
        f2xVar.getClass();
        return f2x.c(yf90Var, e2xVar);
    }
}
