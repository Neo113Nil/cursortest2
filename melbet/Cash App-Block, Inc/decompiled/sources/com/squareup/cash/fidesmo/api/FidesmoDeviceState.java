package com.squareup.cash.fidesmo.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FidesmoDeviceState {

    public final class CheckingStability implements FidesmoDeviceState {
        public final int count;
        public final int total;

        public CheckingStability(int i, int i2) {
            this.count = i;
            this.total = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckingStability)) {
                return false;
            }
            CheckingStability checkingStability = (CheckingStability) obj;
            return this.count == checkingStability.count && this.total == checkingStability.total;
        }

        public final int hashCode() {
            return Integer.hashCode(this.total) + (Integer.hashCode(this.count) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.count, this.total, "CheckingStability(count=", ", total=", ")");
        }
    }

    public final class Connected implements FidesmoDeviceState {
        public static final Connected INSTANCE = new Connected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Connected);
        }

        public final int hashCode() {
            return 1463541416;
        }

        public final String toString() {
            return "Connected";
        }
    }

    public final class DeliveringService implements FidesmoDeviceState {
        public final Integer currentStep;
        public final Integer totalSteps;

        public DeliveringService(Integer num, Integer num2) {
            this.currentStep = num;
            this.totalSteps = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveringService)) {
                return false;
            }
            DeliveringService deliveringService = (DeliveringService) obj;
            return Intrinsics.areEqual(this.currentStep, deliveringService.currentStep) && Intrinsics.areEqual(this.totalSteps, deliveringService.totalSteps);
        }

        public final int hashCode() {
            Integer num = this.currentStep;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.totalSteps;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "DeliveringService(currentStep=" + this.currentStep + ", totalSteps=" + this.totalSteps + ")";
        }
    }

    public final class Disconnected implements FidesmoDeviceState {
        public static final Disconnected INSTANCE = new Disconnected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Disconnected);
        }

        public final int hashCode() {
            return -1151063492;
        }

        public final String toString() {
            return "Disconnected";
        }
    }

    public final class Error implements FidesmoDeviceState {
        public final FidesmoProvisioningError error;

        public Error(FidesmoProvisioningError fidesmoProvisioningError) {
            fidesmoProvisioningError.getClass();
            this.error = fidesmoProvisioningError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    public final class NfcDisabled implements FidesmoDeviceState {
        public static final NfcDisabled INSTANCE = new NfcDisabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NfcDisabled);
        }

        public final int hashCode() {
            return -889918170;
        }

        public final String toString() {
            return "NfcDisabled";
        }
    }

    public final class NfcUnavailable implements FidesmoDeviceState {
        public static final NfcUnavailable INSTANCE = new NfcUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NfcUnavailable);
        }

        public final int hashCode() {
            return -738251418;
        }

        public final String toString() {
            return "NfcUnavailable";
        }
    }

    public final class PreparingDelivery implements FidesmoDeviceState {
        public static final PreparingDelivery INSTANCE = new PreparingDelivery();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PreparingDelivery);
        }

        public final int hashCode() {
            return -979624777;
        }

        public final String toString() {
            return "PreparingDelivery";
        }
    }

    public final class ServiceDelivered implements FidesmoDeviceState {
        public final boolean activationRequired;

        public ServiceDelivered(boolean z) {
            this.activationRequired = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServiceDelivered) && this.activationRequired == ((ServiceDelivered) obj).activationRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.activationRequired);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ServiceDelivered(activationRequired=", ")", this.activationRequired);
        }
    }

    public final class ServiceDeliveryFailed implements FidesmoDeviceState {
        public final FidesmoProvisioningError error;

        public ServiceDeliveryFailed(FidesmoProvisioningError fidesmoProvisioningError) {
            this.error = fidesmoProvisioningError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServiceDeliveryFailed) && this.error.equals(((ServiceDeliveryFailed) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return "ServiceDeliveryFailed(error=" + this.error + ")";
        }
    }
}
