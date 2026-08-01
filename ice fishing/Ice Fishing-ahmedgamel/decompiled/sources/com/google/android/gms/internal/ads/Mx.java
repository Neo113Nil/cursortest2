package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Mx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f26376n;

    /* renamed from: u, reason: collision with root package name */
    public long f26377u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26378v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f26379w;

    /* renamed from: x, reason: collision with root package name */
    public int f26380x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mx(Px px, B7.c cVar) {
        super(cVar);
        this.f26379w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f26378v = obj;
        this.f26380x |= Integer.MIN_VALUE;
        return Px.i(this.f26379w, this);
    }
}
