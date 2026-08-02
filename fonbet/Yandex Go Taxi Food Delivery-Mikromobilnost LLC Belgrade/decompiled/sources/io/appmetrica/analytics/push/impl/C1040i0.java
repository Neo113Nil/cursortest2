package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.push.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1040i0 extends FunctionReferenceImpl implements wls {
    public static final C1040i0 a = new C1040i0();

    public C1040i0() {
        super(2, 0, androidx.core.app.v.class, "setTimeoutAfter", "setTimeoutAfter(J)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.H = ((Number) obj2).longValue();
        return vVar;
    }
}
