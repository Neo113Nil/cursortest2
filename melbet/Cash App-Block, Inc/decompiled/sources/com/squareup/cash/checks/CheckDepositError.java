package com.squareup.cash.checks;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/checks/CheckDepositError;", "Lcom/squareup/cash/observability/types/ReportedError;", "MiSnapLicenseError", "Lcom/squareup/cash/checks/CheckDepositError$MiSnapLicenseError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CheckDepositError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.CheckDeposit.INSTANCE);
    public final String message;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/checks/CheckDepositError$MiSnapLicenseError;", "Lcom/squareup/cash/checks/CheckDepositError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MiSnapLicenseError extends CheckDepositError {
        public final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiSnapLicenseError(String str) {
            super(str);
            str.getClass();
            this.reason = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiSnapLicenseError) && Intrinsics.areEqual(this.reason, ((MiSnapLicenseError) obj).reason);
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MiSnapLicenseError(reason=", this.reason, ")");
        }
    }

    public CheckDepositError(String str) {
        this.message = str;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
