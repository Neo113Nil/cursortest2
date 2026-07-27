package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1541br {
    public static final int A00 = YB.A00();

    public static void A00(C1840gi c1840gi, ViewGroup viewGroup, String str) {
        new LM(viewGroup, c1840gi).A07(str);
        View view = new View(c1840gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        YB.A0U(view, c1840gi);
        viewGroup.addView(view, 0);
    }
}
