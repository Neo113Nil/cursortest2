package com.google.android.gms.internal.ads;

import a8.InterfaceC0447a;

/* loaded from: classes2.dex */
public final class Kx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0447a f25998n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25999u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Px f26000v;

    /* renamed from: w, reason: collision with root package name */
    public int f26001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kx(Px px, B7.c cVar) {
        super(cVar);
        this.f26000v = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f25999u = obj;
        this.f26001w |= Integer.MIN_VALUE;
        return Px.d(this.f26000v, this);
    }
}
