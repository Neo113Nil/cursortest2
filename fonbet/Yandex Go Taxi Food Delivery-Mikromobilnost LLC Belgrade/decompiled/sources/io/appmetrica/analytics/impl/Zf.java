package io.appmetrica.analytics.impl;

import defpackage.sls;
import defpackage.zy11;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Zf extends Lambda implements sls {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ MviTimestamp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zf(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        super(0);
        this.a = mviScreen;
        this.b = mviTimestamp;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        C0249cg.a.getClass();
        C0249cg.b().onFullyDrawn(this.a, this.b);
        return zy11.a;
    }
}
