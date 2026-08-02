package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Fx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public long f25683n;

    /* renamed from: u, reason: collision with root package name */
    public a8.d f25684u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25685v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f25686w;

    /* renamed from: x, reason: collision with root package name */
    public int f25687x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fx(Px px, B7.c cVar) {
        super(cVar);
        this.f25686w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f25685v = obj;
        this.f25687x |= Integer.MIN_VALUE;
        return Px.j(this.f25686w, this);
    }
}
