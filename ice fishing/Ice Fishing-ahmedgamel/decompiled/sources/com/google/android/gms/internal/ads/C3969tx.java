package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3969tx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f34426n;

    /* renamed from: u, reason: collision with root package name */
    public a8.d f34427u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f34428v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f34429w;

    /* renamed from: x, reason: collision with root package name */
    public int f34430x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3969tx(Px px, B7.c cVar) {
        super(cVar);
        this.f34429w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f34428v = obj;
        this.f34430x |= Integer.MIN_VALUE;
        return this.f34429w.k(null, this);
    }
}
