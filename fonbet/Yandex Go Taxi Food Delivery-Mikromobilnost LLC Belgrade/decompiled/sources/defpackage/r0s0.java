package defpackage;

import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.b;
import kotlin.a;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes14.dex */
public final class r0s0 {
    public final i130 a;
    public final z700 b;
    public final i61 c;
    public final ljd d;
    public final yvf0 e;
    public final t4s0 f;
    public final h3y g;
    public final yvf0 h;
    public final c i;
    public final y4k0 j;
    public w40 k;
    public final p0s0 l = new p0s0();

    public r0s0(i130 i130Var, z700 z700Var, i61 i61Var, ljd ljdVar, yvf0 yvf0Var, t4s0 t4s0Var, h3y h3yVar, k4 k4Var, c cVar, y4k0 y4k0Var) {
        this.a = i130Var;
        this.b = z700Var;
        this.c = i61Var;
        this.d = ljdVar;
        this.e = yvf0Var;
        this.f = t4s0Var;
        this.g = h3yVar;
        this.h = k4Var;
        this.i = cVar;
        this.j = y4k0Var;
    }

    public final ShortcutsModalView a(SourcePicker sourcePicker, PointType pointType) {
        i130 i130Var = this.a;
        ShortcutsModalView shortcutsModalView = (ShortcutsModalView) i130Var.a().i(ShortcutsModalView.class);
        if (shortcutsModalView != null) {
            if (sourcePicker != SourcePicker.SHORTCUT_REQUESTED_FROM_HOME) {
                shortcutsModalView.showEditAddress(pointType);
            }
            return shortcutsModalView;
        }
        w40 w40Var = this.k;
        if (w40Var != null) {
            w40Var.a = this.l;
        }
        this.k = null;
        i130Var.a().m(CompositeAddressSearchModalView.class);
        ShortcutsView shortcutsView = (ShortcutsView) this.h.get();
        i3y a = a.a(new xlp0(3, this, sourcePicker, pointType));
        w40 w40Var2 = new w40();
        w40Var2.a = this.b;
        b bVar = (b) this.e.get();
        this.j.getClass();
        ShortcutsModalView shortcutsModalView2 = new ShortcutsModalView(shortcutsView, a, w40Var2, bVar, this.f, this.g, false);
        shortcutsModalView2.setOnAppearingListener(new q0s0(this, sourcePicker, shortcutsModalView2, pointType));
        i130Var.a().s(shortcutsModalView2, false);
        this.k = w40Var2;
        return shortcutsModalView2;
    }
}
