package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.kA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3444kA implements InterfaceC3284hA {

    /* renamed from: a, reason: collision with root package name */
    public final C3983uA f31382a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31383b;

    public C3444kA(C3983uA c3983uA, long j6) {
        this.f31382a = c3983uA;
        this.f31383b = j6;
    }

    public static boolean c(Ky ky) {
        int A9 = ky.B().A().A();
        int B9 = ky.B().A().B();
        byte[] versionArray = AbstractC2639Kg.m();
        kotlin.jvm.internal.h.e(versionArray, "versionArray");
        ByteBuffer allocate = ByteBuffer.allocate(6);
        kotlin.jvm.internal.h.d(allocate, "allocate(...)");
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) A9);
        allocate.putInt(B9);
        byte[] array = allocate.array();
        kotlin.jvm.internal.h.d(array, "array(...)");
        return Arrays.equals(array, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3284hA
    public final boolean a(Ky ky) {
        C3983uA c3983uA = this.f31382a;
        if (ky == null || ky.equals(Ky.G())) {
            c3983uA.b(20202);
            return true;
        }
        if (!c(ky)) {
            c3983uA.b(20205);
            return true;
        }
        boolean z3 = ky.B().C() - System.currentTimeMillis() <= this.f31383b;
        if (z3) {
            c3983uA.b(20203);
        }
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3284hA
    public final boolean b(Ky ky) {
        C3983uA c3983uA = this.f31382a;
        if (ky == null || ky.equals(Ky.G())) {
            c3983uA.b(20204);
            return false;
        }
        if (c(ky)) {
            return true;
        }
        c3983uA.b(20206);
        return false;
    }
}
