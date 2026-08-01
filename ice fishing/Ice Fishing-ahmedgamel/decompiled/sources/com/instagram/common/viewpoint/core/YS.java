package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1163Pp A00;
    public final YU A01;

    public YS(C1840gi c1840gi, Executor executor, C1271Tw c1271Tw) {
        this.A01 = new YU(c1840gi);
        this.A00 = new C1163Pp(executor, c1271Tw, c1840gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1840gi c1840gi, Executor executor, C1271Tw c1271Tw) {
        if (!C1290Up.A1c(c1840gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c1840gi, executor, c1271Tw);
            A02.A00();
        } else {
            A02.A02(c1271Tw);
        }
    }

    private void A02(C1271Tw c1271Tw) {
        this.A00.A07(c1271Tw);
    }
}
