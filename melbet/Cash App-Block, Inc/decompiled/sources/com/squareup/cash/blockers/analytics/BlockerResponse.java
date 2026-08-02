package com.squareup.cash.blockers.analytics;

import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractViewBlockerResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface BlockerResponse {

    public final class Success implements BlockerResponse {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -743653435;
        }

        public final String toString() {
            return "Success";
        }
    }

    public final class Error implements BlockerResponse {
        public final String errorCode;
        public final String errorMessage;
        public final BlockerFlowInteractViewBlockerResponse.Status status;

        public /* synthetic */ Error(String str, String str2, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, BlockerFlowInteractViewBlockerResponse.Status.LOGICAL_ERROR);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.errorCode, error.errorCode) && Intrinsics.areEqual(this.errorMessage, error.errorMessage) && this.status == error.status;
        }

        public final int hashCode() {
            String str = this.errorCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.errorMessage;
            return this.status.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(errorCode=", this.errorCode, ", errorMessage=", this.errorMessage, ", status=");
            m.append(this.status);
            m.append(")");
            return m.toString();
        }

        public Error(String str, String str2, BlockerFlowInteractViewBlockerResponse.Status status) {
            status.getClass();
            this.errorCode = str;
            this.errorMessage = str2;
            this.status = status;
        }
    }
}
