package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vn8 implements gip, py7 {
    public final t6f a;

    public vn8(t6f t6fVar) {
        this.a = t6fVar;
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
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        switch (hashCode) {
            case 113762:
                if (b0.equals("set")) {
                    return new sn8(((mn8) t6fVar.F1.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 3135100:
                if (b0.equals("fade")) {
                    ((ay8) t6fVar.n3.getValue()).getClass();
                    return new qn8(ay8.c(t7kVar, jSONObject));
                }
                break;
            case 109250890:
                if (b0.equals("scale")) {
                    ((yh9) t6fVar.P6.getValue()).getClass();
                    return new rn8(yh9.c(t7kVar, jSONObject));
                }
                break;
            case 109526449:
                if (b0.equals("slide")) {
                    return new tn8(((sk9) t6fVar.t7.getValue()).a(t7kVar, jSONObject));
                }
                break;
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        co8 co8Var = t instanceof co8 ? (co8) t : null;
        if (co8Var != null) {
            return ((xn8) t6fVar.K1.getValue()).a(t7kVar, co8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, un8 un8Var) {
        boolean z = un8Var instanceof sn8;
        t6f t6fVar = this.a;
        if (z) {
            return ((mn8) t6fVar.F1.getValue()).b(t7kVar, ((sn8) un8Var).b);
        }
        if (un8Var instanceof qn8) {
            ay8 ay8Var = (ay8) t6fVar.n3.getValue();
            zx8 zx8Var = ((qn8) un8Var).b;
            ay8Var.getClass();
            return ay8.d(t7kVar, zx8Var);
        }
        if (un8Var instanceof rn8) {
            yh9 yh9Var = (yh9) t6fVar.P6.getValue();
            xh9 xh9Var = ((rn8) un8Var).b;
            yh9Var.getClass();
            return yh9.d(t7kVar, xh9Var);
        }
        if (un8Var instanceof tn8) {
            return ((sk9) t6fVar.t7.getValue()).b(t7kVar, ((tn8) un8Var).b);
        }
        b6e.s();
        return null;
    }
}
