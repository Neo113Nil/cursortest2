package io.appmetrica.analytics.locationinternal.impl;

import android.net.Uri;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.x1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1000x1 implements IParamsAppender {
    public final AdvIdWithLimitedAppender a;
    public final NetworkTaskForSendingDataParamsAppender b;
    public final ServiceContext c;
    public long d;

    public C1000x1(ServiceContext serviceContext, RequestBodyEncrypter requestBodyEncrypter) {
        this(serviceContext, new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0936c2 c0936c2) {
        this.b.appendEncryptedData(builder);
        builder.appendPath("location");
        builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, c0936c2.getDeviceId());
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0936c2.getDeviceType());
        builder.appendQueryParameter("uuid", c0936c2.getUuid());
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, c0936c2.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, c0936c2.getAnalyticsSdkBuildNumber());
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, c0936c2.getAnalyticsSdkBuildType());
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION, c0936c2.getAppVersion());
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, c0936c2.getAppBuildNumber());
        builder.appendQueryParameter("os_version", c0936c2.getOsVersion());
        builder.appendQueryParameter(CommonUrlParts.OS_API_LEVEL, String.valueOf(c0936c2.getOsApiLevel()));
        builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, c0936c2.getDeviceRootStatus());
        builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, c0936c2.getAppFramework());
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0936c2.getPackageName());
        builder.appendQueryParameter("app_platform", c0936c2.getAppPlatform());
        builder.appendQueryParameter("request_id", String.valueOf(this.d));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0936c2.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0936c2.getAppSetIdScope());
        this.a.appendParams(builder, this.c.getPlatformIdentifiers().getAdvIdentifiersProvider().getIdentifiers());
    }

    public C1000x1(ServiceContext serviceContext, AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.c = serviceContext;
        this.a = advIdWithLimitedAppender;
        this.b = networkTaskForSendingDataParamsAppender;
    }

    public final void a(long j) {
        this.d = j;
    }
}
