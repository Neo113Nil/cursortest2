package io.appmetrica.analytics.push.impl;

import android.content.Context;

/* loaded from: classes4.dex */
public final class E0 {
    public final D0 a;

    public E0(Context context) {
        if (H2.a()) {
            this.a = new B1(context);
        } else {
            this.a = new G2();
        }
    }

    public final D0 a() {
        return this.a;
    }
}
