package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ResultReceiverC0338fj extends ResultReceiver {
    public final Si a;

    public ResultReceiverC0338fj(Handler handler, Si si) {
        super(handler);
        this.a = si;
    }

    public static void a(ResultReceiver resultReceiver, Ui ui) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", ui == null ? null : ui.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            Ui ui = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (!Or.a(byteArray)) {
                    ui = new Ui(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.a.a(ui);
        }
    }
}
