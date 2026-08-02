package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ox extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public a8.d f27469n;

    /* renamed from: u, reason: collision with root package name */
    public long f27470u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f27471v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f27472w;

    /* renamed from: x, reason: collision with root package name */
    public int f27473x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ox(Px px, B7.c cVar) {
        super(cVar);
        this.f27472w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f27471v = obj;
        this.f27473x |= Integer.MIN_VALUE;
        return Px.g(this.f27472w, this);
    }
}
