package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Ht implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25402a;

    /* renamed from: b, reason: collision with root package name */
    public final C3351iN f25403b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f25404c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f25405d;

    /* renamed from: e, reason: collision with root package name */
    public final C3351iN f25406e;

    /* renamed from: f, reason: collision with root package name */
    public final C3243gN f25407f;

    public Ht(C3351iN c3351iN, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3351iN c3351iN2) {
        this.f25402a = 4;
        this.f25403b = c3351iN;
        this.f25404c = c3243gN;
        this.f25405d = c3243gN2;
        this.f25407f = c3243gN3;
        this.f25406e = c3351iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f25402a) {
            case 0:
                return new Gt((Context) this.f25403b.f31039a, (Executor) this.f25404c.f(), (C3309hi) this.f25406e.f31039a, (Dr) this.f25405d.f(), (Jt) this.f25407f.f(), new C2999bu());
            case 1:
                return new Py((C2949ay) this.f25403b.f31039a, (Oy) this.f25404c.f(), (My) this.f25405d.f(), (ExecutorService) this.f25406e.f31039a, (C3983uA) this.f25407f.f());
            case 2:
                return new C3702oz((C3979u6) this.f25403b.f31039a, (C3218fz) this.f25404c.f(), (Map) this.f25406e.f31039a, (DisplayMetrics) this.f25405d.f(), (C3983uA) this.f25407f.f());
            case 3:
                return new C3326hz((C3979u6) this.f25403b.f31039a, (C3218fz) this.f25404c.f(), (DisplayMetrics) this.f25405d.f(), (View) this.f25406e.f31039a, (C3983uA) this.f25407f.f());
            default:
                return new C3002bx((Context) this.f25403b.f31039a, (InterfaceC3055cx) this.f25404c.f(), (Cw) this.f25405d.f(), (Bw) this.f25407f.f(), ((C2949ay) this.f25406e.f31039a).g0());
        }
    }

    public /* synthetic */ Ht(C3351iN c3351iN, C3243gN c3243gN, C3243gN c3243gN2, C3351iN c3351iN2, C3243gN c3243gN3, int i) {
        this.f25402a = i;
        this.f25403b = c3351iN;
        this.f25404c = c3243gN;
        this.f25405d = c3243gN2;
        this.f25406e = c3351iN2;
        this.f25407f = c3243gN3;
    }

    public /* synthetic */ Ht(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C3243gN c3243gN2, C3243gN c3243gN3, int i) {
        this.f25402a = i;
        this.f25403b = c3351iN;
        this.f25404c = c3243gN;
        this.f25406e = c3351iN2;
        this.f25405d = c3243gN2;
        this.f25407f = c3243gN3;
    }
}
