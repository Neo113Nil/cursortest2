package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class Hx extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public long f25466n;

    /* renamed from: u, reason: collision with root package name */
    public W7.d f25467u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25468v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Qx f25469w;

    /* renamed from: x, reason: collision with root package name */
    public int f25470x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hx(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f25469w = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f25468v = obj;
        this.f25470x |= Integer.MIN_VALUE;
        return Qx.j(this.f25469w, this);
    }
}
