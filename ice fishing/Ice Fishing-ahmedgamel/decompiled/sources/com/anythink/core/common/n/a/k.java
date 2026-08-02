package com.anythink.core.common.n.a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15611a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f15612b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15613c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15614d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15615e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15616f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f15617g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f15618h = 999;
    public static final k i = new k(a.NO_NETWORK);

    /* renamed from: j, reason: collision with root package name */
    public static final k f15619j = new k(a.WIFI);

    /* renamed from: k, reason: collision with root package name */
    public final int f15620k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final a f15621l;

    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE;

        private static /* synthetic */ a[] a() {
            return new a[]{NO_NETWORK, WIFI, MOBILE};
        }
    }

    private k(a aVar) {
        this.f15621l = aVar;
    }
}
