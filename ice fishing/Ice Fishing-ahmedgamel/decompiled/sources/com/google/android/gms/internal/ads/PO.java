package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PO extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f27595n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f27596u;

    public PO(int i, boolean z6) {
        super(D.x.k(i, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i).length() + 26)));
        this.f27596u = z6;
        this.f27595n = i;
    }
}
