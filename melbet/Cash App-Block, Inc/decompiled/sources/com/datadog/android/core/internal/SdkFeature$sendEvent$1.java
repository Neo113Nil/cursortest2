package com.datadog.android.core.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class SdkFeature$sendEvent$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SdkFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SdkFeature$sendEvent$1(SdkFeature sdkFeature, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = sdkFeature;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SdkFeature sdkFeature = this.this$0;
        switch (i) {
            case 0:
                return String.format(Locale.US, "Feature \"%s\" has no event receiver registered, ignoring event.", Arrays.copyOf(new Object[]{sdkFeature.wrappedFeature.getName()}, 1));
            default:
                return new HashMap(sdkFeature.featureContext);
        }
    }
}
