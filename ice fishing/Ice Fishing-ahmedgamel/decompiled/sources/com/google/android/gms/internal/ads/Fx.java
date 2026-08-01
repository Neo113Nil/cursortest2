package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Fx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public long f24893n;

    /* renamed from: u, reason: collision with root package name */
    public a8.d f24894u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f24895v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f24896w;

    /* renamed from: x, reason: collision with root package name */
    public int f24897x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fx(Px px, B7.c cVar) {
        super(cVar);
        this.f24896w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f24895v = obj;
        this.f24897x |= Integer.MIN_VALUE;
        return Px.j(this.f24896w, this);
    }
}
