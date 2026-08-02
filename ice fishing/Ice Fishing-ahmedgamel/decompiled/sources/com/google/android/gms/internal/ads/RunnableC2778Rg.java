package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2778Rg implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f27989A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f27990B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f27991C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ AbstractC2862Wg f27992D;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f27993n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f27994u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f27995v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f27996w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f27997x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f27998y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f27999z;

    public RunnableC2778Rg(AbstractC2862Wg abstractC2862Wg, String str, String str2, long j6, long j9, long j10, long j11, long j12, boolean z6, int i, int i4) {
        this.f27993n = str;
        this.f27994u = str2;
        this.f27995v = j6;
        this.f27996w = j9;
        this.f27997x = j10;
        this.f27998y = j11;
        this.f27999z = j12;
        this.f27989A = z6;
        this.f27990B = i;
        this.f27991C = i4;
        Objects.requireNonNull(abstractC2862Wg);
        this.f27992D = abstractC2862Wg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f27993n);
        hashMap.put("cachedSrc", this.f27994u);
        hashMap.put("bufferedDuration", Long.toString(this.f27995v));
        hashMap.put("totalDuration", Long.toString(this.f27996w));
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f27997x));
            hashMap.put("qoeCachedBytes", Long.toString(this.f27998y));
            hashMap.put("totalBytes", Long.toString(this.f27999z));
            C4906k.f40186C.f40198k.getClass();
            hashMap.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.f27989A ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f27990B));
        hashMap.put("playerPreparedCount", Integer.toString(this.f27991C));
        this.f27992D.n(hashMap);
    }
}
