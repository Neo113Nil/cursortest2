package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3563lz implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32649a;

    /* renamed from: b, reason: collision with root package name */
    public final C3374iN f32650b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f32651c;

    /* renamed from: d, reason: collision with root package name */
    public final C3374iN f32652d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f32653e;

    public /* synthetic */ C3563lz(C3374iN c3374iN, C3266gN c3266gN, C3266gN c3266gN2, C3374iN c3374iN2, int i) {
        this.f32649a = i;
        this.f32650b = c3374iN;
        this.f32651c = c3266gN;
        this.f32653e = c3266gN2;
        this.f32652d = c3374iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f32649a) {
            case 0:
                return new C3509kz((C4002u6) this.f32650b.f31812a, (C3241fz) this.f32651c.f(), (Context) this.f32652d.f31812a, (C4006uA) this.f32653e.f(), 0);
            case 1:
                return new C3617mz((C4002u6) this.f32650b.f31812a, (C3241fz) this.f32651c.f(), (C2972ay) this.f32652d.f31812a, (C4006uA) this.f32653e.f());
            case 2:
                return new C3617mz((C4002u6) this.f32650b.f31812a, (C3241fz) this.f32651c.f(), (Map) this.f32652d.f31812a, (C4006uA) this.f32653e.f());
            case 3:
                return new C3509kz((C4002u6) this.f32650b.f31812a, (C3241fz) this.f32651c.f(), (Context) this.f32652d.f31812a, (C4006uA) this.f32653e.f(), 1);
            case 4:
                return new C3886rz((Context) this.f32650b.f31812a, (C4006uA) this.f32651c.f(), (Xy) this.f32653e.f(), (C2972ay) this.f32652d.f31812a);
            case 5:
                return new C3629nA((Context) this.f32650b.f31812a, (C4006uA) this.f32651c.f(), (C2972ay) this.f32652d.f31812a, (RD) this.f32653e.f());
            default:
                return new C3629nA((Context) this.f32650b.f31812a, (C4006uA) this.f32651c.f(), (RD) this.f32653e.f(), (C2972ay) this.f32652d.f31812a);
        }
    }

    public /* synthetic */ C3563lz(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C3266gN c3266gN2, int i) {
        this.f32649a = i;
        this.f32650b = c3374iN;
        this.f32651c = c3266gN;
        this.f32652d = c3374iN2;
        this.f32653e = c3266gN2;
    }
}
