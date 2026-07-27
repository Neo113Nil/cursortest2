package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3542m0 implements DisplayManager.DisplayListener {

    /* renamed from: n, reason: collision with root package name */
    public final Choreographer f31874n;

    /* renamed from: u, reason: collision with root package name */
    public final DisplayManager f31875u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f31876v = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f31877w = com.anythink.basead.exoplayer.b.f6382b;

    public /* synthetic */ AbstractC3542m0(Choreographer choreographer, DisplayManager displayManager) {
        this.f31874n = choreographer;
        this.f31875u = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
