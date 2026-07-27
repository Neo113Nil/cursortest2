package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2758Rg implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f27305A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f27306B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f27307C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ AbstractC2839Wg f27308D;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f27309n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f27310u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f27311v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f27312w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f27313x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f27314y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f27315z;

    public RunnableC2758Rg(AbstractC2839Wg abstractC2839Wg, String str, String str2, long j6, long j9, long j10, long j11, long j12, boolean z3, int i, int i6) {
        this.f27309n = str;
        this.f27310u = str2;
        this.f27311v = j6;
        this.f27312w = j9;
        this.f27313x = j10;
        this.f27314y = j11;
        this.f27315z = j12;
        this.f27305A = z3;
        this.f27306B = i;
        this.f27307C = i6;
        Objects.requireNonNull(abstractC2839Wg);
        this.f27308D = abstractC2839Wg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f27309n);
        hashMap.put("cachedSrc", this.f27310u);
        hashMap.put("bufferedDuration", Long.toString(this.f27311v));
        hashMap.put("totalDuration", Long.toString(this.f27312w));
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f27313x));
            hashMap.put("qoeCachedBytes", Long.toString(this.f27314y));
            hashMap.put("totalBytes", Long.toString(this.f27315z));
            C4835j.f39730C.f39742k.getClass();
            hashMap.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.f27305A ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f27306B));
        hashMap.put("playerPreparedCount", Integer.toString(this.f27307C));
        this.f27308D.n(hashMap);
    }
}
