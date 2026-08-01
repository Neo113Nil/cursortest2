package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2977bP extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f29291n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f29292u;

    /* renamed from: v, reason: collision with root package name */
    public final DP f29293v;

    public C2977bP(int i, DP dp, boolean z3) {
        super(D.y.m(i, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i).length() + 25)));
        this.f29292u = z3;
        this.f29291n = i;
        this.f29293v = dp;
    }
}
