package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Fh extends H3 {

    /* renamed from: c, reason: collision with root package name */
    protected D8 f4384c;

    /* renamed from: d, reason: collision with root package name */
    protected C0796uf f4385d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4386e;

    /* renamed from: f, reason: collision with root package name */
    public String f4387f;

    public Fh(Bf bf, CounterConfiguration counterConfiguration, D8 d8) {
        this(bf, counterConfiguration, d8, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f4459b.toBundle(bundle);
        Bf bf = this.f4458a;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        return bundle;
    }

    public final synchronized String d() {
        D8 d8;
        d8 = this.f4384c;
        return d8.f4293a.isEmpty() ? null : new JSONObject(d8.f4293a).toString();
    }

    public final synchronized String e() {
        return this.f4387f;
    }

    public boolean f() {
        return this.f4386e;
    }

    public Fh(Bf bf, CounterConfiguration counterConfiguration, D8 d8, String str) {
        super(bf, counterConfiguration);
        this.f4386e = true;
        this.f4387f = str;
        this.f4384c = d8;
    }
}
