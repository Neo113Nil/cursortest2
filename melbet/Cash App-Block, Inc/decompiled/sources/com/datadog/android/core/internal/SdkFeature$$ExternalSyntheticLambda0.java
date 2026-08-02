package com.datadog.android.core.internal;

import com.datadog.android.api.context.DatadogContext;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final /* synthetic */ class SdkFeature$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SdkFeature f$0;
    public final /* synthetic */ Set f$1;

    public /* synthetic */ SdkFeature$$ExternalSyntheticLambda0(SdkFeature sdkFeature, Set set, int i) {
        this.$r8$classId = i;
        this.f$0 = sdkFeature;
        this.f$1 = set;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$r8$classId;
        Set set = this.f$1;
        SdkFeature sdkFeature = this.f$0;
        switch (i) {
            case 0:
                if (!sdkFeature.coreFeature.initialized.get()) {
                    return null;
                }
                DatadogContext context = sdkFeature.contextProvider.getContext(set);
                return new Pair(context, sdkFeature.storage.getEventWriteScope(context));
            default:
                if (sdkFeature.coreFeature.initialized.get()) {
                    return sdkFeature.contextProvider.getContext(set);
                }
                return null;
        }
    }
}
