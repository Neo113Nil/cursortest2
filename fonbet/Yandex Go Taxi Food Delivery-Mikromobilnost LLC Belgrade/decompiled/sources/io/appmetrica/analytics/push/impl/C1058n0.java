package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.push.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1058n0 extends FunctionReferenceImpl implements wls {
    public static final C1058n0 a = new C1058n0();

    public C1058n0() {
        super(2, 0, androidx.core.app.v.class, "setCategory", "setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.x = (String) obj2;
        return vVar;
    }
}
