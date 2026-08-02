package io.appmetrica.analytics.rtm.impl;

import android.content.Context;
import android.text.TextUtils;
import defpackage.mtk;
import defpackage.ren;
import defpackage.uen;
import defpackage.ven;
import defpackage.wdb;
import defpackage.yen;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.appmetrica.analytics.rtm.internal.service.DefaultValuesProvider;
import io.appmetrica.analytics.rtm.internal.service.RtmLibBuilderWrapper;
import io.appmetrica.analytics.rtm.internal.service.UploadScheduler;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class y {
    public static final x o = new x();
    public String a;
    public String b;
    public String c;
    public mtk d;
    public String e;
    public String f;
    public wdb g;
    public String h;
    public String i;
    public final Context j;
    public final DefaultValuesProvider k;
    public final RtmLibBuilderWrapper l;
    public final yen m;
    public final A n;

    public y(Context context, DefaultValuesProvider defaultValuesProvider, RtmLibBuilderWrapper rtmLibBuilderWrapper, UploadScheduler uploadScheduler, A a) {
        this.j = context;
        this.k = defaultValuesProvider;
        this.l = rtmLibBuilderWrapper;
        this.m = uploadScheduler;
        this.n = a;
    }

    public final synchronized void a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7, JSONObject jSONObject8, JSONObject jSONObject9, JSONObject jSONObject10) {
        if (jSONObject != null) {
            try {
                this.i = jSONObject.optString(Constants.KEY_VALUE, null);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jSONObject7 != null) {
            this.a = jSONObject7.optString(Constants.KEY_VALUE, null);
        }
        if (jSONObject8 != null) {
            this.b = jSONObject8.optString(Constants.KEY_VALUE, null);
        }
        if (jSONObject9 != null) {
            this.c = jSONObject9.optString(Constants.KEY_VALUE, null);
        }
        if (jSONObject3 != null) {
            String optString = jSONObject3.optString(Constants.KEY_VALUE, null);
            this.d = "phone".equals(optString) ? mtk.PHONE : "tablet".equals(optString) ? mtk.TABLET : "tv".equals(optString) ? mtk.TV : TextUtils.isEmpty(optString) ? null : mtk.UNSUPPORTED;
        }
        if (jSONObject4 != null) {
            this.e = jSONObject4.optString(Constants.KEY_VALUE, null);
        }
        if (jSONObject2 != null) {
            this.h = jSONObject2.optString(Constants.KEY_VALUE, null);
        }
        if (jSONObject5 != null) {
            this.f = jSONObject5.optString(Constants.KEY_VALUE, null);
        }
        if (jSONObject6 != null) {
            String optString2 = jSONObject6.optString(Constants.KEY_VALUE);
            this.g = "development".equals(optString2) ? wdb.DEVELOPMENT : "testing".equals(optString2) ? wdb.TESTING : "prestable".equals(optString2) ? wdb.PRESTABLE : "production".equals(optString2) ? wdb.PRODUCTION : "pre-production".equals(optString2) ? wdb.PREPRODUCTION : null;
        }
        if (jSONObject10 != null) {
            String optString3 = jSONObject10.optString(Constants.KEY_VALUE, null);
            if (!TextUtils.isEmpty(optString3)) {
                this.n.a(optString3);
            }
        }
    }

    public final synchronized void a(String str, String str2, Boolean bool) {
        ven a;
        int i;
        try {
            a = a();
        } catch (Throwable unused) {
        }
        if (a == null) {
            return;
        }
        ren a2 = a.a(str);
        a2.q = str2;
        if (bool == null) {
            i = 0;
        } else {
            i = bool.booleanValue() ? 1 : 2;
        }
        a2.t = i;
        a2.f = this.a;
        a2.g = this.b;
        a2.h = this.c;
        x xVar = o;
        xVar.getClass();
        a2.k = (String) xVar.getValue();
        a2.e();
    }

    public final ven a() {
        String str;
        if (TextUtils.isEmpty(this.h)) {
            str = this.k.getVersion(this.j);
        } else {
            str = this.h;
        }
        mtk mtkVar = null;
        if (TextUtils.isEmpty(this.i) || TextUtils.isEmpty(str)) {
            return null;
        }
        uen newBuilder = this.l.newBuilder(this.i, str, this.m);
        wdb wdbVar = this.g;
        if (wdbVar != null) {
            newBuilder.getClass();
            newBuilder.g = wdbVar;
        }
        String str2 = this.e;
        if (str2 != null) {
            newBuilder.getClass();
            newBuilder.d = str2;
        }
        mtk mtkVar2 = this.d;
        if (mtkVar2 == null) {
            String deviceType = this.k.getDeviceType(this.j);
            boolean equals = "phone".equals(deviceType);
            mtk mtkVar3 = mtk.UNSUPPORTED;
            if (equals) {
                mtkVar = mtk.PHONE;
            } else if ("tablet".equals(deviceType)) {
                mtkVar = mtk.TABLET;
            } else if ("tv".equals(deviceType)) {
                mtkVar = mtk.TV;
            } else if (!TextUtils.isEmpty(deviceType)) {
                mtkVar = mtkVar3;
            }
            mtkVar2 = mtkVar == null ? mtkVar3 : mtkVar;
        }
        newBuilder.getClass();
        newBuilder.e = mtkVar2;
        String str3 = this.f;
        if (str3 != null) {
            newBuilder.f = str3;
        }
        return new ven(newBuilder);
    }
}
