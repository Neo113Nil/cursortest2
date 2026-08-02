package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class Y extends FunctionReferenceImpl implements wls {
    public static final Y a = new Y();

    public Y() {
        super(2, 0, androidx.core.app.v.class, "setOnlyAlertOnce", "setOnlyAlertOnce(Z)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.h(8, ((Boolean) obj2).booleanValue());
        return vVar;
    }
}
