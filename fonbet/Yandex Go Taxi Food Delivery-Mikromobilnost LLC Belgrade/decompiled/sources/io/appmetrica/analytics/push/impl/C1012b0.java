package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.push.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1012b0 extends FunctionReferenceImpl implements wls {
    public static final C1012b0 a = new C1012b0();

    public C1012b0() {
        super(2, 0, androidx.core.app.v.class, "setShowWhen", "setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.n = ((Boolean) obj2).booleanValue();
        return vVar;
    }
}
