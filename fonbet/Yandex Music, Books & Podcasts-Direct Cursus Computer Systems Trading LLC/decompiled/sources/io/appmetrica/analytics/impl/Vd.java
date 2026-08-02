package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Vd implements N9 {
    public final C0668tj a;
    public final C0637sh b;
    public final String c = "activation_unlock_event_sending";
    public final AtomicBoolean d;

    public Vd(@NotNull C0668tj c0668tj, @NotNull C0250f5 c0250f5, @NotNull C0637sh c0637sh) {
        this.a = c0668tj;
        this.b = c0637sh;
        this.d = new AtomicBoolean(c0637sh.a(false) || a(c0250f5));
    }

    public final void a(String str) {
        try {
            Om om = AbstractC0469mm.a;
            String str2 = this.c;
            JSONObject put = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            Ua i = C0747wb.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0470mn c0470mn = C0747wb.I.D;
            String jSONObject = put2.put("activation_offset", (c0470mn.a.currentTimeMillis() - c0470mn.b) / 1000).toString();
            om.getClass();
            om.a(new Mm(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.N9
    public final boolean b() {
        String str;
        if (!this.d.get() && (str = ((Nj) this.a.a()).m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.d.compareAndSet(false, true)) {
            this.b.b(true);
            a("activation");
        }
        return this.d.get();
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.b.b(true);
            a("timer");
        }
    }

    public static boolean a(C0250f5 c0250f5) {
        String str = c0250f5.a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
