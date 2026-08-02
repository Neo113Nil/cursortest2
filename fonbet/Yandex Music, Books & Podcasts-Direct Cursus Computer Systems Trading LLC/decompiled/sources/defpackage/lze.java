package defpackage;

import android.app.Activity;
import androidx.fragment.app.y;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes4.dex */
public final class lze implements k0f {
    public final cr a;
    public final tze b;
    public final kxi c;
    public final xdr d;
    public final cvo e;
    public final jyr f;

    public lze(cr crVar, tze tzeVar, kxi kxiVar) {
        kxiVar.getClass();
        this.a = crVar;
        this.b = tzeVar;
        this.c = kxiVar;
        this.d = tzeVar.i;
        this.e = tzeVar.g.b.b;
        this.f = btf.b(new v1e(9, this));
    }

    @Override // defpackage.k0f
    public final kxi d() {
        return this.c;
    }

    @Override // defpackage.k0f
    public final cvo e() {
        return this.e;
    }

    @Override // defpackage.k0f
    public final b70 f() {
        b70 b70Var = this.b.g.c;
        if (b70Var != null) {
            return b70Var;
        }
        xq0.x("Required value was null.");
        return null;
    }

    @Override // defpackage.k0f
    public final void g(int i, x1u x1uVar) {
        x1uVar.getClass();
        this.a.T(x1uVar, wmn.b);
        this.b.g.e(new d70(x1uVar.a, c70.i, x1uVar.b, i, ""), null);
    }

    @Override // defpackage.k0f
    public final void h(eul eulVar, int i) {
        eulVar.getClass();
        cr crVar = this.a;
        Activity activity = (Activity) crVar.b;
        int i2 = PlaylistScreenActivity.B0;
        activity.startActivity(dxl.h(activity, eulVar, d.p((nrf) crVar.e)));
        this.b.g.e(ox6.M(eulVar, i, ""), null);
    }

    @Override // defpackage.k0f
    public final void i(mqs mqsVar) {
        mqsVar.getClass();
        this.a.b0(mqsVar);
    }

    @Override // defpackage.k0f
    public final void j(lt ltVar, int i) {
        ltVar.getClass();
        cr crVar = this.a;
        Activity activity = (Activity) crVar.b;
        activity.startActivity(quj.V(activity, ltVar, d.p((nrf) crVar.e)));
        this.b.g.e(ox6.M(ltVar, i, ""), null);
    }

    @Override // defpackage.k0f
    public final void k(x1u x1uVar) {
        x1uVar.getClass();
        cr crVar = this.a;
        rre.b0(x1uVar, (y) crVar.c, (Activity) crVar.b, d.p((nrf) crVar.e), (kxi) crVar.d, ru0.NONE);
    }

    @Override // defpackage.k0f
    public final void l(f0f f0fVar, boolean z, String str, int i) {
        str.getClass();
        this.b.g.h(vwb.Z(f0fVar, i, str), z);
    }

    @Override // defpackage.k0f
    public final void m(yze yzeVar, int i) {
        o43 o43Var = yzeVar.b;
        String str = o43Var.a;
        str.getClass();
        w1g.y((Activity) this.a.b, str, true);
        this.b.g.d(0, i, o43Var.a);
    }

    @Override // defpackage.k0f
    public final void n(mqs mqsVar) {
        mqsVar.getClass();
        this.a.b0(mqsVar);
    }

    @Override // defpackage.k0f
    public final void o(n7n n7nVar, int i, iik iikVar) {
        ((h0h) this.f.getValue()).a(n7nVar, i + 1);
        cr crVar = this.a;
        ((x0h) ((jyr) crVar.h).getValue()).a((y) crVar.c, (kxi) crVar.d, iikVar);
    }

    @Override // defpackage.k0f
    public final void p(u51 u51Var, int i) {
        u51Var.getClass();
        cr crVar = this.a;
        Activity activity = (Activity) crVar.b;
        int i2 = ArtistScreenActivity.w0;
        activity.startActivity(l48.p(activity, u51Var, d.p((nrf) crVar.e), null, 24));
        this.b.g.e(ox6.M(u51Var, i, ""), null);
    }

    @Override // defpackage.k0f
    public final void q(mqs mqsVar, int i) {
        mqsVar.getClass();
        this.a.a0(mqsVar, new v50(this, mqsVar, i, 10));
    }
}
