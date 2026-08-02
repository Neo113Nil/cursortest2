package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.ei, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3170ei {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f30756a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a(ByteBuffer byteBuffer);

    default long b(long j6) {
        return j6;
    }

    C3653nh c(C3653nh c3653nh);

    void d();

    ByteBuffer e();

    void f(C2660Kh c2660Kh);

    boolean h();

    boolean i();

    void j();
}
