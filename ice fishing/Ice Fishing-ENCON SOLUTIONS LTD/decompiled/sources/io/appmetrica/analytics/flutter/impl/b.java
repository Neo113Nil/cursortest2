package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f3927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3929d;

    public /* synthetic */ b(Pigeon.Result result, Object obj, Object obj2, int i2) {
        this.f3926a = i2;
        this.f3927b = result;
        this.f3929d = obj;
        this.f3928c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3926a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onError$1(this.f3927b, (DeferredDeeplinkListener.Error) this.f3929d, (String) this.f3928c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onError$1(this.f3927b, (DeferredDeeplinkParametersListener.Error) this.f3929d, (String) this.f3928c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onRequestError$1(this.f3927b, (StartupParamsCallback.Result) this.f3929d, (StartupParamsCallback.Reason) this.f3928c);
                break;
        }
    }
}
