package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class Sg implements InterfaceC0348d6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5058a;

    /* renamed from: b, reason: collision with root package name */
    public final C0268a4 f5059b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f5060c = C0610na.k().w().d();

    public Sg(Context context, C0268a4 c0268a4) {
        this.f5058a = context;
        this.f5059b = c0268a4;
    }

    public final void a(P5 p5, Bundle bundle) {
        if (p5.m()) {
            return;
        }
        this.f5060c.execute(new RunnableC0565lh(this.f5058a, p5, bundle, this.f5059b));
    }

    public final void a(P3 p3, P5 p5, C0656p4 c0656p4) {
        this.f5059b.a(p3, c0656p4).a(p5, c0656p4);
        this.f5059b.a(p3.f4900b, p3.f4901c, p3.f4902d);
    }
}
