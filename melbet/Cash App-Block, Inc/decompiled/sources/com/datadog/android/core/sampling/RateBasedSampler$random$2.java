package com.datadog.android.core.sampling;

import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RateBasedSampler$random$2 extends Lambda implements Function0 {
    public static final RateBasedSampler$random$2 INSTANCE = new RateBasedSampler$random$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SecureRandom();
    }
}
