package com.google.android.gms.internal.ads;

import S7.InterfaceC0404w;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class Cx extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f24277n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Px f24278u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f24279v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cx(Px px, String str, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f24278u = px;
        this.f24279v = str;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new Cx(this.f24278u, this.f24279v, interfaceC5267d);
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Cx) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f24277n;
        com.bumptech.glide.d.k(obj);
        if (i == 0) {
            this.f24277n = 1;
            if (Px.e(this.f24278u, this.f24279v, this) == aVar) {
                return aVar;
            }
        }
        return u7.v.f41350a;
    }
}
