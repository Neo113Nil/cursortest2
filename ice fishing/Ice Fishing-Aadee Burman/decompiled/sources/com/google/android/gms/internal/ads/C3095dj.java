package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3095dj implements InterfaceC3927t8 {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4061vh f29823n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f29824u;

    /* renamed from: v, reason: collision with root package name */
    public final C2857Xi f29825v;

    /* renamed from: w, reason: collision with root package name */
    public final T2.a f29826w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29827x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29828y = false;

    /* renamed from: z, reason: collision with root package name */
    public final C2889Zi f29829z = new C2889Zi();

    public C3095dj(Executor executor, C2857Xi c2857Xi, T2.a aVar) {
        this.f29824u = executor;
        this.f29825v = c2857Xi;
        this.f29826w = aVar;
    }

    public final void a() {
        try {
            JSONObject n9 = this.f29825v.n(this.f29829z);
            if (this.f29823n != null) {
                this.f29824u.execute(new RunnableC3973u0(19, this, n9));
            }
        } catch (JSONException e9) {
            u2.z.l("Failed to call video active view js", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final void f(C3873s8 c3873s8) {
        boolean z3 = this.f29828y ? false : c3873s8.f33899j;
        C2889Zi c2889Zi = this.f29829z;
        c2889Zi.f28936a = z3;
        this.f29826w.getClass();
        c2889Zi.f28938c = SystemClock.elapsedRealtime();
        c2889Zi.f28940e = c3873s8;
        if (this.f29827x) {
            a();
        }
    }
}
