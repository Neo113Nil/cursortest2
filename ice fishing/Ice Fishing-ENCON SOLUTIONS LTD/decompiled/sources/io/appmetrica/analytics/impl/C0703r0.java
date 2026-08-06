package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Yn f6797a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f6798b;

    /* renamed from: c, reason: collision with root package name */
    public Ba f6799c;

    /* renamed from: d, reason: collision with root package name */
    public Ca f6800d;

    public C0703r0() {
        this(new Yn());
    }

    public final synchronized Ba a(Context context, R3 r3) {
        try {
            if (this.f6799c == null) {
                if (a(context)) {
                    this.f6799c = new C0807v0();
                } else {
                    this.f6799c = new C0678q0(context, r3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6799c;
    }

    public C0703r0(Yn yn) {
        this.f6797a = yn;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f6798b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.f6798b;
                    if (bool == null) {
                        this.f6797a.getClass();
                        boolean a2 = Yn.a(context);
                        bool = Boolean.valueOf(!a2);
                        this.f6798b = bool;
                        if (!a2) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }
}
