package com.google.android.gms.internal.ads;

import S7.InterfaceC0408w;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class Cx extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f25022n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Px f25023u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f25024v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cx(Px px, String str, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f25023u = px;
        this.f25024v = str;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new Cx(this.f25023u, this.f25024v, interfaceC5240d);
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Cx) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f25022n;
        Q3.b.s(obj);
        if (i == 0) {
            this.f25022n = 1;
            if (Px.e(this.f25023u, this.f25024v, this) == aVar) {
                return aVar;
            }
        }
        return u7.v.f41073a;
    }
}
