package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.impl.K0;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
class J0 implements Runnable {
    final /* synthetic */ K0 a;

    public J0(K0 k0) {
        this.a = k0;
    }

    @Override // java.lang.Runnable
    public void run() {
        K0.a aVar;
        CountDownLatch countDownLatch;
        aVar = this.a.a;
        countDownLatch = this.a.c;
        aVar.a(countDownLatch);
    }
}
