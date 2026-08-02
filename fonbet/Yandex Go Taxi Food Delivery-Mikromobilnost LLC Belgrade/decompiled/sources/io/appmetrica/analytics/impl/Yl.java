package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;

/* loaded from: classes4.dex */
public final class Yl implements InterfaceC0194aj {
    public final Context a;
    public final String b = CoreConstants.Transport.RUSTORE;

    public Yl(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final void a(Wi wi) {
        new C0226bm(this.a).a(wi);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final String a() {
        return this.b;
    }
}
