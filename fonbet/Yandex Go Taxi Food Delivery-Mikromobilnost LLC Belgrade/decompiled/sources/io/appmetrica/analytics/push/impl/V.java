package io.appmetrica.analytics.push.impl;

import defpackage.bms;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class V extends FunctionReferenceImpl implements bms {
    public static final V a = new V();

    public V() {
        super(4, 0, androidx.core.app.v.class, "setLights", "setLights(III)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.j(((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return vVar;
    }
}
