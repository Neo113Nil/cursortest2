package com.squareup.cash.profile.devicemanager.backend;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.api.ApiResult;
import com.squareup.cash.devicegrip.service.RemoveDevicesResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DeviceManagerRepo$DeleteDeviceResult {

    public final class NetworkFailure implements DeviceManagerRepo$DeleteDeviceResult {
        public final List failedTokens;
        public final ApiResult.Failure failure;

        public NetworkFailure(ApiResult.Failure failure, List list) {
            failure.getClass();
            list.getClass();
            this.failure = failure;
            this.failedTokens = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkFailure)) {
                return false;
            }
            NetworkFailure networkFailure = (NetworkFailure) obj;
            return Intrinsics.areEqual(this.failure, networkFailure.failure) && Intrinsics.areEqual(this.failedTokens, networkFailure.failedTokens);
        }

        public final List getFailedTokens() {
            return this.failedTokens;
        }

        public final int hashCode() {
            return this.failedTokens.hashCode() + (this.failure.hashCode() * 31);
        }

        public final String toString() {
            return "NetworkFailure(failure=" + this.failure + ", failedTokens=" + this.failedTokens + ")";
        }
    }

    public final class NotSuccessful implements DeviceManagerRepo$DeleteDeviceResult {
        public final int devicesAttemptedToRemove;
        public final RemoveDevicesResponse.ErrorReason errorReason;
        public final List failedTokens;
        public final String failureMessage;
        public final ResponseContext responseContext;
        public final ArrayList successfulTokens;

        public NotSuccessful(List list, ArrayList arrayList, ResponseContext responseContext, RemoveDevicesResponse.ErrorReason errorReason) {
            String str = responseContext != null ? responseContext.dialog_message : null;
            list.getClass();
            this.failedTokens = list;
            this.successfulTokens = arrayList;
            this.responseContext = responseContext;
            this.failureMessage = str;
            this.errorReason = errorReason;
            this.devicesAttemptedToRemove = arrayList.size() + list.size();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotSuccessful)) {
                return false;
            }
            NotSuccessful notSuccessful = (NotSuccessful) obj;
            return Intrinsics.areEqual(this.failedTokens, notSuccessful.failedTokens) && this.successfulTokens.equals(notSuccessful.successfulTokens) && Intrinsics.areEqual(this.responseContext, notSuccessful.responseContext) && Intrinsics.areEqual(this.failureMessage, notSuccessful.failureMessage) && this.errorReason == notSuccessful.errorReason;
        }

        public final List getFailedTokens() {
            return this.failedTokens;
        }

        public final List getSuccessfulTokens() {
            return this.successfulTokens;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.successfulTokens, this.failedTokens.hashCode() * 31, 31);
            ResponseContext responseContext = this.responseContext;
            int hashCode = (m + (responseContext == null ? 0 : responseContext.hashCode())) * 31;
            String str = this.failureMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            RemoveDevicesResponse.ErrorReason errorReason = this.errorReason;
            return hashCode2 + (errorReason != null ? errorReason.hashCode() : 0);
        }

        public final String toString() {
            return "NotSuccessful(failedTokens=" + this.failedTokens + ", successfulTokens=" + this.successfulTokens + ", responseContext=" + this.responseContext + ", failureMessage=" + this.failureMessage + ", errorReason=" + this.errorReason + ")";
        }
    }

    public final class Successful implements DeviceManagerRepo$DeleteDeviceResult {
        public final List successfulTokens;

        public Successful(List list) {
            list.getClass();
            this.successfulTokens = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Successful) && Intrinsics.areEqual(this.successfulTokens, ((Successful) obj).successfulTokens);
        }

        public final List getSuccessfulTokens() {
            return this.successfulTokens;
        }

        public final int hashCode() {
            return this.successfulTokens.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Successful(successfulTokens=", ")", this.successfulTokens);
        }
    }
}
