package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ke, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0477ke implements U9 {
    public final C0916zj a;
    public final Ih b;
    public final String c = "activation_unlock_event_sending";
    public final AtomicBoolean d;

    public C0477ke(C0916zj c0916zj, C0439j5 c0439j5, Ih ih) {
        this.a = c0916zj;
        this.b = ih;
        this.d = new AtomicBoolean(ih.a(false) || a(c0439j5));
    }

    public final void a(String str) {
        try {
            C0313en c0313en = Cm.a;
            String str2 = this.c;
            JSONObject put = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            C0244cb i = Jb.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            En en = Jb.I.D;
            String jSONObject = put2.put("activation_offset", (en.a.currentTimeMillis() - en.b) / 1000).toString();
            c0313en.getClass();
            c0313en.a(new C0256cn(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.U9
    public final boolean b() {
        String str;
        if (!this.d.get() && (str = ((Xj) this.a.a()).m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.d.compareAndSet(false, true)) {
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

    public static boolean a(C0439j5 c0439j5) {
        String str = c0439j5.a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
