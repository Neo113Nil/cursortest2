package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Zl implements InterfaceC0446m {
    public C0608rh a;
    public ScreenInfo b;
    public boolean c;
    public boolean d;
    public final Yl e = new Yl();
    public WeakReference f = new WeakReference(null);

    public final synchronized void a(@NotNull Activity activity) {
        this.f = new WeakReference(activity);
        if (!this.d) {
            this.b = a((Context) activity).p();
            this.c = a((Context) activity).t();
            this.d = true;
        }
        if (this.b == null) {
            c(activity);
        }
    }

    public final synchronized ScreenInfo b(@NotNull Context context) {
        try {
            if (!this.d) {
                this.b = a(context).p();
                this.c = a(context).t();
                this.d = true;
            }
            c((Context) this.f.get());
            if (this.b == null) {
                if (!AndroidUtils.isApiAchieved(30)) {
                    c(context);
                } else if (!this.c) {
                    c(context);
                    this.c = true;
                    a(context).v();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.e.getClass();
            ScreenInfo a = Yl.a(context);
            if (a == null || a.equals(this.b)) {
                return;
            }
            this.b = a;
            a(context).a(this.b);
        }
    }

    public final C0608rh a(Context context) {
        if (this.a == null) {
            this.a = new C0608rh(R4.l().c(context).a(context));
        }
        C0608rh c0608rh = this.a;
        c0608rh.getClass();
        return c0608rh;
    }

    public final void a(@NotNull C0608rh c0608rh) {
        this.a = c0608rh;
    }
}
