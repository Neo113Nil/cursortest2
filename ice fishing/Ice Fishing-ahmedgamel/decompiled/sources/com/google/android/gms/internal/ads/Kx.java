package com.google.android.gms.internal.ads;

import a8.InterfaceC0451a;

/* loaded from: classes2.dex */
public final class Kx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0451a f26798n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f26799u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Px f26800v;

    /* renamed from: w, reason: collision with root package name */
    public int f26801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kx(Px px, B7.c cVar) {
        super(cVar);
        this.f26800v = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f26799u = obj;
        this.f26801w |= Integer.MIN_VALUE;
        return Px.d(this.f26800v, this);
    }
}
