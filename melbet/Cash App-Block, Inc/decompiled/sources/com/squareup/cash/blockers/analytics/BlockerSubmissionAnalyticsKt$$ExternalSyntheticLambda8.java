package com.squareup.cash.blockers.analytics;

import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.onboarding.util.AliasVerifier$Result;
import com.squareup.cash.resource.text.AndroidStringManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidStringManager f$0;

    public /* synthetic */ BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda8(AndroidStringManager androidStringManager, int i) {
        this.$r8$classId = i;
        this.f$0 = androidStringManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        BlockerResponse.Success success = BlockerResponse.Success.INSTANCE;
        AndroidStringManager androidStringManager = this.f$0;
        switch (i) {
            case 0:
                AliasVerifier$Result aliasVerifier$Result = (AliasVerifier$Result) obj;
                aliasVerifier$Result.getClass();
                if (!(aliasVerifier$Result instanceof AliasVerifier$Result.Successful)) {
                    if (!(aliasVerifier$Result instanceof AliasVerifier$Result.NotSuccessful)) {
                        if (!(aliasVerifier$Result instanceof AliasVerifier$Result.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            break;
                        }
                    } else {
                        AliasVerifier$Result.NotSuccessful notSuccessful = (AliasVerifier$Result.NotSuccessful) aliasVerifier$Result;
                        break;
                    }
                } else {
                    break;
                }
            default:
                AliasRegistrar$Result aliasRegistrar$Result = (AliasRegistrar$Result) obj;
                aliasRegistrar$Result.getClass();
                if (!(aliasRegistrar$Result instanceof AliasRegistrar$Result.Successful)) {
                    if (!(aliasRegistrar$Result instanceof AliasRegistrar$Result.NotSuccessful)) {
                        if (!(aliasRegistrar$Result instanceof AliasRegistrar$Result.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            break;
                        }
                    } else {
                        AliasRegistrar$Result.NotSuccessful notSuccessful2 = (AliasRegistrar$Result.NotSuccessful) aliasRegistrar$Result;
                        break;
                    }
                } else {
                    break;
                }
        }
        return null;
    }
}
