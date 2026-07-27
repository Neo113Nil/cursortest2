package com.google.android.gms.internal.ads;

import S7.InterfaceC0404w;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class Ex extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f24687n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Px f24688u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ex(Px px, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f24688u = px;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new Ex(this.f24688u, interfaceC5267d);
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Ex) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f24687n;
        com.bumptech.glide.d.k(obj);
        if (i == 0) {
            this.f24687n = 1;
            if (Px.j(this.f24688u, this) == aVar) {
                return aVar;
            }
        }
        return u7.v.f41350a;
    }
}
