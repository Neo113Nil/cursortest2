package com.squareup.cash.activity.backend;

import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiCustomer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public final /* synthetic */ class ZiplineActivityItemFormatter$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Moshi f$0;

    public /* synthetic */ ZiplineActivityItemFormatter$$ExternalSyntheticLambda0(Moshi moshi, int i) {
        this.$r8$classId = i;
        this.f$0 = moshi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Moshi moshi = this.f$0;
        switch (i) {
            case 0:
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(PaymentHistoryData.class));
            case 1:
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(UiCustomer.class));
            case 2:
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(ScenarioPlan.class));
            case 3:
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(StatusResult.class));
            case 4:
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(UiCustomer.class));
            case 5:
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(ScenarioPlan.class));
            default:
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(StatusResult.class));
        }
    }
}
