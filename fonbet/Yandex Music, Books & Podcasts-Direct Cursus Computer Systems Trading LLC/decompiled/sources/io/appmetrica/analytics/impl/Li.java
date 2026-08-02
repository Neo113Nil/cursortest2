package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.juc;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Li implements InterfaceC0142bc {
    public final ICommonExecutor a;
    public final InstallReferrerClient b;

    public Li(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor) {
        this.a = iCommonExecutor;
        this.b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(Vi vi, Throwable th) {
        vi.a(th);
    }

    public final void a(Vi vi, Throwable th) {
        this.a.execute(new juc(11, vi, th));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0142bc
    public final void a(@NotNull Vi vi) throws Throwable {
        this.b.startConnection(new Ki(this, vi));
    }
}
