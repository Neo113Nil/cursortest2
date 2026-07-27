package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.xa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4175xa {

    /* renamed from: a, reason: collision with root package name */
    public MotionEvent f35183a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    public MotionEvent f35184b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f35185c;

    public C4175xa(ScheduledExecutorService scheduledExecutorService) {
        this.f35185c = scheduledExecutorService;
    }
}
