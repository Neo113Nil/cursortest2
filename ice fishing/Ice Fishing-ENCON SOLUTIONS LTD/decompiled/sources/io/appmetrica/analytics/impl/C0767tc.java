package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767tc implements F8 {

    /* renamed from: a, reason: collision with root package name */
    public final Qg f6941a;

    /* renamed from: b, reason: collision with root package name */
    public final We f6942b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6943c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6944d;

    public C0767tc(Qg qg, C0630o4 c0630o4, We we) {
        this.f6941a = qg;
        this.f6942b = we;
        this.f6944d = new AtomicBoolean(we.a(false) || a(c0630o4));
    }

    public final void a(String str) {
        try {
            Qj qj = AbstractC0645oj.f6689a;
            String str2 = this.f6943c;
            JSONObject put = new JSONObject().put(AdRevenueConstants.SOURCE_KEY, str).put("framework", FrameworkDetector.framework());
            M9 i2 = C0610na.f6575I.i();
            Bundle applicationMetaData = i2.f4747d.getApplicationMetaData(i2.f4744a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0594mk c0594mk = C0610na.f6575I.f6579D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c0594mk.f6533a.currentTimeMillis() - c0594mk.f6534b, TimeUnit.MILLISECONDS)).toString();
            qj.getClass();
            qj.a(new Oj(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        String str;
        if (!this.f6944d.get() && (str = ((C0539kh) this.f6941a.a()).f6384m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f6944d.compareAndSet(false, true)) {
            this.f6942b.b(true);
            a("activation");
        }
        return this.f6944d.get();
    }

    public final void a() {
        if (this.f6944d.compareAndSet(false, true)) {
            this.f6942b.b(true);
            a("timer");
        }
    }

    public static boolean a(C0630o4 c0630o4) {
        String str = c0630o4.f6644a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
