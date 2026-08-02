package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class P extends FunctionReferenceImpl implements wls {
    public static final P a = new P();

    public P() {
        super(2, 0, androidx.core.app.v.class, "setDefaults", "setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.g(((Number) obj2).intValue());
        return vVar;
    }
}
