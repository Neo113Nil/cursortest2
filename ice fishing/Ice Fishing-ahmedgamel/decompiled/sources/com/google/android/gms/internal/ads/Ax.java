package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ax extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f24542n;

    /* renamed from: u, reason: collision with root package name */
    public a8.d f24543u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f24544v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f24545w;

    /* renamed from: x, reason: collision with root package name */
    public int f24546x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ax(Px px, B7.c cVar) {
        super(cVar);
        this.f24545w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f24544v = obj;
        this.f24546x |= Integer.MIN_VALUE;
        return this.f24545w.c(this);
    }
}
