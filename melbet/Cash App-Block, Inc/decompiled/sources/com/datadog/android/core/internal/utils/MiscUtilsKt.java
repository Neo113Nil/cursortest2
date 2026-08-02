package com.datadog.android.core.internal.utils;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.util.Strings;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class MiscUtilsKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalEditorial.deepLinkSpecs;
    }

    public static final void retryWithDelay(InternalLogger internalLogger, Strings strings, Function0 function0) {
        internalLogger.getClass();
        strings.getClass();
        long nanoTime = System.nanoTime() - 500000000;
        int i = 1;
        boolean z = false;
        while (i <= 3 && !z) {
            if (System.nanoTime() - nanoTime >= 500000000) {
                try {
                    z = ((Boolean) function0.invoke()).booleanValue();
                } catch (Exception e) {
                    DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ByteArrayExtKt$copyTo$1.INSTANCE$2, e, 48);
                    z = false;
                }
                nanoTime = System.nanoTime();
                i++;
            }
        }
    }
}
