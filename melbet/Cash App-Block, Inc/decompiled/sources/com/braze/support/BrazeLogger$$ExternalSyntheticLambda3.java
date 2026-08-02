package com.braze.support;

import android.os.SystemClock;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageHtmlBase;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import java.time.Clock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeLogger$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BrazeLogger$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String checkForSystemLogLevelProperty$lambda$0;
        String logImpression$lambda$3;
        String logImpression$lambda$1;
        String enableDarkTheme$lambda$0;
        String logButtonClick$lambda$1;
        String logButtonClick$lambda$2;
        String logButtonClick$lambda$0;
        String enableDarkTheme$lambda$02;
        String forJsonPut$lambda$1;
        String enableDarkTheme$lambda$0$0;
        String clone$lambda$0;
        String addProperty$lambda$1;
        String templateFieldAtIndex$lambda$1;
        String templateFieldAtIndex$lambda$0;
        String htmlSpannedTextIfEnabled$lambda$0;
        String downloadFileToPath$lambda$3;
        String downloadFileToPath$lambda$2;
        String downloadFileToPath$lambda$1;
        String isRemoteUri$lambda$0;
        String resizeToBitmapDimensions$lambda$0;
        String localBitmap$lambda$6;
        String localBitmap$lambda$3;
        String remoteBitmap$lambda$5;
        String calculateInSampleSize$lambda$0;
        String localBitmap$lambda$8;
        String nowInMilliseconds$lambda$0;
        Clock currentNetworkTimeClock;
        switch (this.$r8$classId) {
            case 0:
                checkForSystemLogLevelProperty$lambda$0 = BrazeLogger.checkForSystemLogLevelProperty$lambda$0();
                return checkForSystemLogLevelProperty$lambda$0;
            case 1:
                logImpression$lambda$3 = InAppMessageControl.logImpression$lambda$3();
                return logImpression$lambda$3;
            case 2:
                logImpression$lambda$1 = InAppMessageControl.logImpression$lambda$1();
                return logImpression$lambda$1;
            case 3:
                return InAppMessageHtmlBase.logButtonClick$lambda$1();
            case 4:
                return InAppMessageHtmlBase.logButtonClick$lambda$2();
            case 5:
                return InAppMessageHtmlBase.logButtonClick$lambda$3();
            case 6:
                enableDarkTheme$lambda$0 = InAppMessageImmersiveBase.enableDarkTheme$lambda$0();
                return enableDarkTheme$lambda$0;
            case 7:
                logButtonClick$lambda$1 = InAppMessageImmersiveBase.logButtonClick$lambda$1();
                return logButtonClick$lambda$1;
            case 8:
                logButtonClick$lambda$2 = InAppMessageImmersiveBase.logButtonClick$lambda$2();
                return logButtonClick$lambda$2;
            case 9:
                logButtonClick$lambda$0 = InAppMessageImmersiveBase.logButtonClick$lambda$0();
                return logButtonClick$lambda$0;
            case 10:
                enableDarkTheme$lambda$02 = InAppMessageSlideup.enableDarkTheme$lambda$0();
                return enableDarkTheme$lambda$02;
            case 11:
                forJsonPut$lambda$1 = InAppMessageSlideup.forJsonPut$lambda$1();
                return forJsonPut$lambda$1;
            case 12:
                enableDarkTheme$lambda$0$0 = MessageButton.enableDarkTheme$lambda$0$0();
                return enableDarkTheme$lambda$0$0;
            case 13:
                clone$lambda$0 = BrazeProperties.clone$lambda$0();
                return clone$lambda$0;
            case 14:
                addProperty$lambda$1 = BrazeProperties.addProperty$lambda$1();
                return addProperty$lambda$1;
            case 15:
                templateFieldAtIndex$lambda$1 = BrazeNotificationPayload.Companion.getTemplateFieldAtIndex$lambda$1();
                return templateFieldAtIndex$lambda$1;
            case 16:
                templateFieldAtIndex$lambda$0 = BrazeNotificationPayload.Companion.getTemplateFieldAtIndex$lambda$0();
                return templateFieldAtIndex$lambda$0;
            case 17:
                htmlSpannedTextIfEnabled$lambda$0 = HtmlUtils.getHtmlSpannedTextIfEnabled$lambda$0();
                return htmlSpannedTextIfEnabled$lambda$0;
            case 18:
                downloadFileToPath$lambda$3 = BrazeFileUtils.downloadFileToPath$lambda$3();
                return downloadFileToPath$lambda$3;
            case 19:
                downloadFileToPath$lambda$2 = BrazeFileUtils.downloadFileToPath$lambda$2();
                return downloadFileToPath$lambda$2;
            case 20:
                downloadFileToPath$lambda$1 = BrazeFileUtils.downloadFileToPath$lambda$1();
                return downloadFileToPath$lambda$1;
            case 21:
                isRemoteUri$lambda$0 = BrazeFileUtils.isRemoteUri$lambda$0();
                return isRemoteUri$lambda$0;
            case 22:
                resizeToBitmapDimensions$lambda$0 = BrazeImageUtils.resizeToBitmapDimensions$lambda$0();
                return resizeToBitmapDimensions$lambda$0;
            case 23:
                localBitmap$lambda$6 = BrazeImageUtils.getLocalBitmap$lambda$6();
                return localBitmap$lambda$6;
            case 24:
                localBitmap$lambda$3 = BrazeImageUtils.getLocalBitmap$lambda$3();
                return localBitmap$lambda$3;
            case 25:
                remoteBitmap$lambda$5 = BrazeImageUtils.getRemoteBitmap$lambda$5();
                return remoteBitmap$lambda$5;
            case 26:
                calculateInSampleSize$lambda$0 = BrazeImageUtils.calculateInSampleSize$lambda$0();
                return calculateInSampleSize$lambda$0;
            case 27:
                localBitmap$lambda$8 = BrazeImageUtils.getLocalBitmap$lambda$8();
                return localBitmap$lambda$8;
            case 28:
                nowInMilliseconds$lambda$0 = DateTimeUtils.nowInMilliseconds$lambda$0();
                return nowInMilliseconds$lambda$0;
            default:
                currentNetworkTimeClock = SystemClock.currentNetworkTimeClock();
                return currentNetworkTimeClock;
        }
    }
}
