package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Dy implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24502a;

    /* renamed from: b, reason: collision with root package name */
    public final C3351iN f24503b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f24504c;

    /* renamed from: d, reason: collision with root package name */
    public final C3351iN f24505d;

    /* renamed from: e, reason: collision with root package name */
    public final C3351iN f24506e;

    /* renamed from: f, reason: collision with root package name */
    public final C3243gN f24507f;

    public Dy(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C3243gN c3243gN2, C3351iN c3351iN3) {
        this.f24502a = 0;
        this.f24503b = c3351iN;
        this.f24504c = c3243gN;
        this.f24505d = c3351iN2;
        this.f24507f = c3243gN2;
        this.f24506e = c3351iN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f24502a) {
            case 0:
                Context context = (Context) this.f24503b.f31039a;
                InterfaceC3809qy interfaceC3809qy = (InterfaceC3809qy) this.f24504c.f();
                ExecutorService executorService = (ExecutorService) this.f24505d.f31039a;
                C3755py c3755py = (C3755py) this.f24507f.f();
                C2949ay c2949ay = (C2949ay) this.f24506e.f31039a;
                return new Gy(context, interfaceC3809qy, executorService, c3755py, new Random(), c2949ay.T().A(), c2949ay.T().C(), c2949ay.T().D(), c2949ay.T().B(), c2949ay.R(), c2949ay.L(), c2949ay.J() - 1);
            case 1:
                return new C3326hz((C3979u6) this.f24503b.f31039a, (C3218fz) this.f24504c.f(), (View) this.f24505d.f31039a, (Activity) this.f24506e.f31039a, (C3983uA) this.f24507f.f());
            case 2:
                return new C3326hz((C3979u6) this.f24503b.f31039a, (C3218fz) this.f24504c.f(), (Map) this.f24505d.f31039a, (Context) this.f24506e.f31039a, (C3983uA) this.f24507f.f());
            default:
                return new C3326hz((C3979u6) this.f24503b.f31039a, (C3218fz) this.f24504c.f(), (EnumC3593my) this.f24505d.f31039a, (Map) this.f24506e.f31039a, (C3983uA) this.f24507f.f());
        }
    }

    public /* synthetic */ Dy(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C3351iN c3351iN3, C3243gN c3243gN2, int i) {
        this.f24502a = i;
        this.f24503b = c3351iN;
        this.f24504c = c3243gN;
        this.f24505d = c3351iN2;
        this.f24506e = c3351iN3;
        this.f24507f = c3243gN2;
    }
}
