package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3565m0 implements DisplayManager.DisplayListener {

    /* renamed from: n, reason: collision with root package name */
    public final Choreographer f32654n;

    /* renamed from: u, reason: collision with root package name */
    public final DisplayManager f32655u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f32656v = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f32657w = com.anythink.basead.exoplayer.b.f7168b;

    public /* synthetic */ AbstractC3565m0(Choreographer choreographer, DisplayManager displayManager) {
        this.f32654n = choreographer;
        this.f32655u = displayManager;
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
