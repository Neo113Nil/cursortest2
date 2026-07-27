package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* renamed from: com.google.android.gms.internal.ads.xx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4198xx extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public W7.a f35283n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f35284u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Qx f35285v;

    /* renamed from: w, reason: collision with root package name */
    public int f35286w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4198xx(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f35285v = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f35284u = obj;
        this.f35286w |= Integer.MIN_VALUE;
        return this.f35285v.a(this);
    }
}
