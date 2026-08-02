package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4100vx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public long f35539n;

    /* renamed from: u, reason: collision with root package name */
    public a8.d f35540u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f35541v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f35542w;

    /* renamed from: x, reason: collision with root package name */
    public int f35543x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4100vx(Px px, B7.c cVar) {
        super(cVar);
        this.f35542w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f35541v = obj;
        this.f35543x |= Integer.MIN_VALUE;
        return this.f35542w.b(0L, this);
    }
}
