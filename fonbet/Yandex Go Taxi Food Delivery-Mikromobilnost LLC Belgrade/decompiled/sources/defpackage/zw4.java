package defpackage;

import android.app.Activity;
import ru.yandex.taxi.search.view.BaseAddressSearchView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public abstract class zw4 {
    public final Activity a;
    public final ney b;
    public final pyv c;
    public final pav d;
    public final c e;
    public final d6v0 f;
    public final e8v0 g;
    public String h;
    public String i;
    public int j;
    public boolean k;

    public zw4(Activity activity, ney neyVar, pyv pyvVar, pav pavVar, c cVar, d6v0 d6v0Var, zuj0 zuj0Var, e8v0 e8v0Var) {
        this.a = activity;
        this.b = neyVar;
        this.c = pyvVar;
        this.d = pavVar;
        this.e = cVar;
        this.f = d6v0Var;
        this.g = e8v0Var;
        avj0 avj0Var = (avj0) zuj0Var;
        this.h = avj0Var.h(kyh0.no_addresses_found);
        this.i = avj0Var.h(kyh0.common_empty_search_text);
    }

    public abstract BaseAddressSearchView a();

    public final void b() {
        this.k = true;
    }

    public final void c(int i) {
        this.j = i;
    }
}
