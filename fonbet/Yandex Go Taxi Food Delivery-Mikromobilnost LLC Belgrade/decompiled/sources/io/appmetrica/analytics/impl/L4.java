package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes9.dex */
public final class L4 {
    public final K4 a;
    public volatile Pa b;
    public volatile Pa c;
    public volatile Pa d;

    public L4() {
        this(new K4());
    }

    public final IHandlerExecutor a() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        Rc a = Pa.a("IAA-CDE");
                        this.b = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final IHandlerExecutor b() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.a.getClass();
                        Rc a = Pa.a("IAA-CPT");
                        this.d = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final ICommonExecutor c() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        Rc a = Pa.a("IAA-CRS");
                        this.c = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public L4(K4 k4) {
        this.a = k4;
    }
}
