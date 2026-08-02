package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Qg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2761Qg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f27833n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f27834u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27835v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27836w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C2878Xg f27837x;

    public RunnableC2761Qg(C2878Xg c2878Xg, String str, String str2, int i, int i4) {
        this.f27833n = str;
        this.f27834u = str2;
        this.f27835v = i;
        this.f27836w = i4;
        this.f27837x = c2878Xg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f27833n);
        hashMap.put("cachedSrc", this.f27834u);
        hashMap.put("bytesLoaded", Integer.toString(this.f27835v));
        hashMap.put("totalBytes", Integer.toString(this.f27836w));
        hashMap.put("cacheReady", "0");
        this.f27837x.n(hashMap);
    }
}
