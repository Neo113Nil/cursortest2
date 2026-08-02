package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Qy implements Ly {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f27896a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3158eN f27897b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3158eN f27898c;

    /* renamed from: d, reason: collision with root package name */
    public final C3521lA f27899d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3158eN f27900e;

    /* renamed from: f, reason: collision with root package name */
    public final C3079cy f27901f;

    /* renamed from: g, reason: collision with root package name */
    public final C2972ay f27902g;

    public Qy(ExecutorService executorService, InterfaceC3158eN interfaceC3158eN, InterfaceC3158eN interfaceC3158eN2, C3521lA c3521lA, InterfaceC3158eN interfaceC3158eN3, C3079cy c3079cy, C2972ay c2972ay) {
        this.f27896a = executorService;
        this.f27897b = interfaceC3158eN;
        this.f27898c = interfaceC3158eN2;
        this.f27899d = c3521lA;
        this.f27900e = interfaceC3158eN3;
        this.f27901f = c3079cy;
        this.f27902g = c2972ay;
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final P3.a a(Context context) {
        C3294gy c3294gy = (C3294gy) this.f27901f.f();
        c3294gy.f31447c = context;
        c3294gy.f31451g = this.f27899d.a();
        C4002u6 C0 = H6.C0();
        C0.getClass();
        c3294gy.f31452h = C0;
        c3294gy.i = EnumC3616my.f33409n;
        return ((Vy) ((C3266gN) c3294gy.a().f30647u).f()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final void b(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Ty ty = (Ty) this.f27900e.f();
            synchronized (ty) {
                try {
                    if (motionEvent.getAction() == 1) {
                        ty.f28629b = MotionEvent.obtain(motionEvent);
                    }
                    ty.f28630c.a(motionEvent);
                    ArrayDeque arrayDeque = ty.f28628a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new Sy(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final String c() {
        return "1.904631200";
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final P3.a d(Context context, View view, Activity activity) {
        C3294gy c3294gy = (C3294gy) this.f27901f.f();
        context.getClass();
        c3294gy.f31447c = context;
        c3294gy.f31448d = view;
        c3294gy.f31449e = activity;
        c3294gy.f31450f = true != this.f27902g.U() ? "" : null;
        c3294gy.f31451g = this.f27899d.b(context, view);
        C4002u6 C0 = H6.C0();
        C0.getClass();
        c3294gy.f31452h = C0;
        c3294gy.i = EnumC3616my.f33410u;
        return ((Vy) ((C3266gN) c3294gy.a().f30647u).f()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final P3.a e(Context context, String str, View view) {
        InterfaceC3158eN interfaceC3158eN = this.f27900e;
        HashMap c9 = this.f27899d.c();
        Ty ty = (Ty) interfaceC3158eN.f();
        synchronized (ty) {
            try {
                MotionEvent motionEvent = ty.f28629b;
                if (motionEvent != null) {
                    c9.put("nv", motionEvent);
                }
                c9.put("oe", ty.f28630c);
                ArrayDeque arrayDeque = ty.f28628a;
                c9.put("ro", arrayDeque.toArray(new Sy[arrayDeque.size()]));
                ty.f28630c = new Ry();
                arrayDeque.clear();
                MotionEvent motionEvent2 = ty.f28629b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    ty.f28629b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3294gy c3294gy = (C3294gy) this.f27901f.f();
        context.getClass();
        c3294gy.f31447c = context;
        c3294gy.f31448d = view;
        c3294gy.f31449e = null;
        c3294gy.f31450f = str;
        c3294gy.f31451g = c9;
        c3294gy.i = EnumC3616my.f33411v;
        C4002u6 C0 = H6.C0();
        C0.getClass();
        c3294gy.f31452h = C0;
        return ((Vy) ((C3266gN) c3294gy.a().f30647u).f()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final P3.a f() {
        return QC.o(new Ts(6, this), this.f27896a);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final int h() {
        return 2;
    }
}
