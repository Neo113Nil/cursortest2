package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0659qm implements InterfaceC0520m {
    public Hh a;
    public ScreenInfo b;
    public boolean c;
    public boolean d;
    public final C0630pm e = new C0630pm();
    public WeakReference f = new WeakReference(null);

    public final synchronized ScreenInfo a(Context context) {
        try {
            if (!this.d) {
                if (this.a == null) {
                    this.a = V4.l().b(context);
                }
                this.b = this.a.p();
                if (this.a == null) {
                    this.a = V4.l().b(context);
                }
                this.c = this.a.t();
                this.d = true;
            }
            b((Context) this.f.get());
            if (this.b == null) {
                if (!AndroidUtils.isApiAchieved(30)) {
                    b(context);
                } else if (!this.c) {
                    b(context);
                    this.c = true;
                    if (this.a == null) {
                        this.a = V4.l().b(context);
                    }
                    this.a.v();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final void b(Context context) {
        if (context != null) {
            this.e.getClass();
            ScreenInfo a = C0630pm.a(context);
            if (a == null || a.equals(this.b)) {
                return;
            }
            this.b = a;
            if (this.a == null) {
                this.a = V4.l().b(context);
            }
            this.a.a(this.b);
        }
    }

    public final synchronized void a(Activity activity) {
        try {
            this.f = new WeakReference(activity);
            if (!this.d) {
                if (this.a == null) {
                    this.a = V4.l().b(activity);
                }
                this.b = this.a.p();
                if (this.a == null) {
                    this.a = V4.l().b(activity);
                }
                this.c = this.a.t();
                this.d = true;
            }
            if (this.b == null) {
                b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(Hh hh) {
        this.a = hh;
    }
}
