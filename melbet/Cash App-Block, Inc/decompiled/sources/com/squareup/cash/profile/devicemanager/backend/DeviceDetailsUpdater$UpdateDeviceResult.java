package com.squareup.cash.profile.devicemanager.backend;

import app.cash.api.ApiResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class DeviceDetailsUpdater$UpdateDeviceResult {

    public final class NetworkFailure extends DeviceDetailsUpdater$UpdateDeviceResult {
        public final ApiResult.Failure failure;

        public NetworkFailure(ApiResult.Failure failure) {
            this.failure = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkFailure) && this.failure.equals(((NetworkFailure) obj).failure);
        }

        public final int hashCode() {
            return this.failure.hashCode();
        }

        public final String toString() {
            return "NetworkFailure(failure=" + this.failure + ")";
        }
    }

    public final class NotSuccessful extends DeviceDetailsUpdater$UpdateDeviceResult {
        public final String failureMessage;

        public NotSuccessful(String str) {
            this.failureMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotSuccessful) && Intrinsics.areEqual(this.failureMessage, ((NotSuccessful) obj).failureMessage);
        }

        public final int hashCode() {
            String str = this.failureMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotSuccessful(failureMessage=", this.failureMessage, ")");
        }
    }

    public final class Successful extends DeviceDetailsUpdater$UpdateDeviceResult {
        public static final Successful INSTANCE = new Successful();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Successful);
        }

        public final int hashCode() {
            return 2023523011;
        }

        public final String toString() {
            return "Successful";
        }
    }
}
