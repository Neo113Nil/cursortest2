package com.lyft.kronos.internal.ntp;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public final class SntpServiceImpl$executor$1 implements ThreadFactory {
    public static final SntpServiceImpl$executor$1 INSTANCE = new SntpServiceImpl$executor$1();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "kronos-android");
    }
}
