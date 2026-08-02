package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.push.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1008a0 extends FunctionReferenceImpl implements wls {
    public static final C1008a0 a = new C1008a0();

    public C1008a0() {
        super(2, 0, androidx.core.app.v.class, "addAction", "addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        androidx.core.app.q qVar = (androidx.core.app.q) obj2;
        if (qVar != null) {
            vVar.b.add(qVar);
        } else {
            vVar.getClass();
        }
        return vVar;
    }
}
