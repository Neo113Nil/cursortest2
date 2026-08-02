package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C0714sk extends B4 {
    protected R9 c;
    protected C0366gi d;
    public boolean e;
    public String f;

    public C0714sk(C0597oi c0597oi, CounterConfiguration counterConfiguration, R9 r9, String str) {
        super(c0597oi, counterConfiguration);
        this.e = true;
        this.f = str;
        this.c = r9;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.b.toBundle(bundle);
        C0597oi c0597oi = this.a;
        synchronized (c0597oi) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c0597oi);
        }
        return bundle;
    }

    public final synchronized String d() {
        R9 r9;
        r9 = this.c;
        return r9.a.isEmpty() ? null : new JSONObject(r9.a).toString();
    }

    public final synchronized String e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public C0714sk(C0597oi c0597oi, CounterConfiguration counterConfiguration, R9 r9) {
        this(c0597oi, counterConfiguration, r9, null);
    }
}
