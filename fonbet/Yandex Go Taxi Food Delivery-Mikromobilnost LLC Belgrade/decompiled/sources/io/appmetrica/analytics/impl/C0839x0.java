package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0839x0 {
    public final C0808vr a;
    public volatile Boolean b;
    public InterfaceC0216bc c;
    public InterfaceC0245cc d;

    public C0839x0() {
        this(new C0808vr());
    }

    public final boolean a(Context context) {
        Boolean bool = this.b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.b;
                    if (bool == null) {
                        this.a.getClass();
                        boolean z = AndroidUtils.isApiAchieved(24) && !C0808vr.a(context);
                        bool = Boolean.valueOf(z);
                        this.b = bool;
                        if (z) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }

    public C0839x0(C0808vr c0808vr) {
        this.a = c0808vr;
    }

    public final synchronized InterfaceC0216bc a(Context context, L4 l4) {
        try {
            if (this.c == null) {
                if (a(context)) {
                    this.c = new B0();
                } else {
                    this.c = new C0810w0(context, l4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }
}
