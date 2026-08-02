package defpackage;

import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bl8 implements u8s {
    public final t6f a;

    public bl8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final uk8 a(t7k t7kVar, zl8 zl8Var, JSONObject jSONObject) {
        boolean z = zl8Var instanceof cl8;
        t6f t6fVar = this.a;
        if (z) {
            return new xj8(((fd8) t6fVar.M.getValue()).a(t7kVar, ((cl8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof dl8) {
            ld8 ld8Var = (ld8) t6fVar.P.getValue();
            md8 md8Var = ((dl8) zl8Var).a;
            ld8Var.getClass();
            return new yj8(new id8((String) h4a.C(md8Var.a, jSONObject, "animator_id", bcx.i, bcx.h)));
        }
        if (zl8Var instanceof el8) {
            return new zj8(((qd8) t6fVar.S.getValue()).a(t7kVar, ((el8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof fl8) {
            vd8 vd8Var = (vd8) t6fVar.V.getValue();
            wd8 wd8Var = ((fl8) zl8Var).a;
            vd8Var.getClass();
            return new ak8(new sd8(h4a.G(t7kVar, wd8Var.a, jSONObject, "index", vct.b, kzj.F), h4a.F(t7kVar, wd8Var.b, jSONObject, "variable_name", vct.c)));
        }
        if (zl8Var instanceof gl8) {
            return new bk8(((ae8) t6fVar.Y.getValue()).a(t7kVar, ((gl8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof hl8) {
            ((te8) t6fVar.b0.getValue()).getClass();
            return new ck8(new qe8());
        }
        if (zl8Var instanceof il8) {
            hf8 hf8Var = (hf8) t6fVar.h0.getValue();
            if8 if8Var = ((il8) zl8Var).a;
            hf8Var.getClass();
            c9c c9cVar = if8Var.a;
            t6f t6fVar2 = hf8Var.a;
            return new dk8(new ve8((ye8) h4a.D(t7kVar, c9cVar, jSONObject, "content", t6fVar2.e0, t6fVar2.c0)));
        }
        if (zl8Var instanceof kl8) {
            return new fk8(((rf8) t6fVar.n0.getValue()).a(t7kVar, ((kl8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof ll8) {
            return new gk8(((wf8) t6fVar.q0.getValue()).a(t7kVar, ((ll8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof ml8) {
            cg8 cg8Var = (cg8) t6fVar.t0.getValue();
            dg8 dg8Var = ((ml8) zl8Var).a;
            cg8Var.getClass();
            return new hk8(new zf8(h4a.F(t7kVar, dg8Var.a, jSONObject, "element_id", vct.c)));
        }
        if (zl8Var instanceof nl8) {
            ig8 ig8Var = (ig8) t6fVar.w0.getValue();
            jg8 jg8Var = ((nl8) zl8Var).a;
            ig8Var.getClass();
            return new ik8(new fg8(h4a.F(t7kVar, jg8Var.a, jSONObject, ConnectableDevice.KEY_ID, vct.c)));
        }
        if (zl8Var instanceof ol8) {
            vg8 vg8Var = (vg8) t6fVar.z0.getValue();
            xg8 xg8Var = ((ol8) zl8Var).a;
            vg8Var.getClass();
            return new jk8(vg8.b(t7kVar, xg8Var, jSONObject));
        }
        if (zl8Var instanceof pl8) {
            return new kk8(((qh8) t6fVar.F0.getValue()).a(t7kVar, ((pl8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof rl8) {
            fi8 fi8Var = (fi8) t6fVar.O0.getValue();
            hi8 hi8Var = ((rl8) zl8Var).a;
            fi8Var.getClass();
            return new mk8(fi8.b(t7kVar, hi8Var, jSONObject));
        }
        if (zl8Var instanceof sl8) {
            return new nk8(((mi8) t6fVar.R0.getValue()).a(t7kVar, ((sl8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof tl8) {
            return new ok8(((si8) t6fVar.U0.getValue()).a(t7kVar, ((tl8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof ul8) {
            xi8 xi8Var = (xi8) t6fVar.X0.getValue();
            yi8 yi8Var = ((ul8) zl8Var).a;
            xi8Var.getClass();
            return new pk8(new ui8(h4a.F(t7kVar, yi8Var.a, jSONObject, ConnectableDevice.KEY_ID, vct.c), h4a.O(t7kVar, yi8Var.b, jSONObject, "multiple", vct.a, kzj.B)));
        }
        if (zl8Var instanceof vl8) {
            return new qk8(((fj8) t6fVar.a1.getValue()).a(t7kVar, ((vl8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof wl8) {
            uj8 uj8Var = (uj8) t6fVar.j1.getValue();
            wj8 wj8Var = ((wl8) zl8Var).a;
            uj8Var.getClass();
            return new rk8(new rj8(h4a.G(t7kVar, wj8Var.a, jSONObject, Constants.KEY_ACTION, vj8.a, va8.L), h4a.F(t7kVar, wj8Var.b, jSONObject, ConnectableDevice.KEY_ID, vct.c)));
        }
        if (zl8Var instanceof xl8) {
            return new sk8(((em8) t6fVar.p1.getValue()).a(t7kVar, ((xl8) zl8Var).a, jSONObject));
        }
        if (zl8Var instanceof yl8) {
            km8 km8Var = (km8) t6fVar.s1.getValue();
            mm8 mm8Var = ((yl8) zl8Var).a;
            km8Var.getClass();
            return new tk8(new hm8(h4a.G(t7kVar, mm8Var.a, jSONObject, Constants.KEY_ACTION, lm8.a, va8.Z), h4a.F(t7kVar, mm8Var.b, jSONObject, ConnectableDevice.KEY_ID, vct.c)));
        }
        if (zl8Var instanceof jl8) {
            ((mf8) t6fVar.k0.getValue()).getClass();
            return new ek8(new jf8());
        }
        if (zl8Var instanceof ql8) {
            return new lk8(((xh8) t6fVar.I0.getValue()).a(t7kVar, ((ql8) zl8Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
