package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.qz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3810qz implements InterfaceCallableC3756pz {

    /* renamed from: a, reason: collision with root package name */
    public final String f33443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33444b;

    /* renamed from: c, reason: collision with root package name */
    public final C3218fz f33445c;

    /* renamed from: d, reason: collision with root package name */
    public final C3979u6 f33446d;

    /* renamed from: e, reason: collision with root package name */
    public final C3929tA f33447e;

    public AbstractC3810qz(String str, String str2, C3979u6 c3979u6, C3218fz c3218fz, C3929tA c3929tA) {
        this.f33443a = str;
        this.f33444b = str2;
        this.f33446d = c3979u6;
        this.f33445c = c3218fz;
        this.f33447e = c3929tA;
    }

    public abstract void a(Method method, C3979u6 c3979u6);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C3929tA c3929tA = this.f33447e;
        try {
            c3929tA.a();
            Method b9 = this.f33445c.b(this.f33443a, this.f33444b);
            if (b9 != null) {
                a(b9, this.f33446d);
            }
            c3929tA.c();
            return null;
        } finally {
        }
    }
}
