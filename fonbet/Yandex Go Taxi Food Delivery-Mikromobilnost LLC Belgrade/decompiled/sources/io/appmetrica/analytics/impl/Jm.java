package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes4.dex */
public final class Jm implements InterfaceC0591oc {
    public final /* synthetic */ UserProfile a;

    public Jm(UserProfile userProfile) {
        this.a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportUserProfile(this.a);
    }
}
