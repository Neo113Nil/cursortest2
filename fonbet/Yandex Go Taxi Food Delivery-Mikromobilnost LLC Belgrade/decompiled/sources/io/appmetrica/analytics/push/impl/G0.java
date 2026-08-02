package io.appmetrica.analytics.push.impl;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes4.dex */
public final class G0 {
    public static volatile G0 c;
    public static final Object d = new Object();
    public final Object a = new Object();
    public volatile F0 b;

    public static G0 b() {
        if (c == null) {
            synchronized (d) {
                try {
                    if (c == null) {
                        c = new G0();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final F0 a() {
        if (this.b == null) {
            synchronized (this.a) {
                try {
                    if (this.b == null) {
                        HandlerThread handlerThread = new HandlerThread("AppMetricaPushCommon");
                        handlerThread.start();
                        this.b = new F0(handlerThread, new Handler(handlerThread.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
