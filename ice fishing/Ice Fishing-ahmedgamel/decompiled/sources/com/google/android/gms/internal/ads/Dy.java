package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Dy implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25263a;

    /* renamed from: b, reason: collision with root package name */
    public final C3374iN f25264b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f25265c;

    /* renamed from: d, reason: collision with root package name */
    public final C3374iN f25266d;

    /* renamed from: e, reason: collision with root package name */
    public final C3374iN f25267e;

    /* renamed from: f, reason: collision with root package name */
    public final C3266gN f25268f;

    public Dy(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C3266gN c3266gN2, C3374iN c3374iN3) {
        this.f25263a = 0;
        this.f25264b = c3374iN;
        this.f25265c = c3266gN;
        this.f25266d = c3374iN2;
        this.f25268f = c3266gN2;
        this.f25267e = c3374iN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f25263a) {
            case 0:
                Context context = (Context) this.f25264b.f31812a;
                InterfaceC3832qy interfaceC3832qy = (InterfaceC3832qy) this.f25265c.f();
                ExecutorService executorService = (ExecutorService) this.f25266d.f31812a;
                C3778py c3778py = (C3778py) this.f25268f.f();
                C2972ay c2972ay = (C2972ay) this.f25267e.f31812a;
                return new Gy(context, interfaceC3832qy, executorService, c3778py, new Random(), c2972ay.T().A(), c2972ay.T().C(), c2972ay.T().D(), c2972ay.T().B(), c2972ay.R(), c2972ay.L(), c2972ay.J() - 1);
            case 1:
                return new C3349hz((C4002u6) this.f25264b.f31812a, (C3241fz) this.f25265c.f(), (View) this.f25266d.f31812a, (Activity) this.f25267e.f31812a, (C4006uA) this.f25268f.f());
            case 2:
                return new C3349hz((C4002u6) this.f25264b.f31812a, (C3241fz) this.f25265c.f(), (Map) this.f25266d.f31812a, (Context) this.f25267e.f31812a, (C4006uA) this.f25268f.f());
            default:
                return new C3349hz((C4002u6) this.f25264b.f31812a, (C3241fz) this.f25265c.f(), (EnumC3616my) this.f25266d.f31812a, (Map) this.f25267e.f31812a, (C4006uA) this.f25268f.f());
        }
    }

    public /* synthetic */ Dy(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C3374iN c3374iN3, C3266gN c3266gN2, int i) {
        this.f25263a = i;
        this.f25264b = c3374iN;
        this.f25265c = c3266gN;
        this.f25266d = c3374iN2;
        this.f25267e = c3374iN3;
        this.f25268f = c3266gN2;
    }
}
