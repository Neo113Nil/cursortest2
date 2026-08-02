package ru.yandex.taxi.systemrequeirements.location;

import defpackage.j7j0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vw60;
import defpackage.z9z;

/* loaded from: classes10.dex */
public final class d implements vw60 {
    public final j7j0 a;
    public final z9z b;
    public final tt2 c;
    public final tse d;

    public d(j7j0 j7j0Var, z9z z9zVar, tt2 tt2Var, tse tseVar) {
        this.a = j7j0Var;
        this.b = z9zVar;
        this.c = tt2Var;
        this.d = tseVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(this.d, mdh.b, null, new LocationPermissionShownReporter$onActivityCreate$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LocationPermissionShownReporter";
    }
}
