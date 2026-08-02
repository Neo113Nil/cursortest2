package ru.yandex.taxi.logistics.dashboard.address;

import com.yandex.go.address.models.Address;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.search.router.Origin;
import defpackage.a4i;
import defpackage.bei;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.h55;
import defpackage.hxx;
import defpackage.i0i;
import defpackage.kyh0;
import defpackage.l30;
import defpackage.ljz;
import defpackage.m41;
import defpackage.m950;
import defpackage.pv0;
import defpackage.un0;
import defpackage.w511;
import defpackage.yvf0;
import defpackage.z3i;
import defpackage.zzs;
import kotlin.Pair;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class c extends h55 {
    public final yvf0 D;
    public final ljz E;
    public final com.yandex.go.route.interactor.b F;
    public final cyx G;
    public l30 H;

    public c(yvf0 yvf0Var, ljz ljzVar, com.yandex.go.route.interactor.b bVar, cyx cyxVar) {
        super(null);
        this.D = yvf0Var;
        this.E = ljzVar;
        this.F = bVar;
        this.G = cyxVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        l30 l30Var = this.H;
        if (l30Var != null) {
            l30Var.cancel();
        }
        this.H = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        byx byxVar;
        Pair pair;
        z3i z3iVar = (z3i) obj;
        this.H = this.E.a.c(new i0i(new DeliveryDashboardAddressPickerRouter$onLaunch$1(bei.b, bei.class, "value", "getValue()Ljava/lang/String;", 0), 1));
        PointType pointType = z3iVar.a;
        int[] iArr = a4i.a;
        int i = iArr[pointType.ordinal()];
        if (i == 1) {
            byxVar = new byx(Screen.CHOOSE_A, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            byxVar = new byx(Screen.CHOOSE_B, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null));
        }
        this.G.b(byxVar);
        m950 m950Var = (m950) this.D.get();
        Address address = z3iVar.b;
        zzs B = address != null ? address.B() : null;
        int i2 = iArr[z3iVar.a.ordinal()];
        if (i2 == 1) {
            pair = new Pair(Integer.valueOf(kyh0.search_source_address_hint), null);
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            pair = new Pair(Integer.valueOf(kyh0.search_destination_address_hint), z3iVar.c);
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        pv0 pv0Var = (pv0) pair.getSecond();
        PointType pointType2 = z3iVar.a;
        E(m950Var, new m41(intValue, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, pointType2, Origin.DELIVERY, pv0Var, B, true, true, null, null, null, 524032), new b(this, pointType2), hxx.a);
    }
}
