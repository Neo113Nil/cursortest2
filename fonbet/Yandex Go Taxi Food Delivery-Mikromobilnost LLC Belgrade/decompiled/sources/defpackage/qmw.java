package defpackage;

import android.content.Context;
import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import ru.yandex.taxi.discovery.a;
import ru.yandex.taxi.intercity.ui.IntercityDiscoveryModalView;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes12.dex */
public final class qmw implements swj {
    public final umw a;
    public final Context b;
    public final String c;
    public gau d;

    public qmw(umw umwVar, Context context, String str) {
        this.a = umwVar;
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.swj
    public final ModalView a(apf apfVar) {
        gau gauVar = new gau(25, this);
        umw umwVar = this.a;
        umwVar.getClass();
        String str = this.c;
        tmw tmwVar = new tmw(str);
        kqe kqeVar = umwVar.c;
        Context context = umwVar.a;
        zh0 zh0Var = umwVar.e.a;
        ShortcutsView a = kqeVar.a(context, new rmw((y50) zh0Var.a.get(), zh0Var.b, (zuj0) zh0Var.c.get(), (oep0) zh0Var.d.get(), gauVar), umwVar.h.a(tmwVar), new s1s0(), new krl0(str, tmwVar), new xen(29, umwVar), ShortcutViewSourceType.INTERCITY);
        return new IntercityDiscoveryModalView(this.b, (a) i5m.a((rs0) apfVar.c).get(), (c) i5m.a((n3w) apfVar.w).get(), (wwj) i5m.a((azf) apfVar.x).get(), this.c, a);
    }
}
