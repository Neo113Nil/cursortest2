package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3721p4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3448k1 f33317a;

    /* renamed from: b, reason: collision with root package name */
    public long f33318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33319c;

    /* renamed from: d, reason: collision with root package name */
    public int f33320d;

    /* renamed from: e, reason: collision with root package name */
    public long f33321e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33322f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33323g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33324h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33325j;

    /* renamed from: k, reason: collision with root package name */
    public long f33326k;

    /* renamed from: l, reason: collision with root package name */
    public long f33327l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33328m;

    public C3721p4(InterfaceC3448k1 interfaceC3448k1) {
        this.f33317a = interfaceC3448k1;
    }

    public final void a(int i) {
        long j9 = this.f33327l;
        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
            long j10 = this.f33318b;
            long j11 = this.f33326k;
            if (j10 == j11) {
                return;
            }
            int i4 = (int) (j10 - j11);
            this.f33317a.b(j9, this.f33328m ? 1 : 0, i4, i, null);
        }
    }
}
