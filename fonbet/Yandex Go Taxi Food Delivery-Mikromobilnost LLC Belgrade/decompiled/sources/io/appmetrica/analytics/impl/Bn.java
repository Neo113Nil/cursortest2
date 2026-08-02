package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class Bn {
    public final An a;
    public volatile Pa b;
    public volatile Pa c;
    public volatile Pa d;
    public volatile Pa e;
    public volatile Pa f;
    public volatile Pa g;
    public volatile ExecutorC0920zn h;
    public volatile Pa i;
    public final HashMap j;

    public Bn(An an) {
        this.j = new HashMap();
        this.a = an;
    }

    public final synchronized IHandlerExecutor a() {
        IHandlerExecutor iHandlerExecutor;
        iHandlerExecutor = (IHandlerExecutor) this.j.get("RTM");
        if (iHandlerExecutor == null) {
            this.a.getClass();
            Locale locale = Locale.US;
            Rc a = Pa.a("IAA-M-RTM");
            iHandlerExecutor = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
            this.j.put("RTM", iHandlerExecutor);
        }
        return iHandlerExecutor;
    }

    public final IHandlerExecutor b() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.a.getClass();
                        Rc a = Pa.a("IAA-SDE");
                        this.g = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
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
                        Rc a = Pa.a("IAA-SC");
                        this.b = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
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
                        Rc a = Pa.a("IAA-SMH-1");
                        this.d = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
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
                        Rc a = Pa.a("IAA-SNTPE");
                        this.e = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final IHandlerExecutor f() {
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        this.a.getClass();
                        Rc a = Pa.a("IAA-SPT");
                        this.i = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    public final IHandlerExecutor g() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        Rc a = Pa.a("IAA-STE");
                        this.c = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final IHandlerExecutor h() {
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        this.a.getClass();
                        Rc a = Pa.a("IAA-SIO");
                        this.f = new Pa(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f;
    }

    public Bn() {
        this(new An());
    }
}
