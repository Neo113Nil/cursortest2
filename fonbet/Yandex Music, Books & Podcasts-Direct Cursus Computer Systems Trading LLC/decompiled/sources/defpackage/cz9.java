package defpackage;

import com.connectsdk.service.airplay.PListParser;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cz9 implements gip, py7 {
    public final t6f a;

    public cz9(t6f t6fVar) {
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
            case -1034364087:
                if (b0.equals("number")) {
                    ((khj) t6fVar.va.getValue()).getClass();
                    return new vy9(khj.c(t7kVar, jSONObject));
                }
                break;
            case -993141291:
                if (b0.equals("property")) {
                    return new wy9(((fym) t6fVar.Ba.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -891985903:
                if (b0.equals(PListParser.TAG_STRING)) {
                    ((xir) t6fVar.Ka.getValue()).getClass();
                    return new xy9(xir.c(t7kVar, jSONObject));
                }
                break;
            case 116079:
                if (b0.equals("url")) {
                    ((rqt) t6fVar.Qa.getValue()).getClass();
                    return new yy9(rqt.c(t7kVar, jSONObject));
                }
                break;
            case 3083190:
                if (b0.equals(PListParser.TAG_DICT)) {
                    ((n28) t6fVar.B.getValue()).getClass();
                    return new ty9(n28.c(t7kVar, jSONObject));
                }
                break;
            case 64711720:
                if (b0.equals("boolean")) {
                    ((zb3) t6fVar.j.getValue()).getClass();
                    return new ry9(zb3.c(t7kVar, jSONObject));
                }
                break;
            case 93090393:
                if (b0.equals(PListParser.TAG_ARRAY)) {
                    ((lz0) t6fVar.d.getValue()).getClass();
                    return new qy9(lz0.c(t7kVar, jSONObject));
                }
                break;
            case 94842723:
                if (b0.equals("color")) {
                    ((ha5) t6fVar.p.getValue()).getClass();
                    return new sy9(ha5.c(t7kVar, jSONObject));
                }
                break;
            case 1958052158:
                if (b0.equals(PListParser.TAG_INTEGER)) {
                    ((kre) t6fVar.ma.getValue()).getClass();
                    return new uy9(kre.c(t7kVar, jSONObject));
                }
                break;
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        oz9 oz9Var = t instanceof oz9 ? (oz9) t : null;
        if (oz9Var != null) {
            return ((ez9) t6fVar.K9.getValue()).a(t7kVar, oz9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, zy9 zy9Var) {
        boolean z = zy9Var instanceof xy9;
        t6f t6fVar = this.a;
        if (z) {
            xir xirVar = (xir) t6fVar.Ka.getValue();
            wir wirVar = ((xy9) zy9Var).b;
            xirVar.getClass();
            return xir.d(t7kVar, wirVar);
        }
        if (zy9Var instanceof vy9) {
            khj khjVar = (khj) t6fVar.va.getValue();
            jhj jhjVar = ((vy9) zy9Var).b;
            khjVar.getClass();
            return khj.d(t7kVar, jhjVar);
        }
        if (zy9Var instanceof uy9) {
            kre kreVar = (kre) t6fVar.ma.getValue();
            jre jreVar = ((uy9) zy9Var).b;
            kreVar.getClass();
            return kre.d(t7kVar, jreVar);
        }
        if (zy9Var instanceof ry9) {
            zb3 zb3Var = (zb3) t6fVar.j.getValue();
            yb3 yb3Var = ((ry9) zy9Var).b;
            zb3Var.getClass();
            return zb3.d(t7kVar, yb3Var);
        }
        if (zy9Var instanceof sy9) {
            ha5 ha5Var = (ha5) t6fVar.p.getValue();
            ga5 ga5Var = ((sy9) zy9Var).b;
            ha5Var.getClass();
            return ha5.d(t7kVar, ga5Var);
        }
        if (zy9Var instanceof yy9) {
            rqt rqtVar = (rqt) t6fVar.Qa.getValue();
            qqt qqtVar = ((yy9) zy9Var).b;
            rqtVar.getClass();
            return rqt.d(t7kVar, qqtVar);
        }
        if (zy9Var instanceof ty9) {
            n28 n28Var = (n28) t6fVar.B.getValue();
            m28 m28Var = ((ty9) zy9Var).b;
            n28Var.getClass();
            return n28.d(t7kVar, m28Var);
        }
        if (zy9Var instanceof qy9) {
            lz0 lz0Var = (lz0) t6fVar.d.getValue();
            kz0 kz0Var = ((qy9) zy9Var).b;
            lz0Var.getClass();
            return lz0.d(t7kVar, kz0Var);
        }
        if (zy9Var instanceof wy9) {
            return ((fym) t6fVar.Ba.getValue()).b(t7kVar, ((wy9) zy9Var).b);
        }
        b6e.s();
        return null;
    }
}
