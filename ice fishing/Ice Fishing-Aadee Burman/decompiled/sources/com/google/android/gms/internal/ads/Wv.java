package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Wv {

    /* renamed from: n, reason: collision with root package name */
    public static final Wv f28443n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Wv[] f28444u;

    /* JADX INFO: Fake field, exist only in values array */
    Wv EF0;

    static {
        Wv wv = new Wv("VIDEO_CONTROLS", 0);
        Wv wv2 = new Wv("CLOSE_AD", 1);
        Wv wv3 = new Wv("NOT_VISIBLE", 2);
        f28443n = wv3;
        f28444u = new Wv[]{wv, wv2, wv3, new Wv("OTHER", 3)};
    }

    public static Wv[] values() {
        return (Wv[]) f28444u.clone();
    }
}
