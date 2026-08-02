package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0707v0 {
    public final C0214dr a;
    public volatile Boolean b;
    public Mb c;
    public Nb d;

    public C0707v0() {
        this(new C0214dr());
    }

    public final boolean a(Context context) {
        Boolean bool = this.b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.b;
                    if (bool == null) {
                        this.a.getClass();
                        boolean a = C0214dr.a(context);
                        bool = Boolean.valueOf(!a);
                        this.b = bool;
                        if (!a) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }

    public C0707v0(C0214dr c0214dr) {
        this.a = c0214dr;
    }

    public final synchronized Mb a(Context context, H4 h4) {
        try {
            if (this.c == null) {
                if (a(context)) {
                    this.c = new C0821z0();
                } else {
                    this.c = new C0678u0(context, h4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }
}
