package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3276gg {

    /* renamed from: a, reason: collision with root package name */
    public C3383ig f31352a;

    /* renamed from: b, reason: collision with root package name */
    public C3230fo f31353b;

    /* renamed from: c, reason: collision with root package name */
    public Context f31354c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f31355d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f31356e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public long f31357f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f31358g = -1;

    public final void a(C3383ig c3383ig, C3230fo c3230fo, Context context) {
        if (this.f31355d.getAndSet(true)) {
            return;
        }
        this.f31352a = c3383ig;
        this.f31353b = c3230fo;
        C3324ha c3324ha = AbstractC3592ma.rf;
        s2.r rVar = s2.r.f40506e;
        this.f31357f = ((Long) rVar.f40509c.a(c3324ha)).longValue();
        this.f31358g = ((Long) rVar.f40509c.a(AbstractC3592ma.sf)).longValue();
        this.f31354c = context;
    }
}
