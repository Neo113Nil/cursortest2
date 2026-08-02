package defpackage;

import android.content.Context;
import ru.yandex.taxi.stories.data.caching.a;
import ru.yandex.taxi.stories.domain.b;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.d;

/* loaded from: classes10.dex */
public final class tlu0 {
    public final Context a;
    public final b7z0 b;
    public final pav c;
    public final a d;
    public final cou0 e;
    public final klf0 f;
    public final zpf0 g;
    public final d h;
    public final kay0 i;
    public final pdc j;
    public final h8u0 k;
    public final zuj0 l;
    public final gnu0 m;
    public final c n;
    public final b o;

    public tlu0(Context context, tay0 tay0Var, pav pavVar, a aVar, lay0 lay0Var, n9y0 n9y0Var, zpf0 zpf0Var, d dVar, kay0 kay0Var, o370 o370Var, z1u z1uVar, uwx0 uwx0Var, pdc pdcVar, eyu0 eyu0Var, h8u0 h8u0Var, zuj0 zuj0Var, r820 r820Var, ru.yandex.taxi.communications.common.repository.a aVar2, ru.yandex.taxi.communications.d dVar2, wnt wntVar, ru.yandex.taxi.communications.c cVar) {
        this.a = context;
        this.b = tay0Var;
        this.c = pavVar;
        this.d = aVar;
        this.e = lay0Var;
        this.f = n9y0Var;
        this.g = zpf0Var;
        this.h = dVar;
        this.i = kay0Var;
        this.j = pdcVar;
        this.k = h8u0Var;
        this.l = zuj0Var;
        this.m = new gnu0(o370Var);
        this.n = new c(pavVar, context, uwx0Var, z1uVar, pdcVar, r820Var, eyu0Var);
        ru.yandex.taxi.stories.data.repositories.items.b bVar = new ru.yandex.taxi.stories.data.repositories.items.b(new ru.yandex.taxi.stories.data.data_sources.items.local.a(new ru.yandex.taxi.stories.data.storage.a(cVar, wntVar, context)), new ru.yandex.taxi.stories.data.data_sources.items.remote.single.a(aVar2, dVar2), new ru.yandex.taxi.stories.data.data_sources.items.remote.diff.a(aVar2));
        sul sulVar = new sul(context);
        anu0 anu0Var = new anu0(new mmu0(pavVar, aVar), new rlu0(dVar, aVar), aVar);
        ru.yandex.taxi.stories.domain.provider.a aVar3 = new ru.yandex.taxi.stories.domain.provider.a(lay0Var, zpf0Var, new knu0(), bVar, sulVar);
        this.o = new b(context.getApplicationContext().getResources().getDisplayMetrics().densityDpi, anu0Var, bVar, sulVar, aVar3, new ru.yandex.taxi.stories.domain.notifications.a(aVar3), lay0Var);
    }
}
