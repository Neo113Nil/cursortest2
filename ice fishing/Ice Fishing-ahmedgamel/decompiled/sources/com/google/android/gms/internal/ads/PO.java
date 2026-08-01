package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PO extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f26813n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f26814u;

    public PO(int i, boolean z3) {
        super(D.y.m(i, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i).length() + 26)));
        this.f26814u = z3;
        this.f26813n = i;
    }
}
