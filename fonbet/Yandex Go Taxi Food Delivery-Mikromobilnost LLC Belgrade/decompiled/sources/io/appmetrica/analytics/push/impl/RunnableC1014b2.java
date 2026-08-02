package io.appmetrica.analytics.push.impl;

import android.content.Intent;
import io.appmetrica.analytics.push.internal.service.PushService;

/* renamed from: io.appmetrica.analytics.push.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC1014b2 implements Runnable {
    public final /* synthetic */ D a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ PushService c;

    public RunnableC1014b2(PushService pushService, D d, Intent intent) {
        this.c = pushService;
        this.a = d;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.c, this.b.getExtras());
    }
}
