package ru.yandex.taxi.fragment.favorites;

import defpackage.atd0;
import defpackage.h3y;
import defpackage.mip;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.uzs;
import defpackage.zzs;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes5.dex */
public final class c {
    public final h3y a;

    public c(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final tpr a(mip mipVar) {
        uzs uzsVar = zzs.Companion;
        String str = mipVar.b;
        String str2 = mipVar.c;
        uzsVar.getClass();
        zzs c = uzs.c(str, str2, null);
        return c == null ? new rol0(new FavoritesFromRawParamsInteractor$handleRawParams$1(2, null)) : new b(atd0.c((atd0) this.a.get(), c, RoutePointType.FAVORITE, null, Action.PIN_DROP, null, null, 32), this, mipVar);
    }
}
