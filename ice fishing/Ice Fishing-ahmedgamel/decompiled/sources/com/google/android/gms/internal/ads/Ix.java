package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ix extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f26375n;

    /* renamed from: u, reason: collision with root package name */
    public long f26376u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26377v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f26378w;

    /* renamed from: x, reason: collision with root package name */
    public int f26379x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ix(Px px, B7.c cVar) {
        super(cVar);
        this.f26378w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f26377v = obj;
        this.f26379x |= Integer.MIN_VALUE;
        return Px.h(this.f26378w, this);
    }
}
