package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public final class n4t {
    public final SharedPreferences a;

    public n4t() {
        l18 l18Var = l18.b;
        bdt I = hag.I(Context.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        SharedPreferences sharedPreferences = ((Context) qdcVar.C(I)).getSharedPreferences("Yandex_Music", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    public final void a(long j, long j2, e2j e2jVar) {
        this.a.edit().putLong("pulse_job_traffic_timestamp:" + e2jVar.name(), j2).putLong("pulse_job_key_traffic_size:" + e2jVar.name(), j).apply();
    }
}
