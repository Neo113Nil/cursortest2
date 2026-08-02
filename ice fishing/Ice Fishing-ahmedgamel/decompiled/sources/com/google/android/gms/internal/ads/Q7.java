package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class Q7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final C4219y7 f27766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27767b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27768c;

    /* renamed from: d, reason: collision with root package name */
    public final C4002u6 f27769d;

    /* renamed from: e, reason: collision with root package name */
    public Method f27770e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27771f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27772g;

    public Q7(C4219y7 c4219y7, String str, String str2, C4002u6 c4002u6, int i, int i4) {
        this.f27766a = c4219y7;
        this.f27767b = str;
        this.f27768c = str2;
        this.f27769d = c4002u6;
        this.f27771f = i;
        this.f27772g = i4;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            C4219y7 c4219y7 = this.f27766a;
            Method d9 = c4219y7.d(this.f27767b, this.f27768c);
            this.f27770e = d9;
            if (d9 == null) {
                return null;
            }
            a();
            C3304h7 c3304h7 = c4219y7.f35890k;
            if (c3304h7 == null || (i = this.f27771f) == Integer.MIN_VALUE) {
                return null;
            }
            c3304h7.a(this.f27772g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
