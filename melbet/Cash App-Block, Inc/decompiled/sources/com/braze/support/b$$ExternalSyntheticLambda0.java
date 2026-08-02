package com.braze.support;

import java.util.Random;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ b$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Random random_delegate$lambda$0;
        String prettyPrintedString$lambda$0;
        String parseJsonObjectIntoBundle$lambda$0;
        String colorIntegerOrNull$lambda$0;
        String wouldPushPermissionPromptDisplay$lambda$0;
        String requestPushPermissionPrompt$lambda$2;
        String wouldPushPermissionPromptDisplay$lambda$1;
        String wouldPushPermissionPromptDisplay$lambda$3;
        String wouldPushPermissionPromptDisplay$lambda$5;
        String requestPushPermissionPrompt$lambda$0;
        String requestPushPermissionPrompt$lambda$1;
        String requestPushPermissionPrompt$lambda$3;
        String invokeMethodQuietly$lambda$0;
        String methodQuietly$lambda$1;
        String declaredMethodQuietly$lambda$2;
        String constructObjectQuietly$lambda$0;
        String methodQuietly$lambda$0;
        String cacheFileSuffix$lambda$0;
        String isValidLogPurchaseInput$lambda$2;
        String isValidLogPurchaseInput$lambda$0;
        String isValidLogCustomEventInput$lambda$0;
        String isValidPushStoryClickInput$lambda$1;
        String isValidPushStoryClickInput$lambda$0;
        String isValidLogPurchaseInput$lambda$4;
        String localHtmlUrlFromRemoteUrl$lambda$0;
        String hasTooManyZipEntries$lambda$0;
        String localHtmlUrlFromRemoteUrl$lambda$4;
        String unpackZipIntoDirectory$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                return b.a();
            case 1:
                random_delegate$lambda$0 = IntentUtils.random_delegate$lambda$0();
                return random_delegate$lambda$0;
            case 2:
                prettyPrintedString$lambda$0 = JsonUtils.getPrettyPrintedString$lambda$0();
                return prettyPrintedString$lambda$0;
            case 3:
                parseJsonObjectIntoBundle$lambda$0 = JsonUtils.parseJsonObjectIntoBundle$lambda$0();
                return parseJsonObjectIntoBundle$lambda$0;
            case 4:
                colorIntegerOrNull$lambda$0 = JsonUtils.getColorIntegerOrNull$lambda$0();
                return colorIntegerOrNull$lambda$0;
            case 5:
                wouldPushPermissionPromptDisplay$lambda$0 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$0();
                return wouldPushPermissionPromptDisplay$lambda$0;
            case 6:
                requestPushPermissionPrompt$lambda$2 = PermissionUtils.requestPushPermissionPrompt$lambda$2();
                return requestPushPermissionPrompt$lambda$2;
            case 7:
                wouldPushPermissionPromptDisplay$lambda$1 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$1();
                return wouldPushPermissionPromptDisplay$lambda$1;
            case 8:
                wouldPushPermissionPromptDisplay$lambda$3 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$3();
                return wouldPushPermissionPromptDisplay$lambda$3;
            case 9:
                wouldPushPermissionPromptDisplay$lambda$5 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$5();
                return wouldPushPermissionPromptDisplay$lambda$5;
            case 10:
                requestPushPermissionPrompt$lambda$0 = PermissionUtils.requestPushPermissionPrompt$lambda$0();
                return requestPushPermissionPrompt$lambda$0;
            case 11:
                requestPushPermissionPrompt$lambda$1 = PermissionUtils.requestPushPermissionPrompt$lambda$1();
                return requestPushPermissionPrompt$lambda$1;
            case 12:
                requestPushPermissionPrompt$lambda$3 = PermissionUtils.requestPushPermissionPrompt$lambda$3();
                return requestPushPermissionPrompt$lambda$3;
            case 13:
                invokeMethodQuietly$lambda$0 = ReflectionUtils.invokeMethodQuietly$lambda$0();
                return invokeMethodQuietly$lambda$0;
            case 14:
                methodQuietly$lambda$1 = ReflectionUtils.getMethodQuietly$lambda$1();
                return methodQuietly$lambda$1;
            case 15:
                declaredMethodQuietly$lambda$2 = ReflectionUtils.getDeclaredMethodQuietly$lambda$2();
                return declaredMethodQuietly$lambda$2;
            case 16:
                constructObjectQuietly$lambda$0 = ReflectionUtils.constructObjectQuietly$lambda$0();
                return constructObjectQuietly$lambda$0;
            case 17:
                methodQuietly$lambda$0 = ReflectionUtils.getMethodQuietly$lambda$0();
                return methodQuietly$lambda$0;
            case 18:
                cacheFileSuffix$lambda$0 = StringUtils.getCacheFileSuffix$lambda$0();
                return cacheFileSuffix$lambda$0;
            case 19:
                isValidLogPurchaseInput$lambda$2 = ValidationUtils.isValidLogPurchaseInput$lambda$2();
                return isValidLogPurchaseInput$lambda$2;
            case 20:
                isValidLogPurchaseInput$lambda$0 = ValidationUtils.isValidLogPurchaseInput$lambda$0();
                return isValidLogPurchaseInput$lambda$0;
            case 21:
                isValidLogCustomEventInput$lambda$0 = ValidationUtils.isValidLogCustomEventInput$lambda$0();
                return isValidLogCustomEventInput$lambda$0;
            case 22:
                isValidPushStoryClickInput$lambda$1 = ValidationUtils.isValidPushStoryClickInput$lambda$1();
                return isValidPushStoryClickInput$lambda$1;
            case 23:
                isValidPushStoryClickInput$lambda$0 = ValidationUtils.isValidPushStoryClickInput$lambda$0();
                return isValidPushStoryClickInput$lambda$0;
            case 24:
                isValidLogPurchaseInput$lambda$4 = ValidationUtils.isValidLogPurchaseInput$lambda$4();
                return isValidLogPurchaseInput$lambda$4;
            case 25:
                localHtmlUrlFromRemoteUrl$lambda$0 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$0();
                return localHtmlUrlFromRemoteUrl$lambda$0;
            case 26:
                hasTooManyZipEntries$lambda$0 = WebContentUtils.hasTooManyZipEntries$lambda$0();
                return hasTooManyZipEntries$lambda$0;
            case 27:
                localHtmlUrlFromRemoteUrl$lambda$4 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$4();
                return localHtmlUrlFromRemoteUrl$lambda$4;
            case 28:
                unpackZipIntoDirectory$lambda$0 = WebContentUtils.unpackZipIntoDirectory$lambda$0();
                return unpackZipIntoDirectory$lambda$0;
            default:
                return c.c();
        }
    }
}
