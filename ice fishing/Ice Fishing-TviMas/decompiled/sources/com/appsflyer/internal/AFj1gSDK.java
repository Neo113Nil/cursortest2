package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFj1gSDK implements AFj1hSDK {
    @Override // com.appsflyer.internal.AFj1hSDK
    public final String AFAdRevenueData() {
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            AFj1gSDK aFj1gSDK = this;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.checkNotNull(obj2, "");
            obj = Result.m6239constructorimpl((String) obj2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m6239constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m6245isFailureimpl(obj) ? "" : obj);
    }
}
