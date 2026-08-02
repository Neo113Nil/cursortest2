package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.push.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1044j0 extends FunctionReferenceImpl implements wls {
    public static final C1044j0 a = new C1044j0();

    public C1044j0() {
        super(2, 0, androidx.core.app.v.class, "setVibrate", "setVibrate([J)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.K.vibrate = (long[]) obj2;
        return vVar;
    }
}
