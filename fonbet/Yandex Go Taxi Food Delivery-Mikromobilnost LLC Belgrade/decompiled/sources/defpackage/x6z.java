package defpackage;

import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.systemrequeirements.location.LocationActivityResultHandler$onActivityCreate$$inlined$safeCollectIn$1;
import ru.yandex.taxi.systemrequeirements.location.b;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes10.dex */
public final class x6z implements vw60 {
    public final n a;
    public final g b;
    public final tse c;

    public x6z(n nVar, g gVar, tse tseVar) {
        this.a = nVar;
        this.b = gVar;
        this.c = tseVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        tje.N(this.c, null, null, new LocationActivityResultHandler$onActivityCreate$$inlined$safeCollectIn$1(new b(this.b.b), null, this), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LocationActivityResultHandler";
    }
}
