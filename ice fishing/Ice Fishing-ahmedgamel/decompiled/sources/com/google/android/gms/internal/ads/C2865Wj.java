package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.Wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2865Wj implements InterfaceC3711ol, InterfaceC2663Kk {

    /* renamed from: n, reason: collision with root package name */
    public final V2.a f29175n;

    /* renamed from: u, reason: collision with root package name */
    public final C2881Xj f29176u;

    /* renamed from: v, reason: collision with root package name */
    public final C3075cu f29177v;

    /* renamed from: w, reason: collision with root package name */
    public final String f29178w;

    public C2865Wj(V2.a aVar, C2881Xj c2881Xj, C3075cu c3075cu, String str) {
        this.f29175n = aVar;
        this.f29176u = c2881Xj;
        this.f29177v = c3075cu;
        this.f29178w = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        this.f29175n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f29177v.f30396g;
        C2881Xj c2881Xj = this.f29176u;
        ConcurrentHashMap concurrentHashMap = c2881Xj.f29329c;
        String str2 = this.f29178w;
        Long l9 = (Long) concurrentHashMap.get(str2);
        if (l9 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        c2881Xj.f29330d.put(str, Long.valueOf(elapsedRealtime - l9.longValue()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3711ol
    public final void t() {
        this.f29175n.getClass();
        this.f29176u.f29329c.put(this.f29178w, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
