package com.datadog.android.core.sampling;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RateBasedSampler$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float $sampleRate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RateBasedSampler$1(float f, int i) {
        super(0);
        this.$r8$classId = i;
        this.$sampleRate = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        float f = this.$sampleRate;
        switch (i) {
            case 0:
                return Float.valueOf(f);
            case 1:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(f, "Sample rate value provided ", " is below 0, setting it to 0.");
            case 2:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(f, "Sample rate value provided ", " is above 100, setting it to 100.");
            case 3:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(f, "Sample rate value provided ", " is below 0, setting it to 0.");
            default:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(f, "Sample rate value provided ", " is above 100, setting it to 100.");
        }
    }
}
