package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2775Sg implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f27523A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f27524B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C2887Zg f27525C;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f27526n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f27527u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27528v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27529w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f27530x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f27531y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f27532z;

    public RunnableC2775Sg(C2887Zg c2887Zg, String str, String str2, int i, int i6, long j6, long j9, boolean z3, int i9, int i10) {
        this.f27526n = str;
        this.f27527u = str2;
        this.f27528v = i;
        this.f27529w = i6;
        this.f27530x = j6;
        this.f27531y = j9;
        this.f27532z = z3;
        this.f27523A = i9;
        this.f27524B = i10;
        this.f27525C = c2887Zg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f27526n);
        hashMap.put("cachedSrc", this.f27527u);
        hashMap.put("bytesLoaded", Integer.toString(this.f27528v));
        hashMap.put("totalBytes", Integer.toString(this.f27529w));
        hashMap.put("bufferedDuration", Long.toString(this.f27530x));
        hashMap.put("totalDuration", Long.toString(this.f27531y));
        hashMap.put("cacheReady", true != this.f27532z ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f27523A));
        hashMap.put("playerPreparedCount", Integer.toString(this.f27524B));
        this.f27525C.n(hashMap);
    }
}
