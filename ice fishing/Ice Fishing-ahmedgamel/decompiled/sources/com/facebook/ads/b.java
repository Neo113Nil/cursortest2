package com.facebook.ads;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class b implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkActivity f24286a;

    public b(AudienceNetworkActivity audienceNetworkActivity) {
        this.f24286a = audienceNetworkActivity;
    }

    public final void onBackInvoked() {
        this.f24286a.onBackPressed();
    }
}
