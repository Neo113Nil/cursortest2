package ru.yandex.video.m3.player.utils;

import defpackage.c5z0;
import defpackage.f5z0;
import defpackage.h5z0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class TimberLogManager {
    private static final AtomicBoolean isLoggingEnabled = new AtomicBoolean();

    public static synchronized void disableLogging() {
        synchronized (TimberLogManager.class) {
            if (isLoggingEnabled.compareAndSet(true, false)) {
                h5z0.a.getClass();
                ArrayList arrayList = h5z0.b;
                synchronized (arrayList) {
                    arrayList.clear();
                    h5z0.c = new f5z0[0];
                }
            }
        }
    }

    public static void enableLogging() {
        if (isLoggingEnabled.compareAndSet(false, true)) {
            h5z0.a.s(new c5z0());
        }
    }
}
