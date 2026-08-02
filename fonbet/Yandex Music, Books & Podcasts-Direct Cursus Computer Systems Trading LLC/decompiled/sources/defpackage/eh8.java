package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class eh8 implements gip, py7 {
    public final t6f a;

    public eh8(t6f t6fVar) {
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
            case -1019779949:
                if (b0.equals("offset")) {
                    ((hnj) t6fVar.ya.getValue()).getClass();
                    return new bh8(hnj.c(t7kVar, jSONObject));
                }
                break;
            case 100571:
                if (b0.equals("end")) {
                    ((c7b) t6fVar.da.getValue()).getClass();
                    return new yg8(new b7b());
                }
                break;
            case 100346066:
                if (b0.equals("index")) {
                    ((sie) t6fVar.ga.getValue()).getClass();
                    return new zg8(sie.c(t7kVar, jSONObject));
                }
                break;
            case 109757538:
                if (b0.equals("start")) {
                    ((qbr) t6fVar.Ea.getValue()).getClass();
                    return new ch8(new pbr());
                }
                break;
            case 2116204999:
                if (b0.equals("item_id")) {
                    ((dze) t6fVar.pa.getValue()).getClass();
                    return new ah8(new cze(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.c)));
                }
                break;
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        mh8 mh8Var = t instanceof mh8 ? (mh8) t : null;
        if (mh8Var != null) {
            return ((gh8) t6fVar.C0.getValue()).a(t7kVar, mh8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, dh8 dh8Var) {
        boolean z = dh8Var instanceof bh8;
        t6f t6fVar = this.a;
        if (z) {
            hnj hnjVar = (hnj) t6fVar.ya.getValue();
            gnj gnjVar = ((bh8) dh8Var).b;
            hnjVar.getClass();
            return hnj.d(t7kVar, gnjVar);
        }
        if (dh8Var instanceof zg8) {
            sie sieVar = (sie) t6fVar.ga.getValue();
            rie rieVar = ((zg8) dh8Var).b;
            sieVar.getClass();
            return sie.d(t7kVar, rieVar);
        }
        if (dh8Var instanceof ch8) {
            ((qbr) t6fVar.Ea.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "start");
            return jSONObject;
        }
        if (dh8Var instanceof yg8) {
            ((c7b) t6fVar.da.getValue()).getClass();
            JSONObject jSONObject2 = new JSONObject();
            etn.l0(t7kVar, jSONObject2, "type", "end");
            return jSONObject2;
        }
        if (!(dh8Var instanceof ah8)) {
            b6e.s();
            return null;
        }
        dze dzeVar = (dze) t6fVar.pa.getValue();
        cze czeVar = ((ah8) dh8Var).b;
        dzeVar.getClass();
        return dze.c(t7kVar, czeVar);
    }
}
