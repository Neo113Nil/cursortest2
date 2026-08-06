package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements t1.l {

    /* renamed from: a, reason: collision with root package name */
    public static final p f3967a = new p();

    public p() {
        super(1);
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i2 = t.f3971a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new s(iBinder) : (u) queryLocalInterface;
    }
}
