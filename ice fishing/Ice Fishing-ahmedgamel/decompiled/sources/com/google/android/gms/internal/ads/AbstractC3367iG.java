package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.iG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3367iG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3263gK f31791a = C3263gK.a(new byte[0]);

    public static final C3263gK a(int i) {
        return C3263gK.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final C3263gK b(int i) {
        return C3263gK.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
