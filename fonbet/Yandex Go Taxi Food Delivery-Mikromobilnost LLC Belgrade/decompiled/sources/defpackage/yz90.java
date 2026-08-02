package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$ErrorPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$OpenUrlPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$PurchaseSuccessPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$StatePaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.d;
import ru.yandex.taxi.plus.sdk.payments.web.m;
import ru.yandex.taxi.plus.sdk.payments.web.n;
import ru.yandex.taxi.plus.sdk.payments.web.o;

/* loaded from: classes6.dex */
public final class yz90 extends vfx {
    public static final yz90 a = new yz90();
    public static final SerialDescriptor b = b.Companion.serializer().getDescriptor();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        c m = qcx.m(ncxVar.t());
        b bVar = (b) m.get("type");
        String g = bVar != null ? qcx.g(qcx.n(bVar)) : null;
        i3y b2 = a.b(LazyThreadSafetyMode.NONE, new ak80(12, m));
        if (g != null) {
            switch (g.hashCode()) {
                case -1149187101:
                    if (g.equals("SUCCESS")) {
                        return m.a;
                    }
                    break;
                case -402916431:
                    if (g.equals("NEED_AUTH")) {
                        return d.a;
                    }
                    break;
                case 66247144:
                    if (g.equals("ERROR")) {
                        return (o) ncxVar.d().a(PaymentEvent$ErrorPaymentEvent.Companion.serializer(), (c) b2.getValue());
                    }
                    break;
                case 79219825:
                    if (g.equals("STATE")) {
                        return (o) ncxVar.d().a(PaymentEvent$StatePaymentEvent.Companion.serializer(), (c) b2.getValue());
                    }
                    break;
                case 195111172:
                    if (g.equals("PURCHASE_SUCCESS_DATA")) {
                        return (o) ncxVar.d().a(PaymentEvent$PurchaseSuccessPaymentEvent.Companion.serializer(), (c) b2.getValue());
                    }
                    break;
                case 279273946:
                    if (g.equals("OPEN_URL")) {
                        return (o) ncxVar.d().a(PaymentEvent$OpenUrlPaymentEvent.Companion.serializer(), (c) b2.getValue());
                    }
                    break;
            }
        }
        return n.a;
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        throw new SerializationException("PaymentEvent do not support serialization");
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
