package ru.yandex.taxi.favorites.experiment;

import defpackage.jbh;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.tpr;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;

/* loaded from: classes5.dex */
public final class e implements qqo {
    public final /* synthetic */ qqo a;

    public e(rqo rqoVar) {
        this.a = ((jbh) rqoVar).c(FavoritesCreateRegularAddressExperiment.i);
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final FavoritesCreateRegularAddressExperiment b() {
        return (FavoritesCreateRegularAddressExperiment) this.a.b();
    }

    public final boolean e() {
        if (!b().b || b().c.isEmpty() || !b().d.d() || !b().e.d()) {
            return false;
        }
        List list = b().g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((FavoritesCreateRegularAddressExperiment.a) it.next()).c != FavoritesCreateRegularAddressExperiment.ButtonAction.UNKNOWN) {
                return true;
            }
        }
        return false;
    }
}
