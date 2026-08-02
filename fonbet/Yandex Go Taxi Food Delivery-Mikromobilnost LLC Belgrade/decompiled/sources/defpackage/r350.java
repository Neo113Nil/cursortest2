package defpackage;

import com.yandex.go.messenger_native.analytics.NativeMessengerAnalytics$Reason;
import com.yandex.go.messenger_native.analytics.NativeMessengerAnalytics$Service;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Reason;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Service;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes12.dex */
public final class r350 {
    public final co40 a;

    public r350(co40 co40Var) {
        this.a = co40Var;
    }

    public static NativeMessengerAnalytics$Service b(NativeMessengerAnalyticsFacade$Service nativeMessengerAnalyticsFacade$Service) {
        int i = q350.a[nativeMessengerAnalyticsFacade$Service.ordinal()];
        if (i == 1) {
            return NativeMessengerAnalytics$Service.Taxi;
        }
        if (i == 2) {
            return NativeMessengerAnalytics$Service.Marketplace;
        }
        w511.b();
        return null;
    }

    public final void a(NativeMessengerAnalyticsFacade$Service nativeMessengerAnalyticsFacade$Service, String str, NativeMessengerAnalyticsFacade$Reason nativeMessengerAnalyticsFacade$Reason) {
        NativeMessengerAnalytics$Reason nativeMessengerAnalytics$Reason;
        NativeMessengerAnalytics$Service b = b(nativeMessengerAnalyticsFacade$Service);
        int i = q350.b[nativeMessengerAnalyticsFacade$Reason.ordinal()];
        if (i == 1) {
            nativeMessengerAnalytics$Reason = NativeMessengerAnalytics$Reason.CloseTapped;
        } else if (i == 2) {
            nativeMessengerAnalytics$Reason = NativeMessengerAnalytics$Reason.StatusChanged;
        } else if (i == 3) {
            nativeMessengerAnalytics$Reason = NativeMessengerAnalytics$Reason.OtherChatOpened;
        } else if (i == 4) {
            nativeMessengerAnalytics$Reason = NativeMessengerAnalytics$Reason.BackPressed;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            nativeMessengerAnalytics$Reason = NativeMessengerAnalytics$Reason.Unknown;
        }
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_SERVICE, b.getEventValue());
        hashMap.put("chat_id", str);
        hashMap.put(CRLReasonCodeExtension.REASON, nativeMessengerAnalytics$Reason.getEventValue());
        co40Var.a.a("NativeMessenger.Closed", hashMap, 1, new HashMap());
    }
}
