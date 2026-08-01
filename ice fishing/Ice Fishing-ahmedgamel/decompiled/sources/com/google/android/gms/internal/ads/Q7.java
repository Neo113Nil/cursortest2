package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class Q7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final C4196y7 f26979a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26980b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26981c;

    /* renamed from: d, reason: collision with root package name */
    public final C3979u6 f26982d;

    /* renamed from: e, reason: collision with root package name */
    public Method f26983e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26984f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26985g;

    public Q7(C4196y7 c4196y7, String str, String str2, C3979u6 c3979u6, int i, int i6) {
        this.f26979a = c4196y7;
        this.f26980b = str;
        this.f26981c = str2;
        this.f26982d = c3979u6;
        this.f26984f = i;
        this.f26985g = i6;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            C4196y7 c4196y7 = this.f26979a;
            Method d2 = c4196y7.d(this.f26980b, this.f26981c);
            this.f26983e = d2;
            if (d2 == null) {
                return null;
            }
            a();
            C3281h7 c3281h7 = c4196y7.f35104k;
            if (c3281h7 == null || (i = this.f26984f) == Integer.MIN_VALUE) {
                return null;
            }
            c3281h7.a(this.f26985g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
