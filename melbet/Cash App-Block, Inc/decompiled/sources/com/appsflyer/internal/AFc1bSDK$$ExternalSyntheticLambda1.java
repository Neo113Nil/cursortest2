package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.internal.AFa1ySDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class AFc1bSDK$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AFc1bSDK$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences o_;
        Unit mediationNetwork;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                o_ = ((AFc1bSDK) obj).o_();
                return o_;
            default:
                mediationNetwork = ((AFa1ySDK.AFa1zSDK) obj).getMediationNetwork();
                return mediationNetwork;
        }
    }
}
