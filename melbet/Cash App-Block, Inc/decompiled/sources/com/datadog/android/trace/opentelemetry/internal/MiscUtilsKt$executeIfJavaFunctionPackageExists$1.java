package com.datadog.android.trace.opentelemetry.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class MiscUtilsKt$executeIfJavaFunctionPackageExists$1 extends Lambda implements Function0 {
    public static final MiscUtilsKt$executeIfJavaFunctionPackageExists$1 INSTANCE = new MiscUtilsKt$executeIfJavaFunctionPackageExists$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return "Trying to use OpenTelemetry SDK support for Android 23 and below. In order for this to properly work you will need to enable coreDesugaring in your compileOptions";
    }
}
