package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Xv {

    /* renamed from: n, reason: collision with root package name */
    public static final Xv f29380n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Xv[] f29381u;

    /* JADX INFO: Fake field, exist only in values array */
    Xv EF0;

    static {
        Xv xv = new Xv("VIDEO_CONTROLS", 0);
        Xv xv2 = new Xv("CLOSE_AD", 1);
        Xv xv3 = new Xv("NOT_VISIBLE", 2);
        f29380n = xv3;
        f29381u = new Xv[]{xv, xv2, xv3, new Xv("OTHER", 3)};
    }

    public static Xv[] values() {
        return (Xv[]) f29381u.clone();
    }
}
