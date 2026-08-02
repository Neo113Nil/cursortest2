package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    public final String getMediationNetwork() {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            failure = (String) obj;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = "";
        }
        return (String) failure;
    }
}
