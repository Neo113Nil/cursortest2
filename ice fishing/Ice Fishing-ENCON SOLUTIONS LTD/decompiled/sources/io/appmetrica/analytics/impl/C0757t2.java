package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757t2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final BiConsumer f6930a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f6931b;

    public C0757t2(N2 n2, ICommonExecutor iCommonExecutor) {
        this.f6930a = n2;
        this.f6931b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f6931b.execute(new RunnableC0731s2(this, context, intent));
    }
}
