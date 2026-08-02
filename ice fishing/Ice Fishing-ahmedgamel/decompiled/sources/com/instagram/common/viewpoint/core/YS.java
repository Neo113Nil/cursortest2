package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1183Pp A00;
    public final YU A01;

    public YS(C1860gi c1860gi, Executor executor, C1291Tw c1291Tw) {
        this.A01 = new YU(c1860gi);
        this.A00 = new C1183Pp(executor, c1291Tw, c1860gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1860gi c1860gi, Executor executor, C1291Tw c1291Tw) {
        if (!C1310Up.A1c(c1860gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c1860gi, executor, c1291Tw);
            A02.A00();
        } else {
            A02.A02(c1291Tw);
        }
    }

    private void A02(C1291Tw c1291Tw) {
        this.A00.A07(c1291Tw);
    }
}
