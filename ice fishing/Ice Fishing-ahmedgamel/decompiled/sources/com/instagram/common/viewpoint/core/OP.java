package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C1856ge c1856ge) {
        if (A00 == null) {
            A00 = new OO(c1856ge);
        }
        return A00;
    }

    public static void A01(C1856ge c1856ge) {
        if (AbstractC1313Us.A0F(c1856ge)) {
            A03(c1856ge);
        }
    }

    public static void A02(C1856ge c1856ge) {
        if (AbstractC1313Us.A0E(c1856ge)) {
            A03(c1856ge);
        }
    }

    public static void A03(C1856ge c1856ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C1959iN(c1856ge));
        }
    }
}
