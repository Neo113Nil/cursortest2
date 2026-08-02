package com.braze.ui.inappmessage;

import android.app.Activity;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeInAppMessageManager$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Activity f$0;

    public /* synthetic */ BrazeInAppMessageManager$$ExternalSyntheticLambda0(int i, Activity activity) {
        this.$r8$classId = i;
        this.f$0 = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String unregisterInAppMessageManager$lambda$0;
        String unregisterInAppMessageManager$lambda$2;
        String registerInAppMessageManager$lambda$1;
        int i = this.$r8$classId;
        Activity activity = this.f$0;
        switch (i) {
            case 0:
                unregisterInAppMessageManager$lambda$0 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$0(activity);
                return unregisterInAppMessageManager$lambda$0;
            case 1:
                unregisterInAppMessageManager$lambda$2 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$2(activity);
                return unregisterInAppMessageManager$lambda$2;
            case 2:
                registerInAppMessageManager$lambda$1 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$1(activity);
                return registerInAppMessageManager$lambda$1;
            default:
                return Integer.valueOf(ScrollPerformanceAnalyzer.$r8$lambda$9ZtFuX6HjY1g9bXjuDzIoJucWOU(activity));
        }
    }
}
