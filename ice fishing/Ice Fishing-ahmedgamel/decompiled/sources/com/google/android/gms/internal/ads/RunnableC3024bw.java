package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3024bw implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f30154n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RunnableC3493kj f30155u;

    public RunnableC3024bw(RunnableC3493kj runnableC3493kj, float f2) {
        this.f30154n = f2;
        this.f30155u = runnableC3493kj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3560lw c3560lw = ((C3077cw) this.f30155u.f32369u).f30419g;
        float f2 = this.f30154n;
        c3560lw.f32646a = f2;
        if (c3560lw.f32648c == null) {
            c3560lw.f32648c = C3238fw.f31233c;
        }
        Iterator it = Collections.unmodifiableCollection(c3560lw.f32648c.f31235b).iterator();
        while (it.hasNext()) {
            AbstractC3722ow abstractC3722ow = ((Uv) it.next()).f28836d;
            V2.f28874z.z(abstractC3722ow.c(), "setDeviceVolume", Float.valueOf(f2), abstractC3722ow.f33765a);
        }
    }
}
