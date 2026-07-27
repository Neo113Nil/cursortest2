package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class W0 implements I3.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4333g f35785a;

    /* renamed from: b, reason: collision with root package name */
    public final C4313b f35786b;

    /* renamed from: c, reason: collision with root package name */
    public final C4361n f35787c;

    /* renamed from: e, reason: collision with root package name */
    public final C4400x f35789e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f35788d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f35790f = false;

    public W0(C4333g c4333g, C4313b c4313b, C4361n c4361n, C4400x c4400x) {
        this.f35785a = c4333g;
        this.f35786b = c4313b;
        this.f35787c = c4361n;
        this.f35789e = c4400x;
    }

    public final boolean a() {
        boolean z8;
        C4333g c4333g = this.f35785a;
        if (!c4333g.f35840b.getBoolean("is_pub_misconfigured", false)) {
            synchronized (this.f35788d) {
                z8 = this.f35790f;
            }
            int i = !z8 ? 0 : c4333g.f35840b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    public final void b(Activity activity, I0.j jVar, I3.d dVar, I3.c cVar) {
        synchronized (this.f35788d) {
            this.f35790f = true;
        }
        ((Queue) this.f35789e.f35950f.get()).add(Long.valueOf(System.currentTimeMillis()));
        C4313b c4313b = this.f35786b;
        c4313b.getClass();
        ((B) c4313b.f35813c).execute(new T0.q(c4313b, activity, jVar, dVar, cVar));
    }
}
