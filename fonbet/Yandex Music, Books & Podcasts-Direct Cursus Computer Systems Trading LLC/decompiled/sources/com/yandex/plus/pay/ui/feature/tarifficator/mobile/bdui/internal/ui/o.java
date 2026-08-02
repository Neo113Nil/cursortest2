package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import defpackage.cvt;
import defpackage.dfi;
import defpackage.joj;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ o(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.l.a;
            case 1:
                return dfi.n("X-YA-PLUS-BDUI-LOG-ID", com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(this.b.m.F()));
            default:
                joj c = ((OkHttpClient) this.b.D.invoke()).c();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeUnit.getClass();
                c.w = cvt.b("timeout", 10000L, timeUnit);
                return c;
        }
    }
}
