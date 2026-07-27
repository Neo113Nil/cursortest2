package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ox extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public a8.d f26686n;

    /* renamed from: u, reason: collision with root package name */
    public long f26687u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26688v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f26689w;

    /* renamed from: x, reason: collision with root package name */
    public int f26690x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ox(Px px, B7.c cVar) {
        super(cVar);
        this.f26689w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f26688v = obj;
        this.f26690x |= Integer.MIN_VALUE;
        return Px.g(this.f26689w, this);
    }
}
