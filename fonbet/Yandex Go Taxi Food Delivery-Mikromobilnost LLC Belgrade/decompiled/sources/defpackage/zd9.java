package defpackage;

import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
/* loaded from: classes6.dex */
public final class zd9 {
    public static final yd9 Companion = new yd9();
    public static final i3y[] g = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(6)), null, null};
    public final String a;
    public final String b;
    public final Calendar c;
    public final PaymentMethod$Type d;
    public final String e;
    public final Tips f;

    public /* synthetic */ zd9(int i, String str, String str2, Calendar calendar, PaymentMethod$Type paymentMethod$Type, String str3, Tips tips) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, xd9.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = paymentMethod$Type;
        this.e = str3;
        this.f = tips;
    }

    public zd9(String str, String str2, Calendar calendar, PaymentMethod$Type paymentMethod$Type, String str3, Tips tips) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = paymentMethod$Type;
        this.e = str3;
        this.f = tips;
    }
}
