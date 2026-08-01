package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4077vx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public long f34770n;

    /* renamed from: u, reason: collision with root package name */
    public a8.d f34771u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f34772v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f34773w;

    /* renamed from: x, reason: collision with root package name */
    public int f34774x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4077vx(Px px, B7.c cVar) {
        super(cVar);
        this.f34773w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f34772v = obj;
        this.f34774x |= Integer.MIN_VALUE;
        return this.f34773w.b(0L, this);
    }
}
