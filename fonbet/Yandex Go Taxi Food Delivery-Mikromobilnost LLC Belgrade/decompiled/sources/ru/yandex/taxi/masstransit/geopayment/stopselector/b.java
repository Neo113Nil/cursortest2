package ru.yandex.taxi.masstransit.geopayment.stopselector;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.ahu0;
import defpackage.ays;
import defpackage.bhu0;
import defpackage.cms;
import defpackage.d411;
import defpackage.jl40;
import defpackage.jms;
import defpackage.ohu0;
import defpackage.r340;
import defpackage.s340;
import defpackage.tiu0;
import defpackage.tje;
import defpackage.w511;
import defpackage.wfu0;
import defpackage.xfu0;
import defpackage.ygu0;
import defpackage.zgu0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$StopOptionsButtonActionType;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.model.StopSelectionStage;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements ays, jms {
    public final /* synthetic */ s340 a;

    public b(s340 s340Var) {
        this.a = s340Var;
    }

    @Override // defpackage.ays
    public final void a(Object obj) {
        Object value;
        String str;
        Zone zone;
        Object value2;
        ygu0 ygu0Var = (ygu0) obj;
        s340 s340Var = this.a;
        tiu0 tiu0Var = s340Var.E;
        if (!(ygu0Var instanceof ahu0) && !(ygu0Var instanceof zgu0)) {
            if (ygu0Var instanceof wfu0) {
                r0 r0Var = tiu0Var.d;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, ohu0.a((ohu0) value2, null, !r5.b, null, null, null, null, null, null, 509)));
                return;
            }
            if ((ygu0Var instanceof xfu0) || (ygu0Var instanceof bhu0)) {
                return;
            }
            w511.b();
            return;
        }
        String id = ygu0Var.getId();
        r0 r0Var2 = tiu0Var.d;
        r0 r0Var3 = tiu0Var.d;
        do {
            value = r0Var2.getValue();
        } while (!r0Var2.k(value, ohu0.a((ohu0) value, id, false, null, null, null, null, null, null, 510)));
        int i = r340.a[((ohu0) r0Var3.getValue()).c.ordinal()];
        if (i == 1) {
            tiu0Var.d(ygu0Var.getId());
            tiu0Var.e(StopSelectionStage.SELECT_DESTINATION_STOP);
            tje.N(s340Var.Jg(), null, null, new MtStopSelectorPresenter$onSelectStop$1(s340Var, ygu0Var, null), 3);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            tje.N(s340Var.Jg(), null, null, new MtStopSelectorPresenter$onSelectStop$2(s340Var, ygu0Var, null), 3);
        }
        d411 d411Var = s340Var.F;
        TransportPaymentAnalytics$StopOptionsButtonActionType transportPaymentAnalytics$StopOptionsButtonActionType = TransportPaymentAnalytics$StopOptionsButtonActionType.Next;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = s340Var.A;
        String str2 = s340Var.y;
        String str3 = ((ohu0) r0Var3.getValue()).a;
        ZoneAddress n = s340Var.G.n();
        if (n == null || (zone = n.b) == null || (str = zone.a) == null) {
            str = "";
        }
        d411Var.b(transportPaymentAnalytics$StopOptionsButtonActionType, ((ohu0) r0Var3.getValue()).h, transportPaymentAnalytics$VehicleType, str2, str3, str);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ays) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, s340.class, "onSelectStop", "onSelectStop(Lru/yandex/taxi/masstransit/model/StopSection;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
