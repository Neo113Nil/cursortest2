package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649on {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0701qn f6696a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0701qn f6697b;

    public C0649on(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f6696a = new L2(new C0621nl(context));
            this.f6697b = new L2(new Lc(context));
        } else {
            this.f6696a = new Y7();
            this.f6697b = new Y7();
        }
    }
}
