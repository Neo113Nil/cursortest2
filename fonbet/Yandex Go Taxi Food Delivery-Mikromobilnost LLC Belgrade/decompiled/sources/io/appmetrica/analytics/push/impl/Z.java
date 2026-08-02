package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class Z extends FunctionReferenceImpl implements wls {
    public static final Z a = new Z();

    public Z() {
        super(2, 0, androidx.core.app.v.class, "setPriority", "setPriority(I)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.m = ((Number) obj2).intValue();
        return vVar;
    }
}
