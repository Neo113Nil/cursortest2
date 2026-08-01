package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdListener f23523n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ad f23524u;

    public f(AdListener adListener, Ad ad) {
        this.f23523n = adListener;
        this.f23524u = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23523n.onError(this.f23524u, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder."));
    }
}
