package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class Lu {

    /* renamed from: d, reason: collision with root package name */
    public static final ND f26188d = ND.f26473u;

    /* renamed from: a, reason: collision with root package name */
    public final C3360ig f26189a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f26190b;

    /* renamed from: c, reason: collision with root package name */
    public final Ku f26191c;

    public Lu(C3360ig c3360ig, ScheduledExecutorService scheduledExecutorService, Ku ku) {
        this.f26189a = c3360ig;
        this.f26190b = scheduledExecutorService;
        this.f26191c = ku;
    }

    public final T8 a(N3.a aVar, Object obj) {
        return new T8(this, obj, null, aVar, Collections.singletonList(aVar), aVar);
    }
}
