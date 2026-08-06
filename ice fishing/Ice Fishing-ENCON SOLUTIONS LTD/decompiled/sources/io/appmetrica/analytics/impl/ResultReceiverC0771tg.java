package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC0771tg extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0409fg f6949a;

    public ResultReceiverC0771tg(Handler handler, InterfaceC0409fg interfaceC0409fg) {
        super(handler);
        this.f6949a = interfaceC0409fg;
    }

    public static void a(ResultReceiver resultReceiver, C0616ng c0616ng) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c0616ng == null ? null : c0616ng.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            C0616ng c0616ng = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0616ng = new C0616ng(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f6949a.a(c0616ng);
        }
    }
}
