package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2795Sg implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f28315A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f28316B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C2910Zg f28317C;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f28318n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f28319u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28320v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28321w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f28322x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f28323y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f28324z;

    public RunnableC2795Sg(C2910Zg c2910Zg, String str, String str2, int i, int i4, long j6, long j9, boolean z6, int i6, int i9) {
        this.f28318n = str;
        this.f28319u = str2;
        this.f28320v = i;
        this.f28321w = i4;
        this.f28322x = j6;
        this.f28323y = j9;
        this.f28324z = z6;
        this.f28315A = i6;
        this.f28316B = i9;
        this.f28317C = c2910Zg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f28318n);
        hashMap.put("cachedSrc", this.f28319u);
        hashMap.put("bytesLoaded", Integer.toString(this.f28320v));
        hashMap.put("totalBytes", Integer.toString(this.f28321w));
        hashMap.put("bufferedDuration", Long.toString(this.f28322x));
        hashMap.put("totalDuration", Long.toString(this.f28323y));
        hashMap.put("cacheReady", true != this.f28324z ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f28315A));
        hashMap.put("playerPreparedCount", Integer.toString(this.f28316B));
        this.f28317C.n(hashMap);
    }
}
