package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.push.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1016c0 extends FunctionReferenceImpl implements wls {
    public static final C1016c0 a = new C1016c0();

    public C1016c0() {
        super(2, 0, androidx.core.app.v.class, "setSmallIcon", "setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.K.icon = ((Number) obj2).intValue();
        return vVar;
    }
}
