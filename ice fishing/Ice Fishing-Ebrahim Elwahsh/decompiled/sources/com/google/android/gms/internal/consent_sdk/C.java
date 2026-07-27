package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f35655a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final B f35656b = new B();

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
