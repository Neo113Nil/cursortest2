package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Xl implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C0433ge f5403a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0639od f5404b;

    /* renamed from: c, reason: collision with root package name */
    public final Hb f5405c = new Hb();

    public Xl(C0433ge c0433ge, InterfaceC0639od interfaceC0639od) {
        this.f5403a = c0433ge;
        this.f5404b = interfaceC0639od;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0312bm c0312bm) {
        C0616ng c0616ng;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.DEVICE_ID), c0312bm.getDeviceId());
        a(builder, C0610na.f6575I.h(), this.f5405c);
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.APP_SET_ID), c0312bm.getAppSetId());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0312bm.getAppSetIdScope());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.APP_PLATFORM), c0312bm.getAppPlatform());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.PROTOCOL_VERSION), c0312bm.getProtocolVersion());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0312bm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.MODEL), c0312bm.getModel());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.MANUFACTURER), c0312bm.getManufacturer());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.OS_VERSION), c0312bm.getOsVersion());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0312bm.getScreenWidth()));
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0312bm.getScreenHeight()));
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c0312bm.getScreenDpi()));
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0312bm.getScaleFactor()));
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.LOCALE), c0312bm.getLocale());
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.DEVICE_TYPE), c0312bm.getDeviceType());
        builder.appendQueryParameter(this.f5403a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f5403a.a("query_hosts"), String.valueOf(2));
        String a2 = this.f5403a.a("features");
        List<String> h2 = ((C0879xk) this.f5404b).h();
        String[] strArr = {this.f5403a.a("permissions_collecting"), this.f5403a.a("features_collecting"), this.f5403a.a("google_aid"), this.f5403a.a("huawei_oaid"), this.f5403a.a("sim_info"), this.f5403a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(h2);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a2, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.APP_ID), c0312bm.getPackageName());
        builder.appendQueryParameter(this.f5403a.a("app_debuggable"), ((N5) c0312bm).f4798a);
        if (c0312bm.f5695l) {
            String str = c0312bm.f5696m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f5403a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f5403a.a("detect_locale"), String.valueOf(1));
        }
        C0706r3 c0706r3 = c0312bm.f5692i;
        if (!AbstractC0572lo.a(c0706r3.f6806a)) {
            builder.appendQueryParameter(this.f5403a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f5403a.a("clids_set"), Fm.a(c0706r3.f6806a));
            int ordinal = c0706r3.f6807b.ordinal();
            builder.appendQueryParameter(this.f5403a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0312bm.f5689f;
            String str3 = c0312bm.f5690g;
            if (TextUtils.isEmpty(str2) && (c0616ng = c0312bm.f5698o.f6455b) != null) {
                str2 = c0616ng.f6624a;
                str3 = c0616ng.f6627d.f6523a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f5403a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f5403a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0312bm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f5403a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f5403a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f5403a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f5403a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f5403a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f5403a.a("app_system_flag"), ((N5) c0312bm).f4799b);
        builder.appendQueryParameter(this.f5403a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f5403a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f5403a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> d2 = ((C0879xk) this.f5404b).d();
        for (String str4 : d2.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(d2.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, Hb hb) {
        hb.getClass();
        AdvertisingIdsHolder identifiers = C0610na.f6575I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f5403a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
