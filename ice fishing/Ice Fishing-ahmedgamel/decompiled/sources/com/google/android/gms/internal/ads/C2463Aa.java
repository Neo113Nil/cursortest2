package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2463Aa {

    /* renamed from: a, reason: collision with root package name */
    public MotionEvent f23679a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    public MotionEvent f23680b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f23681c;

    public C2463Aa(ScheduledExecutorService scheduledExecutorService) {
        this.f23681c = scheduledExecutorService;
    }
}
