package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.wavefortwo.data.MultiwaveGroupDuplicationDetails;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class pzl extends ikg {
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final Object b;

    public pzl(gqu gquVar) {
        this.b = gquVar;
        hfb hfbVar = (hfb) gquVar.b.getValue();
        hfbVar.getClass();
        LinkedHashMap linkedHashMap = hfbVar.a;
        if (linkedHashMap.containsKey("ROOM_DUPLICATION")) {
            Assertions.fail("class " + MultiwaveGroupDuplicationDetails.class + " is already registered for error ROOM_DUPLICATION");
        }
        linkedHashMap.put("ROOM_DUPLICATION", MultiwaveGroupDuplicationDetails.class);
        a(new hqu(this, 0));
    }

    public boolean d() {
        return ((Boolean) ((jyr) this.b).getValue()).booleanValue();
    }

    public pzl(u12 u12Var) {
        this.b = u12Var;
        a(new gyq(this, 0));
    }

    public pzl(dx5 dx5Var) {
        this.b = dx5Var;
        a(new lxv(this, 0));
    }

    public pzl(jac jacVar) {
        this.b = btf.b(new h8v(16, jacVar));
        a(new xhv(jacVar, this, 0));
    }

    public pzl(qdc qdcVar) {
        this.b = qdcVar;
        if (this.a == null) {
            o18 o18Var = new o18();
            o18Var.c = hag.I(tmb.class);
            rp7 rp7Var = o18Var.b;
            rp7Var.getClass();
            rp7Var.E(new s8i(22, this));
            this.a = new qdc(new ix6(o18Var.a));
            return;
        }
        xq0.q("Di already initialized");
        throw null;
    }

    public pzl(l5m l5mVar) {
        this.b = l5mVar;
        a(new m5m(this, 0));
    }

    public pzl(t5m t5mVar) {
        this.b = t5mVar;
        a(new x5m(this, 8));
    }

    public pzl(h7m h7mVar) {
        this.b = h7mVar;
        a(new j7m(this, 0));
    }

    public pzl(l8m l8mVar) {
        this.b = l8mVar;
        a(new r8m(this, 0));
    }

    public pzl(m8m m8mVar) {
        this.b = m8mVar;
        a(new v8m(this, 0));
    }

    public pzl(j7r j7rVar) {
        this.b = j7rVar;
        a(new i7r(this, 0));
    }

    public pzl(k7r k7rVar) {
        this.b = k7rVar;
        if (this.a == null) {
            o18 o18Var = new o18();
            o18Var.c = hag.I(h8r.class);
            rp7 rp7Var = o18Var.b;
            rp7Var.getClass();
            rp7Var.D(new kzp(20, this));
            this.a = new qdc(new ix6(o18Var.a));
            return;
        }
        xq0.q("Di already initialized");
        throw null;
    }

    public pzl(l7r l7rVar) {
        this.b = l7rVar;
        if (this.a == null) {
            o18 o18Var = new o18();
            o18Var.c = hag.I(y7r.class);
            rp7 rp7Var = o18Var.b;
            rp7Var.getClass();
            rp7Var.D(new kzp(19, this));
            this.a = new qdc(new ix6(o18Var.a));
            return;
        }
        xq0.q("Di already initialized");
        throw null;
    }

    public pzl(o oVar) {
        this.b = oVar;
        a(new zuv(this, 0));
    }

    public pzl(dru druVar) {
        this.b = druVar;
        if (this.a == null) {
            o18 o18Var = new o18();
            o18Var.c = hag.I(mpu.class);
            rp7 rp7Var = o18Var.b;
            rp7Var.getClass();
            rp7Var.E(new r3s(24, this));
            this.a = new qdc(new ix6(o18Var.a));
            return;
        }
        xq0.q("Di already initialized");
        throw null;
    }

    public pzl(efv efvVar) {
        this.b = efvVar;
        a(new lfv(this, 0));
    }
}
