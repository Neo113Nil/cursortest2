package com.google.android.gms.internal.ads;

import S7.InterfaceC0404w;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class Lx extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f26195n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Px f26196u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lx(Px px, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f26196u = px;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new Lx(this.f26196u, interfaceC5267d);
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Lx) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f26195n;
        com.bumptech.glide.d.k(obj);
        if (i == 0) {
            this.f26195n = 1;
            if (Px.i(this.f26196u, this) == aVar) {
                return aVar;
            }
        }
        return u7.v.f41350a;
    }
}
