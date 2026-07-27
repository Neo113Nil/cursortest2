package com.google.android.gms.internal.ads;

import C2.C0269b;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.za, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4270za implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35344a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f35345b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f35346c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f35347d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f35348e;

    public /* synthetic */ C4270za(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, int i) {
        this.f35344a = i;
        this.f35345b = c3243gN;
        this.f35346c = c3243gN2;
        this.f35347d = c3243gN3;
        this.f35348e = c3243gN4;
    }

    public C4216ya a() {
        return new C4216ya((ScheduledExecutorService) this.f35345b.f(), (C2.D) this.f35346c.f(), (C0269b) this.f35347d.f(), (C3315ho) this.f35348e.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f35344a) {
            case 0:
                return a();
            default:
                C3819r8 c3819r8 = (C3819r8) this.f35345b.f();
                Executor executor = (Executor) this.f35346c.f();
                Context context = (Context) this.f35347d.f();
                return new C3095dj(executor, new C2857Xi(context, c3819r8), (T2.a) this.f35348e.f());
        }
    }
}
