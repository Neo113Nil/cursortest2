package bo.app;

import com.braze.Braze;
import com.braze.models.inappmessage.InAppMessageHtmlBase;
import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import com.braze.support.StringUtils;
import com.braze.support.WebContentUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j1$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ j1$$ExternalSyntheticLambda7(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String changeUser$lambda$1$4;
        String addSerializedCardJsonToStorage$lambda$0;
        String addSerializedCardJsonToStorage$lambda$1$0;
        String logPushStoryPageClicked$lambda$0;
        String logButtonClick$lambda$5;
        String handleBrazeRemoteMessage$lambda$5;
        String handleContentCardsSerializedCardIfPresent$lambda$0;
        String handleAdmRegistrationIntent$lambda$0;
        String cacheFileSuffix$lambda$1;
        String localHtmlUrlFromRemoteUrl$lambda$1;
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                return j1.p(str2, str);
            case 1:
                return j1.b(str2, str);
            case 2:
                return j1.f(str2, str);
            case 3:
                return j1.n(str2, str);
            case 4:
                return j1.l(str2, str);
            case 5:
                return j1.j(str2, str);
            case 6:
                return j1.t(str2, str);
            case 7:
                return j1.r(str2, str);
            case 8:
                return k0.d(str2, str);
            case 9:
                return k0.a(str2, str);
            case 10:
                return k0.b(str2, str);
            case 11:
                return k0.c(str2, str);
            case 12:
                return o6.a(str2, str);
            case 13:
                return o6.b(str2, str);
            case 14:
                return q1.a(str2, str);
            case 15:
                return yf.a(str2, str);
            case 16:
                return zf.a(str2, str);
            case 17:
                return zf.b(str2, str);
            case 18:
                return zf.c(str2, str);
            case 19:
                return zf.d(str2, str);
            case 20:
                changeUser$lambda$1$4 = Braze.changeUser$lambda$1$4(str2, str);
                return changeUser$lambda$1$4;
            case 21:
                addSerializedCardJsonToStorage$lambda$0 = Braze.addSerializedCardJsonToStorage$lambda$0(str2, str);
                return addSerializedCardJsonToStorage$lambda$0;
            case 22:
                addSerializedCardJsonToStorage$lambda$1$0 = Braze.addSerializedCardJsonToStorage$lambda$1$0(str2, str);
                return addSerializedCardJsonToStorage$lambda$1$0;
            case 23:
                logPushStoryPageClicked$lambda$0 = Braze.logPushStoryPageClicked$lambda$0(str2, str);
                return logPushStoryPageClicked$lambda$0;
            case 24:
                logButtonClick$lambda$5 = InAppMessageHtmlBase.logButtonClick$lambda$5(str2, str);
                return logButtonClick$lambda$5;
            case 25:
                handleBrazeRemoteMessage$lambda$5 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$5(str2, str);
                return handleBrazeRemoteMessage$lambda$5;
            case 26:
                handleContentCardsSerializedCardIfPresent$lambda$0 = BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent$lambda$0(str2, str);
                return handleContentCardsSerializedCardIfPresent$lambda$0;
            case 27:
                handleAdmRegistrationIntent$lambda$0 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$0(str2, str);
                return handleAdmRegistrationIntent$lambda$0;
            case 28:
                cacheFileSuffix$lambda$1 = StringUtils.getCacheFileSuffix$lambda$1(str2, str);
                return cacheFileSuffix$lambda$1;
            default:
                localHtmlUrlFromRemoteUrl$lambda$1 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$1(str2, str);
                return localHtmlUrlFromRemoteUrl$lambda$1;
        }
    }
}
