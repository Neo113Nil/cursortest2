package ru.yandex.taxi.zonemodes;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.model.ZoneMode;
import defpackage.kb5;
import defpackage.qd61;
import defpackage.zls;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ZoneModesInteractorImpl$tariffZoneModeFlow$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ZoneMode zoneMode;
        Zone zone = (Zone) obj;
        kb5 kb5Var = (kb5) obj2;
        ((j) this.receiver).getClass();
        List list = zone.v;
        int i = qd61.a[kb5Var.d.ordinal()];
        Object obj4 = null;
        if (i == 1) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ZoneMode) next).b.contains(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                    obj4 = next;
                    break;
                }
            }
            zoneMode = (ZoneMode) obj4;
        } else if (i != 2) {
            zoneMode = j.b(zone, kb5Var.b, kb5Var.a);
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((ZoneMode) next2).b.contains(TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY)) {
                    obj4 = next2;
                    break;
                }
            }
            zoneMode = (ZoneMode) obj4;
        }
        if (zoneMode != null) {
            return zoneMode;
        }
        ZoneMode.Companion.getClass();
        return ZoneMode.d;
    }
}
