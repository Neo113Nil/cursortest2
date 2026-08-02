package ru.yandex.taxi.order.map.controller;

import com.yandex.go.coroutines.b;
import defpackage.dk50;
import defpackage.hk50;
import defpackage.jse;
import defpackage.pzt0;
import defpackage.shu;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zzs;
import java.util.Set;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.net.taxi.NearestDriversApi;

/* loaded from: classes6.dex */
public final class a {
    public final tse a;
    public final dk50 b;
    public final jse c;
    public final ru.yandex.taxi.order.map.controller.internal.a d;
    public pzt0 e;

    public a(tse tseVar, dk50 dk50Var, tt2 tt2Var, NearestDriversApi nearestDriversApi, c cVar, shu shuVar) {
        this.a = tseVar;
        this.b = dk50Var;
        tt2Var.getClass();
        jse P = uyj.a.P(1);
        this.c = P;
        this.d = new ru.yandex.taxi.order.map.controller.internal.a(tseVar, nearestDriversApi, cVar, dk50Var, P, shuVar);
    }

    public final void a() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = null;
        b.g(this.a, this.c, null, new NearestDriversFacade$clear$1(this, null), 2);
    }

    public final void b(String str) {
        b.g(this.a, this.c, null, new NearestDriversFacade$remove$1(this, str, null), 2);
    }

    public final void c() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = null;
        b.g(this.a, this.c, null, new NearestDriversFacade$stopUpdates$1(this, null), 2);
    }

    public final void d(zzs zzsVar, hk50 hk50Var) {
        this.e = b.g(this.a, this.c, null, new NearestDriversFacade$update$1(this, zzsVar, hk50Var, null), 2);
    }

    public final void e(zzs zzsVar, Set set) {
        this.e = b.g(this.a, this.c, null, new NearestDriversFacade$updateTariffClasses$1(this, zzsVar, set, null), 2);
    }
}
