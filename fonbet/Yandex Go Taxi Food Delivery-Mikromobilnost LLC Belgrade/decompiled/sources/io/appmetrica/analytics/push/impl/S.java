package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class S extends FunctionReferenceImpl implements wls {
    public static final S a = new S();

    public S() {
        super(2, 0, androidx.core.app.v.class, "setGroup", "setGroup(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.r = (String) obj2;
        return vVar;
    }
}
