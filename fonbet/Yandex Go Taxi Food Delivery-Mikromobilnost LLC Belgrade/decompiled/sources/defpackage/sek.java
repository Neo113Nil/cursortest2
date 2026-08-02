package defpackage;

import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.z1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sek implements zsq0, nyi {
    public final JsonParserComponent a;

    public sek(JsonParserComponent jsonParserComponent) {
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
            case 113762:
                if (R.equals("set")) {
                    return new qek(((kek) jsonParserComponent.F1.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 3135100:
                if (R.equals("fade")) {
                    ((ipk) jsonParserComponent.m3.getValue()).getClass();
                    return new oek(ipk.c(yf90Var, jSONObject));
                }
                break;
            case 109250890:
                if (R.equals("scale")) {
                    ((r7l) jsonParserComponent.N6.getValue()).getClass();
                    return new pek(r7l.c(yf90Var, jSONObject));
                }
                break;
            case 109526449:
                if (R.equals("slide")) {
                    return new rek(((z1) jsonParserComponent.r7.getValue()).a(yf90Var, jSONObject));
                }
                break;
        }
        hex b = yf90Var.b().b(R, jSONObject);
        zek zekVar = b instanceof zek ? (zek) b : null;
        if (zekVar != null) {
            return ((uek) jsonParserComponent.K1.getValue()).a(yf90Var, zekVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivAppearanceTransition divAppearanceTransition) {
        boolean z = divAppearanceTransition instanceof qek;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((kek) jsonParserComponent.F1.getValue()).b(yf90Var, ((qek) divAppearanceTransition).b);
        }
        if (divAppearanceTransition instanceof oek) {
            ipk ipkVar = (ipk) jsonParserComponent.m3.getValue();
            hpk hpkVar = ((oek) divAppearanceTransition).b;
            ipkVar.getClass();
            return ipk.d(yf90Var, hpkVar);
        }
        if (divAppearanceTransition instanceof pek) {
            r7l r7lVar = (r7l) jsonParserComponent.N6.getValue();
            q7l d = ((pek) divAppearanceTransition).d();
            r7lVar.getClass();
            return r7l.d(yf90Var, d);
        }
        if (divAppearanceTransition instanceof rek) {
            return ((z1) jsonParserComponent.r7.getValue()).b(yf90Var, ((rek) divAppearanceTransition).b);
        }
        w511.b();
        return null;
    }
}
