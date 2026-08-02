package ru.yandex.taxi.checkin;

import defpackage.ike;
import defpackage.p2y0;
import defpackage.tt2;
import defpackage.ufb;
import defpackage.ysg;

/* loaded from: classes5.dex */
public final class i {
    public final p2y0 a;
    public final com.yandex.go.taxi.order.repositories.c b;
    public final ysg c;
    public final tt2 d;
    public final ufb e;
    public final ru.yandex.taxi.styling.c f;

    public i(p2y0 p2y0Var, com.yandex.go.taxi.order.repositories.c cVar, ysg ysgVar, tt2 tt2Var, ufb ufbVar, ru.yandex.taxi.styling.c cVar2) {
        this.a = p2y0Var;
        this.b = cVar;
        this.c = ysgVar;
        this.d = tt2Var;
        this.e = ufbVar;
        this.f = cVar2;
    }

    public final void a(ike ikeVar) {
        com.yandex.go.coroutines.b.g(ikeVar, null, null, new OpenCheckInInstructionInteractorImpl$waitForConditionAndOpenInstruction$1(null, this), 3);
    }
}
