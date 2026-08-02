package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1354Wj {
    public static final AtomicReference<InterfaceC1353Wi> A00 = new AtomicReference<>(null);

    public static InterfaceC1353Wi A00() {
        InterfaceC1353Wi errorLogger = A00.get();
        if (errorLogger == null) {
            return new R1();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC1353Wi interfaceC1353Wi) {
        A00.set(interfaceC1353Wi);
    }
}
