package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.io.Serializable;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1gSDK implements AFj1hSDK {
    @Override // com.appsflyer.internal.AFj1hSDK
    public final String AFAdRevenueData() {
        Serializable serializableC;
        try {
            f.d dVar = f.f.f121a;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.c(obj, "");
            serializableC = (String) obj;
        } catch (Throwable th) {
            f.d dVar2 = f.f.f121a;
            serializableC = a.c.c(th);
        }
        return (String) (f.f.b(serializableC) ? "" : serializableC);
    }
}
