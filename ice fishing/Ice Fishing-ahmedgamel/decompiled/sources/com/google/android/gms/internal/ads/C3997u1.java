package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3997u1 implements InterfaceC3782q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35224b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35225c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35226d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35227e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35228f;

    public C3997u1(int i, int i4, int i6, int i9, int i10, int i11) {
        this.f35223a = i;
        this.f35224b = i4;
        this.f35225c = i6;
        this.f35226d = i9;
        this.f35227e = i10;
        this.f35228f = i11;
    }

    public final int a() {
        int i = this.f35223a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        AbstractC2991bG.y("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3782q1
    public final int c() {
        return 1752331379;
    }
}
