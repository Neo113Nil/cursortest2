package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0565lh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6459a;

    /* renamed from: b, reason: collision with root package name */
    public final P5 f6460b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f6461c;

    /* renamed from: d, reason: collision with root package name */
    public final C0268a4 f6462d;

    public RunnableC0565lh(Context context, P5 p5, Bundle bundle, C0268a4 c0268a4) {
        this.f6459a = context;
        this.f6460b = p5;
        this.f6461c = bundle;
        this.f6462d = c0268a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            H3 a2 = H3.a(this.f6459a, this.f6461c);
            if (a2 == null) {
                return;
            }
            P3 a3 = P3.a(a2);
            C0386ej v2 = C0610na.f6575I.v();
            v2.a(a2.f4459b.getAppVersion(), a2.f4459b.getAppBuildNumber());
            v2.a(a2.f4459b.getDeviceType());
            C0656p4 c0656p4 = new C0656p4(new Zl(a2), new C0630o4(a2.f4459b, AbstractC0430gb.c(a2.f4458a.f4214a.getAsString("PROCESS_CFG_CLIDS"))), a2.f4458a.f4215b);
            this.f6462d.a(a3, c0656p4).a(this.f6460b, c0656p4);
        } catch (Throwable th) {
            Qj qj = AbstractC0645oj.f6689a;
            String str = "Exception during processing event with type: " + this.f6460b.f4907d + " (" + this.f6460b.f4908e + "): " + th.getMessage();
            qj.getClass();
            qj.a(new C0671pj(str, th));
        }
    }
}
