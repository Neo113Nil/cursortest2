package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0351ik extends C0769x4 {

    @NonNull
    protected L9 c;
    protected Qh d;
    public boolean e;
    public String f;

    public C0351ik(@NonNull Xh xh, @NonNull CounterConfiguration counterConfiguration, @NonNull L9 l9, String str) {
        super(xh, counterConfiguration);
        this.e = true;
        this.f = str;
        this.c = l9;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.b.toBundle(bundle);
        Xh xh = this.a;
        synchronized (xh) {
            bundle.putParcelable("PROCESS_CFG_OBJ", xh);
        }
        return bundle;
    }

    public final synchronized String d() {
        L9 l9;
        l9 = this.c;
        return l9.a.isEmpty() ? null : new JSONObject(l9.a).toString();
    }

    public final synchronized String e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public C0351ik(@NonNull Xh xh, @NonNull CounterConfiguration counterConfiguration, @NonNull L9 l9) {
        this(xh, counterConfiguration, l9, null);
    }
}
