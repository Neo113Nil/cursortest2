package ru.yandex.taxi.layers.domain;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.zone.model.ZoneMode;
import defpackage.bd61;
import defpackage.cyx;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.tje;
import defpackage.tmx;
import defpackage.tt2;
import defpackage.wiq0;

/* loaded from: classes9.dex */
public final class z {
    public final ru.yandex.taxi.zonemodes.j a;
    public final com.yandex.go.navigation.screen.c b;
    public final cyx c;
    public final wiq0 d;
    public final hbp0 e;
    public final i3y f = kotlin.a.a(new bd61(7));

    /* JADX WARN: Multi-variable type inference failed */
    public z(ru.yandex.taxi.zonemodes.j jVar, com.yandex.go.navigation.screen.c cVar, cyx cyxVar, tt2 tt2Var, wiq0 wiq0Var) {
        this.a = jVar;
        this.b = cVar;
        this.c = cyxVar;
        this.d = wiq0Var;
        this.e = new hbp0(new ZoneModeAndScreenChangeInteractor$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    public final void a() {
        hbp0 hbp0Var = this.e;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new ZoneModeAndScreenChangeInteractor$attach$1(this, null), 3);
    }

    public final Mode b(ZoneMode zoneMode) {
        com.yandex.go.zone.model.h hVar = ZoneMode.Companion;
        String str = zoneMode.a;
        hVar.getClass();
        if (com.yandex.go.zone.model.h.a(str)) {
            return Mode.NORMAL;
        }
        String str2 = zoneMode.a;
        if (str2 != null) {
            return (Mode) gtq0.j(str2, ((tmx) this.f.getValue()).a);
        }
        return null;
    }
}
