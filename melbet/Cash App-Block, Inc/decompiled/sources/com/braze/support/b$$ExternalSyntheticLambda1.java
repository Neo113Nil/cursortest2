package com.braze.support;

import com.braze.images.DefaultBrazeImageLoader;
import com.braze.models.inappmessage.InAppMessageHtmlBase;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.ui.BrazeWebViewActivity$createWebViewClient$1;
import com.braze.ui.BrazeWebViewClient;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ b$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String bitmapFromUrl$lambda$3;
        String bitmapFromCache$lambda$1$0;
        String bitmapFromCache$lambda$2;
        String putBitmapIntoCache$lambda$0;
        String logButtonClick$lambda$0;
        String addProperty$lambda$0;
        String downloadFileToPath$lambda$6;
        String downloadFileToPath$lambda$0;
        String remoteBitmap$lambda$0;
        String w$lambda$0;
        String e$lambda$0;
        String parseDate$lambda$0;
        String mergeJsonObjects$lambda$0$0;
        String mergeJsonObjects$lambda$1$0;
        String incrementPermissionRequestCount$lambda$0;
        String hasPermission$lambda$0;
        String declaredMethodQuietly$lambda$1;
        String isValidLogCustomEventInput$lambda$1;
        String isValidLogPurchaseInput$lambda$1;
        String isValidLogPurchaseInput$lambda$3;
        String localHtmlUrlFromRemoteUrl$lambda$5;
        String localHtmlUrlFromRemoteUrl$lambda$2;
        String replacePrefetchedUrlsWithLocalAssets$lambda$0;
        String handleUrlOverride$lambda$0;
        String handleUrlOverride$lambda$0$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return b.a(str);
            case 1:
                bitmapFromUrl$lambda$3 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$3(str);
                return bitmapFromUrl$lambda$3;
            case 2:
                bitmapFromCache$lambda$1$0 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$1$0(str);
                return bitmapFromCache$lambda$1$0;
            case 3:
                bitmapFromCache$lambda$2 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$2(str);
                return bitmapFromCache$lambda$2;
            case 4:
                putBitmapIntoCache$lambda$0 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$0(str);
                return putBitmapIntoCache$lambda$0;
            case 5:
                logButtonClick$lambda$0 = InAppMessageHtmlBase.logButtonClick$lambda$0(str);
                return logButtonClick$lambda$0;
            case 6:
                addProperty$lambda$0 = BrazeProperties.addProperty$lambda$0(str);
                return addProperty$lambda$0;
            case 7:
                downloadFileToPath$lambda$6 = BrazeFileUtils.downloadFileToPath$lambda$6(str);
                return downloadFileToPath$lambda$6;
            case 8:
                downloadFileToPath$lambda$0 = BrazeFileUtils.downloadFileToPath$lambda$0(str);
                return downloadFileToPath$lambda$0;
            case 9:
                remoteBitmap$lambda$0 = BrazeImageUtils.getRemoteBitmap$lambda$0(str);
                return remoteBitmap$lambda$0;
            case 10:
                w$lambda$0 = BrazeLogger.w$lambda$0(str);
                return w$lambda$0;
            case 11:
                e$lambda$0 = BrazeLogger.e$lambda$0(str);
                return e$lambda$0;
            case 12:
                parseDate$lambda$0 = DateTimeUtils.parseDate$lambda$0(str);
                return parseDate$lambda$0;
            case 13:
                mergeJsonObjects$lambda$0$0 = JsonUtils.mergeJsonObjects$lambda$0$0(str);
                return mergeJsonObjects$lambda$0$0;
            case 14:
                mergeJsonObjects$lambda$1$0 = JsonUtils.mergeJsonObjects$lambda$1$0(str);
                return mergeJsonObjects$lambda$1$0;
            case 15:
                incrementPermissionRequestCount$lambda$0 = PermissionUtils.incrementPermissionRequestCount$lambda$0(str);
                return incrementPermissionRequestCount$lambda$0;
            case 16:
                hasPermission$lambda$0 = PermissionUtils.hasPermission$lambda$0(str);
                return hasPermission$lambda$0;
            case 17:
                declaredMethodQuietly$lambda$1 = ReflectionUtils.getDeclaredMethodQuietly$lambda$1(str);
                return declaredMethodQuietly$lambda$1;
            case 18:
                isValidLogCustomEventInput$lambda$1 = ValidationUtils.isValidLogCustomEventInput$lambda$1(str);
                return isValidLogCustomEventInput$lambda$1;
            case 19:
                isValidLogPurchaseInput$lambda$1 = ValidationUtils.isValidLogPurchaseInput$lambda$1(str);
                return isValidLogPurchaseInput$lambda$1;
            case 20:
                isValidLogPurchaseInput$lambda$3 = ValidationUtils.isValidLogPurchaseInput$lambda$3(str);
                return isValidLogPurchaseInput$lambda$3;
            case 21:
                localHtmlUrlFromRemoteUrl$lambda$5 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$5(str);
                return localHtmlUrlFromRemoteUrl$lambda$5;
            case 22:
                localHtmlUrlFromRemoteUrl$lambda$2 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$2(str);
                return localHtmlUrlFromRemoteUrl$lambda$2;
            case 23:
                replacePrefetchedUrlsWithLocalAssets$lambda$0 = WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$0(str);
                return replacePrefetchedUrlsWithLocalAssets$lambda$0;
            case 24:
                return c.b(str);
            case 25:
                return c.a(str);
            case 26:
                return d.a(str);
            case 27:
                return h.b(str);
            case 28:
                handleUrlOverride$lambda$0 = BrazeWebViewActivity$createWebViewClient$1.handleUrlOverride$lambda$0(str);
                return handleUrlOverride$lambda$0;
            default:
                handleUrlOverride$lambda$0$0 = BrazeWebViewClient.handleUrlOverride$lambda$0$0(str);
                return handleUrlOverride$lambda$0$0;
        }
    }
}
