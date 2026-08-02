package com.google.android.gms.internal.ads;

import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import a8.InterfaceC0451a;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class LA extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public B7.h f26868n;

    /* renamed from: u, reason: collision with root package name */
    public int f26869u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26870v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3128du f26871w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B7.h f26872x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LA(C3128du c3128du, I7.p pVar, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f26871w = c3128du;
        this.f26872x = (B7.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [B7.h, I7.p] */
    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        LA la = new LA(this.f26871w, this.f26872x, interfaceC5240d);
        la.f26870v = obj;
        return la;
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LA) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0451a interfaceC0451a;
        A7.a aVar = A7.a.f215n;
        int i = this.f26869u;
        if (i == 0) {
            Q3.b.s(obj);
            AbstractC0410y.g(((InterfaceC0408w) this.f26870v).z());
            a8.d dVar = (a8.d) this.f26871w.f30647u;
            this.f26870v = dVar;
            this.f26868n = this.f26872x;
            this.f26869u = 1;
            if (A8.b.x(KA.f26625v, dVar, this) != aVar) {
                A8.b.n(this).resumeWith(u7.v.f41073a);
            }
            return aVar;
        }
        if (i != 1) {
            interfaceC0451a = (InterfaceC0451a) this.f26870v;
            try {
                Q3.b.s(obj);
            } catch (Throwable th) {
                th = th;
                ((a8.d) interfaceC0451a).d(null);
                throw th;
            }
        } else {
            I7.p pVar = (I7.p) this.f26868n;
            InterfaceC0451a interfaceC0451a2 = (InterfaceC0451a) this.f26870v;
            Q3.b.s(obj);
            try {
                this.f26870v = interfaceC0451a2;
                this.f26868n = null;
                this.f26869u = 2;
                obj = AbstractC0410y.e(pVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                interfaceC0451a = interfaceC0451a2;
            } catch (Throwable th2) {
                th = th2;
                interfaceC0451a = interfaceC0451a2;
                ((a8.d) interfaceC0451a).d(null);
                throw th;
            }
        }
        ((a8.d) interfaceC0451a).d(null);
        return obj;
    }
}
