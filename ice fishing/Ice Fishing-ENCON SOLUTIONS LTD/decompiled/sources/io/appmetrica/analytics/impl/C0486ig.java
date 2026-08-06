package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486ig implements Oa {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f6190a;

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f6191b;

    public C0486ig(Context context, ICommonExecutor iCommonExecutor) {
        this.f6190a = iCommonExecutor;
        this.f6191b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC0745sg interfaceC0745sg, Throwable th) {
        interfaceC0745sg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(InterfaceC0745sg interfaceC0745sg) {
        this.f6191b.startConnection(new C0461hg(this, interfaceC0745sg));
    }

    public final void a(InterfaceC0745sg interfaceC0745sg, Throwable th) {
        this.f6190a.execute(new F0.c(8, interfaceC0745sg, th));
    }
}
