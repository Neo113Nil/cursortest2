package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.kA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3467kA implements InterfaceC3307hA {

    /* renamed from: a, reason: collision with root package name */
    public final C4006uA f32161a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32162b;

    public C3467kA(C4006uA c4006uA, long j6) {
        this.f32161a = c4006uA;
        this.f32162b = j6;
    }

    public static boolean c(Ky ky) {
        int A9 = ky.B().A().A();
        int B3 = ky.B().A().B();
        byte[] versionArray = AbstractC2659Kg.m();
        kotlin.jvm.internal.h.e(versionArray, "versionArray");
        ByteBuffer allocate = ByteBuffer.allocate(6);
        kotlin.jvm.internal.h.d(allocate, "allocate(...)");
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) A9);
        allocate.putInt(B3);
        byte[] array = allocate.array();
        kotlin.jvm.internal.h.d(array, "array(...)");
        return Arrays.equals(array, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3307hA
    public final boolean a(Ky ky) {
        C4006uA c4006uA = this.f32161a;
        if (ky == null || ky.equals(Ky.G())) {
            c4006uA.b(20202);
            return true;
        }
        if (!c(ky)) {
            c4006uA.b(20205);
            return true;
        }
        boolean z6 = ky.B().C() - System.currentTimeMillis() <= this.f32162b;
        if (z6) {
            c4006uA.b(20203);
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3307hA
    public final boolean b(Ky ky) {
        C4006uA c4006uA = this.f32161a;
        if (ky == null || ky.equals(Ky.G())) {
            c4006uA.b(20204);
            return false;
        }
        if (c(ky)) {
            return true;
        }
        c4006uA.b(20206);
        return false;
    }
}
