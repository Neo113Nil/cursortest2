package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329cd {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5743a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0802ul f5744b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5745c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f5746d;

    public C0329cd(IHandlerExecutor iHandlerExecutor, AbstractC0898yd abstractC0898yd, String str, SystemTimeProvider systemTimeProvider) {
        this.f5743a = iHandlerExecutor;
        this.f5744b = abstractC0898yd;
        this.f5745c = str;
        this.f5746d = systemTimeProvider;
    }

    public static final void a(C0329cd c0329cd, List list) {
        Qj qj = AbstractC0645oj.f6689a;
        C0380ed c0380ed = new C0380ed(c0329cd.f5744b, c0329cd.f5745c, c0329cd.f5746d, list);
        qj.getClass();
        qj.a(new Ej(c0380ed));
    }

    public final void a(ArrayList arrayList) {
        this.f5743a.execute(new F0.c(6, this, arrayList));
    }
}
