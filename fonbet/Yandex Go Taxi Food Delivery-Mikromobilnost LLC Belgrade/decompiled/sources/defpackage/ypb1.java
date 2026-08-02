package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.masstransit.paymentcards.MtTransportCardSubscriber$TransportCardEventType;

/* loaded from: classes11.dex */
public abstract class ypb1 {
    public static final void a(u1f u1fVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1942194415);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(u1fVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a.a(slsVar, ljs0.c(ljs0.e(an91.k(c530.a, 8.0f), 56.0f), 1.0f), ((YandexShapes) btsVar.m(qm51.a)).b(), 0L, 0L, null, u1fVar.b, null, null, null, wwg.S(1427240648, true, new ota(8, u1fVar), btsVar), btsVar, (i2 >> 3) & 14, 3832);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(u1fVar, slsVar, i, 2);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1176568117);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.e(str, an91.m(c530.a, 18.0f, 0.0f, 2), ((el51) btsVar2.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar, (i2 & 14) | 24624, HProv.ALG_TYPE_SECURECHANNEL, 57320);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 11);
        }
    }

    public static final Integer c(MtTransportCardSubscriber$TransportCardEventType mtTransportCardSubscriber$TransportCardEventType) {
        int i = cj40.a[mtTransportCardSubscriber$TransportCardEventType.ordinal()];
        if (i == 1) {
            return Integer.valueOf(kyh0.mt_vertical_transport_payment_cards_card_added_success);
        }
        if (i == 2) {
            return Integer.valueOf(kyh0.mt_vertical_transport_payment_cards_card_replenished_success);
        }
        if (i == 3) {
            return null;
        }
        w511.b();
        return null;
    }

    public static final int d() {
        TimeZone timeZone = TimeZone.getDefault();
        return timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000;
    }
}
