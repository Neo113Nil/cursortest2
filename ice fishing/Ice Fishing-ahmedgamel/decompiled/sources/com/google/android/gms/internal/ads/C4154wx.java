package com.google.android.gms.internal.ads;

import a8.InterfaceC0451a;

/* renamed from: com.google.android.gms.internal.ads.wx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4154wx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0451a f35687n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f35688u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Px f35689v;

    /* renamed from: w, reason: collision with root package name */
    public int f35690w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4154wx(Px px, B7.c cVar) {
        super(cVar);
        this.f35689v = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f35688u = obj;
        this.f35690w |= Integer.MIN_VALUE;
        return this.f35689v.a(this);
    }
}
