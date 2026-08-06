package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f3924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3925c;

    public /* synthetic */ a(Pigeon.Result result, Object obj, int i2) {
        this.f3923a = i2;
        this.f3924b = result;
        this.f3925c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3923a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onDeeplinkLoaded$0(this.f3924b, (String) this.f3925c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onParametersLoaded$0(this.f3924b, (Map) this.f3925c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onReceive$0(this.f3924b, (StartupParamsCallback.Result) this.f3925c);
                break;
        }
    }
}
