package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class P7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final C4101w7 f26841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26843c;

    /* renamed from: d, reason: collision with root package name */
    public final C3830r6 f26844d;

    /* renamed from: e, reason: collision with root package name */
    public Method f26845e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26846f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26847g;

    public P7(C4101w7 c4101w7, String str, String str2, C3830r6 c3830r6, int i, int i4) {
        this.f26841a = c4101w7;
        this.f26842b = str;
        this.f26843c = str2;
        this.f26844d = c3830r6;
        this.f26846f = i;
        this.f26847g = i4;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            C4101w7 c4101w7 = this.f26841a;
            Method d2 = c4101w7.d(this.f26842b, this.f26843c);
            this.f26845e = d2;
            if (d2 == null) {
                return null;
            }
            a();
            C3185f7 c3185f7 = c4101w7.f34938k;
            if (c3185f7 == null || (i = this.f26846f) == Integer.MIN_VALUE) {
                return null;
            }
            c3185f7.a(this.f26847g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
