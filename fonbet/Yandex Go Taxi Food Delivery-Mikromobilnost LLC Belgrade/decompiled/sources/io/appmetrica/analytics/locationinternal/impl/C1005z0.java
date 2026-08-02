package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1005z0 implements Consumer {
    public final C0948g a;
    public final C0942e0 b;
    public final ChargeTypeProvider c;
    public final ApplicationStateProvider d;
    public final SystemTimeProvider e;

    public C1005z0(C0948g c0948g, C0942e0 c0942e0, ChargeTypeProvider chargeTypeProvider, ApplicationStateProvider applicationStateProvider, SystemTimeProvider systemTimeProvider) {
        this.a = c0948g;
        this.b = c0942e0;
        this.c = chargeTypeProvider;
        this.d = applicationStateProvider;
        this.e = systemTimeProvider;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(F0 f0) {
        String str;
        if (f0 != null) {
            f0.b = this.e.currentTimeMillis();
            f0.c = this.e.elapsedRealtime();
            f0.f = this.c.getChargeType();
            f0.g = Q.a(this.d.getCurrentState());
            C0942e0 c0942e0 = this.b;
            c0942e0.getClass();
            String str2 = null;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ClidProvider.TIMESTAMP, f0.b);
                jSONObject.put("elapsed_realtime_seconds", f0.c);
                jSONObject.put("wifi_info", f0.d);
                jSONObject.put("cell_info", f0.e);
                ChargeType chargeType = f0.f;
                if (chargeType != null) {
                    jSONObject.put("charge_type", chargeType.getId());
                }
                int i = f0.g;
                if (i != 0) {
                    jSONObject.put("collection_mode", Q.a(i));
                }
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
            this.a.a(f0.b, str2);
        }
    }
}
