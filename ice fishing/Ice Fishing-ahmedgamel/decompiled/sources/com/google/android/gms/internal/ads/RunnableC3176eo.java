package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3176eo implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30765n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0.e f30766u;

    public /* synthetic */ RunnableC3176eo(S0.e eVar, int i) {
        this.f30765n = i;
        this.f30766u = eVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f30765n) {
            case 0:
                S0.e eVar = this.f30766u;
                ((C3230fo) eVar.f2909v).f31215a.c((ConcurrentHashMap) eVar.f2908u);
                break;
            default:
                S0.e eVar2 = this.f30766u;
                ((C3230fo) eVar2.f2909v).f31215a.b((ConcurrentHashMap) eVar2.f2908u);
                break;
        }
    }
}
