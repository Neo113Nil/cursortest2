package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class Lu {

    /* renamed from: d, reason: collision with root package name */
    public static final ND f26979d = ND.f27257u;

    /* renamed from: a, reason: collision with root package name */
    public final C3383ig f26980a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f26981b;

    /* renamed from: c, reason: collision with root package name */
    public final Ku f26982c;

    public Lu(C3383ig c3383ig, ScheduledExecutorService scheduledExecutorService, Ku ku) {
        this.f26980a = c3383ig;
        this.f26981b = scheduledExecutorService;
        this.f26982c = ku;
    }

    public final T8 a(P3.a aVar, Object obj) {
        return new T8(this, obj, null, aVar, Collections.singletonList(aVar), aVar);
    }
}
