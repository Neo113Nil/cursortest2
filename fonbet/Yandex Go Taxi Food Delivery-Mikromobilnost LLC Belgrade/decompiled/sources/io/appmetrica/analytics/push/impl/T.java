package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class T extends FunctionReferenceImpl implements wls {
    public static final T a = new T();

    public T() {
        super(2, 0, androidx.core.app.v.class, "setGroupSummary", "setGroupSummary(Z)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.s = ((Boolean) obj2).booleanValue();
        return vVar;
    }
}
