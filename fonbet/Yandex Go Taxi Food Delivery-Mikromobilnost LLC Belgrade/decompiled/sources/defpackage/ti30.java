package defpackage;

import android.content.Context;
import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import ru.yandex.taxi.discovery.a;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.masstransit.ui.discovery.MtDiscoveryModalView;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes6.dex */
public final class ti30 implements swj {
    public final Context a;
    public final dwc b;
    public final w3i c;
    public m020 d;
    public wg30 e;

    public ti30(Context context, dwc dwcVar, w3i w3iVar) {
        this.a = context;
        this.b = dwcVar;
        this.c = w3iVar;
    }

    @Override // defpackage.swj
    public final ModalView a(apf apfVar) {
        m020 m020Var = new m020(21, this);
        wg30 wg30Var = new wg30(2, this);
        nx9 nx9Var = new nx9(1);
        w3i w3iVar = this.c;
        kqe kqeVar = (kqe) w3iVar.w;
        Context context = (Context) w3iVar.b;
        xv10 xv10Var = ((vz30) w3iVar.x).a;
        ShortcutsView a = kqeVar.a(context, new uz30(m020Var, wg30Var, i5m.a((xvf0) xv10Var.a), (g3g) xv10Var.b, (zuj0) ((xvf0) xv10Var.c).get(), (xvf0) xv10Var.w, (oep0) ((g3g) xv10Var.x).get()), ((uxr0) w3iVar.y).a(nx9Var), new s1s0(), new krl0("masstransit", nx9Var), new uhx(21, w3iVar), ShortcutViewSourceType.MASSTRANSIT);
        return new MtDiscoveryModalView(this.a, (a) i5m.a((rs0) apfVar.c).get(), (c) i5m.a((n3w) apfVar.w).get(), (wwj) i5m.a((azf) apfVar.x).get(), this.b, a);
    }
}
