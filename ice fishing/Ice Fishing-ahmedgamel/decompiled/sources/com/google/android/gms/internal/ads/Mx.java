package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Mx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f27161n;

    /* renamed from: u, reason: collision with root package name */
    public long f27162u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f27163v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f27164w;

    /* renamed from: x, reason: collision with root package name */
    public int f27165x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mx(Px px, B7.c cVar) {
        super(cVar);
        this.f27164w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f27163v = obj;
        this.f27165x |= Integer.MIN_VALUE;
        return Px.i(this.f27164w, this);
    }
}
