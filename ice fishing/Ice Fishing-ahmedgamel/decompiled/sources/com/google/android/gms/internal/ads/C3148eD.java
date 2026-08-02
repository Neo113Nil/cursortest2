package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.eD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3148eD {

    /* renamed from: d, reason: collision with root package name */
    public static final C3148eD f30689d = new C3148eD();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f30690a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f30691b;

    /* renamed from: c, reason: collision with root package name */
    public C3148eD f30692c;

    public C3148eD() {
        this.f30690a = null;
        this.f30691b = null;
    }

    public C3148eD(Runnable runnable, Executor executor) {
        this.f30690a = runnable;
        this.f30691b = executor;
    }
}
