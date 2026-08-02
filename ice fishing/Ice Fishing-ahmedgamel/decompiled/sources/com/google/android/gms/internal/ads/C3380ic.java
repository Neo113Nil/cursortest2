package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3380ic {

    /* renamed from: a, reason: collision with root package name */
    public boolean f31824a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31825b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f31826c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f31827d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z6) {
        if (!this.f31827d.get()) {
            return z6;
        }
        return this.f31824a;
    }
}
