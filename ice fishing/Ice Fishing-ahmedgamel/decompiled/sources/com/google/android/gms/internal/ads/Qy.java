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
    public final ExecutorService f27140a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3135eN f27141b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3135eN f27142c;

    /* renamed from: d, reason: collision with root package name */
    public final C3498lA f27143d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3135eN f27144e;

    /* renamed from: f, reason: collision with root package name */
    public final C3056cy f27145f;

    /* renamed from: g, reason: collision with root package name */
    public final C2949ay f27146g;

    public Qy(ExecutorService executorService, InterfaceC3135eN interfaceC3135eN, InterfaceC3135eN interfaceC3135eN2, C3498lA c3498lA, InterfaceC3135eN interfaceC3135eN3, C3056cy c3056cy, C2949ay c2949ay) {
        this.f27140a = executorService;
        this.f27141b = interfaceC3135eN;
        this.f27142c = interfaceC3135eN2;
        this.f27143d = c3498lA;
        this.f27144e = interfaceC3135eN3;
        this.f27145f = c3056cy;
        this.f27146g = c2949ay;
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final N3.a a(Context context) {
        C3271gy c3271gy = (C3271gy) this.f27145f.f();
        c3271gy.f30681c = context;
        c3271gy.f30685g = this.f27143d.a();
        C3979u6 C0 = H6.C0();
        C0.getClass();
        c3271gy.f30686h = C0;
        c3271gy.i = EnumC3593my.f32631n;
        return ((Vy) ((C3243gN) c3271gy.a().f29859u).f()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final void b(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Ty ty = (Ty) this.f27144e.f();
            synchronized (ty) {
                try {
                    if (motionEvent.getAction() == 1) {
                        ty.f27832b = MotionEvent.obtain(motionEvent);
                    }
                    ty.f27833c.a(motionEvent);
                    ArrayDeque arrayDeque = ty.f27831a;
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
    public final N3.a d(Context context, View view, Activity activity) {
        C3271gy c3271gy = (C3271gy) this.f27145f.f();
        context.getClass();
        c3271gy.f30681c = context;
        c3271gy.f30682d = view;
        c3271gy.f30683e = activity;
        c3271gy.f30684f = true != this.f27146g.U() ? "" : null;
        c3271gy.f30685g = this.f27143d.b(context, view);
        C3979u6 C0 = H6.C0();
        C0.getClass();
        c3271gy.f30686h = C0;
        c3271gy.i = EnumC3593my.f32632u;
        return ((Vy) ((C3243gN) c3271gy.a().f29859u).f()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final N3.a e(Context context, String str, View view) {
        InterfaceC3135eN interfaceC3135eN = this.f27144e;
        HashMap c9 = this.f27143d.c();
        Ty ty = (Ty) interfaceC3135eN.f();
        synchronized (ty) {
            try {
                MotionEvent motionEvent = ty.f27832b;
                if (motionEvent != null) {
                    c9.put("nv", motionEvent);
                }
                c9.put("oe", ty.f27833c);
                ArrayDeque arrayDeque = ty.f27831a;
                c9.put("ro", arrayDeque.toArray(new Sy[arrayDeque.size()]));
                ty.f27833c = new Ry();
                arrayDeque.clear();
                MotionEvent motionEvent2 = ty.f27832b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    ty.f27832b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3271gy c3271gy = (C3271gy) this.f27145f.f();
        context.getClass();
        c3271gy.f30681c = context;
        c3271gy.f30682d = view;
        c3271gy.f30683e = null;
        c3271gy.f30684f = str;
        c3271gy.f30685g = c9;
        c3271gy.i = EnumC3593my.f32633v;
        C3979u6 C0 = H6.C0();
        C0.getClass();
        c3271gy.f30686h = C0;
        return ((Vy) ((C3243gN) c3271gy.a().f29859u).f()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final N3.a f() {
        return QC.o(new Ts(6, this), this.f27140a);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final int h() {
        return 2;
    }
}
