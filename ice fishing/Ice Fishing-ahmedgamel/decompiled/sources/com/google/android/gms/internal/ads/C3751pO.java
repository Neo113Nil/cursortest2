package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.pO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3751pO {

    /* renamed from: a, reason: collision with root package name */
    public final SP f33854a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3643nO f33855b;

    /* renamed from: c, reason: collision with root package name */
    public int f33856c;

    /* renamed from: d, reason: collision with root package name */
    public Object f33857d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f33858e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33859f;

    public C3751pO(InterfaceC3643nO interfaceC3643nO, SP sp, Looper looper) {
        this.f33855b = interfaceC3643nO;
        this.f33854a = sp;
        this.f33858e = looper;
    }

    public final void a() {
        AbstractC2792Sd.H(!this.f33859f);
        this.f33859f = true;
        VN vn = (VN) this.f33855b;
        if (!vn.f28964j0 && vn.f28937B.getThread().isAlive()) {
            vn.f28985z.b(14, this).a();
        } else {
            AbstractC2991bG.y("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z6) {
        notifyAll();
    }
}
