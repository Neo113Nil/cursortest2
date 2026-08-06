package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public final class M9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4744a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f4745b;

    /* renamed from: c, reason: collision with root package name */
    public final W2 f4746c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f4747d;

    public M9(Context context, Vm vm, W2 w2, SafePackageManager safePackageManager) {
        this.f4744a = context;
        this.f4745b = vm;
        this.f4746c = w2;
        this.f4747d = safePackageManager;
    }

    public M9(Context context) {
        this(context, new Vm(context, "io.appmetrica.analytics.build_id"), new W2(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
