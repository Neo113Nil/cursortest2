package com.yandex.passport.internal.sso;

import io.appmetrica.analytics.IReporterYandex;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IReporterYandex b;

    public /* synthetic */ e(IReporterYandex iReporterYandex, int i) {
        this.a = i;
        this.b = iReporterYandex;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        switch (this.a) {
            case 0:
                exc.getClass();
                this.b.reportError(com.yandex.passport.internal.analytics.m.e.b, exc);
                break;
            case 1:
                exc.getClass();
                this.b.reportError(com.yandex.passport.internal.analytics.m.e.b, exc);
                break;
            default:
                exc.getClass();
                this.b.reportError(com.yandex.passport.internal.analytics.m.e.b, exc);
                break;
        }
        return Unit.a;
    }
}
