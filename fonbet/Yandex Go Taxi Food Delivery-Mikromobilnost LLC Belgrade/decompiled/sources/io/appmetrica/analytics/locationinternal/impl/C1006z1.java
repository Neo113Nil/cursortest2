package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.z1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1006z1 implements Consumer {
    public final C0948g a;
    public final C0942e0 b;
    public final ChargeTypeProvider c;
    public final ApplicationStateProvider d;
    public final SystemTimeProvider e;

    public C1006z1(C0948g c0948g, C0942e0 c0942e0, ChargeTypeProvider chargeTypeProvider, ApplicationStateProvider applicationStateProvider, SystemTimeProvider systemTimeProvider) {
        this.a = c0948g;
        this.b = c0942e0;
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
            C0942e0 c0942e0 = this.b;
            c0942e0.getClass();
            String str2 = null;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("collection_mode", Q.a(a));
                jSONObject.put("lat", location.getLatitude());
                jSONObject.put("lon", location.getLongitude());
                jSONObject.put(ClidProvider.TIMESTAMP, location.getTime());
                jSONObject.put("receive_elapsed_realtime_seconds", elapsedRealtime);
                jSONObject.put("receive_timestamp", currentTimeMillis);
                jSONObject.put("charge_type", chargeType.getId());
                jSONObject.put("precision", location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : null);
                jSONObject.put("direction", location.hasBearing() ? Float.valueOf(location.getBearing()) : null);
                jSONObject.put("speed", location.hasSpeed() ? Float.valueOf(location.getSpeed()) : null);
                jSONObject.put("altitude", location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null);
                jSONObject.put("provider", StringUtils.ifIsEmptyToDef(location.getProvider(), null));
                str = jSONObject.toString();
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    f2 f2Var = c0942e0.b;
                    Context context = c0942e0.a;
                    f2Var.getClass();
                    str2 = f2.b(context, str);
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
