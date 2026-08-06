package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309bj implements InterfaceC0547l {

    /* renamed from: a, reason: collision with root package name */
    public Ve f5678a;

    /* renamed from: b, reason: collision with root package name */
    public ScreenInfo f5679b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5680c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5681d;

    /* renamed from: e, reason: collision with root package name */
    public final C0283aj f5682e = new C0283aj();

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f5683f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        this.f5683f = new WeakReference(activity);
        if (!this.f5681d) {
            this.f5679b = a((Context) activity).p();
            this.f5680c = a((Context) activity).t();
            this.f5681d = true;
        }
        if (this.f5679b == null) {
            c(activity);
        }
    }

    public final synchronized ScreenInfo b(Context context) {
        try {
            if (!this.f5681d) {
                this.f5679b = a(context).p();
                this.f5680c = a(context).t();
                this.f5681d = true;
            }
            c((Context) this.f5683f.get());
            if (this.f5679b == null) {
                if (!AndroidUtils.isApiAchieved(30)) {
                    c(context);
                } else if (!this.f5680c) {
                    c(context);
                    this.f5680c = true;
                    a(context).v();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5679b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.f5682e.getClass();
            ScreenInfo a2 = C0283aj.a(context);
            if (a2 == null || a2.equals(this.f5679b)) {
                return;
            }
            this.f5679b = a2;
            a(context).a(this.f5679b);
        }
    }

    public final Ve a(Context context) {
        if (this.f5678a == null) {
            this.f5678a = new Ve(C0294b4.l().c(context).a(context));
        }
        Ve ve = this.f5678a;
        kotlin.jvm.internal.i.b(ve);
        return ve;
    }

    public final void a(Ve ve) {
        this.f5678a = ve;
    }
}
