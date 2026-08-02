package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class W extends FunctionReferenceImpl implements wls {
    public static final W a = new W();

    public W() {
        super(2, 0, androidx.core.app.v.class, "setNumber", "setNumber(I)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.l = ((Number) obj2).intValue();
        return vVar;
    }
}
