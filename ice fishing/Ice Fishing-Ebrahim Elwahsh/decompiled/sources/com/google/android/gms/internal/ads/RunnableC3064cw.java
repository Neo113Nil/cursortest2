package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.cw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3064cw implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f29766n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RunnableC3376ij f29767u;

    public RunnableC3064cw(RunnableC3376ij runnableC3376ij, float f6) {
        this.f29766n = f6;
        this.f29767u = runnableC3376ij;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3604mw c3604mw = ((C3118dw) this.f29767u.f31990u).f30261g;
        float f6 = this.f29766n;
        c3604mw.f32778a = f6;
        if (c3604mw.f32780c == null) {
            c3604mw.f32780c = C3282gw.f31116c;
        }
        Iterator it = Collections.unmodifiableCollection(c3604mw.f32780c.f31118b).iterator();
        while (it.hasNext()) {
            AbstractC3712ow abstractC3712ow = ((Wv) it.next()).f28529d;
            T2.f27692z.C(abstractC3712ow.c(), "setDeviceVolume", Float.valueOf(f6), abstractC3712ow.f33234a);
        }
    }
}
