package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.z7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ResultReceiverC0904z7 extends ResultReceiver {
    public final InterfaceC0875y7 a;

    public ResultReceiverC0904z7(Handler handler, InterfaceC0875y7 interfaceC0875y7) {
        super(handler);
        this.a = interfaceC0875y7;
    }

    public static void a(ResultReceiver resultReceiver, EnumC0315ep enumC0315ep, M4 m4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", enumC0315ep.a);
            m4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a.a(i, bundle);
    }

    public static void a(ResultReceiver resultReceiver, M4 m4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            m4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }
}
