package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C1835ge c1835ge) {
        if (A00 == null) {
            A00 = new OO(c1835ge);
        }
        return A00;
    }

    public static void A01(C1835ge c1835ge) {
        if (AbstractC1292Us.A0F(c1835ge)) {
            A03(c1835ge);
        }
    }

    public static void A02(C1835ge c1835ge) {
        if (AbstractC1292Us.A0E(c1835ge)) {
            A03(c1835ge);
        }
    }

    public static void A03(C1835ge c1835ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C1938iN(c1835ge));
        }
    }
}
