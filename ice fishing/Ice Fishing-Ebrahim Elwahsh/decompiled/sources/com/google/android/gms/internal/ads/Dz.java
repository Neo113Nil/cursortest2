package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Dz {

    /* renamed from: n, reason: collision with root package name */
    public static final Dz f24612n;

    /* renamed from: u, reason: collision with root package name */
    public static final Dz f24613u;

    /* renamed from: v, reason: collision with root package name */
    public static final Dz f24614v;

    /* renamed from: w, reason: collision with root package name */
    public static final Dz f24615w;

    /* renamed from: x, reason: collision with root package name */
    public static final Dz f24616x;

    /* renamed from: y, reason: collision with root package name */
    public static final Dz f24617y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ Dz[] f24618z;

    static {
        Dz dz = new Dz("RESULT_UNKNOWN", 0);
        f24612n = dz;
        Dz dz2 = new Dz("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        f24613u = dz2;
        Dz dz3 = new Dz("RESULT_UPDATED", 2);
        f24614v = dz3;
        Dz dz4 = new Dz("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        f24615w = dz4;
        Dz dz5 = new Dz("RESULT_FAILURE_INVALID_RESPONSE", 4);
        f24616x = dz5;
        Dz dz6 = new Dz("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f24617y = dz6;
        f24618z = new Dz[]{dz, dz2, dz3, dz4, dz5, dz6};
    }

    public static Dz[] values() {
        return (Dz[]) f24618z.clone();
    }
}
