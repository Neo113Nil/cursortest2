package io.appmetrica.analytics.push.impl;

import android.net.Uri;
import defpackage.wls;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.push.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1024e0 extends FunctionReferenceImpl implements wls {
    public static final C1024e0 a = new C1024e0();

    public C1024e0() {
        super(2, 0, androidx.core.app.v.class, "setSound", "setSound(Landroid/net/Uri;)Landroidx/core/app/NotificationCompat$Builder;");
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        androidx.core.app.v vVar = (androidx.core.app.v) obj;
        vVar.k((Uri) obj2);
        return vVar;
    }
}
