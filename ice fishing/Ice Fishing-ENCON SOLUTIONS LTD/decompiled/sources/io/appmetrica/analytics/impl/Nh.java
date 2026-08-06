package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class Nh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f4826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4827b;

    public Nh(C0437gi c0437gi, UserProfile userProfile) {
        this.f4827b = c0437gi;
        this.f4826a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4827b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportUserProfile(this.f4826a);
    }
}
