package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public final class H5 {
    public static byte[] A03;
    public final H4 A00;
    public final Constructor<? extends H9> A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    static {
        A02();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{55, 0, 0, 29, 0, 82, 27, 28, 1, 6, 19, 28, 6, 27, 19, 6, 27, 28, 21, 82, 23, 10, 6, 23, 28, 1, 27, 29, 28, 37, 30, 21, 8, 0, 21, 19, 4, 21, 20, 80, 21, 2, 2, 31, 2, 80, 19, 2, 21, 17, 4, 25, 30, 23, 80, 21, 8, 4, 2, 17, 19, 4, 31, 2};
    }

    public H5(H4 h42) {
        this.A00 = h42;
    }

    private Constructor<? extends H9> A01() {
        synchronized (this.A02) {
            if (this.A02.get()) {
                return this.A01;
            }
            try {
                return this.A00.A7R();
            } catch (ClassNotFoundException unused) {
                this.A02.set(true);
                return this.A01;
            } catch (Exception e6) {
                throw new RuntimeException(A00(0, 29, 124), e6);
            }
        }
    }

    public final H9 A03(Object... objArr) {
        Constructor<? extends H9> A01 = A01();
        if (A01 == null) {
            return null;
        }
        try {
            return A01.newInstance(objArr);
        } catch (Exception e6) {
            throw new IllegalStateException(A00(29, 35, a.f21885Q), e6);
        }
    }
}
