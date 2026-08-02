package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ZJ {

    /* renamed from: n, reason: collision with root package name */
    public static final ZJ f29650n;

    /* renamed from: u, reason: collision with root package name */
    public static final ZJ f29651u;

    /* renamed from: v, reason: collision with root package name */
    public static final ZJ f29652v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ZJ[] f29653w;

    /* JADX INFO: Fake field, exist only in values array */
    ZJ EF0;

    static {
        ZJ zj = new ZJ("SHA1", 0);
        ZJ zj2 = new ZJ("SHA224", 1);
        ZJ zj3 = new ZJ("SHA256", 2);
        f29650n = zj3;
        ZJ zj4 = new ZJ("SHA384", 3);
        f29651u = zj4;
        ZJ zj5 = new ZJ("SHA512", 4);
        f29652v = zj5;
        f29653w = new ZJ[]{zj, zj2, zj3, zj4, zj5};
    }

    public static ZJ[] values() {
        return (ZJ[]) f29653w.clone();
    }
}
