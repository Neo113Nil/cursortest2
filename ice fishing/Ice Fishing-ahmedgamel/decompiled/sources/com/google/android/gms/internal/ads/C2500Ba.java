package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ba, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2500Ba implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24678a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f24679b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f24680c;

    /* renamed from: d, reason: collision with root package name */
    public final C3010bi f24681d;

    public /* synthetic */ C2500Ba(C3010bi c3010bi, C3266gN c3266gN, C3266gN c3266gN2, int i) {
        this.f24678a = i;
        this.f24681d = c3010bi;
        this.f24679b = c3266gN;
        this.f24680c = c3266gN2;
    }

    public Or a() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new Or(c3383ig, (Object) this.f24681d.a(), this.f24679b.f(), this.f24680c.f(), 8);
    }

    public Ur b() {
        return new Ur(2, (ApplicationInfo) this.f24679b.f(), (PackageInfo) this.f24680c.f(), this.f24681d.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f24678a) {
            case 0:
                this.f24681d.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f24679b.f();
                return new C2483Aa(scheduledExecutorService);
            case 1:
                return new C2901Yn((C3069co) this.f24679b.f(), (C3391io) this.f24680c.f(), this.f24681d.a());
            case 2:
                Context a9 = this.f24681d.a();
                C3061cg c3061cg = (C3061cg) this.f24679b.f();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f24680c.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C3234fs(a9, c3061cg, scheduledExecutorService2, c3383ig);
            case 3:
                return b();
            default:
                return a();
        }
    }

    public /* synthetic */ C2500Ba(C3266gN c3266gN, C3266gN c3266gN2, C3010bi c3010bi, int i) {
        this.f24678a = i;
        this.f24679b = c3266gN;
        this.f24680c = c3266gN2;
        this.f24681d = c3010bi;
    }
}
