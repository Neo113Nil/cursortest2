package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3253gg {

    /* renamed from: a, reason: collision with root package name */
    public C3360ig f30585a;

    /* renamed from: b, reason: collision with root package name */
    public C3153eo f30586b;

    /* renamed from: c, reason: collision with root package name */
    public Context f30587c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f30588d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f30589e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public long f30590f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f30591g = -1;

    public final void a(C3360ig c3360ig, C3153eo c3153eo, Context context) {
        if (this.f30588d.getAndSet(true)) {
            return;
        }
        this.f30585a = c3360ig;
        this.f30586b = c3153eo;
        C3301ha c3301ha = AbstractC3569ma.rf;
        q2.r rVar = q2.r.f40207e;
        this.f30590f = ((Long) rVar.f40210c.a(c3301ha)).longValue();
        this.f30591g = ((Long) rVar.f40210c.a(AbstractC3569ma.sf)).longValue();
        this.f30587c = context;
    }
}
