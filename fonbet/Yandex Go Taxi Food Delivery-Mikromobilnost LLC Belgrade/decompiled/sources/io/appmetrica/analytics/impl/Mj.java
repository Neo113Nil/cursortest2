package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* loaded from: classes9.dex */
public final class Mj implements IParamsAppender {
    public final AdvIdWithLimitedAppender a;
    public final NetworkTaskForSendingDataParamsAppender b;
    public C0414i8 c;
    public final C0852xd d;
    public long e;

    public Mj(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new C0852xd());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, Xj xj) {
        builder.path("report");
        this.b.appendEncryptedData(builder);
        C0414i8 c0414i8 = this.c;
        if (c0414i8 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0414i8.a, xj.getDeviceId()));
            builder.appendQueryParameter("uuid", StringUtils.ifIsEmptyToDef(this.c.b, xj.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.c.c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.c.f, xj.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.c.h, xj.getAppBuildNumber()));
            builder.appendQueryParameter("os_version", StringUtils.ifIsEmptyToDef(this.c.i, xj.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.c.j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.c.d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.c.e);
            a(builder, "app_debuggable", this.c.g);
            builder.appendQueryParameter("locale", StringUtils.ifIsEmptyToDef(this.c.k, xj.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.c.l, xj.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.c.m, xj.getAppFramework()));
            a(builder, "attribution_id", this.c.n);
        }
        builder.appendQueryParameter("api_key_128", xj.m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, xj.getPackageName());
        builder.appendQueryParameter("app_platform", xj.getAppPlatform());
        builder.appendQueryParameter("model", xj.getModel());
        builder.appendQueryParameter("manufacturer", xj.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(xj.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(xj.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(xj.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(xj.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, xj.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(xj.p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, xj.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, xj.getAppSetIdScope());
        builder.appendQueryParameter("is_main", xj.y ? "1" : "0");
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.a;
        this.d.getClass();
        advIdWithLimitedAppender.appendParams(builder, Jb.I.c().getIdentifiers());
        builder.appendQueryParameter("request_id", String.valueOf(this.e));
    }

    public Mj(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, C0852xd c0852xd) {
        this.a = advIdWithLimitedAppender;
        this.b = networkTaskForSendingDataParamsAppender;
        this.d = c0852xd;
    }

    public final void a(long j) {
        this.e = j;
    }

    public final void a(C0414i8 c0414i8) {
        this.c = c0414i8;
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
