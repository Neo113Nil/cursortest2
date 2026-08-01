package com.google.android.gms.internal.ads;

import S7.InterfaceC0404w;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class Nx extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f26568n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Px f26569u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nx(Px px, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f26569u = px;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new Nx(this.f26569u, interfaceC5267d);
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Nx) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41353a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f26568n;
        com.bumptech.glide.d.k(obj);
        if (i == 0) {
            this.f26568n = 1;
            if (Px.g(this.f26569u, this) == aVar) {
                return aVar;
            }
        }
        return u7.v.f41353a;
    }
}
