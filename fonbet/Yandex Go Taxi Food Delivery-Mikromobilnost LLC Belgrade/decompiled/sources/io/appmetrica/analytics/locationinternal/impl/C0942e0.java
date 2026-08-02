package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0942e0 {
    public final Context a;
    public final f2 b = new f2();

    public C0942e0(Context context) {
        this.a = context;
    }

    public final F0 a(long j, String str) {
        String str2;
        try {
            f2 f2Var = this.b;
            Context context = this.a;
            f2Var.getClass();
            str2 = f2.a(context, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            F0 f0 = new F0();
            try {
                f0.a = Long.valueOf(j);
                JSONObject jSONObject = new JSONObject(str2);
                f0.b = jSONObject.optLong(ClidProvider.TIMESTAMP, 0L);
                f0.c = jSONObject.optLong("elapsed_realtime_seconds", 0L);
                f0.e = jSONObject.optJSONArray("cell_info");
                f0.d = jSONObject.optJSONArray("wifi_info");
                f0.f = ChargeType.fromId(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE)));
                String optString = jSONObject.optString("collection_mode");
                int i = 1;
                for (int i2 : S.a(3)) {
                    if (Q.a(i2).equals(optString)) {
                        i = i2;
                    }
                }
                f0.g = i;
            } catch (Throwable unused2) {
            }
            return f0;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public final F1 b(long j, String str) {
        String str2;
        try {
            f2 f2Var = this.b;
            Context context = this.a;
            f2Var.getClass();
            str2 = f2.a(context, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            long optLong = jSONObject.optLong("receive_timestamp", 0L);
            long optLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0L);
            String optString = jSONObject.optString("collection_mode");
            int i = 1;
            for (int i2 : S.a(3)) {
                if (Q.a(i2).equals(optString)) {
                    i = i2;
                }
            }
            int i3 = i;
            Location location = new Location(jSONObject.optString("provider", null));
            location.setLongitude(jSONObject.optDouble("lon", 0.0d));
            location.setLatitude(jSONObject.optDouble("lat", 0.0d));
            location.setTime(jSONObject.optLong(ClidProvider.TIMESTAMP, 0L));
            location.setAccuracy((float) jSONObject.optDouble("precision", 0.0d));
            location.setBearing((float) jSONObject.optDouble("direction", 0.0d));
            location.setSpeed((float) jSONObject.optDouble("speed", 0.0d));
            location.setAltitude(jSONObject.optDouble("altitude", 0.0d));
            return new F1(i3, optLong, optLong2, location, ChargeType.fromId(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))), Long.valueOf(j));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
