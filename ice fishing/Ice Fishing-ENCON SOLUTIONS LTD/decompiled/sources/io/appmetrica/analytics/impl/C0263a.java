package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5533a;

    public C0263a(Context context) {
        this.f5533a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC0438gj.a(new StringBuilder(this.f5533a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC0438gj.a(this.f5533a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
