package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xx9 implements gip, py7 {
    public final t6f a;

    public xx9(t6f t6fVar) {
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
                    ((ehj) t6fVar.sa.getValue()).getClass();
                    return new tx9(ehj.c(t7kVar, jSONObject));
                }
                break;
            case -891985903:
                if (b0.equals(PListParser.TAG_STRING)) {
                    ((sir) t6fVar.Ha.getValue()).getClass();
                    return new ux9(new rir(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.c)));
                }
                break;
            case 116079:
                if (b0.equals("url")) {
                    ((mqt) t6fVar.Na.getValue()).getClass();
                    return new vx9(mqt.c(t7kVar, jSONObject));
                }
                break;
            case 3083190:
                if (b0.equals(PListParser.TAG_DICT)) {
                    ((i28) t6fVar.y.getValue()).getClass();
                    return new rx9(new h28(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.h)));
                }
                break;
            case 64711720:
                if (b0.equals("boolean")) {
                    ((ub3) t6fVar.g.getValue()).getClass();
                    return new px9(ub3.c(t7kVar, jSONObject));
                }
                break;
            case 93090393:
                if (b0.equals(PListParser.TAG_ARRAY)) {
                    ((fz0) t6fVar.a.getValue()).getClass();
                    return new ox9(new ez0(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.g)));
                }
                break;
            case 94842723:
                if (b0.equals("color")) {
                    ((ca5) t6fVar.m.getValue()).getClass();
                    return new qx9(ca5.c(t7kVar, jSONObject));
                }
                break;
            case 1958052158:
                if (b0.equals(PListParser.TAG_INTEGER)) {
                    ((ere) t6fVar.ja.getValue()).getClass();
                    return new sx9(ere.c(t7kVar, jSONObject));
                }
                break;
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        iy9 iy9Var = t instanceof iy9 ? (iy9) t : null;
        if (iy9Var != null) {
            return ((zx9) t6fVar.H9.getValue()).a(t7kVar, iy9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, wx9 wx9Var) {
        boolean z = wx9Var instanceof ux9;
        t6f t6fVar = this.a;
        if (z) {
            sir sirVar = (sir) t6fVar.Ha.getValue();
            rir rirVar = ((ux9) wx9Var).b;
            sirVar.getClass();
            return sir.c(t7kVar, rirVar);
        }
        if (wx9Var instanceof sx9) {
            ere ereVar = (ere) t6fVar.ja.getValue();
            dre dreVar = ((sx9) wx9Var).b;
            ereVar.getClass();
            return ere.d(t7kVar, dreVar);
        }
        if (wx9Var instanceof tx9) {
            ehj ehjVar = (ehj) t6fVar.sa.getValue();
            dhj dhjVar = ((tx9) wx9Var).b;
            ehjVar.getClass();
            return ehj.d(t7kVar, dhjVar);
        }
        if (wx9Var instanceof qx9) {
            ca5 ca5Var = (ca5) t6fVar.m.getValue();
            ba5 ba5Var = ((qx9) wx9Var).b;
            ca5Var.getClass();
            return ca5.d(t7kVar, ba5Var);
        }
        if (wx9Var instanceof px9) {
            ub3 ub3Var = (ub3) t6fVar.g.getValue();
            tb3 tb3Var = ((px9) wx9Var).b;
            ub3Var.getClass();
            return ub3.d(t7kVar, tb3Var);
        }
        if (wx9Var instanceof vx9) {
            mqt mqtVar = (mqt) t6fVar.Na.getValue();
            lqt lqtVar = ((vx9) wx9Var).b;
            mqtVar.getClass();
            return mqt.d(t7kVar, lqtVar);
        }
        if (wx9Var instanceof rx9) {
            i28 i28Var = (i28) t6fVar.y.getValue();
            h28 h28Var = ((rx9) wx9Var).b;
            i28Var.getClass();
            return i28.c(t7kVar, h28Var);
        }
        if (!(wx9Var instanceof ox9)) {
            b6e.s();
            return null;
        }
        fz0 fz0Var = (fz0) t6fVar.a.getValue();
        ez0 ez0Var = ((ox9) wx9Var).b;
        fz0Var.getClass();
        return fz0.c(t7kVar, ez0Var);
    }
}
