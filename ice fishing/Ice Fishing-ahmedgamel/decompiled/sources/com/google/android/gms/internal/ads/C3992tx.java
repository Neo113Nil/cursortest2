package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3992tx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f35200n;

    /* renamed from: u, reason: collision with root package name */
    public a8.d f35201u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f35202v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f35203w;

    /* renamed from: x, reason: collision with root package name */
    public int f35204x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3992tx(Px px, B7.c cVar) {
        super(cVar);
        this.f35203w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f35202v = obj;
        this.f35204x |= Integer.MIN_VALUE;
        return this.f35203w.k(null, this);
    }
}
