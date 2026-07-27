package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.mA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3565mA implements InterfaceC3457kA {

    /* renamed from: a, reason: collision with root package name */
    public final C4158xA f32669a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32670b;

    public C3565mA(C4158xA c4158xA, long j9) {
        this.f32669a = c4158xA;
        this.f32670b = j9;
    }

    public static boolean c(My my) {
        int A8 = my.B().A().A();
        int B8 = my.B().A().B();
        byte[] versionArray = AbstractC3194fG.k();
        kotlin.jvm.internal.h.e(versionArray, "versionArray");
        ByteBuffer allocate = ByteBuffer.allocate(6);
        kotlin.jvm.internal.h.d(allocate, "allocate(...)");
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) A8);
        allocate.putInt(B8);
        byte[] array = allocate.array();
        kotlin.jvm.internal.h.d(array, "array(...)");
        return Arrays.equals(array, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3457kA
    public final boolean a(My my) {
        C4158xA c4158xA = this.f32669a;
        if (my == null || my.equals(My.G())) {
            c4158xA.b(20204);
            return false;
        }
        if (c(my)) {
            return true;
        }
        c4158xA.b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3457kA
    public final boolean b(My my) {
        C4158xA c4158xA = this.f32669a;
        if (my == null || my.equals(My.G())) {
            c4158xA.b(20202);
            return true;
        }
        if (!c(my)) {
            c4158xA.b(20205);
            return true;
        }
        boolean z8 = my.B().C() - System.currentTimeMillis() <= this.f32670b;
        if (z8) {
            c4158xA.b(20203);
        }
        return z8;
    }
}
