package com.yandex.pulse;

import android.os.Message;
import android.util.Log;
import com.yandex.pulse.DefaultMetricsLogUploaderClient;
import defpackage.ezc;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends ezc implements Function1 {
    public final void h(Message message) {
        message.getClass();
        DefaultMetricsLogUploaderClient.LogUploader logUploader = (DefaultMetricsLogUploaderClient.LogUploader) this.receiver;
        DefaultMetricsLogUploaderClient.LogUploader.Companion companion = DefaultMetricsLogUploaderClient.LogUploader.h;
        logUploader.getClass();
        Log.i("Pulse", "Histograms sent, code " + message.arg1);
        logUploader.b(message);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        h((Message) obj);
        return Unit.a;
    }
}
