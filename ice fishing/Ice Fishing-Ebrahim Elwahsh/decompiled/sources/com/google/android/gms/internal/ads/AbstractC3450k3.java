package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3450k3 {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3448k1 f32237b;

    /* renamed from: c, reason: collision with root package name */
    public PQ f32238c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3344i3 f32239d;

    /* renamed from: e, reason: collision with root package name */
    public long f32240e;

    /* renamed from: f, reason: collision with root package name */
    public long f32241f;

    /* renamed from: g, reason: collision with root package name */
    public long f32242g;

    /* renamed from: h, reason: collision with root package name */
    public int f32243h;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public long f32245k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32246l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32247m;

    /* renamed from: a, reason: collision with root package name */
    public final C3236g3 f32236a = new C3236g3();

    /* renamed from: j, reason: collision with root package name */
    public C2881Yl f32244j = new C2881Yl(6, false);

    public void a(boolean z8) {
        int i;
        if (z8) {
            this.f32244j = new C2881Yl(6, false);
            this.f32241f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f32243h = i;
        this.f32240e = -1L;
        this.f32242g = 0L;
    }

    public abstract long b(Lr lr);

    public abstract boolean c(Lr lr, long j9, C2881Yl c2881Yl);

    public void d(long j9) {
        this.f32242g = j9;
    }
}
