package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Bz {

    /* renamed from: n, reason: collision with root package name */
    public static final Bz f24758n;

    /* renamed from: u, reason: collision with root package name */
    public static final Bz f24759u;

    /* renamed from: v, reason: collision with root package name */
    public static final Bz f24760v;

    /* renamed from: w, reason: collision with root package name */
    public static final Bz f24761w;

    /* renamed from: x, reason: collision with root package name */
    public static final Bz f24762x;

    /* renamed from: y, reason: collision with root package name */
    public static final Bz f24763y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ Bz[] f24764z;

    static {
        Bz bz = new Bz("RESULT_UNKNOWN", 0);
        f24758n = bz;
        Bz bz2 = new Bz("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        f24759u = bz2;
        Bz bz3 = new Bz("RESULT_UPDATED", 2);
        f24760v = bz3;
        Bz bz4 = new Bz("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        f24761w = bz4;
        Bz bz5 = new Bz("RESULT_FAILURE_INVALID_RESPONSE", 4);
        f24762x = bz5;
        Bz bz6 = new Bz("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f24763y = bz6;
        f24764z = new Bz[]{bz, bz2, bz3, bz4, bz5, bz6};
    }

    public static Bz[] values() {
        return (Bz[]) f24764z.clone();
    }
}
