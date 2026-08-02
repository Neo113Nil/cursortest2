package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0383jn {
    public final C0354in a;
    public volatile Ha b;
    public volatile Ha c;
    public volatile Ha d;
    public volatile Ha e;
    public volatile Ha f;
    public volatile Ha g;
    public volatile ExecutorC0326hn h;
    public final HashMap i;

    public C0383jn(C0354in c0354in) {
        this.i = new HashMap();
        this.a = c0354in;
    }

    public final synchronized IHandlerExecutor a() {
        IHandlerExecutor iHandlerExecutor;
        iHandlerExecutor = (IHandlerExecutor) this.i.get("RTM");
        if (iHandlerExecutor == null) {
            this.a.getClass();
            Locale locale = Locale.US;
            Bc a = Ha.a("IAA-M-RTM");
            iHandlerExecutor = new Ha(a, a.getLooper(), new Handler(a.getLooper()));
            this.i.put("RTM", iHandlerExecutor);
        }
        return iHandlerExecutor;
    }

    public final IHandlerExecutor b() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.a.getClass();
                        Bc a = Ha.a("IAA-SDE");
                        this.g = new Ha(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public final IHandlerExecutor c() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        Bc a = Ha.a("IAA-SC");
                        this.b = new Ha(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final IHandlerExecutor d() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.a.getClass();
                        Bc a = Ha.a("IAA-SMH-1");
                        this.d = new Ha(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final IHandlerExecutor e() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.a.getClass();
                        Bc a = Ha.a("IAA-SNTPE");
                        this.e = new Ha(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final IHandlerExecutor f() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        Bc a = Ha.a("IAA-STE");
                        this.c = new Ha(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public C0383jn() {
        this(new C0354in());
    }
}
