package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import io.appmetrica.analytics.internal.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0381h4 implements InterfaceC0846x7 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0846x7
    public final void a(Context context) {
        CountDownLatch countDownLatch = AbstractC0787v6.a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = AbstractC0787v6.b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            AbstractC0787v6.a = null;
        }
    }
}
