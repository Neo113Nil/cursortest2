package com.anythink.core.common.n.a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14825a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14826b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14827c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14828d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14829e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14830f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14831g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14832h = 999;
    public static final k i = new k(a.NO_NETWORK);

    /* renamed from: j, reason: collision with root package name */
    public static final k f14833j = new k(a.WIFI);

    /* renamed from: k, reason: collision with root package name */
    public final int f14834k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final a f14835l;

    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE;

        private static /* synthetic */ a[] a() {
            return new a[]{NO_NETWORK, WIFI, MOBILE};
        }
    }

    private k(a aVar) {
        this.f14835l = aVar;
    }
}
