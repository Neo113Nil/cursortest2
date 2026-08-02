package com.google.android.gms.internal.ads;

import E2.C0305b;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.za, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4293za implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36117a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f36118b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f36119c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f36120d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f36121e;

    public /* synthetic */ C4293za(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, int i) {
        this.f36117a = i;
        this.f36118b = c3266gN;
        this.f36119c = c3266gN2;
        this.f36120d = c3266gN3;
        this.f36121e = c3266gN4;
    }

    public C4239ya a() {
        return new C4239ya((ScheduledExecutorService) this.f36118b.f(), (E2.C) this.f36119c.f(), (C0305b) this.f36120d.f(), (C3391io) this.f36121e.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f36117a) {
            case 0:
                return a();
            default:
                C3842r8 c3842r8 = (C3842r8) this.f36118b.f();
                Executor executor = (Executor) this.f36119c.f();
                Context context = (Context) this.f36120d.f();
                return new C3118dj(executor, new C2880Xi(context, c3842r8), (V2.a) this.f36121e.f());
        }
    }
}
