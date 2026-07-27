package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Ng, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2689Ng implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f26586n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f26587u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f26588v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26589w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C2808Ug f26590x;

    public RunnableC2689Ng(C2808Ug c2808Ug, String str, String str2, int i, int i4) {
        this.f26586n = str;
        this.f26587u = str2;
        this.f26588v = i;
        this.f26589w = i4;
        this.f26590x = c2808Ug;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f26586n);
        hashMap.put("cachedSrc", this.f26587u);
        hashMap.put("bytesLoaded", Integer.toString(this.f26588v));
        hashMap.put("totalBytes", Integer.toString(this.f26589w));
        hashMap.put("cacheReady", "0");
        this.f26590x.n(hashMap);
    }
}
