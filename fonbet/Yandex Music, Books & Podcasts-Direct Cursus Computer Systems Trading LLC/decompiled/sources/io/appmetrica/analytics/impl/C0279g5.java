package io.appmetrica.analytics.impl;

import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0279g5 {
    public final C0212dp a;
    public final C0250f5 b;
    public final ResultReceiver c;

    public C0279g5(C0769x4 c0769x4) {
        this(new C0212dp(c0769x4), new C0250f5(c0769x4.b(), c0769x4.a().a()), c0769x4.a().c());
    }

    public C0279g5(C0212dp c0212dp, C0250f5 c0250f5, ResultReceiver resultReceiver) {
        this.a = c0212dp;
        this.b = c0250f5;
        this.c = resultReceiver;
    }
}
