package io.appmetrica.analytics.rtm.impl;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.AdjustConfig;
import com.yandex.browser.rtm.Environment;
import com.yandex.browser.rtm.Platform;
import com.yandex.browser.rtm.Silent;
import defpackage.b5i0;
import defpackage.e5i0;
import defpackage.f5i0;
import defpackage.i5i0;
import defpackage.k5i0;
import io.appmetrica.analytics.rtm.internal.service.DefaultValuesProvider;
import io.appmetrica.analytics.rtm.internal.service.RtmLibBuilderWrapper;
import io.appmetrica.analytics.rtm.internal.service.UploadScheduler;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class y {
    public static final x p = new x();
    public String a;
    public String b;
    public String c;
    public Platform d;
    public String e;
    public String f;
    public Environment g;
    public String h;
    public String i;
    public i5i0 j;
    public final Context k;
    public final DefaultValuesProvider l;
    public final RtmLibBuilderWrapper m;
    public final k5i0 n;
    public final A o;

    public y(Context context, DefaultValuesProvider defaultValuesProvider, RtmLibBuilderWrapper rtmLibBuilderWrapper, UploadScheduler uploadScheduler, A a) {
        this.k = context;
        this.l = defaultValuesProvider;
        this.m = rtmLibBuilderWrapper;
        this.n = uploadScheduler;
        this.o = a;
    }

    public final synchronized void a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7, JSONObject jSONObject8, JSONObject jSONObject9, JSONObject jSONObject10) {
        if (jSONObject != null) {
            try {
                this.i = jSONObject.optString("value", null);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jSONObject7 != null) {
            this.a = jSONObject7.optString("value", null);
        }
        if (jSONObject8 != null) {
            this.b = jSONObject8.optString("value", null);
        }
        if (jSONObject9 != null) {
            this.c = jSONObject9.optString("value", null);
        }
        if (jSONObject3 != null) {
            String optString = jSONObject3.optString("value", null);
            this.d = "phone".equals(optString) ? Platform.PHONE : "tablet".equals(optString) ? Platform.TABLET : "tv".equals(optString) ? Platform.TV : TextUtils.isEmpty(optString) ? null : Platform.UNSUPPORTED;
        }
        if (jSONObject4 != null) {
            this.e = jSONObject4.optString("value", null);
        }
        if (jSONObject2 != null) {
            this.h = jSONObject2.optString("value", null);
        }
        if (jSONObject5 != null) {
            this.f = jSONObject5.optString("value", null);
        }
        if (jSONObject6 != null) {
            String optString2 = jSONObject6.optString("value");
            this.g = "development".equals(optString2) ? Environment.DEVELOPMENT : "testing".equals(optString2) ? Environment.TESTING : "prestable".equals(optString2) ? Environment.PRESTABLE : AdjustConfig.ENVIRONMENT_PRODUCTION.equals(optString2) ? Environment.PRODUCTION : "pre-production".equals(optString2) ? Environment.PREPRODUCTION : null;
        }
        if (jSONObject10 != null) {
            String optString3 = jSONObject10.optString("value", null);
            if (!TextUtils.isEmpty(optString3)) {
                this.o.a(optString3);
            }
        }
    }

    public final synchronized void a(String str, String str2, Boolean bool) {
        f5i0 a;
        Silent silent;
        try {
            a = a();
        } catch (Throwable unused) {
        }
        if (a == null) {
            return;
        }
        b5i0 a2 = a.a(str);
        a2.r = str2;
        if (bool == null) {
            silent = null;
        } else {
            silent = bool.booleanValue() ? Silent.TRUE : Silent.FALSE;
        }
        a2.u = silent;
        a2.f = this.a;
        a2.g = this.b;
        a2.h = this.c;
        a2.k = (String) p.getValue();
        a2.e();
    }

    public final f5i0 a() {
        String str;
        if (TextUtils.isEmpty(this.h)) {
            str = this.l.getVersion(this.k);
        } else {
            str = this.h;
        }
        Platform platform = null;
        if (TextUtils.isEmpty(this.i) || TextUtils.isEmpty(str)) {
            return null;
        }
        e5i0 newBuilder = this.m.newBuilder(this.i, str, this.n);
        Environment environment = this.g;
        if (environment != null) {
            newBuilder.g = environment;
        }
        String str2 = this.e;
        if (str2 != null) {
            newBuilder.d = str2;
        }
        Platform platform2 = this.d;
        if (platform2 == null) {
            String deviceType = this.l.getDeviceType(this.k);
            if ("phone".equals(deviceType)) {
                platform = Platform.PHONE;
            } else if ("tablet".equals(deviceType)) {
                platform = Platform.TABLET;
            } else if ("tv".equals(deviceType)) {
                platform = Platform.TV;
            } else if (!TextUtils.isEmpty(deviceType)) {
                platform = Platform.UNSUPPORTED;
            }
            platform2 = platform == null ? Platform.UNSUPPORTED : platform;
        }
        newBuilder.e = platform2;
        String str3 = this.f;
        if (str3 != null) {
            newBuilder.f = str3;
        }
        i5i0 i5i0Var = this.j;
        if (i5i0Var != null) {
            newBuilder.h = i5i0Var;
        }
        return new f5i0(newBuilder);
    }
}
