package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class CO {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3149eQ f24167a;

    /* renamed from: b, reason: collision with root package name */
    public final AO f24168b;

    /* renamed from: c, reason: collision with root package name */
    public int f24169c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24170d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f24171e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24172f;

    public CO(AO ao, AbstractC3149eQ abstractC3149eQ, Looper looper) {
        this.f24168b = ao;
        this.f24167a = abstractC3149eQ;
        this.f24171e = looper;
    }

    public final void a() {
        PA.T(!this.f24172f);
        this.f24172f = true;
        C3365iO c3365iO = (C3365iO) this.f24168b;
        if (!c3365iO.f31365n0 && c3365iO.f31334B.getThread().isAlive()) {
            c3365iO.f31382z.b(14, this).a();
        } else {
            AbstractC3217fl.I("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z8) {
        notifyAll();
    }
}
