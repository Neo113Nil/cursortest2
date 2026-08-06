package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826vj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f7072a;

    public C0826vj(UserProfile userProfile) {
        this.f7072a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportUserProfile(this.f7072a);
    }
}
