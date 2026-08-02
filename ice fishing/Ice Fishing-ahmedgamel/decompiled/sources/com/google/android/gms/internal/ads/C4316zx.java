package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4316zx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public a8.d f36245n;

    /* renamed from: u, reason: collision with root package name */
    public long f36246u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f36247v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f36248w;

    /* renamed from: x, reason: collision with root package name */
    public int f36249x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4316zx(Px px, B7.c cVar) {
        super(cVar);
        this.f36248w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f36247v = obj;
        this.f36249x |= Integer.MIN_VALUE;
        return Px.f(this.f36248w, this);
    }
}
