package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.Wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2842Wj implements InterfaceC3688ol, InterfaceC2643Kk {

    /* renamed from: n, reason: collision with root package name */
    public final T2.a f28376n;

    /* renamed from: u, reason: collision with root package name */
    public final C2858Xj f28377u;

    /* renamed from: v, reason: collision with root package name */
    public final C3052cu f28378v;

    /* renamed from: w, reason: collision with root package name */
    public final String f28379w;

    public C2842Wj(T2.a aVar, C2858Xj c2858Xj, C3052cu c3052cu, String str) {
        this.f28376n = aVar;
        this.f28377u = c2858Xj;
        this.f28378v = c3052cu;
        this.f28379w = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        this.f28376n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f28378v.f29626g;
        C2858Xj c2858Xj = this.f28377u;
        ConcurrentHashMap concurrentHashMap = c2858Xj.f28557c;
        String str2 = this.f28379w;
        Long l9 = (Long) concurrentHashMap.get(str2);
        if (l9 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        c2858Xj.f28558d.put(str, Long.valueOf(elapsedRealtime - l9.longValue()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3688ol
    public final void t() {
        this.f28376n.getClass();
        this.f28377u.f28557c.put(this.f28379w, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
