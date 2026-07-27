package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2547Eq implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24658a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f24659b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f24660c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f24661d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f24662e;

    /* renamed from: f, reason: collision with root package name */
    public final C3351iN f24663f;

    public C2547Eq(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3351iN c3351iN) {
        this.f24659b = c3243gN;
        this.f24660c = c3243gN2;
        this.f24661d = c3243gN3;
        this.f24662e = c3243gN4;
        this.f24663f = c3351iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f24658a) {
            case 0:
                return new C2530Dq((Context) this.f24659b.f(), (Executor) this.f24660c.f(), (C3793qi) this.f24663f.f31039a, (Rt) this.f24661d.f(), (C3153eo) this.f24662e.f());
            case 1:
                return new Lz((C3002bx) this.f24659b.f(), (Zz) this.f24660c.f(), (InterfaceC3284hA) this.f24661d.f(), (C3983uA) this.f24662e.f(), (ExecutorService) this.f24663f.f31039a);
            default:
                return new C3230gA((C4240yy) this.f24659b.f(), (C4240yy) this.f24660c.f(), C3243gN.b(this.f24661d), (ExecutorService) this.f24663f.f31039a, (C3983uA) this.f24662e.f());
        }
    }

    public C2547Eq(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3351iN c3351iN, C3243gN c3243gN4) {
        this.f24659b = c3243gN;
        this.f24660c = c3243gN2;
        this.f24661d = c3243gN3;
        this.f24663f = c3351iN;
        this.f24662e = c3243gN4;
    }

    public C2547Eq(C3243gN c3243gN, C3243gN c3243gN2, C3351iN c3351iN, C3243gN c3243gN3, C3243gN c3243gN4) {
        this.f24659b = c3243gN;
        this.f24660c = c3243gN2;
        this.f24663f = c3351iN;
        this.f24661d = c3243gN3;
        this.f24662e = c3243gN4;
    }
}
