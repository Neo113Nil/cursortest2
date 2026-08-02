package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3558lu {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3703od f32644a;

    public C3558lu(InterfaceC3703od interfaceC3703od) {
        this.f32644a = interfaceC3703od;
    }

    public final boolean a() {
        try {
            return this.f32644a.m();
        } catch (Throwable th) {
            throw new C3290gu(th);
        }
    }

    public final void b(boolean z6) {
        try {
            this.f32644a.P1(z6);
        } catch (Throwable th) {
            throw new C3290gu(th);
        }
    }
}
