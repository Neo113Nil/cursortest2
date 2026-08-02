package io.appmetrica.analytics.impl;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;

/* loaded from: classes9.dex */
public final class Q8 implements IParamsAppender {
    public final AdvIdWithLimitedAppender a = new AdvIdWithLimitedAppender();
    public final C0852xd b = new C0852xd();

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, U8 u8) {
        builder.appendPath("diagnostic").appendQueryParameter(CommonUrlParts.DEVICE_ID, u8.getDeviceId()).appendQueryParameter("uuid", u8.getUuid()).appendQueryParameter("app_platform", u8.getAppPlatform()).appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, u8.getAnalyticsSdkVersionName()).appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, u8.getAnalyticsSdkBuildNumber()).appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, u8.getAnalyticsSdkBuildType()).appendQueryParameter(CommonUrlParts.APP_VERSION, u8.getAppVersion()).appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, u8.getAppBuildNumber()).appendQueryParameter("model", u8.getModel()).appendQueryParameter("manufacturer", u8.getManufacturer()).appendQueryParameter("os_version", u8.getOsVersion()).appendQueryParameter(CommonUrlParts.OS_API_LEVEL, String.valueOf(u8.getOsApiLevel())).appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(u8.getScreenWidth())).appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(u8.getScreenHeight())).appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(u8.getScreenDpi())).appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(u8.getScaleFactor())).appendQueryParameter("locale", u8.getLocale()).appendQueryParameter(CommonUrlParts.DEVICE_TYPE, u8.getDeviceType()).appendQueryParameter(CommonUrlParts.APP_ID, u8.getPackageName()).appendQueryParameter("api_key_128", u8.e).appendQueryParameter("app_debuggable", ((I6) u8).a).appendQueryParameter(CommonUrlParts.ROOT_STATUS, u8.getDeviceRootStatus()).appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, u8.getAppFramework()).appendQueryParameter(CommonUrlParts.APP_SET_ID, u8.getAppSetId()).appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, u8.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.a;
        this.b.getClass();
        advIdWithLimitedAppender.appendParams(builder, Jb.I.c().getIdentifiers());
    }
}
