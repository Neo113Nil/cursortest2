package io.appmetrica.analytics.impl;

import defpackage.tls;
import defpackage.zy11;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0855xg extends FunctionReferenceImpl implements tls {
    public C0855xg(Object obj) {
        super(1, obj, C0884yg.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        C0884yg c0884yg = (C0884yg) this.receiver;
        c0884yg.a.markCrashCompleted((String) obj);
        c0884yg.a.deleteCompletedCrashes();
        return zy11.a;
    }
}
