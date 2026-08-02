package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;

@gsq0
/* loaded from: classes5.dex */
public final class q65 {
    public static final p65 Companion = new p65();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(14))};
    public final String a;
    public final PaymentMethodType b;

    public /* synthetic */ q65(int i, String str, PaymentMethodType paymentMethodType) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, o65.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = paymentMethodType;
    }
}
