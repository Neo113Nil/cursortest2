package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AQ {

    /* renamed from: n, reason: collision with root package name */
    public static final AQ f24457n;

    /* renamed from: u, reason: collision with root package name */
    public static final AQ f24458u;

    /* renamed from: v, reason: collision with root package name */
    public static final AQ f24459v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AQ[] f24460w;

    static {
        AQ aq = new AQ("PASS_THROUGH", 0);
        f24457n = aq;
        AQ aq2 = new AQ("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f24458u = aq2;
        AQ aq3 = new AQ("DISCARDING", 2);
        f24459v = aq3;
        f24460w = new AQ[]{aq, aq2, aq3};
    }

    public static AQ[] values() {
        return (AQ[]) f24460w.clone();
    }
}
