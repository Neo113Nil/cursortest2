package io.appmetrica.analytics.impl;

import h1.C0239i;

/* loaded from: classes.dex */
public final /* synthetic */ class Nd extends kotlin.jvm.internal.h implements t1.l {
    public Nd(Object obj) {
        super(1, obj, Od.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        Od od = (Od) this.receiver;
        od.f4860a.markCrashCompleted((String) obj);
        od.f4860a.deleteCompletedCrashes();
        return C0239i.f3393a;
    }
}
