package io.appmetrica.analytics.push.impl;

import android.app.PendingIntent;
import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class Q extends FunctionReferenceImpl implements wls {
    public static final Q a = new Q();

    public Q() {
        super(2, 0, androidx.core.app.v.class, "setDeleteIntent", "setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.K.deleteIntent = (PendingIntent) obj2;
        return vVar;
    }
}
