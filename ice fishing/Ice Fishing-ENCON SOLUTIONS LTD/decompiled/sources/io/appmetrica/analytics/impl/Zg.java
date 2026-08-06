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

/* loaded from: classes.dex */
public final class Zg implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f5519a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f5520b;

    /* renamed from: c, reason: collision with root package name */
    public C0555l7 f5521c;

    /* renamed from: d, reason: collision with root package name */
    public final Hb f5522d;

    /* renamed from: e, reason: collision with root package name */
    public long f5523e;

    public Zg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Hb());
    }

    public final void a(C0555l7 c0555l7) {
        this.f5521c = c0555l7;
    }

    public Zg(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Hb hb) {
        this.f5519a = advIdWithLimitedAppender;
        this.f5520b = networkTaskForSendingDataParamsAppender;
        this.f5522d = hb;
    }

    public final void a(long j2) {
        this.f5523e = j2;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0539kh c0539kh) {
        builder.path("report");
        this.f5520b.appendEncryptedData(builder);
        C0555l7 c0555l7 = this.f5521c;
        if (c0555l7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0555l7.f6424a, c0539kh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f5521c.f6425b, c0539kh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f5521c.f6426c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f5521c.f6429f, c0539kh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f5521c.f6431h, c0539kh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f5521c.f6432i, c0539kh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f5521c.f6433j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f5521c.f6427d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f5521c.f6428e);
            a(builder, "app_debuggable", this.f5521c.f6430g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f5521c.f6434k, c0539kh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f5521c.f6435l, c0539kh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f5521c.f6436m, c0539kh.getAppFramework()));
            a(builder, "attribution_id", this.f5521c.f6437n);
        }
        builder.appendQueryParameter("api_key_128", c0539kh.f6384m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0539kh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c0539kh.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c0539kh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c0539kh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c0539kh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c0539kh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c0539kh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c0539kh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0539kh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c0539kh.f6387p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0539kh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0539kh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f5519a;
        this.f5522d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C0610na.f6575I.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f5523e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
