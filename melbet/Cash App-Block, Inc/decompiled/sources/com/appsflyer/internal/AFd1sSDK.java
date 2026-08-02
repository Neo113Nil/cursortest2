package com.appsflyer.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class AFd1sSDK {
    private static String AFAdRevenueData(Throwable th) {
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            if (!StringsKt__StringsJVMKt.startsWith(className, "com.appsflyer", false)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return AFd1rSDK.AFAdRevenueData(th + "\n" + CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, new Function1<StackTraceElement, CharSequence>() { // from class: com.appsflyer.internal.AFd1sSDK.4
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(StackTraceElement stackTraceElement2) {
                stackTraceElement2.getClass();
                return "at " + stackTraceElement2;
            }
        }, 30), "SHA-256");
    }

    public static final AFc1aSDK getRevenue(Throwable th, String str) {
        th.getClass();
        str.getClass();
        th.getClass();
        return new AFc1aSDK(Recorder$$ExternalSyntheticOutline2.m(th.getClass().getName(), ": ", str), AFAdRevenueData(th), ExceptionsKt__ExceptionsKt.stackTraceToString(th), 0, 8, null);
    }
}
