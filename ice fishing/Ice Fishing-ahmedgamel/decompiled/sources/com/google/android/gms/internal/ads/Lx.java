package com.google.android.gms.internal.ads;

import S7.InterfaceC0408w;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class Lx extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f26986n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Px f26987u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lx(Px px, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f26987u = px;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new Lx(this.f26987u, interfaceC5240d);
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Lx) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f26986n;
        Q3.b.s(obj);
        if (i == 0) {
            this.f26986n = 1;
            if (Px.i(this.f26987u, this) == aVar) {
                return aVar;
            }
        }
        return u7.v.f41073a;
    }
}
