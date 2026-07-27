package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.aw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2947aw implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f29152n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RunnableC3470kj f29153u;

    public RunnableC2947aw(RunnableC3470kj runnableC3470kj, float f3) {
        this.f29152n = f3;
        this.f29153u = runnableC3470kj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3483kw c3483kw = ((C3001bw) this.f29153u.f31592u).f29372g;
        float f3 = this.f29152n;
        c3483kw.f31667a = f3;
        if (c3483kw.f31669c == null) {
            c3483kw.f31669c = C3161ew.f30001c;
        }
        Iterator it = Collections.unmodifiableCollection(c3483kw.f31669c.f30003b).iterator();
        while (it.hasNext()) {
            AbstractC3645nw abstractC3645nw = ((Uv) it.next()).f28039d;
            V2.f28077z.z(abstractC3645nw.c(), "setDeviceVolume", Float.valueOf(f3), abstractC3645nw.f32808a);
        }
    }
}
