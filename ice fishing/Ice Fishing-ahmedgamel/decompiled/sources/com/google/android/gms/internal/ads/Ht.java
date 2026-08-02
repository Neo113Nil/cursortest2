package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Ht implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26145a;

    /* renamed from: b, reason: collision with root package name */
    public final C3374iN f26146b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f26147c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f26148d;

    /* renamed from: e, reason: collision with root package name */
    public final C3374iN f26149e;

    /* renamed from: f, reason: collision with root package name */
    public final C3266gN f26150f;

    public Ht(C3374iN c3374iN, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3374iN c3374iN2) {
        this.f26145a = 4;
        this.f26146b = c3374iN;
        this.f26147c = c3266gN;
        this.f26148d = c3266gN2;
        this.f26150f = c3266gN3;
        this.f26149e = c3374iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f26145a) {
            case 0:
                return new Gt((Context) this.f26146b.f31812a, (Executor) this.f26147c.f(), (C3332hi) this.f26149e.f31812a, (Dr) this.f26148d.f(), (Jt) this.f26150f.f(), new C3022bu());
            case 1:
                return new Py((C2972ay) this.f26146b.f31812a, (Oy) this.f26147c.f(), (My) this.f26148d.f(), (ExecutorService) this.f26149e.f31812a, (C4006uA) this.f26150f.f());
            case 2:
                return new C3725oz((C4002u6) this.f26146b.f31812a, (C3241fz) this.f26147c.f(), (Map) this.f26149e.f31812a, (DisplayMetrics) this.f26148d.f(), (C4006uA) this.f26150f.f());
            case 3:
                return new C3349hz((C4002u6) this.f26146b.f31812a, (C3241fz) this.f26147c.f(), (DisplayMetrics) this.f26148d.f(), (View) this.f26149e.f31812a, (C4006uA) this.f26150f.f());
            default:
                return new C3025bx((Context) this.f26146b.f31812a, (InterfaceC3078cx) this.f26147c.f(), (Cw) this.f26148d.f(), (Bw) this.f26150f.f(), ((C2972ay) this.f26149e.f31812a).g0());
        }
    }

    public /* synthetic */ Ht(C3374iN c3374iN, C3266gN c3266gN, C3266gN c3266gN2, C3374iN c3374iN2, C3266gN c3266gN3, int i) {
        this.f26145a = i;
        this.f26146b = c3374iN;
        this.f26147c = c3266gN;
        this.f26148d = c3266gN2;
        this.f26149e = c3374iN2;
        this.f26150f = c3266gN3;
    }

    public /* synthetic */ Ht(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C3266gN c3266gN2, C3266gN c3266gN3, int i) {
        this.f26145a = i;
        this.f26146b = c3374iN;
        this.f26147c = c3266gN;
        this.f26149e = c3374iN2;
        this.f26148d = c3266gN2;
        this.f26150f = c3266gN3;
    }
}
