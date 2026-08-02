package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.qz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3833qz implements InterfaceCallableC3779pz {

    /* renamed from: a, reason: collision with root package name */
    public final String f34210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34211b;

    /* renamed from: c, reason: collision with root package name */
    public final C3241fz f34212c;

    /* renamed from: d, reason: collision with root package name */
    public final C4002u6 f34213d;

    /* renamed from: e, reason: collision with root package name */
    public final C3952tA f34214e;

    public AbstractC3833qz(String str, String str2, C4002u6 c4002u6, C3241fz c3241fz, C3952tA c3952tA) {
        this.f34210a = str;
        this.f34211b = str2;
        this.f34213d = c4002u6;
        this.f34212c = c3241fz;
        this.f34214e = c3952tA;
    }

    public abstract void a(Method method, C4002u6 c4002u6);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C3952tA c3952tA = this.f34214e;
        try {
            c3952tA.a();
            Method b9 = this.f34212c.b(this.f34210a, this.f34211b);
            if (b9 != null) {
                a(b9, this.f34213d);
            }
            c3952tA.c();
            return null;
        } finally {
        }
    }
}
