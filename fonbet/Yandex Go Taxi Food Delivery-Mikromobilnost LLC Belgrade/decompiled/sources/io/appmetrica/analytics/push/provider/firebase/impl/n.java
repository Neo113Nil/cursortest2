package io.appmetrica.analytics.push.provider.firebase.impl;

import android.content.Context;

/* loaded from: classes9.dex */
public abstract class n {
    public final Context a;
    public final String b;

    public n(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();
}
