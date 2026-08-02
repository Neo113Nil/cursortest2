package com.datadog.android.internal.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class ThreadExtKt$loggableStackTrace$1 extends Lambda implements Function1 {
    public static final ThreadExtKt$loggableStackTrace$1 INSTANCE = new ThreadExtKt$loggableStackTrace$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StackTraceElement stackTraceElement = (StackTraceElement) obj;
        stackTraceElement.getClass();
        return "at " + stackTraceElement;
    }
}
