package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import defpackage.tls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class p extends Lambda implements tls {
    public static final p a = new p();

    public p() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = t.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new s(iBinder) : (u) queryLocalInterface;
    }
}
