package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ix extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f25622n;

    /* renamed from: u, reason: collision with root package name */
    public long f25623u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25624v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Px f25625w;

    /* renamed from: x, reason: collision with root package name */
    public int f25626x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ix(Px px, B7.c cVar) {
        super(cVar);
        this.f25625w = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f25624v = obj;
        this.f25626x |= Integer.MIN_VALUE;
        return Px.h(this.f25625w, this);
    }
}
