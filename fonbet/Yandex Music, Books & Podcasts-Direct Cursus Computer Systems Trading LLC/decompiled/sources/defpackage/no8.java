package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class no8 implements gip, py7 {
    public final t6f a;

    public no8(t6f t6fVar) {
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
            case -30518633:
                if (b0.equals("nine_patch_image")) {
                    return new jo8(((m99) t6fVar.n5.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 89650992:
                if (b0.equals("gradient")) {
                    return new io8(((j89) t6fVar.b5.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 100313435:
                if (b0.equals("image")) {
                    return new ho8(((m29) t6fVar.g4.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 109618859:
                if (b0.equals("solid")) {
                    ((yl9) t6fVar.F7.getValue()).getClass();
                    return new lo8(yl9.c(t7kVar, jSONObject));
                }
                break;
            case 1881846096:
                if (b0.equals("radial_gradient")) {
                    return new ko8(((gg9) t6fVar.D6.getValue()).a(t7kVar, jSONObject));
                }
                break;
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        cp8 cp8Var = t instanceof cp8 ? (cp8) t : null;
        if (cp8Var != null) {
            return ((po8) t6fVar.Q1.getValue()).a(t7kVar, cp8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, mo8 mo8Var) {
        boolean z = mo8Var instanceof io8;
        t6f t6fVar = this.a;
        if (z) {
            return ((j89) t6fVar.b5.getValue()).b(t7kVar, ((io8) mo8Var).b);
        }
        if (mo8Var instanceof ko8) {
            return ((gg9) t6fVar.D6.getValue()).b(t7kVar, ((ko8) mo8Var).b);
        }
        if (mo8Var instanceof ho8) {
            return ((m29) t6fVar.g4.getValue()).b(t7kVar, ((ho8) mo8Var).b);
        }
        if (mo8Var instanceof lo8) {
            yl9 yl9Var = (yl9) t6fVar.F7.getValue();
            xl9 xl9Var = ((lo8) mo8Var).b;
            yl9Var.getClass();
            return yl9.d(t7kVar, xl9Var);
        }
        if (mo8Var instanceof jo8) {
            return ((m99) t6fVar.n5.getValue()).b(t7kVar, ((jo8) mo8Var).b);
        }
        b6e.s();
        return null;
    }
}
