package com.squareup.cash.clientrouting.routers.blockers;

import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface BiometricPreauthScenarioManager$PreauthResult {

    public final class Failed implements BiometricPreauthScenarioManager$PreauthResult {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 110356243;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class Success implements BiometricPreauthScenarioManager$PreauthResult {
        public final ResponseContext responseContext;

        public Success(ResponseContext responseContext) {
            this.responseContext = responseContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.responseContext, ((Success) obj).responseContext);
        }

        public final int hashCode() {
            ResponseContext responseContext = this.responseContext;
            if (responseContext == null) {
                return 0;
            }
            return responseContext.hashCode();
        }

        public final String toString() {
            return "Success(responseContext=" + this.responseContext + ")";
        }
    }
}
