package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ba, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2480Ba implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23905a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f23906b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f23907c;

    /* renamed from: d, reason: collision with root package name */
    public final C2987bi f23908d;

    public /* synthetic */ C2480Ba(C2987bi c2987bi, C3243gN c3243gN, C3243gN c3243gN2, int i) {
        this.f23905a = i;
        this.f23908d = c2987bi;
        this.f23906b = c3243gN;
        this.f23907c = c3243gN2;
    }

    public Or a() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new Or(c3360ig, (Object) this.f23908d.a(), this.f23906b.f(), this.f23907c.f(), 8);
    }

    public Ur b() {
        return new Ur(2, (ApplicationInfo) this.f23906b.f(), (PackageInfo) this.f23907c.f(), this.f23908d.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f23905a) {
            case 0:
                this.f23908d.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f23906b.f();
                return new C2463Aa(scheduledExecutorService);
            case 1:
                return new C2862Xn((C2993bo) this.f23906b.f(), (C3315ho) this.f23907c.f(), this.f23908d.a());
            case 2:
                Context a9 = this.f23908d.a();
                C3038cg c3038cg = (C3038cg) this.f23906b.f();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f23907c.f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C3211fs(a9, c3038cg, scheduledExecutorService2, c3360ig);
            case 3:
                return b();
            default:
                return a();
        }
    }

    public /* synthetic */ C2480Ba(C3243gN c3243gN, C3243gN c3243gN2, C2987bi c2987bi, int i) {
        this.f23905a = i;
        this.f23906b = c3243gN;
        this.f23907c = c3243gN2;
        this.f23908d = c2987bi;
    }
}
