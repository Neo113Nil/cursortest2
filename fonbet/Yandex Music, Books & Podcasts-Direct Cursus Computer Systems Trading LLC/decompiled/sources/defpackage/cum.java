package defpackage;

import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class cum {
    public final fnb a;
    public final hq0 b;
    public final jfu c;
    public final yxc d;
    public final z66 e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final zza i;
    public final jyr j;
    public gum k;
    public final jyr l;
    public final jyr m;
    public String n;
    public final yiq o;
    public final mm6 p;
    public awc q;
    public final jyr r;

    public cum(fnb fnbVar, hq0 hq0Var, jfu jfuVar) {
        fnbVar.getClass();
        jfuVar.getClass();
        this.a = fnbVar;
        this.b = hq0Var;
        this.c = jfuVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.d = v3g.E((frt) qdcVar.C(I));
        bdt I2 = hag.I(z66.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        z66 z66Var = (z66) qdcVar2.C(I2);
        this.e = z66Var;
        this.f = l18Var.b(hag.I(bsr.class), true);
        this.g = l18Var.b(hag.I(eg2.class), true);
        this.h = btf.b(new ztm(this, 0));
        bdt I3 = hag.I(zza.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        this.i = (zza) qdcVar3.C(I3);
        this.j = l18Var.b(hag.I(av0.class), true);
        this.l = l18Var.b(hag.I(x7m.class), true);
        jyr b = btf.b(new ztm(this, 1));
        this.m = b;
        yiq yiqVar = new yiq();
        this.o = yiqVar;
        mm6 r = hld.r(yiqVar, dm6.b());
        this.p = r;
        this.r = btf.b(new ztm(this, 2));
        x97.y(r, null, null, new g2l(this, null, 20), 3);
        bdt I4 = hag.I(byb.class);
        qdc qdcVar4 = l18Var.a;
        qdcVar4.getClass();
        if (!((h9m) ((byb) qdcVar4.C(I4)).b(h9m.class)).h() && z66Var.g()) {
            ((g5k) b.getValue()).a();
        }
        ox6.B(z66Var.c(), r, new aum(this, 0));
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((h9m) ((byb) qdcVar.C(I)).b(h9m.class)).h()) {
            arrayList.add(new pq(new xb5(new ztm(this, 3), null, R.string.profile_manage_subscription, null, null, true, Integer.valueOf(R.string.action_description_manage_subscription), null, false, false, null, 1872), dh.w));
        }
        if (woe.d(this.b)) {
            arrayList.add(new pq(new xb5(new ztm(this, 4), null, R.string.chat_write_to_support, null, null, true, Integer.valueOf(R.string.action_description_contact_support), null, false, ((Boolean) ((vdr) this.r.getValue()).getValue()).booleanValue(), ((Boolean) ((vdr) this.r.getValue()).getValue()).booleanValue() ? Integer.valueOf(R.string.has_notification) : null, 848), dh.x));
        }
        arrayList.add(new pq(new xb5(new ztm(this, 5), null, R.string.settings, null, null, true, Integer.valueOf(R.string.action_description_settings), null, false, false, null, 1880), dh.y));
        jyr jyrVar = tn4.a;
        if (xz0.u(new rn4[]{rn4.b}, (rn4) tn4.b.getValue())) {
            arrayList.add(new pq(new xb5(new ztm(this, 6), null, R.string.restore_purchases, null, null, true, Integer.valueOf(R.string.action_description_restore_purchases), null, false, false, null, 1872), dh.z));
        }
        arrayList.add(new pq(new xb5(new ztm(this, 7), null, R.string.profile_open_wizard, null, null, true, Integer.valueOf(R.string.action_description_open_wizard), null, false, false, null, 1872), dh.A));
        arrayList.add(new pq(new xb5(new ztm(this, 8), null, R.string.profile_manage_userpic, null, null, true, Integer.valueOf(R.string.action_description_manage_userpic), null, false, false, null, 1872), dh.B));
        arrayList.add(new pq(new xb5(new ztm(this, 9), null, R.string.profile_delete_account, null, null, true, Integer.valueOf(R.string.action_description_delete_account), null, false, false, null, 1872), dh.C));
        return arrayList;
    }

    public final eum b() {
        return (eum) this.h.getValue();
    }
}
