package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Ht implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25436a;

    /* renamed from: b, reason: collision with root package name */
    public final C4117wN f25437b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f25438c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f25439d;

    /* renamed from: e, reason: collision with root package name */
    public final C4117wN f25440e;

    /* renamed from: f, reason: collision with root package name */
    public final C4009uN f25441f;

    public Ht(C4117wN c4117wN, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4117wN c4117wN2) {
        this.f25436a = 4;
        this.f25437b = c4117wN;
        this.f25438c = c4009uN;
        this.f25439d = c4009uN2;
        this.f25441f = c4009uN3;
        this.f25440e = c4117wN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f25436a) {
            case 0:
                return new Gt((Context) this.f25437b.f34977a, (Executor) this.f25438c.d(), (C3214fi) this.f25440e.f34977a, (Fr) this.f25439d.d(), (Jt) this.f25441f.d(), new C3171eu());
            case 1:
                return new Ry((C3066cy) this.f25437b.f34977a, (Qy) this.f25438c.d(), (Oy) this.f25439d.d(), (ExecutorService) this.f25440e.f34977a, (C4158xA) this.f25441f.d());
            case 2:
                return new C3876rz((C3830r6) this.f25437b.f34977a, (C3391iz) this.f25438c.d(), (Map) this.f25440e.f34977a, (DisplayMetrics) this.f25439d.d(), (C4158xA) this.f25441f.d());
            case 3:
                return new C3499kz((C3830r6) this.f25437b.f34977a, (C3391iz) this.f25438c.d(), (DisplayMetrics) this.f25439d.d(), (View) this.f25440e.f34977a, (C4158xA) this.f25441f.d());
            default:
                return new C3011bx((Context) this.f25437b.f34977a, (InterfaceC3065cx) this.f25438c.d(), (Dw) this.f25439d.d(), (Cw) this.f25441f.d(), ((C3066cy) this.f25440e.f34977a).g0());
        }
    }

    public /* synthetic */ Ht(C4117wN c4117wN, C4009uN c4009uN, C4009uN c4009uN2, C4117wN c4117wN2, C4009uN c4009uN3, int i) {
        this.f25436a = i;
        this.f25437b = c4117wN;
        this.f25438c = c4009uN;
        this.f25439d = c4009uN2;
        this.f25440e = c4117wN2;
        this.f25441f = c4009uN3;
    }

    public /* synthetic */ Ht(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C4009uN c4009uN2, C4009uN c4009uN3, int i) {
        this.f25436a = i;
        this.f25437b = c4117wN;
        this.f25438c = c4009uN;
        this.f25440e = c4117wN2;
        this.f25439d = c4009uN2;
        this.f25441f = c4009uN3;
    }
}
