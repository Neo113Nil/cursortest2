package com.iab.omid.library.toponad.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f37019b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f37020a;

    private g() {
    }

    public static g b() {
        return f37019b;
    }

    public Context a() {
        return this.f37020a;
    }

    public void a(Context context) {
        this.f37020a = context != null ? context.getApplicationContext() : null;
    }
}
