package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zk8 implements gip, py7 {
    public final t6f a;

    public zk8(t6f t6fVar) {
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
            case -1623648839:
                if (b0.equals("set_variable")) {
                    return new ok8(((qi8) t6fVar.S0.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -1623635702:
                if (b0.equals("animator_start")) {
                    return new xj8(((dd8) t6fVar.K.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -1349088399:
                if (b0.equals("custom")) {
                    ((kf8) t6fVar.i0.getValue()).getClass();
                    return new ek8(new jf8());
                }
                break;
            case -1254965146:
                if (b0.equals("clear_focus")) {
                    ((re8) t6fVar.Z.getValue()).getClass();
                    return new ck8(new qe8());
                }
                break;
            case -1160753574:
                if (b0.equals("animator_stop")) {
                    ((jd8) t6fVar.N.getValue()).getClass();
                    return new yj8(new id8((String) etn.P("animator_id", jSONObject)));
                }
                break;
            case -891535336:
                if (b0.equals("submit")) {
                    return new qk8(((dj8) t6fVar.Y0.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -796594542:
                if (b0.equals("set_stored_value")) {
                    return new nk8(((ki8) t6fVar.P0.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -404256420:
                if (b0.equals("copy_to_clipboard")) {
                    return new dk8(((ff8) t6fVar.f0.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case -326583939:
                if (b0.equals("update_structure")) {
                    return new sk8(((cm8) t6fVar.n1.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 10055918:
                if (b0.equals("array_set_value")) {
                    return new bk8(((yd8) t6fVar.W.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 110364485:
                if (b0.equals("timer")) {
                    ((sj8) t6fVar.h1.getValue()).getClass();
                    return new rk8(sj8.c(t7kVar, jSONObject));
                }
                break;
            case 112202875:
                if (b0.equals("video")) {
                    ((im8) t6fVar.q1.getValue()).getClass();
                    return new tk8(im8.c(t7kVar, jSONObject));
                }
                break;
            case 203934236:
                if (b0.equals("array_remove_value")) {
                    ((td8) t6fVar.T.getValue()).getClass();
                    return new ak8(td8.c(t7kVar, jSONObject));
                }
                break;
            case 301532353:
                if (b0.equals("show_tooltip")) {
                    ((vi8) t6fVar.V0.getValue()).getClass();
                    return new pk8(vi8.c(t7kVar, jSONObject));
                }
                break;
            case 417790729:
                if (b0.equals("scroll_by")) {
                    ((tg8) t6fVar.x0.getValue()).getClass();
                    return new jk8(tg8.c(t7kVar, jSONObject));
                }
                break;
            case 417791277:
                if (b0.equals("scroll_to")) {
                    return new kk8(((oh8) t6fVar.D0.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 932090484:
                if (b0.equals("set_state")) {
                    ((di8) t6fVar.M0.getValue()).getClass();
                    return new mk8(di8.c(t7kVar, jSONObject));
                }
                break;
            case 1427818632:
                if (b0.equals("download")) {
                    return new gk8(((uf8) t6fVar.o0.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 1550697109:
                if (b0.equals("focus_element")) {
                    ((ag8) t6fVar.r0.getValue()).getClass();
                    return new hk8(new zf8(e5f.a(t7kVar, jSONObject, "element_id", vct.c)));
                }
                break;
            case 1587919371:
                if (b0.equals("dict_set_value")) {
                    return new fk8(((pf8) t6fVar.l0.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 1650796053:
                if (b0.equals("set_cursor_position")) {
                    return new lk8(((vh8) t6fVar.G0.getValue()).a(t7kVar, jSONObject));
                }
                break;
            case 1715728902:
                if (b0.equals("hide_tooltip")) {
                    ((gg8) t6fVar.u0.getValue()).getClass();
                    return new ik8(new fg8(e5f.a(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vct.c)));
                }
                break;
            case 1811437713:
                if (b0.equals("array_insert_value")) {
                    return new zj8(((od8) t6fVar.Q.getValue()).a(t7kVar, jSONObject));
                }
                break;
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        zl8 zl8Var = t instanceof zl8 ? (zl8) t : null;
        if (zl8Var != null) {
            return ((bl8) t6fVar.m1.getValue()).a(t7kVar, zl8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, uk8 uk8Var) {
        boolean z = uk8Var instanceof xj8;
        t6f t6fVar = this.a;
        if (z) {
            return ((dd8) t6fVar.K.getValue()).b(t7kVar, ((xj8) uk8Var).b);
        }
        if (uk8Var instanceof yj8) {
            jd8 jd8Var = (jd8) t6fVar.N.getValue();
            id8 id8Var = ((yj8) uk8Var).b;
            jd8Var.getClass();
            return jd8.c(t7kVar, id8Var);
        }
        if (uk8Var instanceof zj8) {
            return ((od8) t6fVar.Q.getValue()).b(t7kVar, ((zj8) uk8Var).b);
        }
        if (uk8Var instanceof ak8) {
            td8 td8Var = (td8) t6fVar.T.getValue();
            sd8 sd8Var = ((ak8) uk8Var).b;
            td8Var.getClass();
            return td8.d(t7kVar, sd8Var);
        }
        if (uk8Var instanceof bk8) {
            return ((yd8) t6fVar.W.getValue()).b(t7kVar, ((bk8) uk8Var).b);
        }
        if (uk8Var instanceof ck8) {
            ((re8) t6fVar.Z.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "clear_focus");
            return jSONObject;
        }
        if (uk8Var instanceof dk8) {
            return ((ff8) t6fVar.f0.getValue()).b(t7kVar, ((dk8) uk8Var).b);
        }
        if (uk8Var instanceof fk8) {
            return ((pf8) t6fVar.l0.getValue()).b(t7kVar, ((fk8) uk8Var).b);
        }
        if (uk8Var instanceof gk8) {
            return ((uf8) t6fVar.o0.getValue()).b(t7kVar, ((gk8) uk8Var).b);
        }
        if (uk8Var instanceof hk8) {
            ag8 ag8Var = (ag8) t6fVar.r0.getValue();
            zf8 zf8Var = ((hk8) uk8Var).b;
            ag8Var.getClass();
            return ag8.c(t7kVar, zf8Var);
        }
        if (uk8Var instanceof ik8) {
            gg8 gg8Var = (gg8) t6fVar.u0.getValue();
            fg8 fg8Var = ((ik8) uk8Var).b;
            gg8Var.getClass();
            return gg8.c(t7kVar, fg8Var);
        }
        if (uk8Var instanceof jk8) {
            tg8 tg8Var = (tg8) t6fVar.x0.getValue();
            sg8 sg8Var = ((jk8) uk8Var).b;
            tg8Var.getClass();
            return tg8.d(t7kVar, sg8Var);
        }
        if (uk8Var instanceof kk8) {
            return ((oh8) t6fVar.D0.getValue()).b(t7kVar, ((kk8) uk8Var).b);
        }
        if (uk8Var instanceof mk8) {
            di8 di8Var = (di8) t6fVar.M0.getValue();
            ci8 ci8Var = ((mk8) uk8Var).b;
            di8Var.getClass();
            return di8.d(t7kVar, ci8Var);
        }
        if (uk8Var instanceof nk8) {
            return ((ki8) t6fVar.P0.getValue()).b(t7kVar, ((nk8) uk8Var).b);
        }
        if (uk8Var instanceof ok8) {
            return ((qi8) t6fVar.S0.getValue()).b(t7kVar, ((ok8) uk8Var).b);
        }
        if (uk8Var instanceof pk8) {
            vi8 vi8Var = (vi8) t6fVar.V0.getValue();
            ui8 ui8Var = ((pk8) uk8Var).b;
            vi8Var.getClass();
            return vi8.d(t7kVar, ui8Var);
        }
        if (uk8Var instanceof qk8) {
            return ((dj8) t6fVar.Y0.getValue()).b(t7kVar, ((qk8) uk8Var).b);
        }
        if (uk8Var instanceof rk8) {
            sj8 sj8Var = (sj8) t6fVar.h1.getValue();
            rj8 rj8Var = ((rk8) uk8Var).b;
            sj8Var.getClass();
            return sj8.d(t7kVar, rj8Var);
        }
        if (uk8Var instanceof sk8) {
            return ((cm8) t6fVar.n1.getValue()).b(t7kVar, ((sk8) uk8Var).b);
        }
        if (uk8Var instanceof tk8) {
            im8 im8Var = (im8) t6fVar.q1.getValue();
            hm8 hm8Var = ((tk8) uk8Var).b;
            im8Var.getClass();
            return im8.d(t7kVar, hm8Var);
        }
        if (uk8Var instanceof ek8) {
            ((kf8) t6fVar.i0.getValue()).getClass();
            JSONObject jSONObject2 = new JSONObject();
            etn.l0(t7kVar, jSONObject2, "type", "custom");
            return jSONObject2;
        }
        if (uk8Var instanceof lk8) {
            return ((vh8) t6fVar.G0.getValue()).b(t7kVar, ((lk8) uk8Var).b);
        }
        b6e.s();
        return null;
    }
}
