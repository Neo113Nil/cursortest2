package com.google.android.gms.internal.ads;

import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import a8.InterfaceC0447a;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class LA extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public B7.h f26068n;

    /* renamed from: u, reason: collision with root package name */
    public int f26069u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26070v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3105du f26071w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B7.h f26072x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LA(C3105du c3105du, I7.p pVar, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f26071w = c3105du;
        this.f26072x = (B7.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [B7.h, I7.p] */
    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        LA la = new LA(this.f26071w, this.f26072x, interfaceC5267d);
        la.f26070v = obj;
        return la;
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LA) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0447a interfaceC0447a;
        A7.a aVar = A7.a.f58n;
        int i = this.f26069u;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            AbstractC0406y.g(((InterfaceC0404w) this.f26070v).z());
            a8.d dVar = (a8.d) this.f26071w.f29859u;
            this.f26070v = dVar;
            this.f26068n = this.f26072x;
            this.f26069u = 1;
            if (A8.b.u(KA.f25873v, dVar, this) != aVar) {
                A8.b.l(this).resumeWith(u7.v.f41350a);
            }
            return aVar;
        }
        if (i != 1) {
            interfaceC0447a = (InterfaceC0447a) this.f26070v;
            try {
                com.bumptech.glide.d.k(obj);
            } catch (Throwable th) {
                th = th;
                ((a8.d) interfaceC0447a).d(null);
                throw th;
            }
        } else {
            I7.p pVar = (I7.p) this.f26068n;
            InterfaceC0447a interfaceC0447a2 = (InterfaceC0447a) this.f26070v;
            com.bumptech.glide.d.k(obj);
            try {
                this.f26070v = interfaceC0447a2;
                this.f26068n = null;
                this.f26069u = 2;
                obj = AbstractC0406y.e(pVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                interfaceC0447a = interfaceC0447a2;
            } catch (Throwable th2) {
                th = th2;
                interfaceC0447a = interfaceC0447a2;
                ((a8.d) interfaceC0447a).d(null);
                throw th;
            }
        }
        ((a8.d) interfaceC0447a).d(null);
        return obj;
    }
}
