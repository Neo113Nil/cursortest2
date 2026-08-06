package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0472i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f6161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6162c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6163d;

    public RunnableC0472i1(C0756t1 c0756t1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f6163d = c0756t1;
        this.f6160a = context;
        this.f6161b = startupParamsCallback;
        this.f6162c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0911z0 c0911z0 = this.f6163d.f6922a;
        Context applicationContext = this.f6160a.getApplicationContext();
        c0911z0.getClass();
        C0885y0 a2 = C0885y0.a(applicationContext);
        a2.f().a(this.f6161b, this.f6162c);
    }
}
