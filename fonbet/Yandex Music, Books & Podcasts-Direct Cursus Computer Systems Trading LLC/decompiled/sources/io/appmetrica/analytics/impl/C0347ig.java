package io.appmetrica.analytics.impl;

import defpackage.ezc;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0347ig extends ezc implements Function1 {
    public C0347ig(Object obj) {
        super(1, 0, C0376jg.class, obj, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0376jg c0376jg = (C0376jg) this.receiver;
        c0376jg.a.markCrashCompleted((String) obj);
        c0376jg.a.deleteCompletedCrashes();
        return Unit.a;
    }
}
