package ru.yandex.taxi.masstransit.overlay;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.ah00;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.czo0;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.i3g;
import defpackage.lx4;
import defpackage.m010;
import defpackage.qoi0;
import defpackage.r8;
import defpackage.rn00;
import defpackage.sy00;
import defpackage.un0;
import defpackage.y35;
import defpackage.ztv0;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes6.dex */
public final class a extends r8 {
    public y35 A;
    public final i3g c;
    public final m010 w;
    public final ztv0 x;
    public final cyx y;
    public final hbp0 z;

    public a(i3g i3gVar, m010 m010Var, ztv0 ztv0Var, cyx cyxVar, ah00 ah00Var) {
        super(5, ah00Var);
        this.c = i3gVar;
        this.w = m010Var;
        this.x = ztv0Var;
        this.y = cyxVar;
        String d = qoi0.a(a.class).d();
        this.z = new hbp0(new czo0(14), d == null ? "" : d, null);
    }

    public final void attach() {
        hbp0 hbp0Var = this.z;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new MtCombinedOverlay$attach$1(this, null), 3);
    }

    public final void detach() {
        this.y.b(new byx(Screen.DISCOVERY, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null)));
        ru.yandex.taxi.masstransit.router.e c = this.c.c();
        c.a();
        sy00 sy00Var = c.a;
        lx4 lx4Var = sy00Var.a;
        ((j) lx4Var).m.o.remove(sy00Var.g);
        m010 m010Var = c.g;
        m010Var.c.b();
        rn00 rn00Var = c.l;
        rn00Var.a.remove(MapObjectType.STOP);
        m010Var.e.remove(c.i);
        this.z.b();
        ((gh00) ((ah00) this.b)).I(true);
    }
}
