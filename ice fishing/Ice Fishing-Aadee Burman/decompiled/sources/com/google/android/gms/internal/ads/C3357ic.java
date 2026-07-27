package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3357ic {

    /* renamed from: a, reason: collision with root package name */
    public boolean f31053a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31054b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f31055c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f31056d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z3) {
        if (!this.f31056d.get()) {
            return z3;
        }
        return this.f31053a;
    }
}
