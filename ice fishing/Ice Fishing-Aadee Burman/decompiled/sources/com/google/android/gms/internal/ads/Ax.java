package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ax extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f23770n;

    /* renamed from: u, reason: collision with root package name */
    public a8.d f23771u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f23772v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f23773w;

    /* renamed from: x, reason: collision with root package name */
    public int f23774x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ax(Px px, B7.c cVar) {
        super(cVar);
        this.f23773w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f23772v = obj;
        this.f23774x |= Integer.MIN_VALUE;
        return this.f23773w.c(this);
    }
}
