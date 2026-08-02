package com.datadog.android.rum.internal.startup;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RumSessionScopeStartupManagerImpl$onTTFDEvent$2 extends Lambda implements Function0 {
    public static final RumSessionScopeStartupManagerImpl$onTTFDEvent$2 INSTANCE = new RumSessionScopeStartupManagerImpl$onTTFDEvent$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return "RumMonitor.reportAppFullyDisplayed was called before TTID was computed, will report TTID as TTFD.";
    }
}
