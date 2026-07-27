package com.google.android.gms.internal.ads;

import a8.InterfaceC0447a;

/* renamed from: com.google.android.gms.internal.ads.wx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4131wx extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0447a f34906n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f34907u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Px f34908v;

    /* renamed from: w, reason: collision with root package name */
    public int f34909w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4131wx(Px px, B7.c cVar) {
        super(cVar);
        this.f34908v = px;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f34907u = obj;
        this.f34909w |= Integer.MIN_VALUE;
        return this.f34908v.a(this);
    }
}
