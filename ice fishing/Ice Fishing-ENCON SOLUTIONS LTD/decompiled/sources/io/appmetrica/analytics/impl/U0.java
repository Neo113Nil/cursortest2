package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f5144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5145b;

    public U0(C0756t1 c0756t1, UserProfile userProfile) {
        this.f5145b = c0756t1;
        this.f5144a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f5145b).reportUserProfile(this.f5144a);
    }
}
