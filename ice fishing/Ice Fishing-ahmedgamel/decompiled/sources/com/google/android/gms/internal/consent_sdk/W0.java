package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class W0 implements O3.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4343g f36391a;

    /* renamed from: b, reason: collision with root package name */
    public final C4323b f36392b;

    /* renamed from: c, reason: collision with root package name */
    public final C4371n f36393c;

    /* renamed from: e, reason: collision with root package name */
    public final C4410x f36395e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f36394d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f36396f = false;

    public W0(C4343g c4343g, C4323b c4323b, C4371n c4371n, C4410x c4410x) {
        this.f36391a = c4343g;
        this.f36392b = c4323b;
        this.f36393c = c4371n;
        this.f36395e = c4410x;
    }

    public final boolean a() {
        boolean z6;
        C4343g c4343g = this.f36391a;
        if (!c4343g.f36446b.getBoolean("is_pub_misconfigured", false)) {
            synchronized (this.f36394d) {
                z6 = this.f36396f;
            }
            int i = !z6 ? 0 : c4343g.f36446b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    public final void b(Activity activity, n4.c cVar, O3.d dVar, O3.c cVar2) {
        synchronized (this.f36394d) {
            this.f36396f = true;
        }
        ((Queue) this.f36395e.f36556f.get()).add(Long.valueOf(System.currentTimeMillis()));
        C4323b c4323b = this.f36392b;
        c4323b.getClass();
        ((B) c4323b.f36419c).execute(new N3.j(c4323b, activity, cVar, dVar, cVar2, 2));
    }
}
