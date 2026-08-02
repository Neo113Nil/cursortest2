package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
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
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* renamed from: io.appmetrica.analytics.impl.sp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0719sp implements IParamsAppender {
    public final Ug a;
    public final InterfaceC0449jf b;
    public final C0852xd c = new C0852xd();

    public C0719sp(Ug ug, InterfaceC0449jf interfaceC0449jf) {
        this.a = ug;
        this.b = interfaceC0449jf;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0864xp c0864xp) {
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.DEVICE_ID), c0864xp.getDeviceId());
        a(builder, Jb.I.h(), this.c);
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_SET_ID), c0864xp.getAppSetId());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0864xp.getAppSetIdScope());
        builder.appendQueryParameter(this.a.a("app_platform"), c0864xp.getAppPlatform());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.PROTOCOL_VERSION), c0864xp.getProtocolVersion());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0864xp.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.a.a("model"), c0864xp.getModel());
        builder.appendQueryParameter(this.a.a("manufacturer"), c0864xp.getManufacturer());
        builder.appendQueryParameter(this.a.a("os_version"), c0864xp.getOsVersion());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0864xp.getScreenWidth()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0864xp.getScreenHeight()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c0864xp.getScreenDpi()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0864xp.getScaleFactor()));
        builder.appendQueryParameter(this.a.a("locale"), c0864xp.getLocale());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.DEVICE_TYPE), c0864xp.getDeviceType());
        builder.appendQueryParameter(this.a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("query_hosts"), String.valueOf(2));
        String a = this.a.a("features");
        List<String> g = ((Pn) this.b).g();
        String[] strArr = {this.a.a("permissions_collecting"), this.a.a("features_collecting"), this.a.a("google_aid"), this.a.a("huawei_oaid"), this.a.a("sim_info"), this.a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(g);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_ID), c0864xp.getPackageName());
        builder.appendQueryParameter(this.a.a("app_debuggable"), ((I6) c0864xp).a);
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_VERSION), c0864xp.getAppVersion());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_VERSION_CODE), c0864xp.getAppBuildNumber());
        if (c0864xp.l) {
            String str = c0864xp.m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.a.a("detect_locale"), String.valueOf(1));
        }
        C0467k4 c0467k4 = c0864xp.i;
        if (!Or.a(c0467k4.a)) {
            builder.appendQueryParameter(this.a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.a.a("clids_set"), AbstractC0230bq.a(c0467k4.a));
            int ordinal = c0467k4.b.ordinal();
            builder.appendQueryParameter(this.a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0864xp.f;
            String str3 = c0864xp.g;
            if (TextUtils.isEmpty(str2)) {
                InterfaceC0309ej interfaceC0309ej = c0864xp.o.b;
                Ui a2 = interfaceC0309ej == null ? null : interfaceC0309ej.a();
                if (a2 != null) {
                    str2 = a2.a;
                    str3 = Ti.a(a2.d);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.a.a(Constants.INSTALL_REFERRER), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0864xp.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.a.a("uuid"), uuid);
        }
        builder.appendQueryParameter(this.a.a(RemoteBioParameters.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("app_system_flag"), ((I6) c0864xp).b);
        builder.appendQueryParameter(this.a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> c = ((Pn) this.b).c();
        for (String str4 : c.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(c.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, C0852xd c0852xd) {
        c0852xd.getClass();
        AdvertisingIdsHolder identifiers = Jb.I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            boolean isValid = google.isValid();
            Ug ug = this.a;
            if (!isValid) {
                builder.appendQueryParameter(ug.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(ug.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            boolean isValid2 = huawei.isValid();
            Ug ug2 = this.a;
            if (!isValid2) {
                builder.appendQueryParameter(ug2.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(ug2.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            boolean isValid3 = yandex.isValid();
            Ug ug3 = this.a;
            if (!isValid3) {
                builder.appendQueryParameter(ug3.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(ug3.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
