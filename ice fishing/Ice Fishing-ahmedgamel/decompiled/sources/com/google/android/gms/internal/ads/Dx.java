package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Dx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public a8.d f25257n;

    /* renamed from: u, reason: collision with root package name */
    public long f25258u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25259v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f25260w;

    /* renamed from: x, reason: collision with root package name */
    public int f25261x;

    /* renamed from: y, reason: collision with root package name */
    public String f25262y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dx(Px px, B7.c cVar) {
        super(cVar);
        this.f25260w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f25259v = obj;
        this.f25261x |= Integer.MIN_VALUE;
        return Px.e(this.f25260w, null, this);
    }
}
