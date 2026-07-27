package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class Ou {

    /* renamed from: d, reason: collision with root package name */
    public static final OD f26776d = OD.f26665u;

    /* renamed from: a, reason: collision with root package name */
    public final C3157eg f26777a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f26778b;

    /* renamed from: c, reason: collision with root package name */
    public final Nu f26779c;

    public Ou(C3157eg c3157eg, ScheduledExecutorService scheduledExecutorService, Nu nu) {
        this.f26777a = c3157eg;
        this.f26778b = scheduledExecutorService;
        this.f26779c = nu;
    }

    public final Q8 a(J3.a aVar, Object obj) {
        return new Q8(this, obj, null, aVar, Collections.singletonList(aVar), aVar);
    }
}
