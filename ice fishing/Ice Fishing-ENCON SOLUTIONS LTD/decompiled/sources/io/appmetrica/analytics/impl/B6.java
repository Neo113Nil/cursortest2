package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class B6 extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final A6 f4192a;

    public B6(Handler handler, A6 a6) {
        super(handler);
        this.f4192a = a6;
    }

    public static void a(ResultReceiver resultReceiver, S3 s3) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            s3.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f4192a.a(i2, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Jl jl, S3 s3) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", jl.f4610a);
            s3.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
