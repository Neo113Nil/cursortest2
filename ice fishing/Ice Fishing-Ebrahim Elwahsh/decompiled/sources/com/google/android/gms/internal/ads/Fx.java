package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class Fx extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public W7.d f25055n;

    /* renamed from: u, reason: collision with root package name */
    public long f25056u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25057v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Qx f25058w;

    /* renamed from: x, reason: collision with root package name */
    public int f25059x;

    /* renamed from: y, reason: collision with root package name */
    public String f25060y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fx(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f25058w = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f25057v = obj;
        this.f25059x |= Integer.MIN_VALUE;
        return Qx.e(this.f25058w, null, this);
    }
}
