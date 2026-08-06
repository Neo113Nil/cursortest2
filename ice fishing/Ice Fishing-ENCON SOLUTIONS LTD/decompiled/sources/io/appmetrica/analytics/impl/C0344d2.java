package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344d2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0431gc f5778a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f5779b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5780c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5781d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f5782e = new F0.a(5, this);

    public C0344d2(C0431gc c0431gc, IHandlerExecutor iHandlerExecutor, long j2) {
        this.f5778a = c0431gc;
        this.f5779b = iHandlerExecutor;
        this.f5780c = j2;
    }

    public static final void a(C0344d2 c0344d2) {
        C0457hc c0457hc = c0344d2.f5778a.f6075a;
        C0851wi c0851wi = c0457hc.f4501h;
        c0851wi.f7118c.a(c0457hc.f4495b.f4458a);
    }
}
