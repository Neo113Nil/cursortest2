package io.appmetrica.analytics.push.impl;

import android.app.PendingIntent;
import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.push.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1069r0 extends FunctionReferenceImpl implements wls {
    public static final C1069r0 a = new C1069r0();

    public C1069r0() {
        super(2, 0, androidx.core.app.v.class, "setContentIntent", "setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.h = (PendingIntent) obj2;
        return vVar;
    }
}
