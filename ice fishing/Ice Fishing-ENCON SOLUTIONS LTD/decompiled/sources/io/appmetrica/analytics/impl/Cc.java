package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Cc {

    /* renamed from: a, reason: collision with root package name */
    public final Xm f4257a;

    /* renamed from: b, reason: collision with root package name */
    public final Xm f4258b;

    /* renamed from: c, reason: collision with root package name */
    public final C0578m4 f4259c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicLogger f4260d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4261e;

    public Cc(String str, PublicLogger publicLogger) {
        this(new C0578m4(30), new Xm(50, str.concat("map key"), publicLogger), new Xm(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Cc(C0578m4 c0578m4, Xm xm, Xm xm2, String str, PublicLogger publicLogger) {
        this.f4259c = c0578m4;
        this.f4257a = xm;
        this.f4258b = xm2;
        this.f4261e = str;
        this.f4260d = publicLogger;
    }
}
