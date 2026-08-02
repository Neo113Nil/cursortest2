package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes9.dex */
public final class Kq {
    public final Mq a;
    public final Mq b;

    public Kq(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.a = new A3(new Lo(context));
            this.b = new A3(new Ge(context));
        } else {
            this.a = new C0530m9();
            this.b = new C0530m9();
        }
    }
}
