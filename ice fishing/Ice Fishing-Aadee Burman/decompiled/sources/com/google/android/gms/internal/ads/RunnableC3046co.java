package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.co, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3046co implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29600n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0.e f29601u;

    public /* synthetic */ RunnableC3046co(S0.e eVar, int i) {
        this.f29600n = i;
        this.f29601u = eVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f29600n) {
            case 0:
                S0.e eVar = this.f29601u;
                ((C3153eo) eVar.f2782v).f29975a.c((ConcurrentHashMap) eVar.f2781u);
                break;
            default:
                S0.e eVar2 = this.f29601u;
                ((C3153eo) eVar2.f2782v).f29975a.b((ConcurrentHashMap) eVar2.f2781u);
                break;
        }
    }
}
