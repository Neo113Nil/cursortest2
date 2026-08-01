package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class W0 implements M3.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4320g f35622a;

    /* renamed from: b, reason: collision with root package name */
    public final C4300b f35623b;

    /* renamed from: c, reason: collision with root package name */
    public final C4348n f35624c;

    /* renamed from: e, reason: collision with root package name */
    public final C4387x f35626e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f35625d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f35627f = false;

    public W0(C4320g c4320g, C4300b c4300b, C4348n c4348n, C4387x c4387x) {
        this.f35622a = c4320g;
        this.f35623b = c4300b;
        this.f35624c = c4348n;
        this.f35626e = c4387x;
    }

    public final boolean a() {
        boolean z3;
        C4320g c4320g = this.f35622a;
        if (!c4320g.f35677b.getBoolean("is_pub_misconfigured", false)) {
            synchronized (this.f35625d) {
                z3 = this.f35627f;
            }
            int i = !z3 ? 0 : c4320g.f35677b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    public final void b(Activity activity, I0.j jVar, M3.d dVar, M3.c cVar) {
        synchronized (this.f35625d) {
            this.f35627f = true;
        }
        ((Queue) this.f35626e.f35787f.get()).add(Long.valueOf(System.currentTimeMillis()));
        C4300b c4300b = this.f35623b;
        c4300b.getClass();
        ((B) c4300b.f35650c).execute(new L3.l(c4300b, activity, jVar, dVar, cVar, 2));
    }
}
