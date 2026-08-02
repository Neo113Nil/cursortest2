package com.squareup.cash.data.blockers;

import app.cash.api.ApiResult;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.franklin.app.CompleteScenarioResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class RealClientScenarioCompleter$completeClientScenario$1$1$result$1 implements Function1 {
    public static final RealClientScenarioCompleter$completeClientScenario$1$1$result$1 INSTANCE = new RealClientScenarioCompleter$completeClientScenario$1$1$result$1();

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CompleteScenarioResponse.Status.values().length];
            try {
                TaxEnvironment.Companion companion = CompleteScenarioResponse.Status.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TaxEnvironment.Companion companion2 = CompleteScenarioResponse.Status.Companion;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ApiResult.Success success = (ApiResult.Success) obj;
        success.getClass();
        CompleteScenarioResponse.Status status = ((CompleteScenarioResponse) success.response).status;
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }
            return null;
        }
        return new BlockerResponse.Error(status != null ? status.name() : null, (String) null, 6);
    }
}
