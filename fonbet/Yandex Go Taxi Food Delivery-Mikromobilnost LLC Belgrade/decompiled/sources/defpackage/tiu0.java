package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.b;
import ru.yandex.taxi.masstransit.geopayment.stopselector.e;
import ru.yandex.taxi.masstransit.model.StopSelectionStage;

/* loaded from: classes6.dex */
public final class tiu0 {
    public final ge30 a;
    public final e b;
    public final wu30 c;
    public final r0 d = bvf0.c(ohu0.i);

    public tiu0(ge30 ge30Var, e eVar, wu30 wu30Var) {
        this.a = ge30Var;
        this.b = eVar;
        this.c = wu30Var;
    }

    public static Object b(tiu0 tiu0Var, String str, SuspendLambda suspendLambda) {
        Object value;
        String str2;
        Zone zone;
        Address address;
        ohu0 ohu0Var = (ohu0) tiu0Var.d.getValue();
        String str3 = ohu0Var.e;
        String str4 = ohu0Var.f;
        String str5 = ohu0Var.g;
        ZoneAddress n = tiu0Var.c.n();
        Object a = tiu0Var.a();
        b bVar = (b) tiu0Var.a;
        r0 r0Var = bVar.d;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, wjb.a));
        zzs B = (n == null || (address = n.a) == null) ? null : address.B();
        if (n == null || (zone = n.b) == null || (str2 = zone.a) == null) {
            str2 = "";
        }
        return bVar.b(new flb(str4, str5, B, str, null, str3, str2, null, a), suspendLambda);
    }

    public final Object a() {
        zjb zjbVar = (zjb) kotlinx.coroutines.flow.e.d(((b) this.a).d).a.getValue();
        if (zjbVar instanceof yjb) {
            return ((yjb) zjbVar).a.h.d;
        }
        if (zjbVar instanceof ujb) {
            return ((ujb) zjbVar).a.h.d;
        }
        ((ohu0) this.d.getValue()).getClass();
        return null;
    }

    public final void c(String str) {
        while (true) {
            r0 r0Var = this.d;
            Object value = r0Var.getValue();
            String str2 = str;
            if (r0Var.k(value, ohu0.a((ohu0) value, null, false, null, null, null, null, null, str2, 255))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final void d(String str) {
        while (true) {
            r0 r0Var = this.d;
            Object value = r0Var.getValue();
            String str2 = str;
            if (r0Var.k(value, ohu0.a((ohu0) value, null, false, null, str2, null, null, null, null, 503))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final void e(StopSelectionStage stopSelectionStage) {
        while (true) {
            r0 r0Var = this.d;
            Object value = r0Var.getValue();
            StopSelectionStage stopSelectionStage2 = stopSelectionStage;
            if (r0Var.k(value, ohu0.a((ohu0) value, null, false, stopSelectionStage2, null, null, null, null, null, 507))) {
                return;
            } else {
                stopSelectionStage = stopSelectionStage2;
            }
        }
    }
}
