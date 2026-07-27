package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class Nx extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public Object f26623n;

    /* renamed from: u, reason: collision with root package name */
    public long f26624u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26625v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Qx f26626w;

    /* renamed from: x, reason: collision with root package name */
    public int f26627x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nx(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f26626w = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f26625v = obj;
        this.f26627x |= Integer.MIN_VALUE;
        return Qx.i(this.f26626w, this);
    }
}
