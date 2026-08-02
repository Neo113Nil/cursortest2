package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m79 implements gip, py7 {
    public final t6f a;

    public m79(t6f t6fVar) {
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
            case -1349088399:
                if (b0.equals("custom")) {
                    return new db8(((ev8) t6fVar.K2.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -906021636:
                if (b0.equals("select")) {
                    return new lb8(((gi9) t6fVar.S6.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -899647263:
                if (b0.equals("slider")) {
                    return new nb8(((kl9) t6fVar.w7.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -889473228:
                if (b0.equals("switch")) {
                    return new pb8(((lo9) t6fVar.d8.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -711999985:
                if (b0.equals("indicator")) {
                    return new ib8(((w39) t6fVar.p4.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -410956671:
                if (b0.equals("container")) {
                    return new cb8(((st8) t6fVar.v2.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -196315310:
                if (b0.equals("gallery")) {
                    return new eb8(((a19) t6fVar.X3.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 102340:
                if (b0.equals("gif")) {
                    return new fb8(((q19) t6fVar.a4.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 3181382:
                if (b0.equals("grid")) {
                    return new gb8(((z19) t6fVar.d4.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 3552126:
                if (b0.equals("tabs")) {
                    return new qb8(((hp9) t6fVar.g8.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 3556653:
                if (b0.equals("text")) {
                    return new rb8(((wr9) t6fVar.M8.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 100313435:
                if (b0.equals("image")) {
                    return new hb8(((w29) t6fVar.j4.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 100358090:
                if (b0.equals("input")) {
                    return new jb8(((o59) t6fVar.S4.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 106426307:
                if (b0.equals("pager")) {
                    return new kb8(((nb9) t6fVar.L5.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 109757585:
                if (b0.equals("state")) {
                    return new ob8(((im9) t6fVar.I7.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 112202875:
                if (b0.equals("video")) {
                    return new sb8(((uz9) t6fVar.R9.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 1732829925:
                if (b0.equals("separator")) {
                    return new mb8(((wi9) t6fVar.Y6.getValue()).a(t7kVar, jSONObject));
                }
                break;
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        nq9 nq9Var = t instanceof nq9 ? (nq9) t : null;
        if (nq9Var != null) {
            return ((o79) t6fVar.ca.getValue()).a(t7kVar, nq9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, jc8 jc8Var) {
        boolean z = jc8Var instanceof hb8;
        t6f t6fVar = this.a;
        if (z) {
            return ((w29) t6fVar.j4.getValue()).b(t7kVar, ((hb8) jc8Var).c);
        }
        if (jc8Var instanceof fb8) {
            return ((q19) t6fVar.a4.getValue()).b(t7kVar, ((fb8) jc8Var).c);
        }
        if (jc8Var instanceof rb8) {
            return ((wr9) t6fVar.M8.getValue()).b(t7kVar, ((rb8) jc8Var).c);
        }
        if (jc8Var instanceof mb8) {
            return ((wi9) t6fVar.Y6.getValue()).b(t7kVar, ((mb8) jc8Var).c);
        }
        if (jc8Var instanceof cb8) {
            return ((st8) t6fVar.v2.getValue()).b(t7kVar, ((cb8) jc8Var).c);
        }
        if (jc8Var instanceof gb8) {
            return ((z19) t6fVar.d4.getValue()).b(t7kVar, ((gb8) jc8Var).c);
        }
        if (jc8Var instanceof eb8) {
            return ((a19) t6fVar.X3.getValue()).b(t7kVar, ((eb8) jc8Var).c);
        }
        if (jc8Var instanceof kb8) {
            return ((nb9) t6fVar.L5.getValue()).b(t7kVar, ((kb8) jc8Var).c);
        }
        if (jc8Var instanceof qb8) {
            return ((hp9) t6fVar.g8.getValue()).b(t7kVar, ((qb8) jc8Var).c);
        }
        if (jc8Var instanceof ob8) {
            return ((im9) t6fVar.I7.getValue()).b(t7kVar, ((ob8) jc8Var).c);
        }
        if (jc8Var instanceof db8) {
            return ((ev8) t6fVar.K2.getValue()).b(t7kVar, ((db8) jc8Var).c);
        }
        if (jc8Var instanceof ib8) {
            return ((w39) t6fVar.p4.getValue()).b(t7kVar, ((ib8) jc8Var).c);
        }
        if (jc8Var instanceof nb8) {
            return ((kl9) t6fVar.w7.getValue()).b(t7kVar, ((nb8) jc8Var).c);
        }
        if (jc8Var instanceof pb8) {
            return ((lo9) t6fVar.d8.getValue()).b(t7kVar, ((pb8) jc8Var).c);
        }
        if (jc8Var instanceof jb8) {
            return ((o59) t6fVar.S4.getValue()).b(t7kVar, ((jb8) jc8Var).c);
        }
        if (jc8Var instanceof lb8) {
            return ((gi9) t6fVar.S6.getValue()).b(t7kVar, ((lb8) jc8Var).c);
        }
        if (jc8Var instanceof sb8) {
            return ((uz9) t6fVar.R9.getValue()).b(t7kVar, ((sb8) jc8Var).c);
        }
        b6e.s();
        return null;
    }
}
