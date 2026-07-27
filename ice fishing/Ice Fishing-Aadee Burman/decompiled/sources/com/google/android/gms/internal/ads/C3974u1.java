package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3974u1 implements InterfaceC3759q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34451c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34452d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34453e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34454f;

    public C3974u1(int i, int i6, int i9, int i10, int i11, int i12) {
        this.f34449a = i;
        this.f34450b = i6;
        this.f34451c = i9;
        this.f34452d = i10;
        this.f34453e = i11;
        this.f34454f = i12;
    }

    public final int a() {
        int i = this.f34449a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        AbstractC2968bG.y("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759q1
    public final int c() {
        return 1752331379;
    }
}
