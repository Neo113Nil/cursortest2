package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.connectsdk.discovery.provider.ssdp.Argument;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.io.UnsupportedEncodingException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.z1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0931z1 implements Consumer {
    public final C0872g a;
    public final C0865e0 b;
    public final ChargeTypeProvider c;
    public final ApplicationStateProvider d;
    public final SystemTimeProvider e;

    public C0931z1(@NotNull C0872g c0872g, @NotNull C0865e0 c0865e0, @NotNull ChargeTypeProvider chargeTypeProvider, @NotNull ApplicationStateProvider applicationStateProvider, @NotNull SystemTimeProvider systemTimeProvider) {
        this.a = c0872g;
        this.b = c0865e0;
        this.c = chargeTypeProvider;
        this.d = applicationStateProvider;
        this.e = systemTimeProvider;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(Location location) {
        String str;
        if (location != null) {
            int a = Q.a(this.d.getCurrentState());
            long currentTimeMillis = this.e.currentTimeMillis();
            long elapsedRealtime = this.e.elapsedRealtime();
            ChargeType chargeType = this.c.getChargeType();
            C0865e0 c0865e0 = this.b;
            c0865e0.getClass();
            String str2 = null;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("collection_mode", Q.a(a));
                jSONObject.put("lat", location.getLatitude());
                jSONObject.put("lon", location.getLongitude());
                jSONObject.put("timestamp", location.getTime());
                jSONObject.put("receive_elapsed_realtime_seconds", elapsedRealtime);
                jSONObject.put("receive_timestamp", currentTimeMillis);
                jSONObject.put("charge_type", chargeType.getId());
                jSONObject.put("precision", location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : null);
                jSONObject.put(Argument.TAG_DIRECTION, location.hasBearing() ? Float.valueOf(location.getBearing()) : null);
                jSONObject.put("speed", location.hasSpeed() ? Float.valueOf(location.getSpeed()) : null);
                jSONObject.put("altitude", location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null);
                jSONObject.put("provider", StringUtils.ifIsEmptyToDef(location.getProvider(), null));
                str = jSONObject.toString();
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    C0871f2 c0871f2 = c0865e0.b;
                    Context context = c0865e0.a;
                    c0871f2.getClass();
                    str2 = C0871f2.b(context, str);
                } catch (UnsupportedEncodingException unused2) {
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.a.a(currentTimeMillis, str2);
        }
    }
}
