package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.tq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0675tq {
    public final InterfaceC0733vq a;
    public final InterfaceC0733vq b;

    public C0675tq(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.a = new A3(new C0587qo(context));
            this.b = new A3(new C0605re(context));
        } else {
            this.a = new C0283g9();
            this.b = new C0283g9();
        }
    }
}
