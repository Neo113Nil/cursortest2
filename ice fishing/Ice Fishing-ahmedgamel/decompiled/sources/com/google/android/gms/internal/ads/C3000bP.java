package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3000bP extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f30079n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f30080u;

    /* renamed from: v, reason: collision with root package name */
    public final DP f30081v;

    public C3000bP(int i, DP dp, boolean z6) {
        super(D.x.k(i, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i).length() + 25)));
        this.f30080u = z6;
        this.f30079n = i;
        this.f30081v = dp;
    }
}
