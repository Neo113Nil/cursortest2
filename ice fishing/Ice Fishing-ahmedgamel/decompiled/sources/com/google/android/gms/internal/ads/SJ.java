package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SJ {

    /* renamed from: n, reason: collision with root package name */
    public static final SJ f27427n;

    /* renamed from: u, reason: collision with root package name */
    public static final SJ f27428u;

    /* renamed from: v, reason: collision with root package name */
    public static final SJ f27429v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ SJ[] f27430w;

    static {
        SJ sj = new SJ("NIST_P256", 0);
        f27427n = sj;
        SJ sj2 = new SJ("NIST_P384", 1);
        f27428u = sj2;
        SJ sj3 = new SJ("NIST_P521", 2);
        f27429v = sj3;
        f27430w = new SJ[]{sj, sj2, sj3};
    }

    public static SJ[] values() {
        return (SJ[]) f27430w.clone();
    }
}
