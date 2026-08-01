package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ZJ {

    /* renamed from: n, reason: collision with root package name */
    public static final ZJ f28870n;

    /* renamed from: u, reason: collision with root package name */
    public static final ZJ f28871u;

    /* renamed from: v, reason: collision with root package name */
    public static final ZJ f28872v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ZJ[] f28873w;

    /* JADX INFO: Fake field, exist only in values array */
    ZJ EF0;

    static {
        ZJ zj = new ZJ("SHA1", 0);
        ZJ zj2 = new ZJ("SHA224", 1);
        ZJ zj3 = new ZJ("SHA256", 2);
        f28870n = zj3;
        ZJ zj4 = new ZJ("SHA384", 3);
        f28871u = zj4;
        ZJ zj5 = new ZJ("SHA512", 4);
        f28872v = zj5;
        f28873w = new ZJ[]{zj, zj2, zj3, zj4, zj5};
    }

    public static ZJ[] values() {
        return (ZJ[]) f28873w.clone();
    }
}
