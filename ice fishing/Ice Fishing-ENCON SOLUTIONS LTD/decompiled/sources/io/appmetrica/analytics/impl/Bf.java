package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class Bf implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final ContentValues f4214a;

    /* renamed from: b, reason: collision with root package name */
    public final ResultReceiver f4215b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f4213c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<Bf> CREATOR = new Af();

    public Bf(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f4214a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f4213c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f4215b = resultReceiver;
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap b2 = Fm.b(map);
            synchronized (this) {
                this.f4214a.put("PROCESS_CFG_CLIDS", AbstractC0430gb.b(b2));
            }
        }
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f4214a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC0572lo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f4214a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            i();
        }
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f4214a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer f() {
        return this.f4214a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String g() {
        return this.f4214a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean h() {
        return this.f4214a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final synchronized void i() {
        this.f4214a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f4214a + ", mDataResultReceiver=" + this.f4215b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f4214a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f4215b);
        parcel.writeBundle(bundle);
    }

    public final HashMap a() {
        return AbstractC0430gb.c(this.f4214a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final String c() {
        return this.f4214a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public final String d() {
        return this.f4214a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public Bf(Bf bf) {
        synchronized (bf) {
            this.f4214a = new ContentValues(bf.f4214a);
            this.f4215b = bf.f4215b;
        }
    }

    public final ArrayList b() {
        String asString = this.f4214a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC0430gb.b(asString);
    }

    public Bf(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f4214a = contentValues == null ? new ContentValues() : contentValues;
        this.f4215b = resultReceiver;
    }
}
