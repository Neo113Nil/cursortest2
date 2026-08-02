package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class zf5 implements lf5 {
    public final Context a;
    public final jyr b;
    public final z66 c;
    public final ezb d;
    public final uaa e;
    public final kij f;
    public final jyr g;
    public final jyr h;
    public final long i;
    public final long j;

    public zf5(Context context, jyr jyrVar, z66 z66Var, ezb ezbVar, uaa uaaVar, kij kijVar) {
        this.a = context;
        this.b = jyrVar;
        this.c = z66Var;
        this.d = ezbVar;
        this.e = uaaVar;
        this.f = kijVar;
        bdt I = hag.I(oq7.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = l18Var.b(hag.I(t3g.class), true);
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.MILLISECONDS;
        this.i = yd5.M(250, ssaVar);
        this.j = yd5.M(15, ssaVar);
    }

    @Override // defpackage.lf5
    public final pjc a(mqs mqsVar) {
        mqsVar.getClass();
        return mqsVar.k == dg2.b ? zsd.b0(new u21(10, new pf5(((e6q) this.e).e, mqsVar, 2), new d64(this.c.c(), 14), new ib3(3, 2, null))) : new fs(15, Boolean.FALSE);
    }

    @Override // defpackage.lf5
    public final pjc b(mqs mqsVar) {
        return zsd.b0(new pf5(j().a.d, mqsVar, 3));
    }

    @Override // defpackage.lf5
    public final pjc c() {
        return zsd.b0(new d64(j().a.c, 12));
    }

    @Override // defpackage.lf5
    public final pjc d(mqs mqsVar) {
        mqsVar.getClass();
        return zsd.b0(new u21(10, ((e6q) this.e).e, this.f.c, new mf5(mqsVar, null, 0)));
    }

    @Override // defpackage.lf5
    public final pjc e(mqs mqsVar) {
        mqsVar.getClass();
        return zsd.b0(new d64(((t3g) this.h.getValue()).w(mqsVar), 13));
    }

    @Override // defpackage.lf5
    public final pjc f(mqs mqsVar) {
        mqsVar.getClass();
        return zsd.b0(new pf5(j().a.c, mqsVar, 1));
    }

    @Override // defpackage.lf5
    public final pjc g(mqs mqsVar) {
        return zsd.M0(zsd.b0(new pf5(j().a.d, mqsVar, 0)), new l1((Continuation) null, this, 16));
    }

    @Override // defpackage.lf5
    public final pjc h(mqs mqsVar) {
        mqsVar.getClass();
        return new pf5(this.d.d, mqsVar, 4);
    }

    @Override // defpackage.lf5
    public final boolean i() {
        if (this.a.getResources().getBoolean(R.bool.is_tablet)) {
            return false;
        }
        return ((Boolean) ((icu) this.b.getValue()).a.getValue()).booleanValue();
    }

    public final oq7 j() {
        return (oq7) this.g.getValue();
    }
}
