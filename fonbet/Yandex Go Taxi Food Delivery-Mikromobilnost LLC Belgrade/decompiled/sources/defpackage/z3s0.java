package defpackage;

import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes6.dex */
public final class z3s0 extends h {
    public final /* synthetic */ ShortcutsView t;

    public z3s0(ShortcutsView shortcutsView) {
        this.t = shortcutsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final long l() {
        boolean z;
        z = this.t.skipAddAnimation;
        if (z) {
            return 0L;
        }
        return this.c;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void n() {
        this.t.skipAddAnimation = false;
        super.n();
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean o(x0 x0Var) {
        boolean z;
        super.o(x0Var);
        z = this.t.skipAddAnimation;
        if (z) {
            x0Var.a.setAlpha(1.0f);
        }
        return true;
    }
}
