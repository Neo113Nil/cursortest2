package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes4.dex */
public final class Ak implements Runnable {
    public final /* synthetic */ UserProfile a;
    public final /* synthetic */ Tk b;

    public Ak(Tk tk, UserProfile userProfile) {
        this.b = tk;
        this.a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).reportUserProfile(this.a);
    }
}
