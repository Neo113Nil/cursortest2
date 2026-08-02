package com.squareup.cash.data.transfers;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface TransferManager {

    /* loaded from: classes5.dex */
    public abstract class TransferAction {

        /* loaded from: classes6.dex */
        public final class HandleBlocker extends TransferAction {
            public final BlockersData blockersData;

            public HandleBlocker(BlockersData blockersData) {
                blockersData.getClass();
                this.blockersData = blockersData;
            }

            @Override // com.squareup.cash.data.transfers.TransferManager.TransferAction
            public final BlockersData getBlockersData() {
                return this.blockersData;
            }
        }

        /* loaded from: classes6.dex */
        public final class HandleError extends TransferAction {
            public final BlockersData blockersData;
            public final TransferFundsResult.Error.ErrorResult errorResult;

            public HandleError(BlockersData blockersData, TransferFundsResult.Error.ErrorResult errorResult) {
                blockersData.getClass();
                this.blockersData = blockersData;
                this.errorResult = errorResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HandleError)) {
                    return false;
                }
                HandleError handleError = (HandleError) obj;
                return Intrinsics.areEqual(this.blockersData, handleError.blockersData) && this.errorResult.equals(handleError.errorResult);
            }

            @Override // com.squareup.cash.data.transfers.TransferManager.TransferAction
            public final BlockersData getBlockersData() {
                return this.blockersData;
            }

            public final int hashCode() {
                return this.errorResult.hashCode() + (this.blockersData.hashCode() * 31);
            }

            public final String toString() {
                return "HandleError(blockersData=" + this.blockersData + ", errorResult=" + this.errorResult + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class HandleResult extends TransferAction {
            public final BlockersData blockersData;
            public final TransferFundsResult.Success result;

            public HandleResult(BlockersData blockersData, TransferFundsResult.Success success) {
                this.blockersData = blockersData;
                this.result = success;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HandleResult)) {
                    return false;
                }
                HandleResult handleResult = (HandleResult) obj;
                return this.blockersData.equals(handleResult.blockersData) && this.result.equals(handleResult.result);
            }

            @Override // com.squareup.cash.data.transfers.TransferManager.TransferAction
            public final BlockersData getBlockersData() {
                return this.blockersData;
            }

            public final int hashCode() {
                return this.result.hashCode() + (this.blockersData.hashCode() * 31);
            }

            public final String toString() {
                return "HandleResult(blockersData=" + this.blockersData + ", result=" + this.result + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class SendTransfer extends TransferAction {
            public final BlockersData blockersData;

            public SendTransfer(BlockersData blockersData) {
                blockersData.getClass();
                this.blockersData = blockersData;
            }

            @Override // com.squareup.cash.data.transfers.TransferManager.TransferAction
            public final BlockersData getBlockersData() {
                return this.blockersData;
            }
        }

        public abstract BlockersData getBlockersData();
    }

    public abstract class TransferFundsResult {

        public final class Success extends TransferFundsResult {
            public final String externalId;
            public final ResponseContext responseContext;

            public Success(String str, ResponseContext responseContext) {
                responseContext.getClass();
                this.externalId = str;
                this.responseContext = responseContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return this.externalId.equals(success.externalId) && Intrinsics.areEqual(this.responseContext, success.responseContext);
            }

            public final int hashCode() {
                return this.responseContext.hashCode() + (this.externalId.hashCode() * 31);
            }

            public final String toString() {
                return "Success(externalId=" + this.externalId + ", responseContext=" + this.responseContext + ")";
            }
        }

        public final class Error extends TransferFundsResult {
            public final ErrorResult errorResult;
            public final String externalId;

            public Error(String str, ErrorResult errorResult) {
                str.getClass();
                this.externalId = str;
                this.errorResult = errorResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.areEqual(this.externalId, error.externalId) && this.errorResult.equals(error.errorResult);
            }

            public final int hashCode() {
                return this.errorResult.hashCode() + (this.externalId.hashCode() * 31);
            }

            public final String toString() {
                return "Error(externalId=" + this.externalId + ", errorResult=" + this.errorResult + ")";
            }

            public final class ErrorResult {
                public final ScenarioPlan errorScenarioPlan;
                public final StatusResult errorStatusResult;

                public /* synthetic */ ErrorResult(StatusResult statusResult, int i) {
                    this((i & 1) != 0 ? null : statusResult, (ScenarioPlan) null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ErrorResult)) {
                        return false;
                    }
                    ErrorResult errorResult = (ErrorResult) obj;
                    return Intrinsics.areEqual(this.errorStatusResult, errorResult.errorStatusResult) && Intrinsics.areEqual(this.errorScenarioPlan, errorResult.errorScenarioPlan);
                }

                public final ScenarioPlan getErrorScenarioPlan() {
                    return this.errorScenarioPlan;
                }

                public final StatusResult getErrorStatusResult() {
                    return this.errorStatusResult;
                }

                public final int hashCode() {
                    StatusResult statusResult = this.errorStatusResult;
                    int hashCode = (statusResult == null ? 0 : statusResult.hashCode()) * 31;
                    ScenarioPlan scenarioPlan = this.errorScenarioPlan;
                    return hashCode + (scenarioPlan != null ? scenarioPlan.hashCode() : 0);
                }

                public final String toString() {
                    return "ErrorResult(errorStatusResult=" + this.errorStatusResult + ", errorScenarioPlan=" + this.errorScenarioPlan + ")";
                }

                public ErrorResult(StatusResult statusResult, ScenarioPlan scenarioPlan) {
                    this.errorStatusResult = statusResult;
                    this.errorScenarioPlan = scenarioPlan;
                }
            }
        }
    }
}
