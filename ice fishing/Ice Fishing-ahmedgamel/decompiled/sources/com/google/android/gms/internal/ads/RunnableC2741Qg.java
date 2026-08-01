package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Qg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2741Qg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f27048n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f27049u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27050v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27051w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C2855Xg f27052x;

    public RunnableC2741Qg(C2855Xg c2855Xg, String str, String str2, int i, int i6) {
        this.f27048n = str;
        this.f27049u = str2;
        this.f27050v = i;
        this.f27051w = i6;
        this.f27052x = c2855Xg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f27048n);
        hashMap.put("cachedSrc", this.f27049u);
        hashMap.put("bytesLoaded", Integer.toString(this.f27050v));
        hashMap.put("totalBytes", Integer.toString(this.f27051w));
        hashMap.put("cacheReady", "0");
        this.f27052x.n(hashMap);
    }
}
