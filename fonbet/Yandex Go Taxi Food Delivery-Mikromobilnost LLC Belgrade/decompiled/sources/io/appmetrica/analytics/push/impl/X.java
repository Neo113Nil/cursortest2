package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class X extends FunctionReferenceImpl implements wls {
    public static final X a = new X();

    public X() {
        super(2, 0, androidx.core.app.v.class, "setOngoing", "setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.h(2, ((Boolean) obj2).booleanValue());
        return vVar;
    }
}
