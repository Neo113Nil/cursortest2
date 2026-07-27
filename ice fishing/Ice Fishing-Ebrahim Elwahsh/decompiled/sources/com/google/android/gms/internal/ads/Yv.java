package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Yv {

    /* renamed from: n, reason: collision with root package name */
    public static final Yv f28919n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Yv[] f28920u;

    /* JADX INFO: Fake field, exist only in values array */
    Yv EF0;

    static {
        Yv yv = new Yv("VIDEO_CONTROLS", 0);
        Yv yv2 = new Yv("CLOSE_AD", 1);
        Yv yv3 = new Yv("NOT_VISIBLE", 2);
        f28919n = yv3;
        f28920u = new Yv[]{yv, yv2, yv3, new Yv("OTHER", 3)};
    }

    public static Yv[] values() {
        return (Yv[]) f28920u.clone();
    }
}
