package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SJ {

    /* renamed from: n, reason: collision with root package name */
    public static final SJ f28141n;

    /* renamed from: u, reason: collision with root package name */
    public static final SJ f28142u;

    /* renamed from: v, reason: collision with root package name */
    public static final SJ f28143v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ SJ[] f28144w;

    static {
        SJ sj = new SJ("NIST_P256", 0);
        f28141n = sj;
        SJ sj2 = new SJ("NIST_P384", 1);
        f28142u = sj2;
        SJ sj3 = new SJ("NIST_P521", 2);
        f28143v = sj3;
        f28144w = new SJ[]{sj, sj2, sj3};
    }

    public static SJ[] values() {
        return (SJ[]) f28144w.clone();
    }
}
