package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0464k1 implements Runnable {
    public final /* synthetic */ UserProfile a;
    public final /* synthetic */ J1 b;

    public RunnableC0464k1(J1 j1, UserProfile userProfile) {
        this.b = j1;
        this.a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1.a(this.b).reportUserProfile(this.a);
    }
}
