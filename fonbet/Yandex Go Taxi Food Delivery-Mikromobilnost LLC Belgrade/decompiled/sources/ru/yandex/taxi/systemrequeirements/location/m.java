package ru.yandex.taxi.systemrequeirements.location;

import defpackage.h3y;
import defpackage.hyn;
import defpackage.jy60;

/* loaded from: classes10.dex */
public final class m implements jy60 {
    public final h3y a;
    public final hyn b;

    public m(h3y h3yVar, hyn hynVar) {
        this.a = h3yVar;
        this.b = hynVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LocationRequirementsResolveStrategyImpl";
    }

    @Override // defpackage.jy60
    public final void h() {
        this.b.getClass();
        l lVar = (l) this.a.get();
        com.yandex.go.coroutines.b.g(lVar.b, null, null, new LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$1(lVar, null), 3);
        com.yandex.go.coroutines.b.g(lVar.b, null, null, new LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$2(lVar, null), 3);
    }
}
