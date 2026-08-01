package com.iab.omid.library.toponad.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f36252b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f36253a;

    private g() {
    }

    public static g b() {
        return f36252b;
    }

    public Context a() {
        return this.f36253a;
    }

    public void a(Context context) {
        this.f36253a = context != null ? context.getApplicationContext() : null;
    }
}
