package bo.app;

import com.braze.Braze;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class x3$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ x3$$ExternalSyntheticLambda2(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String changeUser$lambda$1$1;
        String changeUser$lambda$1$2;
        String changeUser$lambda$1$3;
        String changeUser$lambda$1$5;
        String logPushNotificationOpened$lambda$3$1;
        String logPurchase$lambda$0;
        String _set_registeredPushToken_$lambda$0;
        String changeUser$lambda$0;
        String logCustomEvent$lambda$0;
        String logPushDelivery$lambda$0;
        String _set_registeredPushToken_$lambda$1$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return x3.o(str);
            case 1:
                return x3.m(str);
            case 2:
                return x3.k(str);
            case 3:
                return x3.c(str);
            case 4:
                return x3.p(str);
            case 5:
                return x3.j(str);
            case 6:
                return x3.d(str);
            case 7:
                return x3.n(str);
            case 8:
                return xg.a(str);
            case 9:
                return y1.b(str);
            case 10:
                return y1.c(str);
            case 11:
                return y1.d(str);
            case 12:
                return yf.a(str);
            case 13:
                return zf.c(str);
            case 14:
                return zf.b(str);
            case 15:
                return zf.a(str);
            case 16:
                return zf.d(str);
            case 17:
                return zf.e(str);
            case 18:
                return zf.f(str);
            case 19:
                changeUser$lambda$1$1 = Braze.changeUser$lambda$1$1(str);
                return changeUser$lambda$1$1;
            case 20:
                changeUser$lambda$1$2 = Braze.changeUser$lambda$1$2(str);
                return changeUser$lambda$1$2;
            case 21:
                changeUser$lambda$1$3 = Braze.changeUser$lambda$1$3(str);
                return changeUser$lambda$1$3;
            case 22:
                changeUser$lambda$1$5 = Braze.changeUser$lambda$1$5(str);
                return changeUser$lambda$1$5;
            case 23:
                logPushNotificationOpened$lambda$3$1 = Braze.logPushNotificationOpened$lambda$3$1(str);
                return logPushNotificationOpened$lambda$3$1;
            case 24:
                logPurchase$lambda$0 = Braze.logPurchase$lambda$0(str);
                return logPurchase$lambda$0;
            case 25:
                _set_registeredPushToken_$lambda$0 = Braze._set_registeredPushToken_$lambda$0(str);
                return _set_registeredPushToken_$lambda$0;
            case 26:
                changeUser$lambda$0 = Braze.changeUser$lambda$0(str);
                return changeUser$lambda$0;
            case 27:
                logCustomEvent$lambda$0 = Braze.logCustomEvent$lambda$0(str);
                return logCustomEvent$lambda$0;
            case 28:
                logPushDelivery$lambda$0 = Braze.logPushDelivery$lambda$0(str);
                return logPushDelivery$lambda$0;
            default:
                _set_registeredPushToken_$lambda$1$0 = Braze._set_registeredPushToken_$lambda$1$0(str);
                return _set_registeredPushToken_$lambda$1$0;
        }
    }
}
