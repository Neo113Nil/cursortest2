package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Dx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public a8.d f24496n;

    /* renamed from: u, reason: collision with root package name */
    public long f24497u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f24498v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f24499w;

    /* renamed from: x, reason: collision with root package name */
    public int f24500x;

    /* renamed from: y, reason: collision with root package name */
    public String f24501y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dx(Px px, B7.c cVar) {
        super(cVar);
        this.f24499w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f24498v = obj;
        this.f24500x |= Integer.MIN_VALUE;
        return Px.e(this.f24499w, null, this);
    }
}
