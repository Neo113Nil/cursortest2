package io.appmetrica.analytics.push.impl;

import android.graphics.Bitmap;
import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class U extends FunctionReferenceImpl implements wls {
    public static final U a = new U();

    public U() {
        super(2, 0, androidx.core.app.v.class, "setLargeIcon", "setLargeIcon(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.i((Bitmap) obj2);
        return vVar;
    }
}
