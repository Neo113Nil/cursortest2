package io.appmetrica.analytics.impl;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;

@DoNotInline
/* loaded from: classes.dex */
public final class Df implements Cf {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f4300a;

    @SuppressLint({"PrivateApi"})
    private final String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // io.appmetrica.analytics.impl.Cf
    public String a() {
        if (this.f4300a != null) {
            return this.f4300a;
        }
        synchronized (this) {
            if (this.f4300a == null) {
                this.f4300a = b();
            }
        }
        return this.f4300a;
    }
}
