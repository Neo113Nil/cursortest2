package ru.yandex.taxi.scooters.data;

import defpackage.am2;
import defpackage.auu0;
import defpackage.bvf0;
import defpackage.cyn0;
import defpackage.eex;
import defpackage.gw00;
import defpackage.tje;
import defpackage.tse;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class p {
    public final com.yandex.go.utils.storage.json.a a;
    public final r0 b;
    public volatile boolean c;

    public p(tse tseVar, eex eexVar) {
        am2 am2Var = new am2("scooters", "mobility_hub_context", kotlin.collections.b.f());
        auu0 auu0Var = auu0.a;
        this.a = eexVar.b(am2Var, cyn0.Companion.serializer());
        this.b = bvf0.c(null);
        tje.N(tseVar, null, null, new ScootersMobilityHubContextRepository$1(this, null), 3);
    }

    public final void a() {
        cyn0 cyn0Var = (cyn0) this.b.getValue();
        this.a.b(cyn0Var == null ? kotlin.collections.b.f() : gw00.e(new Pair("current", cyn0Var)));
    }

    public final cyn0 b() {
        return (cyn0) this.b.getValue();
    }
}
