package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n79 implements gip, py7 {
    public final t6f a;

    public n79(t6f t6fVar) {
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
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nq9 a(t7k t7kVar, JSONObject jSONObject) {
        String str;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        nq9 nq9Var = d7fVar instanceof nq9 ? (nq9) d7fVar : null;
        if (nq9Var == null) {
            str = b0;
        } else if (nq9Var instanceof bq9) {
            str = "image";
        } else if (nq9Var instanceof zp9) {
            str = "gif";
        } else if (nq9Var instanceof lq9) {
            str = "text";
        } else if (nq9Var instanceof gq9) {
            str = "separator";
        } else if (nq9Var instanceof wp9) {
            str = "container";
        } else if (nq9Var instanceof aq9) {
            str = "grid";
        } else if (nq9Var instanceof yp9) {
            str = "gallery";
        } else if (nq9Var instanceof eq9) {
            str = "pager";
        } else if (nq9Var instanceof kq9) {
            str = "tabs";
        } else if (nq9Var instanceof iq9) {
            str = "state";
        } else if (nq9Var instanceof xp9) {
            str = "custom";
        } else if (nq9Var instanceof cq9) {
            str = "indicator";
        } else if (nq9Var instanceof hq9) {
            str = "slider";
        } else if (nq9Var instanceof jq9) {
            str = "switch";
        } else if (nq9Var instanceof dq9) {
            str = "input";
        } else if (nq9Var instanceof fq9) {
            str = "select";
        } else {
            if (!(nq9Var instanceof mq9)) {
                b6e.s();
                return null;
            }
            str = "video";
        }
        int hashCode = str.hashCode();
        nq9 nq9Var2 = nq9Var;
        t6f t6fVar = this.a;
        switch (hashCode) {
            case -1349088399:
                if (str.equals("custom")) {
                    return new xp9(((fv8) t6fVar.L2.getValue()).c(t7kVar, (jv8) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    return new fq9(((hi9) t6fVar.T6.getValue()).c(t7kVar, (ni9) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case -899647263:
                if (str.equals("slider")) {
                    return new hq9(((ll9) t6fVar.x7.getValue()).c(t7kVar, (sl9) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case -889473228:
                if (str.equals("switch")) {
                    return new jq9(((mo9) t6fVar.e8.getValue()).c(t7kVar, (po9) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    return new cq9(((x39) t6fVar.q4.getValue()).c(t7kVar, (a49) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case -410956671:
                if (str.equals("container")) {
                    return new wp9(((tt8) t6fVar.w2.getValue()).c(t7kVar, (au8) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    return new yp9(((b19) t6fVar.Y3.getValue()).c(t7kVar, (f19) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 102340:
                if (str.equals("gif")) {
                    return new zp9(((r19) t6fVar.b4.getValue()).c(t7kVar, (u19) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return new aq9(((a29) t6fVar.e4.getValue()).c(t7kVar, (e29) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 3552126:
                if (str.equals("tabs")) {
                    return new kq9(((ip9) t6fVar.h8.getValue()).c(t7kVar, (vp9) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return new lq9(((xr9) t6fVar.N8.getValue()).c(t7kVar, (zt9) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    return new bq9(((x29) t6fVar.k4.getValue()).c(t7kVar, (h39) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    return new dq9(((p59) t6fVar.T4.getValue()).c(t7kVar, (h69) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 106426307:
                if (str.equals("pager")) {
                    return new eq9(((ob9) t6fVar.M5.getValue()).c(t7kVar, (ic9) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    return new iq9(((jm9) t6fVar.J7.getValue()).c(t7kVar, (tm9) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    return new mq9(((vz9) t6fVar.S9.getValue()).c(t7kVar, (k0a) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
            case 1732829925:
                if (str.equals("separator")) {
                    return new gq9(((xi9) t6fVar.Z6.getValue()).c(t7kVar, (bj9) (nq9Var2 != null ? nq9Var2.a() : null), jSONObject));
                }
                break;
        }
        throw a8k.l(jSONObject, "type", str);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, nq9 nq9Var) {
        boolean z = nq9Var instanceof bq9;
        t6f t6fVar = this.a;
        if (z) {
            return ((x29) t6fVar.k4.getValue()).b(t7kVar, ((bq9) nq9Var).a);
        }
        if (nq9Var instanceof zp9) {
            return ((r19) t6fVar.b4.getValue()).b(t7kVar, ((zp9) nq9Var).a);
        }
        if (nq9Var instanceof lq9) {
            return ((xr9) t6fVar.N8.getValue()).b(t7kVar, ((lq9) nq9Var).a);
        }
        if (nq9Var instanceof gq9) {
            return ((xi9) t6fVar.Z6.getValue()).b(t7kVar, ((gq9) nq9Var).a);
        }
        if (nq9Var instanceof wp9) {
            return ((tt8) t6fVar.w2.getValue()).b(t7kVar, ((wp9) nq9Var).a);
        }
        if (nq9Var instanceof aq9) {
            return ((a29) t6fVar.e4.getValue()).b(t7kVar, ((aq9) nq9Var).a);
        }
        if (nq9Var instanceof yp9) {
            return ((b19) t6fVar.Y3.getValue()).b(t7kVar, ((yp9) nq9Var).a);
        }
        if (nq9Var instanceof eq9) {
            return ((ob9) t6fVar.M5.getValue()).b(t7kVar, ((eq9) nq9Var).a);
        }
        if (nq9Var instanceof kq9) {
            return ((ip9) t6fVar.h8.getValue()).b(t7kVar, ((kq9) nq9Var).a);
        }
        if (nq9Var instanceof iq9) {
            return ((jm9) t6fVar.J7.getValue()).b(t7kVar, ((iq9) nq9Var).a);
        }
        if (nq9Var instanceof xp9) {
            return ((fv8) t6fVar.L2.getValue()).b(t7kVar, ((xp9) nq9Var).a);
        }
        if (nq9Var instanceof cq9) {
            return ((x39) t6fVar.q4.getValue()).b(t7kVar, ((cq9) nq9Var).a);
        }
        if (nq9Var instanceof hq9) {
            return ((ll9) t6fVar.x7.getValue()).b(t7kVar, ((hq9) nq9Var).a);
        }
        if (nq9Var instanceof jq9) {
            return ((mo9) t6fVar.e8.getValue()).b(t7kVar, ((jq9) nq9Var).a);
        }
        if (nq9Var instanceof dq9) {
            return ((p59) t6fVar.T4.getValue()).b(t7kVar, ((dq9) nq9Var).a);
        }
        if (nq9Var instanceof fq9) {
            return ((hi9) t6fVar.T6.getValue()).b(t7kVar, ((fq9) nq9Var).a);
        }
        if (nq9Var instanceof mq9) {
            return ((vz9) t6fVar.S9.getValue()).b(t7kVar, ((mq9) nq9Var).a);
        }
        b6e.s();
        return null;
    }
}
