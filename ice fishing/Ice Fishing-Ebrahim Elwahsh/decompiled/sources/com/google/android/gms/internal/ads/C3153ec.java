package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ec, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3153ec {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30441a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30442b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f30443c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f30444d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z8) {
        if (!this.f30444d.get()) {
            return z8;
        }
        return this.f30441a;
    }
}
