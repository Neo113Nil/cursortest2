package io.appmetrica.analytics.push.impl;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public abstract class m2 {
    public Looper a;

    public static void a(m2 m2Var, Looper looper) {
        m2Var.a = looper;
    }

    public abstract void a(CountDownLatch countDownLatch);
}
