package ru.yandex.taxi.layers.presentation;

import defpackage.a4e0;
import defpackage.mbp0;
import defpackage.nm40;
import defpackage.w3e0;
import defpackage.weu;
import java.util.Map;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;

/* loaded from: classes9.dex */
public final class h implements w3e0 {
    public Map a = kotlin.collections.b.f();
    public final /* synthetic */ a4e0 b;

    public h(a4e0 a4e0Var) {
        this.b = a4e0Var;
    }

    @Override // defpackage.w3e0
    public final void P(Map map) {
        a4e0 a4e0Var = this.b;
        ru.yandex.taxi.map_common.map.process.a.b(a4e0Var.w, map.values(), 10, new weu(29, a4e0Var));
        if (map.isEmpty()) {
            return;
        }
        this.a = kotlin.collections.b.n(this.a, map);
    }

    @Override // defpackage.w3e0
    public final void S9(String str) {
        nm40 nm40Var = (nm40) this.a.get(str);
        if (nm40Var == null || nm40Var.e()) {
            return;
        }
        nm40Var.f(true);
        a4e0 a4e0Var = this.b;
        a4e0Var.w.a(MapComputationsProcessor$ExecuteOn.MAIN, new PolygonsOverlay$MvpImpl$selectPolygon$1(a4e0Var, nm40Var, null));
    }

    @Override // defpackage.w3e0
    public final void d5(String str) {
        nm40 nm40Var = (nm40) this.a.get(str);
        if (nm40Var != null && nm40Var.e()) {
            nm40Var.f(false);
            a4e0 a4e0Var = this.b;
            a4e0Var.w.a(MapComputationsProcessor$ExecuteOn.MAIN, new PolygonsOverlay$MvpImpl$deselectPolygon$1(a4e0Var, nm40Var, null));
        }
    }

    @Override // defpackage.w3e0
    public final void hide() {
        this.a = kotlin.collections.b.f();
        a4e0 a4e0Var = this.b;
        mbp0 mbp0Var = a4e0Var.w;
        kotlinx.coroutines.a.g(mbp0Var.b.a, null);
        mbp0Var.a(MapComputationsProcessor$ExecuteOn.MAIN, new PolygonsOverlay$MvpImpl$hide$1(a4e0Var, null));
    }
}
