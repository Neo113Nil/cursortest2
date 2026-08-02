package defpackage;

import com.whatsapp.otp.android.sdk.enums.WhatsAppClientType;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import java.util.ArrayList;
import java.util.function.Predicate;
import ru.CryptoPro.JCP.tools.logger.AndroidLogger;
import ru.CryptoPro.JCP.tools.logger.AndroidLoggingInterface;

/* loaded from: classes4.dex */
public final /* synthetic */ class sa2 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ sa2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = AndroidLogger.d;
                return ((AndroidLoggingInterface) obj).getName().equals(str);
            case 1:
                return jl40.l(((OrderStatusWindowNotification) obj).e, str);
            default:
                WhatsAppClientType[] whatsAppClientTypeArr = ax41.a;
                return ((String) obj).equals(str);
        }
    }
}
